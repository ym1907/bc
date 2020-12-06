package main

import "fmt"

func main() {
	fmt.Println("------------------")
	mp := make(map[string]int)
	mp["a"] = 1
	mp["b"] = 2
	mp["c"] = 3
	mp["d"] = 4

	fmt.Println(mp)
	for k, v := range mp {
		fmt.Printf("%v %v   \n", k, v)
	}
	//利用Ok 来判断 mp 里面的 v（值） 是否存在
	if _, ok := mp["g"]; ok {
		fmt.Println("ok")
	} else {
		fmt.Println("no ok")
	}
}
