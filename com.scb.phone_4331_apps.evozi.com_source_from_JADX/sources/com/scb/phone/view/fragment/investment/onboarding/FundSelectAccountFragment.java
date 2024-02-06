package com.scb.phone.view.fragment.investment.onboarding;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.viewpager.widget.ViewPager;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.adapter.investment.onboarding.FundAccountPagerAdapter;
import com.scb.phone.view.fragment.BaseFragment;
import java.util.List;
import p040o.CustomConcurrentHashMap;
import p040o.FragmentBuilder_BindCalendarDialogFragment;
import p040o.HmlPinActivity;
import p040o.IdManager;
import p040o.injectRttiCheckDeserializer;
import p040o.takePictureForCaptureExperience;
import p040o.takePictureForCaptureExperience$MediaBrowserCompat$ItemReceiver;
import p059me.relex.circleindicator.CircleIndicator;

public class FundSelectAccountFragment extends BaseFragment implements injectRttiCheckDeserializer.MediaDescriptionCompat, FundAccountPagerAdapter.read {
    private FundAccountPagerAdapter IconCompatParcelizer;
    private FragmentBuilder_BindCalendarDialogFragment MediaBrowserCompat$CustomActionResultReceiver;
    @BindView
    Button buttonNext;
    @HmlPinActivity
    public takePictureForCaptureExperience fundSelectAccountPresenter;
    @BindView
    CircleIndicator mCircleIndicator;
    @BindView
    ViewPager mViewPager;

    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof FragmentBuilder_BindCalendarDialogFragment) {
            this.MediaBrowserCompat$CustomActionResultReceiver = (FragmentBuilder_BindCalendarDialogFragment) context;
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f88452131494072, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.fundSelectAccountPresenter.MediaBrowserCompat$ItemReceiver(this);
        takePictureForCaptureExperience takepictureforcaptureexperience = this.fundSelectAccountPresenter;
        if (takepictureforcaptureexperience.RatingCompat != null) {
            takepictureforcaptureexperience.RatingCompat.AlertController$RecycleListView();
        }
        takepictureforcaptureexperience.read.write();
        takepictureforcaptureexperience.read.IconCompatParcelizer(new takePictureForCaptureExperience$MediaBrowserCompat$ItemReceiver(takepictureforcaptureexperience));
        this.buttonNext.setEnabled(false);
        if (getActivity() != null) {
            ((BaseActivity) getActivity()).mo13676d_("mfonboard_selectaccount");
        }
        return inflate;
    }

    public final void write(List<IdManager> list) {
        FundAccountPagerAdapter fundAccountPagerAdapter = new FundAccountPagerAdapter(getActivity(), list, this);
        this.IconCompatParcelizer = fundAccountPagerAdapter;
        this.mViewPager.setAdapter(fundAccountPagerAdapter);
        this.mViewPager.setClipToPadding(false);
        this.mViewPager.setPadding(getResources().getDimensionPixelOffset(R.dimen.f75542131166023), 0, getResources().getDimensionPixelOffset(R.dimen.f75542131166023), 0);
        this.mCircleIndicator.setViewPager(this.mViewPager);
        if (list.size() >= 10) {
            this.mCircleIndicator.setVisibility(8);
        } else {
            this.mCircleIndicator.setVisibility(0);
        }
    }

    public final void IconCompatParcelizer() {
        FragmentBuilder_BindCalendarDialogFragment fragmentBuilder_BindCalendarDialogFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (fragmentBuilder_BindCalendarDialogFragment != null) {
            fragmentBuilder_BindCalendarDialogFragment.setOverlayMode();
        }
    }

    @OnClick
    public void onNextButtonClick() {
        IdManager idManager;
        takePictureForCaptureExperience takepictureforcaptureexperience = this.fundSelectAccountPresenter;
        int i = this.IconCompatParcelizer.write;
        List<IdManager> list = takepictureforcaptureexperience.IconCompatParcelizer;
        if (list != null && !list.isEmpty() && (idManager = takepictureforcaptureexperience.IconCompatParcelizer.get(i)) != null) {
            if (takepictureforcaptureexperience.RatingCompat != null) {
                takepictureforcaptureexperience.RatingCompat.AlertController$RecycleListView();
            }
            CustomConcurrentHashMap.WriteThroughEntry writeThroughEntry = new CustomConcurrentHashMap.WriteThroughEntry();
            writeThroughEntry.read = idManager.MediaBrowserCompat$ItemReceiver;
            takepictureforcaptureexperience.read.MediaBrowserCompat$CustomActionResultReceiver(writeThroughEntry);
            takepictureforcaptureexperience.read.IconCompatParcelizer(new takePictureForCaptureExperience.write());
        }
    }

    public final void write(int i) {
        this.buttonNext.setEnabled(true);
    }
}
