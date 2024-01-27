package abordagemdivisaoeconquista

func MergeSort(A *[]int, p int, r int) {
	if p < r {
		q := (p + r) / 2
		MergeSort(A, p, q)
		MergeSort(A, q+1, r)
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
	var k int
	for k = p; k <= r; k++ {
		if L[i] <= R[j] {
			(*A)[k] = L[i]
			i = i + 1
		} else {
			(*A)[k] = R[j]
			j = j + 1
		}
	}
}
