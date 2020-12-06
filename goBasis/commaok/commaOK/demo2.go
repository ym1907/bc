package main

import "fmt"

func main() {
	//利用 ok 来判断 a 的类型是不是string
	var a interface{}
	a = "sss"

	_, ok := a.(string)

	fmt.Println(ok)
}
