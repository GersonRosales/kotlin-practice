import java.sql.Blob

const val ssn: Int = 6665588

fun main(args: Array<String>) {
    /************ Functions ************/
    println("\n=== Functions ===")
    var result: Int = sum(5, 7)
    println(result)

    result = sum2(2,3)
    println(result)

    printSum(3,1)

    fullName(firstName = "Gerson", lastName = "Rosales") // Parameters named

    /************ Var ************/
    print("\n=== Vars ===")
    var name: String = "" // Rear and write
    println(name)
    name = "Otto"
    println(name)

    var age: Int

    val lastName: String = "Glew" // Only read
    println(lastName)
    //lastName = "G"

    println(ssn)

    /************ Var Types ************/
    val flag: Boolean = true
    val intNum: Int = 2_147_483_647
    val longNum: Long = 2_147_483_648
    val longNum2: Long = 3L
    val percentage: Double = 53.66666
    val percentage2: Float = 20.32f
    val percentage3 = 20.32f

    val num1 = 3
    val num2 = 5
    val sum = num1.and(num2)

    /************ When structure ************/
    println("\n=== When structure ===")
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

    /************ For, Foreach, Map and Filter structure ************/
    println("\n=== For, Foreach, Map and Filter structure ===")
    val fruits: List<String> = listOf("melon", "watermelon", "strawberry", "lemon")

    for (fruit in fruits) {
        println("The $fruit is delicious.")
    }

    println("\nList of fruits to buy.")
    fruits.forEachIndexed { i, fruit ->
        println("${i+1}- $fruit (x${(1..5).random()})")
    }

    val fruitsLength: List<Int> = fruits.map { fruit -> fruit.length }
    println("Fruits Length = $fruitsLength")
    println("The long fruits ${fruits.filter { fruit -> fruit.length > 5 }}")
    println("The sort fruits ${fruits.filterNot { fruit -> fruit.length > 5 }}")
    println("Split the fruits ${fruits.partition { fruit -> fruit.length > 5 }}")

    /************ Double bang and Try Catch ************/
    println("\n=== Double bang and Try Catch ===")

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

    /************ Lists and Arrays ************/
    println("\n=== Lists and Arrays ===")
    val immutableList = listOf<String>("Bread", "Eggs", "Flour")
    var mutableList = mutableListOf<String>()

    println(mutableList)

    mutableList.add(immutableList[2])
    mutableList.add(immutableList.get(1))
    mutableList.add(immutableList.firstOrNull() ?: "")

    println(mutableList)

    mutableList = mutableListOf<String>()

    println(mutableList.firstOrNull())

    mutableList = immutableList.toMutableList()
    mutableList.removeIf { it -> it.length > 4 }
    println(mutableList)

    val arr = arrayOf(1,2,3,4)
    println("Array = $arr, Array as List = ${arr.toList()}")

    val randomNum: List<Int> = listOf(
        3,1,4,1,5,9,2,6,5,3,6
    )

    println("\nrandomNum = "+randomNum)
    println("randomNum.average() = "+randomNum.average())
    println("randomNum.count() = "+randomNum.count())
    println("randomNum.count { it > 5 } = "+randomNum.count { it > 5 })
    println("randomNum.sum() = "+randomNum.sum())
    println("randomNum.maxOrNull() = "+randomNum.maxOrNull())
    println("randomNum.minOrNull() = "+randomNum.minOrNull())
    println("randomNum.joinToString  = "+randomNum.joinToString (
        separator = "-",
        prefix = "[pi://",
        postfix = "]",
        limit = 4
    ) {
      "{$it}"
    })

    /************ Sorting Lists ************/
    println("\n=== Sorting Lists ===")
    val numbers = listOf<Int>(99,55,1,23,51,12,3,20)
    println("Original         : $numbers")
    println("Reverse          : ${numbers.reversed()}")
    println("Sorted           : ${numbers.sorted()}")
    println("SortedDescending : ${numbers.sortedDescending()}")
    println("sortedBy < 20    : ${numbers.sortedBy { it -> it < 20 }}")
    println("Shuffled         : ${numbers.shuffled()}")
    println("Map              : ${numbers.map { it -> "This is the number $it" }}")
    println("Filter           : ${numbers.filter { it -> it > 50 }}")

    /************ Maps ************/
    println("\n=== Maps ===")
    val numbersMap = mutableMapOf<String,Int>(
        "One" to 1
        , "two" to 2
        , "three" to 3
    )

    println(numbersMap.get("One"))
    println(numbersMap["One"])
    println(numbersMap.getOrDefault("four", 10))
    println(numbersMap["four"])
    println(numbersMap.get("five")) // Exception

    numbersMap.put("five", 5)
    numbersMap["four"] = 4
    println(numbersMap)

    numbersMap.remove("five")
    println(numbersMap)

    println(numbersMap.keys)
    println(numbersMap.values)

    /************ Set ************/
    println("\n=== Set ===")
    val vowels = setOf<String>("a","e","i","o","u","u","u","u","u","u","u","u")
    println(vowels)
    println(vowels union setOf("b","c","d"))
    println(setOf("b","c","d") union vowels)
    println(vowels subtract setOf("e","o"))
    println(vowels intersect setOf("a","i","u"))

    val setNum = mutableSetOf<Int>(1,2,3,4)
    println(setNum)
    setNum.add(5)
    println(setNum)
    setNum.remove(1)
    println(setNum)

    /************ Extension Function ************/
    println("\n=== Extension Function ===")
    val phrase = "Walking is good for your health".randomCase()
    println(phrase)

    /************ Strings ************/
    println("\n=== Strings ===")
    var text = """
        {
            name: Gersin,
            age: -1
        }
    """.trimIndent()
    println(text)

    println("    ".isBlank())
    println("".isBlank())
    println("    ".ifBlank { "Never Blank!" })
    println("   Welcome !   ".trim())
    text = "$$1000$$"
    println(text.removePrefix("$$"))
    println(text.removeSuffix("$$"))
    println(text.removeSurrounding("$$"))
    text = "It's up to you man!"
    println(text.equals("It's up to you MAN!", ignoreCase = true))

    /************ Lambdas ************/
    println("\n=== Lambdas ===")

    val getLength : (String) -> Int = {
        it.length
    }
    println(getLength("casa"))

    val listOfName = listOf<String>("Nina", "Pinta", "Santa")
    println(listOfName.map(getLength))

    /************ High Order Function ************/
    println("\n=== High Order Function ===")
    val valueSuperFun = superFun(name = "Gerson", block = {
        it.length
    })
    println(valueSuperFun)

    /************ Let ************/
    println("\n=== Let ===")
    var var_1 : String? = "Hi!"
    var_1?.let {
        println("This is the value of var_1 : ${var_1}")
    }

    var var_2 = null
    var_2?.let {
        println("This is the value of var_2 : ${var_2}")
    }

    var var_3 = ""
    var_3?.let {
        println("This is the value of var_3 : ${var_3}")
    }

    val numbers1 = listOf("one", "two", "three", "four", null)
    val modifiedFirstItem = numbers1.first()?.let { firstItem ->
        println("The first item of the list is '$firstItem'")
        if (firstItem.length >= 5) firstItem else "!" + firstItem + "!"
    }?.uppercase()
    println("First item after modifications: '$modifiedFirstItem'")

    val modifiedLastItem = numbers1.last()?.let { lastItem ->
        println("The last item of the list is '$lastItem'")
        if (lastItem.length >= 5) lastItem else "!" + lastItem + "!"
    }?.uppercase()
    println("Last item after modifications: '$modifiedLastItem'")

    /************ With ************/
    println("\n=== With ===")
    val seasons = listOf<String>("Spring", "Sumer", "Fall", "Winter")
    with(seasons) {
        println("These are the seasons $this")
        println("There are ${size} the seasons")
        println("The first season is ${first()}")
        println("The last season is ${last()}")
    }

    /************ Run ************/
    println("\n=== Run ===")
    val phones = mutableListOf("iPhone 12 Pro Max", "Samsung Galaxy A12", "iPhone SE 2020", "Xiaomi Redmi 9")
        .run {
            removeIf { it -> it.contains("iPhone") }
            this
        }
    println(phones)

    /************ Apply ************/
    println("\n=== Apply ===")
    val phones2 = mutableListOf("iPhone 12 Pro Max", "Samsung Galaxy A12", "iPhone SE 2020", "Xiaomi Redmi 9")
        .apply {
            removeIf { it -> it.contains("iPhone") }
        }
    println(phones2)

    var colors : MutableList<String>? = null
    println(colors?.javaClass)
    printColors(colors)
    colors?.add("Green")
    println(colors?.javaClass)
    colors = mutableListOf("Red")
    println(colors?.javaClass)
    printColors(colors)

    /************ Also ************/
    println("\n=== Also ===")
    val result1 = mutableListOf("iPhone 12 Pro Max", "Samsung Galaxy A12", "iPhone SE 2020", "Xiaomi Redmi 9").also {
        "The colors are $it"
    }.asReversed()

    println(result1)
}

fun printColors(colors : MutableList<String>?) {
    colors?.apply {
        println("These are the colors $this")
    }
}

/** Functions **/
fun sum(a: Int, b: Int): Int {
    return a + b
}

fun sum2(a: Int, b: Int) = a + b

fun printSum(a: Int, b: Int): Unit {
    println("sum of $a and $b is ${a + b}")
}

fun String.randomCase() : String {
    val num = (1..10).random()
    return if (num.rem(2) == 0) {
        this.lowercase()
    } else {
        this.uppercase()
    }
}

fun fullName(firstName: String, secondName: String = "", lastName: String) {
    println("Your name is $firstName ${secondName ?: ""}$lastName.")
}

/************ High Order Function ************/
fun superFun (name: String, block: (String) -> Int) : Int {
    return block(name)
}