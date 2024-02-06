package com.scb.phone.view.custom;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

public class KnockKnockView extends View {
    private GestureDetector write;

    public interface write {
    }

    public void setOnKnockListener(write write2) {
    }

    public KnockKnockView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.write = new GestureDetector(context, new IconCompatParcelizer(this, (byte) 0));
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.write.onTouchEvent(motionEvent);
    }

    class IconCompatParcelizer extends GestureDetector.SimpleOnGestureListener {
        public final boolean onDoubleTap(MotionEvent motionEvent) {
            return true;
        }

        public final boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        private IconCompatParcelizer(KnockKnockView knockKnockView) {
        }

        /* synthetic */ IconCompatParcelizer(KnockKnockView knockKnockView, byte b) {
            this(knockKnockView);
        }
    }
}
