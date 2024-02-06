package com.scb.phone.view.fragment.transferandpay.billpaymenttab.ebilltabsfragment;

import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.transferandpay.BaseBillersFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class BasePaymentFragment_ViewBinding extends BaseBillersFragment_ViewBinding {
    private View IconCompatParcelizer;
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private View MediaBrowserCompat$ItemReceiver;
    private BasePaymentFragment write;

    public BasePaymentFragment_ViewBinding(final BasePaymentFragment basePaymentFragment, View view) {
        super(basePaymentFragment, view);
        this.write = basePaymentFragment;
        basePaymentFragment.mRecommendedBillersTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.recommended_billers_text_view, "field 'mRecommendedBillersTextView'", TextView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.search_edit_text, "field 'mSearchEditText' and method 'onSearchAction'");
        basePaymentFragment.mSearchEditText = (EditText) onStart.write(IconCompatParcelizer2, R.id.search_edit_text, "field 'mSearchEditText'", EditText.class);
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer2;
        ((TextView) IconCompatParcelizer2).setOnEditorActionListener(new TextView.OnEditorActionListener() {
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                return BasePaymentFragment.this.onSearchAction(i);
            }
        });
        basePaymentFragment.mViewBillerNotFound = onStart.IconCompatParcelizer(view, R.id.view_biller_not_found, "field 'mViewBillerNotFound'");
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.cancel_button, "field 'mSearchButton' and method 'searchButtonClicked'");
        basePaymentFragment.mSearchButton = (ImageView) onStart.write(IconCompatParcelizer3, R.id.cancel_button, "field 'mSearchButton'", ImageView.class);
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                BasePaymentFragment.this.searchButtonClicked();
            }
        });
        View IconCompatParcelizer4 = onStart.IconCompatParcelizer(view, R.id.search_edit_clear, "field 'searchEditClear' and method 'onClickClear'");
        basePaymentFragment.searchEditClear = (ImageButton) onStart.write(IconCompatParcelizer4, R.id.search_edit_clear, "field 'searchEditClear'", ImageButton.class);
        this.IconCompatParcelizer = IconCompatParcelizer4;
        IconCompatParcelizer4.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                BasePaymentFragment.this.onClickClear();
            }
        });
        basePaymentFragment.searchBarLayout = onStart.IconCompatParcelizer(view, R.id.search_bar_layout, "field 'searchBarLayout'");
    }

    public final void read() {
        BasePaymentFragment basePaymentFragment = this.write;
        if (basePaymentFragment != null) {
            this.write = null;
            basePaymentFragment.mRecommendedBillersTextView = null;
            basePaymentFragment.mSearchEditText = null;
            basePaymentFragment.mViewBillerNotFound = null;
            basePaymentFragment.mSearchButton = null;
            basePaymentFragment.searchEditClear = null;
            basePaymentFragment.searchBarLayout = null;
            ((TextView) this.MediaBrowserCompat$ItemReceiver).setOnEditorActionListener((TextView.OnEditorActionListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
