package p040o;

import com.scb.phone.view.activity.sme.gifting.GiftOpenSharingMomentActivity;

/* renamed from: o.WeekPagerAdapter */
public interface WeekPagerAdapter {

    /* renamed from: o.WeekPagerAdapter$Weekly */
    public final /* synthetic */ class Weekly implements DebitCardMarketConductDeepLinkActivity {
        private final /* synthetic */ GiftOpenSharingMomentActivity MediaBrowserCompat$CustomActionResultReceiver;

        public /* synthetic */ Weekly(GiftOpenSharingMomentActivity giftOpenSharingMomentActivity) {
            this.MediaBrowserCompat$CustomActionResultReceiver = giftOpenSharingMomentActivity;
        }

        public final void IconCompatParcelizer(Object obj) {
            GiftOpenSharingMomentActivity.write(this.MediaBrowserCompat$CustomActionResultReceiver);
        }
    }

    void IconCompatParcelizer(String str);

    void MediaBrowserCompat$CustomActionResultReceiver(int i, String str, String str2);

    void write(String str);
}
