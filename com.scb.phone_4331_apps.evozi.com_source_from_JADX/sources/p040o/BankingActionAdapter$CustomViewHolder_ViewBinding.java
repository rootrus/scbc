package p040o;

import com.thunderhead.connectivity.transport.ServiceConstants;
import java.util.Date;
import org.apache.http.cookie.MalformedCookieException;

/* renamed from: o.BankingActionAdapter$CustomViewHolder_ViewBinding */
public final class BankingActionAdapter$CustomViewHolder_ViewBinding extends MerchantWalletViewPagerAdapter$ItemViewHolder_ViewBinding implements GiftingStatusBaseActivity {
    private final String[] write;

    public final String read() {
        return "expires";
    }

    public BankingActionAdapter$CustomViewHolder_ViewBinding(String[] strArr) {
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(strArr, "Array of date patterns");
        this.write = strArr;
    }

    public final void MediaBrowserCompat$ItemReceiver(ThirdPartyConsentFragment thirdPartyConsentFragment, String str) throws MalformedCookieException {
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(thirdPartyConsentFragment, ServiceConstants.HEADER_COOKIE);
        if (str != null) {
            Date write2 = RemittanceTermsAndConsActivity.write(str, this.write);
            if (write2 != null) {
                thirdPartyConsentFragment.write(write2);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid 'expires' attribute: ");
            sb.append(str);
            throw new MalformedCookieException(sb.toString());
        }
        throw new MalformedCookieException("Missing value for 'expires' attribute");
    }
}
