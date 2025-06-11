package com.example.myapplicationtest

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Switch
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class GastrointestinalActivity : AppCompatActivity() {

    private lateinit var switchNausea: Switch
    private lateinit var switchVomito: Switch
    private lateinit var switchDorAbdominal: Switch
    private lateinit var switchDiarreia: Switch
    private lateinit var switchConstipacao: Switch
    private lateinit var etObservacoes: EditText
    private lateinit var btnSalvar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gastrointestinal)

        switchNausea = findViewById(R.id.switchNausea)
        switchVomito = findViewById(R.id.switchVomito)
        switchDorAbdominal = findViewById(R.id.switchDorAbdominal)
        switchDiarreia = findViewById(R.id.switchDiarreia)
        switchConstipacao = findViewById(R.id.switchConstipacao)
        etObservacoes = findViewById(R.id.etObservacoes)
        btnSalvar = findViewById(R.id.btnSalvarGastrointestinal)

        btnSalvar.setOnClickListener {
            val resultado = """
                Náusea: ${if (switchNausea.isChecked) "Sim" else "Não"}
                Vômito: ${if (switchVomito.isChecked) "Sim" else "Não"}
                Dor abdominal: ${if (switchDorAbdominal.isChecked) "Sim" else "Não"}
                Diarreia: ${if (switchDiarreia.isChecked) "Sim" else "Não"}
                Constipação: ${if (switchConstipacao.isChecked) "Sim" else "Não"}
                Observações: ${etObservacoes.text}
            """.trimIndent()

            Toast.makeText(this, "Dados salvos:\n$resultado", Toast.LENGTH_LONG).show()
        }
    }
}
