package main

import (
	"fmt"
	"os"
)

func main() {

	for i, arg := range os.Args[:] {
		fmt.Printf("[%v]  %v \n", i, arg)
	}
}
