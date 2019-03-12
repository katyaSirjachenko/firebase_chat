package com.sirjachenko.chat_firebase;

import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;

public class BackgroundChange {
    protected RecyclerView recyclerView;
    protected int backg;

    public BackgroundChange(RecyclerView a){
        recyclerView=a;
        backg=R.drawable.chat_background;
    }

    public void setNext() {
        switch (backg){
            case R.drawable.chat_background:
                backg=R.drawable.chat_background1;
                break;
            case R.drawable.chat_background1:
                backg=R.drawable.chat_background2;
                break;
            case R.drawable.chat_background2:
                backg=R.drawable.chat_background;
                break;
        }
        recyclerView.setBackgroundResource(backg);
    }
}
