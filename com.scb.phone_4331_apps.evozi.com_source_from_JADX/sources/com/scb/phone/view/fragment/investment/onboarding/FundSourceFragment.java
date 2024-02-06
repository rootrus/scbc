package com.scb.phone.view.fragment.investment.onboarding;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.investment.onboarding.FundAppFormActivity;
import com.scb.phone.view.adapter.investment.onboarding.FundAccountPagerAdapter;
import com.scb.phone.view.fragment.BaseFragment;
import p040o.CustomConcurrentHashMap;
import p040o.FragmentBuilder_BindCalendarDialogFragment;
import p040o.HmlPinActivity;
import p040o.ImageCaptureView;
import p040o.getCrashlyticsInstallId;
import p040o.injectRttiCheckDeserializer$MediaBrowserCompat$ItemReceiver;
import p040o.isGpsUsable;

public class FundSourceFragment extends BaseFragment implements injectRttiCheckDeserializer$MediaBrowserCompat$ItemReceiver, FundAccountPagerAdapter.read {
    private FragmentBuilder_BindCalendarDialogFragment IconCompatParcelizer;
    @BindView
    Button buttonNext;
    @HmlPinActivity
    public ImageCaptureView.C3469a sourceOfFundPresenter;
    @BindView
    TextView textSource;

    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof FragmentBuilder_BindCalendarDialogFragment) {
            this.IconCompatParcelizer = (FragmentBuilder_BindCalendarDialogFragment) context;
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f88462131494073, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.sourceOfFundPresenter.MediaBrowserCompat$ItemReceiver(this);
        this.buttonNext.setEnabled(false);
        if (getActivity() != null) {
            ((BaseActivity) getActivity()).mo13676d_("mfonboard_sourceoffund");
        }
        return inflate;
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        FragmentBuilder_BindCalendarDialogFragment fragmentBuilder_BindCalendarDialogFragment = this.IconCompatParcelizer;
        if (fragmentBuilder_BindCalendarDialogFragment != null) {
            fragmentBuilder_BindCalendarDialogFragment.setOverlayMode();
        }
    }

    @OnClick
    public void onLayoutSourceClick() {
        FundSourceListFragment fundSourceListFragment = new FundSourceListFragment();
        fundSourceListFragment.setTargetFragment(this, 1);
        ((FundAppFormActivity) getActivity()).read(fundSourceListFragment);
        ((FundAppFormActivity) getActivity()).progressStateBar.setVisibility(8);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 1) {
            super.onActivityResult(i, i2, intent);
        } else if (intent != null) {
            getCrashlyticsInstallId getcrashlyticsinstallid = (getCrashlyticsInstallId) intent.getParcelableExtra("EXTRA_FUND_SOURCE");
            this.sourceOfFundPresenter.MediaBrowserCompat$ItemReceiver = getcrashlyticsinstallid;
            ((FundAppFormActivity) getActivity()).progressStateBar.setVisibility(0);
            this.textSource.setText(getcrashlyticsinstallid.MediaBrowserCompat$CustomActionResultReceiver);
            this.buttonNext.setEnabled(true);
        }
    }

    @OnClick
    public void onNextButtonClick() {
        ImageCaptureView.C3469a aVar = this.sourceOfFundPresenter;
        CustomConcurrentHashMap.WriteThroughEntry writeThroughEntry = new CustomConcurrentHashMap.WriteThroughEntry();
        writeThroughEntry.IconCompatParcelizer = new isGpsUsable(aVar.MediaBrowserCompat$ItemReceiver.read, aVar.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver);
        if (aVar.RatingCompat != null) {
            aVar.RatingCompat.AlertController$RecycleListView();
        }
        aVar.read.read(writeThroughEntry);
        aVar.read.IconCompatParcelizer(new ImageCaptureView.C3469a.IconCompatParcelizer());
    }

    public final void write(int i) {
        this.buttonNext.setEnabled(true);
    }
}
