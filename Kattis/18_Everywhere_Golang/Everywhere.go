package main

import "fmt"

func main() {
	var testCases int
	var trips int
	var dest []string
	var trip string

	fmt.Scan(&testCases)

	for k := 0; k < testCases; k++ {
		fmt.Scan(&trips)
		dest = make([]string, trips)
		ans := 0
		for l := 0; l < trips; l++ {
			fmt.Scan(&trip)
			if !exists(trip, dest) {
				dest = append(dest, trip)
				ans++
			}
		}
		fmt.Println(ans)

	}

}

func exists(d string, dest []string) bool {
	for _, trip := range dest {
		if trip == d {
			return true
		}
	}
	return false
}
