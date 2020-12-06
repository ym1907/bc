package main

import "fmt"

func main() {
	var v interface{}
	// 省略了部分代码
	// v = 8
	v = "wenjianbao"

	switch i := v.(type) {
	case string:
		fmt.Printf("The string is '%s'\n", i)
	case int, uint, int8, uint8, int16, uint16, int32, uint32, int64, uint64:
		fmt.Printf("The interger is %d\n", i)
	default:
		fmt.Printf("Unsupporte value.(type=%T)\n", i)
	}

}
