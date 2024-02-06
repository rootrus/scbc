package com.scb.phone.view.fragment.ebillsubscription;

import android.view.View;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class EBillSubscriptionFragment_ViewBinding extends BaseFragment_ViewBinding {
    private EBillSubscriptionFragment IconCompatParcelizer;
    private View MediaBrowserCompat$CustomActionResultReceiver;

    public EBillSubscriptionFragment_ViewBinding(final EBillSubscriptionFragment eBillSubscriptionFragment, View view) {
        super(eBillSubscriptionFragment, view);
        this.IconCompatParcelizer = eBillSubscriptionFragment;
        eBillSubscriptionFragment.recyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ebill_subscription_recycler_view, "field 'recyclerView'", RecyclerView.class);
        eBillSubscriptionFragment.scrollView = (NestedScrollView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.scroll_view, "field 'scrollView'", NestedScrollView.class);
        eBillSubscriptionFragment.noEBillSubscriptionTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.no_ebill_subscription_textview, "field 'noEBillSubscriptionTextView'", TextView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.button_new_subscription, "method 'onButtonNewSubscriptionClick'");
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                EBillSubscriptionFragment.this.onButtonNewSubscriptionClick();
            }
        });
    }

    public final void read() {
        EBillSubscriptionFragment eBillSubscriptionFragment = this.IconCompatParcelizer;
        if (eBillSubscriptionFragment != null) {
            this.IconCompatParcelizer = null;
            eBillSubscriptionFragment.recyclerView = null;
            eBillSubscriptionFragment.scrollView = null;
            eBillSubscriptionFragment.noEBillSubscriptionTextView = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
