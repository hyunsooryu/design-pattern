package me.hyunsoo.designpatternsingleton;

/**
 * thread safe 를 위해 syncronized 키워드를 사용하는 방법
 * 하지만, syncronized 자체가, LOCK 을 잡아서, 해당 LOCK을 갖고 있는 쓰레드만 접근하게 해주는 매커니즘을 처리하기 때문입니다.
 * 부가적인 성능 부하가 생길 가능 성이 있습니다. 해당 getInstance() 자체가 락이 걸립니다.
 *
 */

public class SettingsVer2 {
    private static SettingsVer2 INSTANCE;

    private SettingsVer2(){}

    public static synchronized SettingsVer2 getInstance(){
        if(INSTANCE == null){
            INSTANCE = new SettingsVer2();
        }
        return INSTANCE;
    }
}
