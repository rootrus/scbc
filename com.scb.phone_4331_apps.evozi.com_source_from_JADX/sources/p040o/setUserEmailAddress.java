package p040o;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import p040o.AppBarLayout;
import p040o.CrashlyticsController;
import p040o.Enums;
import p040o.IParameters;
import p040o.PhenotypeFlag;
import p040o.Serialization;
import p040o.writeUInt64NoTag;

/* renamed from: o.setUserEmailAddress */
public final class setUserEmailAddress<T extends IParameters> extends CustomAdvertisingIdClient<T> {
    private static final List<String> PlaybackStateCompat;
    private boolean AppCompatDialogFragment;
    public CrashlyticsController.C322519 setHasDecor = new CrashlyticsController.C322519((byte) 0);

    /* renamed from: o.setUserEmailAddress$IconCompatParcelizer */
    public static final class IconCompatParcelizer<V> implements writeUInt64NoTag.IconCompatParcelizer<T> {
        private /* synthetic */ setUserEmailAddress IconCompatParcelizer;

        public IconCompatParcelizer(setUserEmailAddress setuseremailaddress) {
            this.IconCompatParcelizer = setuseremailaddress;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            IParameters iParameters = (IParameters) obj;
            if (!this.IconCompatParcelizer.setHasDecor.IconCompatParcelizer || !onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer.setHasDecor.MediaBrowserCompat$ItemReceiver, (Object) Boolean.TRUE)) {
                iParameters.MediaSessionCompat$ResultReceiverWrapper();
                return;
            }
            CharSequence charSequence = this.IconCompatParcelizer.setHasDecor.read;
            boolean z = true;
            if (!(charSequence == null || charSequence.length() == 0)) {
                z = false;
            }
            if (z) {
                iParameters.RatingCompat();
            } else if (!this.IconCompatParcelizer.write()) {
                iParameters.MediaSessionCompat$Token();
            } else {
                iParameters.MediaSessionCompat$ResultReceiverWrapper();
            }
        }
    }

    /* renamed from: o.setUserEmailAddress$MediaDescriptionCompat */
    public static final class MediaDescriptionCompat<V> implements writeUInt64NoTag.IconCompatParcelizer<T> {
        public static final MediaDescriptionCompat MediaBrowserCompat$CustomActionResultReceiver = new MediaDescriptionCompat();

        MediaDescriptionCompat() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((IParameters) obj).MediaSessionCompat$ResultReceiverWrapper();
        }
    }

    /* renamed from: o.setUserEmailAddress$MediaMetadataCompat */
    public static final class MediaMetadataCompat<V> implements writeUInt64NoTag.IconCompatParcelizer<T> {
        public static final MediaMetadataCompat MediaBrowserCompat$ItemReceiver = new MediaMetadataCompat();

        MediaMetadataCompat() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((IParameters) obj).MediaBrowserCompat$CustomActionResultReceiver(false);
        }
    }

    /* renamed from: o.setUserEmailAddress$ParcelableVolumeInfo */
    static final class ParcelableVolumeInfo<V> implements writeUInt64NoTag.IconCompatParcelizer<T> {
        private /* synthetic */ boolean MediaBrowserCompat$ItemReceiver;

        ParcelableVolumeInfo(boolean z) {
            this.MediaBrowserCompat$ItemReceiver = z;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((IParameters) obj).read(this.MediaBrowserCompat$ItemReceiver, false);
        }
    }

    /* renamed from: o.setUserEmailAddress$RatingCompat */
    static final class RatingCompat<V> implements writeUInt64NoTag.IconCompatParcelizer<T> {
        private /* synthetic */ setUserEmailAddress MediaBrowserCompat$ItemReceiver;
        private /* synthetic */ listNativeSessionFileDirectories write;

        RatingCompat(setUserEmailAddress setuseremailaddress, listNativeSessionFileDirectories listnativesessionfiledirectories) {
            this.MediaBrowserCompat$ItemReceiver = setuseremailaddress;
            this.write = listnativesessionfiledirectories;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            listSessionBeginFiles listsessionbeginfiles;
            listSessionBeginFiles$MediaBrowserCompat$ItemReceiver listsessionbeginfiles_mediabrowsercompat_itemreceiver;
            IParameters iParameters = (IParameters) obj;
            boolean z = false;
            iParameters.IconCompatParcelizer(false);
            listNativeSessionFileDirectories listnativesessionfiledirectories = this.write;
            if (listnativesessionfiledirectories != null && (listsessionbeginfiles = listnativesessionfiledirectories.MediaBrowserCompat$ItemReceiver) != null && (listsessionbeginfiles_mediabrowsercompat_itemreceiver = listsessionbeginfiles.f2888x50fd9e4a) != null) {
                setUserEmailAddress setuseremailaddress = this.MediaBrowserCompat$ItemReceiver;
                String str = listsessionbeginfiles_mediabrowsercompat_itemreceiver.IconCompatParcelizer;
                String str2 = listsessionbeginfiles_mediabrowsercompat_itemreceiver.read;
                String str3 = listsessionbeginfiles_mediabrowsercompat_itemreceiver.MediaBrowserCompat$CustomActionResultReceiver;
                Boolean bool = listsessionbeginfiles_mediabrowsercompat_itemreceiver.MediaBrowserCompat$ItemReceiver;
                String str4 = this.write.IconCompatParcelizer.read;
                if (str4 != null) {
                    z = setUserEmailAddress.PlaybackStateCompat.contains(str4);
                }
                setuseremailaddress.setHasDecor = new CrashlyticsController.C322519(bool, str, str2, str3, z);
                setUserEmailAddress.MediaMetadataCompat(this.MediaBrowserCompat$ItemReceiver);
                iParameters.IconCompatParcelizer(listsessionbeginfiles_mediabrowsercompat_itemreceiver);
                if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) listsessionbeginfiles_mediabrowsercompat_itemreceiver.MediaBrowserCompat$ItemReceiver, (Object) Boolean.TRUE)) {
                    iParameters.IconCompatParcelizer(true);
                    setUserEmailAddress.read(this.MediaBrowserCompat$ItemReceiver);
                }
            }
        }
    }

    /* renamed from: o.setUserEmailAddress$read */
    public static final class read<V> implements writeUInt64NoTag.IconCompatParcelizer<T> {
        private /* synthetic */ setUserEmailAddress MediaBrowserCompat$CustomActionResultReceiver;

        public read(setUserEmailAddress setuseremailaddress) {
            this.MediaBrowserCompat$CustomActionResultReceiver = setuseremailaddress;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((IParameters) obj).read(!setUserEmailAddress.IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public setUserEmailAddress(RegularImmutableBiMap regularImmutableBiMap, setExpandedTitleMargin setexpandedtitlemargin, setCollapsedTitleTextColor setcollapsedtitletextcolor, AppBarLayout.ScrollingViewBehavior scrollingViewBehavior, Serialization.C37651 r6, setTextColor settextcolor, onProviderInstallFailed onproviderinstallfailed, PhenotypeFlag.zza zza, setScrimAnimationDuration setscrimanimationduration, setExpandedTitleMarginStart setexpandedtitlemarginstart, setScrimsShown setscrimsshown, Enums.C33301 r13) {
        super(regularImmutableBiMap, setexpandedtitlemargin, setcollapsedtitletextcolor, scrollingViewBehavior, r6, settextcolor, onproviderinstallfailed, zza, setscrimanimationduration, setexpandedtitlemarginstart, setscrimsshown);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        onGetStartedClick.write((Object) setexpandedtitlemargin, "hmlGetContactInfoCase");
        onGetStartedClick.write((Object) setcollapsedtitletextcolor, "hmlGetApplicationUuid");
        onGetStartedClick.write((Object) scrollingViewBehavior, "hmlGetAddressCase");
        onGetStartedClick.write((Object) r6, "hmlPersonalInfoDisplayMapper");
        onGetStartedClick.write((Object) settextcolor, "updateContactInfoCase");
        onGetStartedClick.write((Object) onproviderinstallfailed, "validateMobileNumberUseCase");
        onGetStartedClick.write((Object) zza, "validateEmailUseCase");
        onGetStartedClick.write((Object) setscrimanimationduration, "hmlGetMaritalStatusCase");
        onGetStartedClick.write((Object) setexpandedtitlemarginstart, "hmlGetEducationLevelsCase");
        onGetStartedClick.write((Object) setscrimsshown, "hmlGetResidentTypesCase");
        onGetStartedClick.write((Object) r13, "formatCitizenCase");
    }

    /* renamed from: o.setUserEmailAddress$write */
    public static final class write {
        private write() {
        }

        @HmlPinActivity
        public write(C6892xb0dca hmlNTBPromptPayNotFoundActivity_ViewBinding$MediaBrowserCompat$ItemReceiver) {
        }
    }

    static {
        String[] strArr = {"M", "R"};
        onGetStartedClick.write((Object) strArr, "elements");
        onGetStartedClick.write((Object) strArr, "$this$asList");
        List<String> asList = Arrays.asList(strArr);
        onGetStartedClick.IconCompatParcelizer((Object) asList, "ArraysUtilJVM.asList(this)");
        PlaybackStateCompat = asList;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        this.MediaSessionCompat$QueueItem.remove(getPageID$MediaBrowserCompat$ItemReceiver.INCOMING);
        super.MediaBrowserCompat$CustomActionResultReceiver();
        boolean z = false;
        writeUInt64NoTag.IconCompatParcelizer parcelableVolumeInfo = new ParcelableVolumeInfo(false);
        if (this.RatingCompat != null) {
            parcelableVolumeInfo.IconCompatParcelizer(this.RatingCompat);
        }
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = setUserEmailAddress$MediaSessionCompat$ResultReceiverWrapper.IconCompatParcelizer;
        if (this.RatingCompat != null) {
            z = true;
        }
        if (z) {
            iconCompatParcelizer.IconCompatParcelizer(this.RatingCompat);
        }
    }

    /* access modifiers changed from: protected */
    public final void MediaBrowserCompat$CustomActionResultReceiver(listNativeSessionFileDirectories listnativesessionfiledirectories) {
        String str;
        CrashlyticsController.C321810 r0;
        super.MediaBrowserCompat$CustomActionResultReceiver(listnativesessionfiledirectories);
        if (listnativesessionfiledirectories == null || (r0 = listnativesessionfiledirectories.IconCompatParcelizer) == null) {
            str = null;
        } else {
            str = r0.read;
        }
        boolean z = true;
        this.AppCompatDialogFragment = str != null;
        writeUInt64NoTag.IconCompatParcelizer ratingCompat = new RatingCompat(this, listnativesessionfiledirectories);
        if (this.RatingCompat == null) {
            z = false;
        }
        if (z) {
            ratingCompat.IconCompatParcelizer(this.RatingCompat);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void MediaBrowserCompat$ItemReceiver(int r4, java.lang.String r5, p040o.getPageID$MediaBrowserCompat$ItemReceiver r6) {
        /*
            r3 = this;
            super.MediaBrowserCompat$ItemReceiver(r4, r5, r6)
            o.getPageID$MediaBrowserCompat$ItemReceiver r0 = p040o.getPageID$MediaBrowserCompat$ItemReceiver.MARITAL_STATUS
            if (r6 != r0) goto L_0x008d
            o.CrashlyticsController$19 r6 = r3.setHasDecor
            r0 = 0
            r1 = 1
            if (r5 != 0) goto L_0x000f
            if (r4 <= 0) goto L_0x0032
        L_0x000f:
            java.util.Map<java.lang.String, java.lang.String> r5 = r3.MediaSessionCompat$Token
            java.util.Set r5 = r5.keySet()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.List r5 = p040o.HmlNTBBusinessURLInformationActivity.MediaBrowserCompat$CustomActionResultReceiver(r5)
            boolean r2 = r3.AppCompatDialogFragment
            r2 = r2 ^ r1
            int r4 = r4 - r2
            java.lang.Object r4 = r5.get(r4)
            java.lang.String r5 = "maritalMap.keys.toList()…tatusPrefilled) 0 else 1]"
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r4, (java.lang.String) r5)
            java.lang.String r4 = (java.lang.String) r4
            java.util.List<java.lang.String> r5 = PlaybackStateCompat
            boolean r4 = r5.contains(r4)
            if (r4 != 0) goto L_0x0034
        L_0x0032:
            r4 = r0
            goto L_0x0035
        L_0x0034:
            r4 = r1
        L_0x0035:
            r6.IconCompatParcelizer = r4
            o.CrashlyticsController$19 r4 = r3.setHasDecor
            boolean r4 = r4.IconCompatParcelizer
            o.setUserEmailAddress$ParcelableVolumeInfo r5 = new o.setUserEmailAddress$ParcelableVolumeInfo
            r5.<init>(r4)
            o.writeUInt64NoTag$IconCompatParcelizer r5 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r5
            T r4 = r3.RatingCompat
            if (r4 == 0) goto L_0x0048
            r4 = r1
            goto L_0x0049
        L_0x0048:
            r4 = r0
        L_0x0049:
            if (r4 == 0) goto L_0x0050
            T r4 = r3.RatingCompat
            r5.IconCompatParcelizer(r4)
        L_0x0050:
            o.setUserEmailAddress$MediaBrowserCompat$CustomActionResultReceiver r4 = new o.setUserEmailAddress$MediaBrowserCompat$CustomActionResultReceiver
            r4.<init>(r3)
            o.writeUInt64NoTag$IconCompatParcelizer r4 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r4
            T r5 = r3.RatingCompat
            if (r5 == 0) goto L_0x005d
            r5 = r1
            goto L_0x005e
        L_0x005d:
            r5 = r0
        L_0x005e:
            if (r5 == 0) goto L_0x0065
            T r5 = r3.RatingCompat
            r4.IconCompatParcelizer(r5)
        L_0x0065:
            o.setUserEmailAddress$IconCompatParcelizer r4 = new o.setUserEmailAddress$IconCompatParcelizer
            r4.<init>(r3)
            o.writeUInt64NoTag$IconCompatParcelizer r4 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r4
            T r5 = r3.RatingCompat
            if (r5 == 0) goto L_0x0072
            r5 = r1
            goto L_0x0073
        L_0x0072:
            r5 = r0
        L_0x0073:
            if (r5 == 0) goto L_0x007a
            T r5 = r3.RatingCompat
            r4.IconCompatParcelizer(r5)
        L_0x007a:
            o.setUserEmailAddress$MediaBrowserCompat$ItemReceiver r4 = new o.setUserEmailAddress$MediaBrowserCompat$ItemReceiver
            r4.<init>(r3)
            o.writeUInt64NoTag$IconCompatParcelizer r4 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r4
            T r5 = r3.RatingCompat
            if (r5 == 0) goto L_0x0086
            r0 = r1
        L_0x0086:
            if (r0 == 0) goto L_0x008d
            T r5 = r3.RatingCompat
            r4.IconCompatParcelizer(r5)
        L_0x008d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.setUserEmailAddress.MediaBrowserCompat$ItemReceiver(int, java.lang.String, o.getPageID$MediaBrowserCompat$ItemReceiver):void");
    }

    /* access modifiers changed from: protected */
    public final getTransitionType IconCompatParcelizer() {
        String str;
        String str2;
        Boolean bool = this.setHasDecor.MediaBrowserCompat$ItemReceiver;
        String str3 = null;
        if (!this.setHasDecor.IconCompatParcelizer) {
            bool = null;
        }
        if (bool == null) {
            return null;
        }
        boolean booleanValue = bool.booleanValue();
        String str4 = booleanValue ? "THAI" : "NON_THAI";
        if (booleanValue) {
            str = this.setHasDecor.read;
        } else {
            str = null;
        }
        if (booleanValue) {
            str2 = this.setHasDecor.MediaBrowserCompat$CustomActionResultReceiver;
        } else {
            str2 = null;
        }
        if (booleanValue) {
            str3 = this.setHasDecor.write;
        }
        return new getTransitionType(str4, str, str2, str3);
    }

    /* access modifiers changed from: private */
    public final boolean MediaBrowserCompat$SearchResultReceiver() {
        int i;
        String str = this.setHasDecor.write;
        if (str != null) {
            i = str.length();
        } else {
            i = 0;
        }
        return i == GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver("X-XXXX-XXXXX-XX-X", "-", "", false).length();
    }

    /* access modifiers changed from: private */
    public final boolean MediaMetadataCompat() {
        CharSequence charSequence = this.setHasDecor.MediaBrowserCompat$CustomActionResultReceiver;
        return ((charSequence == null || GoodToKnowActivity.read(charSequence)) ^ true) && Pattern.matches("^[\\u0E01-\\u0E39\\u0E40-\\u0E4C ]+$", this.setHasDecor.MediaBrowserCompat$CustomActionResultReceiver);
    }

    /* access modifiers changed from: private */
    public final boolean write() {
        CharSequence charSequence = this.setHasDecor.read;
        return ((charSequence == null || GoodToKnowActivity.read(charSequence)) ^ true) && Pattern.matches("^[\\u0E01-\\u0E39\\u0E40-\\u0E4C ]+$", this.setHasDecor.read);
    }

    public static final /* synthetic */ void read(setUserEmailAddress setuseremailaddress) {
        writeUInt64NoTag.IconCompatParcelizer read2 = new read(setuseremailaddress);
        boolean z = true;
        if (setuseremailaddress.RatingCompat != null) {
            read2.IconCompatParcelizer(setuseremailaddress.RatingCompat);
        }
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(setuseremailaddress);
        if (setuseremailaddress.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(setuseremailaddress.RatingCompat);
        }
        writeUInt64NoTag.IconCompatParcelizer setuseremailaddress_mediabrowsercompat_itemreceiver = new setUserEmailAddress$MediaBrowserCompat$ItemReceiver(setuseremailaddress);
        if (setuseremailaddress.RatingCompat != null) {
            setuseremailaddress_mediabrowsercompat_itemreceiver.IconCompatParcelizer(setuseremailaddress.RatingCompat);
        }
        writeUInt64NoTag.IconCompatParcelizer setuseremailaddress_mediabrowsercompat_customactionresultreceiver = new C5388xbb871c72(setuseremailaddress);
        if (setuseremailaddress.RatingCompat == null) {
            z = false;
        }
        if (z) {
            setuseremailaddress_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer(setuseremailaddress.RatingCompat);
        }
    }

    public static final /* synthetic */ boolean IconCompatParcelizer(setUserEmailAddress setuseremailaddress) {
        return !setuseremailaddress.setHasDecor.IconCompatParcelizer || setuseremailaddress.setHasDecor.MediaBrowserCompat$ItemReceiver != null;
    }

    public static final /* synthetic */ void MediaMetadataCompat(setUserEmailAddress setuseremailaddress) {
        boolean z = true;
        writeUInt64NoTag.IconCompatParcelizer parcelableVolumeInfo = new ParcelableVolumeInfo(true);
        if (setuseremailaddress.RatingCompat == null) {
            z = false;
        }
        if (z) {
            parcelableVolumeInfo.IconCompatParcelizer(setuseremailaddress.RatingCompat);
        }
    }

    /* access modifiers changed from: protected */
    public final boolean read() {
        writeUInt64NoTag.IconCompatParcelizer read2 = new read(this);
        if (this.RatingCompat != null) {
            read2.IconCompatParcelizer(this.RatingCompat);
        }
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(this);
        if (this.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(this.RatingCompat);
        }
        writeUInt64NoTag.IconCompatParcelizer setuseremailaddress_mediabrowsercompat_itemreceiver = new setUserEmailAddress$MediaBrowserCompat$ItemReceiver(this);
        if (this.RatingCompat != null) {
            setuseremailaddress_mediabrowsercompat_itemreceiver.IconCompatParcelizer(this.RatingCompat);
        }
        writeUInt64NoTag.IconCompatParcelizer setuseremailaddress_mediabrowsercompat_customactionresultreceiver = new C5388xbb871c72(this);
        if (this.RatingCompat != null) {
            setuseremailaddress_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer(this.RatingCompat);
        }
        if (!super.read()) {
            return false;
        }
        if (!this.setHasDecor.IconCompatParcelizer || onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.setHasDecor.MediaBrowserCompat$ItemReceiver, (Object) Boolean.FALSE) || (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.setHasDecor.MediaBrowserCompat$ItemReceiver, (Object) Boolean.TRUE) && write() && MediaMetadataCompat() && MediaBrowserCompat$SearchResultReceiver())) {
            return true;
        }
        return false;
    }
}
