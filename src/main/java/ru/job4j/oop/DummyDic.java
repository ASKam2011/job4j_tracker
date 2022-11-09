package ru.job4j.oop;

public class DummyDic {

    public String engToRus() {
        String eng = "employer";
        return ("Неизвестное слово. " + eng);
    }

    public static void main(String[] args) {
        DummyDic translit = new DummyDic();
        String say = translit.engToRus();
        System.out.println(say);
    }
}
