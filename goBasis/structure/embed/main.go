package main

import "fmt"

func main() {

	/*var w Wheel
	w.x = 8
	w.y = 8
	w.redius = 5
	w.spokes = 208
	fmt.Println("Wheel: ", w)*/

	var w Wheel
	w.xay.x = 8
	w.xay.y = 8
	w.redius = 5
	w.spokes = 20
	fmt.Println("Wheel: ", w)
	fmt.Println("---------------- ")

	var ww Newwheel
	ww.cir.xay.x = 10
}

type Circle struct {
	//x, y, redius int
	xay    Point
	redius int
}

type Wheel struct {
	//x, y, redius, spokes int
	xay    Point
	redius int
	spokes int
}

type Newwheel struct {
	cir    Circle
	spokes int
}

type Point struct {
	x, y int
}
