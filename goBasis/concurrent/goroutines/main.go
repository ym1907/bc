package main

import (
	"fmt"
	"time"
)

func main() {

	time.Sleep(1000 * time.Millisecond)
	go say("apple")
	time.Sleep(1000 * time.Millisecond)
	say("mmp")
	time.Sleep(2000 * time.Millisecond)
	go say("sssssssss")
	time.Sleep(1000 * time.Millisecond)

}

func say(s string) {
	for i := 0; i < 5; i++ {

		time.Sleep(100 * time.Millisecond)
		fmt.Println("this is ", s)
	}
}
