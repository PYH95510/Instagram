package com.cos.photostagram.util;

//javascript, alert

public class Script {
    public static String back(String msg) {
        StringBuffer sb = new StringBuffer();
        sb.append("<script>");
        sb.append("alert('" + msg + "');");
        sb.append("</script>");
        return sb.toString();
    }
}
