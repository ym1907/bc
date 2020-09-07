package main

import "fmt"

func main() {
	a := People{"zhangsan", 100}
	fmt.Println(a)

	add(&a)
	fmt.Println(a)

	pp := &People{"lisi", 500}
	fmt.Println(pp)
	// pp 和 pe 写法不同，但是效果一样
	pe := new(People)
	*pe = People{"ppp", 111}
	fmt.Println(pe)
}

type People struct {
	Name  string
	Money int
}

func add(a *People) {
	a.Money = a.Money + 100
}
