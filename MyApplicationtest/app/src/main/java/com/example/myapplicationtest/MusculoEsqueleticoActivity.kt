package com.example.myapplicationtest


import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Switch
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MusculoEsqueleticoActivity : AppCompatActivity() {

    private lateinit var switchDorArticular: Switch
    private lateinit var switchRigidezMuscular: Switch
    private lateinit var switchFraquezaMuscular: Switch
    private lateinit var switchInchacoArticulacoes: Switch
    private lateinit var etObservacoes: EditText
    private lateinit var btnSalvar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_musculo_esqueletico) // troque pelo seu XML correto

        switchDorArticular = findViewById(R.id.switchDorArticular)
        switchRigidezMuscular = findViewById(R.id.switchRigidezMuscular)
        switchFraquezaMuscular = findViewById(R.id.switchFraquezaMuscular)
        switchInchacoArticulacoes = findViewById(R.id.switchInchacoArticulacoes)
        etObservacoes = findViewById(R.id.etObservacoes)
        btnSalvar = findViewById(R.id.btnSalvarGeral)

        btnSalvar.setOnClickListener {
            val resultado = """
                Dor articular: ${if (switchDorArticular.isChecked) "Sim" else "Não"}
                Rigidez muscular: ${if (switchRigidezMuscular.isChecked) "Sim" else "Não"}
                Fraqueza muscular: ${if (switchFraquezaMuscular.isChecked) "Sim" else "Não"}
                Inchaço nas articulações: ${if (switchInchacoArticulacoes.isChecked) "Sim" else "Não"}
                Observações: ${etObservacoes.text}
            """.trimIndent()

            Toast.makeText(this, "Dados salvos:\n$resultado", Toast.LENGTH_LONG).show()
        }
    }
}
