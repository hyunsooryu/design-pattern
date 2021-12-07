package me.hyunsoo.designpatternsingleton;

/**
 *
 * static inner 클래스를 활용하는 방법이 있습니다..
 * 내가 원할 때 만들 수 있고, 즉 미리 생성하지 않아도 되며,
 * thread-safe 하게 동작합니다.
 */

public class SettingsVer5 {

    private SettingsVer5(){}

    private static class SettingsHolder{
        private static final SettingsVer5 INSTANCE = new SettingsVer5();
    }

    public static SettingsVer5 getInstance(){
        return SettingsHolder.INSTANCE;
    }
}
