package com.dev.domain.reservation

import com.dev.domain.common.CommonTimeEntity
import com.dev.domain.office.Office
import com.dev.domain.resevation_office.ReservationOffice
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
    @Column(name = "RESERVATION_ID")
    var id: Long? = null

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "ATTENDEES_ID")
    var attendees: List<Attendee>? = null

    @OneToMany(mappedBy = "reservationOffice")
    var offices: List<ReservationOffice>? = null
}