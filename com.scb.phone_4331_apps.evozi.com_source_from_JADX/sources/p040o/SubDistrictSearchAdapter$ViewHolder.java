package p040o;

import com.thunderhead.connectivity.transport.ServiceConstants;
import org.apache.http.cookie.MalformedCookieException;

/* renamed from: o.SubDistrictSearchAdapter$ViewHolder */
public class SubDistrictSearchAdapter$ViewHolder implements GiftingStatusBaseActivity {
    public void MediaBrowserCompat$ItemReceiver(SplashActivity splashActivity, EasyAppTermsAndConditionsActivity easyAppTermsAndConditionsActivity) throws MalformedCookieException {
    }

    public final String read() {
        return "path";
    }

    public final void MediaBrowserCompat$ItemReceiver(ThirdPartyConsentFragment thirdPartyConsentFragment, String str) throws MalformedCookieException {
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(thirdPartyConsentFragment, ServiceConstants.HEADER_COOKIE);
        if (FatcaQuestionnaireAdapter$ViewHolder.read(str)) {
            str = "/";
        }
        thirdPartyConsentFragment.write(str);
    }

    public final boolean IconCompatParcelizer(SplashActivity splashActivity, EasyAppTermsAndConditionsActivity easyAppTermsAndConditionsActivity) {
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(splashActivity, ServiceConstants.HEADER_COOKIE);
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(easyAppTermsAndConditionsActivity, "Cookie origin");
        String str = easyAppTermsAndConditionsActivity.write;
        String IconCompatParcelizer = splashActivity.IconCompatParcelizer();
        if (IconCompatParcelizer == null) {
            IconCompatParcelizer = "/";
        }
        if (IconCompatParcelizer.length() > 1 && IconCompatParcelizer.endsWith("/")) {
            IconCompatParcelizer = IconCompatParcelizer.substring(0, IconCompatParcelizer.length() - 1);
        }
        return str.startsWith(IconCompatParcelizer) && (IconCompatParcelizer.equals("/") || str.length() == IconCompatParcelizer.length() || str.charAt(IconCompatParcelizer.length()) == '/');
    }
}
