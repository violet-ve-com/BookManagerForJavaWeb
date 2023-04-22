package com.violet_ve.mapper;

import java.util.Date;

import com.violet_ve.*;
import org.apache.ibatis.annotations.Select;

public interface QueryMapper {

    /**
     * 根据ID查询作者
     * @param AuthorId 作者Id
     * @return 作者类
     */
    @Select("")
    Author QueryAuthorByAuthorId(Integer AuthorId);

    /**
     * 根据书籍查询对应的作者
     * @param BookId 书籍Id
     * @return 这本书有哪些作者
     */
    @Select("")
    Author[] QueryAuthorsByBookId(Integer BookId);

    /**
     * 如果想看下有哪些漂亮妹子或者秃头大佬，可以用这个筛选性别
     * @param Sex 作者性别
     * @return 这个性别的作者有哪些
     */
    @Select("")
    Author[] QueryAuthorsBySex(String Sex);

    /**
     * 根据书籍名称查询书籍信息，因为书籍名称也是唯一的....
     * @param Name 书籍名称
     * @return 书籍信息
     */
    @Select("")
    Book QueryBookByName(String Name);

    /**
     * 根据作者ID查询书籍信息
     * @param AuthorId 作者ID
     * @return 此作者可以借阅的所有书籍
     */
    @Select("")
    Book[] QueryBooksByAuthorId(Integer AuthorId);

    /**
     * 根据ISBN查询书籍信息，因为ISBN是唯一的
     * @param ISBN 书籍ISBN
     * @return 书籍信息
     */
    @Select("")
    Book QueryBookByISBN(String ISBN);

    /**
     * 根据分类查询书籍，此处使用模糊查询like，因为同个分类有很多书籍
     * @param Category 书籍分类
     * @return 执行结果
     */
    @Select("")
    Book[] QueryBooksByCategory(String Category);

    /**
     * 查询被某个用户的出借信息
     * @param InUser 需要查询的用户
     * @return 返回值是出借信息
     */
    @Select("")
    BorrowInfo[] QueryBorrowsByUser(User InUser);

    /**
     * 查询还有库存的书籍
     * @return 查到的书籍信息
     */
    @Select("")
    Book[] QueryBooksHasStock();

    /**
     * 查询目前还有在外借的书籍
     * @return 查到的书籍信息
     */
    @Select("")
    Book[] QueryBooksHasLoans();

    /**
     * 查询位于价格区间的书籍
     * @param MinPrice 最小价格
     * @param MaxPrice 最大价格
     * @return 查到的书籍信息
     */
    @Select("")
    Book[] QueryBooksByPriceRange(Float MinPrice,Float MaxPrice);

    /**
     * 查询某个用户在某个时间借阅的所有书籍
     * @param Time 借阅时间
     * @param UserId 作者ID
     * @return 查到的书籍信息
     */
    @Select("")
    Book[] QueryBooksByUserAndTime(Integer UserId,Date Time);

    /**
     * 查询一个用户有归还过的书籍
     * @param UserId 作者ID
     * @return 查到的书籍信息
     */
    @Select("")
    Book[] QueryBooksByUserAndReturn(Integer UserId);

    /**
     * 查询该用户有哪些书籍没有归还
     * @param UserId 作者ID
     * @return 查到的书籍信息
     */
    @Select("")
    Book[] QueryBooksByUserAndNoReturn(Integer UserId);

    /**
     * 查询所有在那个时间点借出去的书籍
     * @param Time 借阅时间
     * @return 执行结果
     */
    @Select("")
    Book[] QueryBooksByTime(Date Time);

    /**
     * 根据名称查询用户信息
     * @param Name 用户名称
     * @return 用户信息
     */
    @Select("")
    User[] QueryUsersByName(String Name);

    /**
     * 查询所有来借书的小姐姐或者壮汉
     * @param Sex 用户性别
     * @return 查到的用户信息
     */
    @Select("")
    User[] QueryUsersBySex(String Sex);

    /**
     * 查询有借过书的用户
     * @return 查询到的所有用户信息
     */
    @Select("")
    User[] QueryUsersHasBorrow();

    /**
     * 查询没有借过书或者全部还清了的用户
     * @return 查询到的所有用户信息
     */
    @Select("")
    User[] QueryUsersNoBorrow();

    /**
     * 查询所有用户
     * @return 所有的用户信息
     */
    @Select("")
    User[] QueryAllUsers();

    /**
     * 查询所有书籍
     * @return 所有的书籍信息
     */
    @Select("")
    Book[] QueryAllBooks();

    /**
     * 查询所有作者
     * @return 所有的作者信息
     */
    @Select("")
    Author[] QueryAllAuthors();
}
