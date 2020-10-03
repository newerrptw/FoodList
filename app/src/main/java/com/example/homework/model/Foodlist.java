package com.example.homework.model;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.homework.R;

public class Foodlist {
    public final int imageResId;
    public final String mainword;
    public final String subword;

        public Foodlist(int imageResId, String mainword, String subword) {
        this.imageResId = imageResId;
        this.mainword = mainword;
        this.subword = subword;
    }
}