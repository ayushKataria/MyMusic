package com.example.akat2.myplayer;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.MediaController;

/**
 * Created by akat2 on 23-12-2017.
 */

public class MusicController extends MediaController {

    public MusicController(Context context) {
        super(context);
    }

    @Override
    public void hide() {

    }

    @Override
    public boolean dispatchKeyEvent(KeyEvent event) {
        if(event.getKeyCode() == KeyEvent.KEYCODE_BACK){
            Context context = getContext();
            ((Activity)context).finish();
            return true;
        }
        return super.dispatchKeyEvent(event);
    }
}
