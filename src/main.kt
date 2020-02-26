fun main(args: Array<String>) {
    //Number
    var byt: Byte = 1//size: 8 bits 1...255
    var short: Short = 20//size: 16 bits 1...255
    var int: Int = 100//size: 32 bits 1...255
    var long: Long = 2000000//size: 64 bits 1...255
    var float: Float = 3.4f//size: 32 bits 1...255
    var double: Double = 3.4//size: 64 bits 1...255
    //Character
    var character: Char = 'e'//size: 8 to 16 bits 1...255
    //String
    var name: String = "Hi my name is Solomon"
    //Boolean
    var trueOrFalse: Boolean = true
    //Array
    var items: Array<Int> = arrayOf(1,2,3,4,5,6,7,8,9,10)
    var otherItems: Array<Int> = Array(10, {i->i*2})

    var item: Int = items.get(2)
    items.set(1,40)
    items[1] = 40




}