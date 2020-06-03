package com.bilal.audio_read;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.net.rtp.AudioStream;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;


import static com.bilal.audio_read.R.*;

public class Piono extends AppCompatActivity  {
Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17;

    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_piono);
      // Piono.setRequestedOrientation(activity_piono.SCREEN_ORIENTATION_LANDSCAPE);
        b1 =(Button)findViewById(R.id.b);
        b2 =(Button)findViewById(R.id.b2);
        b3 =(Button)findViewById(R.id.b3);
        b4 =(Button)findViewById(R.id.b4);

        b5 =(Button)findViewById(R.id.b5);
        b6 =(Button)findViewById(R.id.b6);
        b7 =(Button)findViewById(R.id.b7);

        b8 =(Button)findViewById(R.id.b8);
        b9 =(Button)findViewById(R.id.b9);
        b10 =(Button)findViewById(R.id.b10);

        b11 =(Button)findViewById(id.b14);
        b12 =(Button)findViewById(R.id.b18);
        b13 =(Button)findViewById(R.id.b15);

        b14 =(Button)findViewById(R.id.b17);
        b15 =(Button)findViewById(R.id.b16);
        b16 =(Button)findViewById(R.id.b13);
        b17 =(Button)findViewById(R.id.b19);





        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    try {


                        mediaPlayer = mediaPlayer.create(Piono.this, R.raw.c);
                        mediaPlayer.start();
                    } catch (Exception e) {
                        e.printStackTrace();

                    }
                }


        });


        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    try {

                        mediaPlayer = mediaPlayer.create(Piono.this, R.raw.e);

                        mediaPlayer.start();

                    } catch (Exception e) {

                        e.printStackTrace();
                    }

                }

        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    try {

                        mediaPlayer = mediaPlayer.create(Piono.this, R.raw.d);

                        mediaPlayer.start();

                    } catch (Exception e) {

                        e.printStackTrace();
                    }

                }

        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    try {

                        mediaPlayer = mediaPlayer.create(Piono.this, R.raw.f);

                        mediaPlayer.start();

                    } catch (Exception e) {

                        e.printStackTrace();
                    }

                }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    try {

                        mediaPlayer = mediaPlayer.create(Piono.this, R.raw.g);

                        mediaPlayer.start();

                    } catch (Exception e) {

                        e.printStackTrace();
                    }

                }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    try {

                        mediaPlayer = mediaPlayer.create(Piono.this, R.raw.a);

                        mediaPlayer.start();

                    } catch (Exception e) {

                        e.printStackTrace();
                    }

                }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    try {

                        mediaPlayer = mediaPlayer.create(Piono.this, raw.f1);

                        mediaPlayer.start();

                    } catch (Exception e) {

                        e.printStackTrace();
                    }

                }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    try {

                        mediaPlayer = mediaPlayer.create(Piono.this, R.raw.b);

                        mediaPlayer.start();

                    } catch (Exception e) {

                        e.printStackTrace();
                    }

                }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    try {

                        mediaPlayer = mediaPlayer.create(Piono.this, raw.c_s1);

                        mediaPlayer.start();

                    } catch (Exception e) {

                        e.printStackTrace();
                    }

                }
        });

        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    try {

                        mediaPlayer = mediaPlayer.create(Piono.this, raw.d);

                        mediaPlayer.start();

                    } catch (Exception e) {

                        e.printStackTrace();
                    }

                }
        });

        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {

                    mediaPlayer = mediaPlayer.create(Piono.this, raw.f_drum);

                    mediaPlayer.start();

                } catch (Exception e) {

                    e.printStackTrace();
                }

            }
        });

        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {

                    mediaPlayer = mediaPlayer.create(Piono.this, raw.g_drum);

                    mediaPlayer.start();

                } catch (Exception e) {

                    e.printStackTrace();
                }

            }
        });

        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {

                    mediaPlayer = mediaPlayer.create(Piono.this, raw.c1_drum);

                    mediaPlayer.start();

                } catch (Exception e) {

                    e.printStackTrace();
                }

            }
        });

        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {

                    mediaPlayer = mediaPlayer.create(Piono.this, raw.bb_drum);

                    mediaPlayer.start();

                } catch (Exception e) {

                    e.printStackTrace();
                }

            }
        });


        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {

                    mediaPlayer = mediaPlayer.create(Piono.this, raw.d1_drum);

                    mediaPlayer.start();

                } catch (Exception e) {

                    e.printStackTrace();
                }

            }
        });

        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {

                    mediaPlayer = mediaPlayer.create(Piono.this, raw.c_drum);

                    mediaPlayer.start();

                } catch (Exception e) {

                    e.printStackTrace();
                }

            }
        });

        b17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {

                    mediaPlayer = mediaPlayer.create(Piono.this, raw.d_drum);

                    mediaPlayer.start();

                } catch (Exception e) {

                    e.printStackTrace();
                }

            }
        });
    }




           // Uri myUri = "E:\\BILAL DATA\\Semseter 4\\New Folder\\Music_Note\\Music_Note\\C.wav";

           // mediaPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
            //mediaPlayer.setDataSource(getApplicationContext(), myUri);
            //mediaPlayer.prepare();





}
