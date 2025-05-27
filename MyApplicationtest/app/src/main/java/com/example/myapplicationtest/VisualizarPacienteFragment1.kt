package com.seuprojeto.cadastro

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.myapplicationtest.R
import java.time.LocalDate
import java.time.Period
import java.time.format.DateTimeFormatter

class VisualizarPacienteFragment : Fragment() {

    // Simulação de dados recebidos
    private val paciente = Paciente(
        id = 1,
        nome = "Maria da Silva",
        dataNascimento = "1990-05-20",
        genero = "Feminino",
        numeroProntuario = 12345,
        tipoSanguineo = "O+",
        cpf = "12345678900",
        anoDiagnostico = "2015",
        dadosClinicos = "Paciente apresenta histórico de enxaqueca frequente e hipertensão controlada."
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_visualizar_paciente, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd")
        val dataNascimento = LocalDate.parse(paciente.dataNascimento, formatter)
        val hoje = LocalDate.now()
        val idade = Period.between(dataNascimento, hoje)

        view.findViewById<TextView>(R.id.text_id).text = "ID: ${paciente.id}"
        view.findViewById<TextView>(R.id.text_nome).text = "Nome: ${paciente.nome}"
        view.findViewById<TextView>(R.id.text_data_nascimento).text = "Data de Nascimento: ${paciente.dataNascimento}"
        view.findViewById<TextView>(R.id.text_idade).text =
            "Idade: ${idade.years} anos, ${idade.months} meses e ${idade.days} dias"
        view.findViewById<TextView>(R.id.text_genero).text = "Gênero: ${paciente.genero}"
        view.findViewById<TextView>(R.id.text_numero_prontuario).text = "Nº Prontuário: ${paciente.numeroProntuario}"
        view.findViewById<TextView>(R.id.text_tipo_sanguineo).text = "Tipo Sanguíneo: ${paciente.tipoSanguineo}"
        view.findViewById<TextView>(R.id.text_cpf).text = "CPF: ${paciente.cpf}"
        view.findViewById<TextView>(R.id.text_ano_diagnostico).text = "Ano de Diagnóstico: ${paciente.anoDiagnostico}"
        view.findViewById<TextView>(R.id.text_dados_clinicos).text = paciente.dadosClinicos
    }
}

data class Paciente(
    val id: Int,
    val nome: String,
    val dataNascimento: String,
    val genero: String,
    val numeroProntuario: Int,
    val tipoSanguineo: String,
    val cpf: String,
    val anoDiagnostico: String,
    val dadosClinicos: String
)
