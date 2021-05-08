package com.kdev.instituto_anexo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        val handle = Handler();

        handle.postDelayed({
            mostrarTelaInicial();
            finish();
        }, 1500);
    }

    private fun mostrarTelaInicial() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}