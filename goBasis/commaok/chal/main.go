package main

import "fmt"

func main() {

	ch := make(chan string)
	//defer close(ch)
	go sendData(ch)
	//	getData(ch)
	newGetData(ch)
}

func sendData(ch chan string) {
	ch <- "beijing"
	ch <- "shanghai"
	ch <- "naijing"
	ch <- "suhou"
	close(ch)
}

func getData(ch chan string) {
	for {
		input, open := <-ch
		if !open {
			break
		}
		fmt.Println(input)
	}
}

func newGetData(ch chan string) {
	for input := range ch {
		fmt.Println(input)
	}

}
