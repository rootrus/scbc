package com.scb.phone.view.fragment.transferandpay.billpaymenttab;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.google.android.material.tabs.TabLayout;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.custom.common.FragmentWrapContentViewPager;
import com.scb.phone.view.fragment.BaseFragment;
import p040o.C4054b;
import p040o.C7085x54efaba5;
import p040o.C7516ta;
import p040o.C7522tj;
import p040o.C7527tr;
import p040o.CrashlyticsReport;
import p040o.HmlPinActivity;
import p040o.ServerProjectProvider;
import p040o.ServerProjectProvider$5$MediaBrowserCompat$MediaItem;
import p040o.ZSYR2K;
import p040o.getEasycashLoansList;
import p040o.getTopLeftCornerWidth;

public class SecondaryTabsFragment extends BaseFragment implements getTopLeftCornerWidth.AppCompatViewInflater, ServerProjectProvider.C70695.MediaMetadataCompat, ServerProjectProvider.C70695.IconCompatParcelizer, ServerProjectProvider.C70695.read, C7085x54efaba5 {
    private C7085x54efaba5 IconCompatParcelizer;
    private ServerProjectProvider.C70695.IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver;
    private ServerProjectProvider.C70695.read MediaBrowserCompat$SearchResultReceiver;
    private ServerProjectProvider.C70695.MediaMetadataCompat RatingCompat;
    @BindView
    TabLayout mTabLayout;
    @BindView
    FragmentWrapContentViewPager mTabPager;
    @HmlPinActivity
    public C4054b.C40583 secondaryTabsPresenter;

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.f90182131494245, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.secondaryTabsPresenter.MediaBrowserCompat$ItemReceiver(this);
        C4054b.C40583 r5 = this.secondaryTabsPresenter;
        if (r5.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver.write() != null) {
            C7527tr trVar = C7527tr.MediaBrowserCompat$CustomActionResultReceiver;
            if (r5.RatingCompat != null) {
                z = true;
            }
            if (z) {
                trVar.IconCompatParcelizer(r5.RatingCompat);
            }
        } else if (r5.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver.MediaDescriptionCompat() != null) {
            C7516ta taVar = C7516ta.write;
            if (r5.RatingCompat != null) {
                z = true;
            }
            if (z) {
                taVar.IconCompatParcelizer(r5.RatingCompat);
            }
        } else {
            C7522tj tjVar = C7522tj.write;
            if (r5.RatingCompat != null) {
                z = true;
            }
            if (z) {
                tjVar.IconCompatParcelizer(r5.RatingCompat);
            }
        }
        return inflate;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        MediaBrowserCompat$ItemReceiver(0);
        this.mTabLayout.setVisibility(8);
    }

    public final void IconCompatParcelizer() {
        MediaBrowserCompat$ItemReceiver(1);
        this.mTabLayout.setVisibility(8);
    }

    public final void MediaBrowserCompat$ItemReceiver(int i) {
        this.mTabPager.setAdapter(new getEasycashLoansList(getChildFragmentManager(), getContext()));
        this.mTabLayout.setupWithViewPager(this.mTabPager);
        this.mTabPager.setCurrentItem(i, false);
        this.mTabPager.addOnPageChangeListener(new ViewPager.MediaMetadataCompat() {
            public final void onPageScrollStateChanged(int i) {
            }

            public final void onPageScrolled(int i, float f, int i2) {
            }

            public final void onPageSelected(int i) {
                if (i == 2) {
                    SecondaryTabsFragment secondaryTabsFragment = SecondaryTabsFragment.this;
                    ZSYR2K[] zsyr2kArr = {new ZSYR2K("tab_name", "History")};
                    if (secondaryTabsFragment.getActivity() != null) {
                        ((BaseActivity) secondaryTabsFragment.getActivity()).scbAnalytics.write("billpayment_tab", zsyr2kArr);
                    }
                }
            }
        });
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null && (parentFragment instanceof ServerProjectProvider.C70695.MediaMetadataCompat)) {
            this.RatingCompat = (ServerProjectProvider.C70695.MediaMetadataCompat) parentFragment;
        }
        if (parentFragment != null && (parentFragment instanceof ServerProjectProvider.C70695.IconCompatParcelizer)) {
            this.MediaBrowserCompat$CustomActionResultReceiver = (ServerProjectProvider.C70695.IconCompatParcelizer) parentFragment;
        }
        if (parentFragment != null && (parentFragment instanceof ServerProjectProvider.C70695.read)) {
            this.MediaBrowserCompat$SearchResultReceiver = (ServerProjectProvider.C70695.read) parentFragment;
        }
        if (parentFragment != null && (parentFragment instanceof C7085x54efaba5)) {
            this.IconCompatParcelizer = (C7085x54efaba5) parentFragment;
        }
    }

    public final void IconCompatParcelizer(CrashlyticsReport.Session.Event.Application.Execution execution) {
        ServerProjectProvider.C70695.MediaMetadataCompat mediaMetadataCompat = this.RatingCompat;
        if (mediaMetadataCompat != null) {
            mediaMetadataCompat.IconCompatParcelizer(execution);
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(CrashlyticsReport.Session.Event.Application.Execution execution) {
        ServerProjectProvider.C70695.IconCompatParcelizer iconCompatParcelizer = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (iconCompatParcelizer != null) {
            iconCompatParcelizer.MediaBrowserCompat$ItemReceiver(execution);
        }
    }

    public final ServerProjectProvider$5$MediaBrowserCompat$MediaItem write() {
        C7085x54efaba5 serverProjectProvider$5$MediaBrowserCompat$CustomActionResultReceiver = this.IconCompatParcelizer;
        if (serverProjectProvider$5$MediaBrowserCompat$CustomActionResultReceiver != null) {
            return serverProjectProvider$5$MediaBrowserCompat$CustomActionResultReceiver.write();
        }
        return null;
    }

    public final void MediaMetadataCompat() {
        C7085x54efaba5 serverProjectProvider$5$MediaBrowserCompat$CustomActionResultReceiver = this.IconCompatParcelizer;
        if (serverProjectProvider$5$MediaBrowserCompat$CustomActionResultReceiver != null) {
            serverProjectProvider$5$MediaBrowserCompat$CustomActionResultReceiver.MediaMetadataCompat();
        }
    }

    public final void read(int i) {
        C7085x54efaba5 serverProjectProvider$5$MediaBrowserCompat$CustomActionResultReceiver = this.IconCompatParcelizer;
        if (serverProjectProvider$5$MediaBrowserCompat$CustomActionResultReceiver != null) {
            serverProjectProvider$5$MediaBrowserCompat$CustomActionResultReceiver.read(i);
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder builder) {
        ServerProjectProvider.C70695.read read = this.MediaBrowserCompat$SearchResultReceiver;
        if (read != null) {
            read.MediaBrowserCompat$ItemReceiver(builder);
        }
    }
}
