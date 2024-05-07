fun main() {
    example1()
    println()
    example2()
    println()
    example3()
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

//Cap 3.1 function abaixo comentada para não sobrescrever o outro modo de escrever
/* fun <T> joinToString( //Essa function implementa uma saída toString personalizada (modo 1)
    collection: Collection<T>,
    separator: String,
    prefix: String,
    postfix: String
): String {
    val result = StringBuilder(prefix)                  //adiciona o parentese antes do primeiro elemento da lista
    for ((index, element) in collection.withIndex()) {
        if (index > 0) result.append(separator)         //não adiciona separados antes do primeiro elemento da lista
        result.append(element)

    }
    result.append(postfix)                              //adiciona o parentese após o último elemento da lista
    return result.toString()
} */

fun example3(){
    val list = listOf(1,2,3)
    println(listOf(list)) // modo padrão de listar uma string
    println(joinToString(list, ";", "(", ")"))
    println(joinToString(list, separator = " ", prefix = " ", postfix = ".")) // outra maneira de chamar o joinToString ficar mais legível
    println()
    println(joinToString(list, ", ", "", "")) //modo 2 - passando todos os parâmetros
    println(joinToString(list))                                       //modo 2 - não passando parâmetros
    println(joinToString(list,"; "))                        //modo 2 - passando apenas parâmetro de separador
    println(joinToString(list, postfix = ";", prefix = "# "))        //modo 2 - passando parâmetros em ordem diferente e omitindo um deles

}

//Cap 3.2
fun <T> joinToString( //Essa function implementa uma saída toString personalizada (modo 2 - utilizando argumentos nomeados, possibilita a omissão de parâmetros durante a chamada da function e também a troca de ordem dos argumentos )
    collection: Collection<T>,
    separator: String = ", ",
    prefix: String = "",
    postfix: String = ""
): String {
    val result = StringBuilder(prefix)                  //adiciona o parentese antes do primeiro elemento da lista
    for ((index, element) in collection.withIndex()) {
        if (index > 0) result.append(separator)         //não adiciona separados antes do primeiro elemento da lista
        result.append(element)

    }
    result.append(postfix)                              //adiciona o parentese após o último elemento da lista
    return result.toString()
}





