package com.kdev.instituto_anexo

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<NavigationView>(R.id.nav_view).setNavigationItemSelectedListener {
            when(it.itemId) {
                R.id.btn_contato_desenvolvedor  -> {
                    Toast.makeText(this, "Abrindo o WhatsApp... aguarde", Toast.LENGTH_SHORT).show()
                    launchWppUrl("https://api.whatsapp.com/send/?phone=5551985236176&text=Oi&app_absent=0")
                }

                R.id.menu_cancel_nav_view -> {
                    Toast.makeText(this, "Para fechar, deslize para a esquerda", Toast.LENGTH_LONG).show()
                }

                else -> {
                    Toast.makeText(this, "Else", Toast.LENGTH_SHORT).show()
                }
            }

            true
        }
    }

    private fun launchWppUrl(uri: String) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(uri))
        intent.setPackage("com.whatsapp")

        if (packageManager?.let { intent.resolveActivity(it) } != null) {
            startActivity(intent)
        }
    }

}