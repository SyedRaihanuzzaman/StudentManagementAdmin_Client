package com.raihan.studentmanagementclient

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.raihan.studentmanagementclient.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.searchBtn.setOnClickListener {
            val name = binding.snameEtxt.text.toString()
            val phone = binding.sphoneEtxt.text.toString()

            if (name.isNotEmpty() && phone.isNotEmpty()){
                getData(name,phone)
            }
            else{
                Toast.makeText(this@MainActivity,"Please Fill All the Fields",Toast.LENGTH_SHORT).show()
            }
        }

    }

    private fun getData(name: String, phone: String) {

    }
}