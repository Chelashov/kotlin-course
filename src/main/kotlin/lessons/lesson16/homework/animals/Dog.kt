package org.example.lessons.lesson16.homework.animals

class Dog : Animal() {
    override fun makeSound() = printColored("Bark", Colors.RED, Background.BLUE)
}