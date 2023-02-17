package com.example.demo0212

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var leftNumber = (0..100).random()
    var rightNumber = (0+Math.random()*100).toInt()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun rightClick(p: View) {
        println("Di clic en el boton derecho")
        if(rightNumber>leftNumber) {
            Toast.makeText(this, "Has ganado!", Toast.LENGTH_LONG).show()
        }
        else {
            Toast.makeText(this, "Has perdido :(", Toast.LENGTH_LONG).show()
        }
        leftNumber = (0..100).random()
        rightNumber = (0+Math.random()*100).toInt()
    }

    fun leftClick(p: View) {
        println("Di clic en el boton izquierdo")
        if(rightNumber<leftNumber) {
            Toast.makeText(this, "Has ganado!", Toast.LENGTH_LONG).show()
        }
        else {
            Toast.makeText(this, "Has perdido :(", Toast.LENGTH_LONG).show()
        }
        leftNumber = (0..100).random()
        rightNumber = (0+Math.random()*100).toInt()
    }
}

