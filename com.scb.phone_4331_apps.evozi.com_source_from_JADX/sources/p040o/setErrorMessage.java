package p040o;

import p040o.Enums;
import p040o.ProcessingParameters;
import p040o.access$2300;
import p040o.writeUInt64NoTag;
import p040o.zzfe;

/* renamed from: o.setErrorMessage */
public final class setErrorMessage extends writeUInt64NoTag<ProcessingParameters.ProcessingType> {
    public final CheckableImageButton read;

    /* renamed from: o.setErrorMessage$IconCompatParcelizer */
    static final class IconCompatParcelizer<V> implements writeUInt64NoTag.IconCompatParcelizer<ProcessingParameters.ProcessingType> {
        public static final IconCompatParcelizer read = new IconCompatParcelizer();

        IconCompatParcelizer() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((ProcessingParameters.ProcessingType) obj).read();
        }
    }

    /* renamed from: o.setErrorMessage$MediaMetadataCompat */
    public static final class MediaMetadataCompat<V> implements writeUInt64NoTag.IconCompatParcelizer<ProcessingParameters.ProcessingType> {
        public static final MediaMetadataCompat IconCompatParcelizer = new MediaMetadataCompat();

        MediaMetadataCompat() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((ProcessingParameters.ProcessingType) obj).read(setErrorMessage$MediaBrowserCompat$CustomActionResultReceiver.EXTERNAL_INSTRUCTION);
        }
    }

    /* renamed from: o.setErrorMessage$RatingCompat */
    public static final class RatingCompat<V> implements writeUInt64NoTag.IconCompatParcelizer<ProcessingParameters.ProcessingType> {
        public static final RatingCompat MediaBrowserCompat$CustomActionResultReceiver = new RatingCompat();

        RatingCompat() {
        }

        public final /* bridge */ /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((ProcessingParameters.ProcessingType) obj).IconCompatParcelizer();
        }
    }

    /* renamed from: o.setErrorMessage$read */
    static final class read<V> implements writeUInt64NoTag.IconCompatParcelizer<ProcessingParameters.ProcessingType> {
        public static final read MediaBrowserCompat$ItemReceiver = new read();

        read() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((ProcessingParameters.ProcessingType) obj).MediaBrowserCompat$CustomActionResultReceiver();
        }
    }

    /* renamed from: o.setErrorMessage$write */
    static final class write<V> implements writeUInt64NoTag.IconCompatParcelizer<ProcessingParameters.ProcessingType> {
        public static final write MediaBrowserCompat$ItemReceiver = new write();

        write() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((ProcessingParameters.ProcessingType) obj).MediaBrowserCompat$ItemReceiver();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public setErrorMessage(RegularImmutableBiMap regularImmutableBiMap, CheckableImageButton checkableImageButton, Enums.C33301 r4) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        onGetStartedClick.write((Object) checkableImageButton, "validateOtaCase");
        onGetStartedClick.write((Object) r4, "formatCitizenCase");
        this.read = checkableImageButton;
    }

    /* renamed from: o.setErrorMessage$MediaDescriptionCompat */
    public static final class MediaDescriptionCompat extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<zzfe.zzb> {
        final /* synthetic */ setErrorMessage IconCompatParcelizer;

        /* renamed from: o.setErrorMessage$MediaDescriptionCompat$IconCompatParcelizer */
        static final class IconCompatParcelizer<V> implements writeUInt64NoTag.IconCompatParcelizer<ProcessingParameters.ProcessingType> {
            private /* synthetic */ Throwable MediaBrowserCompat$CustomActionResultReceiver;
            private /* synthetic */ MediaDescriptionCompat MediaBrowserCompat$ItemReceiver;

            IconCompatParcelizer(MediaDescriptionCompat mediaDescriptionCompat, Throwable th) {
                this.MediaBrowserCompat$ItemReceiver = mediaDescriptionCompat;
                this.MediaBrowserCompat$CustomActionResultReceiver = th;
            }

            public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                access$2200 MediaBrowserCompat$ItemReceiver2 = this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver, access$2300.write.JUST_DISMISS);
                onGetStartedClick.IconCompatParcelizer((Object) MediaBrowserCompat$ItemReceiver2, "errorDisplayMapper.transform(e)");
                String str = MediaBrowserCompat$ItemReceiver2.IconCompatParcelizer;
                onGetStartedClick.IconCompatParcelizer((Object) str, "errorDisplayMapper.transform(e).message");
                ((ProcessingParameters.ProcessingType) obj).IconCompatParcelizer(str);
            }
        }

        public MediaDescriptionCompat(setErrorMessage seterrormessage) {
            this.IconCompatParcelizer = seterrormessage;
        }

        public final /* synthetic */ void onNext(Object obj) {
            onGetStartedClick.write((Object) (zzfe.zzb) obj, "t");
            super.onComplete();
            setErrorMessage.write(this.IconCompatParcelizer);
            setErrorMessage seterrormessage = this.IconCompatParcelizer;
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C5299xa49222aa.MediaBrowserCompat$CustomActionResultReceiver;
            if (seterrormessage.RatingCompat != null) {
                iconCompatParcelizer.IconCompatParcelizer(seterrormessage.RatingCompat);
            }
        }

        public final void onError(Throwable th) {
            onGetStartedClick.write((Object) th, "e");
            super.onError(th);
            setErrorMessage.write(this.IconCompatParcelizer);
            setErrorMessage seterrormessage = this.IconCompatParcelizer;
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(this, th);
            if (seterrormessage.RatingCompat != null) {
                iconCompatParcelizer.IconCompatParcelizer(seterrormessage.RatingCompat);
            }
        }
    }

    public final HmlVerifyPhoneValidateOtpActivity write(String str) {
        if (str == null) {
            return null;
        }
        boolean z = true;
        if (str.length() == 0) {
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = IconCompatParcelizer.read;
            if (this.RatingCompat == null) {
                z = false;
            }
            if (z) {
                iconCompatParcelizer.IconCompatParcelizer(this.RatingCompat);
            }
        } else if (str.length() != 17) {
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer2 = write.MediaBrowserCompat$ItemReceiver;
            if (this.RatingCompat == null) {
                z = false;
            }
            if (z) {
                iconCompatParcelizer2.IconCompatParcelizer(this.RatingCompat);
            }
        } else {
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer3 = read.MediaBrowserCompat$ItemReceiver;
            if (this.RatingCompat == null) {
                z = false;
            }
            if (z) {
                iconCompatParcelizer3.IconCompatParcelizer(this.RatingCompat);
            }
        }
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }

    public final void onDestroy() {
        CheckableImageButton checkableImageButton = this.read;
        if (!checkableImageButton.MediaBrowserCompat$MediaItem.isDisposed()) {
            checkableImageButton.MediaBrowserCompat$MediaItem.dispose();
        }
        super.onDestroy();
    }

    public static final /* synthetic */ void write(setErrorMessage seterrormessage) {
        if (seterrormessage.RatingCompat != null) {
            seterrormessage.RatingCompat.aj_();
        }
    }
}
