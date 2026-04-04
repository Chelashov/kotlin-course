package org.example.lessons.lesson19.homework

class StringValidator : Validator<String?> {
    override fun validate(element: String?): Boolean {
        return !element.isNullOrBlank()
    }

}