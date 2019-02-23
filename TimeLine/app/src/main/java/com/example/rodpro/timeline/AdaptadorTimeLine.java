package com.example.rodpro.timeline;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by RodPro on 22/2/2019.
 */

public class AdaptadorTimeLine extends RecyclerView.Adapter<AdaptadorTimeLine.ViewHolderTimeLine>{

    ArrayList<EventTimeLine> eventos;



    public AdaptadorTimeLine(ArrayList<EventTimeLine> eventos) {

        this.eventos = eventos;
    }

    @NonNull
    @Override
    public ViewHolderTimeLine onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_time_line,null,false);
        return new ViewHolderTimeLine(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderTimeLine holder, int position) {
        holder.time.setText(eventos.get(position).getTime());
        holder.date.setText(eventos.get(position).getDate());
        holder.edn.setText(eventos.get(position).getEdn());
        holder.imagenIcon.setImageResource(eventos.get(position).getIcon());

    }

    @Override
    public int getItemCount() {

        return eventos.size();
    }

    public class ViewHolderTimeLine extends RecyclerView.ViewHolder {

        ImageView imagenIcon;
        TextView time,date,edn;

        public ViewHolderTimeLine(View itemView) {
            super(itemView);
            imagenIcon = (ImageView)itemView.findViewById(R.id.idImage);
            time = (EditText)itemView.findViewById(R.id.textTime);
            date = (EditText)itemView.findViewById(R.id.textDate);
            edn = (EditText)itemView.findViewById(R.id.textEdn);
        }
    }
}
