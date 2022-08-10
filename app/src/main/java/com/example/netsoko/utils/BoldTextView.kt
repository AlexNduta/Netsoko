package com.example.netsoko.utils

import android.content.Context
import android.graphics.Typeface
import android.util.AttributeSet
import android.widget.TextView
import androidx.appcompat.widget.AppCompatTextView
import com.example.netsoko.R
import java.util.jar.Attributes
//this is a custom textview tied to a specific font
//this class is reusable
class BoldTextView(context:Context, attributSet: AttributeSet)
    :AppCompatTextView(context,attributSet ) {


//call our applyFont() method
    init{
    appplyFont()
        }
//this function basically allows us to link our textView with the font Montserrat-Bold
    private fun appplyFont(){
        val typeface: Typeface = Typeface.createFromAsset(context.assets,"Montserrat-Bold.otf")
        setTypeface(typeface)
    }
}