package br.com.zuporange.registra

import javax.inject.Singleton
import javax.validation.Constraint
import javax.validation.ConstraintValidatorContext
import javax.validation.Payload
import kotlin.reflect.KClass

/*
@MustBeDocumented
@Target(AnnotationTarget.CLASS, AnnotationTarget.TYPE)
@Retention(AnnotationRetention.RUNTIME)
@Constraint(validatedBy = [ValidaChavePix::class])

annotation class ValidPixKey(
    val message: String = "chave Pix inválida (\${validatedValue.tipo})",
    val groups: Array<KClass<Any>> = [],
    val payload: Array<KClass<Payload>> = [],
)
@Singleton
class ValidaChavePix: javax.validation.ConstraintValidator<ValidPixKey, PixRequest>{

    override fun isValid(value: PixRequest?, context: ConstraintValidatorContext?): Boolean {return null}

}*/