package com.kdev.instituto_anexo.fragments

import android.os.Bundle
import android.view.*
import android.widget.Toast
import androidx.fragment.app.Fragment
import android.widget.Toolbar
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.fragment.findNavController
import com.kdev.instituto_anexo.R
import com.kdev.instituto_anexo.databinding.FragmentDiasSemanaBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [OracaoPaoFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class DiasSemanaFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = FragmentDiasSemanaBinding.inflate(inflater)
        val toolbar = binding.diasSemanaToolbar.appToolbar

        activity?.setActionBar(toolbar)
        //activity?.actionBar?.setDisplayHomeAsUpEnabled(true)
        activity?.actionBar?.title  = "Dias de instituto !!"
        //activity?.actionBar?.setHomeAsUpIndicator(R.drawable.ic_baseline_arrow_back_24)

        toolbar.setNavigationOnClickListener { view ->
            activity?.onBackPressed()
        }

        //setHasOptionsMenu(true)

        binding.btnTercaFeira.setOnClickListener {
            findNavController().navigate(R.id.action_diasSemanaFragment_to_aulasTercaFragment)
        }

        binding.btnQuartaFeira.setOnClickListener {
            findNavController().navigate(R.id.action_diasSemanaFragment_to_aulasQuartaFragment)
        }

        binding.btnQuintaFeira.setOnClickListener {
            findNavController().navigate(R.id.action_diasSemanaFragment_to_aulasQuintaFragment)
        }

        binding.btnSabado.setOnClickListener {
            findNavController().navigate(R.id.action_diasSemanaFragment_to_aulasSabadoFragment)
        }

        return binding.root.rootView
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.menu_padrao, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        activity?.onBackPressed()
        Toast.makeText(context, "ola, teste", Toast.LENGTH_SHORT).show()
        return true
    }
}