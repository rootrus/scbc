package p040o;

import okhttp3.internal.cache.DiskLruCache;
import p040o.writeUInt64NoTag;

/* renamed from: o.mB */
public final class C4949mB extends writeUInt64NoTag<QuickExtractorListener> {
    public mB$MediaBrowserCompat$ItemReceiver IconCompatParcelizer = mB$MediaBrowserCompat$ItemReceiver.EASYAPP;
    public final getRootCause MediaBrowserCompat$ItemReceiver;
    /* access modifiers changed from: private */
    public String MediaBrowserCompat$MediaItem = "EASYAPP";
    /* access modifiers changed from: private */
    public final toLongArray MediaBrowserCompat$SearchResultReceiver;
    public final String read = DiskLruCache.VERSION_1;
    public String write = "";

    /* renamed from: o.mB$read */
    public static final class read<V> implements writeUInt64NoTag.IconCompatParcelizer<QuickExtractorListener> {
        private /* synthetic */ C4949mB MediaBrowserCompat$CustomActionResultReceiver;
        private /* synthetic */ String MediaBrowserCompat$ItemReceiver;

        public read(C4949mB mBVar, String str) {
            this.MediaBrowserCompat$CustomActionResultReceiver = mBVar;
            this.MediaBrowserCompat$ItemReceiver = str;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            QuickExtractorListener quickExtractorListener = (QuickExtractorListener) obj;
            quickExtractorListener.aj_();
            int i = C4945login.write[this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer.ordinal()];
            if (i == 1 || i == 2 || i == 3) {
                quickExtractorListener.read(this.MediaBrowserCompat$ItemReceiver);
            } else if (i == 4) {
                quickExtractorListener.write();
            }
        }
    }

    /* renamed from: o.mB$write */
    public static final class write<V> implements writeUInt64NoTag.IconCompatParcelizer<QuickExtractorListener> {
        private /* synthetic */ C4949mB IconCompatParcelizer;

        public write(C4949mB mBVar) {
            this.IconCompatParcelizer = mBVar;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((QuickExtractorListener) obj).read(toLongArray.MediaBrowserCompat$CustomActionResultReceiver(this.IconCompatParcelizer.MediaBrowserCompat$SearchResultReceiver, (String) null, this.IconCompatParcelizer.MediaBrowserCompat$MediaItem, (String) null, (String) null, true, false, (String) null, 72));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public C4949mB(getRootCause getrootcause, toLongArray tolongarray, RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) getrootcause, "registrationTcCase");
        onGetStartedClick.write((Object) tolongarray, "termsAndConditionsMapper");
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        this.MediaBrowserCompat$ItemReceiver = getrootcause;
        this.MediaBrowserCompat$SearchResultReceiver = tolongarray;
    }
}
