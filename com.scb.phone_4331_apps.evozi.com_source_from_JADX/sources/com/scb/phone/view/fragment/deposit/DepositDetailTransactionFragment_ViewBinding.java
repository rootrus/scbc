package com.scb.phone.view.fragment.deposit;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public class DepositDetailTransactionFragment_ViewBinding extends BaseFragment_ViewBinding {
    private DepositDetailTransactionFragment write;

    public DepositDetailTransactionFragment_ViewBinding(DepositDetailTransactionFragment depositDetailTransactionFragment, View view) {
        super(depositDetailTransactionFragment, view);
        this.write = depositDetailTransactionFragment;
        depositDetailTransactionFragment.mRecyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.recycler_view_transactions, "field 'mRecyclerView'", RecyclerView.class);
        depositDetailTransactionFragment.mTextMessage = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_message, "field 'mTextMessage'", TextView.class);
        depositDetailTransactionFragment.mToolbarTxn = (Toolbar) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.toolbar_txn_header, "field 'mToolbarTxn'", Toolbar.class);
        depositDetailTransactionFragment.mTextTxn = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_txn_header, "field 'mTextTxn'", TextView.class);
        depositDetailTransactionFragment.mTextTxnMonth = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_txn_month_header, "field 'mTextTxnMonth'", TextView.class);
        depositDetailTransactionFragment.mEmptyTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.empty_title_text_view, "field 'mEmptyTitle'", TextView.class);
        depositDetailTransactionFragment.mEmptyDescription = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.empty_description_text_view, "field 'mEmptyDescription'", TextView.class);
        depositDetailTransactionFragment.mEmptyImage = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.empty_button_image_view, "field 'mEmptyImage'", ImageView.class);
        depositDetailTransactionFragment.mEmptyCard = (RelativeLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.empty_container_relative_layout, "field 'mEmptyCard'", RelativeLayout.class);
    }

    public final void read() {
        DepositDetailTransactionFragment depositDetailTransactionFragment = this.write;
        if (depositDetailTransactionFragment != null) {
            this.write = null;
            depositDetailTransactionFragment.mRecyclerView = null;
            depositDetailTransactionFragment.mTextMessage = null;
            depositDetailTransactionFragment.mToolbarTxn = null;
            depositDetailTransactionFragment.mTextTxn = null;
            depositDetailTransactionFragment.mTextTxnMonth = null;
            depositDetailTransactionFragment.mEmptyTitle = null;
            depositDetailTransactionFragment.mEmptyDescription = null;
            depositDetailTransactionFragment.mEmptyImage = null;
            depositDetailTransactionFragment.mEmptyCard = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
