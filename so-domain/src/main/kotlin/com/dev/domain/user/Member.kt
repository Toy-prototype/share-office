package com.dev.domain.user

import com.dev.domain.common.CommonTimeEntity
import com.dev.domain.group.Team
import javax.persistence.*

@Entity
@Table(name = "member")
class Member(
    @Column
    val name : String ,
    @Column
    val age : Int ,
    @Enumerated(EnumType.STRING)
    @Column
    val position : PositionType
) : CommonTimeEntity(){
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MEMBER_ID")
    var id: Long? = null

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TEAM_ID")
    var team : Team? = null
}