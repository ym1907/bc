package main

import (
	"fmt"
	"time"
)

func main() {
	tm := time.Now()
	//	fmt.Println(tm)
	fmt.Println(time.Since(tm))
	//	defer func() { fmt.Println(time.Since(tm)) }()
	time.Sleep(time.Second)
	//	fmt.Println(time.Second)

}
