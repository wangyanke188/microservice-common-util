package com.zhongkexinli.micro.serv.common.util;



import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class StringUtilTest {

	@Test
	public void isNotBlankTest() {
		assertTrue(StringUtil.isNotBlank("123"));
		assertTrue(StringUtil.isNotBlank(" 123 "));
		assertTrue(StringUtil.isNotBlank(" 123"));
		assertTrue(StringUtil.isNotBlank("123 "));
	}

}