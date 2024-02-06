package p040o;

import p040o.Predicates;
import p040o.writeUInt64NoTag;

/* renamed from: o.nQ */
public final class C5017nQ extends writeUInt64NoTag<setRequestTimeout> {
    public final Predicates.InstanceOfPredicate IconCompatParcelizer;
    /* access modifiers changed from: private */
    public final LittleEndianDataOutputStream MediaBrowserCompat$ItemReceiver;

    /* renamed from: o.nQ$IconCompatParcelizer */
    public static final class IconCompatParcelizer<T> implements DebitCardMarketConductDeepLinkActivity<onMapClick> {
        private /* synthetic */ C5017nQ write;

        public IconCompatParcelizer(C5017nQ nQVar) {
            this.write = nQVar;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            onMapClick onmapclick = (onMapClick) obj;
            LittleEndianDataOutputStream unused = this.write.MediaBrowserCompat$ItemReceiver;
            onGetStartedClick.IconCompatParcelizer((Object) onmapclick, "it");
            onGetStartedClick.write((Object) onmapclick, "domain");
            final setBackground setbackground = new setBackground(LittleEndianDataOutputStream.IconCompatParcelizer(onmapclick.MediaBrowserCompat$ItemReceiver));
            C5017nQ nQVar = this.write;
            writeUInt64NoTag.IconCompatParcelizer r1 = new writeUInt64NoTag.IconCompatParcelizer<setRequestTimeout>() {
                public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                    ((setRequestTimeout) obj).write(setbackground);
                }
            };
            if (nQVar.RatingCompat != null) {
                r1.IconCompatParcelizer(nQVar.RatingCompat);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public C5017nQ(RegularImmutableBiMap regularImmutableBiMap, Predicates.InstanceOfPredicate instanceOfPredicate, LittleEndianDataOutputStream littleEndianDataOutputStream) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        onGetStartedClick.write((Object) instanceOfPredicate, "saveAddressCase");
        onGetStartedClick.write((Object) littleEndianDataOutputStream, "userAddressDisplayMapper");
        this.IconCompatParcelizer = instanceOfPredicate;
        this.MediaBrowserCompat$ItemReceiver = littleEndianDataOutputStream;
    }

    public final void onDestroy() {
        Predicates.InstanceOfPredicate instanceOfPredicate = this.IconCompatParcelizer;
        if (!instanceOfPredicate.MediaBrowserCompat$MediaItem.isDisposed()) {
            instanceOfPredicate.MediaBrowserCompat$MediaItem.dispose();
        }
        super.onDestroy();
    }
}
