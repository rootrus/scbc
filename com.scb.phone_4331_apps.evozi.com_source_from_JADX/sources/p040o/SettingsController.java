package p040o;

import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.SettingsController */
public final class SettingsController extends writeUInt64NoTag<getTopRightCornerHeight> {
    public String IconCompatParcelizer;
    public String MediaBrowserCompat$ItemReceiver;
    public final CircularRevealCardView MediaBrowserCompat$MediaItem;
    public String MediaBrowserCompat$SearchResultReceiver;
    public String MediaDescriptionCompat;
    public String read;
    public boolean write;

    /* renamed from: o.SettingsController$IconCompatParcelizer */
    static final class IconCompatParcelizer<V> implements writeUInt64NoTag.IconCompatParcelizer<getTopRightCornerHeight> {
        public static final IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver = new IconCompatParcelizer();

        IconCompatParcelizer() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((getTopRightCornerHeight) obj).MediaBrowserCompat$ItemReceiver();
        }
    }

    /* renamed from: o.SettingsController$ParcelableVolumeInfo */
    public static final class ParcelableVolumeInfo<V> implements writeUInt64NoTag.IconCompatParcelizer<getTopRightCornerHeight> {
        private /* synthetic */ SettingsController MediaBrowserCompat$CustomActionResultReceiver;

        public ParcelableVolumeInfo(SettingsController settingsController) {
            this.MediaBrowserCompat$CustomActionResultReceiver = settingsController;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((getTopRightCornerHeight) obj).MediaBrowserCompat$CustomActionResultReceiver(SettingsController.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$CustomActionResultReceiver), SettingsController.IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver), SettingsController.write(this.MediaBrowserCompat$CustomActionResultReceiver), SettingsController.MediaMetadataCompat(this.MediaBrowserCompat$CustomActionResultReceiver), SettingsController.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver), this.MediaBrowserCompat$CustomActionResultReceiver.write);
        }
    }

    /* renamed from: o.SettingsController$RatingCompat */
    static final class RatingCompat<V> implements writeUInt64NoTag.IconCompatParcelizer<getTopRightCornerHeight> {
        public static final RatingCompat write = new RatingCompat();

        RatingCompat() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((getTopRightCornerHeight) obj).MediaBrowserCompat$MediaItem();
        }
    }

    /* renamed from: o.SettingsController$read */
    static final class read<V> implements writeUInt64NoTag.IconCompatParcelizer<getTopRightCornerHeight> {
        public static final read write = new read();

        read() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((getTopRightCornerHeight) obj).MediaMetadataCompat();
        }
    }

    /* renamed from: o.SettingsController$setHasDecor */
    public static final class setHasDecor<V> implements writeUInt64NoTag.IconCompatParcelizer<getTopRightCornerHeight> {
        private /* synthetic */ String read;

        public setHasDecor(String str) {
            this.read = str;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            getTopRightCornerHeight gettoprightcornerheight = (getTopRightCornerHeight) obj;
            gettoprightcornerheight.MediaBrowserCompat$ItemReceiver(GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver(this.read, "SALARY", true));
            gettoprightcornerheight.read();
        }
    }

    /* renamed from: o.SettingsController$write */
    static final class write<V> implements writeUInt64NoTag.IconCompatParcelizer<getTopRightCornerHeight> {
        public static final write read = new write();

        write() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((getTopRightCornerHeight) obj).write();
        }
    }

    /* renamed from: o.SettingsController$MediaDescriptionCompat */
    static final class MediaDescriptionCompat<V> implements writeUInt64NoTag.IconCompatParcelizer<getTopRightCornerHeight> {
        private /* synthetic */ SettingsController IconCompatParcelizer;
        private /* synthetic */ String MediaBrowserCompat$ItemReceiver;

        MediaDescriptionCompat(SettingsController settingsController, String str) {
            this.IconCompatParcelizer = settingsController;
            this.MediaBrowserCompat$ItemReceiver = str;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            getTopRightCornerHeight gettoprightcornerheight = (getTopRightCornerHeight) obj;
            gettoprightcornerheight.IconCompatParcelizer(this.MediaBrowserCompat$ItemReceiver, SettingsController.IconCompatParcelizer(this.IconCompatParcelizer), SettingsController.write(this.IconCompatParcelizer), SettingsController.MediaMetadataCompat(this.IconCompatParcelizer), SettingsController.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer), this.IconCompatParcelizer.write);
            gettoprightcornerheight.MediaBrowserCompat$CustomActionResultReceiver();
        }
    }

    /* renamed from: o.SettingsController$MediaMetadataCompat */
    static final class MediaMetadataCompat<V> implements writeUInt64NoTag.IconCompatParcelizer<getTopRightCornerHeight> {
        private /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver;
        private /* synthetic */ SettingsController MediaBrowserCompat$ItemReceiver;

        MediaMetadataCompat(SettingsController settingsController, String str) {
            this.MediaBrowserCompat$ItemReceiver = settingsController;
            this.MediaBrowserCompat$CustomActionResultReceiver = str;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((getTopRightCornerHeight) obj).MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver, SettingsController.IconCompatParcelizer(this.MediaBrowserCompat$ItemReceiver), SettingsController.write(this.MediaBrowserCompat$ItemReceiver), SettingsController.MediaMetadataCompat(this.MediaBrowserCompat$ItemReceiver), SettingsController.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver), this.MediaBrowserCompat$ItemReceiver.write);
        }
    }

    public static final /* synthetic */ String IconCompatParcelizer(SettingsController settingsController) {
        String str = settingsController.read;
        if (str == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("applicationId");
        }
        return str;
    }

    public static final /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver(SettingsController settingsController) {
        String str = settingsController.MediaDescriptionCompat;
        if (str == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("imagePath");
        }
        return str;
    }

    public static final /* synthetic */ String MediaBrowserCompat$ItemReceiver(SettingsController settingsController) {
        String str = settingsController.IconCompatParcelizer;
        if (str == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("flowType");
        }
        return str;
    }

    public static final /* synthetic */ String MediaMetadataCompat(SettingsController settingsController) {
        String str = settingsController.MediaBrowserCompat$SearchResultReceiver;
        if (str == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("productType");
        }
        return str;
    }

    public static final /* synthetic */ String write(SettingsController settingsController) {
        String str = settingsController.MediaBrowserCompat$ItemReceiver;
        if (str == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("documentType");
        }
        return str;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public SettingsController(CircularRevealCardView circularRevealCardView, RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) circularRevealCardView, "hmlSaveDocumentFeedbackCase");
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        this.MediaBrowserCompat$MediaItem = circularRevealCardView;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0026, code lost:
        if (p040o.GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver("SALARY", r0, true) == false) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void read() {
        /*
            r4 = this;
            boolean r0 = r4.write
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x003c
            java.lang.String r0 = r4.IconCompatParcelizer
            if (r0 != 0) goto L_0x000f
            java.lang.String r3 = "flowType"
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r3)
        L_0x000f:
            java.lang.String r3 = "HML"
            boolean r0 = p040o.GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver(r0, r3, r2)
            if (r0 == 0) goto L_0x0028
            java.lang.String r0 = r4.MediaBrowserCompat$ItemReceiver
            if (r0 != 0) goto L_0x0020
            java.lang.String r3 = "documentType"
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r3)
        L_0x0020:
            java.lang.String r3 = "SALARY"
            boolean r0 = p040o.GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver(r3, r0, r2)
            if (r0 != 0) goto L_0x003c
        L_0x0028:
            o.SettingsController$MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver r0 = new o.SettingsController$MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver
            r0.<init>(r4)
            o.writeUInt64NoTag$IconCompatParcelizer r0 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r0
            T r3 = r4.RatingCompat
            if (r3 == 0) goto L_0x0034
            r1 = r2
        L_0x0034:
            if (r1 == 0) goto L_0x003b
            T r1 = r4.RatingCompat
            r0.IconCompatParcelizer(r1)
        L_0x003b:
            return
        L_0x003c:
            o.SettingsController$MediaSessionCompat$ResultReceiverWrapper r0 = p040o.SettingsController$MediaSessionCompat$ResultReceiverWrapper.MediaBrowserCompat$ItemReceiver
            o.writeUInt64NoTag$IconCompatParcelizer r0 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r0
            T r3 = r4.RatingCompat
            if (r3 == 0) goto L_0x0045
            r1 = r2
        L_0x0045:
            if (r1 == 0) goto L_0x004c
            T r1 = r4.RatingCompat
            r0.IconCompatParcelizer(r1)
        L_0x004c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.SettingsController.read():void");
    }

    public final void MediaMetadataCompat(Throwable th) {
        onGetStartedClick.write((Object) th, "error");
        String message = th.getMessage();
        if (message != null) {
            boolean z = false;
            if (this.RatingCompat != null) {
                this.RatingCompat.aj_();
            }
            String str = this.MediaBrowserCompat$ItemReceiver;
            if (str == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("documentType");
            }
            if (GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver(str, "SALARY", true)) {
                RttiJsonBill_MembersInjector$MediaBrowserCompat$ItemReceiver write2 = RttiJsonBill_MembersInjector$MediaBrowserCompat$ItemReceiver.write(message);
                if (write2 != null) {
                    int i = setStoredBuildInstanceIdentifier.MediaBrowserCompat$CustomActionResultReceiver[write2.ordinal()];
                    if (i == 1) {
                        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = write.read;
                        if (this.RatingCompat != null) {
                            z = true;
                        }
                        if (z) {
                            iconCompatParcelizer.IconCompatParcelizer(this.RatingCompat);
                            return;
                        }
                        return;
                    } else if (i == 2) {
                        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer2 = read.write;
                        if (this.RatingCompat != null) {
                            z = true;
                        }
                        if (z) {
                            iconCompatParcelizer2.IconCompatParcelizer(this.RatingCompat);
                            return;
                        }
                        return;
                    } else if (i == 3) {
                        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer3 = IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver;
                        if (this.RatingCompat != null) {
                            z = true;
                        }
                        if (z) {
                            iconCompatParcelizer3.IconCompatParcelizer(this.RatingCompat);
                            return;
                        }
                        return;
                    } else if (i == 4) {
                        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer4 = SettingsController$MediaBrowserCompat$MediaItem.MediaBrowserCompat$ItemReceiver;
                        if (this.RatingCompat != null) {
                            z = true;
                        }
                        if (z) {
                            iconCompatParcelizer4.IconCompatParcelizer(this.RatingCompat);
                            return;
                        }
                        return;
                    }
                }
                writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer5 = RatingCompat.write;
                if (this.RatingCompat != null) {
                    z = true;
                }
                if (z) {
                    iconCompatParcelizer5.IconCompatParcelizer(this.RatingCompat);
                    return;
                }
                return;
            }
            return;
        }
        MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
    }

    public static final /* synthetic */ void MediaBrowserCompat$SearchResultReceiver(SettingsController settingsController) {
        writeUInt64NoTag.IconCompatParcelizer parcelableVolumeInfo = new ParcelableVolumeInfo(settingsController);
        if (settingsController.RatingCompat != null) {
            parcelableVolumeInfo.IconCompatParcelizer(settingsController.RatingCompat);
        }
    }

    public final void read(String str) {
        onGetStartedClick.write((Object) str, "path");
        boolean z = false;
        if (this.RatingCompat != null) {
            this.RatingCompat.aj_();
        }
        String str2 = this.IconCompatParcelizer;
        if (str2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("flowType");
        }
        if (GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver(str2, "HML", true)) {
            String str3 = this.MediaBrowserCompat$ItemReceiver;
            if (str3 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("documentType");
            }
            if (GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver("SALARY", str3, true)) {
                writeUInt64NoTag.IconCompatParcelizer mediaDescriptionCompat = new MediaDescriptionCompat(this, str);
                if (this.RatingCompat != null) {
                    z = true;
                }
                if (z) {
                    mediaDescriptionCompat.IconCompatParcelizer(this.RatingCompat);
                    return;
                }
                return;
            }
        }
        writeUInt64NoTag.IconCompatParcelizer mediaMetadataCompat = new MediaMetadataCompat(this, str);
        if (this.RatingCompat != null) {
            z = true;
        }
        if (z) {
            mediaMetadataCompat.IconCompatParcelizer(this.RatingCompat);
        }
    }
}
