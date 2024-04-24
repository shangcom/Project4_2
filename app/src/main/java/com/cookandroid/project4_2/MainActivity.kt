package com.cookandroid.project4_2

import android.os.Bundle
import android.widget.ImageView
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Switch
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    lateinit var text1: TextView
    lateinit var chkAgree: Switch
    lateinit var rgroup1: RadioGroup
    lateinit var rdoOreo: RadioButton
    lateinit var rdoPie: RadioButton
    lateinit var rdoQ: RadioButton
    lateinit var imgVersion: ImageVersion

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        title = "안드로이드 사진 보기"

text1 = findViewById<TextView>(R.id.Text1)
        chkAgree=findViewById<Switch>(R.id.ChkAgree)
        rgroup1=findViewById<RadioGroup>(R.id.Rgroup1)
        rdoOreo=findViewById<RadioButton>(R.id.RdoOreo)
        rdoPie=findViewById<RadioButton>(R.id.RdoPie)
        rdoQ=findViewById<RadioButton>(R.id.RdoQ)
        imgVersion=findViewById(R.id.ImageVersion)

    }
}