package com.violet_ve.mapper;

import org.apache.ibatis.annotations.Insert;

import java.util.Date;
import java.util.Map;

import com.violet_ve.*;
import org.apache.ibatis.annotations.Update;

public interface UpdateMapper {

    /**
     * 根据ID更新作者的生日
     * @param id 作者的ID，是数据库的主键，不是界面上显示的那个
     * @param Birthday 作者的生日
     * @return 执行结果
     */
    @Update("")
    Integer UpdateAuthorBirthdayById(Integer id, Date Birthday);

    /**
     * 根据ID更新作者的名称
     * @param id 作者的ID，是数据库的主键，不是界面上显示的那个
     * @param Name 作者的名称
     * @return 执行结果
     */
    @Update("")
    Integer UpdateAuthorNameById(Integer id, String Name);

    /**
     * 根据ID更新作者的性别
     * @param id 作者的ID，是数据库的主键，不是界面上显示的那个
     * @param Sex 作者的性别
     * @return 执行结果
     */
    @Update("")
    Integer UpdateAuthorSexById(Integer id, String Sex);

    /**
     * 根据ID更新书籍的ISBN
     * @param id 书籍的ID，是数据库的主键，不是界面上显示的那个
     * @param ISBN 书籍的ISBN
     * @return 执行结果
     */
    @Update("")
    Integer UpdateBookISBNById(Integer id, String ISBN);

    /**
     * 根据ID更新书籍的名称
     * @param id 书籍的ID，是数据库的主键，不是界面上显示的那个
     * @param Name 书籍的名称
     * @return 执行结果
     */
    @Update("")
    Integer UpdateBookNameById(Integer id, String Name);

    /**
     * 根据ID更新书籍的价格
     * @param id 书籍的ID，是数据库的主键，不是界面上显示的那个
     * @param Price 书籍的价格
     * @return 执行结果
     */
    @Update("")
    Integer UpdateBookPriceById(Integer id, Float Price);

    /**
     * 根据ID更新书籍的分类
     * @param id 书籍的ID，是数据库的主键，不是界面上显示的那个
     * @param Category 书籍的分类，需要先用原本的分类进行重新拼接...在Book类中已经进行了数组的划分
     * @return 执行结果
     */
    @Update("")
    Integer UpdateBookCategoryById(Integer id, String Category);

    /**
     * 根据书籍ID更新书籍的作者
     * @param uid 书籍的ID，是数据库的主键，不是界面上显示的那个
     * @param aid 作者的ID
     * @return 执行结果
     */
    @Update("")
    Integer UpdateBookAuthorByBookId(Integer uid, Integer aid);

    /**
     * 根据作者ID更新书籍的作者
     * @param uid 书籍的ID，是数据库的主键，不是界面上显示的那个
     * @param aid 作者的ID
     * @return 执行结果
     */
    @Update("")
    Integer UpdateBookAuthorByAuthorId(Integer aid, Integer uid);

    /**
     * 根据ID更新用户的名称
     * @param id 用户的ID，是数据库的主键，不是界面上显示的那个
     * @param Name 用户的名称
     * @return 执行结果
     */
    @Update("")
    Integer UpdateUserNameById(Integer id, String Name);

    /**
     * 根据ID更新用户的生日
     * @param id 用户的ID，是数据库的主键，不是界面上显示的那个
     * @param Pwd 用户的密码，加密后给到接口
     * @return 执行结果
     */
    @Update("")
    Integer UpdateUserPwdById(Integer id, String Pwd);

    /**
     * 根据ID更新用户的性别
     * @param id 用户的ID，是数据库的主键，不是界面上显示的那个
     * @param Sex 用户的性别
     * @return 执行结果
     */
    @Update("")
    Integer UpdateUserSexById(Integer id, String Sex);

    /**
     * 根据ID更新用户的生日
     * @param id 用户的ID，是数据库的主键，不是界面上显示的那个
     * @param Birthday 用户的生日
     * @return 执行结果
     */
    @Update("")
    Integer UpdateUserBirthdayById(Integer id, Date Birthday);

    /**
     * 借了书之后更新一下库存
     * @param BooksId 想借的书的ID
     * @param LoansNum 借阅数量
     * @param StockNum 借阅之后库存的数量，免去计算
     * @return 返回执行结果
     */
    @Update("")
    Integer UpdateBookStockNumByUser(Integer BooksId, Integer StockNum,Integer LoansNum);

    /**
     * 谁想还哪几本书，分别还几本。因为数据库是一对一的，所以要同时还多本需要插入多次....
     * @param BooksId 要还的书的ID
     * @param UserId 借阅者的ID
     * @param ReturnNum 归还数量
     * @param StockNum 归还之后库存的数量，免去计算
     * @return 返回执行结果
     */
    @Update("")
    Integer ReturnBookByUser(Integer BooksId, Integer UserId,Integer ReturnNum,Integer StockNum);
}
