package com.tasdelen.navigationandroid

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_two.*

class TwoFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_two, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        button2.setOnClickListener {
            val action = ActionOnlyNavDirections(R.id.action_twoFragment_to_oneFragment)
            Navigation.findNavController(it).navigate(action)
        }
    }
}