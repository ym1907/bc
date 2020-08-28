package main

import "fmt"

func foo(n int) int {
	//	defer后面使用的是n++指令，不是一个函数调用语句，编译器就报错
	//	defer	n++
	n++
	fmt.Println(n)
	return n
}

func foo1(i int) int {
	i = 100
	i = 200
	return i
}

func foo2(i int) int {
	i = 100
	defer foo(i)
	i = 200
	fmt.Println("test")
	//	defer foo(i)
	return i
}

func main() {
	//	fmt.Printf("%v\n", foo(10))
	//	fmt.Println(foo1(1))
	fmt.Println(foo2(1))

}
