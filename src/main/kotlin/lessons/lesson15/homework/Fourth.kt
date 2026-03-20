package org.example.lessons.lesson15.homework

class Fourth : Materials() {
    fun addMap(items: Map<String, String>) {
        val extracted = extractMaterials()
        val keys = items.keys.reversed()
        val values = items.values
        for (i in keys) {
            addMaterial(i)
        }
        for (i in extracted) {
            addMaterial(i)
        }
        for (i in values) {
            addMaterial(i)
        }
    }
}
