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
    var id: Long? = null

//    @BatchSize(size = 100)
//    @OneToMany(mappedBy = "group", cascade = [CascadeType.ALL], fetch = FetchType.LAZY)
//    var teams: List<Team>? = null


    fun invite(){

    }

}