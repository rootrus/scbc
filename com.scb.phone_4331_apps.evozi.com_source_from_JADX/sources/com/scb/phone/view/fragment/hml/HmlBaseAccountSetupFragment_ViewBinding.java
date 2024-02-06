package com.scb.phone.view.fragment.hml;

import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import com.scb.phone.R;
import com.scb.phone.view.custom.easycash.CustomTileToggle;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public class HmlBaseAccountSetupFragment_ViewBinding extends BaseFragment_ViewBinding {
    private HmlBaseAccountSetupFragment IconCompatParcelizer;

    public HmlBaseAccountSetupFragment_ViewBinding(HmlBaseAccountSetupFragment hmlBaseAccountSetupFragment, View view) {
        super(hmlBaseAccountSetupFragment, view);
        this.IconCompatParcelizer = hmlBaseAccountSetupFragment;
        hmlBaseAccountSetupFragment.receivingAccountSpinner = (Spinner) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.spn_receiving_account, "field 'receivingAccountSpinner'", Spinner.class);
        hmlBaseAccountSetupFragment.questionIcon = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.iv_icon, "field 'questionIcon'", ImageView.class);
        hmlBaseAccountSetupFragment.repaymentMethodToggle = (CustomTileToggle) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.custom_tile_toggler, "field 'repaymentMethodToggle'", CustomTileToggle.class);
        hmlBaseAccountSetupFragment.repaymentSpinnerGroup = (Group) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.repayment_spinner_group, "field 'repaymentSpinnerGroup'", Group.class);
        hmlBaseAccountSetupFragment.repaymentAccountSpinner = (Spinner) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.spn_repayment_account, "field 'repaymentAccountSpinner'", Spinner.class);
        hmlBaseAccountSetupFragment.repaymentDateTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_repayment_date_title, "field 'repaymentDateTitle'", TextView.class);
        hmlBaseAccountSetupFragment.repaymentDateTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_repayment_date, "field 'repaymentDateTextView'", TextView.class);
        hmlBaseAccountSetupFragment.estatementEmailTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_estatement_email_title, "field 'estatementEmailTitle'", TextView.class);
        hmlBaseAccountSetupFragment.estatementEmail = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_estatement_email, "field 'estatementEmail'", TextView.class);
        hmlBaseAccountSetupFragment.emailSeparator = (FrameLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.fl_email_separator, "field 'emailSeparator'", FrameLayout.class);
        hmlBaseAccountSetupFragment.estatementEmailDisclaimer = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_estatement_disclaimer, "field 'estatementEmailDisclaimer'", TextView.class);
        hmlBaseAccountSetupFragment.repaymentAccountTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_repayment_account_title, "field 'repaymentAccountTitle'", TextView.class);
        hmlBaseAccountSetupFragment.repaymentMethodLabel = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_repayment_method_label, "field 'repaymentMethodLabel'", TextView.class);
        hmlBaseAccountSetupFragment.nextButton = (Button) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.bt_next, "field 'nextButton'", Button.class);
    }

    public final void read() {
        HmlBaseAccountSetupFragment hmlBaseAccountSetupFragment = this.IconCompatParcelizer;
        if (hmlBaseAccountSetupFragment != null) {
            this.IconCompatParcelizer = null;
            hmlBaseAccountSetupFragment.receivingAccountSpinner = null;
            hmlBaseAccountSetupFragment.questionIcon = null;
            hmlBaseAccountSetupFragment.repaymentMethodToggle = null;
            hmlBaseAccountSetupFragment.repaymentSpinnerGroup = null;
            hmlBaseAccountSetupFragment.repaymentAccountSpinner = null;
            hmlBaseAccountSetupFragment.repaymentDateTitle = null;
            hmlBaseAccountSetupFragment.repaymentDateTextView = null;
            hmlBaseAccountSetupFragment.estatementEmailTitle = null;
            hmlBaseAccountSetupFragment.estatementEmail = null;
            hmlBaseAccountSetupFragment.emailSeparator = null;
            hmlBaseAccountSetupFragment.estatementEmailDisclaimer = null;
            hmlBaseAccountSetupFragment.repaymentAccountTitle = null;
            hmlBaseAccountSetupFragment.repaymentMethodLabel = null;
            hmlBaseAccountSetupFragment.nextButton = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
