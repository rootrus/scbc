package com.scb.phone.view.fragment.ebillsubscription;

import android.view.View;
import android.widget.TextView;
import com.scb.phone.R;
import p040o.onCreateDialog;
import p040o.onStart;

public class EBillSubscriptionSuccessFragment_ViewBinding extends BaseEBillSubscriptionReviewFragment_ViewBinding {
    private View IconCompatParcelizer;
    private EBillSubscriptionSuccessFragment write;

    public EBillSubscriptionSuccessFragment_ViewBinding(final EBillSubscriptionSuccessFragment eBillSubscriptionSuccessFragment, View view) {
        super(eBillSubscriptionSuccessFragment, view);
        this.write = eBillSubscriptionSuccessFragment;
        eBillSubscriptionSuccessFragment.refIdTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_reference_id, "field 'refIdTextView'", TextView.class);
        eBillSubscriptionSuccessFragment.dateTimeTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_date_time, "field 'dateTimeTextView'", TextView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.return_button, "method 'onReturnToSubscriptionListClick'");
        this.IconCompatParcelizer = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                EBillSubscriptionSuccessFragment.this.onReturnToSubscriptionListClick();
            }
        });
    }

    public final void read() {
        EBillSubscriptionSuccessFragment eBillSubscriptionSuccessFragment = this.write;
        if (eBillSubscriptionSuccessFragment != null) {
            this.write = null;
            eBillSubscriptionSuccessFragment.refIdTextView = null;
            eBillSubscriptionSuccessFragment.dateTimeTextView = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
