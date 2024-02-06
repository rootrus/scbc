package com.scb.phone.view.custom.investment.onboarding;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import p040o.ZHER2K$MediaBrowserCompat$CustomActionResultReceiver;

public class CustomTextViewNavigation extends LinearLayout {
    private int IconCompatParcelizer;
    private CustomTextViewNavigation$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$CustomActionResultReceiver;
    private int MediaBrowserCompat$ItemReceiver;
    @BindView
    TextView labelTitle;
    @BindView
    RelativeLayout layoutDetailNavigation;
    private String read;
    @BindView
    public TextView textViewDesc;
    private String write;

    public void setOnClickDetailNavigationCompletion(CustomTextViewNavigation$MediaBrowserCompat$ItemReceiver customTextViewNavigation$MediaBrowserCompat$ItemReceiver) {
        this.MediaBrowserCompat$CustomActionResultReceiver = customTextViewNavigation$MediaBrowserCompat$ItemReceiver;
    }

    public CustomTextViewNavigation(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ZHER2K$MediaBrowserCompat$CustomActionResultReceiver.CustomTextViewNavigation, 0, 0);
        this.read = obtainStyledAttributes.getString(3);
        this.write = obtainStyledAttributes.getString(2);
        this.MediaBrowserCompat$ItemReceiver = obtainStyledAttributes.getInt(1, -1);
        this.IconCompatParcelizer = obtainStyledAttributes.getInt(0, -1);
        obtainStyledAttributes.recycle();
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.f84992131493726, this, true);
        ButterKnife.IconCompatParcelizer(this);
        setLabelTitle(this.read);
        setPlaceholderText(this.write);
        int i = this.MediaBrowserCompat$ItemReceiver;
        if (-1 != i) {
            this.textViewDesc.setMaxLines(i);
        }
        int i2 = this.IconCompatParcelizer;
        if (-1 != i2) {
            this.textViewDesc.setLines(i2);
        }
    }

    public CustomTextViewNavigation(Context context) {
        super(context);
    }

    public void setLabelTitle(String str) {
        this.labelTitle.setText(str);
    }

    public void setPlaceholderText(String str) {
        this.textViewDesc.setHint(str);
    }

    public void setDescriptionText(String str) {
        this.textViewDesc.setText(str);
    }

    public void setEnableNavigationArea(boolean z) {
        this.layoutDetailNavigation.setEnabled(z);
    }

    @OnClick
    public void onClickDetailNavigation() {
        CustomTextViewNavigation$MediaBrowserCompat$ItemReceiver customTextViewNavigation$MediaBrowserCompat$ItemReceiver = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (customTextViewNavigation$MediaBrowserCompat$ItemReceiver != null) {
            customTextViewNavigation$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver();
        }
    }
}
