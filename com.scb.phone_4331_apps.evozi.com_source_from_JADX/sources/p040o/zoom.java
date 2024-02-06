package p040o;

import com.scb.phone.domain.entity.isprint.E2EEEncryptionException;
import com.scb.phone.domain.interactor.PinCase;
import java.util.concurrent.Callable;
import p040o.zzmd;

/* renamed from: o.zoom */
public final /* synthetic */ class zoom implements Callable {
    private final /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ String read;
    private final /* synthetic */ PinCase write;

    public /* synthetic */ zoom(PinCase pinCase, String str, String str2) {
        this.write = pinCase;
        this.read = str;
        this.MediaBrowserCompat$CustomActionResultReceiver = str2;
    }

    public final Object call() {
        PinCase pinCase = this.write;
        String str = this.read;
        String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        PlaceBuffer MediaBrowserCompat$ItemReceiver = pinCase.write.MediaBrowserCompat$ItemReceiver();
        if (MediaBrowserCompat$ItemReceiver != null) {
            String str3 = null;
            String str4 = MediaBrowserCompat$ItemReceiver.write;
            if (str4 == null) {
                str4 = "";
            }
            byte read2 = AlertController$RecycleListView.read(str4);
            byte read3 = AlertController$RecycleListView.read(MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver);
            if (zzmd.zzn.MOVING_MIGRATE.f2998id.equalsIgnoreCase(pinCase.write.IconCompatParcelizer())) {
                str3 = pinCase.IconCompatParcelizer.IconCompatParcelizer(read3, MediaBrowserCompat$ItemReceiver.RatingCompat, str, str2, MediaBrowserCompat$ItemReceiver.IconCompatParcelizer, MediaBrowserCompat$ItemReceiver.MediaMetadataCompat);
            }
            String str5 = str3;
            String IconCompatParcelizer = pinCase.IconCompatParcelizer.IconCompatParcelizer(read2, MediaBrowserCompat$ItemReceiver.read, str, str2, MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$MediaItem, MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$SearchResultReceiver);
            if (pinCase.IconCompatParcelizer.write == 0) {
                return new ForwardingList(str5, IconCompatParcelizer);
            }
            throw new E2EEEncryptionException();
        }
        throw new NullPointerException("preAuthenticate is null");
    }
}
