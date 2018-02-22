package com.acgow.fatamaterialcalc

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*





class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loginBtn.setOnClickListener{v ->  this.onClick(v)};


    }
   private  fun onClick(v: View){
        showToast("login");
        val intent = Intent(this@MainActivity, LoginActivity::class.java)
        startActivity(intent)
    }

    private fun showToast(str:String){
        Toast.makeText(this,str,Toast.LENGTH_LONG).show();
    }
}
