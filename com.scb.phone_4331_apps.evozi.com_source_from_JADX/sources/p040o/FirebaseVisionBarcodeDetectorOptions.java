package p040o;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import p040o.access$2300;

/* renamed from: o.FirebaseVisionBarcodeDetectorOptions */
public class FirebaseVisionBarcodeDetectorOptions extends writeUInt64NoTag<CreditCardCaptureModule_GetLookAndFeelParametersFactory> {
    public logEventNoInterceptor IconCompatParcelizer;
    public newTreeMap MediaBrowserCompat$ItemReceiver;

    @HmlPinActivity
    public FirebaseVisionBarcodeDetectorOptions(RegularImmutableBiMap regularImmutableBiMap, logEventNoInterceptor logeventnointerceptor, newTreeMap newtreemap) {
        super(regularImmutableBiMap);
        this.IconCompatParcelizer = logeventnointerceptor;
        this.MediaBrowserCompat$ItemReceiver = newtreemap;
    }

    /* renamed from: o.FirebaseVisionBarcodeDetectorOptions$Builder */
    public class Builder extends writeUInt64NoTag<C7270xd74a7180> {
        public String IconCompatParcelizer;
        public getLocalPort MediaBrowserCompat$ItemReceiver;
        /* access modifiers changed from: private */
        public String MediaBrowserCompat$SearchResultReceiver;
        /* access modifiers changed from: private */
        public safeContainsKey MediaMetadataCompat;
        public notifyBackgroundStateChangeListeners read;
        public String write;

        @HmlPinActivity
        public Builder(RegularImmutableBiMap regularImmutableBiMap, getLocalPort getlocalport, safeContainsKey safecontainskey, unmodifiableEntrySet unmodifiableentryset) {
            super(regularImmutableBiMap);
            this.MediaBrowserCompat$ItemReceiver = getlocalport;
            this.MediaMetadataCompat = safecontainskey;
        }

        /* renamed from: o.FirebaseVisionBarcodeDetectorOptions$Builder$write */
        public class write extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<onOpen> {
            private write() {
            }

            public /* synthetic */ write(Builder builder, byte b) {
                this();
            }

            public final /* synthetic */ void onNext(Object obj) {
                if (((onOpen) obj).read) {
                    Builder builder = Builder.this;
                    getTransport gettransport = getTransport.IconCompatParcelizer;
                    if (builder.RatingCompat != null) {
                        gettransport.IconCompatParcelizer(builder.RatingCompat);
                    }
                }
            }

            public final void onComplete() {
                Builder.MediaBrowserCompat$ItemReceiver(Builder.this);
            }

            public final void onError(Throwable th) {
                if (!Builder.this.MediaBrowserCompat$SearchResultReceiver(th)) {
                    Builder.write(Builder.this);
                    Builder builder = Builder.this;
                    builder.MediaBrowserCompat$ItemReceiver(builder.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.NAVIGATE_BACK));
                }
            }
        }

        public static List<String> IconCompatParcelizer() {
            int i = GregorianCalendar.getInstance().get(1);
            ArrayList arrayList = new ArrayList(15);
            arrayList.add("YYYY");
            StringBuilder sb = new StringBuilder();
            sb.append(i);
            String obj = sb.toString();
            for (int i2 = 0; i2 < 15; i2++) {
                arrayList.add(obj);
                i++;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(i);
                obj = sb2.toString();
            }
            return arrayList;
        }

        static /* synthetic */ void read(Builder builder) {
            if (builder.RatingCompat != null) {
                builder.RatingCompat.aj_();
            }
        }

        static /* synthetic */ void IconCompatParcelizer(Builder builder) {
            if (builder.RatingCompat != null) {
                builder.RatingCompat.aj_();
            }
        }

        static /* synthetic */ void MediaBrowserCompat$ItemReceiver(Builder builder) {
            if (builder.RatingCompat != null) {
                builder.RatingCompat.aj_();
            }
        }

        static /* synthetic */ void write(Builder builder) {
            if (builder.RatingCompat != null) {
                builder.RatingCompat.aj_();
            }
        }
    }
}
