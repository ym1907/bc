package main

import (
	"linkedlist/method"
)

func main() {
	a := new(method.List)
	b := new(method.List)
	a.Data = 10
	b.Data = 20
	a.Next = b
	method.Output(a)
}
