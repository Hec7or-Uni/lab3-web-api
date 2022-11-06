package es.unizar.webeng.lab3

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class Auth(
    var name: String,
    var passwd: String,
)
