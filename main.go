package main

import (
	"fmt"

	ordenacaoporinsercao "github.com/ddiogoo/algoritmos-teoria-e-pratica/OrdenacaoPorInsercao"
	abordagemdivisaoeconquista "github.com/ddiogoo/algoritmos-teoria-e-pratica/ProjetoDeAlgoritmos/AbordagemDivisaoEConquista"
	utils "github.com/ddiogoo/algoritmos-teoria-e-pratica/Utils"
)

func main() {
	var method string

	fmt.Println("Qual método você deseja executar? ")
	fmt.Print("1) Ordenação por Inserção\n2) Abordagem Divisão e Conquista\n")
	fmt.Scan(&method)

	utils.ClearConsole()

	switch method {
	case "1":
		ordenacaoporinsercao.Executar()
	case "2":
		abordagemdivisaoeconquista.Executar()
	}
}
