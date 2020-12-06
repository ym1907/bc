package main

import "fmt"

func main() {
	fmt.Println("vim-go")

	type Point struct {
		x, y int
	}
	p := Point{1, 2}
	q := Point{2, 1}
	fmt.Println(p == q)
	fmt.Println(p.x == q.y)

	type address struct {
		hostname string
		port     int
	}
	hits := make(map[address]int)
	hits[address{"hangzhou", 800}] = 10
	fmt.Println(hits)

	hits[address{"hangzhou", 800}] += 10
	fmt.Println(hits)

	for k, v := range hits {

		fmt.Println("k:  ", k)
		fmt.Println("v:  ", v)
	}
}
