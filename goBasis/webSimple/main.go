package main

import (
	"fmt"
	"net/http"
	"text/template"
)

func myWeb(w http.ResponseWriter, r *http.Request) {
	/*
		r.ParseForm()
		for k, v := range r.URL.Query() {
			fmt.Println("key:", k, ",value:", v[0])
		}
		for k, v := range r.PostForm {
			fmt.Println("key:", k, ", value:", v[0])
		}
		fmt.Fprintf(w, "this is new begin")
	*/

	//	t := template.New("index")
	//	t.Parse("<div id='teamlateTextDiv'>Hi,{{.name}},{{.someStr}}</div>")

	t, _ := template.ParseFiles("./templates/index.html")
	data := map[string]string{
		"name":    "zhangsan",
		"someStr": "this is string",
	}
	t.Execute(w, data)
}

func main() {
	http.HandleFunc("/", myWeb)

	fmt.Println("server start")
	err := http.ListenAndServe(":8080", nil)
	if err != nil {
		fmt.Println("server error", err)
	}
}
