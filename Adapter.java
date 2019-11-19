package com.example.recyclerviewtext;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter {

    Context ct;
    ArrayList<Person> al;
    Adapter(Context ct, ArrayList<Person> al){
        this.ct = ct;
        this.al = al;

    }
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cardview, viewGroup, false);
        RecyclerView.ViewHolder vh = new RecyclerView.ViewHolder(v) {
        };
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder,final int position) {
        Person p = al.get(position);
        viewHolder.tvName.setText(p.getName());
        viewHolder.tvReg.setText(""+p.getReg());
    }
    @Override
    public int getItemCount() {
        return al.size();
    }
    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView tvName,tvReg;
        ImageView ivremove;
        LinearLayout linearLayout;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            tvName = itemView.findViewById(R.id.et1);
            tvReg = itemView.findViewById(R.id.et2);

            ivremove = itemView.findViewById(R.id.b1);
            linearLayout = itemView.findViewById(R.id.t1);

            ivremove.setVisibility(View.INVISIBLE);
            linearLayout.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View v) {
                    ivremove.setVisibility(View.VISIBLE);
                    ivremove.setVisibility(View.INVISIBLE);
                    

                    return true;
                }

            });


        }
    }
}
