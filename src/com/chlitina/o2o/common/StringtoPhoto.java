package com.chlitina.o2o.common;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

import sun.misc.BASE64Encoder;
import sun.misc.BASE64Decoder;

public class StringtoPhoto {
	/**
	 * 将图片转换成转为字符�?
	 * 
	 * @param imgStr
	 * @return
	 */
	public static String getImageStr(String imgFile) {
		InputStream in = null;
		byte[] data = null;
		try {
			in = new FileInputStream(imgFile);
			data = new byte[in.available()];
			in.read(data);
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		BASE64Encoder encoder = new BASE64Encoder();
		return encoder.encode(data);
	}

	/**
	 * 将字符串转为图片
	 * 
	 * @param imgStr
	 *            ，imgFile
	 * @return
	 */
	public static boolean generateImage(String imgStr, String imgFile)
			throws Exception {
		if (imgStr == null)
			return false;
		BASE64Decoder decoder = new BASE64Decoder();
		try {
			byte[] b = decoder.decodeBuffer(imgStr);
			for (int i = 0; i < b.length; ++i) {
				if (b[i] < 0) {
					b[i] += 256;
				}
			}
			String imgFilePath = imgFile;
			OutputStream out = new FileOutputStream(imgFilePath);
			out.write(b);
			out.flush();
			out.close();
			return true;
		} catch (Exception e) {
			throw e;
		}
	}

	/**
	 * 将网络上的图片转换为字符�?
	 * 
	 * @param args
	 * @throws Exception
	 */
	public static String webImgToString(String urlP) {
		try {

			// new�?��URL对象
			URL url = new URL(urlP); // "http://img.hexun.com/2011-06-21/130726386.jpg"
			// 打开链接
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			// 设置请求方式�?GET"
			conn.setRequestMethod("GET");
			// 超时响应时间�?�?
			conn.setConnectTimeout(5 * 1000);
			// 通过输入流获取图片数�?
			InputStream inStream = conn.getInputStream();
			// 得到图片的二进制数据，以二进制封装得到数据，具有通用�?
			byte[] data = readInputStream(inStream);
			// new�?��文件对象用来保存图片，默认保存当前工程根目录
			inStream.read(data);
			inStream.close();
			BASE64Encoder encoder = new BASE64Encoder();
			return encoder.encode(data);
		} catch (Exception e) {
			return null;
		}
		/*
		 * File imageFile = new File("BeautyGirl.jpg"); //创建输出�?
		 * FileOutputStream outStream = new FileOutputStream(imageFile); //写入数据
		 * outStream.write(data); //关闭输出�? outStream.close();
		 */
	}

	public static byte[] readInputStream(InputStream inStream) throws Exception {
		ByteArrayOutputStream outStream = new ByteArrayOutputStream();
		// 创建�?��Buffer字符�?
		byte[] buffer = new byte[1024];
		// 每次读取的字符串长度，如果为-1，代表全部读取完�?
		int len = 0;
		// 使用�?��输入流从buffer里把数据读取出来
		while ((len = inStream.read(buffer)) != -1) {
			// 用输出流�?uffer里写入数据，中间参数代表从哪个位置开始读，len代表读取的长�?
			outStream.write(buffer, 0, len);
		}
		// 关闭输入�?
		inStream.close();
		// 把outStream里的数据写入内存
		return outStream.toByteArray();
	}

	public static InputStream webImgToString1(String urlP) {
		try {

			// new�?��URL对象
			URL url = new URL(urlP); // "http://img.hexun.com/2011-06-21/130726386.jpg"
			// 打开链接
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			// 设置请求方式�?GET"
			conn.setRequestMethod("GET");
			// 超时响应时间�?�?
			conn.setConnectTimeout(5 * 1000);
			// 通过输入流获取图片数�?
			InputStream inStream = conn.getInputStream();
			// 得到图片的二进制数据，以二进制封装得到数据，具有通用�?
			/*
			 * byte[] data = readInputStream(inStream);
			 * //new�?��文件对象用来保存图片，默认保存当前工程根目录 inStream.read(data);
			 * inStream.close(); BASE64Encoder encoder = new BASE64Encoder();
			 * return encoder.encode(data);
			 */
			return inStream;
		} catch (Exception e) {
			return null;
		}
		/*
		 * File imageFile = new File("BeautyGirl.jpg"); //创建输出�?
		 * FileOutputStream outStream = new FileOutputStream(imageFile); //写入数据
		 * outStream.write(data); //关闭输出�? outStream.close();
		 */
	}

	public static void main(String args[]) {
		String strphoto = StringtoPhoto
				.webImgToString("http://img.hexun.com/2011-06-21/130726386.jpg");

		try {
			boolean bolflg = StringtoPhoto.generateImage(strphoto,
					"D:\\aaa.jpg");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// System.out.print(strphoto);

	}

}
