package com.chlitina.o2o.common;

import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.annotation.adapters.XmlAdapter;

/**
 * ��Map������ת���������������
 *
 */
public class MapAdapter extends XmlAdapter<MapConvertor, Map<String, Object>> {

    @Override
    public MapConvertor marshal(Map<String, Object> map) throws Exception {
        MapConvertor convertor = new MapConvertor();
        if(map != null){
        	for (Map.Entry<String, Object> entry : map.entrySet()) {
                MapConvertor.MapEntry e = new MapConvertor.MapEntry(entry);
                convertor.addEntry(e);
            }
        }
        return convertor;
    }

    @Override
    public Map<String, Object> unmarshal(MapConvertor map) throws Exception {
        Map<String, Object> result = new HashMap<String, Object>();
        if(map != null){
        	for (MapConvertor.MapEntry e : map.getEntries()) {
                result.put(e.getKey(), e.getValue());
            }
        }
        
        return result;
    }
}
