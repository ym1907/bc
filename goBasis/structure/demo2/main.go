package main

import "fmt"

func main() {
	fmt.Println("vim-go")

	seen := make(map[string]struct{}) //set of strings
	// ...

	if _, ok := seen[s]; !ok {
		seen[s] = struct{}{}
		// ... first time seeing s...
	}

}
