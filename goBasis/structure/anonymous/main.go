package main

import "fmt"

func main() {
	var c Circle
	c.x = 10
	c.y = 20
	c.Radius = 100
	fmt.Println(c)

	var w Wheel
	w.x = 55
	w.y = 66
	w.Radius = 777
	w.Spokes = 888
	fmt.Println(w)

	var ww Wheel
	ww = Wheel{
		Circle{
			Point{1, 2},
			10},
		5}

	ww = Wheel{
		Circle: Circle{
			Point:  Point{x: 8, y: 9},
			Radius: 10,
		},
		Spokes: 20,
	}
	fmt.Println(ww)
}

type Point struct {
	x, y int
}

type Circle struct {
	Point
	Radius int
}

type Wheel struct {
	Circle
	Spokes int
}
