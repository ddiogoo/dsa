package main

import (
	"fmt"

	divideandconquerapproach "github.com/ddiogoo/algorithms-theory-and-practice/internal/DivideAndConquerApproach"
	insertionsort "github.com/ddiogoo/algorithms-theory-and-practice/internal/InsertionSort"
	"github.com/ddiogoo/algorithms-theory-and-practice/utils"
)

func main() {
	var method string
	fmt.Print("Enter method: ")
	fmt.Scan(&method)

	utils.ClearConsole()
	switch method {
	case "1":
		insertionsort.Run()
	case "2":
		divideandconquerapproach.Run()
	}
}
