package com.example.myapplicationtest

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.fragment.app.Fragment

class CadastrePatientFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate o layout do fragment
        return inflater.inflate(R.layout.fragment_cadastro_paciente, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Gênero - checkboxes exclusivas (feminino/masculino)
        val generoFeminino = view.findViewById<CheckBox>(R.id.checkbox_feminino)
        val generoMasculino = view.findViewById<CheckBox>(R.id.checkbox_masculino)

        generoFeminino.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) generoMasculino.isChecked = false
        }
        generoMasculino.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) generoFeminino.isChecked = false
        }

        // Spinner tipo sanguíneo
        val spinnerTipoSanguineo = view.findViewById<Spinner>(R.id.spinner_tipo_sanguineo)
        val tiposSanguineos = arrayOf("A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-")
        spinnerTipoSanguineo.adapter = ArrayAdapter(
            requireContext(),
            android.R.layout.simple_spinner_dropdown_item,
            tiposSanguineos
        )

        // Diagnóstico confirmado - checkboxes exclusivas (sim/não)
        val diagnosticoSim = view.findViewById<CheckBox>(R.id.checkbox_diagnostico_sim)
        val diagnosticoNao = view.findViewById<CheckBox>(R.id.checkbox_diagnostico_nao)

        diagnosticoSim.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) diagnosticoNao.isChecked = false
        }
        diagnosticoNao.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) diagnosticoSim.isChecked = false
        }

        // Botões salvar e cancelar
        val btnSalvar = view.findViewById<Button>(R.id.btn_salvar)
        val btnCancelar = view.findViewById<Button>(R.id.btn_cancelar)

        btnSalvar.setOnClickListener {
            Toast.makeText(requireContext(), "Cadastro salvo!", Toast.LENGTH_SHORT).show()
            // TODO: implementar salvar dados no banco ou enviar para servidor
        }

        btnCancelar.setOnClickListener {
            Toast.makeText(requireContext(), "Cadastro cancelado!", Toast.LENGTH_SHORT).show()
            // TODO: implementar ação de cancelar, limpar campos ou voltar
        }

        // Botão adicionar consulta
        val btnAdicionarConsulta = view.findViewById<ImageButton>(R.id.btn_add_consulta)
        btnAdicionarConsulta.setOnClickListener {
            Toast.makeText(requireContext(), "Adicionar nova consulta!", Toast.LENGTH_SHORT).show()
            // TODO: implementar navegação ou ação para adicionar consulta
        }
    }
}

