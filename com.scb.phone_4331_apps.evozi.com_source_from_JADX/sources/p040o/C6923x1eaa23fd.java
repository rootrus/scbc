package p040o;

import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.KtaBillExtractor_Factory$MediaBrowserCompat$CustomActionResultReceiver */
public final class C6923x1eaa23fd extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<setWatermarkEnabled> {
    final /* synthetic */ KtaBillExtractor_Factory read;

    public C6923x1eaa23fd(KtaBillExtractor_Factory ktaBillExtractor_Factory) {
        this.read = ktaBillExtractor_Factory;
    }

    public final /* synthetic */ void onNext(Object obj) {
        setWatermarkEnabled setwatermarkenabled = (setWatermarkEnabled) obj;
        onGetStartedClick.write((Object) setwatermarkenabled, "transferRepeat");
        KtaBillExtractor_Factory.IconCompatParcelizer(this.read);
        onGetStartedClick.write((Object) setwatermarkenabled, "domain");
        parseUser parseuser = new parseUser(setwatermarkenabled.RatingCompat, setwatermarkenabled.MediaBrowserCompat$ItemReceiver, setwatermarkenabled.MediaBrowserCompat$CustomActionResultReceiver, setwatermarkenabled.IconCompatParcelizer, setwatermarkenabled.MediaBrowserCompat$SearchResultReceiver, setwatermarkenabled.MediaBrowserCompat$MediaItem, setwatermarkenabled.read, setwatermarkenabled.MediaMetadataCompat, setwatermarkenabled.write);
        onInfoWindowLongClick oninfowindowlongclick = new onInfoWindowLongClick();
        oninfowindowlongclick.setBackgroundResource = parseuser.MediaBrowserCompat$ItemReceiver;
        oninfowindowlongclick.MediaBrowserCompat$CustomActionResultReceiver = parseuser.MediaBrowserCompat$CustomActionResultReceiver;
        oninfowindowlongclick.MediaBrowserCompat$ItemReceiver = parseuser.IconCompatParcelizer;
        oninfowindowlongclick.AlertController$RecycleListView = "TRANSFER";
        oninfowindowlongclick.ActionMenuItemView = parseuser.MediaBrowserCompat$SearchResultReceiver;
        oninfowindowlongclick.setContentView = setwatermarkenabled.write;
        onGetStartedClick.IconCompatParcelizer((Object) oninfowindowlongclick, "FavouriteTarget()\n      …(transferRepeat.bankLogo)");
        if (IGoogleMapDelegate.PROMPTPAY == getICheckDeserializerRtti.MediaSessionCompat$Token(parseuser.MediaBrowserCompat$SearchResultReceiver)) {
            oninfowindowlongclick.setBackgroundResource = parseuser.write;
            oninfowindowlongclick.MediaBrowserCompat$ItemReceiver = parseuser.read;
        }
        String str = parseuser.MediaMetadataCompat;
        if (str != null) {
            oninfowindowlongclick.MediaBrowserCompat$MediaItem = Double.parseDouble(str);
            onGetStartedClick.IconCompatParcelizer((Object) oninfowindowlongclick, "favouriteTarget.withAmount(it.toDouble())");
        }
        this.read.IconCompatParcelizer.read.MediaBrowserCompat$CustomActionResultReceiver(oninfowindowlongclick);
        KtaBillExtractor_Factory ktaBillExtractor_Factory = this.read;
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C6924xd403aa19.MediaBrowserCompat$ItemReceiver;
        if (ktaBillExtractor_Factory.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(ktaBillExtractor_Factory.RatingCompat);
        }
    }

    public final void onComplete() {
        KtaBillExtractor_Factory.IconCompatParcelizer(this.read);
    }

    public final void onError(Throwable th) {
        onGetStartedClick.write((Object) th, "e");
        if (!this.read.MediaBrowserCompat$SearchResultReceiver(th)) {
            KtaBillExtractor_Factory.IconCompatParcelizer(this.read);
            KtaBillExtractor_Factory ktaBillExtractor_Factory = this.read;
            writeUInt64NoTag.IconCompatParcelizer write2 = new write(this, th);
            if (ktaBillExtractor_Factory.RatingCompat != null) {
                write2.IconCompatParcelizer(ktaBillExtractor_Factory.RatingCompat);
            }
        }
    }

    /* renamed from: o.KtaBillExtractor_Factory$MediaBrowserCompat$CustomActionResultReceiver$write */
    static final class write<V> implements writeUInt64NoTag.IconCompatParcelizer<getTopLeftCornerWidth$MediaBrowserCompat$ItemReceiver> {
        private /* synthetic */ C6923x1eaa23fd IconCompatParcelizer;
        private /* synthetic */ Throwable MediaBrowserCompat$CustomActionResultReceiver;

        write(C6923x1eaa23fd ktaBillExtractor_Factory$MediaBrowserCompat$CustomActionResultReceiver, Throwable th) {
            this.IconCompatParcelizer = ktaBillExtractor_Factory$MediaBrowserCompat$CustomActionResultReceiver;
            this.MediaBrowserCompat$CustomActionResultReceiver = th;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            this.IconCompatParcelizer.read.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer.read.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver, access$2300.write.JUST_DISMISS));
        }
    }
}
