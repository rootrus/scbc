package com.scb.phone.view.custom.transferandpay;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.custom.ImageTextView;
import com.scb.phone.view.custom.common.DefaultButton;
import p040o.FragmentBuilder_BindDepositSelectorFragment;
import p040o.setLastBaselineToBottomHeight;

public class CustomTransferAndPayTarget extends CustomTransferAndPayInfo {
    @BindView
    DefaultButton mAddFavouriteButton;
    @BindView
    View mDividerSpace;
    @BindView
    View mDividerView;
    @BindView
    public ImageView mFavouriteIcon;
    @BindView
    public TextView mFavouriteName;
    @BindView
    TextView mReferenceNumberTextView;
    @BindView
    ImageTextView mTargetNameTextView;
    @BindView
    TextView mTargetTextView;
    @BindView
    TextView refNo1TextView;
    @BindView
    TextView refNo2TextView;
    @BindView
    TextView refNo3TextView;
    @BindView
    FrameLayout targetInfoLayout;

    public CustomTransferAndPayTarget(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.f85092131493736, this, true);
        ButterKnife.IconCompatParcelizer(this);
    }

    public void setAvatar(String str) {
        FragmentBuilder_BindDepositSelectorFragment.read(getContext(), (int) R.drawable.bankicon_place_holder, this.mTargetNameTextView, str, getResources().getDimensionPixelOffset(R.dimen.f74412131165877), setLastBaselineToBottomHeight.read(getContext(), R.color.f66402131099796));
    }

    public void setBillerAvatar(String str) {
        FragmentBuilder_BindDepositSelectorFragment.read(getContext(), (int) R.drawable.biller_place_holder, this.mTargetNameTextView, str, getResources().getDimensionPixelOffset(R.dimen.f74412131165877), setLastBaselineToBottomHeight.read(getContext(), R.color.f66402131099796));
    }

    public void setShopAvatar(String str) {
        FragmentBuilder_BindDepositSelectorFragment.read(getContext(), (int) R.drawable.shop_large, this.mTargetNameTextView, str, getResources().getDimensionPixelOffset(R.dimen.f74412131165877), setLastBaselineToBottomHeight.read(getContext(), R.color.f66402131099796));
    }

    public void setAvatar(String str, int i) {
        FragmentBuilder_BindDepositSelectorFragment.read(getContext(), i, this.mTargetNameTextView, str, getResources().getDimensionPixelOffset(R.dimen.f74412131165877), setLastBaselineToBottomHeight.read(getContext(), R.color.f66402131099796));
    }

    public void setText(String str) {
        this.mTargetTextView.setText(str);
    }

    public void setTargetName(String str) {
        this.mTargetNameTextView.setText(str);
    }

    public void setTargetNameGrayColor(Context context) {
        this.mTargetNameTextView.setTextColor(-6975079);
    }

    public void setReferenceNumbers(String str) {
        this.mReferenceNumberTextView.setText(str);
    }

    public void setReferenceNumbersVisible(boolean z) {
        this.mReferenceNumberTextView.setVisibility(z ? 0 : 8);
    }

    public void setFavoriteName(String str) {
        this.mFavouriteIcon.setVisibility(0);
        this.mFavouriteName.setVisibility(0);
        this.mFavouriteName.setText(str);
    }

    public void setAddFavoriteButtonVisible(boolean z) {
        this.mAddFavouriteButton.setVisibility(z ? 0 : 8);
    }

    public void setReferenceNo1(String str) {
        this.refNo1TextView.setText(str);
        this.refNo1TextView.setVisibility(0);
    }

    public void setReferenceNo2(String str) {
        this.refNo2TextView.setText(str);
        this.refNo2TextView.setVisibility(0);
    }

    public void setReferenceNo3(String str) {
        this.refNo3TextView.setText(str);
        this.refNo3TextView.setVisibility(0);
    }

    public void setDividerVisibility(boolean z) {
        this.mDividerView.setVisibility(z ? 0 : 8);
    }

    public void setFullDivider(boolean z) {
        this.mDividerSpace.setVisibility(z ? 8 : 0);
    }
}
