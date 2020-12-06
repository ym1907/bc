package main

import "fmt"

func main() {
	a := Point{5, 20}
	fmt.Println(a)
	var b Point
	b.x = 111
	fmt.Println(b)

	s := Point{y: 188, x: 199}
	fmt.Println(s)

	var _ = Point{11, 11}
}

type Point struct {
	x, y int
}
