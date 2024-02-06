package p040o;

import com.thunderhead.connectivity.transport.ServiceConstants;
import org.apache.http.cookie.CookieRestrictionViolationException;
import org.apache.http.cookie.MalformedCookieException;

/* renamed from: o.DeejungInstallmentsReviewAdapter$InstallmentsSummaryViewHolder_ViewBinding */
public final class C9706xbda6364f implements GiftingStatusBaseActivity {
    public final boolean IconCompatParcelizer(SplashActivity splashActivity, EasyAppTermsAndConditionsActivity easyAppTermsAndConditionsActivity) {
        return true;
    }

    public final String read() {
        return "version";
    }

    public final void MediaBrowserCompat$ItemReceiver(ThirdPartyConsentFragment thirdPartyConsentFragment, String str) throws MalformedCookieException {
        int i;
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(thirdPartyConsentFragment, ServiceConstants.HEADER_COOKIE);
        if (str != null) {
            try {
                i = Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                i = -1;
            }
            if (i >= 0) {
                thirdPartyConsentFragment.write(i);
                return;
            }
            throw new MalformedCookieException("Invalid cookie version.");
        }
        throw new MalformedCookieException("Missing value for version attribute");
    }

    public final void MediaBrowserCompat$ItemReceiver(SplashActivity splashActivity, EasyAppTermsAndConditionsActivity easyAppTermsAndConditionsActivity) throws MalformedCookieException {
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(splashActivity, ServiceConstants.HEADER_COOKIE);
        if ((splashActivity instanceof EDonationConsentActivity) && (splashActivity instanceof GiftingStatusBaseActivity_ViewBinding) && !((GiftingStatusBaseActivity_ViewBinding) splashActivity).read("version")) {
            throw new CookieRestrictionViolationException("Violates RFC 2965. Version attribute is required.");
        }
    }
}
