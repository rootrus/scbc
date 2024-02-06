package p040o;

import com.thunderhead.connectivity.transport.ServiceConstants;
import java.util.Locale;
import org.apache.http.cookie.CookieRestrictionViolationException;
import org.apache.http.cookie.MalformedCookieException;

/* renamed from: o.BankingActionAdapter$CustomViewHolder */
public class BankingActionAdapter$CustomViewHolder implements GiftingStatusBaseActivity {
    public String read() {
        return "domain";
    }

    public void MediaBrowserCompat$ItemReceiver(ThirdPartyConsentFragment thirdPartyConsentFragment, String str) throws MalformedCookieException {
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(thirdPartyConsentFragment, ServiceConstants.HEADER_COOKIE);
        if (FatcaQuestionnaireAdapter$ViewHolder.read(str)) {
            throw new MalformedCookieException("Blank or null value for domain attribute");
        } else if (!str.endsWith(".")) {
            if (str.startsWith(".")) {
                str = str.substring(1);
            }
            thirdPartyConsentFragment.MediaBrowserCompat$CustomActionResultReceiver(str.toLowerCase(Locale.ROOT));
        }
    }

    public void MediaBrowserCompat$ItemReceiver(SplashActivity splashActivity, EasyAppTermsAndConditionsActivity easyAppTermsAndConditionsActivity) throws MalformedCookieException {
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(splashActivity, ServiceConstants.HEADER_COOKIE);
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(easyAppTermsAndConditionsActivity, "Cookie origin");
        String str = easyAppTermsAndConditionsActivity.MediaBrowserCompat$CustomActionResultReceiver;
        String MediaBrowserCompat$CustomActionResultReceiver = splashActivity.MediaBrowserCompat$CustomActionResultReceiver();
        if (MediaBrowserCompat$CustomActionResultReceiver == null) {
            throw new CookieRestrictionViolationException("Cookie 'domain' may not be null");
        } else if (!str.equals(MediaBrowserCompat$CustomActionResultReceiver) && !MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$CustomActionResultReceiver, str)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Illegal 'domain' attribute \"");
            sb.append(MediaBrowserCompat$CustomActionResultReceiver);
            sb.append("\". Domain of origin: \"");
            sb.append(str);
            sb.append("\"");
            throw new CookieRestrictionViolationException(sb.toString());
        }
    }

    static boolean MediaBrowserCompat$ItemReceiver(String str, String str2) {
        if (GiftingSelectRecipientActivity.read(str2) || GiftingSelectRecipientActivity.IconCompatParcelizer(str2)) {
            return false;
        }
        if (str.startsWith(".")) {
            str = str.substring(1);
        }
        if (!str2.endsWith(str)) {
            return false;
        }
        int length = str2.length() - str.length();
        if (length == 0) {
            return true;
        }
        if (length <= 1 || str2.charAt(length - 1) != '.') {
            return false;
        }
        return true;
    }

    public boolean IconCompatParcelizer(SplashActivity splashActivity, EasyAppTermsAndConditionsActivity easyAppTermsAndConditionsActivity) {
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(splashActivity, ServiceConstants.HEADER_COOKIE);
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(easyAppTermsAndConditionsActivity, "Cookie origin");
        String str = easyAppTermsAndConditionsActivity.MediaBrowserCompat$CustomActionResultReceiver;
        String MediaBrowserCompat$CustomActionResultReceiver = splashActivity.MediaBrowserCompat$CustomActionResultReceiver();
        if (MediaBrowserCompat$CustomActionResultReceiver == null) {
            return false;
        }
        if (MediaBrowserCompat$CustomActionResultReceiver.startsWith(".")) {
            MediaBrowserCompat$CustomActionResultReceiver = MediaBrowserCompat$CustomActionResultReceiver.substring(1);
        }
        String lowerCase = MediaBrowserCompat$CustomActionResultReceiver.toLowerCase(Locale.ROOT);
        if (str.equals(lowerCase)) {
            return true;
        }
        if (!(splashActivity instanceof GiftingStatusBaseActivity_ViewBinding) || !((GiftingStatusBaseActivity_ViewBinding) splashActivity).read("domain")) {
            return false;
        }
        return MediaBrowserCompat$ItemReceiver(lowerCase, str);
    }
}
