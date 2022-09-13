package com.dev.domain.resevation_office

import com.dev.domain.office.Office
import com.dev.domain.reservation.Reservation
import javax.persistence.*

@Entity
@Table(name = "reservation_office")
class ReservationOffice(
    var cost : Long
) {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "RESERVATION_OFFICE_ID")
    var id: Long? = null


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "RESERVATION_ID")
    var reservation : Reservation? = null

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "OFFICE_ID")
    var office : Office? = null
}