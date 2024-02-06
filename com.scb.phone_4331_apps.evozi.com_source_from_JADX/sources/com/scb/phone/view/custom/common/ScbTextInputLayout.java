package com.scb.phone.view.custom.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.scb.phone.R;
import p040o.ZHER2K$MediaBrowserCompat$CustomActionResultReceiver;

public class ScbTextInputLayout extends LinearLayout {
    private String IconCompatParcelizer;
    private TextView MediaBrowserCompat$CustomActionResultReceiver;
    private boolean MediaBrowserCompat$ItemReceiver;
    private int MediaBrowserCompat$MediaItem;
    private TextView MediaBrowserCompat$SearchResultReceiver;
    private String MediaDescriptionCompat;
    private String RatingCompat;
    private int read;
    private String write;

    public ScbTextInputLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    /* JADX INFO: finally extract failed */
    public ScbTextInputLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOrientation(1);
        int i = 0;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, ZHER2K$MediaBrowserCompat$CustomActionResultReceiver.ScbTextInputLayout, 0, 0);
        try {
            this.MediaDescriptionCompat = obtainStyledAttributes.getString(4);
            this.MediaBrowserCompat$MediaItem = obtainStyledAttributes.getResourceId(6, R.style.f97952131821015);
            this.RatingCompat = obtainStyledAttributes.getString(5);
            this.write = obtainStyledAttributes.getString(1);
            this.read = obtainStyledAttributes.getResourceId(3, R.style.f98882131821109);
            this.IconCompatParcelizer = obtainStyledAttributes.getString(2);
            this.MediaBrowserCompat$ItemReceiver = obtainStyledAttributes.getBoolean(0, false);
            obtainStyledAttributes.recycle();
            if (this.RatingCompat == null) {
                this.RatingCompat = "fonts/db_heavent_regular.ttf";
            }
            if (this.IconCompatParcelizer == null) {
                this.IconCompatParcelizer = "fonts/db_heavent_regular.ttf";
            }
            TextView textView = new TextView(context);
            this.MediaBrowserCompat$SearchResultReceiver = textView;
            textView.setTextAppearance(context, this.MediaBrowserCompat$MediaItem);
            this.MediaBrowserCompat$SearchResultReceiver.setText(this.MediaDescriptionCompat);
            this.MediaBrowserCompat$SearchResultReceiver.setTypeface(Typeface.createFromAsset(context.getAssets(), this.RatingCompat));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.bottomMargin = context.getResources().getDimensionPixelSize(R.dimen.f72532131165444);
            addView(this.MediaBrowserCompat$SearchResultReceiver, layoutParams);
            TextView textView2 = new TextView(context);
            this.MediaBrowserCompat$CustomActionResultReceiver = textView2;
            textView2.setTextAppearance(context, this.read);
            this.MediaBrowserCompat$CustomActionResultReceiver.setText(this.write);
            this.MediaBrowserCompat$CustomActionResultReceiver.setTypeface(Typeface.createFromAsset(context.getAssets(), this.IconCompatParcelizer));
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams2.topMargin = context.getResources().getDimensionPixelSize(R.dimen.f72532131165444);
            addView(this.MediaBrowserCompat$CustomActionResultReceiver, layoutParams2);
            this.MediaBrowserCompat$CustomActionResultReceiver.setVisibility(!this.MediaBrowserCompat$ItemReceiver ? 8 : i);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof EditText) {
            super.addView(view, 1, layoutParams);
        } else {
            super.addView(view, i, layoutParams);
        }
    }

    public void setErrorEnabled(boolean z) {
        this.MediaBrowserCompat$ItemReceiver = z;
        this.MediaBrowserCompat$CustomActionResultReceiver.setVisibility(z ? 0 : 8);
    }
}
