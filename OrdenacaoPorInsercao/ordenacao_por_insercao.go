package ordenacaoporinsercao

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

	ordenar(&arr)
	fmt.Println("Depois de ordenar: ", arr)

	otherArr := []int{31, 41, 59, 26, 41, 58}
	fmt.Println("Antes de ordenar: ", otherArr)

	ordenarDecrescente(&otherArr)
	fmt.Println("Depois de ordenar: ", otherArr)
}

func ordenar(arr *[]int) {
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

func ordenarDecrescente(arr *[]int) {
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
