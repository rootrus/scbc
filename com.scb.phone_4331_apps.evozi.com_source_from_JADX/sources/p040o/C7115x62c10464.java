package p040o;

import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.getIExceptionResponseDeserializerKta$MediaBrowserCompat$ItemReceiver */
public final class C7115x62c10464 extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<setScrollGesturesEnabledDuringRotateOrZoom> {
    final /* synthetic */ getIExceptionResponseDeserializerKta IconCompatParcelizer;

    /* renamed from: o.getIExceptionResponseDeserializerKta$MediaBrowserCompat$ItemReceiver$IconCompatParcelizer */
    static final class IconCompatParcelizer<V> implements writeUInt64NoTag.IconCompatParcelizer<getTopLeftCornerWidth$MediaBrowserCompat$ItemReceiver> {
        public static final IconCompatParcelizer write = new IconCompatParcelizer();

        IconCompatParcelizer() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((getTopLeftCornerWidth$MediaBrowserCompat$ItemReceiver) obj).MediaBrowserCompat$ItemReceiver();
        }
    }

    public C7115x62c10464(getIExceptionResponseDeserializerKta getiexceptionresponsedeserializerkta) {
        this.IconCompatParcelizer = getiexceptionresponsedeserializerkta;
    }

    public final /* synthetic */ void onNext(Object obj) {
        setScrollGesturesEnabledDuringRotateOrZoom setscrollgesturesenabledduringrotateorzoom = (setScrollGesturesEnabledDuringRotateOrZoom) obj;
        onGetStartedClick.write((Object) setscrollgesturesenabledduringrotateorzoom, "topUpRepeat");
        onGetStartedClick.write((Object) setscrollgesturesenabledduringrotateorzoom, "domain");
        parseEventFrame parseeventframe = new parseEventFrame(setscrollgesturesenabledduringrotateorzoom.MediaBrowserCompat$CustomActionResultReceiver, setscrollgesturesenabledduringrotateorzoom.MediaDescriptionCompat, setscrollgesturesenabledduringrotateorzoom.read, setscrollgesturesenabledduringrotateorzoom.MediaBrowserCompat$ItemReceiver, setscrollgesturesenabledduringrotateorzoom.MediaBrowserCompat$MediaItem, setscrollgesturesenabledduringrotateorzoom.write, setscrollgesturesenabledduringrotateorzoom.IconCompatParcelizer, setscrollgesturesenabledduringrotateorzoom.MediaBrowserCompat$SearchResultReceiver, setscrollgesturesenabledduringrotateorzoom.MediaMetadataCompat, setscrollgesturesenabledduringrotateorzoom.RatingCompat);
        onInfoWindowLongClick oninfowindowlongclick = new onInfoWindowLongClick();
        oninfowindowlongclick.MediaBrowserCompat$CustomActionResultReceiver = parseeventframe.IconCompatParcelizer;
        oninfowindowlongclick.AlertController$RecycleListView = "TOPUP";
        oninfowindowlongclick.setBackgroundResource = parseeventframe.write;
        oninfowindowlongclick.AppCompatDelegateImpl$ListMenuDecorView = setscrollgesturesenabledduringrotateorzoom.MediaDescriptionCompat;
        onGetStartedClick.IconCompatParcelizer((Object) oninfowindowlongclick, "FavouriteTarget()\n      …opUpRepeat.serviceNumber)");
        if (parseeventframe.MediaBrowserCompat$ItemReceiver != null) {
            oninfowindowlongclick.MediaBrowserCompat$MediaItem = Double.parseDouble(parseeventframe.MediaBrowserCompat$ItemReceiver);
            onGetStartedClick.IconCompatParcelizer((Object) oninfowindowlongclick, "favouriteTarget.withAmou…isplay.amount.toDouble())");
        }
        if (parseeventframe.read != null) {
            oninfowindowlongclick.AppCompatViewInflater = parseeventframe.read;
            onGetStartedClick.IconCompatParcelizer((Object) oninfowindowlongclick, "favouriteTarget.withRefN…pRepeatDisplay.ref2Label)");
        }
        this.IconCompatParcelizer.write.read.MediaBrowserCompat$CustomActionResultReceiver(oninfowindowlongclick);
        getIExceptionResponseDeserializerKta getiexceptionresponsedeserializerkta = this.IconCompatParcelizer;
        writeUInt64NoTag.IconCompatParcelizer getiexceptionresponsedeserializerkta_mediabrowsercompat_itemreceiver_mediabrowsercompat_itemreceiver = new C7116xa6672e80(this);
        boolean z = true;
        if (getiexceptionresponsedeserializerkta.RatingCompat != null) {
            getiexceptionresponsedeserializerkta_mediabrowsercompat_itemreceiver_mediabrowsercompat_itemreceiver.IconCompatParcelizer(getiexceptionresponsedeserializerkta.RatingCompat);
        }
        getIExceptionResponseDeserializerKta getiexceptionresponsedeserializerkta2 = this.IconCompatParcelizer;
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = IconCompatParcelizer.write;
        if (getiexceptionresponsedeserializerkta2.RatingCompat == null) {
            z = false;
        }
        if (z) {
            iconCompatParcelizer.IconCompatParcelizer(getiexceptionresponsedeserializerkta2.RatingCompat);
        }
    }

    public final void onComplete() {
        getIExceptionResponseDeserializerKta.MediaBrowserCompat$CustomActionResultReceiver(this.IconCompatParcelizer);
    }

    public final void onError(Throwable th) {
        onGetStartedClick.write((Object) th, "e");
        if (!this.IconCompatParcelizer.MediaBrowserCompat$SearchResultReceiver(th)) {
            getIExceptionResponseDeserializerKta.MediaBrowserCompat$CustomActionResultReceiver(this.IconCompatParcelizer);
            getIExceptionResponseDeserializerKta getiexceptionresponsedeserializerkta = this.IconCompatParcelizer;
            writeUInt64NoTag.IconCompatParcelizer read2 = new read(this, th);
            if (getiexceptionresponsedeserializerkta.RatingCompat != null) {
                read2.IconCompatParcelizer(getiexceptionresponsedeserializerkta.RatingCompat);
            }
        }
    }

    /* renamed from: o.getIExceptionResponseDeserializerKta$MediaBrowserCompat$ItemReceiver$read */
    static final class read<V> implements writeUInt64NoTag.IconCompatParcelizer<getTopLeftCornerWidth$MediaBrowserCompat$ItemReceiver> {
        private /* synthetic */ Throwable IconCompatParcelizer;
        private /* synthetic */ C7115x62c10464 MediaBrowserCompat$CustomActionResultReceiver;

        read(C7115x62c10464 getiexceptionresponsedeserializerkta_mediabrowsercompat_itemreceiver, Throwable th) {
            this.MediaBrowserCompat$CustomActionResultReceiver = getiexceptionresponsedeserializerkta_mediabrowsercompat_itemreceiver;
            this.IconCompatParcelizer = th;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer, access$2300.write.JUST_DISMISS));
        }
    }
}
