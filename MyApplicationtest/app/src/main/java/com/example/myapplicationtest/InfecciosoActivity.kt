package com.example.myapplicationtest

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Switch
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class InfecciosoActivity : AppCompatActivity() {

    private lateinit var switchGarganta: Switch
    private lateinit var switchLinfonodos: Switch
    private lateinit var switchErupcao: Switch
    private lateinit var switchUlceras: Switch
    private lateinit var etObservacoes: EditText
    private lateinit var btnSalvarGeral: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_infeccioso)  // Ajuste para o nome correto do XML

        switchGarganta = findViewById(R.id.switchGarganta)
        switchLinfonodos = findViewById(R.id.switchLinfonodos)
        switchErupcao = findViewById(R.id.switchErupcao)
        switchUlceras = findViewById(R.id.switchUlceras)
        etObservacoes = findViewById(R.id.etObservacoes)
        btnSalvarGeral = findViewById(R.id.btnSalvarGeral)

        btnSalvarGeral.setOnClickListener {
            val resultado = """
                Dor de garganta: ${if (switchGarganta.isChecked) "Sim" else "Não"}
                Linfonodos inchados: ${if (switchLinfonodos.isChecked) "Sim" else "Não"}
                Erupção Cutânea: ${if (switchErupcao.isChecked) "Sim" else "Não"}
                Úlceras na boca: ${if (switchUlceras.isChecked) "Sim" else "Não"}
                Observações: ${etObservacoes.text}
            """.trimIndent()

            Toast.makeText(this, "Dados salvos:\n$resultado", Toast.LENGTH_LONG).show()
        }
    }
}

