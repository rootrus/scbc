package com.scb.phone.view.custom.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import p040o.ZHER2K$MediaBrowserCompat$CustomActionResultReceiver;

public class CustomInfoArrow extends ConstraintLayout {
    private boolean IconCompatParcelizer;
    private String MediaBrowserCompat$CustomActionResultReceiver;
    private String MediaBrowserCompat$SearchResultReceiver;
    @BindView
    TextView descriptionTextView;
    @BindView
    public View divider;
    @BindView
    TextView infoTextView;
    @BindView
    TextView titleTextView;
    private String write;

    public CustomInfoArrow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(R.layout.f82102131493436, this, true);
        ButterKnife.IconCompatParcelizer(this);
        int i = 0;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, ZHER2K$MediaBrowserCompat$CustomActionResultReceiver.CustomInfoArrow, 0, 0);
            try {
                this.MediaBrowserCompat$SearchResultReceiver = obtainStyledAttributes.getString(3);
                this.write = obtainStyledAttributes.getString(2);
                this.MediaBrowserCompat$CustomActionResultReceiver = obtainStyledAttributes.getString(1);
                this.IconCompatParcelizer = obtainStyledAttributes.getBoolean(0, false);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        setTitle(this.MediaBrowserCompat$SearchResultReceiver);
        setSubtitle(this.write);
        setDescription(this.MediaBrowserCompat$CustomActionResultReceiver);
        this.divider.setVisibility(!this.IconCompatParcelizer ? 8 : i);
    }

    public void setTitle(String str) {
        this.titleTextView.setText(str);
    }

    public void setSubtitle(String str) {
        this.infoTextView.setText(str);
    }

    public void setDescription(String str) {
        if (str != null) {
            this.descriptionTextView.setVisibility(0);
            this.descriptionTextView.setText(str);
        }
    }
}
