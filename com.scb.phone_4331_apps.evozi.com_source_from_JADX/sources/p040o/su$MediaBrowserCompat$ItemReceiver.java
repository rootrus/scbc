package p040o;

import p040o.CrashlyticsReport;
import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.su$MediaBrowserCompat$ItemReceiver */
public final class su$MediaBrowserCompat$ItemReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<panoramaCamera> {
    final /* synthetic */ C7476su read;

    /* renamed from: o.su$MediaBrowserCompat$ItemReceiver$IconCompatParcelizer */
    static final class IconCompatParcelizer<V> implements writeUInt64NoTag.IconCompatParcelizer<getTopLeftCornerWidth$MediaBrowserCompat$ItemReceiver> {
        public static final IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver = new IconCompatParcelizer();

        IconCompatParcelizer() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((getTopLeftCornerWidth$MediaBrowserCompat$ItemReceiver) obj).MediaBrowserCompat$ItemReceiver();
        }
    }

    public su$MediaBrowserCompat$ItemReceiver(C7476su suVar) {
        this.read = suVar;
    }

    public final /* synthetic */ void onNext(Object obj) {
        panoramaCamera panoramacamera = (panoramaCamera) obj;
        onGetStartedClick.write((Object) panoramacamera, "billPaymentRepeat");
        C7476su.write(this.read);
        onGetStartedClick.write((Object) panoramacamera, "domain");
        CrashlyticsReport.Session.Event.Application.Execution.Builder builder = new CrashlyticsReport.Session.Event.Application.Execution.Builder(panoramacamera.read, panoramacamera.MediaBrowserCompat$ItemReceiver, panoramacamera.MediaSessionCompat$QueueItem, panoramacamera.Keep, panoramacamera.PlaybackStateCompat, panoramacamera.RatingCompat, panoramacamera.write, panoramacamera.IconCompatParcelizer, panoramacamera.MediaSessionCompat$Token, panoramacamera.MediaSessionCompat$ResultReceiverWrapper, panoramacamera.f2911x50fd9e4a, panoramacamera.ParcelableVolumeInfo, panoramacamera.MediaMetadataCompat, panoramacamera.MediaBrowserCompat$MediaItem, panoramacamera.MediaBrowserCompat$SearchResultReceiver, panoramacamera.MediaBrowserCompat$CustomActionResultReceiver, panoramacamera.MediaDescriptionCompat);
        onInfoWindowLongClick oninfowindowlongclick = new onInfoWindowLongClick();
        oninfowindowlongclick.MediaBrowserCompat$CustomActionResultReceiver = builder.write;
        oninfowindowlongclick.AlertController$RecycleListView = "BILLPAYMENT";
        oninfowindowlongclick.ActionMenuItemView = "ALL";
        oninfowindowlongclick.setBackgroundResource = builder.MediaBrowserCompat$ItemReceiver;
        oninfowindowlongclick.MediaBrowserCompat$ItemReceiver = builder.MediaBrowserCompat$ItemReceiver;
        oninfowindowlongclick.AppCompatDelegateImpl$ListMenuDecorView = builder.MediaBrowserCompat$CustomActionResultReceiver;
        oninfowindowlongclick.setContentView = builder.read;
        onGetStartedClick.IconCompatParcelizer((Object) oninfowindowlongclick, "FavouriteTarget()\n      …RepeatDisplay.billerLogo)");
        if (builder.IconCompatParcelizer != null) {
            oninfowindowlongclick.MediaBrowserCompat$MediaItem = Double.parseDouble(builder.IconCompatParcelizer);
            onGetStartedClick.IconCompatParcelizer((Object) oninfowindowlongclick, "favouriteTarget.withAmou…paymentAmount.toDouble())");
        }
        if (builder.MediaBrowserCompat$MediaItem != null) {
            oninfowindowlongclick.AppCompatViewInflater = builder.MediaBrowserCompat$MediaItem;
            onGetStartedClick.IconCompatParcelizer((Object) oninfowindowlongclick, "favouriteTarget.withRefN…peatDisplay.referenceNo2)");
        }
        if (builder.MediaMetadataCompat != null) {
            oninfowindowlongclick.setChecked = builder.MediaMetadataCompat;
            onGetStartedClick.IconCompatParcelizer((Object) oninfowindowlongclick, "favouriteTarget.withRefN…peatDisplay.referenceNo3)");
        }
        this.read.MediaBrowserCompat$ItemReceiver.read.MediaBrowserCompat$CustomActionResultReceiver(oninfowindowlongclick);
        C7476su suVar = this.read;
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver;
        if (suVar.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(suVar.RatingCompat);
        }
    }

    public final void onComplete() {
        C7476su.write(this.read);
    }

    public final void onError(Throwable th) {
        onGetStartedClick.write((Object) th, "e");
        if (!this.read.MediaBrowserCompat$SearchResultReceiver(th)) {
            C7476su.write(this.read);
            C7476su suVar = this.read;
            writeUInt64NoTag.IconCompatParcelizer read2 = new read(this, th);
            if (suVar.RatingCompat != null) {
                read2.IconCompatParcelizer(suVar.RatingCompat);
            }
        }
    }

    /* renamed from: o.su$MediaBrowserCompat$ItemReceiver$read */
    static final class read<V> implements writeUInt64NoTag.IconCompatParcelizer<getTopLeftCornerWidth$MediaBrowserCompat$ItemReceiver> {
        private /* synthetic */ su$MediaBrowserCompat$ItemReceiver read;
        private /* synthetic */ Throwable write;

        read(su$MediaBrowserCompat$ItemReceiver su_mediabrowsercompat_itemreceiver, Throwable th) {
            this.read = su_mediabrowsercompat_itemreceiver;
            this.write = th;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            this.read.read.MediaBrowserCompat$ItemReceiver(this.read.read.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.write, access$2300.write.JUST_DISMISS));
        }
    }
}
