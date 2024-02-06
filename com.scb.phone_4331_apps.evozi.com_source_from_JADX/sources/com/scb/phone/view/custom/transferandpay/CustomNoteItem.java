package com.scb.phone.view.custom.transferandpay;

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

public class CustomNoteItem extends LinearLayout {
    private String IconCompatParcelizer;
    private int MediaBrowserCompat$ItemReceiver = 0;
    @BindView
    public View bottomSpace;
    @BindView
    TextView descriptionTextView;
    @BindView
    public View divider;
    @BindView
    View dividerSpace;
    @BindView
    TextView titleTextView;
    @BindView
    public View topSpace;

    public CustomNoteItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.MediaBrowserCompat$ItemReceiver = context.getResources().getDimensionPixelOffset(R.dimen.f72472131165407);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ZHER2K$MediaBrowserCompat$CustomActionResultReceiver.CustomNoteItem, 0, 0);
        this.IconCompatParcelizer = obtainStyledAttributes.getString(0);
        obtainStyledAttributes.recycle();
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.f83452131493571, this, true);
        ButterKnife.IconCompatParcelizer(this);
        this.titleTextView.setText(this.IconCompatParcelizer);
    }

    public void setTitle(String str) {
        this.titleTextView.setText(str);
    }

    public void setText(String str) {
        this.descriptionTextView.setText(str);
    }

    public final void write() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        int i = this.MediaBrowserCompat$ItemReceiver;
        layoutParams.setMargins(i, 0, i, 0);
        this.descriptionTextView.setLayoutParams(layoutParams);
    }

    public void setFullDivider(boolean z) {
        this.dividerSpace.setVisibility(z ? 8 : 0);
    }
}
