package com.chlitina.o2o.common;

/**
 * Copyright (C) 1998-2009 TENCENT Inc.All Rights Reserved.		
 * 																	
 * FileName锛欱ase64Util.java					
 *			
 * Description锛歜ase64缂栫爜瑙ｇ爜宸ュ叿
 * History锛�
 *  1.0  2009-04-01        Create	
 */

import java.io.IOException;

import sun.misc.BASE64Encoder;

/**
 * base64缂栫爜瑙ｇ爜宸ュ叿
 * 
 */
public class Base64Util {
	public static void main(String[] args) {
		byte[] arrByte = new byte[1];
		arrByte[0] = 0;
		System.out.println("Dict:");
		for (byte i = 0; i < 64; i++) {
			System.out.print(String.format("%2d %c\t", i,
					Base64Util.encode(arrByte).charAt(0)));
			arrByte[0] += 4;
			if ((i + 1) % 8 == 0) {
				System.out.println("");
			}
		}
		System.out.print(Base64Util.encode("12334jjgfddgh".getBytes()));
	}

	/**
	 * 灏嗕簩杩涘埗鍐呭缂栫爜涓篵ase64瀛楃涓�
	 * 
	 * @param srcContent
	 *            闇�缂栫爜鐨勬暟鎹�
	 * @return String 缂栫爜缁撴灉銆傚鏋滃弬鏁颁负null锛屽垯杩斿洖null銆�
	 */
	public static String encode(byte[] srcContent) {
		if (srcContent == null) {
			return null;
		}
		// sun鐨勫疄鐜颁細姣�6涓瓧绗﹀悗闈㈠鍔犱竴涓洖杞︼紝闇�鍒犻櫎銆�
		return new BASE64Encoder().encode(srcContent).replace("\r\n", "");
	}

	/**
	 * 灏嗕簩杩涘埗鍐呭缂栫爜涓哄彲浠ヤ綔URL鍙傛暟鐨勫瓧绗︿覆琛�
	 * 鐢变簬榛樿base64瀛楀吀涓殑+鍜�鍦║RL鍙傛暟涓紝閮芥湁鐗规畩鐨勫惈涔夛紝闇�鍋氳浆涔� 灏�杞箟涓� 灏�杞箟涓簙
	 * 
	 * @param srcContent
	 *            闇�缂栫爜涓篣RL鍙傛暟鐨勬暟鎹�
	 * @return String 缂栫爜缁撴灉銆傚鏋滃弬鏁颁负null锛屽垯杩斿洖null銆�
	 */
	public static String encodeURLParam(byte[] srcContent) {
		return encode(srcContent).replace('+', '-').replace('=', '~');
	}

	/**
	 * 灏哹ase64瀛楃涓茶В鐮佷负婧愭暟鎹唴瀹� 涓巈ncode浜掍负鐩搁�鐨勮繃绋�
	 * 
	 * @param base64Code
	 *            base64缂栫爜瀛楃涓�
	 * @return byte[] 瑙ｇ爜缁撴灉銆傚鏋滃弬鏁颁负null鎴栬В鐮佸け璐ワ紝鍒欒繑鍥瀗ull銆�
	 */
	public static byte[] decode(String base64Code) {
		if (base64Code == null) {
			return null;
		}

		try {
			return new sun.misc.BASE64Decoder().decodeBuffer(base64Code);
		} catch (IOException exception) {
			return null;
		}
	}

	/**
	 * 灏哹ase64瀛楃涓茶В鐮佷负婧愭暟鎹唴瀹� 涓巈ncodeURLParam浜掍负鐩搁�鐨勮繃绋�
	 * 
	 * @param base64Code
	 *            base64缂栫爜瀛楃涓�
	 * @return byte[] 瑙ｇ爜缁撴灉銆傚鏋滃弬鏁颁负null鎴栬В鐮佸け璐ワ紝鍒欒繑鍥瀗ull銆�
	 */
	public static byte[] decodeURLParam(String base64Code) throws IOException {
		return decode(base64Code.replace('-', '+').replace('~', '='));
	}
}
