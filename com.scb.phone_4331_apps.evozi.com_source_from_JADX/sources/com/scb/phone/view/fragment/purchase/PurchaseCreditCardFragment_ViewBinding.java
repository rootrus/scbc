package com.scb.phone.view.fragment.purchase;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;
import p059me.relex.circleindicator.CircleIndicator;

public class PurchaseCreditCardFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View MediaBrowserCompat$ItemReceiver;
    private PurchaseCreditCardFragment write;

    public PurchaseCreditCardFragment_ViewBinding(final PurchaseCreditCardFragment purchaseCreditCardFragment, View view) {
        super(purchaseCreditCardFragment, view);
        this.write = purchaseCreditCardFragment;
        purchaseCreditCardFragment.layoutCards = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.layout_cards, "field 'layoutCards'", LinearLayout.class);
        purchaseCreditCardFragment.layoutNoCard = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.layout_no_card, "field 'layoutNoCard'", LinearLayout.class);
        purchaseCreditCardFragment.noCardDescriptionTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.no_card_text_view_description, "field 'noCardDescriptionTextView'", TextView.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.layout_error, "field 'layoutError' and method 'onRefreshErrorCard'");
        purchaseCreditCardFragment.layoutError = (LinearLayout) onStart.write(IconCompatParcelizer, R.id.layout_error, "field 'layoutError'", LinearLayout.class);
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                PurchaseCreditCardFragment.this.onRefreshErrorCard();
            }
        });
        purchaseCreditCardFragment.errorTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.error_title, "field 'errorTitle'", TextView.class);
        purchaseCreditCardFragment.errorDescription = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.error_description, "field 'errorDescription'", TextView.class);
        purchaseCreditCardFragment.mViewPager = (ViewPager) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.card_view_pager, "field 'mViewPager'", ViewPager.class);
        purchaseCreditCardFragment.mIndicator = (CircleIndicator) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.indicator, "field 'mIndicator'", CircleIndicator.class);
        purchaseCreditCardFragment.noCardTitleTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.no_card_text_view_title, "field 'noCardTitleTextView'", TextView.class);
    }

    public final void read() {
        PurchaseCreditCardFragment purchaseCreditCardFragment = this.write;
        if (purchaseCreditCardFragment != null) {
            this.write = null;
            purchaseCreditCardFragment.layoutCards = null;
            purchaseCreditCardFragment.layoutNoCard = null;
            purchaseCreditCardFragment.noCardDescriptionTextView = null;
            purchaseCreditCardFragment.layoutError = null;
            purchaseCreditCardFragment.errorTitle = null;
            purchaseCreditCardFragment.errorDescription = null;
            purchaseCreditCardFragment.mViewPager = null;
            purchaseCreditCardFragment.mIndicator = null;
            purchaseCreditCardFragment.noCardTitleTextView = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
