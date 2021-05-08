package com.kdev.instituto_anexo.fragments.diasSemana

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.*
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.kdev.instituto_anexo.R
import com.kdev.instituto_anexo.databinding.FragmentAulasTercaBinding

/**
 * A simple [Fragment] subclass.
 * Use the [BencaosDetailFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class AulasTercaFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = FragmentAulasTercaBinding.inflate(inflater)
        val toolbar = binding.aulasTercaToolbar.appToolbar

        activity?.setActionBar(toolbar)
        activity?.actionBar?.title = "Terça-Feira"

        //setHasOptionsMenu(true)

        toolbar.setNavigationOnClickListener { view ->
            activity?.onBackPressed()
        }

        binding.btnPregarMeuEvangelho.setOnClickListener {
            Toast.makeText(context, "Abrindo o Zoom... aguarde", Toast.LENGTH_LONG).show()
            launchZoomUrl("https://zoom.us/j/95927244033?pwd=TkZLeU1MY2d5eUpqeTJ5WUJTRHlVUT09")
        }

        binding.btnFamiliaEterna.setOnClickListener {
            Toast.makeText(context, "Abrindo o Zoom... aguarde", Toast.LENGTH_LONG).show()
            launchZoomUrl("https://zoom.us/j/95927244033?pwd=TkZLeU1MY2d5eUpqeTJ5WUJTRHlVUT09")
        }

        binding.btnDoctrineCovenants.setOnClickListener {
            Toast.makeText(context, "Abrindo o Zoom... aguarde", Toast.LENGTH_LONG).show()
            launchZoomUrl("https://zoom.us/j/94056241793?pwd=SFNmQUIvT0tRaHlDaVYrN3l5bzJVQT09")
        }

        binding.btnDoutrinaConvenios.setOnClickListener {
            Toast.makeText(context, "Abrindo o Zoom... aguarde", Toast.LENGTH_LONG).show()
            launchZoomUrl("https://zoom.us/j/99543622475?pwd=TkZLeU1MY2d5eUpqeTJ5WUJTRHlVUT09")
        }

        binding.btnLivroMormonJapones.setOnClickListener {
            Toast.makeText(context, "Abrindo o Zoom... aguarde", Toast.LENGTH_LONG).show()
            launchZoomUrl("https://zoom.us/j/94056241793?pwd=SFNmQUIvT0tRaHlDaVYrN3l5bzJVQT09")
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

    private fun launchZoomUrl(uri: String) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(uri))
        intent.setPackage("us.zoom.videomeetings")

        if (activity?.packageManager?.let { intent.resolveActivity(it) } != null) {
            startActivity(intent)
        }
    }

}