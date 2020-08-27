package main

import (
	"encoding/json"
	"fmt"
)

func main() {
	strs := People{
		Name: "zhangsan",
		Addr: "beijing",
		Age:  18,
	}
	fmt.Println("data:  ", strs)

	dataJson, err := json.Marshal(strs)
	if err != nil {
		fmt.Println(err)
	}
	fmt.Printf("json: %v\n", dataJson)
	fmt.Println("string: ", string(dataJson))
	//	var dataUnJson interface{}
	var dataUnJson People
	err = json.Unmarshal(dataJson, &dataUnJson)
	fmt.Printf("unjson: %v\n", dataUnJson)

}

type People struct {
	Name string
	Addr string
	Age  int
}
