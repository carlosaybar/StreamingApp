/**
 * Author: Andhy Gomez
 *
 * Date Last Modified: 9/15/2020
 *
 * Description: Source code for, *app name in progress*. This app aims to allow individuals
 * to discretely live stream and record public interactions. The UI is a simple black screen with
 * a red button that starts to record and stream when pressed. Upon click the screen will also
 * turn black hiding the button to make it harder for someone to stop recording if the phone
 * is taken from the user.
 */

package com.example.streamingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{
    /**
     * Class Objects
     */
    Button redBoi;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // OnClickListener for record button
        redBoi = findViewById(R.id.rec_btn);
        redBoi.setOnClickListener(new View.OnClickListener()
        {
          public void onClick(View v)
          {

          }

          }
        });
    }

    public void videoCapture(View v)
    {
        Intent captureIntent = new Intent(MediaStore.ACTION_VIDEO_CAPTURE);

    }
}
