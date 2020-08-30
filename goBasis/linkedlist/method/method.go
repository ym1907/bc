package method

func link(head *List, tail *List) *List {
	head.Next = tail
	return head
}

func unlink(a *List) (head, tail *List) {
	head.Data = a.Data
	tail = a.Next
	return head, tail
}

func add(data int, name *List) *List {
	dataList := new(List)
	dataList.Data = data
	return link(dataList, name)
}

func del(data int, name *List) {}

func out(a *List) {

}
