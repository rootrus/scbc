package com.scb.phone.view.fragment.transferandpay.billpaymenttab;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class EBillPaymentBillerListFragment_ViewBinding extends BaseFragment_ViewBinding {
    private EBillPaymentBillerListFragment IconCompatParcelizer;
    private View write;

    public EBillPaymentBillerListFragment_ViewBinding(final EBillPaymentBillerListFragment eBillPaymentBillerListFragment, View view) {
        super(eBillPaymentBillerListFragment, view);
        this.IconCompatParcelizer = eBillPaymentBillerListFragment;
        eBillPaymentBillerListFragment.mRecyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ebill_recycler_view, "field 'mRecyclerView'", RecyclerView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.empty_container_relative_layout, "field 'mEmptyCard' and method 'onEmptyLayoutClick'");
        eBillPaymentBillerListFragment.mEmptyCard = (RelativeLayout) onStart.write(IconCompatParcelizer2, R.id.empty_container_relative_layout, "field 'mEmptyCard'", RelativeLayout.class);
        this.write = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                EBillPaymentBillerListFragment.this.onEmptyLayoutClick();
            }
        });
        eBillPaymentBillerListFragment.mEmptyTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.empty_title_text_view, "field 'mEmptyTitle'", TextView.class);
        eBillPaymentBillerListFragment.mEmptyDescription = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.empty_description_text_view, "field 'mEmptyDescription'", TextView.class);
        eBillPaymentBillerListFragment.mEmptyImage = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.empty_button_image_view, "field 'mEmptyImage'", ImageView.class);
    }

    public final void read() {
        EBillPaymentBillerListFragment eBillPaymentBillerListFragment = this.IconCompatParcelizer;
        if (eBillPaymentBillerListFragment != null) {
            this.IconCompatParcelizer = null;
            eBillPaymentBillerListFragment.mRecyclerView = null;
            eBillPaymentBillerListFragment.mEmptyCard = null;
            eBillPaymentBillerListFragment.mEmptyTitle = null;
            eBillPaymentBillerListFragment.mEmptyDescription = null;
            eBillPaymentBillerListFragment.mEmptyImage = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
