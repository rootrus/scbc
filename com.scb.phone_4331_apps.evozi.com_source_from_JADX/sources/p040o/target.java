package p040o;

import com.scb.phone.domain.entity.isprint.E2EEEncryptionException;
import com.scb.phone.domain.interactor.PinCase;
import java.util.concurrent.Callable;
import p040o.zzmd;

/* renamed from: o.target */
public final /* synthetic */ class target implements Callable {
    private final /* synthetic */ PinCase read;
    private final /* synthetic */ String write;

    public /* synthetic */ target(PinCase pinCase, String str) {
        this.read = pinCase;
        this.write = str;
    }

    public final Object call() {
        PinCase pinCase = this.read;
        String str = this.write;
        PlaceBuffer MediaBrowserCompat$ItemReceiver = pinCase.write.MediaBrowserCompat$ItemReceiver();
        if (MediaBrowserCompat$ItemReceiver != null) {
            String str2 = MediaBrowserCompat$ItemReceiver.write;
            if (str2 == null) {
                str2 = "";
            }
            String write2 = pinCase.IconCompatParcelizer.write(AlertController$RecycleListView.read(str2), MediaBrowserCompat$ItemReceiver.read, str, MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$MediaItem, MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$SearchResultReceiver);
            String str3 = null;
            if (!zzmd.zzn.FE_MOBILE.f2998id.equalsIgnoreCase(pinCase.write.MediaBrowserCompat$CustomActionResultReceiver())) {
                str3 = pinCase.IconCompatParcelizer.write(AlertController$RecycleListView.read(MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver), MediaBrowserCompat$ItemReceiver.RatingCompat, str, MediaBrowserCompat$ItemReceiver.IconCompatParcelizer, MediaBrowserCompat$ItemReceiver.MediaMetadataCompat);
            }
            if (pinCase.IconCompatParcelizer.write == 0) {
                return new ForwardingList(str3, write2);
            }
            throw new E2EEEncryptionException();
        }
        throw new NullPointerException("preAuthenticate is null");
    }
}
