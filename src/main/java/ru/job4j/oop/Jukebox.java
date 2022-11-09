package ru.job4j.oop;


public class Jukebox {
    public static void main(String[] args) {
        Jukebox avtomat = new Jukebox();
        avtomat.music(1);
        avtomat.music(2);
        avtomat.music(3);
    }

        public void music ( int position){
            if (position == 1) {
                System.out.println("Пусть бегут неуклюже\n" +
                        "Пешеходы по лужам,\n" +
                        "А вода по асфальту рекой.\n" +
                        "И неясно прохожим\n" +
                        "В этот день непогожий,\n" +
                        "Почему я веселый такой.\n" +
                        "\n");
            } else {
                if (position == 2) {
                    System.out.println("Спят усталые игрушки, книжки спят.\n" +
                            "Одеяла и подушки ждут ребят.\n" +
                            "Даже сказка спать ложится,\n" +
                            "Чтобы ночью нам присниться.\n" +
                            "Ты ей пожелай:\n" +
                            "Баю-бай.\n" +
                            "\n");
                } else {
                    System.out.println("Песня не найдена");
                }
            }
        }
    }
