package com.bigbang.favoritebooksdb

import android.util.Log
import androidx.databinding.BaseObservable
import androidx.databinding.Bindable

class BookViewModel: BaseObservable() {

    @get: Bindable
    var bookTitle: String = "Twilight: The Series"
    set(value) {
        field = value
        notifyPropertyChanged(BR.bookTitle)
    }


    fun changBookTitle(){


       val thread =  Thread{
            Log.d("TAG_X", Thread.currentThread().name)
            bookTitle = "Counting : "

            for(i in 0 until 100){

                Thread.sleep(1000)
                bookTitle += i

            }
        }

        thread.name = "Dalo Thread"


           thread.start()


    }

}