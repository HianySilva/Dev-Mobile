package com.example.myapplicationtest

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Switch
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class CardiovascularActivity : AppCompatActivity() {

    private lateinit var switchPalpitacoes: Switch
    private lateinit var switchDorPeito: Switch
    private lateinit var switchTontura: Switch
    private lateinit var switchPressao: Switch
    private lateinit var switchExtremidadesFrias: Switch
    private lateinit var etObservacoes: EditText
    private lateinit var btnSalvar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cardiovascular)

        switchPalpitacoes = findViewById(R.id.switchPalpitacoes)
        switchDorPeito = findViewById(R.id.switchDorPeito)
        switchTontura = findViewById(R.id.switchTontura)
        switchPressao = findViewById(R.id.switchPressao)
        switchExtremidadesFrias = findViewById(R.id.switchExtremidades)
        etObservacoes = findViewById(R.id.etObservacoes)
        btnSalvar = findViewById(R.id.btnSalvarGeral)

        btnSalvar.setOnClickListener {
            val resultado = """
                Palpitações: ${if (switchPalpitacoes.isChecked) "Sim" else "Não"}
                Dor no peito: ${if (switchDorPeito.isChecked) "Sim" else "Não"}
                Tontura/Desmaio: ${if (switchTontura.isChecked) "Sim" else "Não"}
                Pressão Arterial: ${if (switchPressao.isChecked) "Sim" else "Não"}
                Extremidades Frias: ${if (switchExtremidadesFrias.isChecked) "Sim" else "Não"}
                Observações: ${etObservacoes.text}
            """.trimIndent()

            Toast.makeText(this, "Dados salvos:\n$resultado", Toast.LENGTH_LONG).show()
        }
    }
}
