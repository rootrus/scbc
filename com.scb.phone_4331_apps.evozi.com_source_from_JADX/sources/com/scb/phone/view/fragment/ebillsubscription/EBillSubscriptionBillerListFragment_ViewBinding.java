package com.scb.phone.view.fragment.ebillsubscription;

import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.transferandpay.BaseBillersFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public final class EBillSubscriptionBillerListFragment_ViewBinding extends BaseBillersFragment_ViewBinding {
    private EBillSubscriptionBillerListFragment IconCompatParcelizer;
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private View MediaBrowserCompat$ItemReceiver;
    private View write;

    public EBillSubscriptionBillerListFragment_ViewBinding(final EBillSubscriptionBillerListFragment eBillSubscriptionBillerListFragment, View view) {
        super(eBillSubscriptionBillerListFragment, view);
        this.IconCompatParcelizer = eBillSubscriptionBillerListFragment;
        eBillSubscriptionBillerListFragment.mRecommendedBillersTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.recommended_billers_text_view, "field 'mRecommendedBillersTextView'", TextView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.search_edit_text, "field 'mSearchEditText' and method 'onSearchAction'");
        eBillSubscriptionBillerListFragment.mSearchEditText = (EditText) onStart.write(IconCompatParcelizer2, R.id.search_edit_text, "field 'mSearchEditText'", EditText.class);
        this.write = IconCompatParcelizer2;
        ((TextView) IconCompatParcelizer2).setOnEditorActionListener(new TextView.OnEditorActionListener() {
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                return EBillSubscriptionBillerListFragment.this.onSearchAction(i);
            }
        });
        eBillSubscriptionBillerListFragment.mViewBillerNotFound = onStart.IconCompatParcelizer(view, R.id.view_biller_not_found, "field 'mViewBillerNotFound'");
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.bt_search, "field 'mSearchButton' and method 'searchButtonClicked'");
        eBillSubscriptionBillerListFragment.mSearchButton = (Button) onStart.write(IconCompatParcelizer3, R.id.bt_search, "field 'mSearchButton'", Button.class);
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                EBillSubscriptionBillerListFragment.this.searchButtonClicked();
            }
        });
        View IconCompatParcelizer4 = onStart.IconCompatParcelizer(view, R.id.search_edit_clear, "field 'searchEditClear' and method 'onClickClear'");
        eBillSubscriptionBillerListFragment.searchEditClear = (ImageButton) onStart.write(IconCompatParcelizer4, R.id.search_edit_clear, "field 'searchEditClear'", ImageButton.class);
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer4;
        IconCompatParcelizer4.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                EBillSubscriptionBillerListFragment.this.onClickClear();
            }
        });
        eBillSubscriptionBillerListFragment.searchBarLayout = onStart.IconCompatParcelizer(view, R.id.search_bar_layout, "field 'searchBarLayout'");
    }

    public final void read() {
        EBillSubscriptionBillerListFragment eBillSubscriptionBillerListFragment = this.IconCompatParcelizer;
        if (eBillSubscriptionBillerListFragment != null) {
            this.IconCompatParcelizer = null;
            eBillSubscriptionBillerListFragment.mRecommendedBillersTextView = null;
            eBillSubscriptionBillerListFragment.mSearchEditText = null;
            eBillSubscriptionBillerListFragment.mViewBillerNotFound = null;
            eBillSubscriptionBillerListFragment.mSearchButton = null;
            eBillSubscriptionBillerListFragment.searchEditClear = null;
            eBillSubscriptionBillerListFragment.searchBarLayout = null;
            ((TextView) this.write).setOnEditorActionListener((TextView.OnEditorActionListener) null);
            this.write = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
