package com.sh.sale.common.util;

public class StringUtils {

	public static boolean isEmpty(String str) {
		if(str == null || str.trim() == "")
			return true;
		return false;
	}
}
