package main

import (
	"fmt"
	"linkedlist/method"
)

func main() {
	a := new(method.List)
	b := new(method.List)
	a.Data = 10

	b.Data = 20
	a.Next = b
	fmt.Printf("a= %v\t,\ta.next= %v\t,b= %v\n", a, a, b)
	//a= &{10 0xc0000861f0}	,	a.next= &{20 <nil>}	,b= &{20 <nil>}

	fmt.Printf("   %T,   %T,   %T    \n", a, a.Next, b)
	//   *main.list,   *main.list,   *main.list

}
