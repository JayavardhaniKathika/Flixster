package com.codepath.flixster.adapters;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.codepath.flixster.DetailActivity;
import com.codepath.flixster.Models.Movie;
import com.codepath.flixster.R;

import org.parceler.Parcels;

import java.util.List;

public class MovieAdapters extends RecyclerView.Adapter<MovieAdapters.ViewHolder>{

    public MovieAdapters(Context context, List<Movie> movies) {
        this.context = context;
        this.movies = movies;
    }

    Context context;
    List<Movie> movies;

    //Usually involves inflating a layout from xml and returning the holder
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Log.d("MovieAdapter","onCreateViewHolder");
        View movieView=LayoutInflater.from(context).inflate(R.layout.item_movie,parent,false);
        return new ViewHolder(movieView);
    }

    //Involves populating the data into the item through holder
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Log.d("MovieAdapter","onBindViewHolder "+position);

        //Get the movie data at the position
        Movie movie = movies.get(position);
        holder.bind(movie);
        //Bind the movie data into the view holder
    }

    //Returns the total count of items in list
    @Override
    public int getItemCount() {
        return movies.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        RelativeLayout container;
        TextView tvTitle;
        TextView tvOverview;
        ImageView ivPoster;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTitle=itemView.findViewById(R.id.tvTitle);
            tvOverview=itemView.findViewById(R.id.tvOverview);
            ivPoster=itemView.findViewById(R.id.ivposter);
            container=itemView.findViewById(R.id.container);
        }

        public void bind(final Movie movie) {
            tvTitle.setText(movie.getTitle());
            tvOverview.setText(movie.getOverview());
            String imageUrl;
            //if the phone is in landscape
            //the image should be backdrop image
            //else if the image is in potrait
            //the image should be poster image

            if(context.getResources().getConfiguration().orientation== Configuration.ORIENTATION_LANDSCAPE){
                imageUrl=movie.getBackdropPath();
            }
            else{
                imageUrl=movie.getPosterPath();
            }

            //Glide.with(context).load(imageUrl).into(ivPoster);

            int radius = 30; // corner radius, higher value = more rounded
           // int margin = 10; // crop margin, set to 0 for corners with no crop
            Glide.with(context).load(imageUrl).transform(new RoundedCorners(radius)).into(ivPoster);


            //Register click listener on the whole container
            container.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    container.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent i=new Intent(context,DetailActivity.class);
                            i.putExtra("movie", Parcels.wrap(movie));
                            context.startActivity(i);
                        }
                    });
                }
            });
        }
    }
}
