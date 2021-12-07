package me.hyunsoo.designpatternsingleton;

/**
 * 멀티 쓰레드 환경에서 이 코드가 안전할까?
 * 응 당연히 안전하지 않습니다.
 * 왜 이 방법이 THREAD SAFE 하지 않을까?
 * if()안에 동시에 2개 이상의 쓰레드가 들어와서, new 를 실행시켜버릴 수 있기 때문입니다.
 */

public class Settings {
    private static Settings INSTANCE;

    private Settings(){}

    public static Settings getInstance(){
        if(INSTANCE == null){
            INSTANCE = new Settings();
        }
        return INSTANCE;
    }
}
