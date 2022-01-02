## Git操作

### Win

```pro
检查是否与 GitHub 绑定成功：ssh -T git@github.com
配置文件：git config --global user.name "Harry-wh"
	 git config --global user.email "1093876434@qq.com"
克隆库至当前文件夹：git clone 地址
（Github地址：https://github.com/Harry-wh/test.git
（https://gitee.com/harry-wh/bc2.git

上传：git add ./文件名（.表示所有文件）
          git commit -a -m "备注"（-m：输入提交信息；-a：把还没有执行add命令的修改一起提交）
          git push 远程库名 分支名（例如：git push github/gitee master）
          （第一次会跳出登录GitHub账号，账号名小写）
下载：git pull 
```



### MAC

```pro
1、设置username和email（github每次commit都会记录他们）
git config --global user.name "Harry-wh"
git config --global user.email "1093876434@qq.com"
2、链接验证
ssh -T git@github.com
（输出为：Hi Harry-wh! You've successfully authenticated, but GitHub does not provide shell access.）
3、在终端中切换路径到桌面
cd /Users/wuhaizhu/Desktop/bc/
4、克隆项目
git clone https://github.com/ym1907/bc.git
5、提交修改，首先切换到新建的文件路径
cd /Users/wuhaizhu/Desktop/项目文件夹/更新代码所在文件夹
6、文件添加到仓库（.代表提交所有文件）
git add .
7、把文件提交到仓库
git commit -m "标签(任意)"
8、上传到github
git push
```



### git异常

#### 一、push报错: OpenSSL SSL_read: Connection was reset, errno 10054

```pro
一般是这是因为服务器的SSL证书没有经过第三方机构的签署，所以才报错，解除ssl验证后，再次git即可
git config --global http.sslVerify "false"
```

#### 二、master -> master (non-fast-forward)

```pro
本地仓库是新的代码，而远程仓库还是之前版本的代码，在执行push操作前，一定要有pull的操作，不管是那一分支都应该有pull的操作（注：该操作为强制推送）
git push --force origin master
```

#### 三、rebase in process; onto

```pro
使用强制推送后，提交新的内容后出现该红色异常，以下操作可直接取消强制推送的进程
git rebase --abort 
```

#### 四、There is no tracking information for the current branch.

```pro
提示当前branch没有跟踪信息，对于这种情况有两种解决办法，就比如说要操作master吧，一种是直接指定远程master。
git pull origin master
另外一种方法就是先指定本地master到远程的master，然后再去pull。
git branch --set-upstream-to=origin/master master
git pull
```

#### 五、 fatal: The current branch master has no upstream branch. 

![1625457248387](resources/Git.assets/1625457248387.png)

```pro
git push的时候出现的异常
本地当前分支没有和远端的分支进行相关联
git push --set-upstream origin master(可能会出现问题六)
```

#### 六、master -> master(fetch first)   或   error: failed to push some refs to 'https://gitee.com/harry-wh/bc.git'

![1625457281383](resources/Git.assets/1625457281383.png)

```pro
解决问题五时会出现的异常
原因是远程仓库中的文件和我们本地的仓库有差异
如github中的README.md文件不在本地代码目录中，可以通过如下命令进行代码合并
git pull --rebase origin master
git pull命令用于从另一个存储库或本地分支获取并集成(整合)，取回远程主机某个分支的更新，再与本地的指定分支合并。
```



#### 七、Please, commit your changes or stash them before you can merge.

其他人修改了xxx提交到版本库中去了，而你本地也修改了xxx，这时候进行git pull操作就出现冲突了。

1、保留本地的修改的改法

1）直接commit本地的修改 ----**一般不用这种方法**

 2）通过git stash ---- **通常用这种方法** 

```java
git stash
git pull
git stash pop
```

通过git stash将工作区恢复到上次提交的内容，同时备份本地所做的修改，之后就可以正常git pull了，git pull完成后，执行git stash pop将之前本地做的修改应用到当前工作区。

git stash: 备份当前的工作区的内容，从最近的一次提交中读取相关内容，让工作区保证和上次提交的内容一致。同时，将当前的工作区内容保存到Git栈中。

git stash pop: 从Git栈中读取最近一次保存的内容，恢复工作区的相关内容。由于可能存在多个Stash的内容，所以用栈来管理，pop会从最近的一个stash中读取内容并恢复。

git stash list: 显示Git栈内的所有备份，可以利用这个列表来决定从那个地方恢复。

git stash clear: 清空Git栈。此时使用gitg等图形化工具会发现，原来stash的哪些节点都消失了。



 2、放弃本地修改 的改法 ----**这种方法会丢弃本地修改的代码，而且不可找回** 

```java
git reset --hard
git pull
```



### 其他操作

#### git网站打开慢

```pro
https://blog.csdn.net/xshiyi110/article/details/105245857
```

#### 远程库修改

```pro
查看：git remote -v
移除：git remote remove 库名
添加：git remote add 库名 网址
```

#### 更换 Git 的 IP

```pro
sudo vi /private/etc/hosts
浏览器访问https://www.ipaddress.com/
分别输入github.com和github.global.ssl.fastly.net以获取对应的ip
在后面追加字段
刷新DNS缓存：sudo killall -HUP mDNSResponder
	         sudo dscacheutil -flushcache
	         或
刷新DNS解析缓存：ipconfig /flushdns
```

#### git push/pull 时总需要输入用户名密码

```p
先执行命令：git config --global credential.helper store
然后再提交、输入密码，以后再提交将不再需要输入密码
检验方式：C:\Users\电脑名 这个文件夹下面是否能找到.git-credentials文件
文件的内容是有关gitlab的设置，格式为：http://{用户名}:{密码}@{git 网址}
https://Harry-wh:zwh13952737877@gitee.com
```

#### 分支操作

```pro
文章介绍：https://git-scm.com/book/zh/v2/Git-%E5%88%86%E6%94%AF-%E5%88%86%E6%94%AF%E7%AE%80%E4%BB%8B
创建分支：git branch testing
各个分支当前所指的对象：git log --oneline --decorate
分支分叉历史：git log --oneline --decorate --graph --all
切换分支：git checkout master
合并分支：git checkout master -> git merge 另一个分支名
删除分支：git branch -d hotfix
当前所有分支的列表：
*******处理合并冲突问题********
查看因包含合并冲突而处于未合并（unmerged）状态的文件：git status
（具体操作有待学习）
```

回滚本地被覆盖的代码

```java
输入git reflog查看提交的记录  前面黄色的字是当时提交时候的ID，也就是当时的版本号
然后再输入  git reset --hard  版本号  就回到当时的那个版本了
```

 ![img](https://img-blog.csdn.net/20180515133717336) 



#### 杂

```pro
添加公钥
ssh-keygen -t rsa -C "Harry-wh"
一路OK到底
cat /Users/wuhaizhu/.ssh/id_rsa.pub
复制公钥至网页保存

初始化一个文件夹为本地仓库：git init
```

 



