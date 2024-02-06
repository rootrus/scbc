package com.scb.phone.view.activity.mwpartner;

import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class MwBankAccountActivity_ViewBinding extends BaseActivity_ViewBinding {
    private MwBankAccountActivity IconCompatParcelizer;
    private View MediaBrowserCompat$ItemReceiver;
    private View write;

    public MwBankAccountActivity_ViewBinding(final MwBankAccountActivity mwBankAccountActivity, View view) {
        super(mwBankAccountActivity, view);
        this.IconCompatParcelizer = mwBankAccountActivity;
        mwBankAccountActivity.recyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.recycler_view, "field 'recyclerView'", RecyclerView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.btn_mw_review, "field 'btnReview' and method 'onClickReview'");
        mwBankAccountActivity.btnReview = (Button) onStart.write(IconCompatParcelizer2, R.id.btn_mw_review, "field 'btnReview'", Button.class);
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                MwBankAccountActivity.this.onClickReview();
            }
        });
        mwBankAccountActivity.layoutContent = (NestedScrollView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.layout_content, "field 'layoutContent'", NestedScrollView.class);
        mwBankAccountActivity.layoutSomethingError = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.layout_something_error, "field 'layoutSomethingError'", LinearLayout.class);
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.error_tap_to_retry, "method 'onClickRetry'");
        this.write = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                MwBankAccountActivity.this.onClickRetry();
            }
        });
    }

    public final void read() {
        MwBankAccountActivity mwBankAccountActivity = this.IconCompatParcelizer;
        if (mwBankAccountActivity != null) {
            this.IconCompatParcelizer = null;
            mwBankAccountActivity.recyclerView = null;
            mwBankAccountActivity.btnReview = null;
            mwBankAccountActivity.layoutContent = null;
            mwBankAccountActivity.layoutSomethingError = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
