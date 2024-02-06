package com.scb.phone.view.fragment.easycash;

import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class EasycashSuccessFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View IconCompatParcelizer;
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private EasycashSuccessFragment write;

    public EasycashSuccessFragment_ViewBinding(final EasycashSuccessFragment easycashSuccessFragment, View view) {
        super(easycashSuccessFragment, view);
        this.write = easycashSuccessFragment;
        easycashSuccessFragment.textViewPageTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_title, "field 'textViewPageTitle'", TextView.class);
        easycashSuccessFragment.textViewPageDescription = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_desc, "field 'textViewPageDescription'", TextView.class);
        easycashSuccessFragment.textViewTransactionTime = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_date_time, "field 'textViewTransactionTime'", TextView.class);
        easycashSuccessFragment.textViewTransactionId = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_reference_id, "field 'textViewTransactionId'", TextView.class);
        easycashSuccessFragment.textViewLoanAppId = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_loan_app_id, "field 'textViewLoanAppId'", TextView.class);
        easycashSuccessFragment.successCommonView = (FrameLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.common_success_view, "field 'successCommonView'", FrameLayout.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.auto_save_off_save_button, "field 'autoSaveOffSaveButton' and method 'saveSlipButton'");
        easycashSuccessFragment.autoSaveOffSaveButton = (Button) onStart.write(IconCompatParcelizer2, R.id.auto_save_off_save_button, "field 'autoSaveOffSaveButton'", Button.class);
        this.IconCompatParcelizer = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                EasycashSuccessFragment.this.saveSlipButton();
            }
        });
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.return_button, "field 'returnButton' and method 'onReturnButtonClicked'");
        easycashSuccessFragment.returnButton = (TextView) onStart.write(IconCompatParcelizer3, R.id.return_button, "field 'returnButton'", TextView.class);
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                EasycashSuccessFragment.this.onReturnButtonClicked();
            }
        });
        easycashSuccessFragment.textViewRemainingBalance = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.remaining_balance_text_view, "field 'textViewRemainingBalance'", TextView.class);
        easycashSuccessFragment.zigzagimage = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.end_slip, "field 'zigzagimage'", ImageView.class);
        easycashSuccessFragment.slipLayout = (RelativeLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.layout_slip, "field 'slipLayout'", RelativeLayout.class);
        easycashSuccessFragment.contentLayout = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.root_layout, "field 'contentLayout'", LinearLayout.class);
        easycashSuccessFragment.printerLineView = onStart.IconCompatParcelizer(view, R.id.line_black, "field 'printerLineView'");
    }

    public final void read() {
        EasycashSuccessFragment easycashSuccessFragment = this.write;
        if (easycashSuccessFragment != null) {
            this.write = null;
            easycashSuccessFragment.textViewPageTitle = null;
            easycashSuccessFragment.textViewPageDescription = null;
            easycashSuccessFragment.textViewTransactionTime = null;
            easycashSuccessFragment.textViewTransactionId = null;
            easycashSuccessFragment.textViewLoanAppId = null;
            easycashSuccessFragment.successCommonView = null;
            easycashSuccessFragment.autoSaveOffSaveButton = null;
            easycashSuccessFragment.returnButton = null;
            easycashSuccessFragment.textViewRemainingBalance = null;
            easycashSuccessFragment.zigzagimage = null;
            easycashSuccessFragment.slipLayout = null;
            easycashSuccessFragment.contentLayout = null;
            easycashSuccessFragment.printerLineView = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
