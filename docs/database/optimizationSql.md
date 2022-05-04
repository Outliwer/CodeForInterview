## 对于发现的慢SQL进行优化
* `sql`中的`limit`
* 治理的优先级
    *  `master`数据库 > `slave`数据库
    
    *  执行次数多的`SQL`优先治理
    *  如果一类`SQL`高并发集中访问某一张表，优先治理
* 影响因素：
    * 数据量
        * 适当合并多个查询子句来实现合并`IO`的目的
        
        * 使用分布式数据库的方式来进行数据和`I/O`分散
    * 取数据的方式：使用**缓存**
    * 数据加工的方式
* 优化方向：
    * 索引：
        * 复合索引
        * 索引的大小：`InnoDB`一个`page`的默认大小是`16k`  
        
        * 防止退变成链表（至少`2`个）：存在辅助索引的二次变换以及预留空间等：取整（`1024*3`）
        * `innodb_large_prefix`：结合一下`UTF-8`的字节数
        
        * 避免索引的隐式转换：即出现**索引失效**的场景

    * 数据库字段长度：使用合适的字段长度可以减少`I/O`量
    * 使用`join`替代`in`
        * 可以防止`in`对数据进行了加工，产生临时表
* 相关语令
    *   `show variables like 'log_slow_queries'`
        *  慢`SQL`日志 
        
    *   `show variables like 'long_query_time'`
        *  执行时间超过多少秒的`SQL`  
        
    * `log_queries_not_using_indexes` 
        * 没有使用过的索引
        

    * 相关使用方法
             
        
        ```
        log-slow-queries=/data/mysqldata/slowquery.log
        long_query_time=2
        ```


