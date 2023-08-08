package com.helinavci.ogrencibilgileri

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import com.helinavci.ogrencibilgileri.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var tasarim : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        tasarim = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(tasarim.root)
        val tc = tasarim.TC.text
        val password = tasarim.password.text
        tasarim.button.setOnClickListener {
            if(tc.isEmpty() || password.isEmpty()){
                Snackbar.make(it , "lütfen bütün değerleri giriniz." , Snackbar.LENGTH_SHORT).show()
            }else{
                val newIntent = Intent(this@MainActivity , welcomePage :: class.java)
                startActivity(newIntent)
            }
        }
    }
}