package p040o;

import p040o.AppMeasurementSdk;
import p040o.writeUInt64NoTag;

/* renamed from: o.IDeserializer */
public final class IDeserializer extends writeUInt64NoTag<C1242x22fefaeb> {
    public String IconCompatParcelizer;
    private final AppMeasurementSdk.EventInterceptor MediaBrowserCompat$ItemReceiver;
    public getLog read;
    final toLongArray write;

    /* renamed from: o.IDeserializer$IconCompatParcelizer */
    public static final class IconCompatParcelizer<V> implements writeUInt64NoTag.IconCompatParcelizer<C1242x22fefaeb> {
        public static final IconCompatParcelizer IconCompatParcelizer = new IconCompatParcelizer();

        IconCompatParcelizer() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((C1242x22fefaeb) obj).write();
        }
    }

    /* renamed from: o.IDeserializer$read */
    public static final class read<V> implements writeUInt64NoTag.IconCompatParcelizer<C1242x22fefaeb> {
        private /* synthetic */ IDeserializer read;

        public read(IDeserializer iDeserializer) {
            this.read = iDeserializer;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((C1242x22fefaeb) obj).IconCompatParcelizer(IDeserializer.write(this.read));
        }
    }

    public static final /* synthetic */ getLog write(IDeserializer iDeserializer) {
        getLog getlog = iDeserializer.read;
        if (getlog == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mPrepaidRequestLandingDisplay");
        }
        return getlog;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public IDeserializer(RegularImmutableBiMap regularImmutableBiMap, toLongArray tolongarray, AppMeasurementSdk.EventInterceptor eventInterceptor) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        onGetStartedClick.write((Object) tolongarray, "termsAndConditionsMapper");
        onGetStartedClick.write((Object) eventInterceptor, "prepaidTermsConditionsCase");
        this.write = tolongarray;
        this.MediaBrowserCompat$ItemReceiver = eventInterceptor;
    }

    public final void onDestroy() {
        AppMeasurementSdk.EventInterceptor eventInterceptor = this.MediaBrowserCompat$ItemReceiver;
        if (!eventInterceptor.MediaBrowserCompat$MediaItem.isDisposed()) {
            eventInterceptor.MediaBrowserCompat$MediaItem.dispose();
        }
        super.onDestroy();
    }
}
