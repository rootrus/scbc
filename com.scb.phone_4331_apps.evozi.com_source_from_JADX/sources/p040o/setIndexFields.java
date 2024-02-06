package p040o;

import p040o.access$2300;
import p040o.writeUInt64NoTag;
import p040o.zzct;

/* renamed from: o.setIndexFields */
public final class setIndexFields extends getScanSettings {
    final zzct.zza MediaBrowserCompat$ItemReceiver = zzct.zza.CONSUMER;
    private final getStartFinalizer MediaDescriptionCompat;
    private final newImageLabeler write;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public setIndexFields(setContentScrimColor setcontentscrimcolor, BottomSheetBehavior bottomSheetBehavior, getStartFinalizer getstartfinalizer, newImageLabeler newimagelabeler, TextRecognizer textRecognizer, complementOf complementof, RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap, setcontentscrimcolor, bottomSheetBehavior, textRecognizer, complementof);
        onGetStartedClick.write((Object) setcontentscrimcolor, "getCalculatorData");
        onGetStartedClick.write((Object) bottomSheetBehavior, "resetCalculatorCase");
        onGetStartedClick.write((Object) getstartfinalizer, "getNtbUserInfoUseCase");
        onGetStartedClick.write((Object) newimagelabeler, "checkNTBLoginSession");
        onGetStartedClick.write((Object) textRecognizer, "hmlConsentCase");
        onGetStartedClick.write((Object) complementof, "displayMapper");
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        this.MediaDescriptionCompat = getstartfinalizer;
        this.write = newimagelabeler;
    }

    /* access modifiers changed from: protected */
    public final zzct.zza read() {
        return this.MediaBrowserCompat$ItemReceiver;
    }

    /* renamed from: o.setIndexFields$read */
    public static final class read extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<Boolean> {
        private /* synthetic */ boolean MediaBrowserCompat$CustomActionResultReceiver;
        final /* synthetic */ setIndexFields read;

        /* renamed from: o.setIndexFields$read$IconCompatParcelizer */
        static final class IconCompatParcelizer<V> implements writeUInt64NoTag.IconCompatParcelizer<proxyGetIPassportDeserializerRtti> {
            private /* synthetic */ read MediaBrowserCompat$CustomActionResultReceiver;

            IconCompatParcelizer(read read) {
                this.MediaBrowserCompat$CustomActionResultReceiver = read;
            }

            public final /* bridge */ /* synthetic */ void IconCompatParcelizer(Object obj) {
                ((proxyGetIPassportDeserializerRtti) obj).IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver.read.MediaBrowserCompat$ItemReceiver);
            }
        }

        /* renamed from: o.setIndexFields$read$read  reason: collision with other inner class name */
        static final class C10817read<V> implements writeUInt64NoTag.IconCompatParcelizer<proxyGetIPassportDeserializerRtti> {
            public static final C10817read read = new C10817read();

            C10817read() {
            }

            public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                ((proxyGetIPassportDeserializerRtti) obj).read();
            }
        }

        read(setIndexFields setindexfields, boolean z) {
            this.read = setindexfields;
            this.MediaBrowserCompat$CustomActionResultReceiver = z;
        }

        public final /* synthetic */ void onNext(Object obj) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            super.onNext(Boolean.valueOf(booleanValue));
            setIndexFields.IconCompatParcelizer(this.read);
            boolean z = true;
            if (booleanValue) {
                setIndexFields setindexfields = this.read;
                writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(this);
                if (setindexfields.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    iconCompatParcelizer.IconCompatParcelizer(setindexfields.RatingCompat);
                }
            } else if (this.MediaBrowserCompat$CustomActionResultReceiver) {
                setIndexFields setindexfields2 = this.read;
                writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer2 = C10817read.read;
                if (setindexfields2.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    iconCompatParcelizer2.IconCompatParcelizer(setindexfields2.RatingCompat);
                }
            } else {
                setIndexFields setindexfields3 = this.read;
                writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer3 = setIndexFields$read$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver;
                if (setindexfields3.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    iconCompatParcelizer3.IconCompatParcelizer(setindexfields3.RatingCompat);
                }
            }
        }

        public final void onError(Throwable th) {
            onGetStartedClick.write((Object) th, "e");
            this.read.MediaBrowserCompat$ItemReceiver(this.read.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.NAVIGATE_BACK));
            super.onError(th);
        }
    }

    public static final /* synthetic */ void IconCompatParcelizer(setIndexFields setindexfields) {
        if (setindexfields.RatingCompat != null) {
            setindexfields.RatingCompat.aj_();
        }
    }

    public final void IconCompatParcelizer() {
        Boolean bool;
        boolean z = false;
        if (this.RatingCompat != null) {
            this.RatingCompat.AlertController$RecycleListView();
        }
        setBearing read2 = this.MediaDescriptionCompat.write.read();
        if (!(read2 == null || (bool = read2.MediaBrowserCompat$MediaItem) == null)) {
            z = bool.booleanValue();
        }
        this.write.write(this.write.MediaBrowserCompat$ItemReceiver(), new read(this, z));
    }
}
