fun main() {
    example1()
    println()
    example2()

}

fun example1() {
    val set = hashSetOf(1, 7, 53)
    val list = arrayListOf(1, 7, 63)
    val map = hashMapOf(1 to "one", 7 to "seven", 53 to "fifty-three")

    println(set.javaClass) //imprime a classe dos objetos criados, semelhante ao getClass() do Java
    println(list.javaClass)
    println(map.javaClass)
}

fun example2(){
    val strings = listOf("first", "second", "fourteenth") //cria uma lista com 3 elementos

    println(strings.last()) //.last() retorna o último elemento da lista gerada acima

    val numbers = setOf(1, 14, 2)

    println(numbers.max()) //.max() retorna o maior valor na lista
}

