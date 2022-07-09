package com.nepplus.myapplication.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.nepplus.myapplication.R
import com.nepplus.myapplication.datas.StudentData

class StudentRecyclerAdapter(
    val mContext: Context,
    val mList: ArrayList<StudentData>,
): RecyclerView.Adapter<StudentRecyclerAdapter.MyViewHolder>() {

    inner class MyViewHolder(val row: View): RecyclerView.ViewHolder(row) {
        val txtName = row.findViewById<TextView>(R.id.txtName)
        val txtAddress = row.findViewById<TextView>(R.id.txtAddress)

        fun bind(data: StudentData) {
            txtName.text = data.name
            txtAddress.text = "(${data.address})"
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val row = LayoutInflater.from(mContext).inflate(R.layout.student_list_item, parent, false)

        return MyViewHolder(row)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(mList[position])
    }

    override fun getItemCount() = mList.size
}