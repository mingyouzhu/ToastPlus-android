package com.soft.onlly.android

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.soft.onlly.toastplus.ToastPlus
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn1.setOnClickListener({view ->
            Toast.makeText(this,"测试系统Toast!丫丫丫丫丫呦呦呦呦呦呦....",Toast.LENGTH_SHORT).show()
        })

        btn2.setOnClickListener({view ->
            ToastPlus.show(this,"测试自定义Toast!丫丫丫丫丫呦呦呦呦呦呦....")
        })
    }
}
