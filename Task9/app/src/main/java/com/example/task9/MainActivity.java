package com.example.task9;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView rv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv=findViewById(R.id.recycler);
        int images[]={R.drawable.alpha,R.drawable.beta,R.drawable.cupcake,R.drawable.donut,R.drawable.eclair,R.drawable.froyo,R.drawable.gingerbread,R.drawable.honeycomb,
                R.drawable.icecreamsandwich,R.drawable.jellybean,R.drawable.kitkat,R.drawable.lollipop,R.drawable.marshmallow,R.drawable.nougat,R.drawable.oreo,R.drawable.pie,R.drawable.q,R.drawable.r};
        String name[]={"no name","no name","cupcake","donut","eclair","froyo","gingerbread","honeycomb","icecreamsandwich","jellybean","kitkat","lollipop","marshmallow","nougat","oreo","pie","q","r"};
        String version[]={"1.0","1.1","1.5","1.6","2.0 - 2.1","2.2 - 2.2.3","2.3 - 2.3.7","3.0 - 3.2.6",
                "4.0 - 4.0.4","4.1 - 4.3.1","4.4 - 4.4.4","5.0 - 5.1.1","6.0 - 6.0.1","7.1.0 - 7.1.2","8.1","9.0","10.0","11.0"	};
        String apilevel[]={"1","2","3","4","5-7","8","9-10","11-13","14-15","16-18","19-20","21-22","23","25","27","28","29","30"};
        String date[]={"September 23, 2008",
                "February 9, 2009",
                "April 27, 2009",
                "September 15, 2009",
                "October 26, 2009",
                "May 20, 2010",
                "December 6, 2010",
                "February 22, 2011",
                "October 18, 2011",
                "July 9, 2012",
                "October 31, 2013",
                "November 12, 2014",
                "October 5, 2015",
                "October 4, 2016",
                "December 5, 2017",
                "August 6, 2018",
                "September 3, 2019",
                "February 19, 2020"};
        rv.setLayoutManager(new LinearLayoutManager(this) );
        adapter a=new adapter(this,images,name,version,apilevel,date);
        rv.setAdapter(a);
    }
}