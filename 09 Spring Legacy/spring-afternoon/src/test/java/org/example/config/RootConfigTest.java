package org.example.config;

import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.sql.Connection;

import static org.junit.jupiter.api.Assertions.*;

@Configuration // 스프링 설정 클래스임을 명시
@SpringJUnitConfig // JUnit5 기반의 스프링 통합 테스트 설정
@ContextConfiguration(classes = RootConfig.class) // 테스트에서 사용할 스프링 설정 클래스를 지정
@Slf4j // 로깅을 위한 Lombok 어노테이션
@PropertySource("classpath:application.properties") // application.properties 파일을 로드
class RootConfigTest {

    @Autowired
    private SqlSessionFactory sqlSessionFactory; // MyBatis의 SqlSessionFactory 자동 주입

    @Test
    void sqlSessionFactory() {
        // SqlSessionFactory가 정상적으로 동작하는지 확인하는 테스트
        try (SqlSession session = sqlSessionFactory.openSession(); // SqlSession 생성
             Connection conn = session.getConnection()) { // DB 커넥션 가져오기
            log.info("SQLSession: {}", session); // SqlSession 정보 로그 출력
            log.info("Connection: {}", conn); // Connection 정보 로그 출력
        } catch (Exception e) {
            fail(e.getMessage()); // 예외 발생 시 테스트 실패 처리
        }
    }
}
