package com.scb.phone.view.activity.cardmanagement;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.scb.phone.R;
import p040o.onCreateDialog;
import p040o.onStart;

public class DeejungInstallmentsConfirmationActivity_ViewBinding extends SaveSlipBaseActivity_ViewBinding {
    private DeejungInstallmentsConfirmationActivity IconCompatParcelizer;
    private View write;

    public DeejungInstallmentsConfirmationActivity_ViewBinding(final DeejungInstallmentsConfirmationActivity deejungInstallmentsConfirmationActivity, View view) {
        super(deejungInstallmentsConfirmationActivity, view);
        this.IconCompatParcelizer = deejungInstallmentsConfirmationActivity;
        deejungInstallmentsConfirmationActivity.updationTextLayout = (ConstraintLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.updation_text_layout, "field 'updationTextLayout'", ConstraintLayout.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.return_to_my_accounts, "method 'onAccountsClick'");
        this.write = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                DeejungInstallmentsConfirmationActivity.this.onAccountsClick();
            }
        });
    }

    public final void read() {
        DeejungInstallmentsConfirmationActivity deejungInstallmentsConfirmationActivity = this.IconCompatParcelizer;
        if (deejungInstallmentsConfirmationActivity != null) {
            this.IconCompatParcelizer = null;
            deejungInstallmentsConfirmationActivity.updationTextLayout = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
