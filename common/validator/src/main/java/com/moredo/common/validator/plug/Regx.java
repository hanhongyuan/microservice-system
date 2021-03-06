package com.moredo.common.validator.plug;

/**
 * Created by ZaoSheng on 2015/5/12.
 */
public interface Regx {
	public final static String PHONE = "^1(3|4|5|6|7|8)\\d{9}$";
	public final static String TELEPHONE = "^0\\d{2,3}\\+?\\-?\\d{7,8}$";
    public final static String QQ = "^[1-9][0-9]{4,9}$";
    public final static String ZIPCODE = "^[1-9]\\d{5}$";
    public final static String SAFEPASS = "^(([A-Z]*|[a-z]*|\\d*|[-_\\~!@#\\$%\\^&\\*\\.\\(\\)\\[\\]\\{\\}<>\\?\\\\\\/\\'\\\"]*)|.{0,5})$|\\s";
    public final static String PASSWORD = "^(?!_)(?!.*?_$)[a-zA-Z0-9_]{%d,%d}$";
    public final static String CHINESE = "^[\\u4E00-\\u9FA5]{%d,%d}$";
    public final static String LOGINNAME = "^[\\u0391-\\uFFE5\\w]+$";
    public final static String DECIMAL = "([1-9][0-9]{1,%d}|0)(\\.[\\d]{0,%d})?";

}
