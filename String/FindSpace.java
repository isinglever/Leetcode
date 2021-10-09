public class FindSpace {
    public String replaceSpace(String s) {
        s.replaceAll(" ", "%20");
        return s;
    }
}

class Solution {
    public String replaceSpace(String s) {
        StringBuilder res = new StringBuilder();
        for(Character c : s.toCharArray())
        {
            if(c == ' ') res.append("%20");
            else res.append(c);
        }
        return res.toString();
    }
}
//在 Python 和 Java 等语言中，字符串都被设计成「不可变」的类型，即无法直接修改字符串的某一位字符，需要新建一个字符串实现。

//https://leetcode-cn.com/problems/ti-huan-kong-ge-lcof/