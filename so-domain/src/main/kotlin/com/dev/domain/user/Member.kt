package com.dev.domain.user

import com.dev.domain.common.CommonTimeEntity
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
    var id: Long? = null
}