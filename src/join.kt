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