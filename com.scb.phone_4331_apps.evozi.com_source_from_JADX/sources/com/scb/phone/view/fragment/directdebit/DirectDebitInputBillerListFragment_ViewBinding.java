package com.scb.phone.view.fragment.directdebit;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.transferandpay.BaseBillersFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public final class DirectDebitInputBillerListFragment_ViewBinding extends BaseBillersFragment_ViewBinding {
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private DirectDebitInputBillerListFragment MediaBrowserCompat$ItemReceiver;

    public DirectDebitInputBillerListFragment_ViewBinding(final DirectDebitInputBillerListFragment directDebitInputBillerListFragment, View view) {
        super(directDebitInputBillerListFragment, view);
        this.MediaBrowserCompat$ItemReceiver = directDebitInputBillerListFragment;
        directDebitInputBillerListFragment.mRecommendedBillersTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.recommended_billers_text_view, "field 'mRecommendedBillersTextView'", TextView.class);
        directDebitInputBillerListFragment.mSearchEditText = (EditText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.search_edit_text, "field 'mSearchEditText'", EditText.class);
        directDebitInputBillerListFragment.mViewBillerNotFound = onStart.IconCompatParcelizer(view, R.id.view_biller_not_found, "field 'mViewBillerNotFound'");
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.cancel_button, "field 'mSearchButton' and method 'searchButtonClicked'");
        directDebitInputBillerListFragment.mSearchButton = (ImageView) onStart.write(IconCompatParcelizer, R.id.cancel_button, "field 'mSearchButton'", ImageView.class);
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                DirectDebitInputBillerListFragment.this.searchButtonClicked();
            }
        });
        directDebitInputBillerListFragment.searchEditClear = (ImageButton) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.search_edit_clear, "field 'searchEditClear'", ImageButton.class);
        directDebitInputBillerListFragment.searchBarLayout = onStart.IconCompatParcelizer(view, R.id.search_bar_layout, "field 'searchBarLayout'");
    }

    public final void read() {
        DirectDebitInputBillerListFragment directDebitInputBillerListFragment = this.MediaBrowserCompat$ItemReceiver;
        if (directDebitInputBillerListFragment != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            directDebitInputBillerListFragment.mRecommendedBillersTextView = null;
            directDebitInputBillerListFragment.mSearchEditText = null;
            directDebitInputBillerListFragment.mViewBillerNotFound = null;
            directDebitInputBillerListFragment.mSearchButton = null;
            directDebitInputBillerListFragment.searchEditClear = null;
            directDebitInputBillerListFragment.searchBarLayout = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
