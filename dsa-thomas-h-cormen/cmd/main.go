package main

import (
	"fmt"

	divideandconquerapproach "github.com/ddiogoo/dsa/tree/main/dsa-thomas-h-cormen/internal/DivideAndConquerApproach"
	insertionsort "github.com/ddiogoo/dsa/tree/main/dsa-thomas-h-cormen/internal/InsertionSort"
	"github.com/ddiogoo/dsa/tree/main/dsa-thomas-h-cormen/utils"
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
