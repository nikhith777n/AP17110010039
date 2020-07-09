package com.example.task9;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class adapter extends RecyclerView.Adapter<adapter.MyViewHolder>{
    int img[];
    String na[];
    String ver[];
    String apil[];
    String da[];
    Context ct;
    public adapter(MainActivity mainActivity, int[] images, String[] name, String[] version, String[] apilevel, String[] date) {
        img=images;
        na=name;
        ver=version;
        apil=apilevel;
        da=date;
        ct=mainActivity;
    }

    @NonNull
    @Override
    public adapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(ct).inflate(R.layout.item,parent,false);
        MyViewHolder myViewHolder=new MyViewHolder(v);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull adapter.MyViewHolder holder, int position) {
        holder.iv.setImageResource(img[position]);
        holder.tv1.setText(na[position]);
        holder.tv2.setText(ver[position]);
        holder.tv3.setText(apil[position]);
        holder.tv4.setText(da[position]);
    }

    @Override
    public int getItemCount() {
        return img.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView iv;
        TextView tv1;
        TextView tv2;
        TextView tv3;
        TextView tv4;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            iv=itemView.findViewById(R.id.image);
            tv1=itemView.findViewById(R.id.name);
            tv2=itemView.findViewById(R.id.version);
            tv3=itemView.findViewById(R.id.API);
            tv4=itemView.findViewById(R.id.rd);
        }
    }
}
