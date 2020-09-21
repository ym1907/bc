package main

import (
	"fmt"
	"net/http"
)

func main() {
	fmt.Println("vim-go")
}

func printHello(w http.ResponseWriter, r *http.Request) {
	r.ParseForm()

}
