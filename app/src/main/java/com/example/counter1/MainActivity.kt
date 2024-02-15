package com.example.counter1

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.counter1.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity(), View {
    private lateinit var presenter: Presenter
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        presenter = Presenter(this)
        initListener()
    }

    private fun initListener() {
        with(binding) {
            btnPlus.setOnClickListener {
                presenter.plus()
            }
            btnMinus.setOnClickListener {
                presenter.minus()
            }
        }
    }

    override fun setNumber(count: Int) {
        binding.tvNumber.text = count.toString()
    }

    override fun setColorGreen(color: Int) {
        binding.tvNumber.setTextColor(Color.GREEN)
    }

    override fun setColorWhite(color: Int) {
        binding.tvNumber.setTextColor(Color.WHITE)
    }
}