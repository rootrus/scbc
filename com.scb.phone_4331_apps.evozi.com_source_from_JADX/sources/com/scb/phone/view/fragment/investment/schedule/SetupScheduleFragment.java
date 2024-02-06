package com.scb.phone.view.fragment.investment.schedule;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.google.android.material.tabs.TabLayout;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.DefaultButton;
import com.scb.phone.view.fragment.BaseFragment;
import java.util.ArrayList;
import java.util.Map;
import p040o.ActivityBuilder_ContributeCcSofHybridActivity;
import p040o.ActivityBuilder_ContributeCcSofReviewTermsAndConditionsActivity;
import p040o.CrashlyticsCore;
import p040o.CreditCardService;
import p040o.HmlPinActivity;
import p040o.LocationCallback;
import p040o.getCapturedMessage;
import p040o.getImageWidth;
import p040o.getOutOfFocus;
import p040o.getRotateMessage;
import p040o.getTutorialDismissMessage;
import p040o.isProximityOn;
import p040o.setGuidanceFrameColor;

public class SetupScheduleFragment extends BaseFragment implements getImageWidth, getOutOfFocus {
    @BindView
    DefaultButton okButton;
    @HmlPinActivity
    public setGuidanceFrameColor presenter;
    @BindView
    TabLayout tabLayout;
    @BindView
    ViewPager tabPager;
    @BindView
    DefaultButton unscheduledButton;

    public static SetupScheduleFragment MediaBrowserCompat$ItemReceiver(CrashlyticsCore.C32494 r2) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("DISPLAY_KEY", r2);
        SetupScheduleFragment setupScheduleFragment = new SetupScheduleFragment();
        setupScheduleFragment.setArguments(bundle);
        return setupScheduleFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.f89892131494216, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        CrashlyticsCore.C32494 r6 = (CrashlyticsCore.C32494) getArguments().getParcelable("DISPLAY_KEY");
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        setGuidanceFrameColor setguidanceframecolor = this.presenter;
        setguidanceframecolor.write = r6;
        Map<String, Boolean> map = setguidanceframecolor.read;
        Boolean bool = Boolean.FALSE;
        map.put("O", bool);
        setguidanceframecolor.read.put("W", bool);
        setguidanceframecolor.read.put("M", bool);
        getTutorialDismissMessage gettutorialdismissmessage = new getTutorialDismissMessage(r6);
        if (setguidanceframecolor.RatingCompat != null) {
            z = true;
        }
        if (z) {
            gettutorialdismissmessage.IconCompatParcelizer(setguidanceframecolor.RatingCompat);
        }
        return inflate;
    }

    public final void MediaBrowserCompat$ItemReceiver(boolean z) {
        this.tabPager.setOffscreenPageLimit(z ? 3 : 1);
        this.tabLayout.setVisibility(z ? 0 : 8);
    }

    public final void write() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(getString(R.string.schedule_type_once));
        arrayList.add(getString(R.string.schedule_type_weekly));
        arrayList.add(getString(R.string.schedule_type_monthly));
        boolean z = true;
        this.tabPager.setAdapter(new CreditCardService(getChildFragmentManager(), arrayList, !this.presenter.write.MediaBrowserCompat$ItemReceiver.equals(LocationCallback.PURCHASE)));
        this.tabLayout.setupWithViewPager(this.tabPager);
        this.okButton.setButtonEnabled(false);
        this.tabPager.addOnPageChangeListener(new ViewPager.MediaMetadataCompat() {
            public final void onPageScrollStateChanged(int i) {
            }

            public final void onPageScrolled(int i, float f, int i2) {
            }

            public final void onPageSelected(int i) {
                boolean z = false;
                if (i == 0) {
                    setGuidanceFrameColor setguidanceframecolor = SetupScheduleFragment.this.presenter;
                    setguidanceframecolor.IconCompatParcelizer = "O";
                    getRotateMessage getrotatemessage = new getRotateMessage(setguidanceframecolor, "O");
                    if (setguidanceframecolor.RatingCompat != null) {
                        z = true;
                    }
                    if (z) {
                        getrotatemessage.IconCompatParcelizer(setguidanceframecolor.RatingCompat);
                    }
                } else if (i == 1) {
                    setGuidanceFrameColor setguidanceframecolor2 = SetupScheduleFragment.this.presenter;
                    setguidanceframecolor2.IconCompatParcelizer = "W";
                    getRotateMessage getrotatemessage2 = new getRotateMessage(setguidanceframecolor2, "W");
                    if (setguidanceframecolor2.RatingCompat != null) {
                        z = true;
                    }
                    if (z) {
                        getrotatemessage2.IconCompatParcelizer(setguidanceframecolor2.RatingCompat);
                    }
                } else if (i == 2) {
                    setGuidanceFrameColor setguidanceframecolor3 = SetupScheduleFragment.this.presenter;
                    setguidanceframecolor3.IconCompatParcelizer = "M";
                    getRotateMessage getrotatemessage3 = new getRotateMessage(setguidanceframecolor3, "M");
                    if (setguidanceframecolor3.RatingCompat != null) {
                        z = true;
                    }
                    if (z) {
                        getrotatemessage3.IconCompatParcelizer(setguidanceframecolor3.RatingCompat);
                    }
                }
            }
        });
        setGuidanceFrameColor setguidanceframecolor = this.presenter;
        setguidanceframecolor.IconCompatParcelizer = "O";
        getRotateMessage getrotatemessage = new getRotateMessage(setguidanceframecolor, "O");
        if (setguidanceframecolor.RatingCompat == null) {
            z = false;
        }
        if (z) {
            getrotatemessage.IconCompatParcelizer(setguidanceframecolor.RatingCompat);
        }
        this.okButton.setOnClickListener(new ActivityBuilder_ContributeCcSofHybridActivity(this));
        this.unscheduledButton.setOnClickListener(new ActivityBuilder_ContributeCcSofReviewTermsAndConditionsActivity(this));
    }

    public final void write(String str, boolean z) {
        setGuidanceFrameColor setguidanceframecolor = this.presenter;
        setguidanceframecolor.read.put(str, Boolean.valueOf(z));
        getCapturedMessage getcapturedmessage = new getCapturedMessage(setguidanceframecolor);
        if (setguidanceframecolor.RatingCompat != null) {
            getcapturedmessage.IconCompatParcelizer(setguidanceframecolor.RatingCompat);
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
        this.okButton.setButtonEnabled(z);
    }

    public final CrashlyticsCore.C32494 IconCompatParcelizer() {
        return this.presenter.write;
    }

    public final void read(String str, isProximityOn isproximityon) {
        this.presenter.MediaBrowserCompat$ItemReceiver.put(str, isproximityon);
    }

    public void onDestroy() {
        super.onDestroy();
        this.presenter.onDestroy();
    }
}
