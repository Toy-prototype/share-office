package com.dev.domain.office

import com.dev.domain.common.Address
import com.dev.domain.common.CommonTimeEntity
import com.dev.domain.reservation.Reservation
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
    @Column(name = "OFFICE_ID")
    var id: Long? = null

//    @ManyToOne()
//    @JoinColumn(name = "RESERVATION_ID")
//    var reservation : Reservation? = null
}