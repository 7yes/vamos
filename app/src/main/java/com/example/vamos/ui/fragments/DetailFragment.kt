package com.example.vamos.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.vamos.databinding.FragmentDetailBinding
import com.example.vamos.viewmodel.DetailViewModel

class DetailFragment : Fragment() {
    private var _binding: FragmentDetailBinding? = null
    private val binding get() = _binding!!


    companion object {
        fun newInstance() = DetailFragment()
    }

    private lateinit var viewModel: DetailViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(this).get(DetailViewModel::class.java)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDetailBinding.inflate(layoutInflater, container, false)
        binding.tvName.text=viewModel.itemm.name
        binding.tvDescription.text=viewModel.itemm.description
        //binding.tvIngredients.text=viewModel.itemm.ingredients
        return binding.root

       // return inflater.inflate(R.layout.fragment_detail, container, false)
    }

}