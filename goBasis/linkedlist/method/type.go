package method

type List struct {
	Data int
	Next *List
}

type ListWay interface {
	Output(*List)
	Add(int, *List)
}
