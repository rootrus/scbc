package p040o;

import com.kofax.mobile.sdk._internal.impl.extraction.kta.KtaJsonExactionHelper;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;

@Deprecated
/* renamed from: o.PromptPayTermsAndConditionsLandingActivity */
public final class PromptPayTermsAndConditionsLandingActivity implements RequestToPayActivity<PromptPayQRActivity> {
    public final ConcurrentHashMap<String, LinkAndUnlinkPromptPayActivity> MediaBrowserCompat$CustomActionResultReceiver = new ConcurrentHashMap<>();

    public final /* synthetic */ Object read(final String str) {
        return new PromptPayQRActivity() {
            public final ManagePromptpayLandingActivity write(CreditCardBilledDetailAdapter$ParentViewHolder creditCardBilledDetailAdapter$ParentViewHolder) {
                PromptPayTermsAndConditionsLandingActivity promptPayTermsAndConditionsLandingActivity = PromptPayTermsAndConditionsLandingActivity.this;
                String str = str;
                ((PrivacyConsentActivity) creditCardBilledDetailAdapter$ParentViewHolder.MediaBrowserCompat$ItemReceiver("http.request")).write();
                DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(str, KtaJsonExactionHelper.NAME);
                LinkAndUnlinkPromptPayActivity linkAndUnlinkPromptPayActivity = promptPayTermsAndConditionsLandingActivity.MediaBrowserCompat$CustomActionResultReceiver.get(str.toLowerCase(Locale.ENGLISH));
                if (linkAndUnlinkPromptPayActivity != null) {
                    return linkAndUnlinkPromptPayActivity.IconCompatParcelizer();
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Unsupported authentication scheme: ");
                sb.append(str);
                throw new IllegalStateException(sb.toString());
            }
        };
    }
}
