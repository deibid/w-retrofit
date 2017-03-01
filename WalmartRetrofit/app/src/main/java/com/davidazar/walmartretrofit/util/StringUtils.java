package com.davidazar.walmartretrofit.util;

import java.io.UnsupportedEncodingException;

/**
 * Created by David on 28/02/17.
 */

public class StringUtils {


    public static final String getTimestamp() {
        return String.valueOf(System.currentTimeMillis() * 1000l);
    }



    public static String formatStringToUnicode(String string){

        try {
            byte[] bytes = string.getBytes("UTF-8");
            return new String(bytes, "UTF-8");
        }catch (UnsupportedEncodingException use){
            use.printStackTrace();
            return null;
        }
    }


}
