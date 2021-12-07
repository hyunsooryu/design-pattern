package me.hyunsoo.designpatternsingleton;

/**
 * Eager Initialization(이른 초기화) 을 사용하기
 * 이 객체를 꼭 나중에 만들지 않아도 된다.
 * 객체 만드는 비용이 비싸지 않다. 미리 만드는 방법도 있다. 대신 syncronized 쓰지않아도 된다.
 * 인스턴스를 호출 할 때, 만들고 싶은데, 사용이 될 때 만들고 싶은데..?? 그러면 어떻게 해야할까?
 *
 */

public class SettingsVer3 {
    private static final SettingsVer3 INSTANCE = new SettingsVer3();

    private SettingsVer3(){}

    public static SettingsVer3 getInstance(){
        return INSTANCE;
    }
}
