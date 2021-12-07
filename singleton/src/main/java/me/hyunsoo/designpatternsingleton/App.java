package me.hyunsoo.designpatternsingleton;

public class App {

    public static void main(String[] args){
        assert Settings.getInstance() == Settings.getInstance();
    }
}
