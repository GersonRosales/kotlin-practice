const val ssn: Int = 6665588

fun main(args: Array<String>) {
    /** Double bang and Try Catch **/
        println("\n== Double bang and Try Catch ===")

        try {
            throw ArithmeticException("Division  by 0")
        } catch (e : Exception) {
            println("Exception : $e")
        }

        var email : String? = null

        try {
            email!!.length
        } catch (e : Exception) {
            println("Exception : $e")
        } finally {
            println("The window will be closed")
        }

    /** For, Foreach, Map and Filter structure **/
        println("\n== For, Foreach, Map and Filter structure ===")
        val fruits: List<String> = listOf("melon", "watermelon", "strawberry", "lemon")

        for (fruit in fruits) {
            println("The $fruit is delicious.")
        }

        println("\nList of fruits to buy.")
        fruits.forEachIndexed { i, fruit ->
            println("${i+1}- $fruit (x${(1..5).random()})")
        }

        val fruitsLength: List<Int> = fruits.map { fruit -> fruit.length }
        println("\nFruits Length = $fruitsLength")

        println("\nThe long fruits ${fruits.filter { fruit -> fruit.length > 5 }}")

    /** When structure **/
        println("\n== When structure ===")
        val color = "red"

        when (color) {
            "red" -> {
                print("This is a hot")
                println(" color.")
            }
            "white", "blue" -> println("This is a cold color.")
            else -> println("Undefined color.")
        }

        val status = 200

        val meesage = when (status) {
            in 200..299 -> "It's ok."
            in 400..599 -> "Something when wrong."
            else -> "Undefined status."
        }

        println(meesage)

    /** Var Types **/
        val flag: Boolean = true
        val id: Long = 3000000000
        val id2: Long = 3L
        val percentage: Double = 53.66666
        val percentage2: Float = 20.32f
        val percentage3 = 20.32f

        val num1 = 3
        val num2 = 5
        val sum = num1.and(num2)


    /** Var **/
        print("\n== Vars ===")
        var name: String = "" // Rear and write
        println(name)
        name = "Otto"
        println(name)

        var age: Int

        val lastName: String = "Glew" // Only read
        println(lastName)
        //lastName = "G"

        println(ssn)

    /** Functions **/
        println("\n== Functions ===")
        var result: Int = sum(5, 7)
        println(result)

        result = sum2(2,3)
        println(result)

        printSum(3,1)
}

/** Functions **/
fun sum(a: Int, b: Int): Int {
    return a + b
}

fun sum2(a: Int, b: Int) = a + b

fun printSum(a: Int, b: Int): Unit {
    println("sum of $a and $b is ${a + b}")
}