package com.example.akat2.myplayer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by akat2 on 22-12-2017.
 */

public class SongAdapter extends BaseAdapter {

    private ArrayList<Song> songList;
    private Context context;
    private LayoutInflater songInflater;

    public SongAdapter(Context context, ArrayList<Song> songList){
        this.context = context;
        this.songList = songList;
        songInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return songList.size();
    }

    @Override
    public Object getItem(int i) {
        return songList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        //map to song layout
        LinearLayout songLayout = (LinearLayout) songInflater.inflate(R.layout.song_item, null, false);
        //get title and artist views
        TextView songView = (TextView)songLayout.findViewById(R.id.song_title);
        TextView artistView = (TextView)songLayout.findViewById(R.id.song_artist);
        //get song using position
        Song currSong = songList.get(i);
        //get title and artist strings
        songView.setText(currSong.getTitle());
        artistView.setText(currSong.getArtist());
        //set position as tag
        songLayout.setTag(i);
        return songLayout;
    }
}
