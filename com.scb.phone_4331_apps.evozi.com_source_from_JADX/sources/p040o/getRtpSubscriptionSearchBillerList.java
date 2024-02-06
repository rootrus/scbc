package p040o;

import android.view.View;
import android.widget.RadioGroup;
import butterknife.ButterKnife;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.scb.phone.view.adapter.easycash.viewholder.AccountRepaymentSelectorViewHolder;
import com.scb.phone.view.custom.easycash.CustomEasyCashSectionLabel;
import p040o.CrashlyticsReport;

/* renamed from: o.getRtpSubscriptionSearchBillerList */
public final class getRtpSubscriptionSearchBillerList extends AccountRepaymentSelectorViewHolder {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public getRtpSubscriptionSearchBillerList(View view) {
        super(view);
        onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
        onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
        ButterKnife.IconCompatParcelizer(this, view);
        RadioGroup radioGroup = this.radioGroup;
        if (radioGroup == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("radioGroup");
        }
        radioGroup.setVisibility(8);
    }

    public final void write(populateTime populatetime, FundFactSheetActivity<? super CrashlyticsReport.FilesPayload.File.Builder, HmlVerifyPhoneValidateOtpActivity> fundFactSheetActivity) {
        onGetStartedClick.write((Object) populatetime, "display");
        onGetStartedClick.write((Object) fundFactSheetActivity, "onSelectedRepaymentAccount");
        CLSUUID clsuuid = populatetime;
        onGetStartedClick.write((Object) clsuuid, "display");
        CustomEasyCashSectionLabel customEasyCashSectionLabel = this.textHeader;
        if (customEasyCashSectionLabel == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("textHeader");
        }
        customEasyCashSectionLabel.setText(clsuuid.MediaBrowserCompat$CustomActionResultReceiver);
        MediaBrowserCompat$ItemReceiver(populatetime.IconCompatParcelizer, fundFactSheetActivity);
    }
}
