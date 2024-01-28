package abordagemdivisaoeconquista

import (
	"fmt"

	utils "github.com/ddiogoo/algoritmos-teoria-e-pratica/Utils"
)

func Executar() {
	fmt.Println("Qual o tamanho do array que você deseja ordenar?")
	fmt.Println("(Os valores serão inseridos automaticamente no array)")

	var size int
	fmt.Print("Inserir tamanho: ")
	fmt.Scan(&size)

	utils.ClearConsole()

	arr := utils.GerarArray(size)
	fmt.Println("Antes de ordenar: ", arr)

	mergeSort(&arr, 0, len(arr)-1)
	fmt.Println("Depois de ordenar: ", arr)

	otherArr := []int{31, 41, 59, 26, 41, 58}
	fmt.Println("Antes de ordenar: ", otherArr)

	mergeSort(&otherArr, 0, len(otherArr)-1)
	fmt.Println("Depois de ordenar: ", otherArr)
}

func mergeSort(A *[]int, p int, r int) {
	if p < r {
		q := (p + r) / 2
		mergeSort(A, p, q)
		mergeSort(A, q+1, r)
		merge(A, p, q, r)
	}
}

func merge(A *[]int, p int, q int, r int) {
	n1 := q - p + 1
	n2 := r - q

	L := make([]int, n1+1)
	R := make([]int, n2+1)

	for i := 1; i <= n1; i++ {
		L[i] = (*A)[p+i-1]
	}
	for j := 1; j <= n2; j++ {
		R[j] = (*A)[q+j]
	}

	L = append(L, int(^uint(0)>>1))
	R = append(R, int(^uint(0)>>1))

	i, j := 1, 1
	for k := p; k <= r; k++ {
		if L[i] <= R[j] {
			(*A)[k] = L[i]
			i = i + 1
		} else {
			(*A)[k] = R[j]
			j = j + 1
		}
	}
}
