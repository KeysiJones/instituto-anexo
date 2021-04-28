package com.kdev.instituto_anexo.fragments.diasSemana

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.kdev.instituto_anexo.R
import com.kdev.instituto_anexo.databinding.FragmentAulasTercaBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [BencaosDetailFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class AulasTercaFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val binding = FragmentAulasTercaBinding.inflate(inflater)
//
//        var titulo: String? = arguments?.getString("bencaoTitle")
//        var texto: String? = arguments?.getString("bencaoText")
//
//        inflater.findViewById<TextView>(R.id.bencao_title)?.text = titulo
//        inflater.findViewById<TextView>(R.id.bencao_text)?.text = texto

        val toolbar = binding.aulasTercaToolbar.appToolbar

        activity?.setActionBar(toolbar)

        activity?.actionBar?.setDisplayHomeAsUpEnabled(true)
        activity?.actionBar?.title  = "Terça Feira"
        setHasOptionsMenu(true)

        binding.btnPregarMeuEvangelho.setOnClickListener {
            val bundle: Bundle = Bundle();

            bundle.putString("linkAula", "https://zoom.us/j/95927244033?pwd=TkZLeU1MY2d5eUpqeTJ5WUJTRHlVUT09")
            bundle.putString("nomeAula", "9h - Pregar meu evangelho")

            findNavController().navigate(R.id.action_aulasTercaFragment_to_aulasZoomFragment, bundle)
        }

        binding.btnFamiliaEterna.setOnClickListener {
            val bundle: Bundle = Bundle();

            bundle.putString("linkAula", "https://zoom.us/j/95927244033?pwd=TkZLeU1MY2d5eUpqeTJ5WUJTRHlVUT09")
            bundle.putString("nomeAula", "10h - Família eterna")

            findNavController().navigate(R.id.action_aulasTercaFragment_to_aulasZoomFragment, bundle)
        }

        binding.btnDoctrineCovenants.setOnClickListener {
            val bundle: Bundle = Bundle();

            bundle.putString("linkAula", "https://zoom.us/j/94056241793?pwd=SFNmQUIvT0tRaHlDaVYrN3l5bzJVQT09")
            bundle.putString("nomeAula", "18h30 - Doctrine and Covenants")

            findNavController().navigate(R.id.action_aulasTercaFragment_to_aulasZoomFragment, bundle)
        }

        binding.btnDoutrinaConvenios.setOnClickListener {
            val bundle: Bundle = Bundle();

            bundle.putString("linkAula", "https://zoom.us/j/99543622475?pwd=TkZLeU1MY2d5eUpqeTJ5WUJTRHlVUT09")
            bundle.putString("nomeAula", "20h - Doutrina e Convênios")

            findNavController().navigate(R.id.action_aulasTercaFragment_to_aulasZoomFragment, bundle)
        }

        binding.btnLivroMormonJapones.setOnClickListener {
            val bundle: Bundle = Bundle();

            bundle.putString("linkAula", "https://zoom.us/j/94056241793?pwd=SFNmQUIvT0tRaHlDaVYrN3l5bzJVQT09")
            bundle.putString("nomeAula", "21h - O Livro De Mórmon(Japonês)")

            findNavController().navigate(R.id.action_aulasTercaFragment_to_aulasZoomFragment, bundle)
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