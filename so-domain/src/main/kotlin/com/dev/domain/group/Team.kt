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
    var id: Long? = null

//    @BatchSize(size = 100)
//    @OneToMany(mappedBy = "team", cascade = [CascadeType.ALL], fetch = FetchType.LAZY)
//    var coworkers: List<Coworker>? = null

    fun invite(){
    }
}