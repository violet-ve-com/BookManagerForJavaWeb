package com.violet_ve.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;

import java.util.Date;

import com.violet_ve.*;

public interface DeleteMapper {

    /**
     * 根据作者ID删除作者，此时应该连带书籍一块删除，并且应该删除书籍和作者的关联数据
     * @param AuthorId 作者ID
     * @return 执行结果
     */
    @Delete("")
    Integer DeleteAuthorByAuthorId(Integer AuthorId);

    /**
     * 删除全部作者，此时应该把除了用户表都删除
     * @return 执行结果
     */
    @Delete("")
    Integer DeleteAllAuthors();

    /**
     * 删除出生日期在此之前的作者，此时应该连带书籍一块删除，并且应该删除书籍和作者的关联数据
     * @param Time 日期
     * @return 执行结果
     */
    @Delete("")
    Integer DeleteAuthorsByLesserDate(Date Time);

    /**
     * 删除出生日期在此之后的作者，此时应该连带书籍一块删除，并且应该删除书籍和作者的关联数据
     * @param Time 日期
     * @return 执行结果
     */
    @Delete("")
    Integer DeleteAuthorsByGreaterDate(Date Time);

    /**
     * 根据出生日期范围来删除作者，此时应该连带书籍一块删除，并且应该删除书籍和作者的关联数据
     * @param MinTime 最小日期
     * @param MaxTime 最大日期
     * @return 执行结果
     */
    @Delete("")
    Integer DeleteAuthorsByDateRange(Date MinTime,Date MaxTime);

    /**
     * 根据书籍ID删除书籍，此时应该删除和作者的关联信息，而不删除作者，因为作者做为独立的个体是可以不写书或没有引进书籍的，并且应该删除借阅信息
     * @param BookId 书籍ID
     * @return 执行结果
     */
    @Delete("")
    Integer DeleteBookByBookId(Integer BookId);

    /**
     * 根据书籍名称删除书籍，此时应该删除和作者的关联信息，而不删除作者，因为作者做为独立的个体是可以不写书或没有引进书籍的，并且应该删除借阅信息
     * @param Name 书籍名称
     * @return 执行结果
     */
    @Delete("")
    Integer DeleteBookByName(String Name);

    /**
     * 根据作者ID批量删除书籍，此时应该删除和作者的关联信息，而不删除作者，因为作者做为独立的个体是可以不写书或没有引进书籍的，并且应该删除借阅信息
     * @param AuthorId 作者ID
     * @return 执行结果
     */
    @Delete("")
    Integer DeleteBooksByAuthorId(Integer AuthorId);

    /**
     * 根据书籍ISBN删除书籍，此时应该删除和作者的关联信息，而不删除作者，因为作者做为独立的个体是可以不写书或没有引进书籍的，并且应该删除借阅信息
     * @param ISBN 书籍ISBN
     * @return 执行结果
     */
    @Delete("")
    Integer DeleteBookByISBN(String ISBN);

    /**
     * 删除所有没有库存的书籍
     * @return 执行结果
     */
    @Delete("")
    Integer DeleteBooksNoStock();

    /**
     * 删除库存数量比这少的书籍，此时应该删除和作者的关联信息，而不删除作者，因为作者做为独立的个体是可以不写书或没有引进书籍的，并且应该删除借阅信息
     * @param Stock 库存数量
     * @return 执行结果
     */
    @Delete("")
    Integer DeleteBooksByLesserStock(Integer Stock);

    /**
     * 删除库存数量比这多的书籍，此时应该删除和作者的关联信息，而不删除作者，因为作者做为独立的个体是可以不写书或没有引进书籍的，并且应该删除借阅信息
     * @param Stock 库存数量
     * @return 执行结果
     */
    @Delete("")
    Integer DeleteBooksByGreaterStock(Integer Stock);

    /**
     * 根据库存数量范围删除书籍，此时应该删除和作者的关联信息，而不删除作者，因为作者做为独立的个体是可以不写书或没有引进书籍的，并且应该删除借阅信息
     * @param MinStock 最少库存数量
     * @param MaxStock 最多库存数量
     * @return 执行结果
     */
    @Delete("")
    Integer DeleteBooksByStockRange(Integer MinStock,Integer MaxStock);

    /**
     * 删除出借数量比这少的书籍，此时应该删除和作者的关联信息，而不删除作者，因为作者做为独立的个体是可以不写书或没有引进书籍的，并且应该删除借阅信息
     * @param Loans 出借数量
     * @return 执行结果
     */
    @Delete("")
    Integer DeleteBooksByLesserLoans(Integer Loans);

    /**
     * 删除出借数量比这多的书籍，此时应该删除和作者的关联信息，而不删除作者，因为作者做为独立的个体是可以不写书或没有引进书籍的，并且应该删除借阅信息
     * @param Loans 出借数量
     * @return 执行结果
     */
    @Delete("")
    Integer DeleteBooksByGreaterLoans(Integer Loans);

    /**
     * 根据出借数量范围删除书籍，此时应该删除和作者的关联信息，而不删除作者，因为作者做为独立的个体是可以不写书或没有引进书籍的，并且应该删除借阅信息
     * @param MinLoans 最少出借数量
     * @param MaxLoans 最多出借数量
     * @return 执行结果
     */
    @Delete("")
    Integer DeleteBooksByLoansRange(Integer MinLoans,Integer MaxLoans);

    /**
     * 删除价格比这低的书籍，此时应该删除和作者的关联信息，而不删除作者，因为作者做为独立的个体是可以不写书或没有引进书籍的，并且应该删除借阅信息
     * @param Price 价格
     * @return 执行结果
     */
    @Delete("")
    Integer DeleteBooksByLesserPrice(Float Price);

    /**
     * 删除价格比这高的书籍，此时应该删除和作者的关联信息，而不删除作者，因为作者做为独立的个体是可以不写书或没有引进书籍的，并且应该删除借阅信息
     * @param Price 价格
     * @return 执行结果
     */
    @Delete("")
    Integer DeleteBooksByGreaterPrice(Float Price);

    /**
     * 根据价格范围删除书籍，此时应该删除和作者的关联信息，而不删除作者，因为作者做为独立的个体是可以不写书或没有引进书籍的，并且应该删除借阅信息
     * @param MinPrice 最少价格
     * @param MaxPrice 最多价格
     * @return 执行结果
     */
    @Delete("")
    Integer DeleteBooksByPriceRange(Float MinPrice,Float MaxPrice);

    /**
     * 根据分类批量删除书籍，此时应该删除和作者的关联信息，而不删除作者，因为作者做为独立的个体是可以不写书或没有引进书籍的，并且应该删除借阅信息
     * @param Category 书籍分类，使用like模糊查询
     * @return 执行结果
     */
    @Delete("")
    Integer DeleteBooksByCategory(String Category);

    /**
     * 删除所有书籍，此时应该删除和作者的关联，并且应该删除借阅信息
     * @return 执行结果
     */
    @Delete("")
    Integer DeleteAllBooks();

    /**
     * 删除所有用户，此时所有借阅信息应该一并删除
     * @return 执行结果
     */
    @Delete("")
    Integer DeleteAllUsers();

    /**
     * 根据用户ID删除用户，此时应该连带借阅信息一块删除
     * @param Id 用户ID
     * @return 执行结果
     */
    @Delete("")
    Integer DeleteUserById(Integer Id);

    /**
     * 根据性别删除用户，此时应该连带借阅信息一块删除
     * @param Sex 用户性别
     * @return 执行结果
     */
    @Delete("")
    Integer DeleteUsersBySex(String Sex);

    /**
     * 根据用户名称删除用户，此时应该连带借阅信息一块删除
     * @param Name 用户名称
     * @return 执行结果
     */
    @Delete("")
    Integer DeleteUserByName(String Name);

    /**
     * 删除出生日期比这早的用户，此时应该连带借阅信息一块删除
     * @param Time 出生日期
     * @return 执行结果
     */
    @Delete("")
    Integer DeleteUsersByLesserBirthDate(Date Time);

    /**
     * 删除出生日期比这晚的用户，此时应该连带借阅信息一块删除
     * @param Time 出生日期
     * @return 执行结果
     */
    @Delete("")
    Integer DeleteUsersByGreaterBirthDate(Date Time);

    /**
     * 根据出生日期范围删除用户，此时应该连带借阅信息一块删除
     * @param MinTime 最小出生日期
     * @param MaxTime 最大出生日期
     * @return 执行结果
     */
    @Delete("")
    Integer DeleteUsersByBirthDateRange(Date MinTime,Date MaxTime);

    /**
     * 删除所有有借过书的用户，此时应该连带借阅信息一块删除
     * @return 执行结果
     */
    @Delete("")
    Integer DeleteUsersHasBorrow();

    /**
     * 根据所有没有借过书的用户，此时应该连带借阅信息一块删除
     * @return 执行结果
     */
    @Delete("")
    Integer DeleteUsersNoBorrow();

    /**
     * 删除借阅日期比这早的用户，此时应该连带借阅信息一块删除
     * @param Time 借阅日期
     * @return 执行结果
     */
    @Delete("")
    Integer DeleteUsersByLesserBorrowDate(Date Time);

    /**
     * 删除借阅日期比这晚的用户，此时应该连带借阅信息一块删除
     * @param Time 借阅日期
     * @return 执行结果
     */
    @Delete("")
    Integer DeleteUsersByGreaterBorrowDate(Date Time);


    /**
     * 根据借阅日期范围删除用户，此时应该连带借阅信息一块删除
     * @param MinTime 最小借阅日期
     * @param MaxTime 最大借阅日期
     * @return 执行结果
     */
    @Delete("")
    Integer DeleteUsersByBorrowDateRange(Date MinTime,Date MaxTime);

    /**
     * 删除单本书借阅数量比这少的用户，此时应该连带借阅信息一块删除
     * @param BorrowNum 单本书借阅数量
     * @return 执行结果
     */
    @Delete("")
    Integer DeleteUsersByLesserForOneBookBorrowNum(Integer BorrowNum);

    /**
     * 删除单本书借阅数量比这多的用户，此时应该连带借阅信息一块删除
     * @param BorrowNum 单本书借阅数量
     * @return 执行结果
     */
    @Delete("")
    Integer DeleteUsersByGreaterForOneBookBorrowNum(Integer BorrowNum);

    /**
     * 根据借阅数量范围删除用户，此时应该连带借阅信息一块删除
     * @param MinBorrowNum 单本书最少借阅数量
     * @param MaxBorrowNum 单本书最多借阅数量
     * @return 执行结果
     */
    @Delete("")
    Integer DeleteUsersByOneBookBorrowNumRange(Integer MinBorrowNum,Integer MaxBorrowNum);

    /**
     * 删除总借阅数量比这少的用户，此时应该连带借阅信息一块删除
     * @param BorrowNum 总借阅数量
     * @return 执行结果
     */
    @Delete("")
    Integer DeleteUsersByLesserForAllBooksBorrowNum(Integer BorrowNum);

    /**
     * 删除总借阅数量比这多的用户，此时应该连带借阅信息一块删除
     * @param BorrowNum 总借阅数量
     * @return 执行结果
     */
    @Delete("")
    Integer DeleteUsersByGreaterForAllBooksBorrowNum(Integer BorrowNum);

    /**
     * 根据总借阅数量范围删除用户，此时应该连带借阅信息一块删除
     * @param MinBorrowNum 最少总借阅数量
     * @param MaxBorrowNum 最多总借阅数量
     * @return 执行结果
     */
    @Delete("")
    Integer DeleteUsersByAllBooksBorrowNumRange(Integer MinBorrowNum,Integer MaxBorrowNum);

    /**
     * 删除单本书归还数量比这少的用户，此时应该连带借阅信息一块删除，需要使用ReturnBookByUser更新库存
     * @param ReturnNum 单本书归还数量
     * @return 执行结果
     */
    @Delete("")
    Integer DeleteUsersByLesserForOneBookReturnNum(Integer ReturnNum);

    /**
     * 删除单本书归还数量比这多的用户，此时应该连带借阅信息一块删除，需要使用ReturnBookByUser更新库存
     * @param ReturnNum 单本书归还数量
     * @return 执行结果
     */
    @Delete("")
    Integer DeleteUsersByGreaterForOneBookReturnNum(Integer ReturnNum);

    /**
     * 根据单本书归还数量范围删除用户，此时应该连带借阅信息一块删除，需要使用ReturnBookByUser更新库存
     * @param MinReturnNum 最少单本书归还数量
     * @param MaxReturnNum 最多单本书归还数量
     * @return 执行结果
     */
    @Delete("")
    Integer DeleteUsersByOneBookReturnNumRange(Integer MinReturnNum,Integer MaxReturnNum);

    /**
     * 删除总归还数量比这少的用户，此时应该连带借阅信息一块删除，需要使用ReturnBookByUser更新库存
     * @param ReturnNum 总归还数量
     * @return 执行结果
     */
    @Delete("")
    Integer DeleteUsersByLesserForAllBooksReturnNum(Integer ReturnNum);

    /**
     * 删除总归还数量比这多的用户，此时应该连带借阅信息一块删除，需要使用ReturnBookByUser更新库存
     * @param ReturnNum 总归还数量
     * @return 执行结果
     */
    @Delete("")
    Integer DeleteUsersByGreaterForAllBooksReturnNum(Integer ReturnNum);

    /**
     * 根据总归还数量范围删除用户，此时应该连带借阅信息一块删除，需要使用ReturnBookByUser更新库存
     * @param MinReturnNum 最少总归还数量
     * @param MaxReturnNum 最多总归还数量
     * @return 执行结果
     */
    @Delete("")
    Integer DeleteUsersByAllBooksReturnNumRange(Integer MinReturnNum,Integer MaxReturnNum);
}
