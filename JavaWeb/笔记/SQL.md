## MySQL

### 排名问题  

#### 窗口函数

rank(), dense_rank(), row_number()

<img src="C:\Users\10938\AppData\Roaming\Typora\typora-user-images\1608271416275.png" alt="1608271416275" style="zoom:67%;" />

1）rank函数：如果有并列名次的行，会占用下一名次的位置。

2）dense_rank函数：如果有并列名次的行，不占用下一名次的位置。

3）row_number函数：不考虑并列名次的情况。

例如： 

```mysql
select *, dense_rank() over (order by 成绩 desc) as dese_rank from 班级 

```



## SQL Server

sql server 字符串转成日期格式

```html
https://www.cnblogs.com/keepdoit/p/11769659.html
```

查询条件区分大小写

```sql
SELECT * FROM T1
WHERE name LIKE 'A%' 
COLLATE Chinese_PRC_CI_AS; --不区分大小写
COLLATE Chinese_PRC_CS_AS; --区分大小写
```



查询结果排序
select *, ROW_NUMBER() over(partition by 第一排序列 order by 第二排序列 desc) rn from &&&&
from  order



## Oracle

#### 查询所有表名

SELECT TABLE_NAME FROM USER_TABLES







查询去重
select  列名 from  表名 group by 需要去重的列名 having count(需要去重的列名) > 1;

查询表中所有的列名
select column_name from user_col_comments  where Table_Name='表名';