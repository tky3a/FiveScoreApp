package com.example.fivescoreapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class GameOver : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_over)

        val btnReplay: Button = findViewById(R.id.btnReplay)

        btnReplay.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            // 前の画面を再度呼び出す
            startActivity(intent)
            // finish()はあくまで現在の画面を外に出す(stackを外すだけ)
            finish()
        }
    }
}