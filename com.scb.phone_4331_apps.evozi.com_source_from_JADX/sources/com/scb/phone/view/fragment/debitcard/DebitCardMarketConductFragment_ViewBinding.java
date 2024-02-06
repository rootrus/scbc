package com.scb.phone.view.fragment.debitcard;

import android.view.View;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class DebitCardMarketConductFragment_ViewBinding extends BaseFragment_ViewBinding {
    private DebitCardMarketConductFragment IconCompatParcelizer;
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private View MediaBrowserCompat$ItemReceiver;

    public DebitCardMarketConductFragment_ViewBinding(final DebitCardMarketConductFragment debitCardMarketConductFragment, View view) {
        super(debitCardMarketConductFragment, view);
        this.IconCompatParcelizer = debitCardMarketConductFragment;
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.link, "field 'link' and method 'onLinkClick'");
        debitCardMarketConductFragment.link = (TextView) onStart.write(IconCompatParcelizer2, R.id.link, "field 'link'", TextView.class);
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                DebitCardMarketConductFragment.this.onLinkClick();
            }
        });
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.button, "method 'onButtonClick'");
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                DebitCardMarketConductFragment.this.onButtonClick();
            }
        });
    }

    public final void read() {
        DebitCardMarketConductFragment debitCardMarketConductFragment = this.IconCompatParcelizer;
        if (debitCardMarketConductFragment != null) {
            this.IconCompatParcelizer = null;
            debitCardMarketConductFragment.link = null;
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
