package me.hyunsoo.designpatternsingleton;

/**
 *
 * 자바 1.5 이상에서만 동작합니다..
 *
 * double checked locking을 활용한다.
 * 체킹을 2번하게 됩니다.
 *
 * volatile 은 무조건 메인 메모리를 참조하게 하는, 가시성의 문제를 해결하게 끔 해주는 키워드 입니다.
 *
 * 이 로직의 장점은, 인스턴스가 있는 경우에는, 동기화 로직을 쓰지않게 되는 장점이 있으며,
 * 동시에 많은 쓰레드가 들어온다 해도,  그때를 대비해서만 syncronized가 걸려있고, INSTANCE를 더블 체킹 해줘서 안전합니다.
 *
 * 그리고, 인스턴스를 필요로 하는 그 순간에 만들 수 있기 때문에가 좋습니다.
 *
 *
 *
 */

public class SettingsVer4 {
    private static volatile SettingsVer4 INSTANCE;

    private SettingsVer4(){}

    public static SettingsVer4 getInstance(){
        if(INSTANCE == null){
            synchronized(SettingsVer4.class){ //해당 클래스를 LOCK으로 쓰게끔 해주고
                if(INSTANCE == null){ //더블 체크드 락킹으로 여기서 걸립니다..
                    INSTANCE = new SettingsVer4();
                }
            }
        }

    }
}
