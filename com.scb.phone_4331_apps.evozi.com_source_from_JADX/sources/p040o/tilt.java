package p040o;

import com.scb.phone.domain.entity.isprint.E2EEEncryptionException;
import com.scb.phone.domain.interactor.PinCase;
import java.util.concurrent.Callable;
import p040o.zzmd;

/* renamed from: o.tilt */
public final /* synthetic */ class tilt implements Callable {
    private final /* synthetic */ String IconCompatParcelizer;
    private final /* synthetic */ PinCase MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ tilt(PinCase pinCase, String str) {
        this.MediaBrowserCompat$ItemReceiver = pinCase;
        this.IconCompatParcelizer = str;
    }

    public final Object call() {
        String str;
        PinCase pinCase = this.MediaBrowserCompat$ItemReceiver;
        String str2 = this.IconCompatParcelizer;
        PlaceBuffer MediaBrowserCompat$ItemReceiver2 = pinCase.write.MediaBrowserCompat$ItemReceiver();
        if (MediaBrowserCompat$ItemReceiver2 != null) {
            C1189xa6547b7b fragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment$MediaSessionCompat$ResultReceiverWrapper = new C1189xa6547b7b();
            String str3 = null;
            if (zzmd.zzn.MOVING_MIGRATE.f2998id.equalsIgnoreCase(pinCase.write.MediaBrowserCompat$CustomActionResultReceiver()) || zzmd.zzn.FE_MOBILE.f2998id.equalsIgnoreCase(pinCase.write.MediaBrowserCompat$CustomActionResultReceiver())) {
                String str4 = MediaBrowserCompat$ItemReceiver2.write;
                if (str4 == null) {
                    str4 = "";
                }
                str = fragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment$MediaSessionCompat$ResultReceiverWrapper.write(AlertController$RecycleListView.read(str4), MediaBrowserCompat$ItemReceiver2.read, str2, MediaBrowserCompat$ItemReceiver2.MediaBrowserCompat$MediaItem, MediaBrowserCompat$ItemReceiver2.MediaBrowserCompat$SearchResultReceiver);
            } else {
                str = null;
            }
            if (zzmd.zzn.MOVING_MIGRATE.f2998id.equalsIgnoreCase(pinCase.write.MediaBrowserCompat$CustomActionResultReceiver()) || zzmd.zzn.MIGRATED.f2998id.equalsIgnoreCase(pinCase.write.MediaBrowserCompat$CustomActionResultReceiver())) {
                str3 = fragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment$MediaSessionCompat$ResultReceiverWrapper.write(AlertController$RecycleListView.read(MediaBrowserCompat$ItemReceiver2.MediaBrowserCompat$CustomActionResultReceiver), MediaBrowserCompat$ItemReceiver2.RatingCompat, str2, MediaBrowserCompat$ItemReceiver2.IconCompatParcelizer, MediaBrowserCompat$ItemReceiver2.MediaMetadataCompat);
            }
            if (fragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment$MediaSessionCompat$ResultReceiverWrapper.write == 0) {
                return new ForwardingList(str3, str);
            }
            throw new E2EEEncryptionException();
        }
        throw new NullPointerException("preAuthenticate is null");
    }
}
