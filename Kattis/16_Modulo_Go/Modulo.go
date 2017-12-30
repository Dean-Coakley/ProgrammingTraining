package main

import "fmt"

func main() {
	var num int64
	var ans []int64
	var uniques int

	for i := 0; i < 10; i++ {
		fmt.Scan(&num)
		mod := num % 42

		isUnique := false
		for _, dat := range ans {
			if dat == mod {
				isUnique = true
			}
		}
		if !isUnique {
			ans = append(ans, mod)
			uniques++
		}
	}

	fmt.Println(uniques)
}
