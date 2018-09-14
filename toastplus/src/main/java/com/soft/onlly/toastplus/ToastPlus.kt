package com.soft.onlly.toastplus

import android.content.Context
import android.view.Gravity
import android.view.LayoutInflater
import android.widget.TextView
import android.widget.Toast

class ToastPlus {
    companion object{
        fun show(cxt:Context,message:String,ll:Boolean = false){
            var toast = Toast(cxt)
            var inflater = cxt.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            var view = inflater.inflate(R.layout.toast_view,null)
            view.findViewById<TextView>(R.id.toast_view_tv_message).text = message
            toast.view = view
            toast.duration = if(ll)Toast.LENGTH_LONG else Toast.LENGTH_SHORT
            toast.setGravity(Gravity.BOTTOM or Gravity.CENTER_HORIZONTAL,0,100)
            toast.show()
        }
    }
}