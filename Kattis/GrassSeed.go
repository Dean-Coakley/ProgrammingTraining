package main

import (
	"fmt"
	"strconv"
	"strings"
)

func main() {
	var seedCost float64
	var lawnNo int
	var in string
	var area float64

	fmt.Scanln(&seedCost)
	fmt.Scanln(&lawnNo)
	lawnCost := 0.00

	for i := 0; i < lawnNo; i++ {
		fmt.Scanln(&in)
		wh := strings.Split(in, " ")
		fmt.Println(wh[0])
		fmt.Println(wh[1]) //Test also throwing exception
		w, _ := strconv.ParseFloat(wh[0], 64)
		h, _ := strconv.ParseFloat(wh[1], 64) //EXCEPTIONAL LINE, index out of range

		area = w * h
		lawnCost += area * seedCost
	}

	ans := strconv.FormatFloat(lawnCost, 'E', 8, 64)
	fmt.Println(ans)
}
