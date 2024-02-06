package com.scb.phone.view.fragment.investment.onboarding;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.custom.investment.onboarding.CustomFundAddressDetail;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class FundAddressMainFragment_ViewBinding extends BaseFragment_ViewBinding {
    private FundAddressMainFragment MediaBrowserCompat$ItemReceiver;
    private View write;

    public FundAddressMainFragment_ViewBinding(final FundAddressMainFragment fundAddressMainFragment, View view) {
        super(fundAddressMainFragment, view);
        this.MediaBrowserCompat$ItemReceiver = fundAddressMainFragment;
        fundAddressMainFragment.labelAddressTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.label_address_title, "field 'labelAddressTitle'", TextView.class);
        fundAddressMainFragment.labelAddressDesc = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.label_address_desc, "field 'labelAddressDesc'", TextView.class);
        fundAddressMainFragment.viewAddressDetailHome = (CustomFundAddressDetail) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.custom_address_detail_home, "field 'viewAddressDetailHome'", CustomFundAddressDetail.class);
        fundAddressMainFragment.viewAddressDetailMail = (CustomFundAddressDetail) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.custom_address_detail_mail, "field 'viewAddressDetailMail'", CustomFundAddressDetail.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.button_next, "field 'buttonNext' and method 'onClickNext'");
        fundAddressMainFragment.buttonNext = (Button) onStart.write(IconCompatParcelizer, R.id.button_next, "field 'buttonNext'", Button.class);
        this.write = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                FundAddressMainFragment.this.onClickNext();
            }
        });
    }

    public final void read() {
        FundAddressMainFragment fundAddressMainFragment = this.MediaBrowserCompat$ItemReceiver;
        if (fundAddressMainFragment != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            fundAddressMainFragment.labelAddressTitle = null;
            fundAddressMainFragment.labelAddressDesc = null;
            fundAddressMainFragment.viewAddressDetailHome = null;
            fundAddressMainFragment.viewAddressDetailMail = null;
            fundAddressMainFragment.buttonNext = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
