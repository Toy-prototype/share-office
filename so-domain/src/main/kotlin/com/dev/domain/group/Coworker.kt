package com.dev.domain.group

import com.dev.domain.common.CommonTimeEntity
import com.dev.domain.user.Member
import org.hibernate.annotations.BatchSize
import javax.persistence.*

@Entity
@Table(name = "coworker")
class Coworker(
    @Column
    val name : String
) : CommonTimeEntity() {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null

//    @BatchSize(size = 100)
//    @OneToOne(fetch = FetchType.LAZY, cascade = [CascadeType.ALL])
//    var member: Member? = null

    fun invite(){
    }
}