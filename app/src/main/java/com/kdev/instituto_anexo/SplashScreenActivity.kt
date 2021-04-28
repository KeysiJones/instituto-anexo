package com.kdev.instituto_anexo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        val handle: Handler = Handler();

        handle.postDelayed({
            mostrarTelaInicial();
            finish();
        }, 2000);
    }

    private fun mostrarTelaInicial() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}