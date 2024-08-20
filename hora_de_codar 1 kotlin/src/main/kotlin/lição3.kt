import java.util.Scanner

fun main(){
    val scanner= Scanner(System. `in`)

    print("Digite o seu nome: ")
    val nome = scanner.nextLine()

    print("Digite a sua idade: ")
    val idade = scanner.nextLine()

    println("Olá, $nome! Você tem $idade anos.")
}