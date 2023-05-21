package com.hsbc.com.dialogfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.hsbc.com.dialogfragment.databinding.FragmentDialogBinding


class DialogFragment : androidx.fragment.app.DialogFragment() {

    private var dialogFragBinding : FragmentDialogBinding? = null
    private val binding get() = dialogFragBinding!!


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        dialogFragBinding = FragmentDialogBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnCan.setOnClickListener {
         this@DialogFragment.dismiss()
        }

        binding.btnOk.setOnClickListener {
                sendData()
        }
    }

    private fun sendData() {
        val activity : MainActivity = activity as MainActivity
        val name = binding.edtName.text.toString()
        val age = binding.edtAge.text.toString()
        activity.sendData(name,age)
        this@DialogFragment.dismiss()

    }

    override fun onDestroyView() {
        super.onDestroyView()
        dialogFragBinding = null
    }


}