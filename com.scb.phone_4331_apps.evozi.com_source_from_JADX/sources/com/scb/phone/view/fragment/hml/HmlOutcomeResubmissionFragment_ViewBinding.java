package com.scb.phone.view.fragment.hml;

import android.view.View;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class HmlOutcomeResubmissionFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View IconCompatParcelizer;
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private HmlOutcomeResubmissionFragment MediaBrowserCompat$ItemReceiver;
    private View write;

    public HmlOutcomeResubmissionFragment_ViewBinding(final HmlOutcomeResubmissionFragment hmlOutcomeResubmissionFragment, View view) {
        super(hmlOutcomeResubmissionFragment, view);
        this.MediaBrowserCompat$ItemReceiver = hmlOutcomeResubmissionFragment;
        hmlOutcomeResubmissionFragment.dateText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_hml_resubmission_date, "field 'dateText'", TextView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.bt_return_home, "method 'onButtonReturnHomeClicked'");
        this.IconCompatParcelizer = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                HmlOutcomeResubmissionFragment.this.onButtonReturnHomeClicked();
            }
        });
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.bt_hml_contact_call_center, "method 'onContactCallCenter'");
        this.write = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                HmlOutcomeResubmissionFragment.this.onContactCallCenter();
            }
        });
        View IconCompatParcelizer4 = onStart.IconCompatParcelizer(view, R.id.btn_hml_resubmission_documents, "method 'onResubmitDocuments'");
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer4;
        IconCompatParcelizer4.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                HmlOutcomeResubmissionFragment.this.onResubmitDocuments();
            }
        });
    }

    public final void read() {
        HmlOutcomeResubmissionFragment hmlOutcomeResubmissionFragment = this.MediaBrowserCompat$ItemReceiver;
        if (hmlOutcomeResubmissionFragment != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            hmlOutcomeResubmissionFragment.dateText = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
