package com.company;

public class Main {

    public static void main(String[] args) {
	Boss azazel = new Boss();
	azazel.setHealth(200);
	azazel.setDamage(30);
	azazel.setSuperPower("magic");
	Weapon ak47 = new Weapon("огнестрельное", "ak47");
	azazel.setWeapon(ak47);
		System.out.println(azazel.printInfo());
		Skeleton creeper = new Skeleton();
		creeper.setHealth(80);
		creeper.setDamage(24.5);
		creeper.setSuperPower("blast");
		Weapon magicOnion = new Weapon("холодное", "магический лук");
		creeper.setWeapon(magicOnion);
		creeper.setNumberOrFarrows(10);
		Skeleton skeleton = new Skeleton();
		skeleton.setHealth(100);
		skeleton.setDamage(25);
		skeleton.setSuperPower("explosiveArrow");
		Weapon onion = new Weapon("холодное", "лук");
		skeleton.setWeapon(onion);
		skeleton.setNumberOrFarrows(10);
		System.out.println(skeleton.printInfo());
		System.out.println(creeper.printInfo());


    }
}
/*#ДЗУрок6:
Создать класс Weapon (Оружие), с приватными полями тип оружия и название оружия.
Создать класс GameEntity (Игровая сущность), выделить все общие поля которые присущи и Боссу и
Героям и добавить геттеры и сеттеры к ним.
Создать класс Босса, наследовать его от класса GameEntity и дополнить его полем сложного типа данных Weapon
(то есть дать оружие боссу). Также добавить геттеры и сеттеры для этого поля.
В классе Main создать 1 экземпляр босса и задать ему все свойства (значения полям).
Затем распечатать всю информацию о боссе.
ДЗ на сообразительность:
Распечатывание информации сделать в методе в классе Босса public String printInfo(){}
Создать класс Skeleton (Скелет), унаследовать от Босса.
Добавить поле (кол-во стрел) и добавить геттеры и сеттеры.
Переопределить родительский метод printInfo в классе Skeleton
В Main распечатать информацию о Боссе с помощью метода printInfo, также создать 2 экземпляра скелета
и заполнить данными) затем распечатать всю информацию о скелетах.
Дэдлайн 12.09.2021 23 59*/
