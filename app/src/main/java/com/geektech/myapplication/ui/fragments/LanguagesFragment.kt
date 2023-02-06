package com.geektech.myapplication.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.geektech.myapplication.data.TextModel
import com.geektech.myapplication.databinding.FragmentLanguagesBinding
import com.geektech.myapplication.repository.LanguagesRepository
import com.geektech.myapplication.ui.adapters.LanguagesAdapter

class LanguagesFragment : Fragment() {

    private lateinit var binding: FragmentLanguagesBinding
    private val listLanguages = mutableListOf<TextModel>()
    private val repository = LanguagesRepository()
    private val adapter = LanguagesAdapter(listLanguages)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentLanguagesBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initialization()
    }

    private fun initialization(){
        listLanguages.addAll(repository.getListOfCatHTP())
        binding.rvLanguages.adapter = adapter
    }
}

