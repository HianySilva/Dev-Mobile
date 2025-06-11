package com.example.myapplicationtest
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class FormSymptomatologicActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.form_sintomatologia)

        findViewById<ImageButton>(R.id.btnVoltar).setOnClickListener {
            finish()
        }

        findViewById<Button>(R.id.btnGeral).setOnClickListener {
            startActivity(Intent(this, GeralActivity::class.java))
        }

        findViewById<Button>(R.id.btnRespiratorio).setOnClickListener {
            startActivity(Intent(this, RespiratorioActivity::class.java))
        }

        findViewById<Button>(R.id.btnInfecciosoInflamatorio).setOnClickListener {
            startActivity(Intent(this, InfecciosoActivity::class.java))
        }

        findViewById<Button>(R.id.btnCardiovascular).setOnClickListener {
            startActivity(Intent(this, CardiovascularActivity::class.java))
        }

        findViewById<Button>(R.id.btnGastrointestinal).setOnClickListener {
            startActivity(Intent(this, GastrointestinalActivity::class.java))
        }

        findViewById<Button>(R.id.btnNeurologico).setOnClickListener {
            startActivity(Intent(this, NeurologicoActivity::class.java))
        }

        findViewById<Button>(R.id.btnMusculoEsqueletico).setOnClickListener {
            startActivity(Intent(this, MusculoEsqueleticoActivity::class.java))
        }

        findViewById<Button>(R.id.btnHematologico).setOnClickListener {
            startActivity(Intent(this, HematologicoActivity::class.java))
        }

        findViewById<Button>(R.id.btnPsiquiatrico).setOnClickListener {
            startActivity(Intent(this, PsiquiatricoActivity::class.java))
        }
    }
}
