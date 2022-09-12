package com.dev.domain.common

import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import java.time.LocalDateTime
import javax.persistence.Column
import javax.persistence.EntityListeners
import javax.persistence.MappedSuperclass

@MappedSuperclass
@EntityListeners(AuditingEntityListener::class)
abstract class CommonTimeEntity {

    @CreationTimestamp
    @Column(updatable = false)
    protected val createdAt: LocalDateTime? = null

    @UpdateTimestamp
    protected var updatedAt: LocalDateTime? = null
}