package com.example.functions2

class FunctionsExample {

    // 1 - Dereceyi Fahrenhiet'e dönüştürme

    fun celciusToFahrenhiet(degree:Double):Double
    {
        var fahrenhiet=degree*1.8+32
        return fahrenhiet
    }

    // 2 - Kenarları parametre olarak girilen dikdörtgenin çevresini hesaplama

    fun perimeterCalc(edge1 : Int,edge2:Int)
    {
        try{
            var perimeter = (edge1+edge2)*2
            println(perimeter)
        }
        catch (e:Exception)
        {
            println("Kenarlar 0 a esit olamaz")
            e.message
        }
    }

    // 3 - Faktoriyel Hesabı

    fun factorial(number : Int):Int
    {
        var fact=1
        for (i in 1..number)
        {
            fact*=i
        }
        return fact
    }

    // 4 - A harfini bulma

    fun findA(word : String)
    {
        var word2=word.lowercase()
        var counter=0
        for (i in 0..word2.length-1)
        {
            if(word2[i]=='a')
            {
                counter++
            }
        }

        println("$word kelimesinin icinde $counter tane a harfi vardir")
    }

    // 5 - İç Açılar Toplamını BUlma

    fun interitorAnglesSum(edgeNumber:Int):Int
    {
        return (edgeNumber-2)*180
    }

    // 6 - Maaş Hesabı

    fun salaryCalc(dayNumber:Int):Int{

        var calc:Int?=null
        if(dayNumber>20)
        {
            calc=(20*10)+((dayNumber-20)*20)
        }
        else{
            calc=(dayNumber*10)
        }

        return calc
    }

    // 7 - Kota Hesabı

    fun quotaCalc(quatoAmount:Int):Int
    {
        var calc:Int?=null
        if(quatoAmount>50)
        {
            calc=(100)+((quatoAmount-50)*4)
        }
        else{
            calc=100
        }

        return calc
    }

}