package insertionsort

import (
	"fmt"

	"github.com/ddiogoo/algorithms-theory-and-practice/tree/main/dsa-thomas-h-cormen/utils"
)

// Run provides a simple interface for the user to run both sort methods.
func Run() {
	var size int
	fmt.Print("Enter size: ")
	fmt.Scan(&size)

	utils.ClearConsole()

	arr := utils.MakeArray(size)
	fmt.Println("Before ordering:", arr)

	sortAscending(&arr)
	fmt.Println("After ordering:", arr)

	arr = utils.MakeArray(size)
	fmt.Println("Before ordering:", arr)

	sortDescending(&arr)
	fmt.Println("After ordering:", arr)
}

// sortAscending sorts an array in ascending order.
func sortAscending(arr *[]int) {
	for j := 1; j < len((*arr)); j++ {
		chave := (*arr)[j]
		i := j - 1
		for i >= 0 && (*arr)[i] > chave {
			(*arr)[i+1] = (*arr)[i]
			i--
		}
		(*arr)[i+1] = chave
	}
}

// sortDescending sorts an array in descending order.
func sortDescending(arr *[]int) {
	for j := 1; j < len((*arr)); j++ {
		chave := (*arr)[j]
		i := j - 1
		for i >= 0 && (*arr)[i] < chave {
			(*arr)[i+1] = (*arr)[i]
			i--
		}
		(*arr)[i+1] = chave
	}
}
