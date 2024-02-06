package com.scb.phone.view.fragment.easycash.financialinformation;

import android.view.View;
import com.scb.phone.R;
import com.scb.phone.view.fragment.easycash.BaseBreadcrumbAddressFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class EasycashWorkAddressFragment_ViewBinding extends BaseBreadcrumbAddressFragment_ViewBinding {
    private EasycashWorkAddressFragment MediaBrowserCompat$ItemReceiver;
    private View write;

    public EasycashWorkAddressFragment_ViewBinding(final EasycashWorkAddressFragment easycashWorkAddressFragment, View view) {
        super(easycashWorkAddressFragment, view);
        this.MediaBrowserCompat$ItemReceiver = easycashWorkAddressFragment;
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.next_button, "method 'onNextClick'");
        this.write = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                EasycashWorkAddressFragment.this.onNextClick();
            }
        });
    }

    public final void read() {
        if (this.MediaBrowserCompat$ItemReceiver != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
