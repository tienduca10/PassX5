package com.passx.question.passx;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder>{

    ArrayList<DataPassX> dataPassX;
    Context context;

    public Adapter(ArrayList<DataPassX> dataPassX, Context context) {
        this.dataPassX = dataPassX;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View itemView = layoutInflater.inflate(R.layout.item_row,parent,false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.txtName.setText(dataPassX.get(position).getTen());
        holder.imgHinh.setImageResource(dataPassX.get(position).getHinhanh());

    }

    @Override
    public int getItemCount() {
        return dataPassX.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView txtName ;
        ImageView imgHinh;

        public ViewHolder(View itemView) {
            super(itemView);

            txtName = (TextView)itemView.findViewById(R.id.txtName);
            imgHinh = (ImageView)itemView.findViewById(R.id.imgHinh);
        }
    }
}
