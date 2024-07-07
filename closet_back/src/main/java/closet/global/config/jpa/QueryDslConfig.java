package closet.global.config.jpa;

import com.querydsl.jpa.impl.JPAQueryFactory;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class QueryDslConfig {

    /*@PersistenceContext(unitName = "testJpaEntityManagerFactory")
    private EntityManager testEntityManager;

    @Bean
    public JPAQueryFactory testJpaQueryFactory() {
        return new JPAQueryFactory(testEntityManager);
    }*/

}
