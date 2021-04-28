package com.kdev.instituto_anexo.fragments.diasSemana

import android.os.Bundle
import android.view.*
import android.webkit.WebSettings
import android.webkit.WebView
import androidx.fragment.app.Fragment
import com.kdev.instituto_anexo.R
import com.kdev.instituto_anexo.databinding.FragmentAulasZoomBinding
// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [OracaoPaoFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class AulasZoomFragment : Fragment() {
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
        val binding = FragmentAulasZoomBinding.inflate(inflater)
        val matriculaInstitutoWebView: WebView = binding.aulasZoomWebview

        val linkAula: String? = arguments?.getString("linkAula");
        val nomeAula: String? = arguments?.getString("nomeAula");

        println("***************** link da aula: $linkAula *********************")

        matriculaInstitutoWebView.loadUrl(linkAula!!)

        // Enable Javascript
        val webSettings : WebSettings = matriculaInstitutoWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);

//        // Force links and redirects to open in the WebView instead of in a browser
//        matriculaInstitutoWebView.webViewClient = WebViewClient();

        val toolbar = binding.aulasZoomToolbar.appToolbar
        activity?.setActionBar(toolbar)

        activity?.actionBar?.setDisplayHomeAsUpEnabled(true)
        activity?.actionBar?.title = nomeAula
        setHasOptionsMenu(true)

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