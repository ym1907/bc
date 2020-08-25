package main

import (
	"encoding/json"
	"fmt"
)

func main() {
	testStruct()

}

type People struct {
	Name string
	Addr string
	Age  int
}

func testStruct() {
	pe := &People{
		Name: "zhangsan",
		Addr: "shanghai",
		Age:  25,
	}

	data, err := json.Marshal(pe)
	if err != nil {
		fmt.Println("error ", err)
		return
	}
	fmt.Printf("json.Marshal : %v\n", data)
	fmt.Printf("string: %v \n", string(data))
}
