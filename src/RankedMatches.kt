class RankedMatches(
    private val wins: Int,
    private val losses: Int
) {

    fun outputMessage(): String {
        return "O Herói tem de saldo de ${calculateWinLossRatio()} está no nível de ${getRank()}"
    }

    private fun calculateWinLossRatio(): Int {
        return wins - losses
    }

    private fun getRank(): String {
        return when {
            wins <= 10 -> "Ferro"
            wins <= 20 -> "Bronze"
            wins <= 50 -> "Prata"
            wins <= 80 -> "Ouro"
            wins <= 90 -> "Diamante"
            wins <= 100 -> "Lendário"
            else -> "Imortal"
        }
    }
}