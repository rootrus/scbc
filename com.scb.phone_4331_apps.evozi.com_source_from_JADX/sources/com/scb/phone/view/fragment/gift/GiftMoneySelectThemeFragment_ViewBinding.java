package com.scb.phone.view.fragment.gift;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;
import p059me.relex.circleindicator.CircleIndicator;

public final class GiftMoneySelectThemeFragment_ViewBinding extends BaseFragment_ViewBinding {
    private GiftMoneySelectThemeFragment MediaBrowserCompat$ItemReceiver;

    public GiftMoneySelectThemeFragment_ViewBinding(GiftMoneySelectThemeFragment giftMoneySelectThemeFragment, View view) {
        super(giftMoneySelectThemeFragment, view);
        this.MediaBrowserCompat$ItemReceiver = giftMoneySelectThemeFragment;
        giftMoneySelectThemeFragment.mViewPager = (ViewPager) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.vp_gift_card_select_theme, "field 'mViewPager'", ViewPager.class);
        giftMoneySelectThemeFragment.mCircleIndicator = (CircleIndicator) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ci_gift_card_select_theme, "field 'mCircleIndicator'", CircleIndicator.class);
    }

    public final void read() {
        GiftMoneySelectThemeFragment giftMoneySelectThemeFragment = this.MediaBrowserCompat$ItemReceiver;
        if (giftMoneySelectThemeFragment != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            giftMoneySelectThemeFragment.mViewPager = null;
            giftMoneySelectThemeFragment.mCircleIndicator = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
