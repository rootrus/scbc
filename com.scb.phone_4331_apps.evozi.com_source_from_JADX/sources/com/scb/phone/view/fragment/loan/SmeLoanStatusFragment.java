package com.scb.phone.view.fragment.loan;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.CustomHorizontalProgressBar;
import com.scb.phone.view.fragment.BaseFragment;
import p040o.AppStatistics;
import p040o.HmlPinActivity;
import p040o.getPercentBlackPixels;
import p040o.setLastBaselineToBottomHeight;

public class SmeLoanStatusFragment extends BaseFragment implements getPercentBlackPixels.IconCompatParcelizer {
    @BindView
    public CustomHorizontalProgressBar mCustomProgressBarSmeLoanStatus;
    @HmlPinActivity
    public AppStatistics.C3025c mPresenter;

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f89962131494223, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.mPresenter.MediaBrowserCompat$ItemReceiver(this);
        return inflate;
    }

    public final void write(String str) {
        this.mCustomProgressBarSmeLoanStatus.setUsedTitle(str);
    }

    public final void IconCompatParcelizer(String str) {
        this.mCustomProgressBarSmeLoanStatus.setUsedValue(str);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(int i) {
        Context context = getContext();
        if (context != null) {
            this.mCustomProgressBarSmeLoanStatus.setUsedValueColor(setLastBaselineToBottomHeight.read(context, i));
        }
    }

    public final void RatingCompat(String str) {
        this.mCustomProgressBarSmeLoanStatus.setAvailableTitle(str);
    }

    public final void MediaBrowserCompat$MediaItem(String str) {
        this.mCustomProgressBarSmeLoanStatus.setAvailableValue(str);
    }

    public final void read(String str) {
        this.mCustomProgressBarSmeLoanStatus.setTotalValueAllCaps(false);
        this.mCustomProgressBarSmeLoanStatus.setTotalTitle("");
        this.mCustomProgressBarSmeLoanStatus.setTotalValue(str);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        this.mCustomProgressBarSmeLoanStatus.mTotalContainerLinearLayout.setVisibility(0);
    }

    public final void write() {
        this.mCustomProgressBarSmeLoanStatus.mTotalContainerLinearLayout.setVisibility(8);
    }

    public final void read(int i) {
        this.mCustomProgressBarSmeLoanStatus.setProgressBar(i);
    }

    public final void MediaBrowserCompat$ItemReceiver(int i) {
        this.mCustomProgressBarSmeLoanStatus.setSecondaryProgressBar(i);
    }
}
