package main

import (
	"fmt"
)

type Number struct {
	num string
}

func main() {
	var totalNums int
	fmt.Scan(&totalNums)
	var ans []Number
	var num int

	for i := 0; i < totalNums; i++ {
		fmt.Scan(&num)
		if num%2 == 0 {
			ans = append(ans, Number{num: fmt.Sprint(num) + " is even"})
		} else {
			ans = append(ans, Number{num: fmt.Sprint(num) + " is odd"})
		}
	}

	for _, answer := range ans {
		fmt.Println(answer.num)
	}
}
