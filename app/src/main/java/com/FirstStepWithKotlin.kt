package com

import java.util.*

// Code with ❤️
//┌──────────────────────────┐
//│ Created by Hilal TOKGOZ  │
//│ ──────────────────────── │
//│ hilaltokgoz98@gmail.com  │
//│ ──────────────────────── │
//│ 13.04.2022               │
//└──────────────────────────┘

fun main() {
    //Var-Val
    var name = "Hilal"
    name = "Halil"
    println(name)
    //Tip ve Dönüşümler
    val number1 = 5 //Int sayi tanimlama yada val number:Int=5 olarak da tanımlanabilir.
    val number2 = 1.0 //Double Sayi tanımlama
    val number3 = 2.4f //Yada büyük F kullanılabilir.
    val number4 = 1L //Long tanımlama
    //Input-Scanner
    val flowerNameInput = Scanner(System.`in`)
    println("Cicek İsmi Giriniz;")
    val flowerName = flowerNameInput.nextLine()
    println(flowerName)
    //String içinde Değişken Kullanımı
    println("$flowerName")

    val a = 5
    val b = 6
    println("${a + b}")
    //Fonksiyonlar-Return
    //Fonksiyon içerisinde bir veri döndürmek için Return yapısını kullanırız.
    //Süslü parantezler içerisiinde belli bir amacı gerçekleştirmesi için oluşturulmuş kod kümeleridir.
    println(sum(15, 20))

    //If-Else
    //Kolullu ifade kullanaılmısını sağlar
    val number = 6
    if (number == 5) {
        println("Number is five")
    } else if (number == 3) {
        println("Number is three")
    } else {
        println("Number is not found")
    }
    //WHEN :Diğer dillerdeki switch case yapısının kısaltılmış okunaklı halidir.
    when (number) {
        5 -> println("Number is five")
        3 -> println("Number is three")
        in 4..7 -> println("4 ile 7 arasında")
        else -> println("Number is not found")
    }
    //WHILE :İçerisine girilen kontrol devam ediyorken
    var i = 0
    while (i < 10) {
        println("Hello")
        i++
    }
    //Break:Koluş sağlandığında işlemi sonlandır.
    var j = 0
    while (true) {
        j++
        if (j == 4) {
            break
        }
        println(j) //1 2 3 yazdırıır.
    }
    //Contunie: Koluş atlanır döngü sürekli devam eder.
    /* var k=0
     while (true){
         k++
         if (k==4){
             continue
         }
         println(k) //
     }*/
    //FOR:
    for (i in 0..10) {
        println(i)  //0-10 arası sayıları yazdıırır
    }

    val numbers = mutableListOf(1, 2, 3, 4)
    for (i in 0 until numbers.size) { //size:4,l until:0 hariç
        println(numbers[i]) //1,2,3,4
    }
    //RANGE : Belli bir aralığı belirtmek için kullanılır.
    if (5 in 1..10) {
        println("It's true")
    }
    //Until:
    for (i in 1 until 5) {
        println(i) //1 2 3 4  yazdırır  until 5 i dahil etme demek oluyor.
    }
    //DOWN TO: Geriye doğru saymakta kullanılır.
    for (i in 5 downTo 1) {
        println(i)  //5 4 3 2 1 yazdırır.
    }
    //STEP: kaçar kaçar saydırmalı belirtmek istersek kullanılır.
    for (i in 5 downTo 1 step 2) { //2 şer aralıklarla geriye doğru.
        println(i)  //5 3 1 yazdırır.
    }
    //RANDOM
    val randomNumber = (0..10).random()
    val randomNumbers2 = (0 until 10).random() //10 dahil değil

    //Size-Index
    //Dinamik bir yapısı yok sayı ekleyip çıkarılamaz
    val sayilarList = listOf(10, 20, 30, 40, 50)
    println(sayilarList[1])  //1. indexine erişmek için
    println(sayilarList.indexOf(40)) //40 sayısı kaçıncı indexte.
    println(sayilarList.size)

    val sayilarList2 = arrayListOf(10, 20, 30, 40, 50)
    //Mutable ListOf Kotline özgü bir yapı. Veri ekleyip,silmeye yardımcı olur.
    val sayilarList3 = mutableListOf(10, 20, 30, 40, 50)
    sayilarList3.add(60)
    sayilarList3.removeAt(1) //1. indexi sil.
    sayilarList3[2] = 9 //2 index değerinni 9 ile değiştirdik.
    sayilarList3.shuffle() //shuffle listeyi karıştırmak için kullanılır
    //////////////////////////////////////////////////////////////////////
    //NULL SAFETY
    var isim: String? =
        "İbrahim"   //? isim değişkeninin null olabileceiğini belirtmek için kullanıyorsun.

    //Null Kontolü1(If-Else)
    if (isim != null) {
        println("null değil")
    } else {
        println("null")
    }
    //Null Kontrolü 2(Safe Call Operator ?.)
    val bookName: String? = null
    bookName?.let {
        println(it.length)
    }
    //Null Kontrol3(Elvis Operator safe call sonrasına ?: ekleyerek else kısmı yazdırırlır.)
    bookName?.let { println(it.length) } ?: println("null")
    //Null Kontrol4(Not Null Operator !!)
    bookName!!.length


}

fun sum(x: Int, y: Int): Int {   // fun sum(x:Int,y=Int)=x+y  olarakk da kullanıkabilir.l
    return x + y
}
