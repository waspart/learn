package com.aspart.art.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SocketTest {

	public static void main(String[] args) throws IOException {
		/*InetAddress host = InetAddress.getLocalHost();
		String ip = host.getHostAddress();
		System.out.println(ip);*/
		
		Process p = Runtime.getRuntime().exec("ping 192.168.2.107");
		BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
		String line = null;
		StringBuilder sb = new StringBuilder();
		while((line = br.readLine()) != null){
			if(line.length() != 0){
				sb.append(line + "\r\n");
			}
		}
		byte[] bsb = sb.toString().getBytes("utf-8");
		System.out.println("本次指令返回的消息：" + new String(bsb));
	}
}
