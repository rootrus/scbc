package com.scb.phone.view.custom.common;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onCreateDialog;
import p040o.onStart;

public class CustomRiskAssessmentDialogFragment_ViewBinding implements Unbinder {
    private View IconCompatParcelizer;
    private CustomRiskAssessmentDialogFragment MediaBrowserCompat$CustomActionResultReceiver;
    private View MediaBrowserCompat$ItemReceiver;

    public CustomRiskAssessmentDialogFragment_ViewBinding(final CustomRiskAssessmentDialogFragment customRiskAssessmentDialogFragment, View view) {
        this.MediaBrowserCompat$CustomActionResultReceiver = customRiskAssessmentDialogFragment;
        customRiskAssessmentDialogFragment.mRiskCode = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.risk_code_text_view, "field 'mRiskCode'", TextView.class);
        customRiskAssessmentDialogFragment.mRiskLevel = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.risk_level_text_view, "field 'mRiskLevel'", TextView.class);
        customRiskAssessmentDialogFragment.mRiskLevelValue = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.risk_level_value_text_view, "field 'mRiskLevelValue'", TextView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.confirm_button, "method 'onClickConfirm'");
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                CustomRiskAssessmentDialogFragment.this.onClickConfirm();
            }
        });
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.cancel_button, "method 'onClickCancel'");
        this.IconCompatParcelizer = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                CustomRiskAssessmentDialogFragment.this.onClickCancel();
            }
        });
    }

    public final void read() {
        CustomRiskAssessmentDialogFragment customRiskAssessmentDialogFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (customRiskAssessmentDialogFragment != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            customRiskAssessmentDialogFragment.mRiskCode = null;
            customRiskAssessmentDialogFragment.mRiskLevel = null;
            customRiskAssessmentDialogFragment.mRiskLevelValue = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
