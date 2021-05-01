package com.kdev.instituto_anexo.fragments

import android.os.Bundle
import android.view.*
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.fragment.app.Fragment
import com.kdev.instituto_anexo.R
import com.kdev.instituto_anexo.databinding.FragmentMatriculaInstitutoBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [OracaoPaoFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class MatriculaInstitutoFragment : Fragment() {
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
        val binding = FragmentMatriculaInstitutoBinding.inflate(inflater)
        val matriculaInstitutoWebView: WebView = binding.matriculaInstitutoWebview
        matriculaInstitutoWebView.loadUrl("https://docs.google.com/forms/d/e/1FAIpQLSd0y43FbhjFRI62qL42DezLBjtwC6nhubskd_JVlxH3js4hbw/viewform")

        // Enable Javascript
        val webSettings : WebSettings = matriculaInstitutoWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        // Force links and redirects to open in the WebView instead of in a browser
        matriculaInstitutoWebView.webViewClient = WebViewClient();

        val toolbar = binding.matriculaInstitutoToolbar.appToolbar

        activity?.setActionBar(toolbar)
        activity?.actionBar?.title = "Matricula"
        //setHasOptionsMenu(true)

        toolbar.setNavigationOnClickListener { view ->
            activity?.onBackPressed()
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