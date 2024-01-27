package main

import (
	"fmt"
	"math/rand"

	ordenacaoporinsercao "github.com/ddiogoo/algoritmos-teoria-e-pratica/OrdenacaoPorInsercao"
)

func main() {
	var method string

	fmt.Println("Qual método você deseja executar? ")
	fmt.Print("1) Ordenação por Inserção\n2) Abordagem Divisão e Conquista\n")
	fmt.Scan(&method)

	switch method {
	case "1":
		ordenacaoPorInsercao()
	case "2":
		// abordagemDivisaoEConquista()
	}
}

func ordenacaoPorInsercao() {
	fmt.Println("Qual o tamanho do array que você deseja ordenar?")
	fmt.Println("(Os valores serão inseridos automaticamente no array)")

	var size int
	fmt.Print("Inserir tamanho: ")
	fmt.Scan(&size)

	arr := generateArray(size)
	fmt.Println("Antes de ordenar: ", arr)

	arr = ordenacaoporinsercao.Ordenar(arr)
	fmt.Println("Depois de ordenar: ", arr)

	otherArr := []int{31, 41, 59, 26, 41, 58}
	fmt.Println("Antes de ordenar: ", otherArr)

	ordenacaoporinsercao.OrdenarDecrescente(otherArr)
	fmt.Println("Depois de ordenar: ", otherArr)
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
