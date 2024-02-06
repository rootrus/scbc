package p040o;

import java.util.List;
import org.apache.http.cookie.MalformedCookieException;

/* renamed from: o.ThirdPartyConsentActivity */
public interface ThirdPartyConsentActivity {
    PrepaidRequestMarketConductActivity MediaBrowserCompat$CustomActionResultReceiver();

    int MediaBrowserCompat$ItemReceiver();

    List<SplashActivity> MediaBrowserCompat$ItemReceiver(PrepaidRequestMarketConductActivity prepaidRequestMarketConductActivity, EasyAppTermsAndConditionsActivity easyAppTermsAndConditionsActivity) throws MalformedCookieException;

    boolean MediaBrowserCompat$ItemReceiver(SplashActivity splashActivity, EasyAppTermsAndConditionsActivity easyAppTermsAndConditionsActivity);

    List<PrepaidRequestMarketConductActivity> write(List<SplashActivity> list);

    void write(SplashActivity splashActivity, EasyAppTermsAndConditionsActivity easyAppTermsAndConditionsActivity) throws MalformedCookieException;
}
