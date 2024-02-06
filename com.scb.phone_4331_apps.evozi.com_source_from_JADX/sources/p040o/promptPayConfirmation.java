package p040o;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.scb.phone.view.fragment.ccsof.CcSofBillPaymentOnlyFragment;
import com.scb.phone.view.fragment.ccsof.CcSofCreditCardOnlyFragment;
import java.util.List;

/* renamed from: o.promptPayConfirmation */
public final class promptPayConfirmation extends setCardElevation {
    private final List<String> IconCompatParcelizer;
    private final String MediaBrowserCompat$CustomActionResultReceiver;
    private final lambda$processSetComponents$1 MediaBrowserCompat$ItemReceiver;
    private final jsonFromMapEntryString read;
    private final String write;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public promptPayConfirmation(setTitleMarginStart settitlemarginstart, List<String> list, lambda$processSetComponents$1 lambda_processsetcomponents_1, String str, String str2, jsonFromMapEntryString jsonfrommapentrystring) {
        super(settitlemarginstart);
        onGetStartedClick.write((Object) list, "pageTitles");
        onGetStartedClick.write((Object) lambda_processsetcomponents_1, "purchaseSourceOfFundDisplay");
        onGetStartedClick.write((Object) jsonfrommapentrystring, "paymentFlowType");
        this.IconCompatParcelizer = list;
        this.MediaBrowserCompat$ItemReceiver = lambda_processsetcomponents_1;
        this.write = str;
        this.MediaBrowserCompat$CustomActionResultReceiver = str2;
        this.read = jsonfrommapentrystring;
    }

    public final Fragment read(int i) {
        if (i == correctDataPath.BILL_PAYMENT.index) {
            CcSofBillPaymentOnlyFragment.IconCompatParcelizer iconCompatParcelizer = CcSofBillPaymentOnlyFragment.IconCompatParcelizer;
            lambda$processSetComponents$1 lambda_processsetcomponents_1 = this.MediaBrowserCompat$ItemReceiver;
            String str = this.write;
            String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
            jsonFromMapEntryString jsonfrommapentrystring = this.read;
            onGetStartedClick.write((Object) lambda_processsetcomponents_1, "purchaseSourceOfFundDisplay");
            onGetStartedClick.write((Object) jsonfrommapentrystring, "paymentFlowType");
            CcSofBillPaymentOnlyFragment ccSofBillPaymentOnlyFragment = new CcSofBillPaymentOnlyFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("EXTRA_PURCHASE_SOURCE_FUND_DISPLAY", lambda_processsetcomponents_1);
            bundle.putString("EXTRA_CALLBACK_URL", str);
            bundle.putString("EXTRA_BILL_PAYMENT_SUBTYPE", str2);
            bundle.putInt("com.scb.phone.EXTRA_PAYMENT_FLOW_TYPE", jsonfrommapentrystring.ordinal());
            ccSofBillPaymentOnlyFragment.setArguments(bundle);
            return ccSofBillPaymentOnlyFragment;
        }
        CcSofCreditCardOnlyFragment.write write2 = CcSofCreditCardOnlyFragment.IconCompatParcelizer;
        return CcSofCreditCardOnlyFragment.write.IconCompatParcelizer(this.MediaBrowserCompat$ItemReceiver, this.write, this.read);
    }

    public final int getCount() {
        return this.IconCompatParcelizer.size();
    }

    public final CharSequence getPageTitle(int i) {
        return this.IconCompatParcelizer.get(i);
    }
}
