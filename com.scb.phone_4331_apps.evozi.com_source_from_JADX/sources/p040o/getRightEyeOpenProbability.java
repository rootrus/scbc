package p040o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p040o.IExtractorListener;
import p040o.access$2300;
import p040o.forArray;
import p040o.writeUInt64NoTag;

/* renamed from: o.getRightEyeOpenProbability */
public final class getRightEyeOpenProbability extends writeUInt64NoTag<IExtractorListener> {
    /* access modifiers changed from: private */
    public final forArray IconCompatParcelizer;
    /* access modifiers changed from: private */
    public final toLongArray write;

    /* renamed from: o.getRightEyeOpenProbability$IconCompatParcelizer */
    public static final class IconCompatParcelizer<V> implements writeUInt64NoTag.IconCompatParcelizer<IExtractorListener> {
        private /* synthetic */ String IconCompatParcelizer;
        private /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver;
        final /* synthetic */ getRightEyeOpenProbability MediaBrowserCompat$ItemReceiver;
        private /* synthetic */ List MediaDescriptionCompat;
        private /* synthetic */ List read;
        private /* synthetic */ String write;

        public IconCompatParcelizer(getRightEyeOpenProbability getrighteyeopenprobability, String str, String str2, String str3, List list, List list2) {
            this.MediaBrowserCompat$ItemReceiver = getrighteyeopenprobability;
            this.write = str;
            this.MediaBrowserCompat$CustomActionResultReceiver = str2;
            this.IconCompatParcelizer = str3;
            this.MediaDescriptionCompat = list;
            this.read = list2;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            final IExtractorListener iExtractorListener = (IExtractorListener) obj;
            iExtractorListener.AlertController$RecycleListView();
            forArray MediaBrowserCompat$ItemReceiver2 = this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer;
            String str = this.write;
            String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
            String str3 = this.IconCompatParcelizer;
            List list = this.MediaDescriptionCompat;
            List list2 = this.read;
            FundFactSheetActivity r8 = new FundFactSheetActivity<onMessageTriggered, HmlVerifyPhoneValidateOtpActivity>() {
                public final /* synthetic */ Object invoke(Object obj) {
                    onMessageTriggered onmessagetriggered = (onMessageTriggered) obj;
                    onGetStartedClick.write((Object) onmessagetriggered, "display");
                    iExtractorListener.aj_();
                    iExtractorListener.read(onmessagetriggered);
                    return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
                }
            };
            FundFactSheetActivity r9 = new FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity>(this) {
                private /* synthetic */ IconCompatParcelizer MediaBrowserCompat$ItemReceiver;

                {
                    this.MediaBrowserCompat$ItemReceiver = r1;
                }

                public final /* synthetic */ Object invoke(Object obj) {
                    Throwable th = (Throwable) obj;
                    onGetStartedClick.write((Object) th, "throwable");
                    access$2200 MediaBrowserCompat$ItemReceiver2 = this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.NAVIGATE_BACK);
                    iExtractorListener.aj_();
                    iExtractorListener.write(MediaBrowserCompat$ItemReceiver2);
                    return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
                }
            };
            onGetStartedClick.write((Object) str, "cardRefNo");
            onGetStartedClick.write((Object) str2, "ch");
            onGetStartedClick.write((Object) str3, "address");
            onGetStartedClick.write((Object) list, "tempSelectCard");
            onGetStartedClick.write((Object) list2, "ccdList");
            onGetStartedClick.write((Object) r8, "onSuccess");
            onGetStartedClick.write((Object) r9, "onError");
            getReceiveBufferSize getreceivebuffersize = MediaBrowserCompat$ItemReceiver2.write;
            ArrayList arrayList = new ArrayList();
            Iterable<String> iterable = list;
            onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
            Collection arrayList2 = new ArrayList(iterable instanceof Collection ? ((Collection) iterable).size() : 10);
            for (String removeexactly : iterable) {
                arrayList2.add(Boolean.valueOf(arrayList.add(new removeExactly(removeexactly))));
            }
            getreceivebuffersize.read(r8, r9, new getReceiveBufferSize$MediaBrowserCompat$ItemReceiver(str, new unbox(arrayList, str2, str3)), new forArray.write(MediaBrowserCompat$ItemReceiver2, list2), MediaBrowserCompat$ItemReceiver2.MediaBrowserCompat$ItemReceiver);
        }
    }

    /* renamed from: o.getRightEyeOpenProbability$read */
    public static final class read<V> implements writeUInt64NoTag.IconCompatParcelizer<IExtractorListener> {
        private /* synthetic */ boolean MediaBrowserCompat$CustomActionResultReceiver = true;
        private /* synthetic */ getRightEyeOpenProbability MediaBrowserCompat$ItemReceiver;
        private /* synthetic */ String write;

        public read(getRightEyeOpenProbability getrighteyeopenprobability, String str, boolean z) {
            this.MediaBrowserCompat$ItemReceiver = getrighteyeopenprobability;
            this.write = str;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            IExtractorListener iExtractorListener = (IExtractorListener) obj;
            iExtractorListener.IconCompatParcelizer();
            toLongArray read = this.MediaBrowserCompat$ItemReceiver.write;
            String str = this.write;
            boolean z = this.MediaBrowserCompat$CustomActionResultReceiver;
            iExtractorListener.read(new immediateFailedFuture("TERMS_N_CONDITIONS", (String) null, str, (String) null, (String) null, read.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.ccr_btn_accerpt), read.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.ccr_btn_decline), z, true, 512));
        }
    }

    /* renamed from: o.getRightEyeOpenProbability$write */
    public static final class write<V> implements writeUInt64NoTag.IconCompatParcelizer<IExtractorListener> {
        public static final write IconCompatParcelizer = new write();

        write() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            final IExtractorListener iExtractorListener = (IExtractorListener) obj;
            iExtractorListener.MediaBrowserCompat$ItemReceiver((IExtractorListener.read) new IExtractorListener.read() {
                public final void read() {
                    iExtractorListener.write();
                }
            });
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public getRightEyeOpenProbability(RegularImmutableBiMap regularImmutableBiMap, toLongArray tolongarray, forArray forarray) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        onGetStartedClick.write((Object) tolongarray, "termsAndConditionsMapper");
        onGetStartedClick.write((Object) forarray, "controller");
        this.write = tolongarray;
        this.IconCompatParcelizer = forarray;
    }
}
