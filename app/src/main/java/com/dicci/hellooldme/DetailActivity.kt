package com.dicci.hellooldme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailActivity : AppCompatActivity() {
    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_DATE = "extra_date"
        const val EXTRA_DETAIL = "extra_detail"
        const val EXTRA_SOURCE = "extra_source"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        //actionbar
        val actionbar = supportActionBar
        //set actionbar title
        actionbar!!.title = "Detail"
        //set back button
        actionbar.setDisplayHomeAsUpEnabled(true)


        val tvImageReceived: ImageView = findViewById(R.id.detail_image)
        val tvNameReceived: TextView = findViewById(R.id.detail_moment)
        val tvDateReceived: TextView = findViewById(R.id.detail_date)
        val tvDetailReceived:TextView = findViewById(R.id.detail_detail)
        val tvSourceReceived:TextView = findViewById(R.id.detail_source)

        val name = intent.getStringExtra(EXTRA_NAME)
        val date = intent.getStringExtra(EXTRA_DATE)
        val detail = intent.getStringExtra(EXTRA_DETAIL)
        val source = intent.getStringExtra(EXTRA_SOURCE)
        val bundle: Bundle = intent.extras!!
        val resId: Int = bundle.getInt("resId")
        tvImageReceived.setImageResource(resId)
        tvNameReceived.text=name
        tvDateReceived.text=date
        tvDetailReceived.text=detail
        tvSourceReceived.text=source
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}