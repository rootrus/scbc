package p040o;

import android.text.TextUtils;
import java.util.List;
import p040o.Iterables;
import p040o.KtaJsonCheck;
import p040o.access$2300;

/* renamed from: o.cy */
public class C4223cy extends writeUInt64NoTag<KtaJsonCheck.read> {
    public final Iterables.C352212 IconCompatParcelizer;
    public final INativeImageLabeler MediaBrowserCompat$ItemReceiver;
    /* access modifiers changed from: private */
    public final MapMaker MediaBrowserCompat$MediaItem;
    public final getDigest read;
    public final LatLng write;

    @HmlPinActivity
    public C4223cy(RegularImmutableBiMap regularImmutableBiMap, LatLng latLng, MapMaker mapMaker, getDigest getdigest, INativeImageLabeler iNativeImageLabeler, Iterables.C352212 r6) {
        super(regularImmutableBiMap);
        this.write = latLng;
        this.MediaBrowserCompat$MediaItem = mapMaker;
        this.read = getdigest;
        this.MediaBrowserCompat$ItemReceiver = iNativeImageLabeler;
        this.IconCompatParcelizer = r6;
    }

    public static boolean MediaBrowserCompat$CustomActionResultReceiver(String str) {
        return "TH".equalsIgnoreCase(str);
    }

    public static int MediaBrowserCompat$CustomActionResultReceiver(List<MoreExecutors> list, String str) {
        if (list == null) {
            return 0;
        }
        for (int i = 0; i < list.size(); i++) {
            if (str.equalsIgnoreCase(list.get(i).MediaBrowserCompat$ItemReceiver)) {
                return i;
            }
        }
        return 0;
    }

    static /* synthetic */ void write(boolean z, KtaJsonCheck.read read2) {
        if (z) {
            read2.read();
        } else {
            read2.MediaBrowserCompat$ItemReceiver();
        }
    }

    public static boolean MediaBrowserCompat$ItemReceiver(String str) {
        return !TextUtils.isEmpty(str);
    }

    public static standardSubSet read(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17) {
        standardSubSet standardsubset = new standardSubSet();
        standardsubset.MediaBrowserCompat$ItemReceiver = str2;
        standardsubset.IconCompatParcelizer = str3;
        standardsubset.MediaSessionCompat$Token = str5;
        standardsubset.ParcelableVolumeInfo = str6;
        standardsubset.MediaBrowserCompat$SearchResultReceiver = str7;
        standardsubset.MediaBrowserCompat$MediaItem = str8;
        standardsubset.write = str;
        if (str.equalsIgnoreCase("TH")) {
            standardsubset.MediaDescriptionCompat = str4;
            standardsubset.read = str9;
            standardsubset.MediaBrowserCompat$CustomActionResultReceiver = str10;
            standardsubset.RatingCompat = str11;
            standardsubset.MediaSessionCompat$ResultReceiverWrapper = str12;
        } else {
            standardsubset.MediaDescriptionCompat = str14;
            standardsubset.read = str13;
            standardsubset.RatingCompat = str15;
            standardsubset.MediaMetadataCompat = str16;
            standardsubset.MediaSessionCompat$ResultReceiverWrapper = str17;
        }
        return standardsubset;
    }

    /* renamed from: o.cy$read */
    public final class read extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<zzuk> {
        private read() {
        }

        public /* synthetic */ read(C4223cy cyVar, byte b) {
            this();
        }

        public final void onError(Throwable th) {
            C4223cy.this.MediaBrowserCompat$ItemReceiver(C4223cy.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
        }

        public final /* synthetic */ void onNext(Object obj) {
            C4223cy cyVar = C4223cy.this;
            C9882cu cuVar = C9882cu.IconCompatParcelizer;
            if (cyVar.RatingCompat != null) {
                cuVar.IconCompatParcelizer(cyVar.RatingCompat);
            }
            C4223cy.write(C4223cy.this);
        }
    }

    /* renamed from: o.cy$IconCompatParcelizer */
    public final class IconCompatParcelizer extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<setContentDescription> {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(C4223cy cyVar, byte b) {
            this();
        }

        public final /* synthetic */ void onNext(Object obj) {
            C4223cy.read(C4223cy.this);
            C4223cy cyVar = C4223cy.this;
            C9881co coVar = new C9881co((setContentDescription) obj);
            if (cyVar.RatingCompat != null) {
                coVar.IconCompatParcelizer(cyVar.RatingCompat);
            }
        }

        public final void onError(Throwable th) {
            C4223cy.this.MediaBrowserCompat$ItemReceiver(C4223cy.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
        }
    }

    static /* synthetic */ void read(C4223cy cyVar) {
        if (cyVar.RatingCompat != null) {
            cyVar.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void MediaBrowserCompat$ItemReceiver(C4223cy cyVar) {
        if (cyVar.RatingCompat != null) {
            cyVar.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(C4223cy cyVar) {
        if (cyVar.RatingCompat != null) {
            cyVar.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void write(C4223cy cyVar) {
        if (cyVar.RatingCompat != null) {
            cyVar.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(addDelayedShutdownHook adddelayedshutdownhook, KtaJsonCheck.read read2) {
        read2.MediaBrowserCompat$MediaItem(adddelayedshutdownhook.RatingCompat);
        read2.IconCompatParcelizer(adddelayedshutdownhook.read);
        read2.MediaDescriptionCompat(adddelayedshutdownhook.MediaDescriptionCompat);
        read2.read(adddelayedshutdownhook.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public static String write(AutoValue_CrashlyticsReport_CustomAttribute autoValue_CrashlyticsReport_CustomAttribute) {
        return (autoValue_CrashlyticsReport_CustomAttribute == null || autoValue_CrashlyticsReport_CustomAttribute.IconCompatParcelizer == null) ? "TH" : autoValue_CrashlyticsReport_CustomAttribute.IconCompatParcelizer;
    }
}
