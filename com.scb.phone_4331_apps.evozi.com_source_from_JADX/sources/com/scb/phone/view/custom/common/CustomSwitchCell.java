package com.scb.phone.view.custom.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import p040o.ZHER2K$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.setLastBaselineToBottomHeight;

public class CustomSwitchCell extends RelativeLayout {
    private int IconCompatParcelizer;
    private Drawable MediaBrowserCompat$CustomActionResultReceiver;
    private boolean MediaBrowserCompat$ItemReceiver;
    @BindView
    View divider;
    private int read;
    @BindView
    View ripple;
    @BindView
    SwitchCompat switchCompat;
    @BindView
    TextView text;
    private String write;

    public CustomSwitchCell(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ZHER2K$MediaBrowserCompat$CustomActionResultReceiver.CustomCellOptions, 0, 0);
        this.IconCompatParcelizer = obtainStyledAttributes.getColor(5, setLastBaselineToBottomHeight.read(context, R.color.f71012131100257));
        this.write = obtainStyledAttributes.getString(4) != null ? obtainStyledAttributes.getString(4) : "";
        this.MediaBrowserCompat$CustomActionResultReceiver = obtainStyledAttributes.getDrawable(1) != null ? obtainStyledAttributes.getDrawable(1) : setLastBaselineToBottomHeight.write(context, R.drawable.ripple_purple);
        this.read = obtainStyledAttributes.getDimensionPixelSize(2, -1);
        this.MediaBrowserCompat$ItemReceiver = obtainStyledAttributes.getBoolean(3, true);
        obtainStyledAttributes.recycle();
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.f81212131493347, this, true);
        ButterKnife.IconCompatParcelizer(this);
        this.text.setText(this.write);
        this.text.setTextColor(this.IconCompatParcelizer);
        this.ripple.setBackground(this.MediaBrowserCompat$CustomActionResultReceiver);
        this.ripple.getLayoutParams().height = this.read;
        if (this.MediaBrowserCompat$ItemReceiver) {
            this.divider.setVisibility(0);
        }
    }
}
