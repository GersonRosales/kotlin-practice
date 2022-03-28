const val ssn: Int = 6665588

fun main(args: Array<String>) {
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
        print("== Vars ===")
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