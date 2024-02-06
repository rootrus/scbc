package com.scb.phone.view.custom.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import p040o.ZHER2K$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.setLastBaselineToBottomHeight;

public class CustomDisclosureCell extends RelativeLayout {
    private boolean IconCompatParcelizer;
    private Drawable MediaBrowserCompat$CustomActionResultReceiver;
    private int MediaBrowserCompat$ItemReceiver;
    private String MediaBrowserCompat$SearchResultReceiver;
    @BindView
    View divider;
    @BindView
    ImageView icon;
    private Drawable read;
    @BindView
    View ripple;
    @BindView
    TextView text;
    private int write;

    public CustomDisclosureCell(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ZHER2K$MediaBrowserCompat$CustomActionResultReceiver.CustomCellOptions, 0, 0);
        this.write = obtainStyledAttributes.getColor(5, setLastBaselineToBottomHeight.read(context, R.color.f71012131100257));
        this.MediaBrowserCompat$SearchResultReceiver = obtainStyledAttributes.getString(4) != null ? obtainStyledAttributes.getString(4) : "";
        this.read = obtainStyledAttributes.getDrawable(0) != null ? obtainStyledAttributes.getDrawable(0) : setLastBaselineToBottomHeight.write(context, R.drawable.ic_arrow_8);
        this.MediaBrowserCompat$CustomActionResultReceiver = obtainStyledAttributes.getDrawable(1) != null ? obtainStyledAttributes.getDrawable(1) : setLastBaselineToBottomHeight.write(context, R.drawable.ripple_purple);
        this.MediaBrowserCompat$ItemReceiver = obtainStyledAttributes.getDimensionPixelSize(2, -1);
        this.IconCompatParcelizer = obtainStyledAttributes.getBoolean(3, true);
        obtainStyledAttributes.recycle();
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.f81192131493345, this, true);
        ButterKnife.IconCompatParcelizer(this);
        this.text.setText(this.MediaBrowserCompat$SearchResultReceiver);
        this.text.setTextColor(this.write);
        this.icon.setImageDrawable(this.read);
        this.ripple.setBackground(this.MediaBrowserCompat$CustomActionResultReceiver);
        this.ripple.getLayoutParams().height = this.MediaBrowserCompat$ItemReceiver;
        if (this.IconCompatParcelizer) {
            this.divider.setVisibility(0);
        }
    }
}
