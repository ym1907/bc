package main

import (
	"encoding/json"
	"fmt"
)

func main() {
	testMap()
}

func testMap() {
	var amp map[string]interface{}
	amp = make(map[string]interface{})

	amp["name"] = "zhangsan"
	amp["addr"] = "shanghai"
	amp["Age"] = 18

	data, err := json.Marshal(amp)
	if err != nil {
		fmt.Println(err)
		return
	}
	fmt.Println(string(data))
	fmt.Println(data)
}
