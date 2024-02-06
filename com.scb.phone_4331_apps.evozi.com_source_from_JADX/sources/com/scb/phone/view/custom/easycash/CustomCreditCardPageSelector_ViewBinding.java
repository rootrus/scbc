package com.scb.phone.view.custom.easycash;

import android.view.View;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onStart;
import p059me.relex.circleindicator.CircleIndicator;

public class CustomCreditCardPageSelector_ViewBinding implements Unbinder {
    private CustomCreditCardPageSelector IconCompatParcelizer;

    public CustomCreditCardPageSelector_ViewBinding(CustomCreditCardPageSelector customCreditCardPageSelector, View view) {
        this.IconCompatParcelizer = customCreditCardPageSelector;
        customCreditCardPageSelector.sectionHeader = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.section_header, "field 'sectionHeader'", TextView.class);
        customCreditCardPageSelector.cardViewPager = (ViewPager) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.card_view_pager, "field 'cardViewPager'", ViewPager.class);
        customCreditCardPageSelector.mCircleIndicator = (CircleIndicator) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.indicator, "field 'mCircleIndicator'", CircleIndicator.class);
    }

    public final void read() {
        CustomCreditCardPageSelector customCreditCardPageSelector = this.IconCompatParcelizer;
        if (customCreditCardPageSelector != null) {
            this.IconCompatParcelizer = null;
            customCreditCardPageSelector.sectionHeader = null;
            customCreditCardPageSelector.cardViewPager = null;
            customCreditCardPageSelector.mCircleIndicator = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
