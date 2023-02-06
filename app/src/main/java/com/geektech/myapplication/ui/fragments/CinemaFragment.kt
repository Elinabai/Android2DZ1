package com.geektech.myapplication.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.geektech.myapplication.data.TextModel
import com.geektech.myapplication.databinding.FragmentCinemaBinding
import com.geektech.myapplication.ui.ItemClick
import com.geektech.myapplication.ui.adapters.CinemaAdapter
import com.geektech.myapplication.repository.CinemaRepository

class CinemaFragment : Fragment(), ItemClick {

    private lateinit var binding: FragmentCinemaBinding
    private val listCinema = mutableListOf<TextModel>()
    private val repository = CinemaRepository()
    private val adapter = CinemaAdapter(listCinema, this)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentCinemaBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        clear()
        initialization()

    }

    private fun initialization(){
        listCinema.addAll(repository.getListOfCatHTP())
        binding.rvCinema.adapter = adapter
    }

    override fun onItemClick(textModel: TextModel) {
        findNavController().navigate(CinemaFragmentDirections.actionCinemaFragmentToHomeFragment(
            textModel.image,
            textModel.name)
        )
    }

    private fun clear() {
        listCinema.clear()
    }
}
