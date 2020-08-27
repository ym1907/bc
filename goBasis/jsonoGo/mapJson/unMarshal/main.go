package main

import (
	"encoding/json"
	"fmt"
)

func main() {
	mp := make(map[string]interface{})

	mp["name"] = "wuhai"
	mp["addr"] = "suzhou"
	mp["age"] = 18
	fmt.Printf("%v\n", mp)

	dataJson, _ := json.Marshal(mp)
	fmt.Printf("Json: %v\n", dataJson)
	fmt.Printf("S,Json: %v\n", string(dataJson))
	/*
		Sprintf无法将json格式变成字符串
		fmt.Printf("S,Json: %v\n", fmt.Sprintf("%v", dataJson))
	*/
	var mmp map[string]interface{}
	err := json.Unmarshal(dataJson, &mmp)
	if err != nil {
		fmt.Println(err)
	}
	fmt.Println(mmp)
}
