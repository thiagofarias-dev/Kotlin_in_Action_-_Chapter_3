import strings.join
import strings.joinToString
import strings.lastChar
import strings.View
import strings.showOff
import strings.Button
import strings.*

fun main() {
    example1()
    println()
    println("#################")
    println()
    example2()
    println()
    println("#################")
    println()
    example3()
    println()
    println("#################")
    println()
    example341()
    println()
    println("#################")
    println()
    example33()
    println()
    println("#################")
    println()
    example36()      //Aqui como a função showOff() é extensão de ambas as classes View e Button, será chamado a extensão da classe correspondente, no caso View. Pois as extensões não podem ser sobrescritas por não fazerem parte da classe.
    println()
    println("#################")
    println()
    example341()
    println()
    println("#################")
    println()
    example39()
    println()
    println("#################")
    println()
    example353()
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
    println(list.joinToString(";", "(", ")"))
    println(list.joinToString(separator = " ", prefix = " ", postfix = ".")) // outra maneira de chamar o joinToString ficar mais legível
    println()
    println(list.joinToString(", ", "", "")) //modo 2 - passando todos os parâmetros
    println(list.joinToString())                                       //modo 2 - não passando parâmetros
    println(list.joinToString("; "))                        //modo 2 - passando apenas parâmetro de separador
    println(list.joinToString(postfix = ";", prefix = "# "))        //modo 2 - passando parâmetros em ordem diferente e omitindo um deles
    println()
    println(listOf("one", "two", "eight").join())               //utilizando método como tipo receptor
    //println(listOf(1, 2, 8).join())                           //não funciona, pois a lista de objetos está definido como String e não aceita outro tipo
}

fun example33(){
    /*
println("Kotlin".lastChar())        //Exemplo 3.3 chamando o método lastChar que foi estendido na classe String
*/
    println("Kotlin".lastChar)          // Exemplo 3.7 chamando o lastChar utilizando uma propriedade de extensão
    println("Kotlin".lastChar)          // Exemplo 3.8 chamando o lastChar utilizando uma propriedade de extensão mutável
    val sb = StringBuilder("Kotlin?")
    sb.lastChar = '!'
    println(sb)

}

fun example36(){
    val view: View = Button()
    view.click()
    view.showOff()          //Aqui como a função showOff() é extensão de ambas as classes View w Button, será chamado a extensão da classe correspondente, no caso View. Pois as extensões não podem ser sobrescritas por não fazerem parte da classe.
}

fun example341(){
    val strings: List<String> = listOf("first", "second", "fourteenth")
    println(strings.last())

    val numbers: Collection<Int> = setOf(1, 14, 2)
    println(numbers.max())
}


