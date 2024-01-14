package ordenacaoporinsercao

func Ordenar(arr []int) []int {
	for j := 1; j < len(arr); j++ {
		chave := arr[j]
		i := j - 1
		for i >= 0 && arr[i] > chave {
			arr[i+1] = arr[i]
			i--
		}
		arr[i+1] = chave
	}
	return arr
}

func OrdenarDecrescente(arr []int) []int {
	for j := 1; j < len(arr); j++ {
		chave := arr[j]
		i := j - 1
		for i >= 0 && arr[i] < chave {
			arr[i+1] = arr[i]
			i--
		}
		arr[i+1] = chave
	}
	return arr
}
