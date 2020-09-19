package com.dicci.hellooldme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvMoment: RecyclerView
    private var list: ArrayList<Moment> = arrayListOf()
    private fun showSelectedMoment(moment: Moment) {
        Toast.makeText(this, "Membuka detail " + moment.name, Toast.LENGTH_SHORT).show()
        val moveWithDataIntent = Intent(this@MainActivity, DetailActivity::class.java)
        moveWithDataIntent.putExtra(DetailActivity.EXTRA_NAME, moment.name)
        moveWithDataIntent.putExtra(DetailActivity.EXTRA_DATE, moment.date)
        moveWithDataIntent.putExtra(DetailActivity.EXTRA_DETAIL,moment.detail)
        moveWithDataIntent.putExtra(DetailActivity.EXTRA_SOURCE,moment.source)
        moveWithDataIntent.putExtra("resId",moment.photo)

       startActivity(moveWithDataIntent)

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvMoment = findViewById(R.id.rv_moment)
        rvMoment.setHasFixedSize(true)

        list.addAll(MomentData.listData)
        showRecyclerList()
    }
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    private fun showRecyclerList() {
        rvMoment.layoutManager = LinearLayoutManager(this)
        val listHeroAdapter = ListMomentAdapter(list)
        rvMoment.adapter = listHeroAdapter
        listHeroAdapter.setOnItemClickCallback(object : ListMomentAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Moment) {
                showSelectedMoment(data)
            }
        })
    }
    override fun onOptionsItemSelected(item: MenuItem) = when (item.itemId) {
        R.id.action_about -> {
            val moveIntent = Intent(this@MainActivity, AboutActivity::class.java)
            startActivity(moveIntent)
            true
        }

        else -> {
            // If we got here, the user's action was not recognized.
            // Invoke the superclass to handle it.
            super.onOptionsItemSelected(item)
        }
    }
}