package com.example.demo0212

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var leftNumber = 0
    var rightNumber = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        assignNumbers()
    }

    fun assignNumbers() {
        leftNumber = (0..100).random()
        rightNumber = (0+Math.random()*100).toInt()
    }

    fun buttonClick(button: View) {
        println("El numero derecho es $rightNumber y el izquierdo es $leftNumber")
        println("El usuario dio click en el boton ${button.id}")
        val result = findViewById<TextView>(R.id.txtResult)
        if(button.id == R.id.btnRight && rightNumber>leftNumber) {
            Toast.makeText(this, "Has ganado!", Toast.LENGTH_LONG).show()
            result.text = "Has ganado!!"
        }
        else if(button.id == R.id.btnLeft && rightNumber<leftNumber) {
            Toast.makeText(this, "Has ganado!", Toast.LENGTH_LONG).show()
            result.text = "Has ganado!!"
        }
        else {
            Toast.makeText(this, "Has perdido :(", Toast.LENGTH_LONG).show()
            result.text = "Has perdido :("
        }
        assignNumbers()
    }

    fun rightClick(p: View) {
        println("Di clic en el boton derecho")
        if(rightNumber>leftNumber) {
            Toast.makeText(this, "Has ganado!", Toast.LENGTH_LONG).show()
        }
        else {
            Toast.makeText(this, "Has perdido :(", Toast.LENGTH_LONG).show()
        }
        assignNumbers()
    }

    fun leftClick(p: View) {
        println("Di clic en el boton izquierdo")
        if(rightNumber<leftNumber) {
            Toast.makeText(this, "Has ganado!", Toast.LENGTH_LONG).show()
        }
        else {
            Toast.makeText(this, "Has perdido :(", Toast.LENGTH_LONG).show()
        }
        assignNumbers()
    }
}

