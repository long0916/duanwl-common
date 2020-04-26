package com.duanwl.common.utils;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class StreamUtilTest {
	
	
	@Test
	public void testCloseAll() {
			
	}

	@Test
	public void testReadTextFileInputStream() throws FileNotFoundException {
		
		String path ="C:\\Users\\charles\\Desktop\\1801e.txt";
		
		String string = StreamUtil.readTextFile(new FileInputStream(path));
		System.out.println(string);
	}

	@Test
	public void testReadTextFileFile() {
		String path ="C:\\Users\\charles\\Desktop\\1801e.txt";
		String file = StreamUtil.readTextFile(new File(path));
		System.out.println(file);
		
	}
	
	
	@Test
	public void testReadText2List() {
		String path ="C:\\Users\\charles\\Desktop\\1801e.txt";
		List<String> list = StreamUtil.readTextFile2List(new File(path));
		for (String string : list) {
			System.out.println(string);
		}
	}

}
