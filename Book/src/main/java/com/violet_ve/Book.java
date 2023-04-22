package com.violet_ve;

import lombok.Builder;
import lombok.Data;
import lombok.extern.java.Log;

// 模块没有再细分是因为会有循环依赖...
@Log
@Data
@Builder
public class Book {
    private Integer Id;
    private String Name;
    // 可以当做唯一标识...
    private String ISBN;
    private Float Price;
    private String[] Category;
    // 还剩几本
    private Integer StockNum;
    // 被借走了几本
    private Integer LoansNum;

    public void Book(String Category){
        this.Category=Category.split(",");
    }
}
