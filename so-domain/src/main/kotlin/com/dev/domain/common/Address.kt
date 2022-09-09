package com.dev.domain.common

import javax.persistence.Column
import javax.persistence.Embeddable

@Embeddable
data class Address (
    @Column
    val address : String,
    @Column
    val addressDetail : String,
    @Column
    val zipCode : String)