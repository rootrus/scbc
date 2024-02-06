package p040o;

import com.thunderhead.connectivity.transport.ServiceConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import org.apache.http.cookie.MalformedCookieException;
import p040o.BondSelectionListAdapter$BondViewHolder_ViewBinding;

@Deprecated
/* renamed from: o.BondSelectionListAdapter$BondViewHolder */
public final class BondSelectionListAdapter$BondViewHolder extends BulkTransferGroupAdapter$GroupViewHolder {
    private static final String[] MediaBrowserCompat$ItemReceiver = {"EEE, dd MMM yyyy HH:mm:ss zzz", "EEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z"};

    public final PrepaidRequestMarketConductActivity MediaBrowserCompat$CustomActionResultReceiver() {
        return null;
    }

    public final int MediaBrowserCompat$ItemReceiver() {
        return 0;
    }

    public final String toString() {
        return "compatibility";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public BondSelectionListAdapter$BondViewHolder(java.lang.String[] r4, p040o.BondSelectionListAdapter$BondViewHolder_ViewBinding.read r5) {
        /*
            r3 = this;
            r0 = 7
            o.GiftingStatusBaseActivity[] r0 = new p040o.GiftingStatusBaseActivity[r0]
            o.BankingDepositAdapter$DepositViewHolder r1 = new o.BankingDepositAdapter$DepositViewHolder
            r1.<init>()
            r2 = 0
            r0[r2] = r1
            o.BankingActionAdapter$CustomViewHolder r1 = new o.BankingActionAdapter$CustomViewHolder
            r1.<init>()
            r2 = 1
            r0[r2] = r1
            o.BondSelectionListAdapter$BondViewHolder_ViewBinding$read r1 = p040o.BondSelectionListAdapter$BondViewHolder_ViewBinding.read.SECURITYLEVEL_IE_MEDIUM
            if (r5 != r1) goto L_0x001d
            o.BondSelectionListAdapter$BondViewHolder$5 r5 = new o.BondSelectionListAdapter$BondViewHolder$5
            r5.<init>()
            goto L_0x0022
        L_0x001d:
            o.SubDistrictSearchAdapter$ViewHolder r5 = new o.SubDistrictSearchAdapter$ViewHolder
            r5.<init>()
        L_0x0022:
            r1 = 2
            r0[r1] = r5
            r5 = 3
            o.BankingAgentAdapter$ItemViewHolder r1 = new o.BankingAgentAdapter$ItemViewHolder
            r1.<init>()
            r0[r5] = r1
            r5 = 4
            o.SubDistrictSearchAdapter$ViewHolder_ViewBinding r1 = new o.SubDistrictSearchAdapter$ViewHolder_ViewBinding
            r1.<init>()
            r0[r5] = r1
            r5 = 5
            o.LoanViewPagerAdapter$ItemViewHolder_ViewBinding r1 = new o.LoanViewPagerAdapter$ItemViewHolder_ViewBinding
            r1.<init>()
            r0[r5] = r1
            if (r4 == 0) goto L_0x0046
            java.lang.Object r4 = r4.clone()
            java.lang.String[] r4 = (java.lang.String[]) r4
            goto L_0x0048
        L_0x0046:
            java.lang.String[] r4 = MediaBrowserCompat$ItemReceiver
        L_0x0048:
            r5 = 6
            o.BankingActionAdapter$CustomViewHolder_ViewBinding r1 = new o.BankingActionAdapter$CustomViewHolder_ViewBinding
            r1.<init>(r4)
            r0[r5] = r1
            r3.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.BondSelectionListAdapter$BondViewHolder.<init>(java.lang.String[], o.BondSelectionListAdapter$BondViewHolder_ViewBinding$read):void");
    }

    public BondSelectionListAdapter$BondViewHolder() {
        this((String[]) null, BondSelectionListAdapter$BondViewHolder_ViewBinding.read.SECURITYLEVEL_DEFAULT);
    }

    public final List<SplashActivity> MediaBrowserCompat$ItemReceiver(PrepaidRequestMarketConductActivity prepaidRequestMarketConductActivity, EasyAppTermsAndConditionsActivity easyAppTermsAndConditionsActivity) throws MalformedCookieException {
        RadioButtonGroupAdapter$RadioButtonViewGroup radioButtonGroupAdapter$RadioButtonViewGroup;
        DepositTransactionAdapter$ChildViewHolder_ViewBinding depositTransactionAdapter$ChildViewHolder_ViewBinding;
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(prepaidRequestMarketConductActivity, "Header");
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(easyAppTermsAndConditionsActivity, "Cookie origin");
        if (prepaidRequestMarketConductActivity.IconCompatParcelizer().equalsIgnoreCase("Set-Cookie")) {
            PrepaidTravelConversionLandingActivity_ViewBinding[] MediaBrowserCompat$CustomActionResultReceiver = prepaidRequestMarketConductActivity.MediaBrowserCompat$CustomActionResultReceiver();
            boolean z = false;
            boolean z2 = false;
            for (PrepaidTravelConversionLandingActivity_ViewBinding prepaidTravelConversionLandingActivity_ViewBinding : MediaBrowserCompat$CustomActionResultReceiver) {
                if (prepaidTravelConversionLandingActivity_ViewBinding.IconCompatParcelizer("version") != null) {
                    z2 = true;
                }
                if (prepaidTravelConversionLandingActivity_ViewBinding.IconCompatParcelizer("expires") != null) {
                    z = true;
                }
            }
            if (!z && z2) {
                return IconCompatParcelizer(MediaBrowserCompat$CustomActionResultReceiver, easyAppTermsAndConditionsActivity);
            }
            C9669x39e729da bulkTransferSummaryScreenshotAdapter$SummaryScreenshotViewHolder_ViewBinding = C9669x39e729da.MediaBrowserCompat$ItemReceiver;
            if (prepaidRequestMarketConductActivity instanceof PrepaidRequestLandingActivity) {
                PrepaidRequestLandingActivity prepaidRequestLandingActivity = (PrepaidRequestLandingActivity) prepaidRequestMarketConductActivity;
                depositTransactionAdapter$ChildViewHolder_ViewBinding = prepaidRequestLandingActivity.read();
                radioButtonGroupAdapter$RadioButtonViewGroup = new RadioButtonGroupAdapter$RadioButtonViewGroup(prepaidRequestLandingActivity.write(), depositTransactionAdapter$ChildViewHolder_ViewBinding.length());
            } else {
                String MediaBrowserCompat$ItemReceiver2 = prepaidRequestMarketConductActivity.MediaBrowserCompat$ItemReceiver();
                if (MediaBrowserCompat$ItemReceiver2 != null) {
                    depositTransactionAdapter$ChildViewHolder_ViewBinding = new DepositTransactionAdapter$ChildViewHolder_ViewBinding(MediaBrowserCompat$ItemReceiver2.length());
                    depositTransactionAdapter$ChildViewHolder_ViewBinding.read(MediaBrowserCompat$ItemReceiver2);
                    radioButtonGroupAdapter$RadioButtonViewGroup = new RadioButtonGroupAdapter$RadioButtonViewGroup(0, depositTransactionAdapter$ChildViewHolder_ViewBinding.length());
                } else {
                    throw new MalformedCookieException("Header value is null");
                }
            }
            PrepaidTravelConversionLandingActivity_ViewBinding MediaBrowserCompat$ItemReceiver3 = bulkTransferSummaryScreenshotAdapter$SummaryScreenshotViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver(depositTransactionAdapter$ChildViewHolder_ViewBinding, radioButtonGroupAdapter$RadioButtonViewGroup);
            String read = MediaBrowserCompat$ItemReceiver3.read();
            String write = MediaBrowserCompat$ItemReceiver3.write();
            if (read == null || read.isEmpty()) {
                throw new MalformedCookieException("Cookie name may not be empty");
            }
            MerchantWalletViewPagerAdapter$ItemViewHolder merchantWalletViewPagerAdapter$ItemViewHolder = new MerchantWalletViewPagerAdapter$ItemViewHolder(read, write);
            merchantWalletViewPagerAdapter$ItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver = MediaBrowserCompat$CustomActionResultReceiver(easyAppTermsAndConditionsActivity);
            String str = easyAppTermsAndConditionsActivity.MediaBrowserCompat$CustomActionResultReceiver;
            if (str != null) {
                merchantWalletViewPagerAdapter$ItemViewHolder.MediaBrowserCompat$ItemReceiver = str.toLowerCase(Locale.ROOT);
            } else {
                merchantWalletViewPagerAdapter$ItemViewHolder.MediaBrowserCompat$ItemReceiver = null;
            }
            AddAccountsActivity[] MediaBrowserCompat$ItemReceiver4 = MediaBrowserCompat$ItemReceiver3.MediaBrowserCompat$ItemReceiver();
            for (int length = MediaBrowserCompat$ItemReceiver4.length - 1; length >= 0; length--) {
                AddAccountsActivity addAccountsActivity = MediaBrowserCompat$ItemReceiver4[length];
                String lowerCase = addAccountsActivity.IconCompatParcelizer().toLowerCase(Locale.ROOT);
                merchantWalletViewPagerAdapter$ItemViewHolder.IconCompatParcelizer.put(lowerCase, addAccountsActivity.MediaBrowserCompat$ItemReceiver());
                JuristicEasyAppTermsAndConditionsActivity MediaBrowserCompat$CustomActionResultReceiver2 = MediaBrowserCompat$CustomActionResultReceiver(lowerCase);
                if (MediaBrowserCompat$CustomActionResultReceiver2 != null) {
                    MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$ItemReceiver((ThirdPartyConsentFragment) merchantWalletViewPagerAdapter$ItemViewHolder, addAccountsActivity.MediaBrowserCompat$ItemReceiver());
                }
            }
            if (z) {
                merchantWalletViewPagerAdapter$ItemViewHolder.write = 0;
            }
            return Collections.singletonList(merchantWalletViewPagerAdapter$ItemViewHolder);
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
        int i = 0;
        while (true) {
            boolean z = true;
            if (i < list.size()) {
                SplashActivity splashActivity = list.get(i);
                if (i > 0) {
                    depositTransactionAdapter$ChildViewHolder_ViewBinding.read("; ");
                }
                String MediaBrowserCompat$ItemReceiver2 = splashActivity.MediaBrowserCompat$ItemReceiver();
                String MediaDescriptionCompat = splashActivity.MediaDescriptionCompat();
                if (splashActivity.RatingCompat() > 0) {
                    if (MediaDescriptionCompat == null || !MediaDescriptionCompat.startsWith("\"") || !MediaDescriptionCompat.endsWith("\"")) {
                        z = false;
                    }
                    if (!z) {
                        ProductListAdapter$ProductViewHolder productListAdapter$ProductViewHolder = ProductListAdapter$ProductViewHolder.MediaBrowserCompat$CustomActionResultReceiver;
                        ManageChequeAdapter$ManageChequeHolder manageChequeAdapter$ManageChequeHolder = new ManageChequeAdapter$ManageChequeHolder(MediaBrowserCompat$ItemReceiver2, MediaDescriptionCompat);
                        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(manageChequeAdapter$ManageChequeHolder, "Header element");
                        int length = manageChequeAdapter$ManageChequeHolder.read().length();
                        String write = manageChequeAdapter$ManageChequeHolder.write();
                        if (write != null) {
                            length += write.length() + 3;
                        }
                        int IconCompatParcelizer = manageChequeAdapter$ManageChequeHolder.IconCompatParcelizer();
                        if (IconCompatParcelizer > 0) {
                            for (int i2 = 0; i2 < IconCompatParcelizer; i2++) {
                                length += ProductListAdapter$ProductViewHolder.read(manageChequeAdapter$ManageChequeHolder.read(i2)) + 2;
                            }
                        }
                        if (length > 0) {
                            int length2 = depositTransactionAdapter$ChildViewHolder_ViewBinding.write.length;
                            int i3 = depositTransactionAdapter$ChildViewHolder_ViewBinding.IconCompatParcelizer;
                            if (length > length2 - i3) {
                                depositTransactionAdapter$ChildViewHolder_ViewBinding.IconCompatParcelizer(i3 + length);
                            }
                        }
                        depositTransactionAdapter$ChildViewHolder_ViewBinding.read(manageChequeAdapter$ManageChequeHolder.read());
                        String write2 = manageChequeAdapter$ManageChequeHolder.write();
                        if (write2 != null) {
                            depositTransactionAdapter$ChildViewHolder_ViewBinding.read('=');
                            ProductListAdapter$ProductViewHolder.MediaBrowserCompat$CustomActionResultReceiver(depositTransactionAdapter$ChildViewHolder_ViewBinding, write2, false);
                        }
                        int IconCompatParcelizer2 = manageChequeAdapter$ManageChequeHolder.IconCompatParcelizer();
                        if (IconCompatParcelizer2 > 0) {
                            for (int i4 = 0; i4 < IconCompatParcelizer2; i4++) {
                                depositTransactionAdapter$ChildViewHolder_ViewBinding.read("; ");
                                productListAdapter$ProductViewHolder.write(depositTransactionAdapter$ChildViewHolder_ViewBinding, manageChequeAdapter$ManageChequeHolder.read(i4), false);
                            }
                        }
                        i++;
                    }
                }
                depositTransactionAdapter$ChildViewHolder_ViewBinding.read(MediaBrowserCompat$ItemReceiver2);
                depositTransactionAdapter$ChildViewHolder_ViewBinding.read("=");
                if (MediaDescriptionCompat != null) {
                    depositTransactionAdapter$ChildViewHolder_ViewBinding.read(MediaDescriptionCompat);
                }
                i++;
            } else {
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(new AmountDetailsAdapter$SuccessRow(depositTransactionAdapter$ChildViewHolder_ViewBinding));
                return arrayList;
            }
        }
    }
}
