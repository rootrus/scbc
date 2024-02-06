package com.scb.phone.view.fragment.creditcard;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.tabs.TabLayout;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.CustomHorizontalProgressBar;
import com.scb.phone.view.custom.common.CustomInstallmentBillsToPay;
import com.scb.phone.view.custom.common.FragmentWrapContentViewPager;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public class InformationTabFragment_ViewBinding extends BaseFragment_ViewBinding {
    private InformationTabFragment write;

    public InformationTabFragment_ViewBinding(InformationTabFragment informationTabFragment, View view) {
        super(informationTabFragment, view);
        this.write = informationTabFragment;
        informationTabFragment.mCustomHorizontalProgressBar = (CustomHorizontalProgressBar) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.custom_horizontal_progress, "field 'mCustomHorizontalProgressBar'", CustomHorizontalProgressBar.class);
        informationTabFragment.mTabLayout = (TabLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.credit_card_tab_layout, "field 'mTabLayout'", TabLayout.class);
        informationTabFragment.mTabPager = (FragmentWrapContentViewPager) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.credit_card_view_pager, "field 'mTabPager'", FragmentWrapContentViewPager.class);
        informationTabFragment.mCustomBillsToPay = (CustomInstallmentBillsToPay) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.custom_bills_to_pay, "field 'mCustomBillsToPay'", CustomInstallmentBillsToPay.class);
        informationTabFragment.llContentViewLayout = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ll_content_view_layout, "field 'llContentViewLayout'", LinearLayout.class);
        informationTabFragment.llErrorLayout = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ll_root_error_layout, "field 'llErrorLayout'", LinearLayout.class);
        informationTabFragment.tvErrorDesc = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_generic_error, "field 'tvErrorDesc'", TextView.class);
        informationTabFragment.ivErrorIcon = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.iv_error_icon, "field 'ivErrorIcon'", ImageView.class);
        informationTabFragment.tvErrorTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_error_title, "field 'tvErrorTitle'", TextView.class);
        informationTabFragment.tvDisclaimerText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_disclaimer_text_creditcard, "field 'tvDisclaimerText'", TextView.class);
    }

    public final void read() {
        InformationTabFragment informationTabFragment = this.write;
        if (informationTabFragment != null) {
            this.write = null;
            informationTabFragment.mCustomHorizontalProgressBar = null;
            informationTabFragment.mTabLayout = null;
            informationTabFragment.mTabPager = null;
            informationTabFragment.mCustomBillsToPay = null;
            informationTabFragment.llContentViewLayout = null;
            informationTabFragment.llErrorLayout = null;
            informationTabFragment.tvErrorDesc = null;
            informationTabFragment.ivErrorIcon = null;
            informationTabFragment.tvErrorTitle = null;
            informationTabFragment.tvDisclaimerText = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
