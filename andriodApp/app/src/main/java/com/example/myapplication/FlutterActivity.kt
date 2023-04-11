package com.example.myapplication
import io.flutter.embedding.android.FlutterActivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class FlutterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_flutter)
        startActivity(
            FlutterActivity.createDefaultIntent(this)
        )
    }
}