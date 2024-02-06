package p040o;

import com.google.android.gms.common.Scopes;
import java.util.List;
import p040o.AnalyticsConnector;
import p040o.access$2300;
import p040o.emptyIterator;
import p040o.writeUInt64NoTag;

/* renamed from: o.FirebaseVisionPoint */
public class FirebaseVisionPoint extends writeUInt64NoTag<setExtractionServer> {
    public final emptyIterator IconCompatParcelizer;
    public List<AnalyticsConnector.AnalyticsConnectorListener> MediaBrowserCompat$ItemReceiver = HmlNationalIdActivity.IconCompatParcelizer;
    public chain read;

    /* renamed from: o.FirebaseVisionPoint$IconCompatParcelizer */
    public static final class IconCompatParcelizer<V> implements writeUInt64NoTag.IconCompatParcelizer<setExtractionServer> {
        private /* synthetic */ List IconCompatParcelizer;

        public IconCompatParcelizer(List list) {
            this.IconCompatParcelizer = list;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((setExtractionServer) obj).MediaBrowserCompat$CustomActionResultReceiver(!this.IconCompatParcelizer.isEmpty());
        }
    }

    /* renamed from: o.FirebaseVisionPoint$MediaDescriptionCompat */
    public static final class MediaDescriptionCompat<V> implements writeUInt64NoTag.IconCompatParcelizer<setExtractionServer> {
        private /* synthetic */ FirebaseVisionPoint IconCompatParcelizer;
        private /* synthetic */ chain write;

        public MediaDescriptionCompat(FirebaseVisionPoint firebaseVisionPoint, chain chain) {
            this.IconCompatParcelizer = firebaseVisionPoint;
            this.write = chain;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            String str;
            setExtractionServer setextractionserver = (setExtractionServer) obj;
            boolean z = false;
            setextractionserver.MediaBrowserCompat$CustomActionResultReceiver(false);
            chain chain = this.write;
            if (chain == null || (str = chain.MediaDescriptionCompat) == null) {
                setextractionserver.read();
            } else {
                FirebaseVisionPoint firebaseVisionPoint = this.IconCompatParcelizer;
                onGetStartedClick.write((Object) str, "cardRef");
                writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = read.MediaBrowserCompat$ItemReceiver;
                if (firebaseVisionPoint.RatingCompat != null) {
                    z = true;
                }
                if (z) {
                    iconCompatParcelizer.IconCompatParcelizer(firebaseVisionPoint.RatingCompat);
                }
                emptyIterator emptyiterator = firebaseVisionPoint.IconCompatParcelizer;
                FundFactSheetActivity firebaseVisionPoint$MediaBrowserCompat$CustomActionResultReceiver = new C3389xf5d58cae(firebaseVisionPoint);
                FundFactSheetActivity write2 = new write(firebaseVisionPoint);
                onGetStartedClick.write((Object) str, "cardRef");
                onGetStartedClick.write((Object) firebaseVisionPoint$MediaBrowserCompat$CustomActionResultReceiver, "onSuccess");
                onGetStartedClick.write((Object) write2, "onError");
                emptyiterator.read.read(firebaseVisionPoint$MediaBrowserCompat$CustomActionResultReceiver, write2, new getNeedClientAuth$MediaBrowserCompat$ItemReceiver(str), new emptyIterator.read(emptyiterator), emptyiterator.MediaBrowserCompat$ItemReceiver);
            }
            setextractionserver.MediaBrowserCompat$CustomActionResultReceiver();
        }
    }

    /* renamed from: o.FirebaseVisionPoint$read */
    static final class read<V> implements writeUInt64NoTag.IconCompatParcelizer<setExtractionServer> {
        public static final read MediaBrowserCompat$ItemReceiver = new read();

        read() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((setExtractionServer) obj).AlertController$RecycleListView();
        }
    }

    /* renamed from: o.FirebaseVisionPoint$write */
    static final class write extends CheckEligibilityActivity implements FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> {
        final /* synthetic */ FirebaseVisionPoint MediaBrowserCompat$ItemReceiver;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        write(FirebaseVisionPoint firebaseVisionPoint) {
            super(1);
            this.MediaBrowserCompat$ItemReceiver = firebaseVisionPoint;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            final Throwable th = (Throwable) obj;
            onGetStartedClick.write((Object) th, "throwable");
            FirebaseVisionPoint firebaseVisionPoint = this.MediaBrowserCompat$ItemReceiver;
            writeUInt64NoTag.IconCompatParcelizer r1 = new writeUInt64NoTag.IconCompatParcelizer<setExtractionServer>(this) {
                private /* synthetic */ write write;

                {
                    this.write = r1;
                }

                public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                    setExtractionServer setextractionserver = (setExtractionServer) obj;
                    setextractionserver.aj_();
                    setextractionserver.write(this.write.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.NAVIGATE_BACK));
                }
            };
            if (firebaseVisionPoint.RatingCompat != null) {
                r1.IconCompatParcelizer(firebaseVisionPoint.RatingCompat);
            }
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    /* renamed from: o.FirebaseVisionPoint$MediaMetadataCompat */
    public static final class MediaMetadataCompat extends CheckEligibilityActivity implements FundFactSheetActivity<String, HmlVerifyPhoneValidateOtpActivity> {
        private /* synthetic */ FirebaseVisionPoint read;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public MediaMetadataCompat(FirebaseVisionPoint firebaseVisionPoint) {
            super(1);
            this.read = firebaseVisionPoint;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            String str = (String) obj;
            onGetStartedClick.write((Object) str, Scopes.EMAIL);
            FirebaseVisionPoint.write(this.read, str);
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public FirebaseVisionPoint(emptyIterator emptyiterator, RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) emptyiterator, "controller");
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        this.IconCompatParcelizer = emptyiterator;
    }

    public void onDestroy() {
        this.IconCompatParcelizer.IconCompatParcelizer();
        super.onDestroy();
    }

    public static final /* synthetic */ void write(FirebaseVisionPoint firebaseVisionPoint, String str) {
        chain chain = firebaseVisionPoint.read;
        if (chain != null) {
            writeUInt64NoTag.IconCompatParcelizer firebaseVisionPoint$MediaBrowserCompat$ItemReceiver = new FirebaseVisionPoint$MediaBrowserCompat$ItemReceiver(chain, firebaseVisionPoint, str);
            if (firebaseVisionPoint.RatingCompat != null) {
                firebaseVisionPoint$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(firebaseVisionPoint.RatingCompat);
            }
        }
    }
}
