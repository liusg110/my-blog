package com.xy.blog.utils;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

/**
 * @author xiaoyao
 * @ClassName: ${type_name}
 * @Description: ${todo}(这里用一句话描述这个类的作用)
 * @date ${date} ${time}
 * ${tags}
 */
public class Test3 {
    public static void main(String[] args) {
        String s11 = "the sky is blue      ";
        String[] s = s11.split(" ");
        for(int i=0;i<s.length;i++) {
            System.out.println(s[i]+",");

        }

        Map<String,String> map=new HashMap<>(13);
        map.put("1","3");
        for(int m=0;m<s.length-1;m++){
            for(int n=0;n<s.length-1-m;n++){
                if(true){
                    String emp=s[n+1];
                    s[n+1]=s[n];
                    s[n]=emp;
                }
            }
        }

/*        for(int m=0;m<s.length-1;m++){
            for(int n=m+1;n<s.length;n++){
                if(true){
                    String emp=s[n];
                    s[n]=s[m];
                    s[m]=emp;
                }
            }
        }*/

        for(int i=0;i<s.length;i++) {
            System.out.println(s[i]+",");

        }
        /*if (s. || s.length == 1 || s.find(" ") == -1)
            return s;


        string s0;

        int i = s.size() - 1;//i表示每个单词的开头
        int j = s.size() - 1;//j表示每个单词的结尾

        //如果最后一个字符是空格，那么删除
        while (s[i] == ' ') {
            i--;
            j--;
        }

        while (i >= 0 && j >= 0) {
            //没有遇到空格，那么是单词的一部分，i继续向前移
            if (s[i] != ' ' && i > 0)
                i--;
                //i指向空格
            else if (i == 0) {
                s0.insert(s0.size(), s, i, j - i + 1);
                break;
            } else {
                //首先需要将i到j的单词复制给s0，
                s0.insert(s0.size(), s, i + 1, j - i + 1);
                //然后需要判断是否有连续多个空格
                i--;
                while (i >= 0 && s[i] == ' ')
                    i--;

                if (i >= 0) {
                    s0.append(" ");
                    j = i;
                } else {
                    j = i;
                    break;
                }
            }

        }*/

    }


}
