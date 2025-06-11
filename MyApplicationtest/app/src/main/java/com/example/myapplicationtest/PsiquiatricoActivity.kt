package com.example.myapplicationtest

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Switch
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class PsiquiatricoActivity : AppCompatActivity() {

    private lateinit var switchAnsiedade: Switch
    private lateinit var switchDepressao: Switch
    private lateinit var switchAlucinacoes: Switch
    private lateinit var switchInsonia: Switch
    private lateinit var etObservacoes: EditText
    private lateinit var btnSalvar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_psiquiatrico) // substitua pelo nome real do seu XML, se diferente

        switchAnsiedade = findViewById(R.id.switchAnsiedade)
        switchDepressao = findViewById(R.id.switchDepressao)
        switchAlucinacoes = findViewById(R.id.switchAlucinacoes)
        switchInsonia = findViewById(R.id.switchInsonia)
        etObservacoes = findViewById(R.id.etObservacoes)
        btnSalvar = findViewById(R.id.btnSalvarGeral)

        btnSalvar.setOnClickListener {
            val resultado = """
                Ansiedade: ${if (switchAnsiedade.isChecked) "Sim" else "Não"}
                Depressão: ${if (switchDepressao.isChecked) "Sim" else "Não"}
                Alucinações: ${if (switchAlucinacoes.isChecked) "Sim" else "Não"}
                Insônia: ${if (switchInsonia.isChecked) "Sim" else "Não"}
                Observações: ${etObservacoes.text}
            """.trimIndent()

            Toast.makeText(this, "Dados salvos:\n$resultado", Toast.LENGTH_LONG).show()
        }
    }
}
