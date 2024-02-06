package com.scb.phone.view.custom.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import p040o.ZHER2K$MediaBrowserCompat$CustomActionResultReceiver;

public class CustomAddressItem extends LinearLayout {
    @BindView
    TextView descriptionTextView;
    @BindView
    View divider;
    private String read;
    @BindView
    TextView titleTextView;

    public CustomAddressItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ZHER2K$MediaBrowserCompat$CustomActionResultReceiver.CustomNoteItem, 0, 0);
        this.read = obtainStyledAttributes.getString(0);
        obtainStyledAttributes.recycle();
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.f82202131493446, this, true);
        ButterKnife.IconCompatParcelizer(this);
        this.titleTextView.setText(this.read);
    }

    public void setTitle(String str) {
        this.titleTextView.setText(str);
    }

    public void setText(String str) {
        this.descriptionTextView.setText(str);
    }
}
