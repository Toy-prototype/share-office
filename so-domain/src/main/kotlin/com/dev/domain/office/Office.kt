package com.dev.domain.office

import com.dev.domain.common.Address
import com.dev.domain.common.CommonTimeEntity
import java.math.BigDecimal
import javax.persistence.*

@Entity
@Table(name = "office")
class Office(
    @Column
    val name : String,
    @Column
    val capacity : Int,
    @Column
    val address : Address,
    @Column
    val activated : Boolean = true
): CommonTimeEntity() {

    companion object {
        @JvmStatic val RENTAL_COST = 0L
    }

    @Column
    val rentalCost : Long = RENTAL_COST

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null
}