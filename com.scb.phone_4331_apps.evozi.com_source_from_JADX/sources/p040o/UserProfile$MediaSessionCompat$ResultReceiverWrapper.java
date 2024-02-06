package p040o;

import java.util.List;
import p040o.GoogleMap;
import p040o.zzcz;

/* renamed from: o.UserProfile$MediaSessionCompat$ResultReceiverWrapper */
public final class UserProfile$MediaSessionCompat$ResultReceiverWrapper<T1, T2, R> implements ChequeManagementDeepLinkActivity<zzcz.zzc.zza, List<? extends zzwh>, writeNonFatalException> {
    private /* synthetic */ boolean IconCompatParcelizer;
    private /* synthetic */ UserProfile read;

    public UserProfile$MediaSessionCompat$ResultReceiverWrapper(UserProfile userProfile, boolean z) {
        this.read = userProfile;
        this.IconCompatParcelizer = z;
    }

    public final /* synthetic */ Object read(Object obj, Object obj2) {
        zzcz.zzc.zza zza = (zzcz.zzc.zza) obj;
        List list = (List) obj2;
        onGetStartedClick.write((Object) zza, "hmlApplications");
        onGetStartedClick.write((Object) list, "countries");
        newEnumSet IconCompatParcelizer2 = this.read.MediaSessionCompat$QueueItem;
        boolean z = this.IconCompatParcelizer;
        String str = zza.MediaBrowserCompat$SearchResultReceiver.RatingCompat;
        GoogleMap.OnMarkerDragListener AppCompatDelegateImpl$ListMenuDecorView = this.read.MediaSessionCompat$ResultReceiverWrapper.MediaBrowserCompat$ItemReceiver.AppCompatDelegateImpl$ListMenuDecorView();
        boolean z2 = false;
        if (AppCompatDelegateImpl$ListMenuDecorView != null && AppCompatDelegateImpl$ListMenuDecorView.MediaSessionCompat$ResultReceiverWrapper > 0) {
            z2 = true;
        }
        return IconCompatParcelizer2.write(zza, list, z, str, z2);
    }
}
