package com.example.myapplicationtest

package com.seuapp.exemplo

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Switch
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class HematologicoActivity : AppCompatActivity() {

    private lateinit var swSangramento: Switch
    private lateinit var swHematomas: Switch
    private lateinit var swFraqueza: Switch
    private lateinit var etObservacoes: EditText
    private lateinit var btnSalvar: Button
    private lateinit var ivAnexar: ImageView
    private lateinit var tvAnexar: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hematologico)

        // Inicializa os componentes
        swSangramento = findViewById(R.id.swSangramento)
        swHematomas = findViewById(R.id.swHematomas)
        swFraqueza = findViewById(R.id.swFraquezamuscular)
        etObservacoes = findViewById(R.id.etObservacoes)
        btnSalvar = findViewById(R.id.btnSalvarGeral)
        ivAnexar = findViewById(R.id.ivAnexar)
        tvAnexar = findViewById(R.id.tvAnexar)

        // Ação do botão salvar
        btnSalvar.setOnClickListener {
            val sangramento = if (swSangramento.isChecked) "Sim" else "Não"
            val hematomas = if (swHematomas.isChecked) "Sim" else "Não"
            val fraqueza = if (swFraqueza.isChecked) "Sim" else "Não"
            val observacoes = etObservacoes.text.toString()

            // Aqui você pode salvar no banco de dados, enviar para API etc.
            val resumo = """
                Sangramento: $sangramento
                Hematomas: $hematomas
                Fraqueza: $fraqueza
                Observações: $observacoes
            """.trimIndent()

            Toast.makeText(this, "Dados salvos:\n$resumo", Toast.LENGTH_LONG).show()
        }

        // Ação para anexar exames (simulado)
        ivAnexar.setOnClickListener {
            Toast.makeText(this, "Abrir seletor de arquivos...", Toast.LENGTH_SHORT).show()
        }

        tvAnexar.setOnClickListener {
            Toast.makeText(this, "Abrir seletor de arquivos...", Toast.LENGTH_SHORT).show()
        }
    }
}
