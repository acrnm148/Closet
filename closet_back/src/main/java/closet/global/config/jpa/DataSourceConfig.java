package closet.global.config.jpa;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

@Configuration
/*@MapperScan(
        basePackages = "closet.adapter.persistence.*.mapper",
        annotationClass = Mapper.class,
        sqlSessionFactoryRef = "testSqlSessionFactory")*/
public class DataSourceConfig {
    /**
     * Datasource : Connection Pool을 지원하는 인터페이스
     *
     *//*
    @Primary
    @Bean(name="testDataSource")
    @ConfigurationProperties(prefix="spring.datasource.master")
    public DataSource testDataSource() {
        return DataSourceBuilder.create().build();
    }

    *//**
     * SqlSessionFactory : SqlSession을 찍어내는 역할
     * Datasourc를 참조하여 MyBatis와 Mysql 서버를 연동한다. SqlSession을 사용하기 위해 사용한다.
     * @param testDataSource
     * @param applicationContext
     *//*
    @Primary
    @Bean(name = "testSqlSessionFactory")
    public SqlSessionFactory testSqlSessionFactory(@Qualifier("testDataSource") DataSource testDataSource, ApplicationContext applicationContext) throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(testDataSource);
        sqlSessionFactoryBean.setMapperLocations(applicationContext.getResources("classpath:${.xml이 세팅된 경로(마이바티스 쿼리가 저장된 곳}"));
        return sqlSessionFactoryBean.getObject();
    }

    *//**
     * SqlSessionTemplate : SqlSession을 구현하고 코드에서 SqlSession을 대체하는 역할을 한다. 마이바티스 예외처리나 세션의 생명주기 관리
     * @param testSqlSessionFactory
     *//*
    @Primary
    @Bean(name="testSqlSessionTemplate")
    public SqlSessionTemplate apiSqlSessionTemplate(SqlSessionFactory testSqlSessionFactory) {
        return new SqlSessionTemplate(testSqlSessionFactory);
    }*/
}
