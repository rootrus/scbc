package p040o;

import p040o.LinkedHashMultimap;
import p040o.RegularImmutableMap;
import p040o.writeUInt64NoTag;

/* renamed from: o.setOcrBufferSize */
public final class setOcrBufferSize extends writeUInt64NoTag<getPersonalNumber> {
    public final RegularImmutableMap.KeySet IconCompatParcelizer;
    /* access modifiers changed from: private */
    public getNativeSessionFiles MediaBrowserCompat$ItemReceiver;
    public final LinkedHashMultimap.SetDecorator.C35661 read;

    /* renamed from: o.setOcrBufferSize$write */
    public static final class write extends CheckEligibilityActivity implements FundFactSheetActivity<getNativeSessionFiles, HmlVerifyPhoneValidateOtpActivity> {
        private /* synthetic */ setOcrBufferSize MediaBrowserCompat$ItemReceiver;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public write(setOcrBufferSize setocrbuffersize) {
            super(1);
            this.MediaBrowserCompat$ItemReceiver = setocrbuffersize;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            final getNativeSessionFiles getnativesessionfiles = (getNativeSessionFiles) obj;
            onGetStartedClick.write((Object) getnativesessionfiles, "friendsLandingDisplay");
            setOcrBufferSize.read(this.MediaBrowserCompat$ItemReceiver);
            this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver = getnativesessionfiles;
            setOcrBufferSize setocrbuffersize = this.MediaBrowserCompat$ItemReceiver;
            writeUInt64NoTag.IconCompatParcelizer r1 = new writeUInt64NoTag.IconCompatParcelizer<getPersonalNumber>() {
                public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                    ((getPersonalNumber) obj).read(getnativesessionfiles);
                }
            };
            if (setocrbuffersize.RatingCompat != null) {
                r1.IconCompatParcelizer(setocrbuffersize.RatingCompat);
            }
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    /* renamed from: o.setOcrBufferSize$IconCompatParcelizer */
    public static final class IconCompatParcelizer<V> implements writeUInt64NoTag.IconCompatParcelizer<getPersonalNumber> {
        private /* synthetic */ setOcrBufferSize write;

        public IconCompatParcelizer(setOcrBufferSize setocrbuffersize) {
            this.write = setocrbuffersize;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((getPersonalNumber) obj).write(setOcrBufferSize.IconCompatParcelizer(this.write).MediaBrowserCompat$ItemReceiver);
        }
    }

    /* renamed from: o.setOcrBufferSize$read */
    public static final class read<V> implements writeUInt64NoTag.IconCompatParcelizer<getPersonalNumber> {
        private /* synthetic */ setOcrBufferSize write;

        public read(setOcrBufferSize setocrbuffersize) {
            this.write = setocrbuffersize;
        }

        public final /* bridge */ /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((getPersonalNumber) obj).IconCompatParcelizer(setOcrBufferSize.IconCompatParcelizer(this.write).MediaBrowserCompat$CustomActionResultReceiver);
        }
    }

    public static final /* synthetic */ getNativeSessionFiles IconCompatParcelizer(setOcrBufferSize setocrbuffersize) {
        getNativeSessionFiles getnativesessionfiles = setocrbuffersize.MediaBrowserCompat$ItemReceiver;
        if (getnativesessionfiles == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("friendsDisplay");
        }
        return getnativesessionfiles;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public setOcrBufferSize(LinkedHashMultimap.SetDecorator.C35661 r2, RegularImmutableMap.KeySet keySet, RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) r2, "friendsController");
        onGetStartedClick.write((Object) keySet, "friendsDisplayMapper");
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        this.read = r2;
        this.IconCompatParcelizer = keySet;
    }

    public static final /* synthetic */ void read(setOcrBufferSize setocrbuffersize) {
        if (setocrbuffersize.RatingCompat != null) {
            setocrbuffersize.RatingCompat.aj_();
        }
    }
}
