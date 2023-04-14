package com.example.shopping

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.shopping.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnProduct.setOnClickListener {
            replaceFragment(Fragment1())

        }
        binding.btnCheckout.setOnClickListener {
            replaceFragment(Fragment2())

        }
        binding.btnReview.setOnClickListener {
            replaceFragment(Fragment3())

        }
    }

    private fun replaceFragment(fragment : Fragment ) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragmentContainer, fragment)
        fragmentTransaction.commit()
    }
}