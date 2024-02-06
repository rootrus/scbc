package com.scb.phone.view.fragment.etb;

import android.view.View;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class ETBMarketConductFragment_ViewBinding extends BaseFragment_ViewBinding {
    private ETBMarketConductFragment MediaBrowserCompat$CustomActionResultReceiver;
    private View MediaBrowserCompat$ItemReceiver;
    private View write;

    public ETBMarketConductFragment_ViewBinding(final ETBMarketConductFragment eTBMarketConductFragment, View view) {
        super(eTBMarketConductFragment, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = eTBMarketConductFragment;
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.scb_link, "field 'scbLink' and method 'onScbLink'");
        eTBMarketConductFragment.scbLink = (TextView) onStart.write(IconCompatParcelizer, R.id.scb_link, "field 'scbLink'", TextView.class);
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                ETBMarketConductFragment.this.onScbLink();
            }
        });
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.btn_read, "method 'onReadButtonClick'");
        this.write = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                ETBMarketConductFragment.this.onReadButtonClick();
            }
        });
    }

    public final void read() {
        ETBMarketConductFragment eTBMarketConductFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (eTBMarketConductFragment != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            eTBMarketConductFragment.scbLink = null;
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
