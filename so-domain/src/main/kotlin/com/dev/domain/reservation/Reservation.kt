package com.dev.domain.reservation

import com.dev.domain.common.CommonTimeEntity
import javax.persistence.*

@Entity
@Table(name = "reservation")
class Reservation(
    @Column
    val open : Boolean,
    @Column
    val title : String,
    @Column
    val content : String,
    @Column
    val conclusion : String,
    @Column
    val reservationDate : String) : CommonTimeEntity() {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null
}