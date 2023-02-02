package com.geektech.myapplication.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.geektech.myapplication.data.TextModel
import com.geektech.myapplication.databinding.FragmentNationBinding
import com.geektech.myapplication.repository.NationRepository
import com.geektech.myapplication.ui.adapters.NationAdapter

class NationFragment : Fragment() {

    private lateinit var binding: FragmentNationBinding
    private val listNation = mutableListOf<TextModel>()
    private val repository = NationRepository()
    private val adapter = NationAdapter(listNation)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentNationBinding.inflate(inflater, container, false)
        return binding.root

    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        listNation.addAll(repository.getListOfCatHTP())
        binding.rvNation.adapter = adapter
    }
}