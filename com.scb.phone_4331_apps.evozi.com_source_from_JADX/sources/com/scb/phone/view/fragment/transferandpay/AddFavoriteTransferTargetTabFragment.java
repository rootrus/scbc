package com.scb.phone.view.fragment.transferandpay;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.material.tabs.TabLayout;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.FragmentWrapContentViewPager;
import com.scb.phone.view.fragment.BaseFragment;
import p040o.C5101x8d7b658a;
import p040o.HmlPinActivity;
import p040o.IGoogleMapDelegate;
import p040o.access$2300;
import p040o.getEasycashLoanTypesList;
import p040o.getTopLeftCornerWidth;
import p040o.onGetStartedClick;
import p040o.onInfoWindowLongClick;
import p040o.onRetakeButtonClick;
import p040o.setTitleMarginStart;
import p040o.writeUInt64NoTag;

public final class AddFavoriteTransferTargetTabFragment extends BaseFragment implements getTopLeftCornerWidth.IconCompatParcelizer {
    public static final IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver = new IconCompatParcelizer((byte) 0);
    getEasycashLoanTypesList IconCompatParcelizer;
    @BindView
    public TabLayout mTabLayout;
    @BindView
    public FragmentWrapContentViewPager mTabPager;
    @HmlPinActivity
    public onRetakeButtonClick presenter;

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    public static final class IconCompatParcelizer {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        onGetStartedClick.write((Object) layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.f90182131494245, viewGroup, false);
        this.read = ButterKnife.IconCompatParcelizer(this, inflate);
        return inflate;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        onRetakeButtonClick onretakebuttonclick = this.presenter;
        if (onretakebuttonclick == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        onretakebuttonclick.MediaBrowserCompat$ItemReceiver(this);
        onRetakeButtonClick onretakebuttonclick2 = this.presenter;
        if (onretakebuttonclick2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        onretakebuttonclick2.read = onretakebuttonclick2.IconCompatParcelizer.read.write();
        onRetakeButtonClick onretakebuttonclick3 = this.presenter;
        if (onretakebuttonclick3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        onInfoWindowLongClick oninfowindowlongclick = onretakebuttonclick3.read;
        if (oninfowindowlongclick != null) {
            str = oninfowindowlongclick.ActionMenuItemView;
            onGetStartedClick.IconCompatParcelizer((Object) str, "it.getSubFunction()");
        } else {
            str = "";
        }
        boolean z = true;
        if (onretakebuttonclick3.read == null || onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) IGoogleMapDelegate.OWN.name(), (Object) str)) {
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = new onRetakeButtonClick.IconCompatParcelizer(0);
            if (onretakebuttonclick3.RatingCompat == null) {
                z = false;
            }
            if (z) {
                iconCompatParcelizer.IconCompatParcelizer(onretakebuttonclick3.RatingCompat);
            }
        } else if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) IGoogleMapDelegate.SCB.name(), (Object) str) || onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) IGoogleMapDelegate.OTHER.name(), (Object) str)) {
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer2 = new onRetakeButtonClick.IconCompatParcelizer(1);
            if (onretakebuttonclick3.RatingCompat == null) {
                z = false;
            }
            if (z) {
                iconCompatParcelizer2.IconCompatParcelizer(onretakebuttonclick3.RatingCompat);
            }
        } else if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) IGoogleMapDelegate.PROMPTPAY.name(), (Object) str)) {
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer3 = new onRetakeButtonClick.IconCompatParcelizer(2);
            if (onretakebuttonclick3.RatingCompat == null) {
                z = false;
            }
            if (z) {
                iconCompatParcelizer3.IconCompatParcelizer(onretakebuttonclick3.RatingCompat);
            }
        } else {
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer4 = C5101x8d7b658a.MediaBrowserCompat$ItemReceiver;
            if (onretakebuttonclick3.RatingCompat == null) {
                z = false;
            }
            if (z) {
                iconCompatParcelizer4.IconCompatParcelizer(onretakebuttonclick3.RatingCompat);
            }
        }
        onRetakeButtonClick onretakebuttonclick4 = this.presenter;
        if (onretakebuttonclick4 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        String stackedBackground = setStackedBackground();
        onGetStartedClick.IconCompatParcelizer((Object) stackedBackground, "language");
        onretakebuttonclick4.IconCompatParcelizer(stackedBackground);
    }

    public final void IconCompatParcelizer(int i) {
        String str;
        String string;
        Context context = getContext();
        if (context != null) {
            onGetStartedClick.IconCompatParcelizer((Object) context, "it");
            setTitleMarginStart childFragmentManager = getChildFragmentManager();
            onGetStartedClick.IconCompatParcelizer((Object) childFragmentManager, "childFragmentManager");
            Bundle arguments = getArguments();
            String str2 = "";
            if (arguments == null || (str = arguments.getString("account_extra")) == null) {
                str = str2;
            }
            this.IconCompatParcelizer = new getEasycashLoanTypesList(context, childFragmentManager, str);
            FragmentWrapContentViewPager fragmentWrapContentViewPager = this.mTabPager;
            if (fragmentWrapContentViewPager == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("mTabPager");
            }
            fragmentWrapContentViewPager.setAdapter(this.IconCompatParcelizer);
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
            fragmentWrapContentViewPager4.setCurrentItem(i);
            getEasycashLoanTypesList geteasycashloantypeslist = this.IconCompatParcelizer;
            if (geteasycashloantypeslist != null) {
                Bundle arguments2 = getArguments();
                if (!(arguments2 == null || (string = arguments2.getString("account_extra")) == null)) {
                    str2 = string;
                }
                geteasycashloantypeslist.MediaBrowserCompat$ItemReceiver(str2);
            }
        }
        onRetakeButtonClick onretakebuttonclick = this.presenter;
        if (onretakebuttonclick == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        String stackedBackground = setStackedBackground();
        onGetStartedClick.IconCompatParcelizer((Object) stackedBackground, "language");
        onretakebuttonclick.IconCompatParcelizer(stackedBackground);
    }

    public final void read() {
        Context context = getContext();
        if (context != null) {
            context.sendBroadcast(new Intent("com.scb.phone/BROADCAST_BANK_RECEIVED"));
        }
    }

    public final void write() {
        onRetakeButtonClick onretakebuttonclick = this.presenter;
        if (onretakebuttonclick == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        onretakebuttonclick.MediaBrowserCompat$ItemReceiver(R.string.operation_not_found, access$2300.write.NAVIGATE_BACK);
    }
}
