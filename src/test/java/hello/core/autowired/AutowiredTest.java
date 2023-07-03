package hello.core.autowired;

import hello.core.member.Member;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import java.util.Optional;

public class AutowiredTest {

    @Test
    void AutowiredOption() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(TestBean.class);
    }

    @Component
    static class TestBean {

        @Autowired(required = false)
        public void setNoBean1(Member noBean1) {
            System.out.println("noBeam1 = " + noBean1);
        }

        @Autowired
        public void setNoBean2(@Nullable Member noBea2) {
            System.out.println("noBeam2 = " + noBea2);
        }

        @Autowired
        public void setNoBean3(Optional<Member> noBea3) {
            System.out.println("noBeam3 = " + noBea3);
        }
    }
}