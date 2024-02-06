package p040o;

import android.text.TextUtils;
import java.util.List;
import java.util.NoSuchElementException;
import p040o.AppMeasurementSdk;
import p040o.getTopLeftCornerWidth;

/* renamed from: o.RttiBillExtractor */
public class RttiBillExtractor extends writeUInt64NoTag<getTopLeftCornerWidth.setTitle> {
    onInfoWindowLongClick IconCompatParcelizer;
    public parseSession MediaBrowserCompat$ItemReceiver;
    boolean MediaBrowserCompat$MediaItem;
    public final AppMeasurementSdk.OnEventListener MediaBrowserCompat$SearchResultReceiver;
    public List<parseOs> MediaDescriptionCompat;
    /* access modifiers changed from: private */
    public parseOs MediaMetadataCompat;
    /* access modifiers changed from: private */
    public final CheckedFuture MediaSessionCompat$QueueItem;
    /* access modifiers changed from: private */
    public boolean MediaSessionCompat$ResultReceiverWrapper;
    final Shorts read;
    /* access modifiers changed from: package-private */
    public String write = "000";

    @HmlPinActivity
    public RttiBillExtractor(Shorts shorts, AppMeasurementSdk.OnEventListener onEventListener, CheckedFuture checkedFuture, RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
        this.read = shorts;
        this.MediaBrowserCompat$SearchResultReceiver = onEventListener;
        this.MediaSessionCompat$QueueItem = checkedFuture;
        this.IconCompatParcelizer = onEventListener.read.write();
    }

    public void onDestroy() {
        super.onDestroy();
        AppMeasurementSdk.OnEventListener onEventListener = this.MediaBrowserCompat$SearchResultReceiver;
        if (!onEventListener.MediaBrowserCompat$MediaItem.isDisposed()) {
            onEventListener.MediaBrowserCompat$MediaItem.dispose();
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(String str) {
        this.MediaBrowserCompat$SearchResultReceiver.read(this.MediaBrowserCompat$SearchResultReceiver.read.write(str).map(new newRttiExceptionResponseDeserializer(this)), new proxyGetUriRtti(this), new newKtaExceptionResponseDeserializer(this));
    }

    public final void MediaBrowserCompat$ItemReceiver(parseOs parseos, boolean z) {
        boolean z2 = true;
        if (TextUtils.isEmpty(this.write)) {
            this.MediaBrowserCompat$MediaItem = true;
            this.MediaMetadataCompat = parseos;
            this.MediaSessionCompat$ResultReceiverWrapper = z;
        } else if (this.MediaBrowserCompat$ItemReceiver != null) {
            getDefaultServerUrl getdefaultserverurl = new getDefaultServerUrl(this, parseos, z);
            if (this.RatingCompat == null) {
                z2 = false;
            }
            if (z2) {
                getdefaultserverurl.IconCompatParcelizer(this.RatingCompat);
            }
        } else {
            createResponse createresponse = new createResponse(this, parseos, z);
            if (this.RatingCompat == null) {
                z2 = false;
            }
            if (z2) {
                createresponse.IconCompatParcelizer(this.RatingCompat);
            }
        }
    }

    static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(isSupportFragmentClass issupportfragmentclass, getTopLeftCornerWidth.setTitle settitle) {
        T t = issupportfragmentclass.IconCompatParcelizer;
        if (t != null) {
            settitle.MediaBrowserCompat$ItemReceiver((parseOs) t);
            return;
        }
        throw new NoSuchElementException("No value present");
    }

    static /* synthetic */ void IconCompatParcelizer(isSupportFragmentClass issupportfragmentclass, getTopLeftCornerWidth.setTitle settitle) {
        T t = issupportfragmentclass.IconCompatParcelizer;
        if (t != null) {
            settitle.MediaBrowserCompat$ItemReceiver((parseOs) t);
            return;
        }
        throw new NoSuchElementException("No value present");
    }
}
