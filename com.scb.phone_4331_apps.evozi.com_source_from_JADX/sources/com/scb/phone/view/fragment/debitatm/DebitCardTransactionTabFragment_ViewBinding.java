package com.scb.phone.view.fragment.debitatm;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public class DebitCardTransactionTabFragment_ViewBinding extends BaseFragment_ViewBinding {
    private DebitCardTransactionTabFragment MediaBrowserCompat$CustomActionResultReceiver;

    public DebitCardTransactionTabFragment_ViewBinding(DebitCardTransactionTabFragment debitCardTransactionTabFragment, View view) {
        super(debitCardTransactionTabFragment, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = debitCardTransactionTabFragment;
        debitCardTransactionTabFragment.mRecyclerViewDebit = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.recycler_view_transactions, "field 'mRecyclerViewDebit'", RecyclerView.class);
        debitCardTransactionTabFragment.mTextMessageDebit = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_message, "field 'mTextMessageDebit'", TextView.class);
        debitCardTransactionTabFragment.mToolbarTxnDebit = (Toolbar) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.toolbar_txn_header, "field 'mToolbarTxnDebit'", Toolbar.class);
        debitCardTransactionTabFragment.mTextTxnDebit = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_txn_header, "field 'mTextTxnDebit'", TextView.class);
        debitCardTransactionTabFragment.mTextTxnMonthDebit = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_txn_month_header, "field 'mTextTxnMonthDebit'", TextView.class);
        debitCardTransactionTabFragment.mEmptyTitleDebit = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.empty_title_text_view, "field 'mEmptyTitleDebit'", TextView.class);
        debitCardTransactionTabFragment.mEmptyDescriptionDebit = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.empty_description_text_view, "field 'mEmptyDescriptionDebit'", TextView.class);
        debitCardTransactionTabFragment.mEmptyImageDebit = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.empty_button_image_view, "field 'mEmptyImageDebit'", ImageView.class);
        debitCardTransactionTabFragment.mEmptyCard = (RelativeLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.empty_container_relative_layout, "field 'mEmptyCard'", RelativeLayout.class);
    }

    public final void read() {
        DebitCardTransactionTabFragment debitCardTransactionTabFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (debitCardTransactionTabFragment != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            debitCardTransactionTabFragment.mRecyclerViewDebit = null;
            debitCardTransactionTabFragment.mTextMessageDebit = null;
            debitCardTransactionTabFragment.mToolbarTxnDebit = null;
            debitCardTransactionTabFragment.mTextTxnDebit = null;
            debitCardTransactionTabFragment.mTextTxnMonthDebit = null;
            debitCardTransactionTabFragment.mEmptyTitleDebit = null;
            debitCardTransactionTabFragment.mEmptyDescriptionDebit = null;
            debitCardTransactionTabFragment.mEmptyImageDebit = null;
            debitCardTransactionTabFragment.mEmptyCard = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
