package com.scb.phone.view.fragment.hml.businessowner;

import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.hml.HmlOutcomePendingFragment;
import p040o.isHandlingException;
import p040o.onGetStartedClick;

public final class HmlBusinessOwnerOutcomePendingFragment extends HmlOutcomePendingFragment {
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    public final void write(isHandlingException ishandlingexception) {
        onGetStartedClick.write((Object) ishandlingexception, "display");
        super.write(ishandlingexception);
        TextView textView = this.statusHeader;
        onGetStartedClick.IconCompatParcelizer((Object) textView, "statusHeader");
        textView.setText(getString(R.string.hml_business_owner_outcome_loan_status_header));
        TextView textView2 = this.statusFirst;
        onGetStartedClick.IconCompatParcelizer((Object) textView2, "statusFirst");
        textView2.setText(getString(R.string.hml_business_owner_outcome_application_received));
        TextView textView3 = this.statusSecond;
        onGetStartedClick.IconCompatParcelizer((Object) textView3, "statusSecond");
        textView3.setText(getString(R.string.hml_business_owner_outcome_reviewing_docs));
        TextView textView4 = this.statusThird;
        onGetStartedClick.IconCompatParcelizer((Object) textView4, "statusThird");
        textView4.setText(getString(R.string.hml_business_owner_outcome_get_result));
        TextView textView5 = this.notificationHeader;
        onGetStartedClick.IconCompatParcelizer((Object) textView5, "notificationHeader");
        textView5.setText(getString(R.string.hml_business_owner_outcome_get_notified));
        TextView textView6 = this.notificationText;
        onGetStartedClick.IconCompatParcelizer((Object) textView6, "notificationText");
        textView6.setText(getString(R.string.hml_business_owner_outcome_sms_notification));
        TextView textView7 = this.contactInfo;
        onGetStartedClick.IconCompatParcelizer((Object) textView7, "contactInfo");
        textView7.setText(getString(R.string.hml_business_owner_outcome_inquiries));
    }
}
