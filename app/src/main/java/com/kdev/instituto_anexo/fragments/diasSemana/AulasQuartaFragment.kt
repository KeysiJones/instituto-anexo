package com.kdev.instituto_anexo.fragments.diasSemana

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.*
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.kdev.instituto_anexo.R
import com.kdev.instituto_anexo.databinding.FragmentAulasQuartaBinding

/**
 * A simple [Fragment] subclass.
 * Use the [BencaosDetailFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class AulasQuartaFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = FragmentAulasQuartaBinding.inflate(inflater)
        val toolbar = binding.aulasQuartaToolbar.appToolbar

        activity?.setActionBar(toolbar)
        activity?.actionBar?.setDisplayHomeAsUpEnabled(true)
        activity?.actionBar?.title = "Quarta-feira"
        setHasOptionsMenu(true)

        binding.btnDoctrinaConvenios.setOnClickListener {
            Toast.makeText(context, "Abrindo o Zoom... aguarde", Toast.LENGTH_SHORT).show()
            launchZoomUrl("https://zoom.us/j/94056241793?pwd=SFNmQUIvT0tRaHlDaVYrN3l5bzJVQT09")
        }

        binding.btnParabolasJesus.setOnClickListener {
            Toast.makeText(context, "Abrindo o Zoom... aguarde", Toast.LENGTH_SHORT).show()
            launchZoomUrl("https://zoom.us/j/95927244033?pwd=TkZLeU1MY2d5eUpqeTJ5WUJTRHlVUT09")
        }

        binding.btnPresNelson.setOnClickListener {
            Toast.makeText(context, "Abrindo o Zoom... aguarde", Toast.LENGTH_SHORT).show()
            launchZoomUrl("https://zoom.us/j/93337211696?pwd=dTVreXJLQXFzdVNrTUp0aVpZUzdJUT09")
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