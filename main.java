//Необходимо написать программу – розыгрыша игрушек в магазине детских товаров.
//Стараемся применять ООП и работу с файлами.
//Желательный функционал программы:
//В программе должен быть минимум один класс со следующими свойствами:
//id игрушки,
//текстовое название,
//количество,
//частота выпадения игрушки (вес в % от 100)
//Метод добавление новых игрушек и возможность изменения веса (частоты выпадения игрушки)
//Возможность организовать розыгрыш игрушек.


import java.util.Random;

public class main {
    public static void main(String[] args) {

        Shop shop = new Shop("Сказка");

        for (int i = 0; i < 100; i++) { 
            shop.addToy(toy_factory());
        }

        for (int i = 0; i < 20; i++) {
            shop.getToyToPrizeFund();
        }

        Json_service.saveJson(shop.getPrize_fund());

        System.out.println(shop);
    }

    public static Toy toy_factory() {
        Random rnd = new Random();
        String[] toy_names = {"Волк","Заяц", "Кот", "Собака", "Ёж", "Черепаха", "Лиса"};
        String[] toy_sizes = {"big", "medium", "small"};
        String toy_name = toy_names[rnd.nextInt(0, toy_names.length)] + " "
                        + toy_sizes[rnd.nextInt(0,toy_sizes.length)];
        return new Toy(toy_name, rnd.nextInt(1, 4), 1);
    }
}