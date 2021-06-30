package br.com.zuporange.registra

import br.com.zuporange.enum.TipoDeChavePix
import br.com.zuporange.enum.TipoDeConta
import io.micronaut.core.annotation.Introspected
import io.micronaut.core.annotation.NonNull
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.validation.constraints.NotBlank
import javax.validation.constraints.Size

@Introspected
data class ChavePix(

    @field:NotBlank
    val idCliente: String?,
    @field:NotBlank
    val tipoDeChave: TipoDeChavePix,
    @field:Size(max = 77)
    val chave: String?,
    @field:NonNull
    val tipoDeConta: TipoDeConta?

){

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null

}