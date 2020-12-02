package com.example.evaluacion3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class Menu_act extends AppCompatActivity {

    private VideoView video;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_act);

        video = (VideoView)findViewById(R.id.videoView2);

        String ruta = "android.resource://" + getPackageName() + "/" + R.raw.video;
        Uri uri = Uri.parse(ruta);
        video.setVideoURI(uri);

        MediaController media = new MediaController(this);
        video.setMediaController(media);
    }

    public void promociones(View v)
    {
        Intent i = new Intent(this, Promociones_act.class);
        startActivity(i);
    }

    public void gestion(View v)
    {
        Intent i = new Intent(this, Firebase_act.class);
        startActivity(i);
    }
}