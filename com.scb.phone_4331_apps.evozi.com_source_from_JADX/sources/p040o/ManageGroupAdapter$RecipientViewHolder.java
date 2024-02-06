package p040o;

import com.thunderhead.connectivity.transport.ServiceConstants;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.cookie.MalformedCookieException;

/* renamed from: o.ManageGroupAdapter$RecipientViewHolder */
public final class ManageGroupAdapter$RecipientViewHolder extends BulkTransferGroupAdapter$GroupViewHolder {
    public final PrepaidRequestMarketConductActivity MediaBrowserCompat$CustomActionResultReceiver() {
        return null;
    }

    public final int MediaBrowserCompat$ItemReceiver() {
        return 0;
    }

    public final String toString() {
        return "netscape";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ManageGroupAdapter$RecipientViewHolder(java.lang.String[] r4) {
        /*
            r3 = this;
            r0 = 5
            o.GiftingStatusBaseActivity[] r0 = new p040o.GiftingStatusBaseActivity[r0]
            o.SubDistrictSearchAdapter$ViewHolder r1 = new o.SubDistrictSearchAdapter$ViewHolder
            r1.<init>()
            r2 = 0
            r0[r2] = r1
            o.BulkTransferGroupAdapter$GroupViewHolder_ViewBinding r1 = new o.BulkTransferGroupAdapter$GroupViewHolder_ViewBinding
            r1.<init>()
            r2 = 1
            r0[r2] = r1
            o.SubDistrictSearchAdapter$ViewHolder_ViewBinding r1 = new o.SubDistrictSearchAdapter$ViewHolder_ViewBinding
            r1.<init>()
            r2 = 2
            r0[r2] = r1
            o.LoanViewPagerAdapter$ItemViewHolder_ViewBinding r1 = new o.LoanViewPagerAdapter$ItemViewHolder_ViewBinding
            r1.<init>()
            r2 = 3
            r0[r2] = r1
            if (r4 == 0) goto L_0x002c
            java.lang.Object r4 = r4.clone()
            java.lang.String[] r4 = (java.lang.String[]) r4
            goto L_0x0032
        L_0x002c:
            java.lang.String r4 = "EEE, dd-MMM-yy HH:mm:ss z"
            java.lang.String[] r4 = new java.lang.String[]{r4}
        L_0x0032:
            r1 = 4
            o.BankingActionAdapter$CustomViewHolder_ViewBinding r2 = new o.BankingActionAdapter$CustomViewHolder_ViewBinding
            r2.<init>(r4)
            r0[r1] = r2
            r3.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.ManageGroupAdapter$RecipientViewHolder.<init>(java.lang.String[]):void");
    }

    ManageGroupAdapter$RecipientViewHolder(GiftingStatusBaseActivity... giftingStatusBaseActivityArr) {
        super(giftingStatusBaseActivityArr);
    }

    public ManageGroupAdapter$RecipientViewHolder() {
        this((String[]) null);
    }

    public final List<SplashActivity> MediaBrowserCompat$ItemReceiver(PrepaidRequestMarketConductActivity prepaidRequestMarketConductActivity, EasyAppTermsAndConditionsActivity easyAppTermsAndConditionsActivity) throws MalformedCookieException {
        RadioButtonGroupAdapter$RadioButtonViewGroup radioButtonGroupAdapter$RadioButtonViewGroup;
        DepositTransactionAdapter$ChildViewHolder_ViewBinding depositTransactionAdapter$ChildViewHolder_ViewBinding;
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(prepaidRequestMarketConductActivity, "Header");
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(easyAppTermsAndConditionsActivity, "Cookie origin");
        if (prepaidRequestMarketConductActivity.IconCompatParcelizer().equalsIgnoreCase("Set-Cookie")) {
            C9669x39e729da bulkTransferSummaryScreenshotAdapter$SummaryScreenshotViewHolder_ViewBinding = C9669x39e729da.MediaBrowserCompat$ItemReceiver;
            if (prepaidRequestMarketConductActivity instanceof PrepaidRequestLandingActivity) {
                PrepaidRequestLandingActivity prepaidRequestLandingActivity = (PrepaidRequestLandingActivity) prepaidRequestMarketConductActivity;
                depositTransactionAdapter$ChildViewHolder_ViewBinding = prepaidRequestLandingActivity.read();
                radioButtonGroupAdapter$RadioButtonViewGroup = new RadioButtonGroupAdapter$RadioButtonViewGroup(prepaidRequestLandingActivity.write(), depositTransactionAdapter$ChildViewHolder_ViewBinding.length());
            } else {
                String MediaBrowserCompat$ItemReceiver = prepaidRequestMarketConductActivity.MediaBrowserCompat$ItemReceiver();
                if (MediaBrowserCompat$ItemReceiver != null) {
                    depositTransactionAdapter$ChildViewHolder_ViewBinding = new DepositTransactionAdapter$ChildViewHolder_ViewBinding(MediaBrowserCompat$ItemReceiver.length());
                    depositTransactionAdapter$ChildViewHolder_ViewBinding.read(MediaBrowserCompat$ItemReceiver);
                    radioButtonGroupAdapter$RadioButtonViewGroup = new RadioButtonGroupAdapter$RadioButtonViewGroup(0, depositTransactionAdapter$ChildViewHolder_ViewBinding.length());
                } else {
                    throw new MalformedCookieException("Header value is null");
                }
            }
            return IconCompatParcelizer(new PrepaidTravelConversionLandingActivity_ViewBinding[]{bulkTransferSummaryScreenshotAdapter$SummaryScreenshotViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver(depositTransactionAdapter$ChildViewHolder_ViewBinding, radioButtonGroupAdapter$RadioButtonViewGroup)}, easyAppTermsAndConditionsActivity);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unrecognized cookie header '");
        sb.append(prepaidRequestMarketConductActivity.toString());
        sb.append("'");
        throw new MalformedCookieException(sb.toString());
    }

    public final List<PrepaidRequestMarketConductActivity> write(List<SplashActivity> list) {
        DepositTransactionAdapter$GroupItemViewHolder.read(list, "List of cookies");
        DepositTransactionAdapter$ChildViewHolder_ViewBinding depositTransactionAdapter$ChildViewHolder_ViewBinding = new DepositTransactionAdapter$ChildViewHolder_ViewBinding(list.size() * 20);
        depositTransactionAdapter$ChildViewHolder_ViewBinding.read(ServiceConstants.HEADER_COOKIE);
        depositTransactionAdapter$ChildViewHolder_ViewBinding.read(": ");
        for (int i = 0; i < list.size(); i++) {
            SplashActivity splashActivity = list.get(i);
            if (i > 0) {
                depositTransactionAdapter$ChildViewHolder_ViewBinding.read("; ");
            }
            depositTransactionAdapter$ChildViewHolder_ViewBinding.read(splashActivity.MediaBrowserCompat$ItemReceiver());
            String MediaDescriptionCompat = splashActivity.MediaDescriptionCompat();
            if (MediaDescriptionCompat != null) {
                depositTransactionAdapter$ChildViewHolder_ViewBinding.read("=");
                depositTransactionAdapter$ChildViewHolder_ViewBinding.read(MediaDescriptionCompat);
            }
        }
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new AmountDetailsAdapter$SuccessRow(depositTransactionAdapter$ChildViewHolder_ViewBinding));
        return arrayList;
    }
}
