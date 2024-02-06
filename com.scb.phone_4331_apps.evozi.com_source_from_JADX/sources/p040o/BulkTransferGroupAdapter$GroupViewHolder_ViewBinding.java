package p040o;

import com.thunderhead.connectivity.transport.ServiceConstants;
import java.util.Locale;
import java.util.StringTokenizer;
import org.apache.http.cookie.CookieRestrictionViolationException;
import org.apache.http.cookie.MalformedCookieException;

/* renamed from: o.BulkTransferGroupAdapter$GroupViewHolder_ViewBinding */
public final class BulkTransferGroupAdapter$GroupViewHolder_ViewBinding extends BankingActionAdapter$CustomViewHolder {
    public final String read() {
        return "domain";
    }

    public final void MediaBrowserCompat$ItemReceiver(ThirdPartyConsentFragment thirdPartyConsentFragment, String str) throws MalformedCookieException {
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(thirdPartyConsentFragment, ServiceConstants.HEADER_COOKIE);
        if (!FatcaQuestionnaireAdapter$ViewHolder.read(str)) {
            thirdPartyConsentFragment.MediaBrowserCompat$CustomActionResultReceiver(str);
            return;
        }
        throw new MalformedCookieException("Blank or null value for domain attribute");
    }

    public final boolean IconCompatParcelizer(SplashActivity splashActivity, EasyAppTermsAndConditionsActivity easyAppTermsAndConditionsActivity) {
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(splashActivity, ServiceConstants.HEADER_COOKIE);
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(easyAppTermsAndConditionsActivity, "Cookie origin");
        String str = easyAppTermsAndConditionsActivity.MediaBrowserCompat$CustomActionResultReceiver;
        String MediaBrowserCompat$CustomActionResultReceiver = splashActivity.MediaBrowserCompat$CustomActionResultReceiver();
        if (MediaBrowserCompat$CustomActionResultReceiver == null) {
            return false;
        }
        return str.endsWith(MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final void MediaBrowserCompat$ItemReceiver(SplashActivity splashActivity, EasyAppTermsAndConditionsActivity easyAppTermsAndConditionsActivity) throws MalformedCookieException {
        String str = easyAppTermsAndConditionsActivity.MediaBrowserCompat$CustomActionResultReceiver;
        String MediaBrowserCompat$CustomActionResultReceiver = splashActivity.MediaBrowserCompat$CustomActionResultReceiver();
        if (!str.equals(MediaBrowserCompat$CustomActionResultReceiver) && !BankingActionAdapter$CustomViewHolder.MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$CustomActionResultReceiver, str)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Illegal domain attribute \"");
            sb.append(MediaBrowserCompat$CustomActionResultReceiver);
            sb.append("\". Domain of origin: \"");
            sb.append(str);
            sb.append("\"");
            throw new CookieRestrictionViolationException(sb.toString());
        } else if (str.contains(".")) {
            int countTokens = new StringTokenizer(MediaBrowserCompat$CustomActionResultReceiver, ".").countTokens();
            String upperCase = MediaBrowserCompat$CustomActionResultReceiver.toUpperCase(Locale.ROOT);
            if (upperCase.endsWith(".COM") || upperCase.endsWith(".EDU") || upperCase.endsWith(".NET") || upperCase.endsWith(".GOV") || upperCase.endsWith(".MIL") || upperCase.endsWith(".ORG") || upperCase.endsWith(".INT")) {
                if (countTokens < 2) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Domain attribute \"");
                    sb2.append(MediaBrowserCompat$CustomActionResultReceiver);
                    sb2.append("\" violates the Netscape cookie specification for ");
                    sb2.append("special domains");
                    throw new CookieRestrictionViolationException(sb2.toString());
                }
            } else if (countTokens < 3) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Domain attribute \"");
                sb3.append(MediaBrowserCompat$CustomActionResultReceiver);
                sb3.append("\" violates the Netscape cookie specification");
                throw new CookieRestrictionViolationException(sb3.toString());
            }
        }
    }
}
