package com.mrxc.jvm;

import java.util.ArrayList;

import org.junit.Test;

public class JVMTest {
	@Test
	public void test01() {
		//得到的单位是字节
		/*System.out.println("最大堆内存上限"+Runtime.getRuntime().maxMemory()/1024.0 / 1024 + "M");
		System.out.println("默认堆内存"+Runtime.getRuntime().totalMemory()/1024.0 / 1024 + "M");
		System.out.println("空闲内存量"+Runtime.getRuntime().freeMemory()/1024.0 / 1024 + "M");
		System.out.println("处理器个数"+Runtime.getRuntime().availableProcessors());
		*/
		
		
		//Byte b1[] = new Byte[100*1024*1024];
		ArrayList<Byte[]> arrayList = new ArrayList<>();
		while(true) {
			Byte[] b1 = new Byte[10*1024];
			arrayList.add(b1);
		}
	
	}
}

