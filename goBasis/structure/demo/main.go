package main

import (
	"fmt"
	"time"
)

type Employes struct {
	ID        int
	Name      string
	Address   string
	DoB       time.Time
	Salary    int
	ManagerID int
}

var wuhaizhu Employes

func main() {
	wuhaizhu.ID = 001
	wuhaizhu.Salary -= 1000

	addr := &wuhaizhu.Address
	*addr = "suzhou"
	*addr = *addr + "dd"
	fmt.Println(wuhaizhu)
	fmt.Println(*addr)

	var zhangsan *Employes = &wuhaizhu
	//	(*zhangsan).Address += " shanghai"
	zhangsan.Address += " shanghai"
	fmt.Println(*zhangsan)

	fmt.Println(EmployesID(wuhaizhu.ID).ID)
	fmt.Println("wuhaizhu 被改变么？？", wuhaizhu)
}

func EmployesID(id int) *Employes {
	wuhaizhu.ID = 88888
	return &wuhaizhu
}
