package com.scb.phone.view.custom.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import p040o.ZHER2K$MediaBrowserCompat$CustomActionResultReceiver;

public class CustomImageWithText extends LinearLayout {
    @BindView
    ImageView ivLeftImage;
    @BindView
    ThaiTextView tvRightText;

    public CustomImageWithText(Context context) {
        super(context);
        write((AttributeSet) null);
    }

    public CustomImageWithText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        write(attributeSet);
    }

    public CustomImageWithText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        write(attributeSet);
    }

    private void write(AttributeSet attributeSet) {
        String str;
        Drawable drawable;
        LayoutInflater.from(getContext()).inflate(R.layout.f82082131493434, this, true);
        ButterKnife.IconCompatParcelizer(this);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, ZHER2K$MediaBrowserCompat$CustomActionResultReceiver.CustomImageWithText, 0, 0);
            drawable = obtainStyledAttributes.getDrawable(0);
            str = obtainStyledAttributes.getString(1);
            obtainStyledAttributes.recycle();
        } else {
            drawable = null;
            str = "";
        }
        if (drawable != null) {
            this.ivLeftImage.setImageDrawable(drawable);
        }
        if (str != null && !str.isEmpty()) {
            this.tvRightText.setText(str);
        }
    }
}
