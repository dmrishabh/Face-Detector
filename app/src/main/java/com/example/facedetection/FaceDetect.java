package com.example.facedetection;

import android.app.Application;

import com.google.firebase.FirebaseApp;

public class FaceDetect extends Application {

    public static final String result_txt = "RESULT_TEXT";
    public static final String result_dialog = "RESULT_DIALOG";

    @Override
    public void onCreate() {
        super.onCreate();
        FirebaseApp.initializeApp(this);
    }
}
