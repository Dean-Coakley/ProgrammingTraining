package main

import (
	"fmt"
)

func isHiss(input string) string {
	for i, c := range input {
		if c == 115 && i < len(input)-1 && input[i+1] == 115 {
			return "hiss"
		}
	}
	return "no hiss"
}

func main() {
	var input string
	fmt.Scanln(&input)
	fmt.Println(isHiss(input))
}
