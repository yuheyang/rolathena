package com.chlitina.o2o.sap.rfc;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Date; 

import javax.jws.WebParam;

import com.sap.conn.jco.JCoDestination;
import com.sap.conn.jco.JCoField;
import com.sap.conn.jco.JCoFieldIterator;
import com.sap.conn.jco.JCoFunction;
import com.sap.conn.jco.JCoParameterList;
import com.sap.conn.jco.JCoRecord;
import com.sap.conn.jco.JCoStructure;
import com.sap.conn.jco.JCoTable;

public class ConnectSAPTable implements ICallRFC {
	/**
	private static JCoDestination jCoDestination;
	
	public SynReturnInfo callRFC(StoreOrder order,List<StoreOrderItem> orderItems) throws Exception 
	{
		SynReturnInfo returnInfo = new SynReturnInfo(); 
		String strreason = new String();
		int idate = 0;
		int imonth = 0;
		int iyear = 0;
		String strZZCPERI = new String();
								
		try{
			
		jCoDestination = ConnectSAPServer.Connect();
		JCoFunction function = jCoDestination.getRepository().getFunction("ZSD_CREATE_STOREORDER");
		if (function == null) throw new RuntimeException("ZSD_CREATE_STOREORDER not found.");
		JCoStructure js = function.getImportParameterList().getStructure(
				"SO_HEADER_DATA_Z102");
		
		Calendar cal=Calendar.getInstance();    
		iyear=cal.get(Calendar.YEAR);    
		imonth=cal.get(Calendar.MONTH);    
		idate=cal.get(Calendar.DATE);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMM");
		 
		if (idate > 26) {
	        cal.set(Calendar.DAY_OF_MONTH, 1);
	        cal.add(Calendar.MONTH, 1);
		}else{
			cal.set(Calendar.DAY_OF_MONTH, 1);
		}
		
		strZZCPERI = sdf.format(cal.getTime())  ;
		js.setValue("VKORG", order.getSalesName()); //闁匡拷鏁紒鍕矏  VKORG
		js.setValue("VTWEG", order.getSalesChanel()); //閸掑棝鏀㈠〒鐘讳壕  VTWEG
		js.setValue("SOLD_TO", order.getSoldTo());//鐎广垺鍩涚紓鏍у娇SOLD_TO
		js.setValue("SHIP_TO", order.getShipTo());//鐎广垺鍩涚紓鏍у娇SHIP_TO
		js.setValue("BSTKD", order.getBstkd());//鐎广垺鍩涢柌鍥枠鐠併垹宕熺紓鏍у娇  BSTKD
		js.setValue("REMARK", order.getRemark());//婢跺洦鏁�  REMARK
		
		JCoParameterList importParam = function.getImportParameterList();
		importParam.setValue("NAME",order.getCNAME());
		importParam.setValue("CITY",order.getCCITY());
		importParam.setValue("FREIGHT",order.getFREIGHT());
		importParam.setValue("TELNUM",order.getTELNUM());
		importParam.setValue("FREIGHT1", String.valueOf((0 - Double.valueOf(order.getFREIGHT1()))));
		importParam.setValue("ZZCPERI1", strZZCPERI);
		
		JCoTable jct = function.getTableParameterList().getTable(
								"SO_ITEM_DATA_Z102");
		
		for (StoreOrderItem item : orderItems) {
			jct.appendRow();
			jct.setValue("POSNR", item.getXmid()); //闁匡拷鏁崪灞藉瀻闁匡拷鍤熺拠浣烘畱妞ゅ湱娲伴崣锟絇OSNR
			jct.setValue("MATNR", item.getMatnr());//閻椻晜鏋￠崣锟�MATNR
			jct.setValue("SO_QTY", String.valueOf(item.getSoQty()));//缂冩垼鍠橀弫浼村櫤  SO_QTY
			jct.setValue("SO_UNIT", item.getSoUnit());//缂冩垼鍠橀崡鏇氱秴 SO_UNIT	
			jct.setValue("WERKS", item.getWerks());//瀹搞儱宸� WERKS
			jct.setValue("LGORT", item.getLgort());//鎼存挸鐡ㄩ崷鎵仯  LGORT
			jct.setValue("VSTEL", item.getVstel());//鐟佸懓绻嶉悙锟介幒銉︽暪閻愶拷 VSTEL
			jct.setValue("PFLAG", item.getPFLAG());//閸忓秷鍨傛い鍦窗flag
		}
		
		function.execute(jCoDestination);
		
		JCoParameterList parameOut = function.getExportParameterList(); 
		if (!parameOut.getString("STATUS").equals("S")){
			MaintainErrorRecord mr = new MaintainErrorRecord();
			TErRecord tr = new TErRecord();
			strreason = parameOut.getString("MESSAGE");
			tr.setFUNCNAME("SAPRFC");
			tr.setEREASON(strreason);
			tr.setERFLAG("0");
			tr.setORDERCODE(order.getBstkd());
			mr.addErrorRecordByCode(tr);
		}	
		returnInfo.setSoNumber(parameOut.getString("SO_NUMBER"));//闂備礁灏呴幏鐑藉极椤撱垹绀勬い鎿勭磿濡诧拷
		returnInfo.setStatus(parameOut.getString("STATUS"));
		returnInfo.setMessage(parameOut.getString("MESSAGE"));
		returnInfo.setZZCPERI(parameOut.getString("ZZCPERI"));
		}catch(Exception e){
			MaintainErrorRecord mr = new MaintainErrorRecord();
			TErRecord tr = new TErRecord();
			strreason = e.toString();
			tr.setFUNCNAME("SAPRFC");
			tr.setEREASON(strreason);
			tr.setERFLAG("0");
			tr.setORDERCODE(order.getBstkd());
			mr.addErrorRecordByCode(tr);
			e.printStackTrace();
			
		}
		
	
		return returnInfo;
	}
	
	public SynReturnInfo callRFC_ZFI(StoreOrder order,List<StoreOrderItem> orderItems,TZFI001 szfi001) throws Exception 
	{
		SynReturnInfo returnInfo = new SynReturnInfo(); 
		String strreason = new String();
		int idate = 0;
		int imonth = 0;
		int iyear = 0;
		String strZZCPERI = new String();
		Date now = new Date(); 
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		String strdate = dateFormat.format( now );						
		try{
			
		jCoDestination = ConnectSAPServer.Connect();
		JCoFunction function = jCoDestination.getRepository().getFunction("ZSD_CREATE_STOREORDER2");
		if (function == null) throw new RuntimeException("ZSD_CREATE_STOREORDER2 not found.");
		JCoStructure js = function.getImportParameterList().getStructure(
				"SO_HEADER_DATA_Z102");
		
		Calendar cal=Calendar.getInstance();    
		iyear=cal.get(Calendar.YEAR);    
		imonth=cal.get(Calendar.MONTH);    
		idate=cal.get(Calendar.DATE);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMM");
		 
		if (idate > 26) {
	        cal.set(Calendar.DAY_OF_MONTH, 1);
	        cal.add(Calendar.MONTH, 1);	
		}else{
			cal.set(Calendar.DAY_OF_MONTH, 1);
		}
		
		strZZCPERI = sdf.format(cal.getTime())  ;
		js.setValue("VKORG", order.getSalesName()); //闁匡拷鏁紒鍕矏  VKORG
		js.setValue("VTWEG", order.getSalesChanel()); //閸掑棝鏀㈠〒鐘讳壕  VTWEG
		js.setValue("SOLD_TO", order.getSoldTo());//鐎广垺鍩涚紓鏍у娇SOLD_TO
		js.setValue("SHIP_TO", order.getShipTo());//鐎广垺鍩涚紓鏍у娇SHIP_TO
		js.setValue("BSTKD", order.getBstkd());//鐎广垺鍩涢柌鍥枠鐠併垹宕熺紓鏍у娇  BSTKD
		js.setValue("REMARK", order.getRemark());//婢跺洦鏁�  REMARK
		
		JCoParameterList importParam = function.getImportParameterList();
		importParam.setValue("NAME",order.getCNAME());
		importParam.setValue("CITY",order.getCCITY());
		importParam.setValue("FREIGHT",order.getFREIGHT());
		importParam.setValue("TELNUM",order.getTELNUM());
		importParam.setValue("FREIGHT1", String.valueOf((0 - Double.valueOf(order.getFREIGHT1()))));
		importParam.setValue("ZZCPERI1", strZZCPERI);
		
		JCoTable jct = function.getTableParameterList().getTable(
								"SO_ITEM_DATA_Z102");
		
		for (StoreOrderItem item : orderItems) {
			jct.appendRow();
			jct.setValue("POSNR", item.getXmid()); //闁匡拷鏁崪灞藉瀻闁匡拷鍤熺拠浣烘畱妞ゅ湱娲伴崣锟絇OSNR
			jct.setValue("MATNR", item.getMatnr());//閻椻晜鏋￠崣锟�MATNR
			jct.setValue("SO_QTY", String.valueOf(item.getSoQty()));//缂冩垼鍠橀弫浼村櫤  SO_QTY
			jct.setValue("SO_UNIT", item.getSoUnit());//缂冩垼鍠橀崡鏇氱秴 SO_UNIT	
			jct.setValue("WERKS", item.getWerks());//瀹搞儱宸� WERKS
			jct.setValue("LGORT", item.getLgort());//鎼存挸鐡ㄩ崷鎵仯  LGORT
			jct.setValue("VSTEL", item.getVstel());//鐟佸懓绻嶉悙锟介幒銉︽暪閻愶拷 VSTEL
			jct.setValue("PFLAG", item.getPFLAG());//閸忓秷鍨傛い鍦窗flag
		}
		
		JCoTable jct1 = function.getTableParameterList().getTable(
				"T_IT_DATA");

		jct1.appendRow();
		jct1.setValue("IBXNO", order.getBstkd()); //闁匡拷鏁崪灞藉瀻闁匡拷鍤熺拠浣烘畱妞ゅ湱娲伴崣锟絇OSNR
		jct1.setValue("BUKRS", order.getSalesName());//閻椻晜鏋￠崣锟�MATNR
		jct1.setValue("UNAME", "ADMIN");//缂冩垼鍠橀弫浼村櫤  SO_QTY
		jct1.setValue("ERDAT", now);//缂冩垼鍠橀崡鏇氱秴 SO_UNIT	
		jct1.setValue("BUDAT", now);//瀹搞儱宸� WERKS
		jct1.setValue("RCCOD", order.getSalesName());//鎼存挸鐡ㄩ崷鎵仯  LGORT
		jct1.setValue("KUNNR", order.getSoldTo());//鐟佸懓绻嶉悙锟介幒銉︽暪閻愶拷 VSTEL
		jct1.setValue("WAERS", "RMB");//閸忓秷鍨傛い鍦窗flag
		jct1.setValue("WRBTR", order.getPAYABLEAMT());//閸忓秷鍨傛い鍦窗flag
		jct1.setValue("REDOC", order.getBstkd());//閸忓秷鍨傛い鍦窗flag
		jct1.setValue("TRSTP", szfi001.getTRSTP());//閸忓秷鍨傛い鍦窗flag
		jct1.setValue("ZLSCH", szfi001.getZLSCH());//閸忓秷鍨傛い鍦窗flag
		jct1.setValue("HKONT", szfi001.getHKONT());//閸忓秷鍨傛い鍦窗flag


		
		function.execute(jCoDestination);
		
		JCoParameterList parameOut = function.getExportParameterList(); 
		if (!parameOut.getString("STATUS").equals("S")){
			MaintainErrorRecord mr = new MaintainErrorRecord();
			TErRecord tr = new TErRecord();
			strreason = parameOut.getString("MESSAGE");
			tr.setFUNCNAME("SAPRFC");
			tr.setEREASON(strreason);
			tr.setERFLAG("0");
			tr.setORDERCODE(order.getBstkd());
			mr.addErrorRecordByCode(tr);
		}	
		returnInfo.setSoNumber(parameOut.getString("SO_NUMBER"));//闂備礁灏呴幏鐑藉极椤撱垹绀勬い鎿勭磿濡诧拷
		returnInfo.setStatus(parameOut.getString("STATUS"));
		returnInfo.setMessage(parameOut.getString("MESSAGE"));
		returnInfo.setZZCPERI(parameOut.getString("ZZCPERI"));
		returnInfo.setSTRBELNR(parameOut.getString("STRBELNR"));
		returnInfo.setGJAHR(parameOut.getString("STRGJAHR"));
		}catch(Exception e){
			MaintainErrorRecord mr = new MaintainErrorRecord();
			TErRecord tr = new TErRecord();
			strreason = e.toString();
			tr.setFUNCNAME("SAPRFC");
			tr.setEREASON(strreason);
			tr.setERFLAG("0");
			tr.setORDERCODE(order.getBstkd());
			mr.addErrorRecordByCode(tr);
			e.printStackTrace();
			
		}
		
	
		return returnInfo;
	}
	
	public SynReturnInfo callRFC_GIFT_ZFI(StoreOrder order,List<StoreOrderItem> orderItems,TZFI001 szfi001) throws Exception 
	{
		SynReturnInfo returnInfo = new SynReturnInfo(); 
		String strreason = new String();
		int idate = 0;
		int imonth = 0;
		int iyear = 0;
		String strZZCPERI = new String();
		Date now = new Date(); 
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		String strdate = dateFormat.format( now );						
		try{
			
		jCoDestination = ConnectSAPServer.Connect();
		JCoFunction function = jCoDestination.getRepository().getFunction("ZSD_CREATE_STOREORDER_GIFT2");
		if (function == null) throw new RuntimeException("ZSD_CREATE_STOREORDER_GIFT2 not found.");
		JCoStructure js = function.getImportParameterList().getStructure(
				"SO_HEADER_DATA_Z102");
		
		Calendar cal=Calendar.getInstance();    
		iyear=cal.get(Calendar.YEAR);    
		imonth=cal.get(Calendar.MONTH);    
		idate=cal.get(Calendar.DATE);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMM");
		 
		if (idate > 26) {
	        cal.set(Calendar.DAY_OF_MONTH, 1);
	        cal.add(Calendar.MONTH, 1);
		}else{
			cal.set(Calendar.DAY_OF_MONTH, 1);
		}
		
		strZZCPERI = sdf.format(cal.getTime())  ;
		js.setValue("VKORG", order.getSalesName()); //闁匡拷鏁紒鍕矏  VKORG
		js.setValue("VTWEG", order.getSalesChanel()); //閸掑棝鏀㈠〒鐘讳壕  VTWEG
		js.setValue("SOLD_TO", order.getSoldTo());//鐎广垺鍩涚紓鏍у娇SOLD_TO
		js.setValue("SHIP_TO", order.getShipTo());//鐎广垺鍩涚紓鏍у娇SHIP_TO
		js.setValue("BSTKD", order.getBstkd());//鐎广垺鍩涢柌鍥枠鐠併垹宕熺紓鏍у娇  BSTKD
		js.setValue("REMARK", order.getRemark());//婢跺洦鏁�  REMARK
		
		JCoParameterList importParam = function.getImportParameterList();
		importParam.setValue("NAME",order.getCNAME());
		importParam.setValue("CITY",order.getCCITY());
		importParam.setValue("FREIGHT",order.getFREIGHT());
		importParam.setValue("TELNUM",order.getTELNUM());
		importParam.setValue("FREIGHT1", String.valueOf((0 - Double.valueOf(order.getFREIGHT1()))));
		importParam.setValue("ZZCPERI1", strZZCPERI);
		
		JCoTable jct = function.getTableParameterList().getTable(
								"SO_ITEM_DATA_Z102");
		
		for (StoreOrderItem item : orderItems) {
			jct.appendRow();
			jct.setValue("POSNR", item.getXmid()); //闁匡拷鏁崪灞藉瀻闁匡拷鍤熺拠浣烘畱妞ゅ湱娲伴崣锟絇OSNR
			jct.setValue("MATNR", item.getMatnr());//閻椻晜鏋￠崣锟�MATNR
			jct.setValue("SO_QTY", String.valueOf(item.getSoQty()));//缂冩垼鍠橀弫浼村櫤  SO_QTY
			jct.setValue("SO_UNIT", item.getSoUnit());//缂冩垼鍠橀崡鏇氱秴 SO_UNIT	
			jct.setValue("WERKS", item.getWerks());//瀹搞儱宸� WERKS
			jct.setValue("LGORT", item.getLgort());//鎼存挸鐡ㄩ崷鎵仯  LGORT
			jct.setValue("VSTEL", item.getVstel());//鐟佸懓绻嶉悙锟介幒銉︽暪閻愶拷 VSTEL
			jct.setValue("PFLAG", item.getPFLAG());//閸忓秷鍨傛い鍦窗flag
		}
		
		JCoTable jct1 = function.getTableParameterList().getTable(
				"T_IT_DATA");

		jct1.appendRow();
		jct1.setValue("IBXNO", order.getBstkd()); //闁匡拷鏁崪灞藉瀻闁匡拷鍤熺拠浣烘畱妞ゅ湱娲伴崣锟絇OSNR
		jct1.setValue("BUKRS", order.getSalesName());//閻椻晜鏋￠崣锟�MATNR
		jct1.setValue("UNAME", "ADMIN");//缂冩垼鍠橀弫浼村櫤  SO_QTY
		jct1.setValue("ERDAT", now);//缂冩垼鍠橀崡鏇氱秴 SO_UNIT	
		jct1.setValue("BUDAT", now);//瀹搞儱宸� WERKS
		jct1.setValue("RCCOD", order.getSalesName());//鎼存挸鐡ㄩ崷鎵仯  LGORT
		jct1.setValue("KUNNR", order.getSoldTo());//鐟佸懓绻嶉悙锟介幒銉︽暪閻愶拷 VSTEL
		jct1.setValue("WAERS", "RMB");//閸忓秷鍨傛い鍦窗flag
		jct1.setValue("WRBTR", order.getPAYABLEAMT());//閸忓秷鍨傛い鍦窗flag
		jct1.setValue("REDOC", order.getBstkd());//閸忓秷鍨傛い鍦窗flag
		jct1.setValue("TRSTP", szfi001.getTRSTP());//閸忓秷鍨傛い鍦窗flag
		jct1.setValue("ZLSCH", szfi001.getZLSCH());//閸忓秷鍨傛い鍦窗flag
		jct1.setValue("HKONT", szfi001.getHKONT());//閸忓秷鍨傛い鍦窗flag
		
		function.execute(jCoDestination);
		
		JCoParameterList parameOut = function.getExportParameterList(); 
		if (!parameOut.getString("STATUS").equals("S")){
			MaintainErrorRecord mr = new MaintainErrorRecord();
			TErRecord tr = new TErRecord();
			strreason = parameOut.getString("MESSAGE");
			tr.setFUNCNAME("SAPRFC");
			tr.setEREASON(strreason);
			tr.setERFLAG("0");
			tr.setORDERCODE(order.getBstkd());
			mr.addErrorRecordByCode(tr);
		}	
		returnInfo.setSoNumber(parameOut.getString("SO_NUMBER"));//闂備礁灏呴幏鐑藉极椤撱垹绀勬い鎿勭磿濡诧拷
		returnInfo.setStatus(parameOut.getString("STATUS"));
		returnInfo.setMessage(parameOut.getString("MESSAGE"));
		returnInfo.setZZCPERI(parameOut.getString("ZZCPERI"));
		returnInfo.setSTRBELNR(parameOut.getString("STRBELNR"));
		returnInfo.setGJAHR(parameOut.getString("STRGJAHR"));
		}catch(Exception e){
			MaintainErrorRecord mr = new MaintainErrorRecord();
			TErRecord tr = new TErRecord();
			strreason = e.toString();
			tr.setFUNCNAME("SAPRFC");
			tr.setEREASON(strreason);
			tr.setERFLAG("0");
			tr.setORDERCODE(order.getBstkd());
			mr.addErrorRecordByCode(tr);
			e.printStackTrace();
			
		}
		
	
		return returnInfo;
	}
	
	public SynReturnInfo callRFC_GIFT(StoreOrder order,List<StoreOrderItem> orderItems) throws Exception 
	{
		SynReturnInfo returnInfo = new SynReturnInfo(); 
		String strreason = new String();
		int idate = 0;
		int imonth = 0;
		int iyear = 0;
		String strZZCPERI = new String();
								
		try{
			
		jCoDestination = ConnectSAPServer.Connect();
		JCoFunction function = jCoDestination.getRepository().getFunction("ZSD_CREATE_STOREORDER_GIFT1");
		if (function == null) throw new RuntimeException("ZSD_CREATE_STOREORDER_GIFT not found.");
		JCoStructure js = function.getImportParameterList().getStructure(
				"SO_HEADER_DATA_Z102");
		
		Calendar cal=Calendar.getInstance();    
		iyear=cal.get(Calendar.YEAR);    
		imonth=cal.get(Calendar.MONTH);    
		idate=cal.get(Calendar.DATE);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMM");
		 
		if (idate > 26) {
	        cal.set(Calendar.DAY_OF_MONTH, 1);
	        cal.add(Calendar.MONTH, 1);
		}else{
			cal.set(Calendar.DAY_OF_MONTH, 1);
		}
		
		strZZCPERI = sdf.format(cal.getTime())  ;
		js.setValue("VKORG", order.getSalesName()); //闁匡拷鏁紒鍕矏  VKORG
		js.setValue("VTWEG", order.getSalesChanel()); //閸掑棝鏀㈠〒鐘讳壕  VTWEG
		js.setValue("SOLD_TO", order.getSoldTo());//鐎广垺鍩涚紓鏍у娇SOLD_TO
		js.setValue("SHIP_TO", order.getShipTo());//鐎广垺鍩涚紓鏍у娇SHIP_TO
		js.setValue("BSTKD", order.getBstkd());//鐎广垺鍩涢柌鍥枠鐠併垹宕熺紓鏍у娇  BSTKD
		js.setValue("REMARK", order.getRemark());//婢跺洦鏁�  REMARK
		
		JCoParameterList importParam = function.getImportParameterList();
		importParam.setValue("NAME",order.getCNAME());
		importParam.setValue("CITY",order.getCCITY());
		importParam.setValue("FREIGHT",order.getFREIGHT());
		importParam.setValue("TELNUM",order.getTELNUM());
		importParam.setValue("FREIGHT1", String.valueOf((0 - Double.valueOf(order.getFREIGHT1()))));
		importParam.setValue("ZZCPERI1", strZZCPERI);
		
		JCoTable jct = function.getTableParameterList().getTable(
								"SO_ITEM_DATA_Z102");
		
		for (StoreOrderItem item : orderItems) {
			jct.appendRow();
			jct.setValue("POSNR", item.getXmid()); //闁匡拷鏁崪灞藉瀻闁匡拷鍤熺拠浣烘畱妞ゅ湱娲伴崣锟絇OSNR
			jct.setValue("MATNR", item.getMatnr());//閻椻晜鏋￠崣锟�MATNR
			jct.setValue("SO_QTY", String.valueOf(item.getSoQty()));//缂冩垼鍠橀弫浼村櫤  SO_QTY
			jct.setValue("SO_UNIT", item.getSoUnit());//缂冩垼鍠橀崡鏇氱秴 SO_UNIT	
			jct.setValue("WERKS", item.getWerks());//瀹搞儱宸� WERKS
			jct.setValue("LGORT", item.getLgort());//鎼存挸鐡ㄩ崷鎵仯  LGORT
			jct.setValue("VSTEL", item.getVstel());//鐟佸懓绻嶉悙锟介幒銉︽暪閻愶拷 VSTEL
			jct.setValue("PFLAG", item.getPFLAG());//閸忓秷鍨傛い鍦窗flag
		}
		
		function.execute(jCoDestination);
		
		JCoParameterList parameOut = function.getExportParameterList(); 
		if (!parameOut.getString("STATUS").equals("S")){
			MaintainErrorRecord mr = new MaintainErrorRecord();
			TErRecord tr = new TErRecord();
			strreason = parameOut.getString("MESSAGE");
			tr.setFUNCNAME("SAPRFC");
			tr.setEREASON(strreason);
			tr.setERFLAG("0");
			tr.setORDERCODE(order.getBstkd());
			mr.addErrorRecordByCode(tr);
		}	
		returnInfo.setSoNumber(parameOut.getString("SO_NUMBER"));//闂備礁灏呴幏鐑藉极椤撱垹绀勬い鎿勭磿濡诧拷
		returnInfo.setStatus(parameOut.getString("STATUS"));
		returnInfo.setMessage(parameOut.getString("MESSAGE"));
		returnInfo.setZZCPERI(parameOut.getString("ZZCPERI"));
		}catch(Exception e){
			MaintainErrorRecord mr = new MaintainErrorRecord();
			TErRecord tr = new TErRecord();
			strreason = e.toString();
			tr.setFUNCNAME("SAPRFC");
			tr.setEREASON(strreason);
			tr.setERFLAG("0");
			tr.setORDERCODE(order.getBstkd());
			mr.addErrorRecordByCode(tr);
			e.printStackTrace();
			
		}
		
	
		return returnInfo;
	}
	
	public SynReturnInfo callRFC4B(StoreOrder order,List<StoreOrderItem> orderItems) throws Exception 
	{
		SynReturnInfo returnInfo = new SynReturnInfo(); 
		String strreason = new String();
		int idate = 0;
		int imonth = 0;
		int iyear = 0;
		String strZZCPERI = new String();
								
		try{
			
		jCoDestination = ConnectSAPServer.Connect();
		JCoFunction function = jCoDestination.getRepository().getFunction("ZSD_CREATE_STOREORDER4B");
		if (function == null) throw new RuntimeException("ZSD_CREATE_STOREORDER4B not found.");
		JCoStructure js = function.getImportParameterList().getStructure(
				"SO_HEADER_DATA_Z102");
		
		Calendar cal=Calendar.getInstance();    
		iyear=cal.get(Calendar.YEAR);    
		imonth=cal.get(Calendar.MONTH);    
		idate=cal.get(Calendar.DATE);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMM");
		 
		if (idate > 26) {
	        cal.set(Calendar.DAY_OF_MONTH, 1);
	        cal.add(Calendar.MONTH, 1);
		}else{
			cal.set(Calendar.DAY_OF_MONTH, 1);
		}
		
		strZZCPERI = sdf.format(cal.getTime())  ;
		js.setValue("VKORG", order.getSalesName()); //闁匡拷鏁紒鍕矏  VKORG
		js.setValue("VTWEG", order.getSalesChanel()); //閸掑棝鏀㈠〒鐘讳壕  VTWEG
		js.setValue("SOLD_TO", order.getSoldTo());//鐎广垺鍩涚紓鏍у娇SOLD_TO
		js.setValue("SHIP_TO", order.getShipTo());//鐎广垺鍩涚紓鏍у娇SHIP_TO
		js.setValue("BSTKD", order.getBstkd());//鐎广垺鍩涢柌鍥枠鐠併垹宕熺紓鏍у娇  BSTKD
		js.setValue("REMARK", order.getRemark());//婢跺洦鏁�  REMARK
		
		JCoParameterList importParam = function.getImportParameterList();
		importParam.setValue("NAME",order.getCNAME());
		importParam.setValue("CITY",order.getCCITY());
		importParam.setValue("FREIGHT",order.getFREIGHT());
		importParam.setValue("TELNUM",order.getTELNUM());
		importParam.setValue("FREIGHT1", String.valueOf((0 - Double.valueOf(order.getFREIGHT1()))));
		importParam.setValue("ZZCPERI1", strZZCPERI);
		
		JCoTable jct = function.getTableParameterList().getTable(
								"SO_ITEM_DATA_Z102");
		
		for (StoreOrderItem item : orderItems) {
			jct.appendRow();
			jct.setValue("POSNR", item.getXmid()); //闁匡拷鏁崪灞藉瀻闁匡拷鍤熺拠浣烘畱妞ゅ湱娲伴崣锟絇OSNR
			jct.setValue("MATNR", item.getMatnr());//閻椻晜鏋￠崣锟�MATNR
			jct.setValue("SO_QTY", String.valueOf(item.getSoQty()));//缂冩垼鍠橀弫浼村櫤  SO_QTY
			jct.setValue("SO_UNIT", item.getSoUnit());//缂冩垼鍠橀崡鏇氱秴 SO_UNIT	
			jct.setValue("WERKS", item.getWerks());//瀹搞儱宸� WERKS
			jct.setValue("LGORT", item.getLgort());//鎼存挸鐡ㄩ崷鎵仯  LGORT
			jct.setValue("VSTEL", item.getVstel());//鐟佸懓绻嶉悙锟介幒銉︽暪閻愶拷 VSTEL
			jct.setValue("PFLAG", item.getPFLAG());//閸忓秷鍨傛い鍦窗flag
		}
		
		function.execute(jCoDestination);
		
		JCoParameterList parameOut = function.getExportParameterList(); 
		if (!parameOut.getString("STATUS").equals("S")){
			MaintainErrorRecord mr = new MaintainErrorRecord();
			TErRecord tr = new TErRecord();
			strreason = parameOut.getString("MESSAGE");
			tr.setFUNCNAME("SAPRFC");
			tr.setEREASON(strreason);
			tr.setERFLAG("0");
			tr.setORDERCODE(order.getBstkd());
			mr.addErrorRecordByCode(tr);
		}	
		returnInfo.setSoNumber(parameOut.getString("SO_NUMBER"));//闂備礁灏呴幏鐑藉极椤撱垹绀勬い鎿勭磿濡诧拷
		returnInfo.setStatus(parameOut.getString("STATUS"));
		returnInfo.setMessage(parameOut.getString("MESSAGE"));
		returnInfo.setZZCPERI(parameOut.getString("ZZCPERI"));
		}catch(Exception e){
			MaintainErrorRecord mr = new MaintainErrorRecord();
			TErRecord tr = new TErRecord();
			strreason = e.toString();
			tr.setFUNCNAME("SAPRFC");
			tr.setEREASON(strreason);
			tr.setERFLAG("0");
			tr.setORDERCODE(order.getBstkd());
			mr.addErrorRecordByCode(tr);
			e.printStackTrace();
			
		}
		
	
		return returnInfo;
	}
		
		
		public List<TStock> getStock(String strwarehouseID,String strDate,String strTime,List<TStock> orderItems) throws Exception 
		{
			SynReturnInfo returnInfo = new SynReturnInfo(); 
			String strreason = new String();
			String strma = new String();
			String strval = new String();
			String rt_date = new String();
			String rt_time = new String();
			try{
			jCoDestination = ConnectSAPServer.Connect();
			JCoFunction function = jCoDestination.getRepository().getFunction("ZSDR_GET_O2OSTOCK1");
			if (function == null) throw new RuntimeException("ZSDR_GET_O2OSTOCK鑱絥ot鑱絝ound鑱絠n鑱絊AP.");

			JCoParameterList importParam = function.getImportParameterList();
			importParam.setValue("GDS_DATS",strDate);
			importParam.setValue("GDS_TIME",strTime);
			
			JCoTable jct = function.getTableParameterList().getTable(
														"ZO2OM");  
			
			for (TStock item : orderItems) {
				jct.appendRow();
				jct.setValue("MATNR", item.getMATNR());//閻椻晜鏋￠崣锟�MATNR
				jct.setValue("WERKS", item.getWERKS());//瀹搞儱宸� WERKS
				jct.setValue("LGORT", item.getLGORT());//鎼存挸鐡ㄩ崷鎵仯  LGORT
				jct.setValue("UNIT", item.getSOUNIT());//缂冩垼鍠橀崡鏇氱秴 SO_UNIT
				jct.setValue("SO_QTY", item.getSOQTY());//缂冩垼鍠橀弫浼村櫤  SO_QTY
				jct.setValue("SO_QTY_R", "0");//閺佷即鍣�
			}
			 
			function.execute(jCoDestination);
			
			JCoParameterList parameOut = function.getExportParameterList(); 
			if (!parameOut.getString("GDS_FLAG").equals("S")){
				MaintainErrorRecord mr = new MaintainErrorRecord();
				TErRecord tr = new TErRecord();
				strreason = parameOut.getString("GDS_MESSAGE");
				tr.setFUNCNAME("getStock");
				tr.setEREASON(strreason);
				tr.setERFLAG("0");
				//tr.setORDERCODE(order.getBstkd());
				mr.addErrorRecordByCode(tr);
			}
			rt_date = parameOut.getString("GDS_DATS1");
			rt_time = parameOut.getString("GDS_TIME1");
			
			GetStock_Test gt = new GetStock_Test();
			Boolean bflag = gt.updStockTime(strwarehouseID,rt_date, rt_time);
			
			JCoTable jct1 = function.getTableParameterList().getTable(
									"ZO2OM");  
			
			for(int i=0;i<jct1.getNumRows();i++){
				jct1.setRow(i);
				JCoFieldIterator iterator = jct1.getFieldIterator();
	            while (iterator.hasNextField()) {
	                // System.out.println(parameterField.getName()+"JCoFieldIterator");
	                JCoField recordField = iterator.nextField();   
   	                String fieldName=recordField.getName();
	                String val_str=recordField.getString();
	                if ("MATNR".equals(fieldName)){
	                	strma = val_str;
	                }
	                if ("SO_QTY_R".equals(fieldName)){
	                	strval = val_str.trim();
	                	break;
	                }
	            }
	            for (TStock item : orderItems) {
	            	if(strma.equals(item.getMATNR())){
	            		item.setSOQTYR(strval);
	            		break;
	            	}
	            }
	            
			}

			}catch(Exception e){
				MaintainErrorRecord mr = new MaintainErrorRecord();
				TErRecord tr = new TErRecord();
				strreason = e.toString();
				tr.setFUNCNAME("getStock");
				tr.setEREASON(strreason);
				tr.setERFLAG("0");
				//tr.setORDERCODE();
				mr.addErrorRecordByCode(tr);
				e.printStackTrace();
				
			}
			
		
			return orderItems;
		
		
	}
		
		
		public TConsult4SAPList addConsult(@WebParam(name = "tc4sl") TConsult4SAPList tc4sl) throws Exception 
		{
			String strreason = new String();
			String strmsg= new String();
			String strstatus = new String();
			Connection conn = DbUtil.getConn();
			String strCnum = new String();
			List<TConsult4SAP> tc4sll = new ArrayList();
			try{
				
			jCoDestination = ConnectSAPServer.Connect();
			JCoFunction function = jCoDestination.getRepository().getFunction("ZSD_RFC_CREATE_CONSULT_CUST2");
			if (function == null) throw new RuntimeException("ZSD_RFC_CREATE_CONSULT_CUST1鑱絥ot鑱絝ound鑱絠n鑱絊AP.");
			tc4sll = tc4sl.getTc4s();
			for(int i=0;i<tc4sll.size();i++){
				TConsult4SAP  tc4s = new TConsult4SAP();
				tc4s = tc4sll.get(i);
				DbUtil dbt = new DbUtil();
				String strSQL = new String();
				try{
				ResultSet dbrs = null; 
				
				strSQL = "SELECT SEQ_TB_CONSULTNUM.NEXTVAL Consultnum FROM DUAL";
				PreparedStatement pstmt1 = dbt.getPreparedStatement(conn,strSQL);
				dbrs = pstmt1.executeQuery();
				if(dbrs.next()){
					strCnum = dbrs.getString("Consultnum");
				}
				
				}catch(Exception e){
					conn.rollback();
					MaintainErrorRecord mr = new MaintainErrorRecord();
					TErRecord tr = new TErRecord();
					strreason = e.toString();
					tr.setFUNCNAME("addConsult");
					tr.setEREASON(strreason);
					tr.setERFLAG("0");
					tr.setORDERCODE(strCnum);
					mr.addErrorRecordByCode(tr);
					e.printStackTrace();
					throw e;
				}
				JCoParameterList importParam = function.getImportParameterList();
				importParam.setValue("F_CUST_NO","000"+strCnum);
				
				JCoStructure jct = importParam.getStructure("ZSDCONSULT");
				jct.setValue("NAME1", tc4s.getName());//閻椻晜鏋￠崣锟�MATNR
				jct.setValue("STREET",tc4s.getAddr());//瀹搞儱宸� WERKS
				jct.setValue("TEL_NUMBER1",tc4s.getTelnumber());//鎼存挸鐡ㄩ崷鎵仯  LGORT
				jct.setValue("KUNNR",tc4s.getKunnr());//缂冩垼鍠橀崡鏇氱秴 SO_UNIT
				jct.setValue("ZCONCODE", tc4s.getCode());//缂冩垼鍠橀弫浼村櫤  SO_QTY
				jct.setValue("CITY", tc4s.getCity());//缂冩垼鍠橀弫浼村櫤  SO_QTY
				
				function.execute(jCoDestination);
				
				JCoParameterList parameOut = function.getExportParameterList(); 
				if (!parameOut.getString("STATUS").equals("S")){
					MaintainErrorRecord mr = new MaintainErrorRecord();
					TErRecord tr = new TErRecord();
					strreason = parameOut.getString("MESSAGE");
					tr.setFUNCNAME("addConsult");
					tr.setEREASON(strreason);
					tr.setERFLAG("0");
					mr.addErrorRecordByCode(tr);
				}
				strstatus = parameOut.getString("STATUS");
				strmsg = parameOut.getString("MESSAGE");
				tc4s.setCode4sap("000"+strCnum);
				tc4s.setStrmsg(strmsg);
				tc4s.setStrstatus(strstatus);
			}
			

			
			}catch(Exception e){
				MaintainErrorRecord mr = new MaintainErrorRecord();
				TErRecord tr = new TErRecord();
				strreason = e.toString();
				tr.setFUNCNAME("addConsult");
				tr.setEREASON(strreason);
				tr.setERFLAG("0");
				//tr.setORDERCODE();
				mr.addErrorRecordByCode(tr);
				e.printStackTrace();
				
			}finally {
				   // 閺傤厼绱戞潻鐐村复
					conn.close();
				}
			
		
			return tc4sl;
		
		
	}
		
		public boolean getLogistics(@WebParam(name = "CDN") String CDN) throws Exception 
		{
			TDN Tdn = new TDN(); 
			boolean bflag = false;
			String strreason = new String();
			String strordercode = new String();
			try{
			jCoDestination = ConnectSAPServer.Connect();
			JCoFunction function = jCoDestination.getRepository().getFunction("ZSD_GET_LOGISTICSNO");
			if (function == null) throw new RuntimeException("ZSD_GET_LOGISTICSNO鑱絥ot鑱絝ound鑱絠n鑱絊AP.");
			
			JCoParameterList importParam = function.getImportParameterList();
			importParam.setValue("GT_VBELN",CDN);
	
			function.execute(jCoDestination);
			
			JCoParameterList parameOut = function.getExportParameterList(); 
			Tdn.setLogisticscode(parameOut.getString("LIFNR"));//闂備礁灏呴幏鐑藉极椤撱垹绀勬い鎿勭磿濡诧拷
			Tdn.setOUTSID(parameOut.getString("YUNDA"));
			Tdn.setStrDN(CDN);
			Tdn.setOrdercode(parameOut.getString("AUFNR"));
			String strnum = new String();
			String strBuyTel = new String();
			String strBuyName = new String();
			String strLogComName = new String();
			String strCUSTOMERSOURCE = new String();
 			 if (Tdn.getOUTSID() != null && !Tdn.getOUTSID().equals("")) {
				 
				 	DbUtil dbt = new DbUtil();
					String strSQL = new String();
					ResultSet dbrs = null; 
					Connection conn = DbUtil.getConn();
					strSQL = "SELECT LOGISTICS_CODE,LOGISTICS_NAME FROM TB_LOGISTICS WHERE LOGISTICS_FSAP ='" + Tdn.getLogisticscode() + "'";
					PreparedStatement pstmt1 = dbt.getPreparedStatement(conn,strSQL);
					dbrs = pstmt1.executeQuery();
					if(dbrs.next()){
						strnum = dbrs.getString("LOGISTICS_CODE");
						strLogComName = dbrs.getString("LOGISTICS_NAME");
					}
					conn.setAutoCommit(false);
					strSQL = "UPDATE TB_ORDER_MAST SET POST_COMPANY = '" + strnum + "'";
					strSQL = strSQL + ",POST_NO ='" +  Tdn.getOUTSID() + "'";
					strSQL = strSQL + ",SALE_ORDER_STATE ='1'";
					strSQL = strSQL + ",MODIFY_DATE = to_date(to_char(sysdate,'yyyy-MM-dd HH24:mi:ss'),'yyyy-MM-dd HH24:mi:ss')";
					strSQL = strSQL + ",MODIFY_USER ='admin'";
					
					strSQL = strSQL + " WHERE SAP_SALE_ORDER ='" +  Tdn.getOrdercode() + "'";
					
					try{
						
						bflag = dbt.UpOpera(conn,strSQL);
						strSQL = "INSERT INTO TB_LOGISTICS_FORSAP(LOGISTICS_ID,DELIVER_NUN,ORDER_CODE,POST_COMPANY,CREATE_DATE,POST_NO) VALUES( SEQ_TB_LOGISTICS.NEXTVAL " ;
						strSQL = strSQL + ",'" +   Tdn.getStrDN();
						strSQL = strSQL + "','" +  Tdn.getOrdercode();
						strSQL = strSQL + "','" +  strnum;
						strSQL = strSQL + "', to_date(to_char(sysdate,'yyyy-MM-dd HH24:mi:ss'),'yyyy-MM-dd HH24:mi:ss')";
						strSQL = strSQL + ",'" +  Tdn.getOUTSID() 
								+ "')";
			
						bflag = dbt.UpOpera(conn,strSQL);
						conn.commit();
						strSQL = "SELECT ORDER_CODE,CUSTOMER_SOURCE FROM TB_ORDER_MAST WHERE SAP_SALE_ORDER ='" +  Tdn.getOrdercode() + "'";
						PreparedStatement pstmt3 = dbt.getPreparedStatement(conn,strSQL);
						dbrs = pstmt3.executeQuery();
						if(dbrs.next()){
							strordercode = dbrs.getString("ORDER_CODE");
							strCUSTOMERSOURCE = dbrs.getString("CUSTOMER_SOURCE");
						}
						TOrderLogistics tol = new TOrderLogistics();
						tol.setLOGISTICCODE(strnum);
						tol.setOUTSID(Tdn.getOUTSID());
						tol.setORDERCODE(strordercode);
						MaintainGetOrderDataImpl mgdi =new MaintainGetOrderDataImpl();
						if (strCUSTOMERSOURCE.equals("5")){
							MaintainPRMDataImpl modi = new MaintainPRMDataImpl();
							TOrder odata = new TOrder();
							odata.setORDERCODE(strordercode);
							odata.setPOSTCOMPANY(tol.getLOGISTICCODE());
							odata.setPOSTNO(tol.getOUTSID());
							odata.setSALEORDERSTATE("1");
							bflag = modi.sendOrderStatus(odata);
						}else{
							bflag = mgdi.setOrderlogistics(tol);
						}
							
						if (bflag) {
							strSQL = "select a.RECEIPT_PERSON RECEIPT_PERSON,a.RECEIPT_MOBILE RECEIPT_MOBILE from TB_ORDER_MAST a,TB_CUSTOMER b where a.CUSTOMER_CODE = " +
									"b.CUSTOMER_CODE and SAP_SALE_ORDER = '" + Tdn.getOrdercode() + "'";
							PreparedStatement pstmt2 = dbt.getPreparedStatement(conn,strSQL);
							dbrs = pstmt2.executeQuery();
							if(dbrs.next()){
								strBuyTel = dbrs.getString("RECEIPT_MOBILE");
								strBuyName = dbrs.getString("RECEIPT_PERSON");
							}
							
							MySendClient.sendMsgByChlitinaO2O("亲爱的"+ strBuyName +"，您的订单已由"+ strLogComName + Tdn.getOUTSID() + "发出，如有问题请联系我们，您身边的肌肤护理专家 (克丽缇娜天猫旗舰店)",strBuyTel);
							
						}
				
					}catch(Exception e){
						conn.rollback();
						MaintainErrorRecord mr = new MaintainErrorRecord();
						TErRecord tr = new TErRecord();
						strreason = e.toString();
						tr.setFUNCNAME("uptLogistics");
						tr.setEREASON(strreason);
						tr.setERFLAG("0");
						tr.setORDERCODE(CDN);
						mr.addErrorRecordByCode(tr);
						e.printStackTrace();
						throw e;
					}finally {
					   // 閺傤厼绱戞潻鐐村复
						conn.close();
					}
				 
				 
			 }
			}catch(Exception e){
				MaintainErrorRecord mr = new MaintainErrorRecord();
				TErRecord tr = new TErRecord();
				strreason = e.toString();
				tr.setFUNCNAME("uptLogistics");
				tr.setEREASON(strreason);
				tr.setERFLAG("0");
				tr.setORDERCODE(CDN);
				mr.addErrorRecordByCode(tr);
				e.printStackTrace();
				
			}
			
		
			return bflag;
		
		
	}
		
		
		
		
		
		
		
		
		public static void main(String[] args) throws Exception{
			//MySendClient.sendMsgByChlitinaO2O("娴滆尙鍩嶉惃鍕藩闂呮枻绱濋幃銊ф畱鐠併垹宕熷鑼暠妞よ桨璧�23456789閸欐垵鍤敍灞筋渾閺堝妫舵０妯款嚞閼辨梻閮撮幋鎴滄粦閿涘本鍋嶉煬顐ョ珶閻ㄥ嫯鍊㈤懖銈嗗Б閻炲棔绗撶�锟�閸忓闄勭紓鍥ь焸婢垛晝灏楅弮妤勫煂鎼达拷","13761675285");
			
			//Lts = cst.getStock(Lts);
			ConnectSAPTable cst = new ConnectSAPTable();
			TConsult4SAPList temp1 = new TConsult4SAPList();
			List<TConsult4SAP> tc4sll = new ArrayList();
			TConsult4SAP tc4s = new TConsult4SAP();
			tc4s.setAddr("閸栨ぞ鍚崠妞惧惈鐢倹婀為梼鍐插隘閹卞牅绨�鍝勫彄闁插苯绨炵憲鍧楀櫡鏉╂粍纾辨径鈺佹勾67閸欓攱銈�02");
			tc4s.setCode("Z110000233");
			tc4s.setKunnr("1100051056");
			tc4s.setName("妤傛ê顭�");
			tc4s.setTelnumber("13810986199");
			tc4sll.add(tc4s);
			temp1.setTc4s(tc4sll);
			temp1 = cst.addConsult(temp1);
			System.out.print("1111");
			
		}
		
	*/
		
}
	
	


