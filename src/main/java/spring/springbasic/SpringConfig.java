package spring.springbasic;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spring.springbasic.repository.MemberRepository;
import spring.springbasic.repository.MemoryMemberRepository;
import spring.springbasic.service.MemberService;

@Configuration
public class SpringConfig {

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
}