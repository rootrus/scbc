package p040o;

import com.scb.phone.domain.errors.RetrofitException;
import p040o.ILocationSourceDelegate;
import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.getShadowContours */
public final class getShadowContours extends writeUInt64NoTag<getBottomLeftCornerHeight$MediaBrowserCompat$ItemReceiver> {
    private final onProviderInstallFailed IconCompatParcelizer;
    /* access modifiers changed from: private */
    public final asWriter MediaBrowserCompat$ItemReceiver;
    public String read = "";
    public final ofInstance write;

    /* renamed from: o.getShadowContours$IconCompatParcelizer */
    static final class IconCompatParcelizer<V> implements writeUInt64NoTag.IconCompatParcelizer<getBottomLeftCornerHeight$MediaBrowserCompat$ItemReceiver> {
        public static final IconCompatParcelizer IconCompatParcelizer = new IconCompatParcelizer();

        IconCompatParcelizer() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            getBottomLeftCornerHeight$MediaBrowserCompat$ItemReceiver getbottomleftcornerheight_mediabrowsercompat_itemreceiver = (getBottomLeftCornerHeight$MediaBrowserCompat$ItemReceiver) obj;
            getbottomleftcornerheight_mediabrowsercompat_itemreceiver.MediaBrowserCompat$ItemReceiver();
            getbottomleftcornerheight_mediabrowsercompat_itemreceiver.MediaBrowserCompat$ItemReceiver(false);
        }
    }

    /* renamed from: o.getShadowContours$read */
    static final class read<V> implements writeUInt64NoTag.IconCompatParcelizer<getBottomLeftCornerHeight$MediaBrowserCompat$ItemReceiver> {
        public static final read MediaBrowserCompat$CustomActionResultReceiver = new read();

        read() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            getBottomLeftCornerHeight$MediaBrowserCompat$ItemReceiver getbottomleftcornerheight_mediabrowsercompat_itemreceiver = (getBottomLeftCornerHeight$MediaBrowserCompat$ItemReceiver) obj;
            getbottomleftcornerheight_mediabrowsercompat_itemreceiver.write();
            getbottomleftcornerheight_mediabrowsercompat_itemreceiver.MediaBrowserCompat$ItemReceiver(false);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public getShadowContours(RegularImmutableBiMap regularImmutableBiMap, onProviderInstallFailed onproviderinstallfailed, ofInstance ofinstance, asWriter aswriter) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        onGetStartedClick.write((Object) onproviderinstallfailed, "validateMobileNumberUseCase");
        onGetStartedClick.write((Object) ofinstance, "preregisterValidationCase");
        onGetStartedClick.write((Object) aswriter, "mobileDisplayMapper");
        this.IconCompatParcelizer = onproviderinstallfailed;
        this.write = ofinstance;
        this.MediaBrowserCompat$ItemReceiver = aswriter;
    }

    public final void IconCompatParcelizer(String str) {
        onGetStartedClick.write((Object) str, "mobileReplaceText");
        this.read = str;
        boolean z = false;
        if (this.IconCompatParcelizer.read(str)) {
            CharSequence charSequence = str;
            if (!(charSequence == null || charSequence.length() == 0)) {
                writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = getShadowContours$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer;
                if (this.RatingCompat != null) {
                    z = true;
                }
                if (z) {
                    iconCompatParcelizer.IconCompatParcelizer(this.RatingCompat);
                    return;
                }
                return;
            }
        }
        CharSequence charSequence2 = str;
        if (charSequence2 == null || charSequence2.length() == 0) {
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer2 = read.MediaBrowserCompat$CustomActionResultReceiver;
            if (this.RatingCompat != null) {
                z = true;
            }
            if (z) {
                iconCompatParcelizer2.IconCompatParcelizer(this.RatingCompat);
                return;
            }
            return;
        }
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer3 = IconCompatParcelizer.IconCompatParcelizer;
        if (this.RatingCompat != null) {
            z = true;
        }
        if (z) {
            iconCompatParcelizer3.IconCompatParcelizer(this.RatingCompat);
        }
    }

    /* renamed from: o.getShadowContours$write */
    public static final class write extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<Boolean> {
        private /* synthetic */ getShadowContours write;

        /* renamed from: o.getShadowContours$write$write  reason: collision with other inner class name */
        static final class C10816write<V> implements writeUInt64NoTag.IconCompatParcelizer<getBottomLeftCornerHeight$MediaBrowserCompat$ItemReceiver> {
            private /* synthetic */ getContents IconCompatParcelizer;

            C10816write(getContents getcontents) {
                this.IconCompatParcelizer = getcontents;
            }

            public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                getContents getcontents = this.IconCompatParcelizer;
                onGetStartedClick.IconCompatParcelizer((Object) getcontents, "mobileDisplay");
                ((getBottomLeftCornerHeight$MediaBrowserCompat$ItemReceiver) obj).MediaBrowserCompat$CustomActionResultReceiver(getcontents);
            }
        }

        public write(getShadowContours getshadowcontours) {
            this.write = getshadowcontours;
        }

        public final /* synthetic */ void onNext(Object obj) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            super.onNext(Boolean.valueOf(booleanValue));
            if (booleanValue) {
                getShadowContours.MediaBrowserCompat$CustomActionResultReceiver(this.write);
                asWriter unused = this.write.MediaBrowserCompat$ItemReceiver;
                boolean z = true;
                getContents MediaBrowserCompat$CustomActionResultReceiver = asWriter.MediaBrowserCompat$CustomActionResultReceiver(this.write.read, true);
                getShadowContours getshadowcontours = this.write;
                writeUInt64NoTag.IconCompatParcelizer write2 = new C10816write(MediaBrowserCompat$CustomActionResultReceiver);
                if (getshadowcontours.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    write2.IconCompatParcelizer(getshadowcontours.RatingCompat);
                    return;
                }
                return;
            }
            getShadowContours getshadowcontours2 = this.write;
            RegularImmutableBiMap IconCompatParcelizer = getshadowcontours2.MediaBrowserCompat$CustomActionResultReceiver;
            getshadowcontours2.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer.read((String) null, IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.error_generic_resource), access$2300.write.JUST_DISMISS));
        }

        public final void onError(Throwable th) {
            onGetStartedClick.write((Object) th, "e");
            if (th instanceof RetrofitException) {
                ILocationSourceDelegate iLocationSourceDelegate = ((RetrofitException) th).IconCompatParcelizer;
                onGetStartedClick.IconCompatParcelizer((Object) iLocationSourceDelegate, "e.response");
                ILocationSourceDelegate.zza zza = iLocationSourceDelegate.write;
                onGetStartedClick.IconCompatParcelizer((Object) zza, "e.response.error");
                if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) zza.IconCompatParcelizer, (Object) "3037")) {
                    getShadowContours.MediaBrowserCompat$CustomActionResultReceiver(this.write);
                    getShadowContours getshadowcontours = this.write;
                    writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = getShadowContours$write$MediaBrowserCompat$ItemReceiver.write;
                    if (getshadowcontours.RatingCompat != null) {
                        iconCompatParcelizer.IconCompatParcelizer(getshadowcontours.RatingCompat);
                        return;
                    }
                    return;
                }
            }
            this.write.MediaBrowserCompat$ItemReceiver(this.write.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
        }
    }

    public static final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(getShadowContours getshadowcontours) {
        if (getshadowcontours.RatingCompat != null) {
            getshadowcontours.RatingCompat.aj_();
        }
    }
}
