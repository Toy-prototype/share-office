package com.dev.domain.group

import com.dev.domain.common.CommonTimeEntity
import org.hibernate.annotations.BatchSize
import javax.persistence.*

@Entity
@Table(name = "team")
class Team(
    @Column
    val name : String
) : CommonTimeEntity() {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TEAM_ID")
    var id: Long? = null

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "GROUP_ID")
    var group: Group? = null

    fun invite(){
    }
}