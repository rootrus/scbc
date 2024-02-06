package com.scb.phone.view.custom.transferandpay;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import p040o.FragmentBuilder_BindBillPaymentTabFragment;
import p040o.FragmentBuilder_BindDepositSelectorFragment;
import p040o.confirmRedeem;
import p040o.setLastBaselineToBottomHeight;

public class CustomTransferAndPayBiller extends LinearLayout {
    public FragmentBuilder_BindBillPaymentTabFragment IconCompatParcelizer;
    private Drawable MediaBrowserCompat$CustomActionResultReceiver;
    @BindView
    public RelativeLayout mBackButton;
    @BindView
    ImageView mBackButtonImage;
    @BindView
    TextView mDescription2TextView;
    @BindView
    TextView mDescription3TextView;
    @BindView
    public TextView mDescriptionTextView;
    @BindView
    ImageView mIconImageView;
    @BindView
    TextView mTitleTextView;
    private Context read;

    public CustomTransferAndPayBiller(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.read = context;
        this.MediaBrowserCompat$CustomActionResultReceiver = setLastBaselineToBottomHeight.write(context, R.drawable.biller_place_holder);
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.f85052131493732, this, true);
        setOrientation(0);
        ButterKnife.IconCompatParcelizer(this);
        this.mBackButton.setOnClickListener(new confirmRedeem(this));
    }

    public void setTitle(String str) {
        this.mTitleTextView.setText(str);
    }

    public void setDescription(String str) {
        this.mDescriptionTextView.setVisibility(0);
        this.mDescriptionTextView.setText(str);
    }

    public void setDescription2(String str) {
        this.mDescription2TextView.setVisibility(0);
        this.mDescription2TextView.setText(str);
    }

    public void setDescription3(String str) {
        this.mDescription3TextView.setVisibility(0);
        this.mDescription3TextView.setText(str);
    }

    public void setAvatar(String str) {
        Context context = this.read;
        FragmentBuilder_BindDepositSelectorFragment.MediaBrowserCompat$CustomActionResultReceiver(context, this.MediaBrowserCompat$CustomActionResultReceiver, this.mIconImageView, str, context.getResources().getDimensionPixelOffset(R.dimen.f72032131165280), setLastBaselineToBottomHeight.read(this.read, R.color.f66182131099773));
    }

    public void setAvatar(int i) {
        FragmentBuilder_BindDepositSelectorFragment.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$CustomActionResultReceiver, this.mIconImageView, i, this.read.getResources().getDimensionPixelOffset(R.dimen.f72032131165280));
    }

    public void setOnCustomTransferAndPayItemListener(FragmentBuilder_BindBillPaymentTabFragment fragmentBuilder_BindBillPaymentTabFragment) {
        this.IconCompatParcelizer = fragmentBuilder_BindBillPaymentTabFragment;
    }

    public void setEditButtonImage() {
        this.mBackButtonImage.setImageDrawable(setLastBaselineToBottomHeight.write(this.read, R.drawable.ic_gift_recipient_edit));
    }
}
