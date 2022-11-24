package com.example.latihantoolbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbar_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.tbnAddContact -> Toast.makeText(this, "Kamu menekan Add Contact", Toast.LENGTH_LONG).show()
            R.id.tbnFavorite -> Toast.makeText(this, "Kamu menekan Favorite", Toast.LENGTH_LONG).show()
            R.id.tbnFeedback -> Toast.makeText(this, "Kamu menekan Feedback", Toast.LENGTH_LONG).show()
            R.id.tbnSetting -> Toast.makeText(this, "Kamu menekan Setting", Toast.LENGTH_LONG).show()
            R.id.tbnClose -> Toast.makeText(this, "Kamu menekan Close", Toast.LENGTH_LONG).show()
        }
        return true
    }
}