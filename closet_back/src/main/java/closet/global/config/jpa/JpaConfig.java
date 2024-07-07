package closet.global.config.jpa;

import com.querydsl.jpa.impl.JPAQueryFactory;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.AbstractEntityManagerFactoryBean;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

//@EnableJpaAuditing
//@Configuration
//@EnableTransactionManagement
//@EnableJpaRepositories(basePackages = "closet.domain.repository",
//        entityManagerFactoryRef = "testJpaEntityManagerFactory",
//        transactionManagerRef = "testTransactionManager")
public class JpaConfig {

    /**
     * LocalContainerEntityManagerFactoryBean
     * EntityManager를 생성하는 팩토리
     * SessionFactoryBean과 동일한 역할, Datasource와 mapper를 스캔할 .xml 경로를 지정하듯이
     * datasource와 엔티티가 저장된 폴더 경로를 매핑해주면 된다.
     * @param builder
     * @param dataSource
     * @return
     *//*
    @Primary
    @Bean( name = "testJpaEntityManagerFactory" )
    public LocalContainerEntityManagerFactoryBean jpaEntityManagerFactory(
            EntityManagerFactoryBuilder builder,
            @Qualifier("testDataSource") DataSource dataSource ) {
        return builder.dataSource(dataSource).packages("closet.domain").build();
    }

    *//**
     *  JpaTransactionManager : EntityManagerFactory를 전달받아 JPA에서 트랜잭션을 관리
     *//*
    @Primary
    @Bean(name = "testTransactionManager")
    public JpaTransactionManager transactionManager(
            @Qualifier("testJpaEntityManagerFactory") LocalContainerEntityManagerFactoryBean mfBean
    ) {
        JpaTransactionManager transactionManager = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory( mfBean.getObject() );
        return transactionManager;
    }*/


    /*@Bean
    public JPAQueryFactory jpaQueryFactory(EntityManager entityManager) {
        return new JPAQueryFactory(entityManager);
    }

    @Bean(name = "entityManagerFactory")
    public LocalContainerEntityManagerFactoryBean entityManagerFactory(
            EntityManagerFactoryBuilder builder,
            DataSource dataSource) {
        return builder
                .dataSource(dataSource)
                .packages("closet.domain") // Entity 패키지 위치
                .persistenceUnit("entityManager")
                .build();
    }

    @Bean(name = "transactionManager")
    public PlatformTransactionManager transactionManager(EntityManagerFactory entityManagerFactory) {
        return new JpaTransactionManager(entityManagerFactory);
    }*/

    /*@Bean
    public HibernateJpaVendorAdapter jpaVendorAdapter() {return new HibernateJpaVendorAdapter();}

    @Bean
    public AbstractEntityManagerFactoryBean entityManagerFactoryBean(DataSource dataSource, HibernateJpaVendorAdapter jpaVendorAdapter) {
        LocalContainerEntityManagerFactoryBean entityManagerFactory = new LocalContainerEntityManagerFactoryBean();
        entityManagerFactory.setDataSource(dataSource);
        entityManagerFactory.setPackagesToScan("closet.domain");
        entityManagerFactory.setJpaVendorAdapter(jpaVendorAdapter);
        return entityManagerFactory;
    }

    @Bean
    public PlatformTransactionManager transactionManager(AbstractEntityManagerFactoryBean entityManagerFactory) {
        JpaTransactionManager transactionManager = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(entityManagerFactory.getObject());
        return transactionManager;
    }*/
}
