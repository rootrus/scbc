package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import p040o.zzfo;
import p040o.zzge;

/* renamed from: o.zzge$zze$MediaBrowserCompat$ItemReceiver */
final class zzge$zze$MediaBrowserCompat$ItemReceiver<T, R> implements DirectDebitDeepLinkActivity<T, R> {
    private /* synthetic */ zzge.zze MediaBrowserCompat$CustomActionResultReceiver;

    zzge$zze$MediaBrowserCompat$ItemReceiver(zzge.zze zze) {
        this.MediaBrowserCompat$CustomActionResultReceiver = zze;
    }

    public final /* synthetic */ Object write(Object obj) {
        SingleDataEntity singleDataEntity = (SingleDataEntity) obj;
        onGetStartedClick.write((Object) singleDataEntity, "it");
        setIdTokenNonce setidtokennonce = this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer;
        Object data = singleDataEntity.getData();
        onGetStartedClick.IconCompatParcelizer(data, "it.data");
        notifyFailureListeners notifyfailurelisteners = (notifyFailureListeners) data;
        onGetStartedClick.write((Object) notifyfailurelisteners, "easycashReferralDFWYNEntity");
        resetAnalyticsData MediaBrowserCompat$ItemReceiver = setidtokennonce.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(notifyfailurelisteners.MediaBrowserCompat$CustomActionResultReceiver);
        onGetStartedClick.IconCompatParcelizer((Object) MediaBrowserCompat$ItemReceiver, "easycashReferralVerifica…YNEntity.dataInformation)");
        zzfo.zzd write = setShowCancelButton.write(notifyfailurelisteners.write);
        onGetStartedClick.IconCompatParcelizer((Object) write, "easycashLoansListEntityM…eferralDFWYNEntity.tiles)");
        return new registerOnMeasurementEventListener(MediaBrowserCompat$ItemReceiver, write);
    }
}
