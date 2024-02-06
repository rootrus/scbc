package com.scb.phone.view.fragment.merchant;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public class MerchantWalletTransactionFragment_ViewBinding extends BaseFragment_ViewBinding {
    private MerchantWalletTransactionFragment IconCompatParcelizer;

    public MerchantWalletTransactionFragment_ViewBinding(MerchantWalletTransactionFragment merchantWalletTransactionFragment, View view) {
        super(merchantWalletTransactionFragment, view);
        this.IconCompatParcelizer = merchantWalletTransactionFragment;
        merchantWalletTransactionFragment.mToolbarTxn = (Toolbar) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.toolbar_txn_header, "field 'mToolbarTxn'", Toolbar.class);
        merchantWalletTransactionFragment.mTextTxn = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_txn_header, "field 'mTextTxn'", TextView.class);
        merchantWalletTransactionFragment.mTextTxnMonth = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_txn_month_header, "field 'mTextTxnMonth'", TextView.class);
        merchantWalletTransactionFragment.mTabLayoutTransaction = (TabLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tab_merchant_wallet_transaction, "field 'mTabLayoutTransaction'", TabLayout.class);
        merchantWalletTransactionFragment.mViewPager = (ViewPager) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.view_pager_merchant_wallet_transaction, "field 'mViewPager'", ViewPager.class);
    }

    public final void read() {
        MerchantWalletTransactionFragment merchantWalletTransactionFragment = this.IconCompatParcelizer;
        if (merchantWalletTransactionFragment != null) {
            this.IconCompatParcelizer = null;
            merchantWalletTransactionFragment.mToolbarTxn = null;
            merchantWalletTransactionFragment.mTextTxn = null;
            merchantWalletTransactionFragment.mTextTxnMonth = null;
            merchantWalletTransactionFragment.mTabLayoutTransaction = null;
            merchantWalletTransactionFragment.mViewPager = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
