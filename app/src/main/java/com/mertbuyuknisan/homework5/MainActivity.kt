package com.mertbuyuknisan.homework5

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.mertbuyuknisan.homework5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var firstNum: Double?=null
    private var secondNum: Double?=null
    private var operation: String?=null
    private var currentInput: String=""
    private var displayText: String=""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.buttonSifir.setOnClickListener {
            currentInput+=binding.buttonSifir.text.toString()
            binding.textViewEkran.text=currentInput
        }
        binding.buttonBir.setOnClickListener {
            currentInput+=binding.buttonBir.text.toString()
            binding.textViewEkran.text=currentInput
        }
        binding.buttonIki.setOnClickListener {
            currentInput+=binding.buttonIki.text.toString()
            binding.textViewEkran.text=currentInput
        }
        binding.buttonUc.setOnClickListener {
            currentInput+=binding.buttonUc.text.toString()
            binding.textViewEkran.text=currentInput
        }
        binding.buttonDort.setOnClickListener {
            currentInput+=binding.buttonDort.text.toString()
            binding.textViewEkran.text=currentInput
        }
        binding.buttonBes.setOnClickListener {
            currentInput+=binding.buttonBes.text.toString()
            binding.textViewEkran.text=currentInput
        }
        binding.buttonAlti.setOnClickListener {
            currentInput+=binding.buttonAlti.text.toString()
            binding.textViewEkran.text=currentInput
        }
        binding.buttonYedi.setOnClickListener {
            currentInput+=binding.buttonYedi.text.toString()
            binding.textViewEkran.text=currentInput
        }
        binding.buttonSekiz.setOnClickListener {
            currentInput+=binding.buttonSekiz.text.toString()
            binding.textViewEkran.text=currentInput
        }
        binding.buttonDok.setOnClickListener {
            currentInput+=binding.buttonDok.text.toString()
            binding.textViewEkran.text=currentInput
        }
        binding.buttonTopla.setOnClickListener {
            if (currentInput.isNotEmpty()) {
                firstNum = currentInput.toDouble()
                operation = "+"
                currentInput = ""
            }
        }

        // "=" butonu
        binding.buttonEsittir.setOnClickListener {
            if (currentInput.isNotEmpty() && firstNum != null && operation == "+") {
                secondNum = currentInput.toDouble()
                val result = firstNum!!+secondNum!!
                binding.textViewEkran.text = result.toString()
                firstNum = null
                operation = null
                currentInput = ""
            }
        }
        binding.buttonSil.setOnClickListener {
            firstNum = null
            secondNum = null
            operation = null
            currentInput = ""
            binding.textViewEkran.text = "0"
        }

    }

}