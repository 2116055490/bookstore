package edu.xcdq.beans;

import java.util.List;

public class Page<T> {
    private List<T> list; // 每页查到的记录存放的集合
    public static final int PAGE_SIZE = 4; // 每页显示的记录数
    private int pageNo; // 当前页
   // private int totalPageNo; // 总页数, 通过计算得到
    private int totalRecord; // 总记录数, 通过查询数据库得到
}
