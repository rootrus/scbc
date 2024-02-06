package com.scb.phone.view.fragment.chubb.review;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.transferandpay.BaseReviewFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class ChubbReviewFragment_ViewBinding extends BaseReviewFragment_ViewBinding {
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private ChubbReviewFragment MediaBrowserCompat$ItemReceiver;

    public ChubbReviewFragment_ViewBinding(final ChubbReviewFragment chubbReviewFragment, View view) {
        super(chubbReviewFragment, view);
        this.MediaBrowserCompat$ItemReceiver = chubbReviewFragment;
        chubbReviewFragment.recyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.recycler_view, "field 'recyclerView'", RecyclerView.class);
        chubbReviewFragment.unexpectedDivider = onStart.IconCompatParcelizer(view, R.id.full_divider, "field 'unexpectedDivider'");
        chubbReviewFragment.viewBottomDivider = onStart.IconCompatParcelizer(view, R.id.chubb_review_uppper_recycle, "field 'viewBottomDivider'");
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.button_continue, "method 'onClickConfirm'");
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                ChubbReviewFragment.this.onClickConfirm();
            }
        });
    }

    public final void read() {
        ChubbReviewFragment chubbReviewFragment = this.MediaBrowserCompat$ItemReceiver;
        if (chubbReviewFragment != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            chubbReviewFragment.recyclerView = null;
            chubbReviewFragment.unexpectedDivider = null;
            chubbReviewFragment.viewBottomDivider = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
