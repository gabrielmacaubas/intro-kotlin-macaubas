package br.ifpb.pdm.praticas

data class DataNascimento(val dia: Int?, val mes: Int?, val ano: Int?)

data class Jogador(
    val nome: String,
    val posicao: String?,
    val dataNascimento: DataNascimento?
)

fun listarNomeEPosicao(jogador: Jogador) {
    // Caso o jogador não possua posição, escreva "Informação não disponível" ao invés de null
    println("Nome: ${jogador.nome}, Posição: ${jogador.posicao}")
}

fun listarJogadoresSemDataNascimento(jogadores: List<Jogador>) {
    // Complete a função para verificar jogadores sem data de nascimento
}

fun main() {
    // Instanciação de jogadores
    val jogador1 = Jogador("Careca", "Atacante", DataNascimento(null, null, null))
    val jogador2 = Jogador("Gilmar", null, DataNascimento(15, 5, 2003)) // posição nula
    val jogador3 = Jogador("Maria", "Defensora", null) // data de nascimento nula

    // Listar nome e posição de cada jogador
    listarNomeEPosicao(jogador1)
    listarNomeEPosicao(jogador2)
    listarNomeEPosicao(jogador3)

    // Listar jogadores sem data de nascimento
    val jogadores = listOf(jogador1, jogador2, jogador3)
    listarJogadoresSemDataNascimento(jogadores)
}
