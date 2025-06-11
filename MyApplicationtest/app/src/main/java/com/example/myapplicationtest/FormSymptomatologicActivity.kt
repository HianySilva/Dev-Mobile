package com.example.myapplicationtest

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import android.view.LayoutInflater
import com.seuapp.R

class FormSymptomatologicActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.form_sintomatologia)

        findViewById<ImageButton>(R.id.btnVoltar).setOnClickListener {
            finish()
        }

        findViewById<Button>(R.id.btnGeral).setOnClickListener {
            showFormDialog(R.layout.dialog_form_geral)
        }

        findViewById<Button>(R.id.btnRespiratorio).setOnClickListener {
            showFormDialog(R.layout.dialog_form_respiratorio)
        }
        findViewById<Button>(R.id.btnInfecciosoInflamatorio).setOnClickListener {
            showFormDialog(R.layout.dialog_form_infeccioso)
        }
        findViewById<Button>(R.id.btnCardiovascular).setOnClickListener {
            showFormDialog(R.layout.dialog_form_cardiovascular)
        }
        findViewById<Button>(R.id.btnGastrointestinal).setOnClickListener {
            showFormDialog(R.layout.dialog_form_Gastrointestinal)
        }
        findViewById<Button>(R.id.btnNeurologico).setOnClickListener {
            showFormDialog(R.layout.dialog_form_Neurologico)
        }
        findViewById<Button>(R.id.btnMusculoEsqueletico).setOnClickListener {
            showFormDialog(R.layout.dialog_form_Musculo)
        }
        findViewById<Button>(R.id.btnHematologico).setOnClickListener {
            showFormDialog(R.layout.dialog_form_Hematologico)
        }
        findViewById<Button>(R.id.btnPsiquiatrico).setOnClickListener {
            showFormDialog(R.layout.dialog_form_Psiquiatrico)
        }
    }

    private fun showFormDialog(layoutResId: Int) {
        val builder = AlertDialog.Builder(this)
        val inflater = LayoutInflater.from(this)
        val dialogView = inflater.inflate(layoutResId, null)
        builder.setView(dialogView)

        builder.setPositiveButton("Salvar") { dialog, _ ->

            when (layoutResId) {
                R.layout.dialog_form_geral -> {
                    // Exemplo: pegar campos do formulário geral
                    val febre = dialogView.findViewById<EditText>(R.id.rgFebre)?.text.toString()
                    val cansaco = dialogView.findViewById<EditText>(R.id.rgCansaco)?.text.toString()
                    val sudorese = dialogView.findViewById<EditText>(R.id.rgSudorese)?.text.toString()
                    val PerdaPeso = dialogView.findViewById<EditText>(R.id.rgPerdaPeso)?.text.toString()

                    // ... pegue os outros campos que você criou
                    Toast.makeText(this, "Geral: Febre=$febre, Cansaço=$cansaco", Toast.LENGTH_LONG).show()
                }

                R.layout.dialog_form_respiratorio -> {
                    val campo1 = dialogView.findViewById<EditText>(R.id.etRespCampo1)?.text.toString()
                    val campo2 = dialogView.findViewById<EditText>(R.id.etRespCampo2)?.text.toString()
                    Toast.makeText(this, "Respiratório: $campo1, $campo2", Toast.LENGTH_LONG).show()
                }

                R.layout.dialog_form_infeccioso -> {
                    val campo1 = dialogView.findViewById<EditText>(R.id.etInfecciosoCampo1)?.text.toString()
                    Toast.makeText(this, "Infeccioso/Inflamatório: $campo1", Toast.LENGTH_LONG).show()
                }

                R.layout.dialog_form_cardiovascular -> {
                    val campo1 = dialogView.findViewById<EditText>(R.id.etCardioCampo1)?.text.toString()
                    Toast.makeText(this, "Cardiovascular: $campo1", Toast.LENGTH_LONG).show()
                }

                R.layout.dialog_form_Gastrointestinal -> {
                    val campo1 = dialogView.findViewById<EditText>(R.id.etGastroCampo1)?.text.toString()
                    Toast.makeText(this, "Gastrointestinal: $campo1", Toast.LENGTH_LONG).show()
                }

                R.layout.dialog_form_Neurologico -> {
                    val campo1 = dialogView.findViewById<EditText>(R.id.etNeuroCampo1)?.text.toString()
                    Toast.makeText(this, "Neurológico: $campo1", Toast.LENGTH_LONG).show()
                }

                R.layout.dialog_form_Musculo -> {
                    val campo1 = dialogView.findViewById<EditText>(R.id.etMusculoCampo1)?.text.toString()
                    Toast.makeText(this, "Musculoesquelético: $campo1", Toast.LENGTH_LONG).show()
                }

                R.layout.dialog_form_Hematologico -> {
                    val campo1 = dialogView.findViewById<EditText>(R.id.etHematoCampo1)?.text.toString()
                    Toast.makeText(this, "Hematológico: $campo1", Toast.LENGTH_LONG).show()
                }

                R.layout.dialog_form_Psiquiatrico -> {
                    val campo1 = dialogView.findViewById<EditText>(R.id.etPsiquiatricoCampo1)?.text.toString()
                    Toast.makeText(this, "Psiquiátrico: $campo1", Toast.LENGTH_LONG).show()
                }
            }

            dialog.dismiss()
        }

        builder.setNegativeButton("Cancelar") { dialog, _ ->
            dialog.dismiss()
        }

        builder.create().show()
    }
}
