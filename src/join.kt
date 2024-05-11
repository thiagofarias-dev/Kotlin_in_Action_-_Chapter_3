@file:JvmName("StringFunctions") //renomeia a classe a ser chamada no Java

package strings
//Cap 3.2
fun <T> Collection<T>.joinToString( //Essa function implementa uma saída toString personalizada (modo 2 - utilizando argumentos nomeados, possibilita a omissão de parâmetros durante a chamada da function e também a troca de ordem dos argumentos )
    separator: String = ", ",
    prefix: String = "",
    postfix: String = ""
): String {
    val result = StringBuilder(prefix)                  //adiciona o parentese antes do primeiro elemento da lista
    for ((index, element) in this.withIndex()) {
        if (index > 0) result.append(separator)         //não adiciona separados antes do primeiro elemento da lista
        result.append(element)

    }
    result.append(postfix)                              //adiciona o parentese após o último elemento da lista
    return result.toString()
}

fun Collection<String>.join(
    separator: String = ", ",
    prefix: String = "",
    postfix: String = ""
) = joinToString(separator,prefix, postfix)

//Examplo 3.1
//fun String.lastChar(): Char = this.get(length -1)       //adiciona o método lastChar() a classe String

//Examplo 3.7
val String.lastChar: Char
    get() = get(length - 1)

//Exemplo 3.6
open class View {
    open fun click() = println("View Clicked")
}

class Button: View() {                                          //Classe Button estende a classe View
    override fun click() = println("Button Clicked")
}

fun View.showOff() = println("I'm a view!")
fun Button.showOff() = println("I'm a Button!")

//Exemplo 3.8 - Declarando uma propriedade de extensão mutável
var StringBuilder.lastChar: Char
    get() = get(length - 1)
    set(value: Char) {
        this.setCharAt(length - 1, value)
    }