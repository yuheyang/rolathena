package com.chlitina.o2o.common;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Date;

import java.security.MessageDigest;
import sun.misc.BASE64Encoder;

public class GetJsonData {

	private static String readAll(Reader rd) throws IOException {
		StringBuilder sb = new StringBuilder();
		int cp;
		while ((cp = rd.read()) != -1) {
			sb.append((char) cp);
		}
		return sb.toString();
	}


	public static Long gettime() {
		long tmptime = Date.parse(new Date().toGMTString()) / 1000;
		return tmptime;
	}

	public String getSign(String CNICK, String CMETHOD, long ltimes)
			throws UnsupportedEncodingException {

		String sformat = new String();
		sformat = "json";
		// long tmptime=Date.parse(new Date().toGMTString())/1000;
		BASE64Encoder encoder = new BASE64Encoder();
		StringBuffer tempSb = new StringBuffer();
		Md5Util md5 = new Md5Util();
		try {

			tempSb.append(encoder.encode(CNICK.getBytes("UTF-8")))
					.append(encoder.encode(CMETHOD.getBytes("UTF-8")))
					.append(encoder.encode(sformat.getBytes("UTF-8")))
					.append(encoder.encode(String.valueOf(ltimes).getBytes(
							"UTF-8")));
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return md5.makeMd5Sum(tempSb.toString().getBytes("UTF-8"));

	}

	public String getSign(String CNICK, String CMETHOD, String NAME, long ltimes)
			throws UnsupportedEncodingException {

		String sformat = new String();
		sformat = "json";
		// long tmptime=Date.parse(new Date().toGMTString())/1000;
		BASE64Encoder encoder = new BASE64Encoder();
		StringBuffer tempSb = new StringBuffer();
		Md5Util md5 = new Md5Util();
		try {

			tempSb.append(encoder.encode(CNICK.getBytes("UTF-8")))
					.append(encoder.encode(CMETHOD.getBytes("UTF-8")))
					.append(encoder.encode(sformat.getBytes("UTF-8")))
					.append(encoder.encode(NAME.getBytes("UTF-8")))
					.append(encoder.encode(String.valueOf(ltimes).getBytes(
							"UTF-8")));
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return md5.makeMd5Sum(tempSb.toString().getBytes("UTF-8"));

	}

	public String getRGSign(String CNICK, String CMETHOD, String NAME,
			long ltimes, String CORDER) throws UnsupportedEncodingException {

		String sformat = new String();
		sformat = "json";
		// long tmptime=Date.parse(new Date().toGMTString())/1000;
		BASE64Encoder encoder = new BASE64Encoder();
		StringBuffer tempSb = new StringBuffer();
		Md5Util md5 = new Md5Util();
		try {

			tempSb.append(encoder.encode(CNICK.getBytes("UTF-8")))
					.append(encoder.encode(CMETHOD.getBytes("UTF-8")))
					.append(encoder.encode(sformat.getBytes("UTF-8")))
					.append(encoder.encode(NAME.getBytes("UTF-8")))
					.append(encoder.encode(String.valueOf(ltimes).getBytes(
							"UTF-8")))
					.append(encoder.encode(CORDER.getBytes("UTF-8")));
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return md5.makeMd5Sum(tempSb.toString().getBytes("UTF-8"));

	}

}
