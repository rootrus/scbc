package com.scb.phone.view.fragment.ndid;

import android.view.View;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class NdidSelectIdpSuccessFragment_ViewBinding extends BaseFragment_ViewBinding {
    private NdidSelectIdpSuccessFragment MediaBrowserCompat$CustomActionResultReceiver;
    private View write;

    public NdidSelectIdpSuccessFragment_ViewBinding(final NdidSelectIdpSuccessFragment ndidSelectIdpSuccessFragment, View view) {
        super(ndidSelectIdpSuccessFragment, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = ndidSelectIdpSuccessFragment;
        ndidSelectIdpSuccessFragment.header = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_header, "field 'header'", TextView.class);
        ndidSelectIdpSuccessFragment.idpDescription = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_idp_description, "field 'idpDescription'", TextView.class);
        ndidSelectIdpSuccessFragment.idpGeneralDescription = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_idp_general_description, "field 'idpGeneralDescription'", TextView.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.bt_verified, "method 'onVerifiedButtonClick'");
        this.write = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                NdidSelectIdpSuccessFragment.this.onVerifiedButtonClick();
            }
        });
    }

    public final void read() {
        NdidSelectIdpSuccessFragment ndidSelectIdpSuccessFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (ndidSelectIdpSuccessFragment != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            ndidSelectIdpSuccessFragment.header = null;
            ndidSelectIdpSuccessFragment.idpDescription = null;
            ndidSelectIdpSuccessFragment.idpGeneralDescription = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
