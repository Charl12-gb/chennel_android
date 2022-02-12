package com.chennelAndroid;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    LayoutInflater inflater;
    List<Channel> channels;

    public Adapter(Context ctx, List<Channel> channels){
        this.inflater = LayoutInflater.from(ctx);
        this.channels = channels;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.custom_list_layout,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.channelTitle.setText(channels.get(position).getTitle());
        holder.channelChaine.setText(channels.get(position).getChaine());
        Picasso.get().load(channels.get(position).getCoverImage()).into(holder.CoverImage);
    }

    @Override
    public int getItemCount() {
        return channels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView channelTitle,channelChaine;
        ImageView CoverImage;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            channelTitle = itemView.findViewById(R.id.channelTitle);
            channelChaine = itemView.findViewById(R.id.channelChaine);
            CoverImage = itemView.findViewById(R.id.coverImage);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(v.getContext(), "Do Something With this Click", Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
}