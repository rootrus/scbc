package p040o;

import com.thunderhead.connectivity.transport.ServiceConstants;
import java.util.Locale;
import org.apache.http.cookie.CookieRestrictionViolationException;
import org.apache.http.cookie.MalformedCookieException;

/* renamed from: o.RecipientsReviewAdapter$RecipientsReviewViewHolder */
public final class RecipientsReviewAdapter$RecipientsReviewViewHolder implements GiftingStatusBaseActivity {
    public final String read() {
        return "domain";
    }

    public final void MediaBrowserCompat$ItemReceiver(ThirdPartyConsentFragment thirdPartyConsentFragment, String str) throws MalformedCookieException {
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(thirdPartyConsentFragment, ServiceConstants.HEADER_COOKIE);
        if (str == null) {
            throw new MalformedCookieException("Missing value for domain attribute");
        } else if (!str.trim().isEmpty()) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            if (!str.startsWith(".")) {
                StringBuilder sb = new StringBuilder();
                sb.append('.');
                sb.append(lowerCase);
                lowerCase = sb.toString();
            }
            thirdPartyConsentFragment.MediaBrowserCompat$CustomActionResultReceiver(lowerCase);
        } else {
            throw new MalformedCookieException("Blank value for domain attribute");
        }
    }

    private static boolean MediaBrowserCompat$CustomActionResultReceiver(String str, String str2) {
        return str.equals(str2) || (str2.startsWith(".") && str.endsWith(str2));
    }

    public final void MediaBrowserCompat$ItemReceiver(SplashActivity splashActivity, EasyAppTermsAndConditionsActivity easyAppTermsAndConditionsActivity) throws MalformedCookieException {
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(splashActivity, ServiceConstants.HEADER_COOKIE);
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(easyAppTermsAndConditionsActivity, "Cookie origin");
        String lowerCase = easyAppTermsAndConditionsActivity.MediaBrowserCompat$CustomActionResultReceiver.toLowerCase(Locale.ROOT);
        if (splashActivity.MediaBrowserCompat$CustomActionResultReceiver() != null) {
            String lowerCase2 = splashActivity.MediaBrowserCompat$CustomActionResultReceiver().toLowerCase(Locale.ROOT);
            if (!(splashActivity instanceof GiftingStatusBaseActivity_ViewBinding) || !((GiftingStatusBaseActivity_ViewBinding) splashActivity).read("domain")) {
                if (!splashActivity.MediaBrowserCompat$CustomActionResultReceiver().equals(lowerCase)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Illegal domain attribute: \"");
                    sb.append(splashActivity.MediaBrowserCompat$CustomActionResultReceiver());
                    sb.append("\".");
                    sb.append("Domain of origin: \"");
                    sb.append(lowerCase);
                    sb.append("\"");
                    throw new CookieRestrictionViolationException(sb.toString());
                }
            } else if (lowerCase2.startsWith(".")) {
                int indexOf = lowerCase2.indexOf(46, 1);
                if ((indexOf < 0 || indexOf == lowerCase2.length() - 1) && !lowerCase2.equals(".local")) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Domain attribute \"");
                    sb2.append(splashActivity.MediaBrowserCompat$CustomActionResultReceiver());
                    sb2.append("\" violates RFC 2965: the value contains no embedded dots ");
                    sb2.append("and the value is not .local");
                    throw new CookieRestrictionViolationException(sb2.toString());
                } else if (!MediaBrowserCompat$CustomActionResultReceiver(lowerCase, lowerCase2)) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Domain attribute \"");
                    sb3.append(splashActivity.MediaBrowserCompat$CustomActionResultReceiver());
                    sb3.append("\" violates RFC 2965: effective host name does not ");
                    sb3.append("domain-match domain attribute.");
                    throw new CookieRestrictionViolationException(sb3.toString());
                } else if (lowerCase.substring(0, lowerCase.length() - lowerCase2.length()).indexOf(46) != -1) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("Domain attribute \"");
                    sb4.append(splashActivity.MediaBrowserCompat$CustomActionResultReceiver());
                    sb4.append("\" violates RFC 2965: ");
                    sb4.append("effective host minus domain may not contain any dots");
                    throw new CookieRestrictionViolationException(sb4.toString());
                }
            } else {
                StringBuilder sb5 = new StringBuilder();
                sb5.append("Domain attribute \"");
                sb5.append(splashActivity.MediaBrowserCompat$CustomActionResultReceiver());
                sb5.append("\" violates RFC 2109: domain must start with a dot");
                throw new CookieRestrictionViolationException(sb5.toString());
            }
        } else {
            throw new CookieRestrictionViolationException("Invalid cookie state: domain not specified");
        }
    }

    public final boolean IconCompatParcelizer(SplashActivity splashActivity, EasyAppTermsAndConditionsActivity easyAppTermsAndConditionsActivity) {
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(splashActivity, ServiceConstants.HEADER_COOKIE);
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(easyAppTermsAndConditionsActivity, "Cookie origin");
        String lowerCase = easyAppTermsAndConditionsActivity.MediaBrowserCompat$CustomActionResultReceiver.toLowerCase(Locale.ROOT);
        String MediaBrowserCompat$CustomActionResultReceiver = splashActivity.MediaBrowserCompat$CustomActionResultReceiver();
        if (MediaBrowserCompat$CustomActionResultReceiver(lowerCase, MediaBrowserCompat$CustomActionResultReceiver) && lowerCase.substring(0, lowerCase.length() - MediaBrowserCompat$CustomActionResultReceiver.length()).indexOf(46) == -1) {
            return true;
        }
        return false;
    }
}
