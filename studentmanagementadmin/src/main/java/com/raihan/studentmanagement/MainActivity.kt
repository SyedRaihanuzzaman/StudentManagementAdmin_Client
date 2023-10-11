package com.raihan.studentmanagement

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.raihan.studentmanagement.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.addBtn.setOnClickListener {
            startActivity(Intent(this@MainActivity,AddActivity::class.java))
            finish()
        }

        binding.updateBtn.setOnClickListener {
            startActivity(Intent(this@MainActivity,UpdateActivity::class.java))
            finish()
        }

        binding.deleteBtn.setOnClickListener {
            startActivity(Intent(this@MainActivity,DeleteActivity::class.java))
            finish()
        }
    }
}