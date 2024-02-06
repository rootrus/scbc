package com.scb.phone.view.custom.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import p040o.FastPayService;
import p040o.FragmentBuilder_BindBillPaymentReviewFragment;
import p040o.FragmentBuilder_BindDepositSelectorFragment;
import p040o.ZHER2K$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.setLastBaselineToBottomHeight;

public class CustomBillsToPay extends RelativeLayout {
    private int IconCompatParcelizer;
    private int MediaBrowserCompat$CustomActionResultReceiver;
    private int MediaBrowserCompat$ItemReceiver;
    private Context RatingCompat;
    @BindView
    TextView mAmountTitleTextView;
    @BindView
    TextView mAmountValueTextView;
    @BindView
    TextView mCompletedText;
    @BindView
    DefaultButton mDefaultButton;
    @BindView
    TextView mDueDateTextView;
    @BindView
    ImageView mIconDrawableImageView;
    private int read;
    public FragmentBuilder_BindBillPaymentReviewFragment write;

    public CustomBillsToPay(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ZHER2K$MediaBrowserCompat$CustomActionResultReceiver.CustomBillsToPay, 0, 0);
        this.read = obtainStyledAttributes.getColor(0, setLastBaselineToBottomHeight.read(context, R.color.f66092131099764));
        this.IconCompatParcelizer = obtainStyledAttributes.getDimensionPixelSize(1, context.getResources().getDimensionPixelSize(R.dimen.f72302131165354));
        this.MediaBrowserCompat$CustomActionResultReceiver = obtainStyledAttributes.getColor(2, setLastBaselineToBottomHeight.read(context, R.color.f67252131099881));
        this.MediaBrowserCompat$ItemReceiver = obtainStyledAttributes.getDimensionPixelSize(3, context.getResources().getDimensionPixelSize(R.dimen.f72312131165355));
        obtainStyledAttributes.recycle();
        this.RatingCompat = context;
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.f81112131493337, this, true);
        ButterKnife.IconCompatParcelizer(this);
        this.mAmountTitleTextView.setTextSize(2, ((float) this.IconCompatParcelizer) / this.RatingCompat.getResources().getDisplayMetrics().density);
        this.mAmountTitleTextView.setTextColor(this.read);
        this.mAmountValueTextView.setTextSize(2, ((float) this.MediaBrowserCompat$ItemReceiver) / this.RatingCompat.getResources().getDisplayMetrics().density);
        this.mAmountValueTextView.setTextColor(this.MediaBrowserCompat$CustomActionResultReceiver);
        this.mDefaultButton.setOnClickListener(new FastPayService(this));
    }

    public void setIconDrawable(Drawable drawable, int i) {
        if (drawable != null) {
            drawable.setColorFilter(i, PorterDuff.Mode.SRC_ATOP);
            this.mIconDrawableImageView.setImageDrawable(drawable);
        }
    }

    public void setIconDrawable(Drawable drawable) {
        if (drawable != null) {
            this.mIconDrawableImageView.setImageDrawable(drawable);
        }
    }

    public void setIconDrawable(String str, int i) {
        FragmentBuilder_BindDepositSelectorFragment.MediaBrowserCompat$CustomActionResultReceiver(setLastBaselineToBottomHeight.write(this.RatingCompat, i), this.mIconDrawableImageView, str);
    }

    public void setAmountTitle(String str) {
        if (str != null) {
            this.mAmountTitleTextView.setText(str);
        }
    }

    public void setAmountValue(String str) {
        if (str != null) {
            this.mAmountValueTextView.setText(str);
        }
    }

    public void setDueDate(String str) {
        if (str != null) {
            this.mDueDateTextView.setText(str);
        }
    }

    public void setCompletedText(String str) {
        this.mCompletedText.setText(str);
    }

    public void setOnCustomBillsToPayClickListener(FragmentBuilder_BindBillPaymentReviewFragment fragmentBuilder_BindBillPaymentReviewFragment) {
        this.write = fragmentBuilder_BindBillPaymentReviewFragment;
    }

    public void setPayButtonVisibility(int i) {
        this.mDefaultButton.setVisibility(i);
    }

    public void setAmountTitleTextVisibility(int i) {
        this.mAmountTitleTextView.setVisibility(i);
    }

    public void setAmountVisibility(int i) {
        this.mAmountValueTextView.setVisibility(i);
    }

    public void setDueDateVisibility(int i) {
        this.mDueDateTextView.setVisibility(i);
    }

    public void setCompletedTextVisibility(int i) {
        this.mCompletedText.setVisibility(i);
    }
}
