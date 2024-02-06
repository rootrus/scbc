package com.scb.phone.view.fragment.chequemanagement.ordercheque;

import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class OrderChequeInputFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View IconCompatParcelizer;
    private OrderChequeInputFragment MediaBrowserCompat$ItemReceiver;

    public OrderChequeInputFragment_ViewBinding(final OrderChequeInputFragment orderChequeInputFragment, View view) {
        super(orderChequeInputFragment, view);
        this.MediaBrowserCompat$ItemReceiver = orderChequeInputFragment;
        orderChequeInputFragment.rootErrorNoAccount = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.error_no_account, "field 'rootErrorNoAccount'", LinearLayout.class);
        orderChequeInputFragment.tvErrorNoAccountTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_cheque_no_account_title, "field 'tvErrorNoAccountTitle'", TextView.class);
        orderChequeInputFragment.tvErrorNoAccountDetail = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_cheque_no_account_detail, "field 'tvErrorNoAccountDetail'", TextView.class);
        orderChequeInputFragment.mRecyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.order_recycler_view, "field 'mRecyclerView'", RecyclerView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.btn_order_cheque_review, "field 'btnOrderChequeReview' and method 'onReviewButtonClick'");
        orderChequeInputFragment.btnOrderChequeReview = (Button) onStart.write(IconCompatParcelizer2, R.id.btn_order_cheque_review, "field 'btnOrderChequeReview'", Button.class);
        this.IconCompatParcelizer = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                OrderChequeInputFragment.this.onReviewButtonClick();
            }
        });
        orderChequeInputFragment.mRemainingLimit = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.remaining_limit_text_view, "field 'mRemainingLimit'", TextView.class);
    }

    public final void read() {
        OrderChequeInputFragment orderChequeInputFragment = this.MediaBrowserCompat$ItemReceiver;
        if (orderChequeInputFragment != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            orderChequeInputFragment.rootErrorNoAccount = null;
            orderChequeInputFragment.tvErrorNoAccountTitle = null;
            orderChequeInputFragment.tvErrorNoAccountDetail = null;
            orderChequeInputFragment.mRecyclerView = null;
            orderChequeInputFragment.btnOrderChequeReview = null;
            orderChequeInputFragment.mRemainingLimit = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
