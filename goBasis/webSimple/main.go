package main

import (
	"fmt"
	"net/http"
)

func myWeb(w http.ResponseWriter, r *http.Request) {

	r.ParseForm()
	for k, v := range r.URL.Query() {
		fmt.Println("key:", k, ",value:", v[0])
	}

	for k, v := range r.PostForm {
		fmt.Println("key:", k, ", value:", v[0])
	}

	fmt.Fprintf(w, "this is new begin")
}

func main() {
	http.HandleFunc("/", myWeb)

	fmt.Println("server start")
	err := http.ListenAndServe(":8080", nil)
	if err != nil {
		fmt.Println("server error", err)
	}
}
