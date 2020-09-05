package main

import "fmt"

func main() {
	chantest := make(chan int, 10)
	go ch(chantest)
	a, ok := <-chantest

	fmt.Println(ok)
	fmt.Println(a)
	go func() {
		chantest <- 500
	}()
	x, ok := <-chantest
	if !ok {
		fmt.Println("没有数据 ")
		fmt.Println(ok)
	} else {
		fmt.Println(x)
		fmt.Println(ok)
	}

	/*	for {
			x, ok := <-chantest
			if !ok {
				break
			} else {
				fmt.Println(x)
			}
		}
	*/
}

func ch(chantest chan int) {

	chantest <- 100

	//	fmt.Println(ch(chantest)
}
