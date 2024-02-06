package com.scb.phone.view.fragment.merchant;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public class BaseMerchantWalletItemTransactionFragment_ViewBinding extends BaseFragment_ViewBinding {
    private BaseMerchantWalletItemTransactionFragment write;

    public BaseMerchantWalletItemTransactionFragment_ViewBinding(BaseMerchantWalletItemTransactionFragment baseMerchantWalletItemTransactionFragment, View view) {
        super(baseMerchantWalletItemTransactionFragment, view);
        this.write = baseMerchantWalletItemTransactionFragment;
        baseMerchantWalletItemTransactionFragment.mRecyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.recycler_view_transactions, "field 'mRecyclerView'", RecyclerView.class);
        baseMerchantWalletItemTransactionFragment.mTextMessage = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_message, "field 'mTextMessage'", TextView.class);
        baseMerchantWalletItemTransactionFragment.mEmptyTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.empty_title_text_view, "field 'mEmptyTitle'", TextView.class);
        baseMerchantWalletItemTransactionFragment.mEmptyDescription = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.empty_description_text_view, "field 'mEmptyDescription'", TextView.class);
        baseMerchantWalletItemTransactionFragment.mEmptyImage = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.empty_button_image_view, "field 'mEmptyImage'", ImageView.class);
        baseMerchantWalletItemTransactionFragment.mEmptyCard = (RelativeLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.empty_container_relative_layout, "field 'mEmptyCard'", RelativeLayout.class);
    }

    public final void read() {
        BaseMerchantWalletItemTransactionFragment baseMerchantWalletItemTransactionFragment = this.write;
        if (baseMerchantWalletItemTransactionFragment != null) {
            this.write = null;
            baseMerchantWalletItemTransactionFragment.mRecyclerView = null;
            baseMerchantWalletItemTransactionFragment.mTextMessage = null;
            baseMerchantWalletItemTransactionFragment.mEmptyTitle = null;
            baseMerchantWalletItemTransactionFragment.mEmptyDescription = null;
            baseMerchantWalletItemTransactionFragment.mEmptyImage = null;
            baseMerchantWalletItemTransactionFragment.mEmptyCard = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
