package p040o;

import p040o.zzca;

/* renamed from: o.setExpanded$MediaBrowserCompat$CustomActionResultReceiver */
final class setExpanded$MediaBrowserCompat$CustomActionResultReceiver<T, R> implements DirectDebitDeepLinkActivity<T, DebitCardResetPinSuccessActivity_ViewBinding<? extends R>> {
    private /* synthetic */ setExpanded MediaBrowserCompat$CustomActionResultReceiver;

    setExpanded$MediaBrowserCompat$CustomActionResultReceiver(setExpanded setexpanded) {
        this.MediaBrowserCompat$CustomActionResultReceiver = setexpanded;
    }

    public final /* synthetic */ Object write(Object obj) {
        zzca.zzf.zza zza = (zzca.zzf.zza) obj;
        onGetStartedClick.write((Object) zza, "it");
        getAncestor getancestor = this.MediaBrowserCompat$CustomActionResultReceiver.read;
        String str = zza.MediaBrowserCompat$ItemReceiver;
        if (str == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver();
        }
        DebitCardCoachMarkActivity AlertController$RecycleListView = getancestor.AlertController$RecycleListView(str);
        HmlLatestPersonalInformationDeepLinkActivity.write(zza, "completionValue is null");
        return new FriendsLandingActivity_ViewBinding(new RtpDeepLinkActivity(AlertController$RecycleListView, zza));
    }
}
