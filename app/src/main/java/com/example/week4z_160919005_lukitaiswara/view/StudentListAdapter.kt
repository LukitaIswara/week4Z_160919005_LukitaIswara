package com.example.week4z_160919005_lukitaiswara.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.week4z_160919005_lukitaiswara.R
import com.example.week4z_160919005_lukitaiswara.model.Student
import kotlinx.android.synthetic.main.student_list_item.view.*

class StudentListAdapter (val studentList:ArrayList<Student>):RecyclerView.Adapter<StudentListAdapter.StudentViewHolder>(){
    class StudentViewHolder(var view: View):RecyclerView.ViewHolder(view)

    fun updateStudentList(newStudentList:List<Student>){
        studentList.clear()
        studentList.addAll(newStudentList)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StudentViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.student_list_item, parent, false)
        return StudentViewHolder(view)
    }

    override fun onBindViewHolder(holder: StudentViewHolder, position: Int) {
        holder.view.textIDstundent.setText(studentList[position].id)
        holder.view.txtStudentName.setText(studentList[position].name)
        holder.view.buttonDetail.setOnClickListener {
            val pid     = studentList[position].id.toString()
            val pname   = studentList[position].name.toString()
            val pbod    = studentList[position].bod.toString()
            val pphone  = studentList[position].phone.toString()
            val action = StudentListFragmentDirections.actionStudentDetail(pid, pname, pbod, pphone)
            Navigation.findNavController(it).navigate(action)
        }

    }

    override fun getItemCount(): Int {
        return studentList.size
    }
}