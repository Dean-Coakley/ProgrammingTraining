package main

import "fmt"

func main() {
	var tests, noAds, ads, cost int
	fmt.Scanln(&tests)

	for i := 0; i < tests; i++ {
		fmt.Scanln(&noAds, &ads, &cost)

		if noAds < ads-cost {
			fmt.Println("advertise")
		} else if noAds > ads-cost {
			fmt.Println("do not advertise")
		} else {
			fmt.Println("does not matter")
		}
	}
}
