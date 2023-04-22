package com.violet_ve.mapper;

import org.apache.ibatis.annotations.Insert;

import java.util.Date;

public interface InsertMapper {

    /**
     * 插入作者
     * @param Name 作者名称
     * @param Birthday 作者生日
     * @param Sex 作者性别
     * @return 执行结果
     */
    @Insert("")
    Integer InsertAuthor(String Name, Date Birthday,String Sex);

    /**
     * 插入书籍
     * @param Name 书籍名称
     * @param ISBN 书籍的ISBN
     * @param StockNum 书籍的库存数量
     * @param Price 书籍的价格
     * @param Category 书籍的分类
     * @return 执行结果
     */
    @Insert("")
    Integer InsertBook(String Name, String ISBN,Integer StockNum,Float Price,String Category);

    /**
     * 单独插入书籍作者，如果一个书籍有多个作者，需要插入多次。之所以这样是考虑到作者的名字也应该可以修改，且可以重复
     * @param bid 书籍ID
     * @param aid 作者ID
     * @return 执行结果
     */
    @Insert("")
    Integer InsertBookAuthorById(Integer bid, Integer aid);

    /**
     * 借阅书籍，需要配合UpdateBookStockNumByUser更新库存
     * @param BookId 书籍ID
     * @param UserId 用户ID
     * @param LoansNum 借阅数量
     * @return 执行结果
     */
    @Insert("")
    Integer BorrowBooks(Integer BookId, Integer UserId,Integer LoansNum);

    /**
     * 插入用户
     * @param UserName 用户名称
     * @param Password 用户密码，加密后的
     * @param Birthday 生日
     * @param Sex 性别
     * @return 执行结果
     */
    @Insert("")
    Integer InsertUser(String UserName,String Password,String Sex,Date Birthday);
}
