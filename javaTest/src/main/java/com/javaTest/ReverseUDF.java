//题目：编写一个字符串反转的 UDF 函数
//要求：
//创建一个名为 ReverseUDF 的类，继承自 org.apache.hadoop.hive.ql.exec.UDF
//实现一个函数，接收一个字符串参数，返回其反转后的字符串
//如果输入为 null，则返回 null

package com.javaTest;
import org.apache.hadoop.hive.ql.exec.UDF;
import org.apache.hadoop.io.Text;

public class ReverseUDF extends UDF {
    public String evaluate(String input){
        if(input == null){
            return null;
        } else {
            StringBuilder sb = new StringBuilder(input);
            return sb.reverse().toString();
        }
    }
}
