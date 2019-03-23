package com.xy.blog.domain.vo;

/**
 * @author xiaoyao
 * @ClassName: ${type_name}
 * @Description: ${todo}(这里用一句话描述这个类的作用)
 * @date ${date} ${time}
 * ${tags}
 */
public class AddFistReq {

    private String realName;

    private String idNum;

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getIdNum() {
        return idNum;
    }

    public void setIdNum(String idNum) {
        this.idNum = idNum;
    }

    @Override
    public String toString() {
        return "addFistReq{" +
                "realName='" + realName + '\'' +
                ", idNum='" + idNum + '\'' +
                '}';
    }
}
