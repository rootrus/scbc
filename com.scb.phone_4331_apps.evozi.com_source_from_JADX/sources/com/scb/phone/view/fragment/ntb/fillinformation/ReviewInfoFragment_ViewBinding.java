package com.scb.phone.view.fragment.ntb.fillinformation;

import android.view.View;
import com.scb.phone.R;
import com.scb.phone.view.custom.ntb.CustomInformationPanel;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class ReviewInfoFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View MediaBrowserCompat$ItemReceiver;
    private ReviewInfoFragment write;

    public ReviewInfoFragment_ViewBinding(final ReviewInfoFragment reviewInfoFragment, View view) {
        super(reviewInfoFragment, view);
        this.write = reviewInfoFragment;
        reviewInfoFragment.panelPersonalInfo = (CustomInformationPanel) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.panel_personal_info, "field 'panelPersonalInfo'", CustomInformationPanel.class);
        reviewInfoFragment.panelAccountInfo = (CustomInformationPanel) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.panel_account_info, "field 'panelAccountInfo'", CustomInformationPanel.class);
        reviewInfoFragment.panelContactInfo = (CustomInformationPanel) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.panel_contact_info, "field 'panelContactInfo'", CustomInformationPanel.class);
        reviewInfoFragment.panelOccupationInfo = (CustomInformationPanel) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.panel_occupation_info, "field 'panelOccupationInfo'", CustomInformationPanel.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.button_confirm, "method 'onConfirmButtonClick'");
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                ReviewInfoFragment.this.onConfirmButtonClick(view);
            }
        });
    }

    public final void read() {
        ReviewInfoFragment reviewInfoFragment = this.write;
        if (reviewInfoFragment != null) {
            this.write = null;
            reviewInfoFragment.panelPersonalInfo = null;
            reviewInfoFragment.panelAccountInfo = null;
            reviewInfoFragment.panelContactInfo = null;
            reviewInfoFragment.panelOccupationInfo = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
