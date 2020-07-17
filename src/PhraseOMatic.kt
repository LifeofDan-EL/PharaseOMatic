// The PhraseO-Matic consists of a main function that creates three arrays of words,
// randomly picks one word from each, and then joins them together.

fun main() {

    //Three different arrays holding the phrases
    val wordArray1 = arrayOf("24/7", "multi-tier", "B-to-B", "dynamic", "pervasive")
    val wordArray2 = arrayOf("empowered", "leveraged", "aligned", "targeted")
    val wordArray3 = arrayOf("process", "paradigm", "solution", "portal", "vision")

    // Variables holding a reference to the individual Array sizes.
    val arraySize1 = wordArray1.size
    val arraySize2 = wordArray2.size
    val arraySize3 = wordArray3.size

    // This uses the Math.random which ranges between 0 and almost 1,
    // then multiplies by the array size. It now forces to become an Int.
    val rand1 = (Math.random() * arraySize1).toInt()
    val rand2 = (Math.random() * arraySize2).toInt()
    val rand3 = (Math.random() * arraySize3).toInt()

    // The String prints the a phrase from random index location
    val phrase = "${wordArray1[rand1]} ${wordArray2[rand2]} ${wordArray3[rand3]}"

    println(phrase)}