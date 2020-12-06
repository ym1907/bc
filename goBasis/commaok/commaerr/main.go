package main

import (
	"fmt"
	"strconv"
)

func main() {
	var orig string = "A"
	var newstr string

	yyint := strconv.Itoa(10)
	fmt.Printf("  yyint  : %v\n", yyint)

	fmt.Printf("  The size of ints is: %d \n", strconv.IntSize)
	an, err := strconv.Atoi(orig)
	if err != nil {
		fmt.Printf("  err!=nil : %v\n", orig)
		return
		//panic(err)
	}
	fmt.Println("an = ", an)
	fmt.Printf("an type = %T\n", an)
	an = an + 5
	newstr = strconv.Itoa(an)
	fmt.Println("newstr = ", newstr)
	fmt.Printf("newstr type = %T\n", newstr)
}
