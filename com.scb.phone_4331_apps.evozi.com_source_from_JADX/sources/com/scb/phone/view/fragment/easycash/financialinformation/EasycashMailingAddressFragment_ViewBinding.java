package com.scb.phone.view.fragment.easycash.financialinformation;

import android.view.View;
import com.scb.phone.R;
import com.scb.phone.view.fragment.easycash.BaseBreadcrumbAddressFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class EasycashMailingAddressFragment_ViewBinding extends BaseBreadcrumbAddressFragment_ViewBinding {
    private EasycashMailingAddressFragment IconCompatParcelizer;
    private View MediaBrowserCompat$CustomActionResultReceiver;

    public EasycashMailingAddressFragment_ViewBinding(final EasycashMailingAddressFragment easycashMailingAddressFragment, View view) {
        super(easycashMailingAddressFragment, view);
        this.IconCompatParcelizer = easycashMailingAddressFragment;
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.next_button, "method 'onNextClick'");
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                EasycashMailingAddressFragment.this.onNextClick();
            }
        });
    }

    public final void read() {
        if (this.IconCompatParcelizer != null) {
            this.IconCompatParcelizer = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
