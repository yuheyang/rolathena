package com.chlitina.o2o.common;

/**
 * Copyright (C) 1998-2009 TENCENT Inc.All Rights Reserved.		
 *
 * FileName��MD5Util.java
 *
 * Description��MD5У������ɹ���
 * History��
 *  1.0    hokyhu   2009-04-01        Create
 */

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * MD5У������ɹ���
 * 
 */
public class Md5Util {
	/**
	 * ���md5У����
	 * 
	 * @param srcContent
	 *            ��Ҫ���ܵ����
	 * @return ���ܺ��md5У���롣�����򷵻�null��
	 */
	public static String makeMd5Sum(byte[] srcContent) {
		if (srcContent == null) {
			return null;
		}

		String strDes = null;

		try {
			MessageDigest md5 = MessageDigest.getInstance("MD5");
			md5.update(srcContent);
			strDes = bytes2Hex(md5.digest()); // to HexString
		} catch (NoSuchAlgorithmException e) {
			return null;
		}
		return strDes;
	}

	private static String bytes2Hex(byte[] byteArray) {
		StringBuffer strBuf = new StringBuffer();
		for (int i = 0; i < byteArray.length; i++) {
			if (byteArray[i] >= 0 && byteArray[i] < 16) {
				strBuf.append("0");
			}
			strBuf.append(Integer.toHexString(byteArray[i] & 0xFF));
		}
		return strBuf.toString();
	}

	public static void main(String[] args) {
		System.out.println(Md5Util.makeMd5Sum("adddsfdssf".getBytes()));
	}
}
