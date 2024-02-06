package com.scb.phone.view.custom.cardmanagement;

import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onCreateDialog;
import p040o.onStart;

public class TermsAndConditionsView_ViewBinding implements Unbinder {
    private TermsAndConditionsView IconCompatParcelizer;
    private View MediaBrowserCompat$ItemReceiver;

    public TermsAndConditionsView_ViewBinding(final TermsAndConditionsView termsAndConditionsView, View view) {
        this.IconCompatParcelizer = termsAndConditionsView;
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.chk_terms_and_conditions, "field 'termsCheckBox' and method 'onCheckBoxClick'");
        termsAndConditionsView.termsCheckBox = (CheckBox) onStart.write(IconCompatParcelizer2, R.id.chk_terms_and_conditions, "field 'termsCheckBox'", CheckBox.class);
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                TermsAndConditionsView.this.onCheckBoxClick();
            }
        });
        termsAndConditionsView.txvTermsAndConditions = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.txv_terms_and_condition, "field 'txvTermsAndConditions'", TextView.class);
    }

    public final void read() {
        TermsAndConditionsView termsAndConditionsView = this.IconCompatParcelizer;
        if (termsAndConditionsView != null) {
            this.IconCompatParcelizer = null;
            termsAndConditionsView.termsCheckBox = null;
            termsAndConditionsView.txvTermsAndConditions = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
