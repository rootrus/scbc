package p040o;

import com.kofax.mobile.sdk._internal.impl.extraction.kta.KtaJsonExactionHelper;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;

@Deprecated
/* renamed from: o.ThirdPartyConsentDeepLinkActivity */
public final class ThirdPartyConsentDeepLinkActivity implements RequestToPayActivity<FacebookConsentDeepLinkActivity> {
    public final ConcurrentHashMap<String, ThemesActivity> read = new ConcurrentHashMap<>();

    public final /* synthetic */ Object read(final String str) {
        return new FacebookConsentDeepLinkActivity() {
            public final ThirdPartyConsentActivity MediaBrowserCompat$CustomActionResultReceiver(CreditCardBilledDetailAdapter$ParentViewHolder creditCardBilledDetailAdapter$ParentViewHolder) {
                ThirdPartyConsentDeepLinkActivity thirdPartyConsentDeepLinkActivity = ThirdPartyConsentDeepLinkActivity.this;
                String str = str;
                AmountDetailsSuccessAdapter$SuccessRow_ViewBinding write = ((PrivacyConsentActivity) creditCardBilledDetailAdapter$ParentViewHolder.MediaBrowserCompat$ItemReceiver("http.request")).write();
                DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(str, KtaJsonExactionHelper.NAME);
                ThemesActivity themesActivity = thirdPartyConsentDeepLinkActivity.read.get(str.toLowerCase(Locale.ENGLISH));
                if (themesActivity != null) {
                    return themesActivity.MediaBrowserCompat$CustomActionResultReceiver(write);
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Unsupported cookie spec: ");
                sb.append(str);
                throw new IllegalStateException(sb.toString());
            }
        };
    }
}
