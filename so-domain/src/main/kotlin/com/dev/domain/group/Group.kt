package com.dev.domain.group

import com.dev.domain.common.CommonTimeEntity
import org.hibernate.annotations.BatchSize
import javax.persistence.*

@Entity
@Table(name = "group")
class Group(
    @Column
    val name : String
) : CommonTimeEntity() {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "GROUP_ID")
    var id: Long? = null

    fun invite(){}

}