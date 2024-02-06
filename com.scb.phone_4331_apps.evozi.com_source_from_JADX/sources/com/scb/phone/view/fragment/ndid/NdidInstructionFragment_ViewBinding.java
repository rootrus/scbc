package com.scb.phone.view.fragment.ndid;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class NdidInstructionFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View MediaBrowserCompat$ItemReceiver;
    private NdidInstructionFragment write;

    public NdidInstructionFragment_ViewBinding(final NdidInstructionFragment ndidInstructionFragment, View view) {
        super(ndidInstructionFragment, view);
        this.write = ndidInstructionFragment;
        ndidInstructionFragment.scanIdText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_scan_id, "field 'scanIdText'", TextView.class);
        ndidInstructionFragment.verifyingPartnerText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_verifying_partner, "field 'verifyingPartnerText'", TextView.class);
        ndidInstructionFragment.livenessText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_liveness_check, "field 'livenessText'", TextView.class);
        ndidInstructionFragment.scanIdIcon = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.icon_scan_id, "field 'scanIdIcon'", ImageView.class);
        ndidInstructionFragment.verifyingPartnerIcon = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.icon_verifying_partner, "field 'verifyingPartnerIcon'", ImageView.class);
        ndidInstructionFragment.livenessIcon = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.icon_liveness_check, "field 'livenessIcon'", ImageView.class);
        ndidInstructionFragment.scanIdCheckedIcon = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.checked_scan_id, "field 'scanIdCheckedIcon'", ImageView.class);
        ndidInstructionFragment.verifyingPartnerCheckedIcon = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.checked_verifying_partner, "field 'verifyingPartnerCheckedIcon'", ImageView.class);
        ndidInstructionFragment.livenessCheckedIcon = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.checked_liveness_check, "field 'livenessCheckedIcon'", ImageView.class);
        ndidInstructionFragment.scanIdIndicator = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.indicator_scan_id, "field 'scanIdIndicator'", ImageView.class);
        ndidInstructionFragment.verifyingPartnerIndicator = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.indicator_verifying_partner, "field 'verifyingPartnerIndicator'", ImageView.class);
        ndidInstructionFragment.livenessIndicator = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.indicator_liveness_check, "field 'livenessIndicator'", ImageView.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.button_next, "field 'buttonNext' and method 'onNextButtonClick'");
        ndidInstructionFragment.buttonNext = (Button) onStart.write(IconCompatParcelizer, R.id.button_next, "field 'buttonNext'", Button.class);
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                NdidInstructionFragment.this.onNextButtonClick();
            }
        });
    }

    public final void read() {
        NdidInstructionFragment ndidInstructionFragment = this.write;
        if (ndidInstructionFragment != null) {
            this.write = null;
            ndidInstructionFragment.scanIdText = null;
            ndidInstructionFragment.verifyingPartnerText = null;
            ndidInstructionFragment.livenessText = null;
            ndidInstructionFragment.scanIdIcon = null;
            ndidInstructionFragment.verifyingPartnerIcon = null;
            ndidInstructionFragment.livenessIcon = null;
            ndidInstructionFragment.scanIdCheckedIcon = null;
            ndidInstructionFragment.verifyingPartnerCheckedIcon = null;
            ndidInstructionFragment.livenessCheckedIcon = null;
            ndidInstructionFragment.scanIdIndicator = null;
            ndidInstructionFragment.verifyingPartnerIndicator = null;
            ndidInstructionFragment.livenessIndicator = null;
            ndidInstructionFragment.buttonNext = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
