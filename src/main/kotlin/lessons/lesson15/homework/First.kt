package org.example.lessons.lesson15.homework

class First: Materials() {
    fun addItemAtTheBottom (item: String){
        val extracted = extractMaterials()
        addMaterial(item)
        for (i in extracted){
            addMaterial(i)
        }

    }
}