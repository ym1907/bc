package main

import "fmt"

func main() {
	fmt.Printf("Callint test\r\n")
	test()
	fmt.Printf("Test completed\r\n")
}

func badCall() {
	panic("panic bad end")
}

func test() {
	defer func() {
		if e := recover(); e != nil {
			fmt.Printf("Panicing %s\r\n", e)
		}
	}()
	badCall()
	fmt.Printf("After bad call\r\n")
}
