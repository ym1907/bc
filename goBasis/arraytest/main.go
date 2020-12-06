package main

import "fmt"

func main() {
	fmt.Println("vim-go")

	var a []int
	for i := 5; i < 10; i++ {
		//	fmt.Println(i)
		a = append(a, i)
		//	fmt.Println("a", a)
	}
	fmt.Println("a", a)

	b := make([]int, 0)
	for x := 5; x < 10; x++ {
		b = append(b, x)
	}
	fmt.Println("b", b)

}
