package main

import "fmt"

type tree struct {
	value       int
	left, right *tree
}

//就地排序
func Sort(values []int) {
	var root *tree
	for _, v := range values {
		root = add(root, v)
	}
	appendValues(values[:0], root)
}

//appendValues将元素按照顺序追加到 values 里面，然后返回结果 slice
func appendValues(values []int, t *tree) []int {
	if t != nil {
		values = appendValues(values, t.left)
		values = append(values, t.value)
		values = appendValues(values, t.right)
	}
	fmt.Println("----------", values)
	return values
}

func add(t *tree, value int) *tree {
	if t == nil {
		// 等价于返回 return &tree{value: value}
		t = new(tree)
		t.value = value
		return t
	}
	if value < t.value {
		t.left = add(t.left, value)
	} else {
		t.right = add(t.right, value)
	}
	return t
}

func main() {
	fmt.Println("利用二叉树来实现插入排序")
	var tra *tree
	tra = new(tree)
	tra.value = 50
	add(tra, 30)
	add(tra, 70)
	fmt.Printf("%v %v \n", tra.value, tra.right.value)

	a := []int{500, 22, 55}
	appendValues(a, tra)

	fmt.Println("sort")
	Sort(a)
}
