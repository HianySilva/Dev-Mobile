package com.example.sistema_huoc

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {

    private lateinit var btnLogin: Button
    private lateinit var editTextEmail: EditText
    private lateinit var editTextSenha: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        // Ligando os campos
        editTextEmail = findViewById(R.id.editTextEmail)
        editTextSenha = findViewById(R.id.editTextSenha)
        btnLogin = findViewById(R.id.btnLogin)

        // Dados mocados para enfermeiro e médico
        val usuariosMock = mapOf(
            "medico@huoc.com" to Pair("med123", "médico"),
            "enfermeiro@huoc.com" to Pair("enf123", "enfermeiro")
        )

        btnLogin.setOnClickListener {
            // Limpa mensagens de erro
            editTextEmail.error = null
            editTextSenha.error = null

            val email = editTextEmail.text.toString().trim()
            val senha = editTextSenha.text.toString()

            // Validação de campos
            if (email.isEmpty()) {
                editTextEmail.error = "Informe o email"
                return@setOnClickListener
            }

            if (senha.isEmpty()) {
                editTextSenha.error = "Informe a senha"
                return@setOnClickListener
            }

            // Verifica se o email está na lista de usuários
            val usuarioEncontrado = usuariosMock[email]

            if (usuarioEncontrado != null) {
                val (senhaCorreta, perfil) = usuarioEncontrado
                if (senha == senhaCorreta) {
                    val intent = Intent(this, Interconnectivity::class.java)
                    intent.putExtra("perfil", perfil)
                    startActivity(intent)
                } else {
                    editTextSenha.error = "Senha incorreta"
                }
            } else {
                editTextEmail.error = "Email não encontrado"
            }
        }
    }
}
