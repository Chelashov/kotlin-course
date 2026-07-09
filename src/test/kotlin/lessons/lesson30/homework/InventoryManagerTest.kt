package lessons.lesson30.homework

import org.example.lessons.lesson30.homework.InventoryManager
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import kotlin.collections.withDefault
import kotlin.test.assertTrue
import kotlin.test.junit5.JUnit5Asserter.assertEquals

class InventoryManagerTest {
    val Inventory = InventoryManager(100)

    @BeforeEach
    fun setUp(): Unit {
        Inventory.items = mutableMapOf("Мяч" to 99, "Ракетка" to 30, "Стол" to 15)
    }

    @Test
    fun getCorrectItemCountWhenItemIsPresent() {
        assertEquals(99, Inventory.getItemCount("Мяч"))
    }

    @Test
    fun getCorrectItemCountWhenItemIsAbsent() {
        assertEquals(0, Inventory.getItemCount("Сетка"))
    }

    @Test
    fun addItemsLessThanCapacityWhenItemIsPresent() {
        Inventory.addItem("Ракетка", 20)
        assertEquals(50, Inventory.getItemCount("Ракетка"))
    }

    @Test
    fun addItemsMoreThanCapacityThrowsAnException() {
        assertThrows(IllegalStateException::class.java)
        { Inventory.addItem("Ракетка", 120) }
    }

    @Test
    fun addItemsWhenItemIsAbsent() {
        Inventory.addItem("Кегли", 20)
        assertEquals(20, Inventory.getItemCount("Кегли"))
    }

    @Test
    fun removeItemsWhenItemIsPresentAndEnough() {
        assertTrue(Inventory.removeItem("Стол", 10))
        assertEquals(5, Inventory.getItemCount("Стол"))
    }

    @Test
    fun removeItemsWhenItemIsAbsentReturnsFalse() {
        assertFalse(Inventory.removeItem("Кегли", 10))
    }

    @Test
    fun removeItemsWhenItemIsNotEnoughReturnsFalse() {
        assertFalse(Inventory.removeItem("Мяч", 101))
        assertEquals(99, Inventory.getItemCount("Мяч"))
    }

    @Test
    fun enoughCapacityDoesntThrowsAnException() {
        Inventory.items = mutableMapOf("Мяч" to 9, "Ракетка" to 30, "Стол" to 15)
        Inventory.checkCapacity(10)
    }

    @Test
    fun notEnoughCapacityThrowsAnException() {
        Inventory.items = mutableMapOf("Мяч" to 9, "Ракетка" to 30, "Стол" to 15)
        Assertions.assertThrows(IllegalStateException::class.java)
        {Inventory.checkCapacity(100)}
    }
}