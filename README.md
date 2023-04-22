# BookManagerForConsole - 基于控制台的图书管理系统
## 这是Java学习中的第二个实战项目！
学的是JavaWeb，为SpringCloud做铺垫。

[参考教学链接](https://www.bilibili.com/video/BV1CL4y1i7qR?p=56)

**SQL**模块是所有SQL相关的东西...emmm或许应该考虑把Sql模块分拆到其他模块中才对
**Author**模块是书籍的作者信息...
**Book**模块是书籍的信息...
**User**模块是用户的信息，用户可以借阅书籍
**Manager**模块是用户用来管理书籍借阅的管理器系统

SQL模块下放了3个基于Sqlite的数据库。之所以选择这个数据库是因为分享方便，当然，他跟视频里所教的MySQL有不少地方不一样，需要仔细百度
**dev.db**是开发模式下所用的数据库
**release.db**是发布模式下所用的数据库
**test.db**是测试模式下所用的数据库
emmmm好像测试数据库和开发数据库可以合并....毕竟现在只有我一个人开发，如果你们是团队开发，有专门测试的话，可以留着
