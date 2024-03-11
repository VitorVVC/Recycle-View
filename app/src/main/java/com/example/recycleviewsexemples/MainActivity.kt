package com.example.recycleviewsexemples

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.Data
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView;
    private lateinit var dataList: ArrayList<DataClass>;
    lateinit var imageList: Array<Int>;
    lateinit var titleList: Array<String>;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageList = arrayOf(
            R.drawable.ic_list,
            R.drawable.ic_checkbox,
            R.drawable.ic_image,
            R.drawable.ic_toggle,
            R.drawable.ic_date,
            R.drawable.ic_rating,
            R.drawable.ic_time,
            R.drawable.ic_text,
            R.drawable.ic_edit,
            R.drawable.ic_camera)

        titleList = arrayOf(
            "ListView",
            "CheckBox",
            "ImageView",
            "Toggle Switch",
            "Date Picker",
            "Rating Bar",
            "Time Picker",
            "TextView",
            "EditText",
            "Camera")

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.layoutManager = LinearLayoutManager(this);
        recyclerView.setHasFixedSize(true);

        dataList = arrayListOf<DataClass>();
        getData();

    }

    private fun getData() {
        for (i in imageList.indices) {
            val dataClass = DataClass(imageList[i],titleList[i]);
            dataList.add(dataClass);
        }
        recyclerView.adapter = AdapterClass(dataList);
    }
}