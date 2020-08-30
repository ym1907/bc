package main

import "fmt"

//链表
func main() {
	a1 := new(list)
	a1.data = 11
	a2 := new(list)
	a2.data = 22

	a3 := new(list)
	a3.data = 33
	a4 := new(list)
	a4.data = 44

	fmt.Println("--------")
	link(a1, a2)
	link(a1, a3)
	link(a1, a4)
	oout(a1)
	/*	fmt.Println("----拆分----")
		unlink(a1)
		oout(a1.next)
		fmt.Println("----insert方法----")
		a := new(list)
		a = insert(50000, a)
		a = insert(6, a)
		oout(a)
		fmt.Println("----MAX方法----")
		fmt.Println(findMax(a1))

		fmt.Println("----拆分方法如果链表只有一个数呢----")
		aa := new(list)
		aa = insert(666, aa)
		aa = insert(777, aa)
		bb := new(list)
		cc := new(list)
		bb, cc = unlink(aa)
		oout(aa)
		fmt.Println("----bb----")
		oout(bb)
		fmt.Println("----cc----")
		oout(cc)*/
	/*fmt.Println("----删除方法----")
	s := new(list)
	s = delnew(11, a1)
	oout(s)
	fmt.Println("----0----")
	s1 := new(list)
	//s1 = nil
	s1.data = 11
	//s1 = insert(5, s1)
	oout(s1)*/
	fmt.Println("----新新新删除方法----")
	//oout(delete(44, a1))
	//oout(delnew(11, a1))
	//oout(delnew(22, a1))
	//fmt.Println(unlink(a1))
	x, y := unlink(a1)
	oout(x)
	fmt.Println("----y----")
	oout(y)
	fmt.Println("----headlink----")
	q := new(list)
	q.data = 11
	p := new(list)
	p.data = 2222
	oout(headLink(p, y))

	fmt.Println("-------------------------------------------")
	wwa := new(list)
	wwa.data = 888
	wwb := new(list)
	wwb.data = 999
	wwc := link(wwa, wwb)
	fmt.Println(wwa, wwb, wwc)

}

var aa = new(list)

//var aa *list

//aa=nil
func delnew(x int, a *list) *list {
	if a == nil {
		return a
	}
	head, tail := unlink(a)
	switch {
	case head.data == x:
		return link(aa, tail)
	default:
		//aa = insert(head.data, aa) // （现在会变成倒叙）插入到了前面，改成插入到后面就好了。
		aa = inserttail(head.data, aa)
		return delnew(x, tail)
	}
}

func delete(x int, a *list) *list {
	if a == nil {
		return a
	}
	head, tail := unlink(a)
	switch {
	case head.data == x:
		return tail
	default:
		return headLink(head, delete(x, tail))
	}
}

type list struct {
	data int
	next *list
}

func unlink(a *list) (*list, *list) { //一分为二
	/*	if a == nil {
		return a, a
	}*/

	return a, a.next

}

func headLink(a, b *list) *list {
	a.next = b
	return a
}

func link(a, b *list) *list { //二合为一
	last(a).next = b
	return a
}

func last(a *list) *list {
	head, tail := unlink(a)
	//head, tail := a.unlink(a)
	switch {
	case tail == nil:
		return head
	default:
		return last(tail)
	}
}

func oout(a *list) {
	for a != nil {
		fmt.Println(a.data)
		a = a.next
	}
}

func (a *list) find(v int) *list {
	switch {
	case a == nil:
		return nil
	case a.data == v:
		return a
	default:
		_, tail := unlink(a)
		return tail.find(v)
	}
}

func findd(v int, a *list) *list {
	switch {
	case a == nil:
		return nil
	case a.data == v:
		return a
	default:
		_, tail := unlink(a)
		return findd(v, tail)
	}
}

func finddd(v int, a *list) *list {
	if a == nil {
		return nil
	}
	head, tail := unlink(a)
	switch {
	case head.data == v:
		return head
	default:
		return finddd(v, tail)
	}
}

// r = a.find(1)
// r = find(1, a)

//查找
func find(i int, a *list) *list {
	switch {
	case a == nil:
		return nil
	case a.data == i:
		return a
	default:
		_, tail := unlink(a)
		return find(i, tail)
	}
}

func findMax(a *list) int {
	if a == nil {
		return 0
	}
	head, tail := unlink(a)
	x := head.data
	y := findMax(tail)
	if x < y {
		return y
	}
	return x
}

func reserse(a *list) *list {
	if a == nil {
		return nil
	}
	head, tail := unlink(a)
	switch {
	case tail == nil:

		return head
	default:
		return link(reserse(tail), head)
	}
}

/*
func findMax(a *list) int{
	var a int
	for p := a; p != nil; p = p.next{
		if p.data > a{
			a = p.data
		}
	}
	return a
}*/

/*
//查找最大的数
func findMax(a *list) int {
	if a == nil {
		a = new(list)
		return a.data
	}
	head, tail := unlink(a)
	// switch {
	// case head.data > tail.data:
	// 	link(head, tail.next)

	// default:
	// 	return findMax()
	// }
	b :=new(list)
	if head.data>tail.data {
		b=link(head, tail.next)
	}
	else if{
		b=tail
	}
	else b.data=b.next
	{
		return
	}
}
*/
func insert(v int, a *list) *list {
	b := new(list)
	b.data = v
	return link(b, a)
}

func inserttail(v int, a *list) *list {
	b := new(list)
	b.data = v
	return link(a, b)
}

//有序插入
func insertnew(x int, a *list) *list {
	if a == nil {
		a = new(list)
		a.data = x
		return a
	}
	head, tail := unlink(a)
	switch {
	case head.data > x:
		b := new(list)
		b.data = x
		return link(b, head)
	default:
		return link(head, insertnew(x, tail))
	}
}

// //删除一个指定的数据
// func del(v int, a *list) *list {
// 	b := new(list)
// 	if v == a.data {
// 		a, b = unlink(a)
// 	}
// 	return a
// }

//删除第一个数据
func delhead(a *list) *list {
	a.next = a
	return a
}

//删除最后一个数据
// func deltail

/*草稿
func insert(v int, a *list) *list {
if a.data==0{
	a.data=v
}
else
}

func insert(v int, a *list) *list {
	b := new(list)
	b.data = v
	b.next = a
	return b
}*/
