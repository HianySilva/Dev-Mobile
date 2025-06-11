package com.example.myapplicationtest

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Switch
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class RespiratorioActivity : AppCompatActivity() {

    private lateinit var swTosse: Switch
    private lateinit var swFaltaDeAr: Switch
    private lateinit var swDorToracica: Switch
    private lateinit var swEspirros: Switch
    private lateinit var swCoriza: Switch
    private lateinit var etObservacoes: EditText
    private lateinit var btnSalvarRespiratorio: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_respiratorio) // substitua pelo nome real do seu XML, se diferente

        swTosse = findViewById(R.id.swTosse)
        swFaltaDeAr = findViewById(R.id.swFaltaDeAr)
        swDorToracica = findViewById(R.id.swDorToracica)
        swEspirros = findViewById(R.id.swEspirros)
        swCoriza = findViewById(R.id.swCoriza)
        etObservacoes = findViewById(R.id.etObservacoes)
        btnSalvarRespiratorio = findViewById(R.id.btnSalvarRespiratorio)

        btnSalvarRespiratorio.setOnClickListener {
            val resultado = """
                Tosse: ${if (swTosse.isChecked) "Sim" else "Não"}
                Falta de ar: ${if (swFaltaDeAr.isChecked) "Sim" else "Não"}
                Dor torácica ao respirar: ${if (swDorToracica.isChecked) "Sim" else "Não"}
                Espirros: ${if (swEspirros.isChecked) "Sim" else "Não"}
                Coriza: ${if (swCoriza.isChecked) "Sim" else "Não"}
                Observações: ${etObservacoes.text}
            """.trimIndent()

            Toast.makeText(this, "Dados salvos:\n$resultado", Toast.LENGTH_LONG).show()
        }
    }
}
