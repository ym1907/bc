package main

import (
	"fmt"
	"strings"
	"time"
)

func main() {
	start := time.Now()
	sum, sep := "", ""
	for i := 0; i < 100000; i++ {
		sum += sep + "s"
	}
	fmt.Printf("%.6f s\n", time.Since(start).Seconds())

	start = time.Now()
	var a []string
	for i := 0; i < 100000; i++ {
		a = append(a, "s")
	}
	_ = strings.Join(a, "")
	fmt.Printf("%.6f s\n", time.Since(start).Seconds())

	start = time.Now()
	var arr [100000]string
	for i := 0; i < 100000; i++ {
		arr[i] = "s"
	}
	_ = strings.Join(arr[:], "")
	fmt.Printf("%.6f s\n", time.Since(start).Seconds())
}
