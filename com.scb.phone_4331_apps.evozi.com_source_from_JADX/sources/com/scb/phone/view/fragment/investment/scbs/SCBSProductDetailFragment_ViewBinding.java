package com.scb.phone.view.fragment.investment.scbs;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class SCBSProductDetailFragment_ViewBinding extends BaseFragment_ViewBinding {
    private SCBSProductDetailFragment IconCompatParcelizer;
    private View MediaBrowserCompat$ItemReceiver;

    public SCBSProductDetailFragment_ViewBinding(final SCBSProductDetailFragment sCBSProductDetailFragment, View view) {
        super(sCBSProductDetailFragment, view);
        this.IconCompatParcelizer = sCBSProductDetailFragment;
        sCBSProductDetailFragment.nameLabel = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.name_label, "field 'nameLabel'", TextView.class);
        sCBSProductDetailFragment.nameValue = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.name_value, "field 'nameValue'", TextView.class);
        sCBSProductDetailFragment.marketValue = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.market_value, "field 'marketValue'", TextView.class);
        sCBSProductDetailFragment.currency = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.currency, "field 'currency'", TextView.class);
        sCBSProductDetailFragment.unrealized = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.unrealized, "field 'unrealized'", TextView.class);
        sCBSProductDetailFragment.unrealizedAmount = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.unrealized_amount, "field 'unrealizedAmount'", TextView.class);
        sCBSProductDetailFragment.genericSeparator = onStart.IconCompatParcelizer(view, R.id.generic_separator, "field 'genericSeparator'");
        sCBSProductDetailFragment.details = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.details, "field 'details'", LinearLayout.class);
        sCBSProductDetailFragment.disclaimer = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.disclaimer, "field 'disclaimer'", TextView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.button, "field 'button' and method 'onTradeClick'");
        sCBSProductDetailFragment.button = (Button) onStart.write(IconCompatParcelizer2, R.id.button, "field 'button'", Button.class);
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                SCBSProductDetailFragment.this.onTradeClick();
            }
        });
        sCBSProductDetailFragment.arrowUp = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.arrow_up, "field 'arrowUp'", ImageView.class);
    }

    public final void read() {
        SCBSProductDetailFragment sCBSProductDetailFragment = this.IconCompatParcelizer;
        if (sCBSProductDetailFragment != null) {
            this.IconCompatParcelizer = null;
            sCBSProductDetailFragment.nameLabel = null;
            sCBSProductDetailFragment.nameValue = null;
            sCBSProductDetailFragment.marketValue = null;
            sCBSProductDetailFragment.currency = null;
            sCBSProductDetailFragment.unrealized = null;
            sCBSProductDetailFragment.unrealizedAmount = null;
            sCBSProductDetailFragment.genericSeparator = null;
            sCBSProductDetailFragment.details = null;
            sCBSProductDetailFragment.disclaimer = null;
            sCBSProductDetailFragment.button = null;
            sCBSProductDetailFragment.arrowUp = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
