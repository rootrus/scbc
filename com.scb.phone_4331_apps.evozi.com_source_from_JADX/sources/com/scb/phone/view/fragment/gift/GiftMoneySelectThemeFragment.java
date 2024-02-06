package com.scb.phone.view.fragment.gift;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager.widget.ViewPager$MediaBrowserCompat$MediaItem;
import butterknife.BindView;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.scb.phone.R;
import com.scb.phone.view.adapter.gift.GiftMoneySelectThemeAdapter;
import com.scb.phone.view.fragment.BaseFragment;
import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.asn1.x509.DisplayText;
import p040o.AutoValue_CrashlyticsReport_Session_OperatingSystem;
import p040o.onGetStartedClick;
import p059me.relex.circleindicator.CircleIndicator;

public final class GiftMoneySelectThemeFragment extends BaseFragment {
    public static final GiftMoneySelectThemeFragment$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$CustomActionResultReceiver = new GiftMoneySelectThemeFragment$MediaBrowserCompat$ItemReceiver((byte) 0);
    public AutoValue_CrashlyticsReport_Session_OperatingSystem.C30991 IconCompatParcelizer;
    private List<? extends AutoValue_CrashlyticsReport_Session_OperatingSystem.C30991> MediaBrowserCompat$MediaItem;
    private GiftMoneySelectThemeAdapter RatingCompat;
    @BindView
    public CircleIndicator mCircleIndicator;
    @BindView
    public ViewPager mViewPager;

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    public static final /* synthetic */ List write(GiftMoneySelectThemeFragment giftMoneySelectThemeFragment) {
        List<? extends AutoValue_CrashlyticsReport_Session_OperatingSystem.C30991> list = giftMoneySelectThemeFragment.MediaBrowserCompat$MediaItem;
        if (list == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("giftMoneyDisplayList");
        }
        return list;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        onGetStartedClick.write((Object) layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.f87672131493994, viewGroup, false);
        MediaBrowserCompat$CustomActionResultReceiver(this, inflate);
        return inflate;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        this.RatingCompat = new GiftMoneySelectThemeAdapter(getContext());
        Bundle arguments = getArguments();
        if (arguments != null) {
            ArrayList parcelableArrayList = arguments.getParcelableArrayList("EXTRA_GIFT_MONEY_LIST");
            if (!(parcelableArrayList instanceof List)) {
                parcelableArrayList = null;
            }
            List<? extends AutoValue_CrashlyticsReport_Session_OperatingSystem.C30991> list = parcelableArrayList;
            if (list != null) {
                this.MediaBrowserCompat$MediaItem = list;
                if (list == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("giftMoneyDisplayList");
                }
                this.IconCompatParcelizer = (AutoValue_CrashlyticsReport_Session_OperatingSystem.C30991) list.get(0);
                GiftMoneySelectThemeAdapter giftMoneySelectThemeAdapter = this.RatingCompat;
                if (giftMoneySelectThemeAdapter == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("mViewPagerAdapter");
                }
                onGetStartedClick.write((Object) list, "items");
                giftMoneySelectThemeAdapter.IconCompatParcelizer.clear();
                giftMoneySelectThemeAdapter.IconCompatParcelizer.addAll(list);
                giftMoneySelectThemeAdapter.notifyDataSetChanged();
                if (list.size() > 10) {
                    CircleIndicator circleIndicator = this.mCircleIndicator;
                    if (circleIndicator == null) {
                        onGetStartedClick.MediaBrowserCompat$ItemReceiver("mCircleIndicator");
                    }
                    circleIndicator.setVisibility(8);
                } else {
                    CircleIndicator circleIndicator2 = this.mCircleIndicator;
                    if (circleIndicator2 == null) {
                        onGetStartedClick.MediaBrowserCompat$ItemReceiver("mCircleIndicator");
                    }
                    circleIndicator2.setVisibility(0);
                }
            }
        }
        ViewPager viewPager = this.mViewPager;
        if (viewPager == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mViewPager");
        }
        GiftMoneySelectThemeAdapter giftMoneySelectThemeAdapter2 = this.RatingCompat;
        if (giftMoneySelectThemeAdapter2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mViewPagerAdapter");
        }
        viewPager.setAdapter(giftMoneySelectThemeAdapter2);
        viewPager.setPadding(DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE, 0, DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE, 0);
        viewPager.setClipToPadding(false);
        viewPager.setClipChildren(false);
        viewPager.setOffscreenPageLimit(3);
        CircleIndicator circleIndicator3 = this.mCircleIndicator;
        if (circleIndicator3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mCircleIndicator");
        }
        circleIndicator3.setViewPager(viewPager);
        viewPager.addOnPageChangeListener(new read(this));
    }

    public static final class read extends ViewPager$MediaBrowserCompat$MediaItem {
        private /* synthetic */ GiftMoneySelectThemeFragment MediaBrowserCompat$ItemReceiver;

        read(GiftMoneySelectThemeFragment giftMoneySelectThemeFragment) {
            this.MediaBrowserCompat$ItemReceiver = giftMoneySelectThemeFragment;
        }

        public final void onPageSelected(int i) {
            GiftMoneySelectThemeFragment giftMoneySelectThemeFragment = this.MediaBrowserCompat$ItemReceiver;
            giftMoneySelectThemeFragment.IconCompatParcelizer = (AutoValue_CrashlyticsReport_Session_OperatingSystem.C30991) GiftMoneySelectThemeFragment.write(giftMoneySelectThemeFragment).get(i);
        }
    }
}
