package com.example.numbers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.math.BigInteger

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

 var rvNumbers=findViewById<RecyclerView>(R.id.rvNumbers)
    rvNumbers.layoutManager=LinearLayoutManager(baseContext)
    var numbersAdapter=numbersRecyclerViewAdapter(Fibbonicci(100))
    rvNumbers.adapter=numbersAdapter
    }
}
fun Fibbonicci(nums:Int):List<BigInteger>{
    var answer= MutableList<BigInteger>(nums,{ BigInteger.ZERO})
    var num1=BigInteger.ZERO
    var num2=BigInteger.ONE

    answer[0]=num1
    answer[1]=num2

    for (n:Int in 1..nums) {
    val sum=num1+num2
        num1=num2
        num2=sum
        answer[n-1]=num1
    }
    return answer
}