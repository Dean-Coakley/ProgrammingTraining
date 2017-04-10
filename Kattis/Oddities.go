package main

import (
	"fmt"
)

func main() {
	var totalNums int
	fmt.Scan(&totalNums)
	var ans []string
	var num int

	for i := 0; i < totalNums; i++ {
		fmt.Scan(&num)
		if num%2 == 0 {
			ans = append(ans, fmt.Sprint(num)+" is even")
		} else {
			ans = append(ans, fmt.Sprint(num)+" is odd")
		}
	}

	for _, answer := range ans {
		fmt.Println(answer)
	}
}
