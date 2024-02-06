package com.scb.phone.view.custom.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
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

@Deprecated
public class DefaultButton extends RelativeLayout {
    private Drawable IconCompatParcelizer;
    private Drawable MediaBrowserCompat$CustomActionResultReceiver;
    private Drawable MediaBrowserCompat$ItemReceiver;
    private int MediaBrowserCompat$MediaItem;
    private int MediaBrowserCompat$SearchResultReceiver;
    private String MediaDescriptionCompat;
    private String RatingCompat;
    @BindView
    ImageView mIconImageView;
    @BindView
    ImageView mIconImageViewRight;
    @BindView
    View mRippleView;
    @BindView
    TextView mTextView;
    private int read;
    private boolean write;

    public DefaultButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ZHER2K$MediaBrowserCompat$CustomActionResultReceiver.CustomButtonOptions, 0, 0);
        this.RatingCompat = obtainStyledAttributes.getString(6);
        this.MediaBrowserCompat$MediaItem = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        this.MediaDescriptionCompat = obtainStyledAttributes.getString(1);
        this.MediaBrowserCompat$SearchResultReceiver = obtainStyledAttributes.getColor(7, setLastBaselineToBottomHeight.read(context, R.color.f71012131100257));
        this.MediaBrowserCompat$CustomActionResultReceiver = obtainStyledAttributes.getDrawable(2);
        this.MediaBrowserCompat$ItemReceiver = obtainStyledAttributes.getDrawable(3);
        this.read = obtainStyledAttributes.getColor(4, setLastBaselineToBottomHeight.read(context, R.color.f71012131100257));
        this.IconCompatParcelizer = obtainStyledAttributes.getDrawable(5);
        this.write = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.f81622131493388, this, true);
        ButterKnife.IconCompatParcelizer(this);
        setClickable(true);
        String str = this.RatingCompat;
        if (str != null) {
            this.mTextView.setText(str);
        }
        this.mTextView.setTextColor(this.MediaBrowserCompat$SearchResultReceiver);
        int i = this.MediaBrowserCompat$MediaItem;
        if (i != 0) {
            this.mTextView.setTextSize(0, (float) i);
        }
        if (!TextUtils.isEmpty(this.MediaDescriptionCompat)) {
            this.mTextView.setTypeface(Typeface.createFromAsset(getContext().getAssets(), this.MediaDescriptionCompat));
        }
        Drawable drawable = this.IconCompatParcelizer;
        if (drawable != null) {
            this.mRippleView.setBackground(drawable);
        }
        if (this.MediaBrowserCompat$CustomActionResultReceiver != null) {
            this.mIconImageView.setVisibility(0);
            this.mIconImageView.setImageDrawable(this.MediaBrowserCompat$CustomActionResultReceiver);
            this.mIconImageView.setColorFilter(this.read);
        } else {
            this.mIconImageView.setVisibility(8);
        }
        if (this.MediaBrowserCompat$ItemReceiver != null) {
            this.mIconImageViewRight.setVisibility(0);
            this.mIconImageViewRight.setImageDrawable(this.MediaBrowserCompat$ItemReceiver);
            this.mIconImageViewRight.setColorFilter(this.read);
        } else {
            this.mIconImageViewRight.setVisibility(8);
        }
        setButtonEnabled(this.write);
    }

    public DefaultButton(Context context) {
        this(context, (AttributeSet) null);
    }

    public DefaultButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
    }

    public void setTextColor(int i) {
        this.MediaBrowserCompat$SearchResultReceiver = i;
        this.mTextView.setTextColor(i);
    }

    public void setText(String str) {
        this.RatingCompat = str;
        this.mTextView.setText(str);
    }

    public void setTextAllCaps(boolean z) {
        this.mTextView.setAllCaps(z);
    }

    public void setRipple(Drawable drawable) {
        if (drawable != null) {
            this.mRippleView.setBackground(drawable);
        }
    }

    public void setButtonEnabled(boolean z) {
        setEnabled(z);
        if (z) {
            setAlpha(1.0f);
        } else {
            setAlpha(0.6f);
        }
    }
}
