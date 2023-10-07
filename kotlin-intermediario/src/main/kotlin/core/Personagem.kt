package core

import core.enums.Classe
import core.enums.Raca

data class Personagem(val nome: String?) {

    //dados iniciais do personagem

    val raca: Raca
    val jogador: String
    var classe: Classe
    var nivelTotal: Int

    var hp: Int
    var hpAtual: Int
    var ataque: Int
    var defesa: Int

    var arma: String?
    var armadura: String?

    fun atualizarPV(dano: Int): Int
    fun atacar(alvo: Personagem): Boolean
    fun causarDano(dano: Int): Int
    fun receberDano(dano: Int): Int
}