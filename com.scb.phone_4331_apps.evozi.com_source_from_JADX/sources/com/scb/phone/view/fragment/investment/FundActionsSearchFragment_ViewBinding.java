package com.scb.phone.view.fragment.investment;

import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.tabs.TabLayout;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.FragmentWrapContentViewPager;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class FundActionsSearchFragment_ViewBinding extends BaseFragment_ViewBinding {
    private FundActionsSearchFragment IconCompatParcelizer;
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private View MediaBrowserCompat$ItemReceiver;

    public FundActionsSearchFragment_ViewBinding(final FundActionsSearchFragment fundActionsSearchFragment, View view) {
        super(fundActionsSearchFragment, view);
        this.IconCompatParcelizer = fundActionsSearchFragment;
        fundActionsSearchFragment.nestedScrollView = (NestedScrollView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.fund_purchase_landing_scroll_view, "field 'nestedScrollView'", NestedScrollView.class);
        fundActionsSearchFragment.mSearchEdit = (EditText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.search_edit_text, "field 'mSearchEdit'", EditText.class);
        fundActionsSearchFragment.tabLayout = (TabLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.fund_search_tab_layout, "field 'tabLayout'", TabLayout.class);
        fundActionsSearchFragment.tabPager = (FragmentWrapContentViewPager) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.fund_search_view_pager, "field 'tabPager'", FragmentWrapContentViewPager.class);
        fundActionsSearchFragment.fundRedeemSearchContainer = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.fund_redeem_search_container, "field 'fundRedeemSearchContainer'", LinearLayout.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.cancel_button, "method 'onClickCancel'");
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                FundActionsSearchFragment.this.onClickCancel();
            }
        });
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.search_edit_clear, "method 'onClickClear'");
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                FundActionsSearchFragment.this.onClickClear();
            }
        });
    }

    public final void read() {
        FundActionsSearchFragment fundActionsSearchFragment = this.IconCompatParcelizer;
        if (fundActionsSearchFragment != null) {
            this.IconCompatParcelizer = null;
            fundActionsSearchFragment.nestedScrollView = null;
            fundActionsSearchFragment.mSearchEdit = null;
            fundActionsSearchFragment.tabLayout = null;
            fundActionsSearchFragment.tabPager = null;
            fundActionsSearchFragment.fundRedeemSearchContainer = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
