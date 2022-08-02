package com.nandani.changecolour

import android.annotation.SuppressLint
import android.graphics.Color.blue
import android.graphics.Color.red
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.FragmentContainer
import androidx.fragment.app.FragmentContainerView
import com.nandani.changecolour.R.color.green
import com.nandani.changecolour.R.id.fragmentContainerView

class MainActivity : AppCompatActivity() {
    lateinit var btnCallFragment : Button
    lateinit var activityInterface: ActivityInterface
    lateinit var btnalert_Dialog: Button
    lateinit var fragmentContainerView : FragmentContainerView
    var c = 0
    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnCallFragment=findViewById(R.id.btnCallFragment)
        btnalert_Dialog =findViewById(R.id.btnalert_Dialog )
        fragmentContainerView =findViewById(R.id.fragmentContainerView)

        btnalert_Dialog.setOnClickListener{
            c++
            activityInterface.activityInterface()
            var alertDialog= AlertDialog.Builder(this)
            alertDialog.setTitle("Title")
            alertDialog.setMessage("Alert dialog message")
            alertDialog.setPositiveButton("Red"){_,_->
                fragmentContainerView.setBackgroundResource(R.color.red)
            }
            alertDialog.setNegativeButton("Green"){_,_->
                fragmentContainerView.setBackgroundColor(R.color.green)
            }
            alertDialog.setNeutralButton("Blue"){_,_->
                fragmentContainerView.setBackgroundColor(R.color.blue)
            }
            alertDialog.show()
        }
    }
}


