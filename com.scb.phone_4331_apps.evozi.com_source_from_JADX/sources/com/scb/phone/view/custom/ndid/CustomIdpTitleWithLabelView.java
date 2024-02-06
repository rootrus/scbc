package com.scb.phone.view.custom.ndid;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import p040o.ZHER2K$MediaBrowserCompat$CustomActionResultReceiver;

public class CustomIdpTitleWithLabelView extends LinearLayout {
    private CharSequence MediaBrowserCompat$CustomActionResultReceiver;
    private CharSequence MediaBrowserCompat$ItemReceiver;
    @BindView
    TextView tvLabel;
    @BindView
    TextView tvValue;
    private boolean write = true;

    public CustomIdpTitleWithLabelView(Context context) {
        super(context);
        boolean z = true;
        write(context, (AttributeSet) null);
        this.tvLabel.setText(this.MediaBrowserCompat$ItemReceiver);
        this.tvValue.setText(this.MediaBrowserCompat$CustomActionResultReceiver);
        if (this.write) {
            CharSequence charSequence = this.MediaBrowserCompat$CustomActionResultReceiver;
            int i = 0;
            if (!(charSequence == null || charSequence.length() == 0)) {
                z = false;
            }
            setVisibility(z ? 8 : i);
        }
    }

    public CustomIdpTitleWithLabelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        boolean z = true;
        write(context, attributeSet);
        this.tvLabel.setText(this.MediaBrowserCompat$ItemReceiver);
        this.tvValue.setText(this.MediaBrowserCompat$CustomActionResultReceiver);
        if (this.write) {
            CharSequence charSequence = this.MediaBrowserCompat$CustomActionResultReceiver;
            int i = 0;
            if (!(charSequence == null || charSequence.length() == 0)) {
                z = false;
            }
            setVisibility(z ? 8 : i);
        }
    }

    private void write(Context context, AttributeSet attributeSet) {
        LayoutInflater.from(context).inflate(R.layout.f82062131493432, this, true);
        ButterKnife.IconCompatParcelizer(this);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ZHER2K$MediaBrowserCompat$CustomActionResultReceiver.CustomIdpTitleWithLabelView, 0, 0);
            this.MediaBrowserCompat$ItemReceiver = obtainStyledAttributes.getText(0);
            this.MediaBrowserCompat$CustomActionResultReceiver = obtainStyledAttributes.getText(1);
            obtainStyledAttributes.recycle();
        }
    }

    public void setTextLabel(CharSequence charSequence) {
        this.MediaBrowserCompat$ItemReceiver = charSequence;
        this.tvLabel.setText(charSequence);
    }

    public void setTextValue(CharSequence charSequence) {
        this.MediaBrowserCompat$CustomActionResultReceiver = charSequence;
        this.tvValue.setText(charSequence);
        if (this.write) {
            CharSequence charSequence2 = this.MediaBrowserCompat$CustomActionResultReceiver;
            int i = 0;
            if (charSequence2 == null || charSequence2.length() == 0) {
                i = 8;
            }
            setVisibility(i);
        }
    }
}
