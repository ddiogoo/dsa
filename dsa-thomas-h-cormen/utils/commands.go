package utils

import (
	"math/rand"
	"os"
	"os/exec"
	"runtime"
)

// MakeArray generates an array with the size passed as an argument to this function.
func MakeArray(size int) []int {
	arr := []int{}
	rnd := rand.New(rand.NewSource(99))

	aux := size
	for aux > 0 {
		arr = append(arr, rnd.Int()%size)
		aux--
	}
	return arr
}

// ClearConsole clears the console in which the program is running, regardless of the
// user's operating system, as this method automatically detects it.
func ClearConsole() {
	var cmd *exec.Cmd
	switch runtime.GOOS {
	case "linux", "debian":
		cmd = exec.Command("clear")
	case "windows":
		cmd = exec.Command("cmd", "/c", "cls")
	default:
		panic("Command not supported")
	}

	cmd.Stdout = os.Stdout
	cmd.Run()
}
