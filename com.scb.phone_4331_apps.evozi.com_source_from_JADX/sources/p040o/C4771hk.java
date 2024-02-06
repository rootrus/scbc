package p040o;

import com.scb.phone.data.network.service.DeepLinkService;
import java.util.ArrayList;
import p040o.GoogleMap;
import p040o.LocalProjectProvider;
import p040o.writeUInt64NoTag;

/* renamed from: o.hk */
public final class C4771hk extends writeUInt64NoTag<LocalProjectProvider.C6939a.read> {
    public getCustomAttributes IconCompatParcelizer;
    /* access modifiers changed from: private */
    public final newWriter MediaBrowserCompat$ItemReceiver;
    public AutoValue_CrashlyticsReport_Session_Event_Application read;
    public final newLinkedList write;

    /* renamed from: o.hk$MediaMetadataCompat */
    public static final class MediaMetadataCompat extends CheckEligibilityActivity implements FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> {
        private /* synthetic */ C4771hk read;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public MediaMetadataCompat(C4771hk hkVar) {
            super(1);
            this.read = hkVar;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            onGetStartedClick.write((Object) (Throwable) obj, "it");
            C4771hk.IconCompatParcelizer(this.read);
            C4771hk hkVar = this.read;
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C47723.MediaBrowserCompat$ItemReceiver;
            if (hkVar.RatingCompat != null) {
                iconCompatParcelizer.IconCompatParcelizer(hkVar.RatingCompat);
            }
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    /* renamed from: o.hk$RatingCompat */
    public static final class RatingCompat<V> implements writeUInt64NoTag.IconCompatParcelizer<LocalProjectProvider.C6939a.read> {
        private /* synthetic */ ArrayList IconCompatParcelizer;
        private /* synthetic */ C4771hk read;

        public RatingCompat(C4771hk hkVar, ArrayList arrayList) {
            this.read = hkVar;
            this.IconCompatParcelizer = arrayList;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            LocalProjectProvider.C6939a.read read2 = (LocalProjectProvider.C6939a.read) obj;
            boolean contains = C4771hk.MediaBrowserCompat$ItemReceiver(this.read).IconCompatParcelizer.IconCompatParcelizer.contains("CURRENCY_CONVERSION");
            boolean contains2 = this.IconCompatParcelizer.contains("BUY_CURRENCY");
            boolean z = true;
            read2.MediaBrowserCompat$CustomActionResultReceiver(contains && C4771hk.write(this.read).MediaBrowserCompat$ItemReceiver.contains("SELL_CURRENCY"));
            if (!contains || !contains2) {
                z = false;
            }
            read2.MediaBrowserCompat$ItemReceiver(z);
        }
    }

    /* renamed from: o.hk$write */
    static final class write<V> implements writeUInt64NoTag.IconCompatParcelizer<LocalProjectProvider.C6939a.read> {
        private /* synthetic */ GoogleMap.OnCameraMoveStartedListener MediaBrowserCompat$ItemReceiver;
        private /* synthetic */ C4771hk read;

        write(C4771hk hkVar, GoogleMap.OnCameraMoveStartedListener onCameraMoveStartedListener) {
            this.read = hkVar;
            this.MediaBrowserCompat$ItemReceiver = onCameraMoveStartedListener;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            newWriter unused = this.read.MediaBrowserCompat$ItemReceiver;
            GoogleMap.OnCameraMoveStartedListener onCameraMoveStartedListener = this.MediaBrowserCompat$ItemReceiver;
            onGetStartedClick.write((Object) onCameraMoveStartedListener, "entity");
            ((LocalProjectProvider.C6939a.read) obj).write(new setArch(onCameraMoveStartedListener.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver, onCameraMoveStartedListener.write.MediaBrowserCompat$CustomActionResultReceiver));
        }
    }

    /* renamed from: o.hk$IconCompatParcelizer */
    public static final class IconCompatParcelizer<V> implements writeUInt64NoTag.IconCompatParcelizer<LocalProjectProvider.C6939a.read> {
        private /* synthetic */ C4771hk MediaBrowserCompat$ItemReceiver;

        public IconCompatParcelizer(C4771hk hkVar) {
            this.MediaBrowserCompat$ItemReceiver = hkVar;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            newWriter unused = this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver;
            ((LocalProjectProvider.C6939a.read) obj).write(newWriter.MediaBrowserCompat$CustomActionResultReceiver(C4771hk.write(this.MediaBrowserCompat$ItemReceiver), C4771hk.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver), "B"));
        }
    }

    public static final /* synthetic */ getCustomAttributes MediaBrowserCompat$ItemReceiver(C4771hk hkVar) {
        getCustomAttributes getcustomattributes = hkVar.IconCompatParcelizer;
        if (getcustomattributes == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mTravelWalletSummaryDisplay");
        }
        return getcustomattributes;
    }

    public static final /* synthetic */ AutoValue_CrashlyticsReport_Session_Event_Application write(C4771hk hkVar) {
        AutoValue_CrashlyticsReport_Session_Event_Application autoValue_CrashlyticsReport_Session_Event_Application = hkVar.read;
        if (autoValue_CrashlyticsReport_Session_Event_Application == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mTravelWalletDisplay");
        }
        return autoValue_CrashlyticsReport_Session_Event_Application;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public C4771hk(RegularImmutableBiMap regularImmutableBiMap, newLinkedList newlinkedlist, newWriter newwriter) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) newlinkedlist, "controller");
        onGetStartedClick.write((Object) newwriter, "mapper");
        this.write = newlinkedlist;
        this.MediaBrowserCompat$ItemReceiver = newwriter;
    }

    /* renamed from: o.hk$read */
    public static final class read {
        public final DeepLinkService IconCompatParcelizer;

        private read() {
        }

        @HmlPinActivity
        public read(DeepLinkService deepLinkService) {
            this.IconCompatParcelizer = deepLinkService;
        }
    }

    public final void onDestroy() {
        this.write.IconCompatParcelizer();
        super.onDestroy();
    }

    public static final /* synthetic */ void read(C4771hk hkVar, GoogleMap.OnCameraMoveStartedListener onCameraMoveStartedListener) {
        writeUInt64NoTag.IconCompatParcelizer write2 = new write(hkVar, onCameraMoveStartedListener);
        if (hkVar.RatingCompat != null) {
            write2.IconCompatParcelizer(hkVar.RatingCompat);
        }
    }

    public static final /* synthetic */ void IconCompatParcelizer(C4771hk hkVar) {
        if (hkVar.RatingCompat != null) {
            hkVar.RatingCompat.aj_();
        }
    }
}
