package uz.coders.currency.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import uz.coders.currency.R

import uz.coders.currency.databinding.FragmentConverterBinding


class ConverterFragment : Fragment(R.layout.fragment_converter) {
    private var _binding: FragmentConverterBinding? = null
    private val binding get() = _binding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentConverterBinding.bind(view)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}