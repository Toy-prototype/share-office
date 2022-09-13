package com.dev.domain.reservation

import com.dev.domain.user.Member
import javax.persistence.*

@Entity
@Table(name = "reservation")
class Attendee(
    var reservation_id : Long
) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MEMBER_ID")
    var member: Member? = null
}