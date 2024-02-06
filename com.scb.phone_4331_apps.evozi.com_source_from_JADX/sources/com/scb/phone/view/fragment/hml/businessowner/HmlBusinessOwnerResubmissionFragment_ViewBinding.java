package com.scb.phone.view.fragment.hml.businessowner;

import android.view.View;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public final class HmlBusinessOwnerResubmissionFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View IconCompatParcelizer;
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private View MediaBrowserCompat$ItemReceiver;
    private HmlBusinessOwnerResubmissionFragment write;

    public HmlBusinessOwnerResubmissionFragment_ViewBinding(final HmlBusinessOwnerResubmissionFragment hmlBusinessOwnerResubmissionFragment, View view) {
        super(hmlBusinessOwnerResubmissionFragment, view);
        this.write = hmlBusinessOwnerResubmissionFragment;
        hmlBusinessOwnerResubmissionFragment.dateText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_hml_resubmission_date, "field 'dateText'", TextView.class);
        hmlBusinessOwnerResubmissionFragment.checkStatus = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_check_status, "field 'checkStatus'", TextView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.btn_hml_resubmission_documents, "method 'onResubmitDocuments'");
        this.IconCompatParcelizer = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                HmlBusinessOwnerResubmissionFragment.this.onResubmitDocuments();
            }
        });
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.bt_return_home, "method 'onButtonReturnHomeClicked'");
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                HmlBusinessOwnerResubmissionFragment.this.onButtonReturnHomeClicked();
            }
        });
        View IconCompatParcelizer4 = onStart.IconCompatParcelizer(view, R.id.bt_hml_contact_call_center, "method 'onContactCallCenter'");
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer4;
        IconCompatParcelizer4.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                HmlBusinessOwnerResubmissionFragment.this.onContactCallCenter();
            }
        });
    }

    public final void read() {
        HmlBusinessOwnerResubmissionFragment hmlBusinessOwnerResubmissionFragment = this.write;
        if (hmlBusinessOwnerResubmissionFragment != null) {
            this.write = null;
            hmlBusinessOwnerResubmissionFragment.dateText = null;
            hmlBusinessOwnerResubmissionFragment.checkStatus = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
