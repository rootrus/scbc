package p040o;

import com.thunderhead.connectivity.transport.ServiceConstants;
import java.util.StringTokenizer;
import org.apache.http.cookie.CookieRestrictionViolationException;
import org.apache.http.cookie.MalformedCookieException;

/* renamed from: o.DeejungInstallmentsReviewAdapter$InstallmentsHeaderViewHolder_ViewBinding */
public final class C9705xb11267e8 implements GiftingStatusBaseActivity {
    public final String read() {
        return "port";
    }

    private static int[] read(String str) throws MalformedCookieException {
        StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
        int[] iArr = new int[stringTokenizer.countTokens()];
        int i = 0;
        while (stringTokenizer.hasMoreTokens()) {
            try {
                iArr[i] = Integer.parseInt(stringTokenizer.nextToken().trim());
                if (iArr[i] >= 0) {
                    i++;
                } else {
                    throw new MalformedCookieException("Invalid Port attribute.");
                }
            } catch (NumberFormatException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Invalid Port attribute: ");
                sb.append(e.getMessage());
                throw new MalformedCookieException(sb.toString());
            }
        }
        return iArr;
    }

    private static boolean write(int i, int[] iArr) {
        for (int i2 : iArr) {
            if (i == i2) {
                return true;
            }
        }
        return false;
    }

    public final void MediaBrowserCompat$ItemReceiver(ThirdPartyConsentFragment thirdPartyConsentFragment, String str) throws MalformedCookieException {
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(thirdPartyConsentFragment, ServiceConstants.HEADER_COOKIE);
        if (thirdPartyConsentFragment instanceof EDonationConsentActivity) {
            EDonationConsentActivity eDonationConsentActivity = (EDonationConsentActivity) thirdPartyConsentFragment;
            if (str != null && !str.trim().isEmpty()) {
                eDonationConsentActivity.MediaBrowserCompat$CustomActionResultReceiver(read(str));
            }
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(SplashActivity splashActivity, EasyAppTermsAndConditionsActivity easyAppTermsAndConditionsActivity) throws MalformedCookieException {
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(splashActivity, ServiceConstants.HEADER_COOKIE);
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(easyAppTermsAndConditionsActivity, "Cookie origin");
        int i = easyAppTermsAndConditionsActivity.read;
        if ((splashActivity instanceof GiftingStatusBaseActivity_ViewBinding) && ((GiftingStatusBaseActivity_ViewBinding) splashActivity).read("port") && !write(i, splashActivity.read())) {
            throw new CookieRestrictionViolationException("Port attribute violates RFC 2965: Request port not found in cookie's port list.");
        }
    }

    public final boolean IconCompatParcelizer(SplashActivity splashActivity, EasyAppTermsAndConditionsActivity easyAppTermsAndConditionsActivity) {
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(splashActivity, ServiceConstants.HEADER_COOKIE);
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(easyAppTermsAndConditionsActivity, "Cookie origin");
        int i = easyAppTermsAndConditionsActivity.read;
        if (!(splashActivity instanceof GiftingStatusBaseActivity_ViewBinding) || !((GiftingStatusBaseActivity_ViewBinding) splashActivity).read("port")) {
            return true;
        }
        if (splashActivity.read() != null && write(i, splashActivity.read())) {
            return true;
        }
        return false;
    }
}
