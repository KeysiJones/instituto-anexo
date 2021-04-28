package com.kdev.instituto_anexo.fragments.diasSemana

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.kdev.instituto_anexo.R
import com.kdev.instituto_anexo.databinding.FragmentAulasQuartaBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [BencaosDetailFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class AulasQuartaFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val binding = FragmentAulasQuartaBinding.inflate(inflater)
//
//        var titulo: String? = arguments?.getString("bencaoTitle")
//        var texto: String? = arguments?.getString("bencaoText")
//
//        inflater.findViewById<TextView>(R.id.bencao_title)?.text = titulo
//        inflater.findViewById<TextView>(R.id.bencao_text)?.text = texto

        val toolbar = binding.aulasQuartaToolbar.appToolbar

        activity?.setActionBar(toolbar)

        activity?.actionBar?.setDisplayHomeAsUpEnabled(true)
        activity?.actionBar?.title  = "Quarta feira"
        setHasOptionsMenu(true)

        binding.btnDoctrinaConvenios.setOnClickListener {
            val bundle: Bundle = Bundle();

            bundle.putString("linkAula", "https://zoom.us/j/94056241793?pwd=SFNmQUIvT0tRaHlDaVYrN3l5bzJVQT09")
            bundle.putString("nomeAula", "19h - Doctrina y Convenios (Español)")

            findNavController().navigate(R.id.action_aulasQuartaFragment_to_aulasZoomFragment, bundle)
        }

        binding.btnParabolasJesus.setOnClickListener {
            val bundle: Bundle = Bundle();

            bundle.putString("linkAula", "https://zoom.us/j/95927244033?pwd=TkZLeU1MY2d5eUpqeTJ5WUJTRHlVUT09")
            bundle.putString("nomeAula", "19h - Curso da Bíblia: As Parábolas de Jesus")

            findNavController().navigate(R.id.action_aulasQuartaFragment_to_aulasZoomFragment, bundle)
        }

        binding.btnPresNelson.setOnClickListener {
            val bundle: Bundle = Bundle();

            bundle.putString("linkAula", "https://zoom.us/j/93337211696?pwd=dTVreXJLQXFzdVNrTUp0aVpZUzdJUT09")
            bundle.putString("nomeAula", "20h - Ensinamentos Russel M. Nelson")

            findNavController().navigate(R.id.action_aulasQuartaFragment_to_aulasZoomFragment, bundle)
        }

        return binding.root.rootView
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.menu_padrao, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        activity?.onBackPressed()
        return true
    }

}