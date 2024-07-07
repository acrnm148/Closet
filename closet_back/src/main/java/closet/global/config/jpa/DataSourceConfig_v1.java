package closet.global.config.jpa;

import com.zaxxer.hikari.HikariDataSource;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.LocalCacheScope;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.boot.autoconfigure.SpringBootVFS;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.LazyConnectionDataSourceProxy;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;
import org.springframework.transaction.support.TransactionSynchronizationManager;

import javax.inject.Qualifier;
import javax.sql.DataSource;
import java.util.Map;

@Configuration
//@MapperScan(
//        basePackages = "kyobobook.application.adapter.out.persistence.*.mapper",
//        annotationClass = Mapper.class,
//        sqlSessionFactoryRef = "sqlSessionFactory")
public class DataSourceConfig_v1 {
//    private static final String MASTER = "master";
//    private static final String READ_ONLY = "readonly";
//
//    @Bean(name = "masterDataSource")
//    @ConfigurationProperties(prefix = "spring.datasource.master")
//    public DataSource masterDataSource() {
//        return DataSourceBuilder.create()
//                .type(HikariDataSource.class)
//                .build();
//    }
//    @Bean(name = "readonlyDataSource")
//    @ConfigurationProperties(prefix = "spring.datasource.readonly")
//    public DataSource readonlyDataSource() {
//        return DataSourceBuilder.create()
//                .type(HikariDataSource.class)
//                .build();
//    }
//    @Bean
//    @DependsOn({"masterDataSource", "readonlyDataSource"})
//    public DataSource routingDataSource(@Qualifier("masterDataSource") DataSource masterDataSource,
//                                        @Qualifier("readonlyDataSource") DataSource readonlyDataSource) {
//        AbstractRoutingDataSource routingDataSource = new AbstractRoutingDataSource() {
//            @Override
//            protected Object determineCurrentLookupKey() {
//                return (TransactionSynchronizationManager.isCurrentTransactionReadOnly()) ? READ_ONLY : MASTER;
//            }
//        };
//        routingDataSource.setTargetDataSources(Map.of(MASTER, masterDataSource, READ_ONLY, readonlyDataSource));
//        routingDataSource.setDefaultTargetDataSource(masterDataSource);
//        return routingDataSource;
//    }
//    @Bean
//    @Primary
//    @DependsOn("routingDataSource")
//    public LazyConnectionDataSourceProxy lazyDataSource(@Qualifier("routingDataSource") DataSource routingDataSource) {
//        return new LazyConnectionDataSourceProxy(routingDataSource);
//    }
//    @Bean
//    public SqlSessionFactory sqlSessionFactory(LazyConnectionDataSourceProxy dataSource) throws Exception {
//        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
//        factoryBean.setDataSource(dataSource);
//        factoryBean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:/mappers/**/*.xml"));
//        return factoryBean.getObject();
//    }
//    @Bean
//    public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory sqlSessionFactory) {
//        sqlSessionFactory.getConfiguration().setMapUnderscoreToCamelCase(true);
//        sqlSessionFactory.getConfiguration().setCacheEnabled(false);
//        sqlSessionFactory.getConfiguration().setLocalCacheScope(LocalCacheScope.STATEMENT);
//        sqlSessionFactory.getConfiguration().setCallSettersOnNulls(false);
//        sqlSessionFactory.getConfiguration().setVfsImpl(SpringBootVFS.class);
//        sqlSessionFactory.getConfiguration().setJdbcTypeForNull(JdbcType.NULL);
//        return new SqlSessionTemplate(sqlSessionFactory);
//    }
}