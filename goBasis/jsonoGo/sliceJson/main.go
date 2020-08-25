package main

import (
	"encoding/json"
	"fmt"
)

func main() {
	testSlice()
}

func testSlice() {
	var m map[string]interface{}
	var s []map[string]interface{}
	m = make(map[string]interface{})
	m["name"] = "zhangsan"
	m["addr"] = "shanghai"
	m["age"] = 188

	s = append(s, m)

	m = make(map[string]interface{})
	m["name"] = "lisi"
	m["addr"] = "beijing"
	m["age"] = 250
	s = append(s, m)

	data, err := json.Marshal(s)
	if err != nil {
		fmt.Println(err)
		return
	}
	fmt.Println("slice: ", s)
	fmt.Println(string(data))

}
