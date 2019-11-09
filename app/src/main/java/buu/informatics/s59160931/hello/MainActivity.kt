package buu.informatics.s59160931.hello

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import android.widget.Toast
import android.widget.Toolbar
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.databinding.DataBindingUtil
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import buu.informatics.s59160931.hello.databinding.ActivityMainBinding
import com.google.android.material.navigation.NavigationView
import timber.log.Timber

class MainActivity : AppCompatActivity() {
    private lateinit var drawerLayout: DrawerLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
        drawerLayout = binding.drawerLayout
        val navController = this.findNavController(R.id.myNavHostFragment)
        NavigationUI.setupActionBarWithNavController(this,navController)
        NavigationUI.setupWithNavController(binding.navView, navController)
        NavigationUI.setupActionBarWithNavController(this, navController, drawerLayout)
        Timber.i("onCreate called")
    }
        override fun onSupportNavigateUp(): Boolean {
           val navController = this.findNavController(R.id.myNavHostFragment)
           return NavigationUI.navigateUp(navController, drawerLayout)
   }
        override fun onStart() {
            super.onStart()
            Timber.i("onStart Called")
        }
        override fun onResume() {
            super.onResume()
            Timber.i("onResume Called")
        }

        override fun onPause() {
            super.onPause()
            Timber.i("onPause Called")
        }

        override fun onStop() {
            super.onStop()
            Timber.i("onStop Called")
        }

        override fun onDestroy() {
            super.onDestroy()
            Timber.i("onDestroy Called")
        }

        override fun onRestart() {
            super.onRestart()
            Timber.i("onRestart Called")
        }
}

