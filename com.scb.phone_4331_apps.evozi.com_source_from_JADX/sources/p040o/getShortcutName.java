package p040o;

import java.util.List;
import p040o.CrashlyticsController;
import p040o.LinkedListMultimap;
import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.getShortcutName */
public final class getShortcutName extends writeUInt64NoTag<newOnDevicePassportDeserializer> {
    /* access modifiers changed from: private */
    public final C4801in IconCompatParcelizer;
    List<CrashlyticsController.C32346> MediaBrowserCompat$ItemReceiver = HmlNationalIdActivity.IconCompatParcelizer;
    public final LinkedListMultimap.C35754.C35761.C35771 read;
    public CrashlyticsController.C32346 write;

    /* renamed from: o.getShortcutName$IconCompatParcelizer */
    public static final class IconCompatParcelizer<V> implements writeUInt64NoTag.IconCompatParcelizer<newOnDevicePassportDeserializer> {
        private /* synthetic */ getShortcutName read;

        public IconCompatParcelizer(getShortcutName getshortcutname) {
            this.read = getshortcutname;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            newOnDevicePassportDeserializer newondevicepassportdeserializer = (newOnDevicePassportDeserializer) obj;
            newondevicepassportdeserializer.write(this.read.write != null);
            newondevicepassportdeserializer.write();
        }
    }

    /* renamed from: o.getShortcutName$MediaDescriptionCompat */
    public static final class MediaDescriptionCompat<V> implements writeUInt64NoTag.IconCompatParcelizer<newOnDevicePassportDeserializer> {
        public static final MediaDescriptionCompat MediaBrowserCompat$ItemReceiver = new MediaDescriptionCompat();

        MediaDescriptionCompat() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            newOnDevicePassportDeserializer newondevicepassportdeserializer = (newOnDevicePassportDeserializer) obj;
            newondevicepassportdeserializer.MediaBrowserCompat$ItemReceiver();
            newondevicepassportdeserializer.MediaBrowserCompat$CustomActionResultReceiver();
            newondevicepassportdeserializer.read();
        }
    }

    /* renamed from: o.getShortcutName$MediaMetadataCompat */
    public static final class MediaMetadataCompat extends CheckEligibilityActivity implements FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> {
        final /* synthetic */ getShortcutName read;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public MediaMetadataCompat(getShortcutName getshortcutname) {
            super(1);
            this.read = getshortcutname;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            final Throwable th = (Throwable) obj;
            onGetStartedClick.write((Object) th, "throwable");
            getShortcutName getshortcutname = this.read;
            writeUInt64NoTag.IconCompatParcelizer r1 = new writeUInt64NoTag.IconCompatParcelizer<newOnDevicePassportDeserializer>(this) {
                private /* synthetic */ MediaMetadataCompat write;

                {
                    this.write = r1;
                }

                public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                    this.write.read.MediaBrowserCompat$ItemReceiver(this.write.read.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.NAVIGATE_BACK));
                }
            };
            if (getshortcutname.RatingCompat != null) {
                r1.IconCompatParcelizer(getshortcutname.RatingCompat);
            }
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    /* renamed from: o.getShortcutName$write */
    public static final class write<V> implements writeUInt64NoTag.IconCompatParcelizer<newOnDevicePassportDeserializer> {
        public static final write MediaBrowserCompat$CustomActionResultReceiver = new write();

        write() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((newOnDevicePassportDeserializer) obj).read();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public getShortcutName(LinkedListMultimap.C35754.C35761.C35771 r2, C4801in inVar, RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) r2, "hmlOperatingAccountController");
        onGetStartedClick.write((Object) inVar, "getMaskedFlag");
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        this.read = r2;
        this.IconCompatParcelizer = inVar;
    }

    /* renamed from: o.getShortcutName$read */
    public enum read {
        DOCUMENT_GUIDELINE,
        ISSUER_LANDING,
        CONSENT;
        
        public static final write Companion = null;

        static {
            Companion = new write((byte) 0);
        }

        /* renamed from: o.getShortcutName$read$write */
        public static final class write {
            private write() {
            }

            public /* synthetic */ write(byte b) {
                this();
            }

            public static read write(boolean z, boolean z2) {
                if (!z) {
                    return read.DOCUMENT_GUIDELINE;
                }
                if (z2) {
                    return read.ISSUER_LANDING;
                }
                return read.CONSENT;
            }
        }
    }

    public static final /* synthetic */ void MediaBrowserCompat$ItemReceiver(getShortcutName getshortcutname) {
        if (getshortcutname.RatingCompat != null) {
            getshortcutname.RatingCompat.aj_();
        }
    }
}
