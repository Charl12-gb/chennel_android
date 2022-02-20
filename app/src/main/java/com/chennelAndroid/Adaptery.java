package com.chennelAndroid;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import java.util.List;

public class Adaptery extends RecyclerView.Adapter<Adaptery.MyViewHolder> {

    private Context mContexy;
    private List<Channel> mData;

    public Adaptery(Context mContexy, List<Channel> mData) {
        this.mContexy = mContexy;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v;
        LayoutInflater inflater = LayoutInflater.from(mContexy);
        v = inflater.inflate(R.layout.custom_list_layout, parent, false);

        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.title.setText(mData.get(position).getTitle());
        holder.chaine.setText(mData.get(position).getChaine());

        // Using Glide library to display the image
        Glide.with(mContexy)
                .load(mData.get(position).getCoverImage())
                .into(holder.img);
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }


    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView chaine, title;
        ImageView img;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.channelTitle);
            chaine = itemView.findViewById(R.id.channelChaine);
            img = itemView.findViewById(R.id.coverImage);
        }
    }
}
