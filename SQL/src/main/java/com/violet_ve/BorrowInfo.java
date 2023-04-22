package com.violet_ve;

import lombok.Builder;
import lombok.Data;
import lombok.extern.java.Log;

import java.util.Date;

/**
 * 谁在什么时候借了什么书，分别借了几本
 * 只要加了这个类，就不会有循环依赖了！
 */
@Builder
@Log
@Data
public class BorrowInfo {
    private User user;
    private Book book;
    private Date time;
    private Integer num;
    private Boolean isReturn;
}