package com.scb.phone.view.fragment.investment.onboarding;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.custom.ntb.CustomInformationPanel;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class FundPersonalInfoFragment_ViewBinding extends BaseFragment_ViewBinding {
    private FundPersonalInfoFragment MediaBrowserCompat$CustomActionResultReceiver;
    private View MediaBrowserCompat$ItemReceiver;

    public FundPersonalInfoFragment_ViewBinding(final FundPersonalInfoFragment fundPersonalInfoFragment, View view) {
        super(fundPersonalInfoFragment, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = fundPersonalInfoFragment;
        fundPersonalInfoFragment.panelPersonalInfo = (CustomInformationPanel) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.panel_mf_personal_info, "field 'panelPersonalInfo'", CustomInformationPanel.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.button_next, "field 'buttonNext' and method 'onClickNext'");
        fundPersonalInfoFragment.buttonNext = (Button) onStart.write(IconCompatParcelizer, R.id.button_next, "field 'buttonNext'", Button.class);
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                FundPersonalInfoFragment.this.onClickNext(view);
            }
        });
        fundPersonalInfoFragment.footer = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.footer, "field 'footer'", TextView.class);
    }

    public final void read() {
        FundPersonalInfoFragment fundPersonalInfoFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (fundPersonalInfoFragment != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            fundPersonalInfoFragment.panelPersonalInfo = null;
            fundPersonalInfoFragment.buttonNext = null;
            fundPersonalInfoFragment.footer = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
