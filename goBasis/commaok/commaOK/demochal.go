package main

import "fmt"

func getdata(chantest chan int) {
	for {
		x, ok := <-chantest
		if !ok {
			break
		} else {
			fmt.Println(x)
		}
	}
}
func setdata(chantest chan int) {
	chantest <- 10
	chantest <- 10
	chantest <- 10
	close(chantest)
}

func main() {
	chantest := make(chan int, 10)
	go setdata(chantest)
	getdata(chantest)
}
