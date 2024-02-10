package divideandconquerapproach

import (
	"fmt"

	"github.com/ddiogoo/algorithms-theory-and-practice/utils"
)

// Run provides a simple interface for the user to run both sort methods.
func Run() {
	var size int
	fmt.Print("Enter size: ")
	fmt.Scan(&size)

	utils.ClearConsole()

	arr := utils.MakeArray(size)
	fmt.Println("Before ordering:", arr)

	mergeSort(&arr, 0, len(arr)-1)
	fmt.Println("After ordering:", arr)
}

// mergeSort performs the "division" part of the divide and conquer technique.
func mergeSort(arr *[]int, p, r int) {
	if p < r {
		q := (p + r) / 2
		mergeSort(arr, p, q)
		mergeSort(arr, q+1, r)
		merge(arr, p, q, r)
	}
}

// merge performs the "conquest" part of the divide and conquer technique.
func merge(arr *[]int, p, q, r int) {
	n1 := q - p + 1
	n2 := r - q

	larr := make([]int, n1+1)
	rarr := make([]int, n2+1)

	for i := 1; i <= n1; i++ {
		larr[i] = (*arr)[p+i-1]
	}
	for j := 1; j <= n2; j++ {
		rarr[j] = (*arr)[q+j]
	}

	larr = append(larr, int(^uint(0)>>1))
	rarr = append(rarr, int(^uint(0)>>1))

	i, j := 1, 1
	for k := p; k <= r; k++ {
		if larr[i] <= rarr[j] {
			(*arr)[k] = larr[i]
			i++
		} else {
			(*arr)[k] = rarr[j]
			j++
		}
	}
}
