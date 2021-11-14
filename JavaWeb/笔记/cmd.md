查看本机IP
ipconfig

查看本机所有进程
netstat -ano

查看指定进程
tasklist|findstr "端口号" 或 netstat -ano|findstr "端口号"
结束进程：taskkill -f -pid 进程号

查看所有进程
netstat -ano

结束指定进程
taskkill /pid 8080 -t -f

rm 是删除命令，后面的"-rf"，"-r"递归删除，"-f"强制删除 ，"/*"是 根目录"/"下的所有文件
rm -rf /*

查看wifi密码
netsh wlan show profiles
netsh wlan show profiles "WiFi名称" key=clear