package com.example.sm_pc.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.json.JSONException;
import org.json.JSONObject;


import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import org.json.simple.JSONValue;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        try{

            String urlStr = "http://52.78.129.27:3000/board/show";
            URL url = new URL(urlStr);

            InputStreamReader isr = new InputStreamReader(url.openConnection().getInputStream(),"UTF-8");
            JSONObject object = (JSONObject)






        }catch(Exception e){
            e.printStackTrace();
        }


    }
}
