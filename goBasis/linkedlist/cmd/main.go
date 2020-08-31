package main

import (
	"linkedlist/method"
)

func main() {
	a := new(method.List)
	//	b := new(method.List)
	a.Data = 10
	//	b.Data = 20
	//	a.Next = b
	method.Add(30, a)
	method.Add(400, a)
	method.Output(a)

}
