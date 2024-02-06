package p040o;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: o.PrepaidViewPagerAdapter$TransactionItemViewHolder_ViewBinding */
public abstract class PrepaidViewPagerAdapter$TransactionItemViewHolder_ViewBinding implements ThirdPartyConsentActivity {
    private final Map<String, JuristicEasyAppTermsAndConditionsActivity> MediaBrowserCompat$CustomActionResultReceiver;

    public PrepaidViewPagerAdapter$TransactionItemViewHolder_ViewBinding() {
        this.MediaBrowserCompat$CustomActionResultReceiver = new ConcurrentHashMap(10);
    }

    protected PrepaidViewPagerAdapter$TransactionItemViewHolder_ViewBinding(GiftingStatusBaseActivity... giftingStatusBaseActivityArr) {
        this.MediaBrowserCompat$CustomActionResultReceiver = new ConcurrentHashMap(giftingStatusBaseActivityArr.length);
        for (GiftingStatusBaseActivity giftingStatusBaseActivity : giftingStatusBaseActivityArr) {
            this.MediaBrowserCompat$CustomActionResultReceiver.put(giftingStatusBaseActivity.read(), giftingStatusBaseActivity);
        }
    }

    /* access modifiers changed from: protected */
    public final JuristicEasyAppTermsAndConditionsActivity MediaBrowserCompat$CustomActionResultReceiver(String str) {
        return this.MediaBrowserCompat$CustomActionResultReceiver.get(str);
    }

    /* access modifiers changed from: protected */
    public final Collection<JuristicEasyAppTermsAndConditionsActivity> IconCompatParcelizer() {
        return this.MediaBrowserCompat$CustomActionResultReceiver.values();
    }
}
