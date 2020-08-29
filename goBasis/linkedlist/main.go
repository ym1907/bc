package main

import "fmt"

func main() {
	a := new(list)
	b := new(list)
	a.data = 10

	b.data = 20
	a.next = b
	fmt.Printf("a= %v\t,\ta.next= %v\t,b= %v\n", a, a.next, b)
	//a= &{10 0xc0000861f0}	,	a.next= &{20 <nil>}	,b= &{20 <nil>}

	fmt.Printf("   %T,   %T,   %T    \n", a, a.next, b)
	//   *main.list,   *main.list,   *main.list

	out(a)

	fmt.Println("")
	s1 := new(list)
	s1.data = 100
	add(s1, 200)
	fmt.Println(s1.next.data)

}

type list struct {
	data uint64
	next *list
}

func out(a *list) {
	fmt.Println(a.data, a.next.data)
}

func add(a *list, st uint64) *list {
	n := a
	b := new(list)
	b.data = 188
	n.next = b
	return n
}

/*
func link(head *list, tail *list) *list {
	head.next = tail
	return head
}

/*
func unlink(a *list) (head, tail *list) {
	head.data = a.data
	tail = a.next
	return head, tail
}

func add(data uint64, name *list) *list {
	dataList := new(list)
	dataList.data = data
	return link(dataList, name)
}

func del() {}

*/
