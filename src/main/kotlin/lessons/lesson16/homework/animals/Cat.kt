package org.example.lessons.lesson16.homework.animals

class Cat: Animal() {
    override fun makeSound() = printColored("Meow", Colors.PURPLE, Background.BLACK)
}