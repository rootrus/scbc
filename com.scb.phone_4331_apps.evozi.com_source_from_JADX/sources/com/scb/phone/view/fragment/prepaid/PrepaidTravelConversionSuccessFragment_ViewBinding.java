package com.scb.phone.view.fragment.prepaid;

import android.view.View;
import com.scb.phone.R;
import com.scb.phone.view.fragment.PurchaseSuccessFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public final class PrepaidTravelConversionSuccessFragment_ViewBinding extends PurchaseSuccessFragment_ViewBinding {
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private PrepaidTravelConversionSuccessFragment MediaBrowserCompat$ItemReceiver;

    public PrepaidTravelConversionSuccessFragment_ViewBinding(final PrepaidTravelConversionSuccessFragment prepaidTravelConversionSuccessFragment, View view) {
        super(prepaidTravelConversionSuccessFragment, view);
        this.MediaBrowserCompat$ItemReceiver = prepaidTravelConversionSuccessFragment;
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.return_button, "method 'onClickReturnButton'");
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                PrepaidTravelConversionSuccessFragment.this.onClickReturnButton();
            }
        });
    }

    public final void read() {
        if (this.MediaBrowserCompat$ItemReceiver != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
