package com.NextGenDevs.auaf;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.net.URI;
import java.security.PrivateKey;
import java.util.PrimitiveIterator;

public class VideoGalleryAdapter extends RecyclerView.Adapter<VideoGalleryAdapter.VideoViewHolder> {

    private Context context;
    private MediaController mediaController;

    public static class VideoViewHolder extends RecyclerView.ViewHolder {

        private VideoView videoView;

        public VideoViewHolder(@NonNull View itemView) {
            super(itemView);
            videoView = itemView.findViewById(R.id.videoView);
        }

    }

    String[] arr;


    public VideoGalleryAdapter(Context context, String[] arr) {
        this.context = context;
        this.arr = arr;

    }

    @NonNull
    @Override
    public VideoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_video_gallery_single_view, parent, false);
        return new VideoViewHolder(view);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull VideoViewHolder holder, int position) {
        holder.videoView.setVideoURI(Uri.parse(arr[position]));
        mediaController = new MediaController(context);
        holder.videoView.setMediaController(mediaController);
        mediaController.setAnchorView(holder.videoView);

    }

    @Override
    public int getItemCount() {
        return arr.length;
    }
}
