package p040o;

import com.google.android.gms.common.api.Api;
import com.thunderhead.connectivity.transport.ServiceConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.http.cookie.CookieRestrictionViolationException;
import org.apache.http.cookie.MalformedCookieException;

/* renamed from: o.BulkTransferSuccessAdapter$SuccessViewHolder_ViewBinding */
public class BulkTransferSuccessAdapter$SuccessViewHolder_ViewBinding extends BulkTransferGroupAdapter$GroupViewHolder {
    static final String[] read = {"EEE, dd MMM yyyy HH:mm:ss zzz", "EEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy"};
    private final boolean write;

    public PrepaidRequestMarketConductActivity MediaBrowserCompat$CustomActionResultReceiver() {
        return null;
    }

    public int MediaBrowserCompat$ItemReceiver() {
        return 1;
    }

    public String toString() {
        return "rfc2109";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public BulkTransferSuccessAdapter$SuccessViewHolder_ViewBinding(java.lang.String[] r4, boolean r5) {
        /*
            r3 = this;
            r0 = 7
            o.GiftingStatusBaseActivity[] r0 = new p040o.GiftingStatusBaseActivity[r0]
            o.SelectRecipientFromFavouriteAdapter$RecipientViewHolder r1 = new o.SelectRecipientFromFavouriteAdapter$RecipientViewHolder
            r1.<init>()
            r2 = 0
            r0[r2] = r1
            o.BulkTransferSuccessAdapter$SuccessViewHolder_ViewBinding$2 r1 = new o.BulkTransferSuccessAdapter$SuccessViewHolder_ViewBinding$2
            r1.<init>()
            r2 = 1
            r0[r2] = r1
            o.BulkTransferSummaryScreenshotAdapter$SummaryScreenshotViewHolder r1 = new o.BulkTransferSummaryScreenshotAdapter$SummaryScreenshotViewHolder
            r1.<init>()
            r2 = 2
            r0[r2] = r1
            o.BankingAgentAdapter$ItemViewHolder r1 = new o.BankingAgentAdapter$ItemViewHolder
            r1.<init>()
            r2 = 3
            r0[r2] = r1
            o.SubDistrictSearchAdapter$ViewHolder_ViewBinding r1 = new o.SubDistrictSearchAdapter$ViewHolder_ViewBinding
            r1.<init>()
            r2 = 4
            r0[r2] = r1
            o.LoanViewPagerAdapter$ItemViewHolder_ViewBinding r1 = new o.LoanViewPagerAdapter$ItemViewHolder_ViewBinding
            r1.<init>()
            r2 = 5
            r0[r2] = r1
            if (r4 == 0) goto L_0x003c
            java.lang.Object r4 = r4.clone()
            java.lang.String[] r4 = (java.lang.String[]) r4
            goto L_0x003e
        L_0x003c:
            java.lang.String[] r4 = read
        L_0x003e:
            r1 = 6
            o.BankingActionAdapter$CustomViewHolder_ViewBinding r2 = new o.BankingActionAdapter$CustomViewHolder_ViewBinding
            r2.<init>(r4)
            r0[r1] = r2
            r3.<init>(r0)
            r3.write = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.BulkTransferSuccessAdapter$SuccessViewHolder_ViewBinding.<init>(java.lang.String[], boolean):void");
    }

    public BulkTransferSuccessAdapter$SuccessViewHolder_ViewBinding() {
        this((String[]) null, false);
    }

    protected BulkTransferSuccessAdapter$SuccessViewHolder_ViewBinding(boolean z, GiftingStatusBaseActivity... giftingStatusBaseActivityArr) {
        super(giftingStatusBaseActivityArr);
        this.write = z;
    }

    public List<SplashActivity> MediaBrowserCompat$ItemReceiver(PrepaidRequestMarketConductActivity prepaidRequestMarketConductActivity, EasyAppTermsAndConditionsActivity easyAppTermsAndConditionsActivity) throws MalformedCookieException {
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(prepaidRequestMarketConductActivity, "Header");
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(easyAppTermsAndConditionsActivity, "Cookie origin");
        if (prepaidRequestMarketConductActivity.IconCompatParcelizer().equalsIgnoreCase("Set-Cookie")) {
            return IconCompatParcelizer(prepaidRequestMarketConductActivity.MediaBrowserCompat$CustomActionResultReceiver(), easyAppTermsAndConditionsActivity);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unrecognized cookie header '");
        sb.append(prepaidRequestMarketConductActivity.toString());
        sb.append("'");
        throw new MalformedCookieException(sb.toString());
    }

    public void write(SplashActivity splashActivity, EasyAppTermsAndConditionsActivity easyAppTermsAndConditionsActivity) throws MalformedCookieException {
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(splashActivity, ServiceConstants.HEADER_COOKIE);
        String MediaBrowserCompat$ItemReceiver = splashActivity.MediaBrowserCompat$ItemReceiver();
        if (MediaBrowserCompat$ItemReceiver.indexOf(32) != -1) {
            throw new CookieRestrictionViolationException("Cookie name may not contain blanks");
        } else if (!MediaBrowserCompat$ItemReceiver.startsWith("$")) {
            super.write(splashActivity, easyAppTermsAndConditionsActivity);
        } else {
            throw new CookieRestrictionViolationException("Cookie name may not start with $");
        }
    }

    public final List<PrepaidRequestMarketConductActivity> write(List<SplashActivity> list) {
        DepositTransactionAdapter$GroupItemViewHolder.read(list, "List of cookies");
        if (list.size() > 1) {
            ArrayList arrayList = new ArrayList(list);
            Collections.sort(arrayList, MutualFundTermsAndConditionsActivity.write);
            list = arrayList;
        }
        return this.write ? MediaBrowserCompat$ItemReceiver(list) : MediaBrowserCompat$CustomActionResultReceiver(list);
    }

    private List<PrepaidRequestMarketConductActivity> MediaBrowserCompat$ItemReceiver(List<SplashActivity> list) {
        int i = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        for (SplashActivity next : list) {
            if (next.RatingCompat() < i) {
                i = next.RatingCompat();
            }
        }
        DepositTransactionAdapter$ChildViewHolder_ViewBinding depositTransactionAdapter$ChildViewHolder_ViewBinding = new DepositTransactionAdapter$ChildViewHolder_ViewBinding(list.size() * 40);
        depositTransactionAdapter$ChildViewHolder_ViewBinding.read(ServiceConstants.HEADER_COOKIE);
        depositTransactionAdapter$ChildViewHolder_ViewBinding.read(": ");
        depositTransactionAdapter$ChildViewHolder_ViewBinding.read("$Version=");
        depositTransactionAdapter$ChildViewHolder_ViewBinding.read(Integer.toString(i));
        for (SplashActivity IconCompatParcelizer : list) {
            depositTransactionAdapter$ChildViewHolder_ViewBinding.read("; ");
            IconCompatParcelizer(depositTransactionAdapter$ChildViewHolder_ViewBinding, IconCompatParcelizer, i);
        }
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new AmountDetailsAdapter$SuccessRow(depositTransactionAdapter$ChildViewHolder_ViewBinding));
        return arrayList;
    }

    private List<PrepaidRequestMarketConductActivity> MediaBrowserCompat$CustomActionResultReceiver(List<SplashActivity> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (SplashActivity next : list) {
            int RatingCompat = next.RatingCompat();
            DepositTransactionAdapter$ChildViewHolder_ViewBinding depositTransactionAdapter$ChildViewHolder_ViewBinding = new DepositTransactionAdapter$ChildViewHolder_ViewBinding(40);
            depositTransactionAdapter$ChildViewHolder_ViewBinding.read("Cookie: ");
            depositTransactionAdapter$ChildViewHolder_ViewBinding.read("$Version=");
            depositTransactionAdapter$ChildViewHolder_ViewBinding.read(Integer.toString(RatingCompat));
            depositTransactionAdapter$ChildViewHolder_ViewBinding.read("; ");
            IconCompatParcelizer(depositTransactionAdapter$ChildViewHolder_ViewBinding, next, RatingCompat);
            arrayList.add(new AmountDetailsAdapter$SuccessRow(depositTransactionAdapter$ChildViewHolder_ViewBinding));
        }
        return arrayList;
    }

    private static void MediaBrowserCompat$ItemReceiver(DepositTransactionAdapter$ChildViewHolder_ViewBinding depositTransactionAdapter$ChildViewHolder_ViewBinding, String str, String str2, int i) {
        depositTransactionAdapter$ChildViewHolder_ViewBinding.read(str);
        depositTransactionAdapter$ChildViewHolder_ViewBinding.read("=");
        if (str2 == null) {
            return;
        }
        if (i > 0) {
            depositTransactionAdapter$ChildViewHolder_ViewBinding.read('\"');
            depositTransactionAdapter$ChildViewHolder_ViewBinding.read(str2);
            depositTransactionAdapter$ChildViewHolder_ViewBinding.read('\"');
            return;
        }
        depositTransactionAdapter$ChildViewHolder_ViewBinding.read(str2);
    }

    /* access modifiers changed from: protected */
    public void IconCompatParcelizer(DepositTransactionAdapter$ChildViewHolder_ViewBinding depositTransactionAdapter$ChildViewHolder_ViewBinding, SplashActivity splashActivity, int i) {
        MediaBrowserCompat$ItemReceiver(depositTransactionAdapter$ChildViewHolder_ViewBinding, splashActivity.MediaBrowserCompat$ItemReceiver(), splashActivity.MediaDescriptionCompat(), i);
        if (splashActivity.IconCompatParcelizer() != null && (splashActivity instanceof GiftingStatusBaseActivity_ViewBinding) && ((GiftingStatusBaseActivity_ViewBinding) splashActivity).read("path")) {
            depositTransactionAdapter$ChildViewHolder_ViewBinding.read("; ");
            MediaBrowserCompat$ItemReceiver(depositTransactionAdapter$ChildViewHolder_ViewBinding, "$Path", splashActivity.IconCompatParcelizer(), i);
        }
        if (splashActivity.MediaBrowserCompat$CustomActionResultReceiver() != null && (splashActivity instanceof GiftingStatusBaseActivity_ViewBinding) && ((GiftingStatusBaseActivity_ViewBinding) splashActivity).read("domain")) {
            depositTransactionAdapter$ChildViewHolder_ViewBinding.read("; ");
            MediaBrowserCompat$ItemReceiver(depositTransactionAdapter$ChildViewHolder_ViewBinding, "$Domain", splashActivity.MediaBrowserCompat$CustomActionResultReceiver(), i);
        }
    }
}
