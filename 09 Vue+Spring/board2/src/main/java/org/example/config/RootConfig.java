package org.example.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@Configuration // 스프링 설정 클래스임을 명시
@PropertySource({"classpath:/application.properties"}) // application.properties 파일을 읽어옴
@ComponentScan(basePackages = {"org.example"}) // 해당 패키지 내의 컴포넌트를 자동으로 스캔하여 빈으로 등록
@MapperScan(basePackages  = {"org.example.board.mapper"}) // MyBatis 매퍼 인터페이스가 위치한 패키지를 지정
@Slf4j // 로깅 기능을 제공하는 Lombok 어노테이션
public class RootConfig {

    // application.properties에서 DB 접속 정보를 가져옴
    @Value("${jdbc.driver}") String driver;
    @Value("${jdbc.url}") String url;
    @Value("${jdbc.username}") String username;
    @Value("${jdbc.password}") String password;

    @Bean
    public DataSource dataSource() {
        // HikariCP 커넥션 풀을 설정
        HikariConfig config = new HikariConfig();
        config.setDriverClassName(driver);
        config.setJdbcUrl(url);
        config.setUsername(username);
        config.setPassword(password);

        HikariDataSource dataSource = new HikariDataSource(config); // HikariCP 데이터 소스 생성
        return dataSource;
    }

    @Autowired
    ApplicationContext applicationContext; // 스프링 컨텍스트 객체 주입

    @Bean
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();
        sqlSessionFactory.setConfigLocation(
                applicationContext.getResource("classpath:/mybatis-config.xml")); // MyBatis 설정 파일 경로 지정
        sqlSessionFactory.setDataSource(dataSource()); // 데이터 소스 설정
        return (SqlSessionFactory) sqlSessionFactory.getObject();
    }

    @Bean
    public DataSourceTransactionManager transactionManager() {
        // 트랜잭션 매니저 설정 (MyBatis와 연동하여 트랜잭션 관리)
        DataSourceTransactionManager manager = new DataSourceTransactionManager(dataSource());
        return manager;
    }
}
