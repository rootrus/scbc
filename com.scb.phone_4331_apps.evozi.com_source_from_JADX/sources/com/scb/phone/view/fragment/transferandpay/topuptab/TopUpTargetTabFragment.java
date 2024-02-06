package com.scb.phone.view.fragment.transferandpay.topuptab;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.google.android.material.tabs.TabLayout;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.custom.common.FragmentWrapContentViewPager;
import com.scb.phone.view.fragment.BaseFragment;
import org.threeten.p041bp.OffsetDateTime;
import p040o.QuickAccountSelectAdapter$SelectedHolder_ViewBinding;
import p040o.ZSYR2K;
import p040o.getMortgageTopupOffers;
import p040o.inject_base64Decoder;
import p040o.onGetStartedClick;
import p040o.setTitleMarginStart;

public final class TopUpTargetTabFragment extends BaseFragment {
    public getMortgageTopupOffers MediaBrowserCompat$CustomActionResultReceiver;
    @BindView
    public TabLayout mTabLayout;
    @BindView
    public FragmentWrapContentViewPager mTabPager;

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        onGetStartedClick.write((Object) layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.f90182131494245, viewGroup, false);
        this.read = ButterKnife.IconCompatParcelizer(this, inflate);
        if (getArguments() != null) {
            setTitleMarginStart childFragmentManager = getChildFragmentManager();
            onGetStartedClick.IconCompatParcelizer((Object) childFragmentManager, "childFragmentManager");
            this.MediaBrowserCompat$CustomActionResultReceiver = new getMortgageTopupOffers(childFragmentManager, getContext());
            FragmentWrapContentViewPager fragmentWrapContentViewPager = this.mTabPager;
            if (fragmentWrapContentViewPager == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("mTabPager");
            }
            fragmentWrapContentViewPager.setAdapter(this.MediaBrowserCompat$CustomActionResultReceiver);
            FragmentWrapContentViewPager fragmentWrapContentViewPager2 = this.mTabPager;
            if (fragmentWrapContentViewPager2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("mTabPager");
            }
            fragmentWrapContentViewPager2.setOffscreenPageLimit(2);
            TabLayout tabLayout = this.mTabLayout;
            if (tabLayout == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("mTabLayout");
            }
            FragmentWrapContentViewPager fragmentWrapContentViewPager3 = this.mTabPager;
            if (fragmentWrapContentViewPager3 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("mTabPager");
            }
            tabLayout.setupWithViewPager(fragmentWrapContentViewPager3);
            FragmentWrapContentViewPager fragmentWrapContentViewPager4 = this.mTabPager;
            if (fragmentWrapContentViewPager4 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("mTabPager");
            }
            fragmentWrapContentViewPager4.setCurrentItem(0);
            FragmentWrapContentViewPager fragmentWrapContentViewPager5 = this.mTabPager;
            if (fragmentWrapContentViewPager5 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("mTabPager");
            }
            fragmentWrapContentViewPager5.addOnPageChangeListener(new IconCompatParcelizer(this));
        }
        return inflate;
    }

    public static final class IconCompatParcelizer implements ViewPager.MediaMetadataCompat {
        private /* synthetic */ TopUpTargetTabFragment write;

        public final void onPageScrollStateChanged(int i) {
        }

        public final void onPageScrolled(int i, float f, int i2) {
        }

        IconCompatParcelizer(TopUpTargetTabFragment topUpTargetTabFragment) {
            this.write = topUpTargetTabFragment;
        }

        public final void onPageSelected(int i) {
            if (i == 1) {
                TopUpTargetTabFragment topUpTargetTabFragment = this.write;
                ZSYR2K[] zsyr2kArr = {new ZSYR2K("tab_name", "History")};
                if (topUpTargetTabFragment.getActivity() != null) {
                    ((BaseActivity) topUpTargetTabFragment.getActivity()).scbAnalytics.write("topup_tab", zsyr2kArr);
                }
            }
        }
    }

    public static final class read implements inject_base64Decoder {
        private final String IconCompatParcelizer;
        private final OffsetDateTime MediaBrowserCompat$CustomActionResultReceiver;
        private final String MediaBrowserCompat$ItemReceiver;
        private final String write;

        private read() {
        }

        public read(String str, String str2, String str3, OffsetDateTime offsetDateTime) {
            onGetStartedClick.write((Object) offsetDateTime, "stampDateTime");
            this.IconCompatParcelizer = str;
            this.MediaBrowserCompat$ItemReceiver = str2;
            this.write = str3;
            this.MediaBrowserCompat$CustomActionResultReceiver = offsetDateTime;
        }

        public boolean IconCompatParcelizer() {
            QuickAccountSelectAdapter$SelectedHolder_ViewBinding between = QuickAccountSelectAdapter$SelectedHolder_ViewBinding.between(this.MediaBrowserCompat$CustomActionResultReceiver, OffsetDateTime.now());
            onGetStartedClick.IconCompatParcelizer((Object) between, "Duration.between(stampDa…me, OffsetDateTime.now())");
            return between.getSeconds() <= 86400;
        }

        public String write() {
            String str = this.IconCompatParcelizer;
            return str == null ? "" : str;
        }

        public String MediaBrowserCompat$ItemReceiver() {
            StringBuilder sb = new StringBuilder();
            sb.append("name=");
            String str = this.IconCompatParcelizer;
            String str2 = "";
            if (str == null) {
                str = str2;
            }
            sb.append(str);
            sb.append(",type=");
            String str3 = this.MediaBrowserCompat$ItemReceiver;
            if (str3 == null) {
                str3 = str2;
            }
            sb.append(str3);
            sb.append(",id=");
            String str4 = this.write;
            if (str4 != null) {
                str2 = str4;
            }
            sb.append(str2);
            return sb.toString();
        }
    }

    public static final TopUpTargetTabFragment read(String str) {
        Bundle bundle = new Bundle();
        if (str != null) {
            bundle.putString("account_extra", str);
        }
        TopUpTargetTabFragment topUpTargetTabFragment = new TopUpTargetTabFragment();
        topUpTargetTabFragment.setArguments(bundle);
        return topUpTargetTabFragment;
    }
}
