package jp.interlinesafety.erp.util;

import java.io.UnsupportedEncodingException;

public class ModifyFormat {
	
	public static String YYYYMMDDtoJapanese(String strYYYYMMDD) throws UnsupportedEncodingException {
		String dateString = strYYYYMMDD.substring(0, 4) + "年" 
							+ strYYYYMMDD.substring(4, 6) + "月" 
							+ strYYYYMMDD.substring(6, 8) + "日";
	    return dateString;
	}

}
