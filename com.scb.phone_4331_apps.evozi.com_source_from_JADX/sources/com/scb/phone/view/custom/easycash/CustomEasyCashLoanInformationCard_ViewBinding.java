package com.scb.phone.view.custom.easycash;

import android.view.View;
import butterknife.Unbinder;
import com.scb.phone.R;
import com.scb.phone.view.custom.ImageTextView;
import p040o.onStart;

public class CustomEasyCashLoanInformationCard_ViewBinding implements Unbinder {
    private CustomEasyCashLoanInformationCard write;

    public CustomEasyCashLoanInformationCard_ViewBinding(CustomEasyCashLoanInformationCard customEasyCashLoanInformationCard, View view) {
        this.write = customEasyCashLoanInformationCard;
        customEasyCashLoanInformationCard.loanName = (ImageTextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.loan_name_img_text_view, "field 'loanName'", ImageTextView.class);
        customEasyCashLoanInformationCard.slider = (CustomDeltaSliderPressed) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.loan_slider, "field 'slider'", CustomDeltaSliderPressed.class);
        customEasyCashLoanInformationCard.detailViews = (CustomSeparatedViews) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.details, "field 'detailViews'", CustomSeparatedViews.class);
    }

    public final void read() {
        CustomEasyCashLoanInformationCard customEasyCashLoanInformationCard = this.write;
        if (customEasyCashLoanInformationCard != null) {
            this.write = null;
            customEasyCashLoanInformationCard.loanName = null;
            customEasyCashLoanInformationCard.slider = null;
            customEasyCashLoanInformationCard.detailViews = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
