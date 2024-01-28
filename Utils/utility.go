package utils

import (
	"math/rand"
	"os"
	"os/exec"
	"runtime"
)

func GerarArray(size int) []int {
	arr := []int{}
	r := rand.New(rand.NewSource(99))

	s := size
	for size > 0 {
		arr = append(arr, r.Int()%s)
		size--
	}

	return arr
}

func ClearConsole() {
	var cmd *exec.Cmd

	switch runtime.GOOS {
	case "linux", "darwin":
		cmd = exec.Command("clear")
	case "windows":
		cmd = exec.Command("cmd", "/c", "cls")
	default:
		panic("Comando não suportado")
	}

	cmd.Stdout = os.Stdout
	cmd.Run()
}
