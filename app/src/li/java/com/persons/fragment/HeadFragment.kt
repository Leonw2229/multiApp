package com.persons.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.persons.R
import kotlinx.android.synthetic.li.fragment_head.*

/**
 * Created by lmy on 2017/10/9.
 */
class HeadFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view = inflater?.inflate(R.layout.fragment_head, container, false)

        return view
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        click.setOnClickListener {
            Toast.makeText(activity,"我的鼻子被点了一下",Toast.LENGTH_LONG).show()
        }

    }

}