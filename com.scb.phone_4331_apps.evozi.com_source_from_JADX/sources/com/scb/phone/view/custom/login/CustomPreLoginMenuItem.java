package com.scb.phone.view.custom.login;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import p040o.ZHER2K$MediaBrowserCompat$CustomActionResultReceiver;

public class CustomPreLoginMenuItem extends LinearLayout {
    private String MediaBrowserCompat$ItemReceiver;
    @BindView
    ImageView imageIcon;
    @BindView
    TextView textTitle;
    private Drawable write;

    public CustomPreLoginMenuItem(Context context) {
        super(context);
        inflate(getContext(), R.layout.f84372131493663, this);
        ButterKnife.IconCompatParcelizer(this);
        MediaBrowserCompat$ItemReceiver((AttributeSet) null);
        this.textTitle.setText(this.MediaBrowserCompat$ItemReceiver);
        this.imageIcon.setImageDrawable(this.write);
    }

    public CustomPreLoginMenuItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        inflate(getContext(), R.layout.f84372131493663, this);
        ButterKnife.IconCompatParcelizer(this);
        MediaBrowserCompat$ItemReceiver(attributeSet);
        this.textTitle.setText(this.MediaBrowserCompat$ItemReceiver);
        this.imageIcon.setImageDrawable(this.write);
    }

    public CustomPreLoginMenuItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        inflate(getContext(), R.layout.f84372131493663, this);
        ButterKnife.IconCompatParcelizer(this);
        MediaBrowserCompat$ItemReceiver(attributeSet);
        this.textTitle.setText(this.MediaBrowserCompat$ItemReceiver);
        this.imageIcon.setImageDrawable(this.write);
    }

    private void MediaBrowserCompat$ItemReceiver(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, ZHER2K$MediaBrowserCompat$CustomActionResultReceiver.CustomPreLoginMenuItem, 0, 0);
            this.MediaBrowserCompat$ItemReceiver = obtainStyledAttributes.getString(1);
            this.write = obtainStyledAttributes.getDrawable(0);
            obtainStyledAttributes.recycle();
        }
    }
}
