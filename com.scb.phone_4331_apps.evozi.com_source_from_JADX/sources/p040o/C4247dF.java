package p040o;

import java.io.File;
import p040o.Iterables;
import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.dF */
public final class C4247dF extends C4066bA<ImageField$MediaBrowserCompat$ItemReceiver> {
    public final Iterables.C352212 MediaBrowserCompat$ItemReceiver;
    private final MapConstraints MediaBrowserCompat$SearchResultReceiver;
    public String read;

    /* renamed from: o.dF$write */
    static final class write extends CheckEligibilityActivity implements FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> {
        private /* synthetic */ C4247dF IconCompatParcelizer;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        write(C4247dF dFVar) {
            super(1);
            this.IconCompatParcelizer = dFVar;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            onGetStartedClick.write((Object) th, "it");
            this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public C4247dF(RegularImmutableBiMap regularImmutableBiMap, Tile tile, MapConstraints mapConstraints, Iterables.C352212 r5) {
        super(regularImmutableBiMap, tile);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        onGetStartedClick.write((Object) tile, "livenessCase");
        onGetStartedClick.write((Object) mapConstraints, "mController");
        onGetStartedClick.write((Object) r5, "ekycEntryPointCase");
        this.MediaBrowserCompat$SearchResultReceiver = mapConstraints;
        this.MediaBrowserCompat$ItemReceiver = r5;
    }

    public final void MediaBrowserCompat$ItemReceiver(File file) {
        onGetStartedClick.write((Object) file, "file");
        MapConstraints mapConstraints = this.MediaBrowserCompat$SearchResultReceiver;
        FundActionsSuccessActivity read2 = new read(this);
        FundFactSheetActivity write2 = new write(this);
        String absolutePath = file.getAbsolutePath();
        onGetStartedClick.IconCompatParcelizer((Object) absolutePath, "file.absolutePath");
        newLatLngBounds newlatlngbounds = this.IconCompatParcelizer;
        onGetStartedClick.IconCompatParcelizer((Object) newlatlngbounds, "faceDetectFrame");
        int i = newlatlngbounds.MediaBrowserCompat$ItemReceiver;
        newLatLngBounds newlatlngbounds2 = this.IconCompatParcelizer;
        onGetStartedClick.IconCompatParcelizer((Object) newlatlngbounds2, "faceDetectFrame");
        int i2 = newlatlngbounds2.IconCompatParcelizer;
        newLatLngBounds newlatlngbounds3 = this.IconCompatParcelizer;
        onGetStartedClick.IconCompatParcelizer((Object) newlatlngbounds3, "faceDetectFrame");
        int i3 = newlatlngbounds3.RatingCompat;
        newLatLngBounds newlatlngbounds4 = this.IconCompatParcelizer;
        onGetStartedClick.IconCompatParcelizer((Object) newlatlngbounds4, "faceDetectFrame");
        int i4 = newlatlngbounds4.MediaMetadataCompat;
        newLatLngBounds newlatlngbounds5 = this.IconCompatParcelizer;
        onGetStartedClick.IconCompatParcelizer((Object) newlatlngbounds5, "faceDetectFrame");
        int i5 = newlatlngbounds5.read;
        newLatLngBounds newlatlngbounds6 = this.IconCompatParcelizer;
        onGetStartedClick.IconCompatParcelizer((Object) newlatlngbounds6, "faceDetectFrame");
        HttpMethod httpMethod = new HttpMethod(absolutePath, i, i2, i5, newlatlngbounds6.write, i3, i4);
        onGetStartedClick.write((Object) read2, "onSuccess");
        onGetStartedClick.write((Object) write2, "onError");
        onGetStartedClick.write((Object) httpMethod, "model");
        mapConstraints.MediaBrowserCompat$ItemReceiver(mapConstraints.MediaBrowserCompat$CustomActionResultReceiver, new MapConstraints$MediaBrowserCompat$ItemReceiver(read2), write2, new FinalizableSoftReference$MediaBrowserCompat$ItemReceiver(httpMethod.MediaBrowserCompat$SearchResultReceiver, httpMethod.IconCompatParcelizer, httpMethod.RatingCompat, httpMethod.read, httpMethod.MediaBrowserCompat$CustomActionResultReceiver, httpMethod.write, httpMethod.MediaBrowserCompat$ItemReceiver));
    }

    /* renamed from: o.dF$read */
    static final class read extends CheckEligibilityActivity implements FundActionsSuccessActivity<HmlVerifyPhoneValidateOtpActivity> {
        final /* synthetic */ C4247dF read;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        read(C4247dF dFVar) {
            super(0);
            this.read = dFVar;
        }

        public final /* synthetic */ Object invoke() {
            C4247dF.read(this.read);
            C4247dF dFVar = this.read;
            writeUInt64NoTag.IconCompatParcelizer r1 = new writeUInt64NoTag.IconCompatParcelizer<ImageField$MediaBrowserCompat$ItemReceiver>(this) {
                private /* synthetic */ read read;

                {
                    this.read = r1;
                }

                public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                    ImageField$MediaBrowserCompat$ItemReceiver imageField$MediaBrowserCompat$ItemReceiver = (ImageField$MediaBrowserCompat$ItemReceiver) obj;
                    if (this.read.read.read != null) {
                        String write = this.read.read.read;
                        if (write != null) {
                            int hashCode = write.hashCode();
                            if (hashCode != 78) {
                                if (hashCode == 89 && write.equals("Y")) {
                                    imageField$MediaBrowserCompat$ItemReceiver.write();
                                    return;
                                }
                            } else if (write.equals("N")) {
                                imageField$MediaBrowserCompat$ItemReceiver.read();
                                return;
                            }
                        }
                        imageField$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver();
                        return;
                    }
                    imageField$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver();
                }
            };
            if (dFVar.RatingCompat != null) {
                r1.IconCompatParcelizer(dFVar.RatingCompat);
            }
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    public static final /* synthetic */ void read(C4247dF dFVar) {
        if (dFVar.RatingCompat != null) {
            dFVar.RatingCompat.aj_();
        }
    }

    public final void MediaMetadataCompat(Throwable th) {
        onGetStartedClick.write((Object) th, "throwable");
        MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
    }
}
