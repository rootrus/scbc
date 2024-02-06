package p040o;

import android.content.res.Resources;
import com.scb.phone.domain.errors.RetrofitException;
import java.io.File;
import kotlin.TypeCastException;
import p040o.ILocationSourceDelegate;
import p040o.Lists;
import p040o.QuickExtractorAgent;
import p040o.access$2300;
import p040o.startFinalizer;
import p040o.writeUInt64NoTag;

/* renamed from: o.my */
public final class C4982my extends C4066bA<QuickExtractorAgent.C7021a> {
    public parseProcMapsJsonFromStream MediaBrowserCompat$ItemReceiver;
    private final Lists.StringAsImmutableList MediaBrowserCompat$MediaItem;
    private final Resources MediaMetadataCompat;
    public onMarkerClick read;

    /* renamed from: o.my$IconCompatParcelizer */
    static final class IconCompatParcelizer<V> implements writeUInt64NoTag.IconCompatParcelizer<QuickExtractorAgent.C7021a> {
        private /* synthetic */ C4982my MediaBrowserCompat$CustomActionResultReceiver;

        IconCompatParcelizer(C4982my myVar) {
            this.MediaBrowserCompat$CustomActionResultReceiver = myVar;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((QuickExtractorAgent.C7021a) obj).MediaBrowserCompat$CustomActionResultReceiver(C4982my.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$CustomActionResultReceiver));
        }
    }

    /* renamed from: o.my$MediaDescriptionCompat */
    static final class MediaDescriptionCompat extends CheckEligibilityActivity implements FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> {
        private /* synthetic */ C4982my MediaBrowserCompat$CustomActionResultReceiver;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        MediaDescriptionCompat(C4982my myVar) {
            super(1);
            this.MediaBrowserCompat$CustomActionResultReceiver = myVar;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            onGetStartedClick.write((Object) th, "throwable");
            C4982my.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$CustomActionResultReceiver, th);
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    /* renamed from: o.my$MediaMetadataCompat */
    static final class MediaMetadataCompat extends CheckEligibilityActivity implements FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> {
        private /* synthetic */ C4982my write;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        MediaMetadataCompat(C4982my myVar) {
            super(1);
            this.write = myVar;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            onGetStartedClick.write((Object) th, "throwable");
            C4982my.MediaBrowserCompat$CustomActionResultReceiver(this.write, th);
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    public static final /* synthetic */ onMarkerClick MediaBrowserCompat$CustomActionResultReceiver(C4982my myVar) {
        onMarkerClick onmarkerclick = myVar.read;
        if (onmarkerclick == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mVerifiedMethod");
        }
        return onmarkerclick;
    }

    public static final /* synthetic */ parseProcMapsJsonFromStream MediaBrowserCompat$ItemReceiver(C4982my myVar) {
        parseProcMapsJsonFromStream parseprocmapsjsonfromstream = myVar.MediaBrowserCompat$ItemReceiver;
        if (parseprocmapsjsonfromstream == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mFlowType");
        }
        return parseprocmapsjsonfromstream;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public C4982my(RegularImmutableBiMap regularImmutableBiMap, Lists.StringAsImmutableList stringAsImmutableList, Resources resources, Tile tile) {
        super(regularImmutableBiMap, tile);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        onGetStartedClick.write((Object) stringAsImmutableList, "mController");
        onGetStartedClick.write((Object) resources, "mResources");
        onGetStartedClick.write((Object) tile, "livenessCase");
        this.MediaBrowserCompat$MediaItem = stringAsImmutableList;
        this.MediaMetadataCompat = resources;
    }

    public final void MediaBrowserCompat$ItemReceiver(File file) {
        File file2 = file;
        onGetStartedClick.write((Object) file2, "file");
        parseProcMapsJsonFromStream parseprocmapsjsonfromstream = this.MediaBrowserCompat$ItemReceiver;
        if (parseprocmapsjsonfromstream == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mFlowType");
        }
        if (parseprocmapsjsonfromstream == parseProcMapsJsonFromStream.FAST_EASY) {
            String valueOf = String.valueOf(System.currentTimeMillis());
            String read2 = read(file2, valueOf);
            Lists.StringAsImmutableList stringAsImmutableList = this.MediaBrowserCompat$MediaItem;
            FundActionsSuccessActivity ratingCompat = new RatingCompat(this);
            FundFactSheetActivity mediaDescriptionCompat = new MediaDescriptionCompat(this);
            String absolutePath = file.getAbsolutePath();
            onGetStartedClick.IconCompatParcelizer((Object) absolutePath, "file.absolutePath");
            newLatLngBounds newlatlngbounds = this.IconCompatParcelizer;
            onGetStartedClick.IconCompatParcelizer((Object) newlatlngbounds, "faceDetectFrame");
            int i = newlatlngbounds.MediaBrowserCompat$ItemReceiver;
            newLatLngBounds newlatlngbounds2 = this.IconCompatParcelizer;
            onGetStartedClick.IconCompatParcelizer((Object) newlatlngbounds2, "faceDetectFrame");
            int i2 = newlatlngbounds2.IconCompatParcelizer;
            onGetStartedClick.IconCompatParcelizer((Object) read2, "imageHash");
            onGetStartedClick.write((Object) ratingCompat, "onSuccess");
            onGetStartedClick.write((Object) mediaDescriptionCompat, "onError");
            onGetStartedClick.write((Object) absolutePath, "imagePath");
            onGetStartedClick.write((Object) read2, "imageHash");
            onGetStartedClick.write((Object) valueOf, "timestamp");
            stringAsImmutableList.MediaBrowserCompat$ItemReceiver(stringAsImmutableList.MediaBrowserCompat$CustomActionResultReceiver, new Lists.StringAsImmutableList.read(ratingCompat), mediaDescriptionCompat, new startFinalizer.IconCompatParcelizer(absolutePath, i, i2, read2, valueOf));
            return;
        }
        String valueOf2 = String.valueOf(System.currentTimeMillis());
        String read3 = read(file2, valueOf2);
        Lists.StringAsImmutableList stringAsImmutableList2 = this.MediaBrowserCompat$MediaItem;
        FundFactSheetActivity my_mediabrowsercompat_mediaitem = new my$MediaBrowserCompat$MediaItem(this);
        FundFactSheetActivity mediaMetadataCompat = new MediaMetadataCompat(this);
        String absolutePath2 = file.getAbsolutePath();
        onGetStartedClick.IconCompatParcelizer((Object) absolutePath2, "file.absolutePath");
        newLatLngBounds newlatlngbounds3 = this.IconCompatParcelizer;
        onGetStartedClick.IconCompatParcelizer((Object) newlatlngbounds3, "faceDetectFrame");
        int i3 = newlatlngbounds3.MediaBrowserCompat$ItemReceiver;
        newLatLngBounds newlatlngbounds4 = this.IconCompatParcelizer;
        onGetStartedClick.IconCompatParcelizer((Object) newlatlngbounds4, "faceDetectFrame");
        int i4 = newlatlngbounds4.IconCompatParcelizer;
        onGetStartedClick.IconCompatParcelizer((Object) read3, "imageHash");
        onGetStartedClick.write((Object) my_mediabrowsercompat_mediaitem, "onSuccess");
        onGetStartedClick.write((Object) mediaMetadataCompat, "onError");
        onGetStartedClick.write((Object) absolutePath2, "imagePath");
        onGetStartedClick.write((Object) read3, "imageHash");
        onGetStartedClick.write((Object) valueOf2, "timestamp");
        stringAsImmutableList2.IconCompatParcelizer(stringAsImmutableList2.write, my_mediabrowsercompat_mediaitem, mediaMetadataCompat, new propagate$MediaBrowserCompat$ItemReceiver(absolutePath2, i3, i4, read3, valueOf2));
    }

    /* renamed from: o.my$write */
    static final class write implements Runnable {
        private /* synthetic */ C4982my write;

        write(C4982my myVar) {
            this.write = myVar;
        }

        /* JADX WARNING: type inference failed for: r2v4, types: [o.mA] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r3 = this;
                o.my r0 = r3.write
                o.my$write$4 r1 = p040o.C4982my.write.C49854.write
                o.FundFactSheetActivity r1 = (p040o.FundFactSheetActivity) r1
                if (r1 == 0) goto L_0x000e
                o.mA r2 = new o.mA
                r2.<init>(r1)
                r1 = r2
            L_0x000e:
                o.writeUInt64NoTag$IconCompatParcelizer r1 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r1
                T r2 = r0.RatingCompat
                if (r2 == 0) goto L_0x0016
                r2 = 1
                goto L_0x0017
            L_0x0016:
                r2 = 0
            L_0x0017:
                if (r2 == 0) goto L_0x001e
                T r0 = r0.RatingCompat
                r1.IconCompatParcelizer(r0)
            L_0x001e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.C4982my.write.run():void");
        }
    }

    /* renamed from: o.my$read */
    static final class read implements Runnable {
        private /* synthetic */ C4982my MediaBrowserCompat$CustomActionResultReceiver;

        read(C4982my myVar) {
            this.MediaBrowserCompat$CustomActionResultReceiver = myVar;
        }

        /* JADX WARNING: type inference failed for: r2v4, types: [o.mA] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r3 = this;
                o.my r0 = r3.MediaBrowserCompat$CustomActionResultReceiver
                o.my$read$4 r1 = p040o.C4982my.read.C49844.MediaBrowserCompat$CustomActionResultReceiver
                o.FundFactSheetActivity r1 = (p040o.FundFactSheetActivity) r1
                if (r1 == 0) goto L_0x000e
                o.mA r2 = new o.mA
                r2.<init>(r1)
                r1 = r2
            L_0x000e:
                o.writeUInt64NoTag$IconCompatParcelizer r1 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r1
                T r2 = r0.RatingCompat
                if (r2 == 0) goto L_0x0016
                r2 = 1
                goto L_0x0017
            L_0x0016:
                r2 = 0
            L_0x0017:
                if (r2 == 0) goto L_0x001e
                T r0 = r0.RatingCompat
                r1.IconCompatParcelizer(r0)
            L_0x001e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.C4982my.read.run():void");
        }
    }

    /* renamed from: o.my$RatingCompat */
    static final class RatingCompat extends CheckEligibilityActivity implements FundActionsSuccessActivity<HmlVerifyPhoneValidateOtpActivity> {
        private /* synthetic */ C4982my MediaBrowserCompat$ItemReceiver;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        RatingCompat(C4982my myVar) {
            super(0);
            this.MediaBrowserCompat$ItemReceiver = myVar;
        }

        /* JADX WARNING: type inference failed for: r2v4, types: [o.mA] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object invoke() {
            /*
                r3 = this;
                o.my r0 = r3.MediaBrowserCompat$ItemReceiver
                p040o.C4982my.write(r0)
                o.my r0 = r3.MediaBrowserCompat$ItemReceiver
                o.my$RatingCompat$3 r1 = p040o.C4982my.RatingCompat.C49833.read
                o.FundFactSheetActivity r1 = (p040o.FundFactSheetActivity) r1
                if (r1 == 0) goto L_0x0013
                o.mA r2 = new o.mA
                r2.<init>(r1)
                r1 = r2
            L_0x0013:
                o.writeUInt64NoTag$IconCompatParcelizer r1 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r1
                T r2 = r0.RatingCompat
                if (r2 == 0) goto L_0x001b
                r2 = 1
                goto L_0x001c
            L_0x001b:
                r2 = 0
            L_0x001c:
                if (r2 == 0) goto L_0x0023
                T r0 = r0.RatingCompat
                r1.IconCompatParcelizer(r0)
            L_0x0023:
                o.HmlVerifyPhoneValidateOtpActivity r0 = p040o.HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.C4982my.RatingCompat.invoke():java.lang.Object");
        }
    }

    public static final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(C4982my myVar, Throwable th) {
        String str;
        ILocationSourceDelegate.zza zza;
        boolean z = true;
        if (myVar.RatingCompat != null) {
            myVar.RatingCompat.aj_();
        }
        if (th != null) {
            ILocationSourceDelegate iLocationSourceDelegate = ((RetrofitException) th).IconCompatParcelizer;
            if (iLocationSourceDelegate == null || (zza = iLocationSourceDelegate.write) == null) {
                str = null;
            } else {
                str = zza.IconCompatParcelizer;
            }
            if (str != null) {
                int hashCode = str.hashCode();
                if (hashCode != 1567041) {
                    if (hashCode == 1567043 && str.equals("3017")) {
                        access$2300 access_2300 = new access$2300();
                        access_2300.MediaBrowserCompat$ItemReceiver = myVar.MediaMetadataCompat.getString(Iterables$3$MediaBrowserCompat$MediaItem.cancel);
                        access_2300.read = access$2300.write.CUSTOM;
                        access_2300.MediaBrowserCompat$CustomActionResultReceiver = new write(myVar);
                        access$2300 access_23002 = new access$2300();
                        access_23002.MediaBrowserCompat$ItemReceiver = myVar.MediaMetadataCompat.getString(Iterables$3$MediaBrowserCompat$MediaItem.f2737ok);
                        access_23002.read = access$2300.write.CUSTOM;
                        access_23002.MediaBrowserCompat$CustomActionResultReceiver = new my$MediaBrowserCompat$SearchResultReceiver(myVar);
                        access$2200 MediaBrowserCompat$ItemReceiver2 = myVar.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS);
                        MediaBrowserCompat$ItemReceiver2.write = access_2300;
                        MediaBrowserCompat$ItemReceiver2.MediaBrowserCompat$CustomActionResultReceiver = access_23002;
                        writeUInt64NoTag.IconCompatParcelizer my_mediabrowsercompat_customactionresultreceiver = new my$MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$ItemReceiver2);
                        if (myVar.RatingCompat == null) {
                            z = false;
                        }
                        if (z) {
                            my_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer(myVar.RatingCompat);
                            return;
                        }
                        return;
                    }
                } else if (str.equals("3015")) {
                    writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(myVar);
                    if (myVar.RatingCompat == null) {
                        z = false;
                    }
                    if (z) {
                        iconCompatParcelizer.IconCompatParcelizer(myVar.RatingCompat);
                        return;
                    }
                    return;
                }
            }
            myVar.MediaBrowserCompat$ItemReceiver(myVar.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, (Runnable) new read(myVar)));
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.scb.phone.domain.errors.RetrofitException");
    }

    public static final /* synthetic */ void write(C4982my myVar) {
        if (myVar.RatingCompat != null) {
            myVar.RatingCompat.aj_();
        }
    }

    public final void MediaMetadataCompat(Throwable th) {
        onGetStartedClick.write((Object) th, "throwable");
        if (this.RatingCompat != null) {
            this.RatingCompat.aj_();
        }
        MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
    }
}
