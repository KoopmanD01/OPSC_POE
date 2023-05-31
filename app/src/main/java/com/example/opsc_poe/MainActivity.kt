package com.example.opsc_poe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import com.example.opsc_poe.databinding.ActivityMainWithNavDrawerBinding
import com.google.android.material.navigation.NavigationView


class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

private lateinit var binding :ActivityMainWithNavDrawerBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainWithNavDrawerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.navToolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)
        var toggle = ActionBarDrawerToggle(this, binding.drawerLayout,binding.navToolbar,R.string.open_nav,R.string.close_nav)
        binding.drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        binding.navView.bringToFront()
        binding.navView.setNavigationItemSelectedListener(this)

    }

    override fun onBackPressed() {

        if(binding.drawerLayout.isDrawerOpen(GravityCompat.START))
        {
            binding.drawerLayout.isDrawerOpen(GravityCompat.START)
        }
        else
        {

            onBackPressed()
        }

    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when(item.itemId)
        {
            R.id.u_nav_Log -> openIntent(applicationContext,"",LoginPage::class.java)
            R.id.u_nav_Regist -> openIntent(applicationContext,"",RegisterPage::class.java)
            R.id.l_nav_bgraph -> openIntent(applicationContext,"",pieChart::class.java)
            R.id.l_nav_Dash  -> openIntent(applicationContext,"",Dashboard::class.java)
            R.id.l_nav_Calendar  -> openIntent(applicationContext,"",Calendar_User::class.java)
            R.id.l_nav_pTimer  -> openIntent(applicationContext,"",focusPage::class.java)
            R.id.l_nav_Timesheet  -> openIntent(applicationContext,"",TimesheetEntry::class.java)

        }
        binding.drawerLayout.closeDrawer(GravityCompat.START)
        return true;
    }


}