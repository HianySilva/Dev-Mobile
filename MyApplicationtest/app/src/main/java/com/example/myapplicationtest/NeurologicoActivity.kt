package com.example.myapplicationtest

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Switch
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class NeurologicoActivity : AppCompatActivity() {

    private lateinit var switchCabeca: Switch
    private lateinit var switchMental: Switch
    private lateinit var switchConvulsoes: Switch
    private lateinit var switchNeuropatica: Switch
    private lateinit var switchParestesia: Switch
    private lateinit var switchParesia: Switch
    private lateinit var switchPlegia: Switch
    private lateinit var etObservacoes: EditText
    private lateinit var btnSalvar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_neurologico) // seu XML correto

        switchCabeca = findViewById(R.id.switchCabeca)
        switchMental = findViewById(R.id.switchMental)
        switchConvulsoes = findViewById(R.id.switchConvulsoes)
        switchNeuropatica = findViewById(R.id.switchNeuropatica)
        switchParestesia = findViewById(R.id.switchParestesia)
        switchParesia = findViewById(R.id.switchParesia)
        switchPlegia = findViewById(R.id.switchPlegia)
        etObservacoes = findViewById(R.id.etObservacoes)
        btnSalvar = findViewById(R.id.btnSalvarGeral)

        btnSalvar.setOnClickListener {
            val resultado = """
                Dor de cabeça: ${if (switchCabeca.isChecked) "Sim" else "Não"}
                Confusão mental: ${if (switchMental.isChecked) "Sim" else "Não"}
                Convulsões: ${if (switchConvulsoes.isChecked) "Sim" else "Não"}
                Dor neuropática: ${if (switchNeuropatica.isChecked) "Sim" else "Não"}
                Parestesia: ${if (switchParestesia.isChecked) "Sim" else "Não"}
                Paresia: ${if (switchParesia.isChecked) "Sim" else "Não"}
                Plegia: ${if (switchPlegia.isChecked) "Sim" else "Não"}
                Observações: ${etObservacoes.text}
            """.trimIndent()

            Toast.makeText(this, "Dados salvos:\n$resultado", Toast.LENGTH_LONG).show()
        }
    }
}
