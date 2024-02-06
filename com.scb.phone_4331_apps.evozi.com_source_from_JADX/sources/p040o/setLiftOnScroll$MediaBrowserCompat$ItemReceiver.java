package p040o;

import java.util.List;
import p040o.zzjx;

/* renamed from: o.setLiftOnScroll$MediaBrowserCompat$ItemReceiver */
final class setLiftOnScroll$MediaBrowserCompat$ItemReceiver<T, R> implements DirectDebitDeepLinkActivity<T, DebitCardResetPinSuccessActivity_ViewBinding<? extends R>> {
    final /* synthetic */ setLiftOnScroll MediaBrowserCompat$ItemReceiver;
    private /* synthetic */ String read;

    setLiftOnScroll$MediaBrowserCompat$ItemReceiver(setLiftOnScroll setliftonscroll, String str) {
        this.MediaBrowserCompat$ItemReceiver = setliftonscroll;
        this.read = str;
    }

    public final /* synthetic */ Object write(Object obj) {
        onGetStartedClick.write((Object) (List) obj, "it");
        return this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.read(this.read, this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer.MediaBrowserCompat$SearchResultReceiver()).flatMap(new DirectDebitDeepLinkActivity<T, DebitCardResetPinSuccessActivity_ViewBinding<? extends R>>(this) {
            private /* synthetic */ setLiftOnScroll$MediaBrowserCompat$ItemReceiver IconCompatParcelizer;

            {
                this.IconCompatParcelizer = r1;
            }

            public final /* synthetic */ Object write(Object obj) {
                zzjx.zze zze = (zzjx.zze) obj;
                onGetStartedClick.write((Object) zze, "it");
                getAncestor getancestor = this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver.write;
                String str = zze.IconCompatParcelizer;
                if (str == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                }
                DebitCardCoachMarkActivity AlertController$RecycleListView = getancestor.AlertController$RecycleListView(str);
                DebitCardCoachMarkActivity write = this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver.write.write(zze);
                HmlLatestPersonalInformationDeepLinkActivity.write(zze, "completionValue is null");
                DebitCardResetPinSuccessActivity_ViewBinding friendsLandingActivity_ViewBinding = new FriendsLandingActivity_ViewBinding(new RtpDeepLinkActivity(write, zze));
                HmlLatestPersonalInformationDeepLinkActivity.write(friendsLandingActivity_ViewBinding, "next is null");
                return new lambda$showFloatingButton$1$NTBBankingServiceActivity(AlertController$RecycleListView, friendsLandingActivity_ViewBinding);
            }
        });
    }
}
