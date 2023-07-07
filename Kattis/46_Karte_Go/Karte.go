package main

import "fmt"

func main() {
	var input string
	fmt.Scanln(&input)

	cards := [4]string{
		input[0:3],
		input[3:6],
		input[6:9],
		input[9:12],
	}

	duplicateFound := false

	for i, card := range cards {
		for j, searchCard := range cards {
			if card == searchCard && i != j {
				duplicateFound = true
			}
		}
		if duplicateFound {
			fmt.Printf("GRESKA\n")
			break
		}
	}

	if !duplicateFound {
		numP, numK, numH, numT := 13, 13, 13, 13

		for _, card := range cards {
			switch string(card[0]) {
			case "P":
				numP--
				break
			case "K":
				numK--
				break
			case "H":
				numH--
				break
			case "T":
				numT--
				break
			}
		}

		fmt.Printf("%d %d %d %d\n", numP, numK, numH, numT)
	}
}
