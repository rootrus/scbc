package com.google.android.material.tabs;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import p040o.AlertController$RecycleListView;
import p040o.nAllocationSetSurface$MediaSessionCompat$Token;

public class TabItem extends View {
    public final int IconCompatParcelizer;
    public final Drawable read;
    public final CharSequence write;

    public TabItem(Context context) {
        this(context, (AttributeSet) null);
    }

    public TabItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AlertController$RecycleListView.MediaDescriptionCompat mediaDescriptionCompat = new AlertController$RecycleListView.MediaDescriptionCompat(context, context.obtainStyledAttributes(attributeSet, nAllocationSetSurface$MediaSessionCompat$Token.TabItem));
        this.write = mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.getText(nAllocationSetSurface$MediaSessionCompat$Token.TabItem_android_text);
        this.read = mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver(nAllocationSetSurface$MediaSessionCompat$Token.TabItem_android_icon);
        this.IconCompatParcelizer = mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.getResourceId(nAllocationSetSurface$MediaSessionCompat$Token.TabItem_android_layout, 0);
        mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.recycle();
    }
}
