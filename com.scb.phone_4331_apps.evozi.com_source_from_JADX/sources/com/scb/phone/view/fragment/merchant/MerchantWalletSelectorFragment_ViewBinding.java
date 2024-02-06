package com.scb.phone.view.fragment.merchant;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;
import p059me.relex.circleindicator.CircleIndicator;

public class MerchantWalletSelectorFragment_ViewBinding extends BaseFragment_ViewBinding {
    private MerchantWalletSelectorFragment MediaBrowserCompat$ItemReceiver;

    public MerchantWalletSelectorFragment_ViewBinding(MerchantWalletSelectorFragment merchantWalletSelectorFragment, View view) {
        super(merchantWalletSelectorFragment, view);
        this.MediaBrowserCompat$ItemReceiver = merchantWalletSelectorFragment;
        merchantWalletSelectorFragment.mViewPager = (ViewPager) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.view_pager_select_account, "field 'mViewPager'", ViewPager.class);
        merchantWalletSelectorFragment.mCircleIndicator = (CircleIndicator) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.circle_indicator, "field 'mCircleIndicator'", CircleIndicator.class);
    }

    public final void read() {
        MerchantWalletSelectorFragment merchantWalletSelectorFragment = this.MediaBrowserCompat$ItemReceiver;
        if (merchantWalletSelectorFragment != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            merchantWalletSelectorFragment.mViewPager = null;
            merchantWalletSelectorFragment.mCircleIndicator = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
