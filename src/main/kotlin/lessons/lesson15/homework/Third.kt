package org.example.lessons.lesson15.homework

class Third: Materials() {
    fun addItemAndSort (item: String){
        addMaterial(item)
        val extracted = extractMaterials().sorted()
        for (i in extracted){
            addMaterial(i)
        }

    }
}