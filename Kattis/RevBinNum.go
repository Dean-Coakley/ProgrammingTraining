package main

import (
	"fmt"
	"strconv"
)

func main() {
	var input int64
	var stringAns string
	fmt.Scanln(&input)

	stringAns += strconv.FormatInt(input, 2)
	stringAns = Reverse(stringAns)

	ans, err := strconv.ParseInt(stringAns, 2, 64)
	if err == nil {
		fmt.Print(ans)
	}
}

func Reverse(s string) string {
	runes := []rune(s)
	for i, j := 0, len(runes)-1; i < j; i, j = i+1, j-1 {
		runes[i], runes[j] = runes[j], runes[i]
	}
	return string(runes)
}
