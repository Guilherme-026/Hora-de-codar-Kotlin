import java.util.Scanner
import kotlin.math.PI

fun main(){
    val scanner = Scanner(System.`in`)

    println("Qual forma geometrica você quer descobrir a área? ")
    println("1.Retângulo")
    println("2.Quadrado")
    println("3.Losango")
    println("4.Trápezio")
    println("5.Paralelogramo")
    println("6.Triângulo")
    println("7.Circulo")

    val geometria = scanner.nextLine()
    val geo = geometria.toInt()

    if (geo == 1){
        retangulo()
    }else if (geo == 2){
        quadrado()
    }else if (geo == 3){
        losango()
    }else if(geo == 4){
        trapezio()
    }else if(geo == 5){
        paralelogramo()
    }else if(geo == 6){
        triangulo()
    }else if(geo == 7){
        circulo()
    }else {
        print("informe um valor existente!")
    }
}

fun retangulo(){
    val scanner = Scanner(System.`in`)

    print("Qual é a base do retângulo? ")
    val input1 = scanner.nextLine()
    val base = input1.toDouble()

    print("Qual é a altura do retângulo? ")
    val input2 = scanner.nextLine()
    val altura = input2.toDouble()

    val area = base * altura

    println("A área do Retângulo é: $area")

}


fun quadrado(){
    val scanner = Scanner(System.`in`)

    print("Quanto é o lado do quadrado? ")
    val input1 = scanner.nextLine()
    val lado1 = input1.toDouble()

    print("Quanto é o outro lado do quadrado? ")
    val input2 = scanner.nextLine()
    val lado2 = input2.toDouble()

    val area = lado1 * lado2

    println("A área do Quadrado é: $area")

}

fun losango(){
    val scanner = Scanner(System.`in`)

    println("Digite a diagonal maior: ")
    val input1 = scanner.nextLine()
    val diagonalMaior = input1.toDouble()

    println("Digite a diagonal menor: ")
    val input2 = scanner.nextLine()
    val diagonalMenor = input2.toDouble()

    val area = (diagonalMaior * diagonalMenor) / 2

    print("A área do Losango é: $area")
}

fun trapezio(){
    val scanner = Scanner(System.`in`)

    println("Digite a base maior: ")
    val input1 = scanner.nextLine()
    val baseMaior = input1.toDouble()

    println("Digite a base menor: ")
    val input2 = scanner.nextLine()
    val baseMenor = input2.toDouble()

    println("Digite a altura: ")
    val input3 = scanner.nextLine()
    val h = input3.toDouble()

    val area = ((baseMaior + baseMenor) * h) / 2
    print("A área do Trápezio é: $area")
}

fun paralelogramo(){
    val scanner = Scanner(System.`in`)

    println("Digite a base: ")
    val input1 = scanner.nextLine()
    val base = input1.toDouble()

    println("Digite a altura: ")
    val input2 = scanner.nextLine()
    val h = input2.toDouble()

    val area = base * h

    print("A área do Paralelogramo é: $area")
}

fun triangulo(){
    val scanner = Scanner(System.`in`)

    println("Digite a base: ")
    val input1 = scanner.nextLine()
    val base = input1.toDouble()

    println("Digite a altura: ")
    val input2 = scanner.nextLine()
    val h = input2.toDouble()

    val area = (base * h) / 2

    print("A área do Triângulo é: $area")

}

fun circulo(){
    val scanner = Scanner(System.`in`)

    println("Digite o raio: ")
    val input1 = scanner.nextLine()
    val raio = input1.toDouble()

    val area:Double = PI * raio * raio
    print("A área do Circulo é: $area")
}