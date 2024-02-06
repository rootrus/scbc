package com.scb.phone.view.fragment.ntb.ekyc;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class EkycFragment_ViewBinding extends BaseFragment_ViewBinding {
    private EkycFragment IconCompatParcelizer;
    private View write;

    public EkycFragment_ViewBinding(final EkycFragment ekycFragment, View view) {
        super(ekycFragment, view);
        this.IconCompatParcelizer = ekycFragment;
        ekycFragment.scanIdText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_scan_id, "field 'scanIdText'", TextView.class);
        ekycFragment.scanPassportText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_scan_passport, "field 'scanPassportText'", TextView.class);
        ekycFragment.livenessText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_liveness_check, "field 'livenessText'", TextView.class);
        ekycFragment.scanIdIcon = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.icon_scan_id, "field 'scanIdIcon'", ImageView.class);
        ekycFragment.scanPassportIcon = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.icon_scan_passport, "field 'scanPassportIcon'", ImageView.class);
        ekycFragment.livenessIcon = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.icon_liveness_check, "field 'livenessIcon'", ImageView.class);
        ekycFragment.scanIdCheckedIcon = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.checked_scan_id, "field 'scanIdCheckedIcon'", ImageView.class);
        ekycFragment.scanPassportCheckedIcon = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.checked_scan_passport, "field 'scanPassportCheckedIcon'", ImageView.class);
        ekycFragment.livenessCheckedIcon = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.checked_liveness_check, "field 'livenessCheckedIcon'", ImageView.class);
        ekycFragment.scanIdIndicator = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.indicator_scan_id, "field 'scanIdIndicator'", ImageView.class);
        ekycFragment.scanPassportIndicator = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.indicator_scan_passport, "field 'scanPassportIndicator'", ImageView.class);
        ekycFragment.livenessIndicator = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.indicator_liveness_check, "field 'livenessIndicator'", ImageView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.button_next, "field 'buttonNext' and method 'onNextButtonClick'");
        ekycFragment.buttonNext = (Button) onStart.write(IconCompatParcelizer2, R.id.button_next, "field 'buttonNext'", Button.class);
        this.write = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                EkycFragment.this.onNextButtonClick();
            }
        });
    }

    public void read() {
        EkycFragment ekycFragment = this.IconCompatParcelizer;
        if (ekycFragment != null) {
            this.IconCompatParcelizer = null;
            ekycFragment.scanIdText = null;
            ekycFragment.scanPassportText = null;
            ekycFragment.livenessText = null;
            ekycFragment.scanIdIcon = null;
            ekycFragment.scanPassportIcon = null;
            ekycFragment.livenessIcon = null;
            ekycFragment.scanIdCheckedIcon = null;
            ekycFragment.scanPassportCheckedIcon = null;
            ekycFragment.livenessCheckedIcon = null;
            ekycFragment.scanIdIndicator = null;
            ekycFragment.scanPassportIndicator = null;
            ekycFragment.livenessIndicator = null;
            ekycFragment.buttonNext = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
