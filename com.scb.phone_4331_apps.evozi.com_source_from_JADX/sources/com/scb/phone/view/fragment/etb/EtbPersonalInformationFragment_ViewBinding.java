package com.scb.phone.view.fragment.etb;

import android.view.View;
import android.widget.LinearLayout;
import com.scb.phone.R;
import com.scb.phone.view.custom.ntb.CustomInformationPanel;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class EtbPersonalInformationFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private View MediaBrowserCompat$ItemReceiver;
    private EtbPersonalInformationFragment write;

    public EtbPersonalInformationFragment_ViewBinding(final EtbPersonalInformationFragment etbPersonalInformationFragment, View view) {
        super(etbPersonalInformationFragment, view);
        this.write = etbPersonalInformationFragment;
        etbPersonalInformationFragment.vTapToRetry = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.layout_tap_to_retry, "field 'vTapToRetry'", LinearLayout.class);
        etbPersonalInformationFragment.vContent = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.layout_info, "field 'vContent'", LinearLayout.class);
        etbPersonalInformationFragment.vPersonalInfo = (CustomInformationPanel) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.information_panel_personal_info, "field 'vPersonalInfo'", CustomInformationPanel.class);
        etbPersonalInformationFragment.vContactInfo = (CustomInformationPanel) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.information_panel_contact_info, "field 'vContactInfo'", CustomInformationPanel.class);
        etbPersonalInformationFragment.vOccupationInfo = (CustomInformationPanel) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.information_panel_occupation_info, "field 'vOccupationInfo'", CustomInformationPanel.class);
        etbPersonalInformationFragment.vLayout = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.layout_personal, "field 'vLayout'", LinearLayout.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.error_tap_to_retry, "method 'onClickTapToRetry'");
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                EtbPersonalInformationFragment.this.onClickTapToRetry(view);
            }
        });
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.btn_next, "method 'onClickNext'");
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                EtbPersonalInformationFragment.this.onClickNext();
            }
        });
    }

    public final void read() {
        EtbPersonalInformationFragment etbPersonalInformationFragment = this.write;
        if (etbPersonalInformationFragment != null) {
            this.write = null;
            etbPersonalInformationFragment.vTapToRetry = null;
            etbPersonalInformationFragment.vContent = null;
            etbPersonalInformationFragment.vPersonalInfo = null;
            etbPersonalInformationFragment.vContactInfo = null;
            etbPersonalInformationFragment.vOccupationInfo = null;
            etbPersonalInformationFragment.vLayout = null;
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
