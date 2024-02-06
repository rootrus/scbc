package p040o;

import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.getBackendType */
public final class getBackendType extends writeUInt64NoTag<C7511tU> {
    public removeActivityTransitionUpdates IconCompatParcelizer;
    public final setSelectedTabIndicatorColor MediaBrowserCompat$ItemReceiver;

    /* renamed from: o.getBackendType$IconCompatParcelizer */
    public static final class IconCompatParcelizer<V> implements writeUInt64NoTag.IconCompatParcelizer<C7511tU> {
        public static final IconCompatParcelizer MediaBrowserCompat$ItemReceiver = new IconCompatParcelizer();

        IconCompatParcelizer() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((C7511tU) obj).MediaBrowserCompat$ItemReceiver();
        }
    }

    /* renamed from: o.getBackendType$read */
    public static final class read<V> implements writeUInt64NoTag.IconCompatParcelizer<C7511tU> {
        public static final read MediaBrowserCompat$ItemReceiver = new read();

        read() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((C7511tU) obj).MediaBrowserCompat$MediaItem();
        }
    }

    /* renamed from: o.getBackendType$write */
    public static final class write<V> implements writeUInt64NoTag.IconCompatParcelizer<C7511tU> {
        public static final write MediaBrowserCompat$ItemReceiver = new write();

        write() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((C7511tU) obj).read();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public getBackendType(RegularImmutableBiMap regularImmutableBiMap, setSelectedTabIndicatorColor setselectedtabindicatorcolor) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        onGetStartedClick.write((Object) setselectedtabindicatorcolor, "hmlNTBeKYCLandingCase");
        this.MediaBrowserCompat$ItemReceiver = setselectedtabindicatorcolor;
    }

    /* renamed from: o.getBackendType$MediaMetadataCompat */
    public static final class MediaMetadataCompat extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<HmlVerifyPhoneValidateOtpActivity> {
        private /* synthetic */ getBackendType MediaBrowserCompat$ItemReceiver;

        public MediaMetadataCompat(getBackendType getbackendtype) {
            this.MediaBrowserCompat$ItemReceiver = getbackendtype;
        }

        public final void onError(Throwable th) {
            onGetStartedClick.write((Object) th, "e");
            super.onError(th);
            this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
        }

        public final void onComplete() {
            super.onComplete();
            getBackendType getbackendtype = this.MediaBrowserCompat$ItemReceiver;
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C4505xc5414956.MediaBrowserCompat$ItemReceiver;
            if (getbackendtype.RatingCompat != null) {
                iconCompatParcelizer.IconCompatParcelizer(getbackendtype.RatingCompat);
            }
            getBackendType.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver);
        }
    }

    public final void onDestroy() {
        setSelectedTabIndicatorColor setselectedtabindicatorcolor = this.MediaBrowserCompat$ItemReceiver;
        if (!setselectedtabindicatorcolor.MediaBrowserCompat$MediaItem.isDisposed()) {
            setselectedtabindicatorcolor.MediaBrowserCompat$MediaItem.dispose();
        }
        super.onDestroy();
    }

    public static final /* synthetic */ void MediaBrowserCompat$ItemReceiver(getBackendType getbackendtype) {
        if (getbackendtype.RatingCompat != null) {
            getbackendtype.RatingCompat.aj_();
        }
    }
}
