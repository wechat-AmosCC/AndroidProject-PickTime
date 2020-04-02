package com.amos.widget.bean;

/**
 * @Description: 枚举
 * @Author: Amos
 * @CreateDate: 2020/4/2 13:20
 * @UpdateUser: 更新者：
 * @UpdateDate: 2020/4/2 13:20
 * @UpdateRemark: 更新说明：
 * @Version: 1.0
 */
public enum DateType {

    TYPE_ALL("yyyy-MM-dd E hh:mm"),//年、月、日、星期、时、分
    TYPE_YMDHM("yyyy-MM-dd hh:mm"),//年、月、日、时、分
    TYPE_YMDH("yyyy-MM-dd hh"),//年、月、日、时
    TYPE_YMD("yyyy-MM-dd"),//年、月、日
    TYPE_HM("hh:mm");//时、分

    private String format;

    DateType(String format) {
        this.format = format;
    }

    public String getFormat() {
        return format;
    }
    
}
