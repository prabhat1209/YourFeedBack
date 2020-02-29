package com.example.yourfeedback;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

class ResponseAdapter extends RecyclerView.Adapter<ResponseAdapter.ResponseViewHolder> {

    ArrayList<in> list;
    Context context;
    public ResponseAdapter (Context context, ArrayList<in> l)
    {
            list=l;
            this.context = context;

    }

     public class ResponseViewHolder extends RecyclerView.ViewHolder{

        TextView t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16,t17,t18;
         public ResponseViewHolder(@NonNull View itemView) {

             super(itemView);
             t1 = (TextView)itemView.findViewById(R.id.tname);
             t2 = (TextView)itemView.findViewById(R.id.temail);
             t3 = (TextView)itemView.findViewById(R.id.tgender);
             t4 = (TextView)itemView.findViewById(R.id.tage);
             t5 = (TextView)itemView.findViewById(R.id.tcollege);
             t6 = (TextView)itemView.findViewById(R.id.tyear);
             t7 = (TextView)itemView.findViewById(R.id.tmobile);
             t8 = (TextView)itemView.findViewById(R.id.tExpert);
             t9 = (TextView)itemView.findViewById(R.id.tTech);
             t10 = (TextView)itemView.findViewById(R.id.tWorking);
             t11 = (TextView)itemView.findViewById(R.id.tLPro);
             t12 = (TextView)itemView.findViewById(R.id.tfb);
             t13 = (TextView)itemView.findViewById(R.id.tgithub);
             t14 = (TextView)itemView.findViewById(R.id.tResume);
             t15 = (TextView)itemView.findViewById(R.id.tjoin);
             t16 = (TextView)itemView.findViewById(R.id.tshare);
             t17 = (TextView)itemView.findViewById(R.id.ttell);
             t18 = (TextView)itemView.findViewById(R.id.treference);



         }
     }


    @NonNull
    @Override
    public ResponseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {



        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.details,parent, false);
        return new ResponseViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ResponseViewHolder holder, int position) {

        in i = list.get(position);
        holder.t1.setText(i.name);
        holder.t2.setText(i.email);
        holder.t3.setText(i.gender);
        holder.t4.setText(i.age);
        holder.t5.setText(i.college);
        holder.t6.setText(i.year);
        holder.t7.setText(i.mob);
        holder.t8.setText(i.expert);
        holder.t9.setText(i.tech);
        holder.t10.setText(i.working);
        holder.t11.setText(i.lpro);
        holder.t12.setText(i.fbpro);
        holder.t13.setText(i.ghpro);
        holder.t14.setText(i.lresume);
        holder.t15.setText(i.want);
        holder.t16.setText(i.expe);
        holder.t17.setText(i.tell);
        holder.t18.setText(i.ref);




    }



    @Override
    public int getItemCount() { return list.size();
    }
}
