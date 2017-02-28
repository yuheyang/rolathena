package com.chlitina.o2o.test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

import com.chlitina.o2o.entity.SOOrder;
import com.chlitina.o2o.entity.SOOrderDetail;
import com.chlitina.o2o.entity.SOOrderDetailPromotion;
import com.chlitina.o2o.entity.SOOrderResult;
import com.chlitina.o2o.entity.impl.SOOrderDetailImpl;
import com.chlitina.o2o.entity.impl.SOOrderImpl;
import com.chlitina.o2o.entity.impl.SOOrderResultImpl;
import com.chlitina.o2o.ws.BalanceService;
import com.chlitina.o2o.ws.O2OWebService;


public class Test {
	public static void main(String args[]){
		
		Date now = new Date();
		Format format = new SimpleDateFormat("yyyyMMdd");
		Calendar cal = Calendar.getInstance();
		cal.setTime(now);
		System.out.println("=====123======="+cal.get(Calendar.DAY_OF_MONTH));
		if(cal.get(Calendar.DAY_OF_MONTH) >= 27){
			cal.add(Calendar.DAY_OF_MONTH, 10);
		}
		System.out.println("============"+format.format(cal.getTime()));
	}
	
}
