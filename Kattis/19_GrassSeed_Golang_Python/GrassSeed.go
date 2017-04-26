package main

import (
	"fmt"
	"strconv"
)

func main() {
	var seedCost float64
	var lawnNo int
	var in, in1 string
	var area float64

	fmt.Scanln(&seedCost)
	fmt.Scanln(&lawnNo)
	lawnCost := 0.00

	for i := 0; i < lawnNo; i++ {
		fmt.Scanln(&in, &in1)

		w, _ := strconv.ParseFloat(in, 64)
		h, _ := strconv.ParseFloat(in1, 64)

		area = w * h
		lawnCost += area * seedCost
	}

	ans := strconv.FormatFloat(lawnCost, 'f', 7, 64)
	fmt.Println(ans)
}
