package com.kdev.instituto_anexo.fragments

import android.app.AlertDialog
import android.os.Bundle
import android.view.*
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.kdev.instituto_anexo.R
import com.kdev.instituto_anexo.databinding.FragmentMenuPrincipalBinding

/**
 * A simple [Fragment] subclass.
 * Use the [MenuPrincipalFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class MenuPrincipalFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val binding = FragmentMenuPrincipalBinding.inflate(inflater)

        //Colocar um menu no futuro

        val toolbar = binding.menuPrincipalToolbar.appToolbar
        activity?.setActionBar(toolbar)
        activity?.actionBar?.title = " Instituto Anexo"
        activity?.actionBar?.setHomeAsUpIndicator(R.drawable.ic_baseline_favorite_border_24)

        //setHasOptionsMenu(true)

        toolbar.setNavigationOnClickListener {
            Toast.makeText(context, "Faça do Instituto uma prioridade...", Toast.LENGTH_LONG).show()
        }

        binding.btnMatricularInstituto.setOnClickListener {
            findNavController().navigate(R.id.action_menuPrincipalFragment_to_matriculaInstitutoFragment)
        }

        binding.btnAulasInstituto.setOnClickListener {
            findNavController().navigate(R.id.action_menuPrincipalFragment_to_diasSemanaFragment)
        }

//        toolbar.setNavigationOnClickListener { view ->
//            val myDrawerMenu = activity?.findViewById<DrawerLayout>(R.id.drawerLayout)
//            myDrawerMenu?.openDrawer(Gravity.LEFT)
//        }

        return binding.root.rootView
    }

//    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
//        super.onCreateOptionsMenu(menu, inflater)
//        inflater.inflate(R.menu.menu_dados_fragment, menu)
//    }
//
//    override fun onOptionsItemSelected(item: MenuItem): Boolean {
//        when (item.itemId) {
//            R.id.menu_adicionar -> {
//                Toast.makeText(view?.context, "Adicionado... ${item.itemId}", Toast.LENGTH_SHORT).show()
//            }
//
//            R.id.menu_cancelar -> {
//                Toast.makeText(context, "Cancelando...", Toast.LENGTH_SHORT).show()
//            }
//
//            else -> {
//                activity?.onBackPressed()
//            }
//        }
//        return true
//    }
}