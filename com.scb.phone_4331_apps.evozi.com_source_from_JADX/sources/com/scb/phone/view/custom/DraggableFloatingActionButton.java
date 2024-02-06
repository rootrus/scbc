package com.scb.phone.view.custom;

import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class DraggableFloatingActionButton extends FloatingActionButton implements View.OnTouchListener {
    private float Keep;
    private float MediaBrowserCompat$MediaItem;
    private float MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private float f3070x50fd9e4a;
    private float MediaDescriptionCompat;
    private float MediaSessionCompat$QueueItem;
    private int MediaSessionCompat$ResultReceiverWrapper;
    private float MediaSessionCompat$Token;
    private float ParcelableVolumeInfo;

    public DraggableFloatingActionButton(Context context) {
        super(context);
        MediaBrowserCompat$ItemReceiver();
    }

    public DraggableFloatingActionButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MediaBrowserCompat$ItemReceiver();
    }

    public DraggableFloatingActionButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        MediaBrowserCompat$ItemReceiver();
    }

    private void MediaBrowserCompat$ItemReceiver() {
        this.MediaSessionCompat$QueueItem = (float) ((int) TypedValue.applyDimension(1, 16.0f, getContext().getResources().getDisplayMetrics()));
        this.Keep = (float) ((int) TypedValue.applyDimension(1, 24.0f, getContext().getResources().getDisplayMetrics()));
        setOnTouchListener(this);
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.MediaBrowserCompat$MediaItem = motionEvent.getRawX();
            this.ParcelableVolumeInfo = motionEvent.getRawY();
            this.MediaBrowserCompat$SearchResultReceiver = view.getX() - this.MediaBrowserCompat$MediaItem;
            this.MediaDescriptionCompat = view.getY() - this.ParcelableVolumeInfo;
            return true;
        } else if (action == 1) {
            float rawX = motionEvent.getRawX();
            float rawY = motionEvent.getRawY();
            float f = this.MediaBrowserCompat$MediaItem;
            float f2 = this.ParcelableVolumeInfo;
            if (Math.abs(rawX - f) < 10.0f && Math.abs(rawY - f2) < 10.0f) {
                return performClick();
            }
            if (this.MediaSessionCompat$Token >= ((float) (this.MediaSessionCompat$ResultReceiverWrapper / 2))) {
                view.animate().x(((float) this.MediaSessionCompat$ResultReceiverWrapper) - this.MediaSessionCompat$QueueItem).y(this.f3070x50fd9e4a).setDuration(200).start();
            } else {
                view.animate().x(this.MediaSessionCompat$QueueItem).y(this.f3070x50fd9e4a).setDuration(200).start();
            }
            return true;
        } else if (action != 2) {
            return super.onTouchEvent(motionEvent);
        } else {
            View view2 = (View) view.getParent();
            int width = view.getWidth();
            int height = view.getHeight();
            int width2 = view2.getWidth();
            int height2 = view2.getHeight();
            this.MediaSessionCompat$ResultReceiverWrapper = width2 - width;
            float rawX2 = motionEvent.getRawX() + this.MediaBrowserCompat$SearchResultReceiver;
            this.MediaSessionCompat$Token = rawX2;
            float max = Math.max(this.MediaSessionCompat$QueueItem, rawX2);
            this.MediaSessionCompat$Token = max;
            this.MediaSessionCompat$Token = Math.min(((float) this.MediaSessionCompat$ResultReceiverWrapper) - this.MediaSessionCompat$QueueItem, max);
            float rawY2 = motionEvent.getRawY() + this.MediaDescriptionCompat;
            this.f3070x50fd9e4a = rawY2;
            float max2 = Math.max(this.Keep + this.MediaSessionCompat$QueueItem, rawY2);
            this.f3070x50fd9e4a = max2;
            this.f3070x50fd9e4a = Math.min(((float) (height2 - height)) - this.MediaSessionCompat$QueueItem, max2);
            view.animate().x(this.MediaSessionCompat$Token).y(this.f3070x50fd9e4a).setDuration(0).start();
            return true;
        }
    }
}
