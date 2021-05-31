package enum

fun main() {
    val primeiroPagamento = Pagamento()

    when (primeiroPagamento.status) {
        StatusPagamento.EM_ANALISE -> println("Pagamento em análise, aguarde.")
        StatusPagamento.ACEITO -> println("Parabéns, o seu pagamento foi aceito.")
        StatusPagamento.RECUSADO -> println("Infelizmente o seu pagamento foi recusado.")
    }
}

class Pagamento {
    var status: StatusPagamento = StatusPagamento.EM_ANALISE
}

enum class StatusPagamento {
    EM_ANALISE, ACEITO, RECUSADO
}