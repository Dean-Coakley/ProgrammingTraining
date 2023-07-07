package main

import (
	"fmt"
	"strconv"
	"strings"
)

func main() {
	var input string
	fmt.Scanln(&input)

	work := strings.Split(input, ";")

	var score int

	for _, w := range work {
		ranges := strings.Split(w, "-")
		if len(ranges) > 1 {
			start, _ := strconv.Atoi(ranges[0])
			end, _ := strconv.Atoi(ranges[1])

			score += (end - start) + 1
		} else {
			score += 1
		}
	}

	fmt.Println(score)
}
