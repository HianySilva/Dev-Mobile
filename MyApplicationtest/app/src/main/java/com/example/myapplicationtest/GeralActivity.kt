package com.example.myapplicationtest

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Switch
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplicationtest.R

class GeralActivity : AppCompatActivity() {

    private lateinit var switchFebre: Switch
    private lateinit var switchCansaco: Switch
    private lateinit var switchSudorese: Switch
    private lateinit var switchPerdaPeso: Switch
    private lateinit var switchInchaco: Switch
    private lateinit var etObservacoes: EditText
    private lateinit var btnSalvar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_geral)

        switchFebre = findViewById(R.id.switchFebre)
        switchCansaco = findViewById(R.id.switchCansaco)
        switchSudorese = findViewById(R.id.switchSudorese)
        switchPerdaPeso = findViewById(R.id.switchPerdaPeso)
        switchInchaco = findViewById(R.id.switchInchaco)
        etObservacoes = findViewById(R.id.etObservacoes)
        btnSalvar = findViewById(R.id.btnSalvarGeral)

        btnSalvar.setOnClickListener {
            val resultado = """
                Febre: ${if (switchFebre.isChecked) "Sim" else "Não"}
                Cansaço/Fadiga: ${if (switchCansaco.isChecked) "Sim" else "Não"}
                Sudorese: ${if (switchSudorese.isChecked) "Sim" else "Não"}
                Perda de peso: ${if (switchPerdaPeso.isChecked) "Sim" else "Não"}
                Inchaço: ${if (switchInchaco.isChecked) "Sim" else "Não"}
                Observações: ${etObservacoes.text}
            """.trimIndent()

            Toast.makeText(this, "Dados salvos:\n$resultado", Toast.LENGTH_LONG).show()
        }
    }
}
