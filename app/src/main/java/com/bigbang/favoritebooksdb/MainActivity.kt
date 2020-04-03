package com.bigbang.favoritebooksdb

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.bigbang.favoritebooksdb.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    private lateinit var binding: ActivityMainBinding
    private lateinit var bookViewModel: BookViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)

        bookViewModel = BookViewModel()
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.bookViewModel = bookViewModel

        bookViewModel.changBookTitle()
    }
}
