package com.dev.domain.user.repository

import com.dev.domain.config.TestDBConfig
import com.dev.domain.user.Member
import com.dev.domain.user.PositionType
import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ActiveProfiles
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.web.WebAppConfiguration

@WebAppConfiguration
@ActiveProfiles("local")
@ContextConfiguration(classes = [TestDBConfig::class])
@SpringBootTest
class MemberRepositoryTest(
    @Autowired val memberRepository : MemberRepository
) {

    @Test
    fun member_entity_test() {
        memberRepository.save(Member("양재우",20,PositionType.BACKEND_DEV))
        val members = memberRepository.findAll()
        MatcherAssert.assertThat("양재우", Matchers.equalTo(members[0].name))
    }
}