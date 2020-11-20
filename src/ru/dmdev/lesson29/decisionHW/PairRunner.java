package com.dmdev.homework.lesson18;

/**
 * 1. Создать класс Pair, параметризованный двумя
 * параметрами K и V. Класс должен хранить две
 * переменные типов K и V соответственно. У
 * класса должен быть конструктор,
 * принимающий 2 параметра типов K и V, а
 * также набор соответствующих
 * геттеров/сеттеров, toString (для отображения состояния
 * текущего объекта типа Pair)
 *
 * 2. Создать статический обобщённый метод swap
 * в утилитном классе PairUtil (утилитный класс – это класс
 * только со статическими методами, который имеет
 * private конструктор и помечен ключевым словом final,
 * чтобы предотвратить создание объектов этого класса,
 * а также наследоваться от него). Метод должен
 * принимать объект класса Pair и возвращать
 * новый объект Pair, в которой элементы поменяны местами.
 */
public class PairRunner {

    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("111a", 222);
        System.out.println(pair);

        Pair<Integer, String> swappedPair = PairUtil.swap(pair);
        System.out.println(swappedPair);
    }
}
