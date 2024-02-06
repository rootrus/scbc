package com.scb.phone.view.fragment.hml.ekyc;

import android.view.View;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public final class HmlNTBEkycVerifyIdentifyBranchFragment_ViewBinding extends BaseFragment_ViewBinding {
    private HmlNTBEkycVerifyIdentifyBranchFragment IconCompatParcelizer;
    private View write;

    public HmlNTBEkycVerifyIdentifyBranchFragment_ViewBinding(final HmlNTBEkycVerifyIdentifyBranchFragment hmlNTBEkycVerifyIdentifyBranchFragment, View view) {
        super(hmlNTBEkycVerifyIdentifyBranchFragment, view);
        this.IconCompatParcelizer = hmlNTBEkycVerifyIdentifyBranchFragment;
        hmlNTBEkycVerifyIdentifyBranchFragment.tvDate = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_date, "field 'tvDate'", TextView.class);
        hmlNTBEkycVerifyIdentifyBranchFragment.tvVerifyNationalIdMessage = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_hml_verify_national_ID_message, "field 'tvVerifyNationalIdMessage'", TextView.class);
        hmlNTBEkycVerifyIdentifyBranchFragment.tvVerifyNationalIdDescription = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_hml_verify_national_ID_description, "field 'tvVerifyNationalIdDescription'", TextView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.bt_find_uss, "method 'onNextButtonClick'");
        this.write = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                HmlNTBEkycVerifyIdentifyBranchFragment.this.onNextButtonClick();
            }
        });
    }

    public final void read() {
        HmlNTBEkycVerifyIdentifyBranchFragment hmlNTBEkycVerifyIdentifyBranchFragment = this.IconCompatParcelizer;
        if (hmlNTBEkycVerifyIdentifyBranchFragment != null) {
            this.IconCompatParcelizer = null;
            hmlNTBEkycVerifyIdentifyBranchFragment.tvDate = null;
            hmlNTBEkycVerifyIdentifyBranchFragment.tvVerifyNationalIdMessage = null;
            hmlNTBEkycVerifyIdentifyBranchFragment.tvVerifyNationalIdDescription = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
