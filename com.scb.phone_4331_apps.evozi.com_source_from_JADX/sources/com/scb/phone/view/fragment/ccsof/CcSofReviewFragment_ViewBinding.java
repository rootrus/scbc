package com.scb.phone.view.fragment.ccsof;

import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public final class CcSofReviewFragment_ViewBinding extends BaseFragment_ViewBinding {
    private CcSofReviewFragment IconCompatParcelizer;
    private View MediaBrowserCompat$ItemReceiver;

    public CcSofReviewFragment_ViewBinding(final CcSofReviewFragment ccSofReviewFragment, View view) {
        super(ccSofReviewFragment, view);
        this.IconCompatParcelizer = ccSofReviewFragment;
        ccSofReviewFragment.itemContainer = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.cc_sof_review_items_container, "field 'itemContainer'", LinearLayout.class);
        ccSofReviewFragment.reviewTcLayout = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.cc_sof_review_tc_layout, "field 'reviewTcLayout'", LinearLayout.class);
        ccSofReviewFragment.reviewTcCheck = (CheckBox) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.cc_sof_review_tc_check, "field 'reviewTcCheck'", CheckBox.class);
        ccSofReviewFragment.reviewTcText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.cc_sof_review_tc_text, "field 'reviewTcText'", TextView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.cc_sof_review_continue_btn, "field 'confirmButton' and method 'onClickConfirm'");
        ccSofReviewFragment.confirmButton = (Button) onStart.write(IconCompatParcelizer2, R.id.cc_sof_review_continue_btn, "field 'confirmButton'", Button.class);
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                CcSofReviewFragment.this.onClickConfirm();
            }
        });
    }

    public final void read() {
        CcSofReviewFragment ccSofReviewFragment = this.IconCompatParcelizer;
        if (ccSofReviewFragment != null) {
            this.IconCompatParcelizer = null;
            ccSofReviewFragment.itemContainer = null;
            ccSofReviewFragment.reviewTcLayout = null;
            ccSofReviewFragment.reviewTcCheck = null;
            ccSofReviewFragment.reviewTcText = null;
            ccSofReviewFragment.confirmButton = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
