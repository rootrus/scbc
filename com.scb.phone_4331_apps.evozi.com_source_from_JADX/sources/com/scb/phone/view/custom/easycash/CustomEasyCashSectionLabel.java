package com.scb.phone.view.custom.easycash;

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
import p040o.setLastBaselineToBottomHeight;

public class CustomEasyCashSectionLabel extends LinearLayout {
    @BindView
    View bottomDivider;
    @BindView
    TextView textView;
    @BindView
    View topDivider;

    public CustomEasyCashSectionLabel(Context context) {
        this(context, (AttributeSet) null);
    }

    public CustomEasyCashSectionLabel(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: finally extract failed */
    public CustomEasyCashSectionLabel(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.f81762131493402, this, true);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ZHER2K$MediaBrowserCompat$CustomActionResultReceiver.CustomEasyCashSectionLabel, 0, 0);
        try {
            String string = obtainStyledAttributes.getString(2);
            boolean z = obtainStyledAttributes.getBoolean(0, false);
            boolean z2 = obtainStyledAttributes.getBoolean(1, false);
            obtainStyledAttributes.recycle();
            ButterKnife.IconCompatParcelizer(this);
            if (string != null) {
                this.textView.setText(z2 ? string.toUpperCase() : string);
            }
            if (z) {
                this.textView.setBackground(setLastBaselineToBottomHeight.write(context, R.drawable.border_gray_bg_lighter_gray));
            }
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public void setText(String str) {
        this.textView.setText(str);
    }
}
