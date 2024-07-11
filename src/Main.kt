import java.util.*

fun main() {
    val reader = Scanner(System.`in`)
    val wins: Int = getInput("wins", reader)
    val losses: Int = getInput("losses", reader)

    val rankedMatches = RankedMatches(wins, losses)
    println(rankedMatches.outputMessage())
}

fun getInput(inputType: String, reader: Scanner): Int {
    while (true) {
        print("Enter the number of $inputType: ")

        try {
            return reader.nextInt()
        } catch (e: InputMismatchException) {
            println("Invalid input for number of $inputType. Please enter a valid integer.")
            reader.nextLine()
        }
    }
}