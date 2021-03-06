package com.example.week4z_160919005_lukitaiswara.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.week4z_160919005_lukitaiswara.R
import com.example.week4z_160919005_lukitaiswara.model.Student
import com.example.week4z_160919005_lukitaiswara.util.loadImage
import kotlinx.android.synthetic.main.fragment_student_detail.view.*
import kotlinx.android.synthetic.main.student_list_item.view.*

class StudentDetailAdapter (val studentList:ArrayList<Student>):RecyclerView.Adapter<StudentDetailAdapter.StudentDetailHolder>() {
    class StudentDetailHolder(var view: View):RecyclerView.ViewHolder(view)

    fun updateStudentList(newStudentList:List<Student>){
        studentList.clear()
        studentList.addAll(newStudentList)
        notifyDataSetChanged()
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StudentDetailAdapter.StudentDetailHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.fragment_student_detail, parent, false)
        return StudentDetailAdapter.StudentDetailHolder(view)
    }



    override fun getItemCount(): Int {
        return studentList.size
    }

    override fun onBindViewHolder(holder: StudentDetailHolder, position: Int) {


        /*holder.view.txtName.setText(studentList[position].name)
        holder.view.txtBod.setText(studentList[position].bod)
        holder.view.textID.setText(studentList[position].id)
        holder.view.txtPhone.setText(studentList[position].phone)
        holder.view.imageViewStudent.loadImage(studentList[position].photoUrl.toString(),
            holder.view.progressBar)*/

    }




}