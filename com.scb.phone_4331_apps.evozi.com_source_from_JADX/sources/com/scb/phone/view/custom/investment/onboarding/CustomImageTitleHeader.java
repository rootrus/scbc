package com.scb.phone.view.custom.investment.onboarding;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import p040o.ZHER2K$MediaBrowserCompat$CustomActionResultReceiver;

public class CustomImageTitleHeader extends LinearLayout {
    @BindView
    ImageView imageViewTitle;
    private String read;
    @BindView
    TextView textViewDesc;
    private Drawable write;

    public CustomImageTitleHeader(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ZHER2K$MediaBrowserCompat$CustomActionResultReceiver.CustomImageTitleHeader, 0, 0);
        this.read = obtainStyledAttributes.getString(0);
        this.write = obtainStyledAttributes.getDrawable(1);
        obtainStyledAttributes.recycle();
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.f82072131493433, this, true);
        ButterKnife.IconCompatParcelizer(this);
        if (this.write != null) {
            this.imageViewTitle.setVisibility(0);
            setDrawableImageTitle(this.write);
        }
        setTitle(this.read);
    }

    public CustomImageTitleHeader(Context context) {
        super(context);
    }

    public CustomImageTitleHeader(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void setDrawableImageTitle(Drawable drawable) {
        this.imageViewTitle.setImageDrawable(drawable);
    }

    public void setTitle(String str) {
        this.textViewDesc.setText(str);
    }
}
