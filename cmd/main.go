package main

import (
	"fmt"
	"math/rand"

	ordenacaoporinsercao "github.com/ddiogoo/algoritmos-teoria-e-pratica/OrdenacaoPorInsercao"
)

func main() {
	fmt.Println("Qual o tamanho do array que você deseja ordenar?")
	fmt.Println("(Os valores serão inseridos automaticamente no array)")

	var size int
	fmt.Print("Inserir tamanho: ")
	fmt.Scan(&size)

	arr := generateArray(size)
	fmt.Println("Antes de ordenar: ", arr)

	arr = ordenacaoporinsercao.Ordenar(arr)
	fmt.Println("Depois de ordenar: ", arr)
}

func generateArray(size int) []int {
	arr := []int{}
	r := rand.New(rand.NewSource(99))

	s := size
	for size > 0 {
		arr = append(arr, r.Int()%s)
		size--
	}

	return arr
}
