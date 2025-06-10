package com.seuapp.sintomatologia

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import com.seuapp.R

class FormSymptomatologicActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form_sintomatologia)

        // Botão de voltar
        val btnVoltar = findViewById<ImageButton>(R.id.btnVoltar)
        btnVoltar.setOnClickListener {
            finish() // volta para a tela anterior
        }

        // Botões das áreas
        findViewById<Button>(R.id.btnGeral).setOnClickListener {
            val intent = Intent(this, GeralPopupActivity::class.java)
            startActivity(intent)
        }

        findViewById<Button>(R.id.btnRespiratorio).setOnClickListener {
            val intent = Intent(this, RespiratorioPopupActivity::class.java)
            startActivity(intent)
        }

        findViewById<Button>(R.id.btnInfeccioso).setOnClickListener {
            val intent = Intent(this, InfecciosoPopupActivity::class.java)
            startActivity(intent)
        }

        findViewById<Button>(R.id.btnCardio).setOnClickListener {
            val intent = Intent(this, CardiovascularPopupActivity::class.java)
            startActivity(intent)
        }

        findViewById<Button>(R.id.btnGastro).setOnClickListener {
            val intent = Intent(this, GastrointestinalPopupActivity::class.java)
            startActivity(intent)
        }

        findViewById<Button>(R.id.btnNeuro).setOnClickListener {
            val intent = Intent(this, NeurologicoPopupActivity::class.java)
            startActivity(intent)
        }

        findViewById<Button>(R.id.btnMusculo).setOnClickListener {
            val intent = Intent(this, MusculoEsqueleticoPopupActivity::class.java)
            startActivity(intent)
        }

        findViewById<Button>(R.id.btnHemaPsiq).setOnClickListener {
            val intent = Intent(this, HematologicoPsiquiatricoPopupActivity::class.java)
            startActivity(intent)
        }
    }
}
