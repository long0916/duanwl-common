package com.duanwl.common.utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;

import org.junit.Test;

public class StreamUtilTest {

	@Test
	public void testCloseAll() {
		
	}

	@Test
	public void testReadTextFileInputStream() throws Exception {
		String path="D:\\SSM\\1801e.txt";
		
		String string=StreamUtil.readTextFile(new FileInputStream(path));
		System.out.println(string);
	}

	@Test
	public void testReadTextFileFile() {
		String path="D:\\SSM\\1801e.txt";
		
		String file = StreamUtil.readTextFile(new File(path));
		System.out.println(file);
	}

	@Test
	public void testReadTextFile2List() {
		String path="D:\\SSM\\1801e.txt";
		List<String> list = StreamUtil.readTextFile2List(new File(path));
		for (String string : list) {
			System.out.println(string);
		}
	}

}
