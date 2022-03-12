package com.bekhruz.sportcars

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bekhruz.sportcars.adapter.ItemAdapter
import com.bekhruz.sportcars.databinding.ActivityMainBinding
import com.bekhruz.sportcars.layouttype.LayoutType

class MainActivity : AppCompatActivity() {
    private var isLinearLayoutManager = true
    private lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        recyclerView = binding.recyclerviewLinear
        recyclerView.hasFixedSize()
        chooseLayout()
    }

    private fun chooseLayout() {
        if(isLinearLayoutManager){
            recyclerView.layoutManager = LinearLayoutManager(this)
            recyclerView.adapter = ItemAdapter(this, LayoutType.LINEAR)
        }else {
            recyclerView.layoutManager = GridLayoutManager(this, 2)
            recyclerView.adapter = ItemAdapter(this, LayoutType.GRID)
        }

    }

    private fun setIcon(menuItem:MenuItem){
        menuItem.icon = when(isLinearLayoutManager){
            true -> ContextCompat.getDrawable(this, R.drawable.ic_view_grid)
            else -> ContextCompat.getDrawable(this, R.drawable.ic_view_list)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_layout, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.action_layout_switch -> {
                isLinearLayoutManager = !isLinearLayoutManager
                setIcon(item)
                chooseLayout()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }
}
