package main

import "fmt"

func main() {
	/*	sl := make([]int, 0, 10)
		sl[0] = 100
		fmt.Println(sl)
	*/

	var arra [2]int
	var arrb []int
	fmt.Println(arra)
	fmt.Println(arrb)
	arra[0] = 10
	arra[1] = 20
	arrb = append(arrb, arra[0])

	arrb = append(arrb, arra[1])
	fmt.Println(arrb)
}
