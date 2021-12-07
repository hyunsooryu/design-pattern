package me.hyunsoo.designpatternsingleton;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * SingleTon 패턴.
 *
 * 인스턴스를 오직 한개만 제공하는 클래스
 *
 * 시스템 런타임, 환경 세팅에 대한 정보등 인스턴스가 여러개 일 때 문제가 생길 수 있는 경우가 있다. 인스턴스를
 * 오직 한개만 만들어 제공하는 클래스가 필요하다.
 *
 *
 *
 *
 */

@SpringBootApplication
public class DesignpatternSingletonApplication {

    public static void main(String[] args) {
        SpringApplication.run(DesignpatternSingletonApplication.class, args);
    }

}
