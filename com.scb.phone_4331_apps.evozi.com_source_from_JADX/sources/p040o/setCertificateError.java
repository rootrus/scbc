package p040o;

import java.util.ArrayList;
import java.util.List;
import p040o.GoogleApiManager;
import p040o.MapView;
import p040o.access$2300;
import p040o.writeUInt64NoTag;
import p040o.zzcz;

/* renamed from: o.setCertificateError */
public final class setCertificateError extends writeUInt64NoTag<PassportCaptureModule_GetOnDeviceExtractionServerFactory> {
    public final BaseTransientBottomBar$SnackbarBaseLayout IconCompatParcelizer;
    /* access modifiers changed from: private */
    public final ArrayList<IconCompatParcelizer> MediaBrowserCompat$ItemReceiver = new ArrayList<>();
    private int MediaBrowserCompat$MediaItem;
    private int MediaDescriptionCompat;
    public final setItemTextColor read;
    public boolean write = true;

    /* renamed from: o.setCertificateError$IconCompatParcelizer */
    public enum IconCompatParcelizer {
        BUSINESS_REG_NUM,
        OFFICIAL_STORE_URL,
        ON_LEASE,
        MARKETPLACE_STORE_URL,
        MARKETPLACE_PRODUCT_URL
    }

    /* renamed from: o.setCertificateError$MediaDescriptionCompat */
    static final class MediaDescriptionCompat<V> implements writeUInt64NoTag.IconCompatParcelizer<PassportCaptureModule_GetOnDeviceExtractionServerFactory> {
        private /* synthetic */ zzcz.zzf read;

        MediaDescriptionCompat(zzcz.zzf zzf) {
            this.read = zzf;
        }

        public final /* bridge */ /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((PassportCaptureModule_GetOnDeviceExtractionServerFactory) obj).IconCompatParcelizer(this.read.IconCompatParcelizer, this.read.write.MediaBrowserCompat$CustomActionResultReceiver, this.read.write.MediaBrowserCompat$ItemReceiver);
        }
    }

    /* renamed from: o.setCertificateError$MediaMetadataCompat */
    public static final class MediaMetadataCompat extends CheckEligibilityActivity implements FundFactSheetActivity<zzcz.zzf, HmlVerifyPhoneValidateOtpActivity> {
        private /* synthetic */ setCertificateError write;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public MediaMetadataCompat(setCertificateError setcertificateerror) {
            super(1);
            this.write = setcertificateerror;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            zzcz.zzf zzf = (zzcz.zzf) obj;
            onGetStartedClick.write((Object) zzf, "data");
            setCertificateError.MediaBrowserCompat$ItemReceiver(this.write);
            setCertificateError.MediaBrowserCompat$ItemReceiver(this.write, zzf);
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    /* renamed from: o.setCertificateError$ParcelableVolumeInfo */
    static final class ParcelableVolumeInfo<V> implements writeUInt64NoTag.IconCompatParcelizer<PassportCaptureModule_GetOnDeviceExtractionServerFactory> {
        private /* synthetic */ boolean MediaBrowserCompat$CustomActionResultReceiver;
        private /* synthetic */ IconCompatParcelizer read;
        private /* synthetic */ int write;

        ParcelableVolumeInfo(IconCompatParcelizer iconCompatParcelizer, boolean z, int i) {
            this.read = iconCompatParcelizer;
            this.MediaBrowserCompat$CustomActionResultReceiver = z;
            this.write = i;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((PassportCaptureModule_GetOnDeviceExtractionServerFactory) obj).MediaBrowserCompat$ItemReceiver(this.read, Integer.valueOf(this.write), this.MediaBrowserCompat$CustomActionResultReceiver);
        }
    }

    /* renamed from: o.setCertificateError$read */
    static final class read<V> implements writeUInt64NoTag.IconCompatParcelizer<PassportCaptureModule_GetOnDeviceExtractionServerFactory> {
        private /* synthetic */ setCertificateError IconCompatParcelizer;
        private /* synthetic */ zzcz.zzf write;

        read(setCertificateError setcertificateerror, zzcz.zzf zzf) {
            this.IconCompatParcelizer = setcertificateerror;
            this.write = zzf;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((PassportCaptureModule_GetOnDeviceExtractionServerFactory) obj).IconCompatParcelizer(this.write.MediaBrowserCompat$CustomActionResultReceiver.write);
            this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver.add(IconCompatParcelizer.OFFICIAL_STORE_URL);
        }
    }

    /* renamed from: o.setCertificateError$RatingCompat */
    public static final class RatingCompat extends CheckEligibilityActivity implements FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> {
        private /* synthetic */ setCertificateError MediaBrowserCompat$ItemReceiver;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public RatingCompat(setCertificateError setcertificateerror) {
            super(1);
            this.MediaBrowserCompat$ItemReceiver = setcertificateerror;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            onGetStartedClick.write((Object) th, "throwable");
            this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
            this.MediaBrowserCompat$ItemReceiver.write = true;
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public setCertificateError(setItemTextColor setitemtextcolor, BaseTransientBottomBar$SnackbarBaseLayout baseTransientBottomBar$SnackbarBaseLayout, RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) setitemtextcolor, "getBusinessURLInfoCase");
        onGetStartedClick.write((Object) baseTransientBottomBar$SnackbarBaseLayout, "sendBusinessURLInfoCase");
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        this.read = setitemtextcolor;
        this.IconCompatParcelizer = baseTransientBottomBar$SnackbarBaseLayout;
    }

    /* renamed from: o.setCertificateError$write */
    public static final class write implements findFragmentByWho {
        private write() {
        }

        public /* synthetic */ write(GoogleApiManager.zab zab) {
        }

        public final Object IconCompatParcelizer(Object obj) {
            SynchronizationException synchronizationException = (SynchronizationException) obj;
            return new MapView.zza(synchronizationException.IconCompatParcelizer, synchronizationException.read);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0079  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean IconCompatParcelizer(p040o.setCertificateError.IconCompatParcelizer r6, java.lang.String r7) {
        /*
            r5 = this;
            java.lang.String r0 = "field"
            p040o.onGetStartedClick.write((java.lang.Object) r6, (java.lang.String) r0)
            java.lang.String r0 = "text"
            p040o.onGetStartedClick.write((java.lang.Object) r7, (java.lang.String) r0)
            int[] r0 = p040o.setErrorMsg.MediaBrowserCompat$CustomActionResultReceiver
            int r1 = r6.ordinal()
            r0 = r0[r1]
            java.lang.String r1 = "input"
            r2 = 1
            r3 = 0
            if (r0 == r2) goto L_0x0047
            r4 = 2
            if (r0 != r4) goto L_0x007f
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            o.LifestyleCustomizationActivity r0 = new o.LifestyleCustomizationActivity
            java.lang.String r4 = "^((?:http|https)://)(?:www\\.)?[\\w\\d\\-_]+\\.\\w{2,3}(\\.\\w{2})?(/(?<=/)(?:[\\w\\d\\-./_]+)?)?$"
            r0.<init>((java.lang.String) r4)
            p040o.onGetStartedClick.write((java.lang.Object) r7, (java.lang.String) r1)
            java.util.regex.Pattern r0 = r0.write
            java.util.regex.Matcher r7 = r0.matcher(r7)
            boolean r7 = r7.matches()
            o.setCertificateError$MediaSessionCompat$ResultReceiverWrapper r0 = new o.setCertificateError$MediaSessionCompat$ResultReceiverWrapper
            r0.<init>(r6, r7)
            o.writeUInt64NoTag$IconCompatParcelizer r0 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r0
            T r6 = r5.RatingCompat
            if (r6 == 0) goto L_0x003d
            goto L_0x003e
        L_0x003d:
            r2 = r3
        L_0x003e:
            if (r2 == 0) goto L_0x0045
            T r6 = r5.RatingCompat
            r0.IconCompatParcelizer(r6)
        L_0x0045:
            r3 = r7
            goto L_0x007f
        L_0x0047:
            int r6 = r7.length()
            r0 = 13
            if (r6 != r0) goto L_0x0069
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            o.LifestyleCustomizationActivity r6 = new o.LifestyleCustomizationActivity
            java.lang.String r0 = "^[0-9]+$"
            r6.<init>((java.lang.String) r0)
            p040o.onGetStartedClick.write((java.lang.Object) r7, (java.lang.String) r1)
            java.util.regex.Pattern r6 = r6.write
            java.util.regex.Matcher r6 = r6.matcher(r7)
            boolean r6 = r6.matches()
            if (r6 == 0) goto L_0x0069
            r6 = r2
            goto L_0x006a
        L_0x0069:
            r6 = r3
        L_0x006a:
            o.setCertificateError$MediaSessionCompat$Token r7 = new o.setCertificateError$MediaSessionCompat$Token
            r7.<init>(r6)
            o.writeUInt64NoTag$IconCompatParcelizer r7 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r7
            T r0 = r5.RatingCompat
            if (r0 == 0) goto L_0x0076
            goto L_0x0077
        L_0x0076:
            r2 = r3
        L_0x0077:
            if (r2 == 0) goto L_0x007e
            T r0 = r5.RatingCompat
            r7.IconCompatParcelizer(r0)
        L_0x007e:
            r3 = r6
        L_0x007f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.setCertificateError.IconCompatParcelizer(o.setCertificateError$IconCompatParcelizer, java.lang.String):boolean");
    }

    public final boolean IconCompatParcelizer(List<String> list, IconCompatParcelizer iconCompatParcelizer) {
        int i;
        onGetStartedClick.write((Object) list, "urlList");
        onGetStartedClick.write((Object) iconCompatParcelizer, "field");
        int i2 = setErrorMsg.read[iconCompatParcelizer.ordinal()];
        int i3 = 0;
        if (i2 == 1) {
            i = this.MediaBrowserCompat$MediaItem;
        } else if (i2 != 2) {
            return false;
        } else {
            i = this.MediaDescriptionCompat;
        }
        if (list.size() < i) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (i3 >= 0) {
                arrayList.add(Boolean.valueOf(read(iconCompatParcelizer, (String) next, i3)));
                i3++;
            } else {
                throw new ArithmeticException("Index overflow has happened.");
            }
        }
        return !arrayList.contains(Boolean.FALSE);
    }

    public final boolean read(IconCompatParcelizer iconCompatParcelizer, String str, int i) {
        onGetStartedClick.write((Object) iconCompatParcelizer, "field");
        onGetStartedClick.write((Object) str, "text");
        CharSequence charSequence = str;
        LifestyleCustomizationActivity lifestyleCustomizationActivity = new LifestyleCustomizationActivity("^((?:http|https)://)(?:www\\.)?[\\w\\d\\-_]+\\.\\w{2,3}(\\.\\w{2})?(/(?<=/)(?:[\\w\\d\\-./_]+)?)?$");
        onGetStartedClick.write((Object) charSequence, "input");
        boolean matches = lifestyleCustomizationActivity.write.matcher(charSequence).matches();
        writeUInt64NoTag.IconCompatParcelizer parcelableVolumeInfo = new ParcelableVolumeInfo(iconCompatParcelizer, matches, i);
        if (this.RatingCompat != null) {
            parcelableVolumeInfo.IconCompatParcelizer(this.RatingCompat);
        }
        return matches;
    }

    public static final /* synthetic */ void MediaBrowserCompat$ItemReceiver(setCertificateError setcertificateerror, zzcz.zzf zzf) {
        boolean z = true;
        if (zzf.read.MediaBrowserCompat$CustomActionResultReceiver) {
            writeUInt64NoTag.IconCompatParcelizer setcertificateerror_mediabrowsercompat_customactionresultreceiver = new C5270x9301280(setcertificateerror, zzf);
            if (setcertificateerror.RatingCompat != null) {
                setcertificateerror_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer(setcertificateerror.RatingCompat);
            }
        }
        if (zzf.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver) {
            setcertificateerror.MediaBrowserCompat$ItemReceiver.add(IconCompatParcelizer.ON_LEASE);
            writeUInt64NoTag.IconCompatParcelizer setcertificateerror_mediabrowsercompat_itemreceiver = new setCertificateError$MediaBrowserCompat$ItemReceiver(zzf);
            if (setcertificateerror.RatingCompat != null) {
                setcertificateerror_mediabrowsercompat_itemreceiver.IconCompatParcelizer(setcertificateerror.RatingCompat);
            }
        }
        if (zzf.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver) {
            writeUInt64NoTag.IconCompatParcelizer read2 = new read(setcertificateerror, zzf);
            if (setcertificateerror.RatingCompat != null) {
                read2.IconCompatParcelizer(setcertificateerror.RatingCompat);
            }
        }
        if (zzf.write.IconCompatParcelizer) {
            setcertificateerror.MediaDescriptionCompat = zzf.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver;
            setcertificateerror.MediaBrowserCompat$MediaItem = zzf.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver;
            writeUInt64NoTag.IconCompatParcelizer mediaDescriptionCompat = new MediaDescriptionCompat(zzf);
            if (setcertificateerror.RatingCompat == null) {
                z = false;
            }
            if (z) {
                mediaDescriptionCompat.IconCompatParcelizer(setcertificateerror.RatingCompat);
            }
        }
    }

    public static final /* synthetic */ void MediaBrowserCompat$ItemReceiver(setCertificateError setcertificateerror) {
        if (setcertificateerror.RatingCompat != null) {
            setcertificateerror.RatingCompat.aj_();
        }
    }
}
