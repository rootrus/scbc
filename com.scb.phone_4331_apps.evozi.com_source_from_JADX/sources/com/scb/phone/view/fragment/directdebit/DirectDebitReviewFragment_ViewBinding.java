package com.scb.phone.view.fragment.directdebit;

import android.view.View;
import android.widget.LinearLayout;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public final class DirectDebitReviewFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View MediaBrowserCompat$ItemReceiver;
    private DirectDebitReviewFragment write;

    public DirectDebitReviewFragment_ViewBinding(final DirectDebitReviewFragment directDebitReviewFragment, View view) {
        super(directDebitReviewFragment, view);
        this.write = directDebitReviewFragment;
        directDebitReviewFragment.itemContainer = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.direct_debit_review_items_container, "field 'itemContainer'", LinearLayout.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.direct_debit_review_continue_btn, "method 'onClickNext'");
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                DirectDebitReviewFragment.this.onClickNext();
            }
        });
    }

    public final void read() {
        DirectDebitReviewFragment directDebitReviewFragment = this.write;
        if (directDebitReviewFragment != null) {
            this.write = null;
            directDebitReviewFragment.itemContainer = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
