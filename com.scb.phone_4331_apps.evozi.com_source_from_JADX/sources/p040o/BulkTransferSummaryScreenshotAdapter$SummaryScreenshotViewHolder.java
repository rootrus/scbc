package p040o;

import com.thunderhead.connectivity.transport.ServiceConstants;
import java.util.Locale;
import org.apache.http.cookie.CookieRestrictionViolationException;
import org.apache.http.cookie.MalformedCookieException;

/* renamed from: o.BulkTransferSummaryScreenshotAdapter$SummaryScreenshotViewHolder */
public final class BulkTransferSummaryScreenshotAdapter$SummaryScreenshotViewHolder implements GiftingStatusBaseActivity {
    public final String read() {
        return "domain";
    }

    public final void MediaBrowserCompat$ItemReceiver(ThirdPartyConsentFragment thirdPartyConsentFragment, String str) throws MalformedCookieException {
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(thirdPartyConsentFragment, ServiceConstants.HEADER_COOKIE);
        if (str == null) {
            throw new MalformedCookieException("Missing value for domain attribute");
        } else if (!str.trim().isEmpty()) {
            thirdPartyConsentFragment.MediaBrowserCompat$CustomActionResultReceiver(str);
        } else {
            throw new MalformedCookieException("Blank value for domain attribute");
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(SplashActivity splashActivity, EasyAppTermsAndConditionsActivity easyAppTermsAndConditionsActivity) throws MalformedCookieException {
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(splashActivity, ServiceConstants.HEADER_COOKIE);
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(easyAppTermsAndConditionsActivity, "Cookie origin");
        String str = easyAppTermsAndConditionsActivity.MediaBrowserCompat$CustomActionResultReceiver;
        String MediaBrowserCompat$CustomActionResultReceiver = splashActivity.MediaBrowserCompat$CustomActionResultReceiver();
        if (MediaBrowserCompat$CustomActionResultReceiver == null) {
            throw new CookieRestrictionViolationException("Cookie domain may not be null");
        } else if (MediaBrowserCompat$CustomActionResultReceiver.equals(str)) {
        } else {
            if (MediaBrowserCompat$CustomActionResultReceiver.indexOf(46) == -1) {
                StringBuilder sb = new StringBuilder();
                sb.append("Domain attribute \"");
                sb.append(MediaBrowserCompat$CustomActionResultReceiver);
                sb.append("\" does not match the host \"");
                sb.append(str);
                sb.append("\"");
                throw new CookieRestrictionViolationException(sb.toString());
            } else if (MediaBrowserCompat$CustomActionResultReceiver.startsWith(".")) {
                int indexOf = MediaBrowserCompat$CustomActionResultReceiver.indexOf(46, 1);
                if (indexOf < 0 || indexOf == MediaBrowserCompat$CustomActionResultReceiver.length() - 1) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Domain attribute \"");
                    sb2.append(MediaBrowserCompat$CustomActionResultReceiver);
                    sb2.append("\" violates RFC 2109: domain must contain an embedded dot");
                    throw new CookieRestrictionViolationException(sb2.toString());
                }
                String lowerCase = str.toLowerCase(Locale.ROOT);
                if (!lowerCase.endsWith(MediaBrowserCompat$CustomActionResultReceiver)) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Illegal domain attribute \"");
                    sb3.append(MediaBrowserCompat$CustomActionResultReceiver);
                    sb3.append("\". Domain of origin: \"");
                    sb3.append(lowerCase);
                    sb3.append("\"");
                    throw new CookieRestrictionViolationException(sb3.toString());
                } else if (lowerCase.substring(0, lowerCase.length() - MediaBrowserCompat$CustomActionResultReceiver.length()).indexOf(46) != -1) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("Domain attribute \"");
                    sb4.append(MediaBrowserCompat$CustomActionResultReceiver);
                    sb4.append("\" violates RFC 2109: host minus domain may not contain any dots");
                    throw new CookieRestrictionViolationException(sb4.toString());
                }
            } else {
                StringBuilder sb5 = new StringBuilder();
                sb5.append("Domain attribute \"");
                sb5.append(MediaBrowserCompat$CustomActionResultReceiver);
                sb5.append("\" violates RFC 2109: domain must start with a dot");
                throw new CookieRestrictionViolationException(sb5.toString());
            }
        }
    }

    public final boolean IconCompatParcelizer(SplashActivity splashActivity, EasyAppTermsAndConditionsActivity easyAppTermsAndConditionsActivity) {
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(splashActivity, ServiceConstants.HEADER_COOKIE);
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(easyAppTermsAndConditionsActivity, "Cookie origin");
        String str = easyAppTermsAndConditionsActivity.MediaBrowserCompat$CustomActionResultReceiver;
        String MediaBrowserCompat$CustomActionResultReceiver = splashActivity.MediaBrowserCompat$CustomActionResultReceiver();
        if (MediaBrowserCompat$CustomActionResultReceiver == null) {
            return false;
        }
        if (str.equals(MediaBrowserCompat$CustomActionResultReceiver) || (MediaBrowserCompat$CustomActionResultReceiver.startsWith(".") && str.endsWith(MediaBrowserCompat$CustomActionResultReceiver))) {
            return true;
        }
        return false;
    }
}
