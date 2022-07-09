package com.nepplus.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.nepplus.myapplication.adapters.StudentRecyclerAdapter
import com.nepplus.myapplication.databinding.ActivityMainBinding
import com.nepplus.myapplication.datas.StudentData

class MainActivity : BaseActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var mAdapter: StudentRecyclerAdapter
    var mStudentList = ArrayList<StudentData>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {

    }

    override fun setValues() {
        mStudentList.add(StudentData("가나다","중구"))
        mStudentList.add(StudentData("라마바","성북구"))
        mStudentList.add(StudentData("자다사","강북구"))

        mAdapter = StudentRecyclerAdapter(mContext, mStudentList)
        binding.studentRecyclerView.adapter = mAdapter
        binding.studentRecyclerView.layoutManager = LinearLayoutManager(mContext)
    }
}