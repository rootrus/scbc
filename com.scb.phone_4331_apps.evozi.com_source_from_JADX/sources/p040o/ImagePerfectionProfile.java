package p040o;

import com.google.android.gms.actions.SearchIntents;
import java.util.ArrayList;
import java.util.List;
import p040o.CheckCaptureModule_RttiExceptionResponseDeserializer_Factory;
import p040o.CheckExtractActivity_MembersInjector;
import p040o.CrashlyticsReport;
import p040o.StreetViewPanoramaFragment;
import p040o.access$2300;
import p040o.getImageHeight;
import p040o.getTopLeftCornerWidth;
import p040o.getViewBoundariesImage;
import p040o.writeUInt64NoTag;

/* renamed from: o.ImagePerfectionProfile */
public final /* synthetic */ class ImagePerfectionProfile implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ Image$b$MediaBrowserCompat$CustomActionResultReceiver MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ onCircleClick write;

    /* renamed from: o.ImagePerfectionProfile$UseDocumentDetectionBasedCrop */
    public final /* synthetic */ class UseDocumentDetectionBasedCrop implements writeUInt64NoTag.IconCompatParcelizer {
        private final /* synthetic */ boolean MediaBrowserCompat$CustomActionResultReceiver;
        private final /* synthetic */ List read;
        private final /* synthetic */ MapFragment write;

        public /* synthetic */ UseDocumentDetectionBasedCrop(MapFragment mapFragment, List list, boolean z) {
            this.write = mapFragment;
            this.read = list;
            this.MediaBrowserCompat$CustomActionResultReceiver = z;
        }

        public final void IconCompatParcelizer(Object obj) {
            ((CheckCaptureModule_RttiExceptionResponseDeserializer_Factory.IconCompatParcelizer) obj).write(this.write, this.read, !this.MediaBrowserCompat$CustomActionResultReceiver);
        }
    }

    public /* synthetic */ ImagePerfectionProfile(Image$b$MediaBrowserCompat$CustomActionResultReceiver image$b$MediaBrowserCompat$CustomActionResultReceiver, String str, onCircleClick oncircleclick) {
        this.MediaBrowserCompat$ItemReceiver = image$b$MediaBrowserCompat$CustomActionResultReceiver;
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        this.write = oncircleclick;
    }

    /* renamed from: o.ImagePerfectionProfile$UseMRZPassportDetection */
    public final class UseMRZPassportDetection extends writeUInt64NoTag<getTopLeftCornerWidth.MediaMetadataCompat> {
        public getStreetViewPanoramaCamera IconCompatParcelizer;
        public final include MediaBrowserCompat$ItemReceiver;
        private C3475x499343e1 MediaBrowserCompat$MediaItem;
        private C3478xeef7f070 MediaBrowserCompat$SearchResultReceiver;
        /* access modifiers changed from: private */

        /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
        public List<? extends CrashlyticsReport.Session.Event.Application.Execution> f2722x50fd9e4a;
        private final HmlVerifyEmailActivity MediaDescriptionCompat;
        public boolean MediaMetadataCompat;
        private List<? extends CrashlyticsReport.Session.Event.Application.Execution> MediaSessionCompat$QueueItem;
        /* access modifiers changed from: private */
        public List<? extends CrashlyticsReport.Session.Event.Application.Execution> ParcelableVolumeInfo;
        public StreetViewPanoramaFragment.zza read;
        public final lessThanUnsigned write;

        /* renamed from: o.ImagePerfectionProfile$UseMRZPassportDetection$IconCompatParcelizer */
        public static final class IconCompatParcelizer<V> implements writeUInt64NoTag.IconCompatParcelizer<getTopLeftCornerWidth.MediaMetadataCompat> {
            private /* synthetic */ CrashlyticsReport.Session.Event.Application.Execution IconCompatParcelizer;

            public IconCompatParcelizer(CrashlyticsReport.Session.Event.Application.Execution execution) {
                this.IconCompatParcelizer = execution;
            }

            public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                ((getTopLeftCornerWidth.MediaMetadataCompat) obj).MediaBrowserCompat$CustomActionResultReceiver(this.IconCompatParcelizer);
            }
        }

        /* renamed from: o.ImagePerfectionProfile$UseMRZPassportDetection$write */
        public static final class write<V> implements writeUInt64NoTag.IconCompatParcelizer<getTopLeftCornerWidth.MediaMetadataCompat> {
            public static final write MediaBrowserCompat$ItemReceiver = new write();

            write() {
            }

            public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                ((getTopLeftCornerWidth.MediaMetadataCompat) obj).read();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        @HmlPinActivity
        public UseMRZPassportDetection(lessThanUnsigned lessthanunsigned, include include, RegularImmutableBiMap regularImmutableBiMap) {
            super(regularImmutableBiMap);
            onGetStartedClick.write((Object) lessthanunsigned, "billPaymentBillerDisplayMapper");
            onGetStartedClick.write((Object) include, "billPaymentCase");
            onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
            this.write = lessthanunsigned;
            this.MediaBrowserCompat$ItemReceiver = include;
            FundActionsSuccessActivity read2 = new read(this);
            onGetStartedClick.write((Object) read2, "initializer");
            this.MediaDescriptionCompat = new HmlVerifyPhoneTermsConditionsActivity(read2);
        }

        public final void MediaBrowserCompat$ItemReceiver(String str, String str2, boolean z) {
            onGetStartedClick.write((Object) str, SearchIntents.EXTRA_QUERY);
            onGetStartedClick.write((Object) str2, "scrollId");
            if (this.MediaSessionCompat$QueueItem == null) {
                this.MediaSessionCompat$QueueItem = new ArrayList();
            }
            if (this.RatingCompat != null) {
                this.RatingCompat.Keep();
            }
            if (!this.MediaMetadataCompat || z) {
                C3475x499343e1 imagePerfectionProfile$UseMRZPassportDetection$MediaBrowserCompat$CustomActionResultReceiver = this.MediaBrowserCompat$MediaItem;
                if (imagePerfectionProfile$UseMRZPassportDetection$MediaBrowserCompat$CustomActionResultReceiver != null) {
                    imagePerfectionProfile$UseMRZPassportDetection$MediaBrowserCompat$CustomActionResultReceiver.dispose();
                }
                C3478xeef7f070 imagePerfectionProfile$UseMRZPassportDetection$MediaBrowserCompat$ItemReceiver = this.MediaBrowserCompat$SearchResultReceiver;
                if (imagePerfectionProfile$UseMRZPassportDetection$MediaBrowserCompat$ItemReceiver != null) {
                    imagePerfectionProfile$UseMRZPassportDetection$MediaBrowserCompat$ItemReceiver.dispose();
                }
                this.MediaMetadataCompat = true;
                this.MediaBrowserCompat$ItemReceiver.write(str, str2, false);
                C3475x499343e1 imagePerfectionProfile$UseMRZPassportDetection$MediaBrowserCompat$CustomActionResultReceiver2 = new C3475x499343e1(this, z);
                this.MediaBrowserCompat$MediaItem = imagePerfectionProfile$UseMRZPassportDetection$MediaBrowserCompat$CustomActionResultReceiver2;
                this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(imagePerfectionProfile$UseMRZPassportDetection$MediaBrowserCompat$CustomActionResultReceiver2);
            }
        }

        public final void onDestroy() {
            super.onDestroy();
            this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver();
        }

        /* renamed from: o.ImagePerfectionProfile$UseMRZPassportDetection$read */
        static final class read extends CheckEligibilityActivity implements FundActionsSuccessActivity<onInfoWindowLongClick> {
            private /* synthetic */ UseMRZPassportDetection read;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            read(UseMRZPassportDetection useMRZPassportDetection) {
                super(0);
                this.read = useMRZPassportDetection;
            }

            public final /* synthetic */ Object invoke() {
                return this.read.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.write();
            }
        }

        public static final /* synthetic */ List MediaBrowserCompat$CustomActionResultReceiver(List list) {
            List MediaBrowserCompat$CustomActionResultReceiver = list != null ? HmlNTBBusinessURLInformationActivity.MediaBrowserCompat$CustomActionResultReceiver(list) : null;
            return MediaBrowserCompat$CustomActionResultReceiver == null ? HmlNationalIdActivity.IconCompatParcelizer : MediaBrowserCompat$CustomActionResultReceiver;
        }

        public static final /* synthetic */ List read(UseMRZPassportDetection useMRZPassportDetection) {
            List<? extends CrashlyticsReport.Session.Event.Application.Execution> list = useMRZPassportDetection.f2722x50fd9e4a;
            return list == null ? HmlNationalIdActivity.IconCompatParcelizer : list;
        }

        public static final /* synthetic */ onInfoWindowLongClick MediaBrowserCompat$ItemReceiver(UseMRZPassportDetection useMRZPassportDetection) {
            return (onInfoWindowLongClick) useMRZPassportDetection.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver();
        }

        public static final /* synthetic */ List MediaMetadataCompat(UseMRZPassportDetection useMRZPassportDetection) {
            List<? extends CrashlyticsReport.Session.Event.Application.Execution> list = useMRZPassportDetection.ParcelableVolumeInfo;
            return list == null ? HmlNationalIdActivity.IconCompatParcelizer : list;
        }

        public static final /* synthetic */ void RatingCompat(UseMRZPassportDetection useMRZPassportDetection) {
            if (useMRZPassportDetection.RatingCompat != null) {
                useMRZPassportDetection.RatingCompat.ay_();
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0049, code lost:
            if (r0.MediaBrowserCompat$ItemReceiver(r2, r3) == null) goto L_0x004b;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void write() {
            /*
                r4 = this;
                T r0 = r4.RatingCompat
                if (r0 == 0) goto L_0x0006
                r0 = 1
                goto L_0x0007
            L_0x0006:
                r0 = 0
            L_0x0007:
                if (r0 == 0) goto L_0x000e
                T r0 = r4.RatingCompat
                r0.Keep()
            L_0x000e:
                o.ImagePerfectionProfile$UseMRZPassportDetection$MediaBrowserCompat$CustomActionResultReceiver r0 = r4.MediaBrowserCompat$MediaItem
                if (r0 == 0) goto L_0x0015
                r0.dispose()
            L_0x0015:
                o.ImagePerfectionProfile$UseMRZPassportDetection$MediaBrowserCompat$ItemReceiver r0 = r4.MediaBrowserCompat$SearchResultReceiver
                if (r0 == 0) goto L_0x001c
                r0.dispose()
            L_0x001c:
                o.HmlVerifyEmailActivity r0 = r4.MediaDescriptionCompat
                java.lang.Object r0 = r0.MediaBrowserCompat$CustomActionResultReceiver()
                o.onInfoWindowLongClick r0 = (p040o.onInfoWindowLongClick) r0
                r1 = 0
                if (r0 == 0) goto L_0x004b
                o.include r0 = r4.MediaBrowserCompat$ItemReceiver
                o.HmlVerifyEmailActivity r2 = r4.MediaDescriptionCompat
                java.lang.Object r2 = r2.MediaBrowserCompat$CustomActionResultReceiver()
                o.onInfoWindowLongClick r2 = (p040o.onInfoWindowLongClick) r2
                if (r2 == 0) goto L_0x0036
                java.lang.String r2 = r2.setBackgroundResource
                goto L_0x0037
            L_0x0036:
                r2 = r1
            L_0x0037:
                o.HmlVerifyEmailActivity r3 = r4.MediaDescriptionCompat
                java.lang.Object r3 = r3.MediaBrowserCompat$CustomActionResultReceiver()
                o.onInfoWindowLongClick r3 = (p040o.onInfoWindowLongClick) r3
                if (r3 == 0) goto L_0x0044
                java.lang.String r3 = r3.setCheckable
                goto L_0x0045
            L_0x0044:
                r3 = r1
            L_0x0045:
                o.DebitCardResetOtpActivity r0 = r0.MediaBrowserCompat$ItemReceiver(r2, r3)
                if (r0 != 0) goto L_0x0055
            L_0x004b:
                r0 = r4
                o.ImagePerfectionProfile$UseMRZPassportDetection r0 = (p040o.ImagePerfectionProfile.UseMRZPassportDetection) r0
                r0.IconCompatParcelizer = r1
                o.include r0 = r0.MediaBrowserCompat$ItemReceiver
                r0.IconCompatParcelizer()
            L_0x0055:
                o.ImagePerfectionProfile$UseMRZPassportDetection$MediaBrowserCompat$ItemReceiver r0 = new o.ImagePerfectionProfile$UseMRZPassportDetection$MediaBrowserCompat$ItemReceiver
                r0.<init>(r4)
                r4.MediaBrowserCompat$SearchResultReceiver = r0
                o.include r1 = r4.MediaBrowserCompat$ItemReceiver
                o.IndoorBuilding$MediaBrowserCompat$ItemReceiver r0 = (p040o.IndoorBuilding$MediaBrowserCompat$ItemReceiver) r0
                r1.IconCompatParcelizer(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.ImagePerfectionProfile.UseMRZPassportDetection.write():void");
        }
    }

    /* renamed from: o.ImagePerfectionProfile$UseTargetFrameCrop */
    public class UseTargetFrameCrop extends writeUInt64NoTag<getImageHeight.write> {
        public final title IconCompatParcelizer;
        public boolean write;

        @HmlPinActivity
        UseTargetFrameCrop(RegularImmutableBiMap regularImmutableBiMap, title title) {
            super(regularImmutableBiMap);
            this.IconCompatParcelizer = title;
        }

        static /* synthetic */ void write(access$1600 access_1600, getImageHeight.write write2) {
            write2.MediaBrowserCompat$ItemReceiver(access_1600);
            write2.read(access_1600);
            write2.IconCompatParcelizer(access_1600);
        }

        static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(UseTargetFrameCrop useTargetFrameCrop) {
            if (useTargetFrameCrop.RatingCompat != null) {
                useTargetFrameCrop.RatingCompat.aj_();
            }
        }

        static /* synthetic */ void read(UseTargetFrameCrop useTargetFrameCrop) {
            if (useTargetFrameCrop.RatingCompat != null) {
                useTargetFrameCrop.RatingCompat.aj_();
            }
        }
    }

    public final void IconCompatParcelizer(Object obj) {
        Image$b$MediaBrowserCompat$CustomActionResultReceiver image$b$MediaBrowserCompat$CustomActionResultReceiver = this.MediaBrowserCompat$ItemReceiver;
        ((CheckExtractActivity_MembersInjector.setExpandedFormat) obj).read(image$b$MediaBrowserCompat$CustomActionResultReceiver.write.MediaBrowserCompat$ItemReceiver.read(this.MediaBrowserCompat$CustomActionResultReceiver, this.write, false, false, (String) null));
    }

    /* renamed from: o.ImagePerfectionProfile$FriendIPP */
    public final /* synthetic */ class FriendIPP implements writeUInt64NoTag.IconCompatParcelizer {
        private final /* synthetic */ Throwable IconCompatParcelizer;
        private final /* synthetic */ getViewBoundariesImage.read read;

        public /* synthetic */ FriendIPP(getViewBoundariesImage.read read2, Throwable th) {
            this.read = read2;
            this.IconCompatParcelizer = th;
        }

        public final void IconCompatParcelizer(Object obj) {
            getViewBoundariesImage.read read2 = this.read;
            ((CheckCaptureModule_RttiExceptionResponseDeserializer_Factory.IconCompatParcelizer) obj).write(getViewBoundariesImage.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer, access$2300.write.NAVIGATE_BACK));
        }
    }
}
