package com.scb.phone.view.custom.common;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import kotlin.TypeCastException;
import p040o.FragmentBuilder_BindCardlessATMTutorialFragment;
import p040o.onGetStartedClick;

public final class CustomInstallmentBillsToPay extends CustomBaseBillsToPay<FragmentBuilder_BindCardlessATMTutorialFragment> {
    @BindView
    public TextView mAmountTitleTextView;
    @BindView
    public TextView mAmountValueTextView;
    @BindView
    public TextView mDueDateValueTextView;
    @BindView
    public ImageView mIconImageView;
    @BindView
    public Button mInstallmentButton;
    @BindView
    public TextView mMinimumPaymentValueTextView;
    @BindView
    public Button mPayButton;
    @BindView
    public TextView mStatementDateValueTextView;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CustomInstallmentBillsToPay(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) attributeSet, "attrs");
    }

    public final void setMIconImageView(ImageView imageView) {
        onGetStartedClick.write((Object) imageView, "<set-?>");
        this.mIconImageView = imageView;
    }

    public final void setMAmountTitleTextView(TextView textView) {
        onGetStartedClick.write((Object) textView, "<set-?>");
        this.mAmountTitleTextView = textView;
    }

    public final void setMAmountValueTextView(TextView textView) {
        onGetStartedClick.write((Object) textView, "<set-?>");
        this.mAmountValueTextView = textView;
    }

    public final void setMMinimumPaymentValueTextView(TextView textView) {
        onGetStartedClick.write((Object) textView, "<set-?>");
        this.mMinimumPaymentValueTextView = textView;
    }

    public final void setMStatementDateValueTextView(TextView textView) {
        onGetStartedClick.write((Object) textView, "<set-?>");
        this.mStatementDateValueTextView = textView;
    }

    public final void setMDueDateValueTextView(TextView textView) {
        onGetStartedClick.write((Object) textView, "<set-?>");
        this.mDueDateValueTextView = textView;
    }

    public final void setMPayButton(Button button) {
        onGetStartedClick.write((Object) button, "<set-?>");
        this.mPayButton = button;
    }

    public final void setMInstallmentButton(Button button) {
        onGetStartedClick.write((Object) button, "<set-?>");
        this.mInstallmentButton = button;
    }

    /* access modifiers changed from: protected */
    public final void MediaBrowserCompat$ItemReceiver() {
        Object systemService = getContext().getSystemService("layout_inflater");
        if (systemService != null) {
            ((LayoutInflater) systemService).inflate(R.layout.f82162131493442, this, true);
            ButterKnife.IconCompatParcelizer(this);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.LayoutInflater");
    }

    /* access modifiers changed from: protected */
    public final void MediaBrowserCompat$SearchResultReceiver() {
        super.MediaBrowserCompat$SearchResultReceiver();
        Button button = this.mInstallmentButton;
        if (button == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mInstallmentButton");
        }
        button.setOnClickListener(new write(this));
    }

    static final class write implements View.OnClickListener {
        private /* synthetic */ CustomInstallmentBillsToPay write;

        write(CustomInstallmentBillsToPay customInstallmentBillsToPay) {
            this.write = customInstallmentBillsToPay;
        }

        public final void onClick(View view) {
            FragmentBuilder_BindCardlessATMTutorialFragment fragmentBuilder_BindCardlessATMTutorialFragment = (FragmentBuilder_BindCardlessATMTutorialFragment) this.write.IconCompatParcelizer;
            if (fragmentBuilder_BindCardlessATMTutorialFragment != null) {
                fragmentBuilder_BindCardlessATMTutorialFragment.MediaDescriptionCompat();
            }
        }
    }

    /* access modifiers changed from: protected */
    public final TextView read() {
        TextView textView = this.mAmountTitleTextView;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mAmountTitleTextView");
        }
        return textView;
    }

    /* access modifiers changed from: protected */
    public final TextView IconCompatParcelizer() {
        TextView textView = this.mAmountValueTextView;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mAmountValueTextView");
        }
        return textView;
    }

    /* access modifiers changed from: protected */
    public final TextView MediaBrowserCompat$MediaItem() {
        TextView textView = this.mMinimumPaymentValueTextView;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mMinimumPaymentValueTextView");
        }
        return textView;
    }

    /* access modifiers changed from: protected */
    public final TextView RatingCompat() {
        TextView textView = this.mStatementDateValueTextView;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mStatementDateValueTextView");
        }
        return textView;
    }

    /* access modifiers changed from: protected */
    public final TextView MediaBrowserCompat$CustomActionResultReceiver() {
        TextView textView = this.mDueDateValueTextView;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mDueDateValueTextView");
        }
        return textView;
    }

    /* access modifiers changed from: protected */
    public final Button MediaMetadataCompat() {
        Button button = this.mPayButton;
        if (button == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mPayButton");
        }
        return button;
    }

    /* access modifiers changed from: protected */
    public final ImageView MediaDescriptionCompat() {
        ImageView imageView = this.mIconImageView;
        if (imageView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mIconImageView");
        }
        return imageView;
    }

    public final void setInstallmentVisibility(boolean z) {
        Button button = this.mInstallmentButton;
        if (button == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mInstallmentButton");
        }
        button.setVisibility(z ? 0 : 4);
    }

    public final void setInstallmentEnability(boolean z) {
        Button button = this.mInstallmentButton;
        if (button == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mInstallmentButton");
        }
        button.setEnabled(z);
    }
}
