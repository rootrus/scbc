package p040o;

import com.thunderhead.connectivity.transport.ServiceConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.apache.http.cookie.MalformedCookieException;

/* renamed from: o.SelectRecipientFromFavouriteAdapter$RecipientViewHolder_ViewBinding */
public final class C9821x9cfbcc54 extends BulkTransferSuccessAdapter$SuccessViewHolder_ViewBinding {
    public final int MediaBrowserCompat$ItemReceiver() {
        return 1;
    }

    public final String toString() {
        return "rfc2965";
    }

    public C9821x9cfbcc54() {
        this((String[]) null, false);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C9821x9cfbcc54(java.lang.String[] r4, boolean r5) {
        /*
            r3 = this;
            r0 = 10
            o.GiftingStatusBaseActivity[] r0 = new p040o.GiftingStatusBaseActivity[r0]
            o.DeejungInstallmentsReviewAdapter$InstallmentsSummaryViewHolder_ViewBinding r1 = new o.DeejungInstallmentsReviewAdapter$InstallmentsSummaryViewHolder_ViewBinding
            r1.<init>()
            r2 = 0
            r0[r2] = r1
            o.SelectRecipientFromFavouriteAdapter$RecipientViewHolder_ViewBinding$4 r1 = new o.SelectRecipientFromFavouriteAdapter$RecipientViewHolder_ViewBinding$4
            r1.<init>()
            r2 = 1
            r0[r2] = r1
            o.RecipientsReviewAdapter$RecipientsReviewViewHolder r1 = new o.RecipientsReviewAdapter$RecipientsReviewViewHolder
            r1.<init>()
            r2 = 2
            r0[r2] = r1
            o.DeejungInstallmentsReviewAdapter$InstallmentsHeaderViewHolder_ViewBinding r1 = new o.DeejungInstallmentsReviewAdapter$InstallmentsHeaderViewHolder_ViewBinding
            r1.<init>()
            r2 = 3
            r0[r2] = r1
            o.BankingAgentAdapter$ItemViewHolder r1 = new o.BankingAgentAdapter$ItemViewHolder
            r1.<init>()
            r2 = 4
            r0[r2] = r1
            o.SubDistrictSearchAdapter$ViewHolder_ViewBinding r1 = new o.SubDistrictSearchAdapter$ViewHolder_ViewBinding
            r1.<init>()
            r2 = 5
            r0[r2] = r1
            o.LoanViewPagerAdapter$ItemViewHolder_ViewBinding r1 = new o.LoanViewPagerAdapter$ItemViewHolder_ViewBinding
            r1.<init>()
            r2 = 6
            r0[r2] = r1
            if (r4 == 0) goto L_0x0045
            java.lang.Object r4 = r4.clone()
            java.lang.String[] r4 = (java.lang.String[]) r4
            goto L_0x0047
        L_0x0045:
            java.lang.String[] r4 = read
        L_0x0047:
            r1 = 7
            o.BankingActionAdapter$CustomViewHolder_ViewBinding r2 = new o.BankingActionAdapter$CustomViewHolder_ViewBinding
            r2.<init>(r4)
            r0[r1] = r2
            r4 = 8
            o.RecipientsAdapter$RecipientsHolder_ViewBinding r1 = new o.RecipientsAdapter$RecipientsHolder_ViewBinding
            r1.<init>()
            r0[r4] = r1
            r4 = 9
            o.RecipientsReviewAdapter$RecipientsReviewViewHolder_ViewBinding r1 = new o.RecipientsReviewAdapter$RecipientsReviewViewHolder_ViewBinding
            r1.<init>()
            r0[r4] = r1
            r3.<init>((boolean) r5, (p040o.GiftingStatusBaseActivity[]) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.C9821x9cfbcc54.<init>(java.lang.String[], boolean):void");
    }

    C9821x9cfbcc54(boolean z, GiftingStatusBaseActivity... giftingStatusBaseActivityArr) {
        super(z, giftingStatusBaseActivityArr);
    }

    public final List<SplashActivity> MediaBrowserCompat$ItemReceiver(PrepaidRequestMarketConductActivity prepaidRequestMarketConductActivity, EasyAppTermsAndConditionsActivity easyAppTermsAndConditionsActivity) throws MalformedCookieException {
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(prepaidRequestMarketConductActivity, "Header");
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(easyAppTermsAndConditionsActivity, "Cookie origin");
        if (prepaidRequestMarketConductActivity.IconCompatParcelizer().equalsIgnoreCase("Set-Cookie2")) {
            return write(prepaidRequestMarketConductActivity.MediaBrowserCompat$CustomActionResultReceiver(), write(easyAppTermsAndConditionsActivity));
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unrecognized cookie header '");
        sb.append(prepaidRequestMarketConductActivity.toString());
        sb.append("'");
        throw new MalformedCookieException(sb.toString());
    }

    /* access modifiers changed from: protected */
    public final List<SplashActivity> IconCompatParcelizer(PrepaidTravelConversionLandingActivity_ViewBinding[] prepaidTravelConversionLandingActivity_ViewBindingArr, EasyAppTermsAndConditionsActivity easyAppTermsAndConditionsActivity) throws MalformedCookieException {
        return write(prepaidTravelConversionLandingActivity_ViewBindingArr, write(easyAppTermsAndConditionsActivity));
    }

    private List<SplashActivity> write(PrepaidTravelConversionLandingActivity_ViewBinding[] prepaidTravelConversionLandingActivity_ViewBindingArr, EasyAppTermsAndConditionsActivity easyAppTermsAndConditionsActivity) throws MalformedCookieException {
        ArrayList arrayList = new ArrayList(prepaidTravelConversionLandingActivity_ViewBindingArr.length);
        for (PrepaidTravelConversionLandingActivity_ViewBinding prepaidTravelConversionLandingActivity_ViewBinding : prepaidTravelConversionLandingActivity_ViewBindingArr) {
            String read = prepaidTravelConversionLandingActivity_ViewBinding.read();
            String write = prepaidTravelConversionLandingActivity_ViewBinding.write();
            if (read == null || read.isEmpty()) {
                throw new MalformedCookieException("Cookie name may not be empty");
            }
            PrepaidViewPagerAdapter$TransactionItemViewHolder prepaidViewPagerAdapter$TransactionItemViewHolder = new PrepaidViewPagerAdapter$TransactionItemViewHolder(read, write);
            prepaidViewPagerAdapter$TransactionItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver = MediaBrowserCompat$CustomActionResultReceiver(easyAppTermsAndConditionsActivity);
            String str = easyAppTermsAndConditionsActivity.MediaBrowserCompat$CustomActionResultReceiver;
            if (str != null) {
                prepaidViewPagerAdapter$TransactionItemViewHolder.MediaBrowserCompat$ItemReceiver = str.toLowerCase(Locale.ROOT);
            } else {
                prepaidViewPagerAdapter$TransactionItemViewHolder.MediaBrowserCompat$ItemReceiver = null;
            }
            prepaidViewPagerAdapter$TransactionItemViewHolder.read = new int[]{easyAppTermsAndConditionsActivity.read};
            AddAccountsActivity[] MediaBrowserCompat$ItemReceiver = prepaidTravelConversionLandingActivity_ViewBinding.MediaBrowserCompat$ItemReceiver();
            HashMap hashMap = new HashMap(MediaBrowserCompat$ItemReceiver.length);
            for (int length = MediaBrowserCompat$ItemReceiver.length - 1; length >= 0; length--) {
                AddAccountsActivity addAccountsActivity = MediaBrowserCompat$ItemReceiver[length];
                hashMap.put(addAccountsActivity.IconCompatParcelizer().toLowerCase(Locale.ROOT), addAccountsActivity);
            }
            for (Map.Entry value : hashMap.entrySet()) {
                AddAccountsActivity addAccountsActivity2 = (AddAccountsActivity) value.getValue();
                String lowerCase = addAccountsActivity2.IconCompatParcelizer().toLowerCase(Locale.ROOT);
                prepaidViewPagerAdapter$TransactionItemViewHolder.IconCompatParcelizer.put(lowerCase, addAccountsActivity2.MediaBrowserCompat$ItemReceiver());
                JuristicEasyAppTermsAndConditionsActivity MediaBrowserCompat$CustomActionResultReceiver = MediaBrowserCompat$CustomActionResultReceiver(lowerCase);
                if (MediaBrowserCompat$CustomActionResultReceiver != null) {
                    MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver((ThirdPartyConsentFragment) prepaidViewPagerAdapter$TransactionItemViewHolder, addAccountsActivity2.MediaBrowserCompat$ItemReceiver());
                }
            }
            arrayList.add(prepaidViewPagerAdapter$TransactionItemViewHolder);
        }
        return arrayList;
    }

    public final void write(SplashActivity splashActivity, EasyAppTermsAndConditionsActivity easyAppTermsAndConditionsActivity) throws MalformedCookieException {
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(splashActivity, ServiceConstants.HEADER_COOKIE);
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(easyAppTermsAndConditionsActivity, "Cookie origin");
        super.write(splashActivity, write(easyAppTermsAndConditionsActivity));
    }

    public final boolean MediaBrowserCompat$ItemReceiver(SplashActivity splashActivity, EasyAppTermsAndConditionsActivity easyAppTermsAndConditionsActivity) {
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(splashActivity, ServiceConstants.HEADER_COOKIE);
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(easyAppTermsAndConditionsActivity, "Cookie origin");
        return super.MediaBrowserCompat$ItemReceiver(splashActivity, write(easyAppTermsAndConditionsActivity));
    }

    /* access modifiers changed from: protected */
    public final void IconCompatParcelizer(DepositTransactionAdapter$ChildViewHolder_ViewBinding depositTransactionAdapter$ChildViewHolder_ViewBinding, SplashActivity splashActivity, int i) {
        String IconCompatParcelizer;
        int[] read;
        super.IconCompatParcelizer(depositTransactionAdapter$ChildViewHolder_ViewBinding, splashActivity, i);
        if ((splashActivity instanceof GiftingStatusBaseActivity_ViewBinding) && (IconCompatParcelizer = ((GiftingStatusBaseActivity_ViewBinding) splashActivity).IconCompatParcelizer("port")) != null) {
            depositTransactionAdapter$ChildViewHolder_ViewBinding.read("; $Port");
            depositTransactionAdapter$ChildViewHolder_ViewBinding.read("=\"");
            if (!IconCompatParcelizer.trim().isEmpty() && (read = splashActivity.read()) != null) {
                int length = read.length;
                for (int i2 = 0; i2 < length; i2++) {
                    if (i2 > 0) {
                        depositTransactionAdapter$ChildViewHolder_ViewBinding.read(",");
                    }
                    depositTransactionAdapter$ChildViewHolder_ViewBinding.read(Integer.toString(read[i2]));
                }
            }
            depositTransactionAdapter$ChildViewHolder_ViewBinding.read("\"");
        }
    }

    public final PrepaidRequestMarketConductActivity MediaBrowserCompat$CustomActionResultReceiver() {
        DepositTransactionAdapter$ChildViewHolder_ViewBinding depositTransactionAdapter$ChildViewHolder_ViewBinding = new DepositTransactionAdapter$ChildViewHolder_ViewBinding(40);
        depositTransactionAdapter$ChildViewHolder_ViewBinding.read("Cookie2");
        depositTransactionAdapter$ChildViewHolder_ViewBinding.read(": ");
        depositTransactionAdapter$ChildViewHolder_ViewBinding.read("$Version=");
        depositTransactionAdapter$ChildViewHolder_ViewBinding.read(Integer.toString(1));
        return new AmountDetailsAdapter$SuccessRow(depositTransactionAdapter$ChildViewHolder_ViewBinding);
    }

    private static EasyAppTermsAndConditionsActivity write(EasyAppTermsAndConditionsActivity easyAppTermsAndConditionsActivity) {
        String str = easyAppTermsAndConditionsActivity.MediaBrowserCompat$CustomActionResultReceiver;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= str.length()) {
                z = true;
                break;
            }
            char charAt = str.charAt(i);
            if (charAt == '.' || charAt == ':') {
                break;
            }
            i++;
        }
        if (!z) {
            return easyAppTermsAndConditionsActivity;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".local");
        return new EasyAppTermsAndConditionsActivity(sb.toString(), easyAppTermsAndConditionsActivity.read, easyAppTermsAndConditionsActivity.write, easyAppTermsAndConditionsActivity.MediaBrowserCompat$ItemReceiver);
    }
}
