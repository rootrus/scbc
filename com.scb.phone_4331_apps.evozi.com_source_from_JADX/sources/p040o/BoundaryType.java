package p040o;

import p040o.GoogleMap;
import p040o.IdParameters;
import p040o.Lists;
import p040o.writeUInt64NoTag;

/* renamed from: o.BoundaryType */
public final class BoundaryType extends writeUInt64NoTag<IdParameters.IdSide> {
    public final Lists.TransformingSequentialList write;

    /* renamed from: o.BoundaryType$read */
    static final class read<V> implements writeUInt64NoTag.IconCompatParcelizer<IdParameters.IdSide> {
        private /* synthetic */ GoogleMap.OnMapClickListener MediaBrowserCompat$CustomActionResultReceiver;
        private /* synthetic */ BoundaryType write;

        read(BoundaryType boundaryType, GoogleMap.OnMapClickListener onMapClickListener) {
            this.write = boundaryType;
            this.MediaBrowserCompat$CustomActionResultReceiver = onMapClickListener;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            String str;
            zzwp zzwp;
            IdParameters.IdSide idSide = (IdParameters.IdSide) obj;
            if (!this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver || !this.MediaBrowserCompat$CustomActionResultReceiver.read) {
                zzwi write2 = this.write.write.IconCompatParcelizer.IconCompatParcelizer.write();
                if (write2 == null || (zzwp = write2.read) == null) {
                    str = null;
                } else {
                    str = zzwp.MediaBrowserCompat$CustomActionResultReceiver;
                }
                idSide.IconCompatParcelizer(str);
                return;
            }
            idSide.MediaBrowserCompat$ItemReceiver();
        }
    }

    /* renamed from: o.BoundaryType$write */
    public static final class write extends CheckEligibilityActivity implements FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> {
        private /* synthetic */ BoundaryType MediaBrowserCompat$CustomActionResultReceiver;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public write(BoundaryType boundaryType) {
            super(1);
            this.MediaBrowserCompat$CustomActionResultReceiver = boundaryType;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            onGetStartedClick.write((Object) th, "throwable");
            BoundaryType.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$CustomActionResultReceiver, th);
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public BoundaryType(RegularImmutableBiMap regularImmutableBiMap, Lists.TransformingSequentialList transformingSequentialList) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        onGetStartedClick.write((Object) transformingSequentialList, "scbsOnboardDeepLinkController");
        this.write = transformingSequentialList;
    }

    public final void onDestroy() {
        this.write.IconCompatParcelizer();
        super.onDestroy();
    }

    public static final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(BoundaryType boundaryType, Throwable th) {
        boolean z = true;
        if (boundaryType.RatingCompat != null) {
            boundaryType.RatingCompat.aj_();
        }
        writeUInt64NoTag.IconCompatParcelizer boundaryType$MediaBrowserCompat$ItemReceiver = new BoundaryType$MediaBrowserCompat$ItemReceiver(th);
        if (boundaryType.RatingCompat == null) {
            z = false;
        }
        if (z) {
            boundaryType$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(boundaryType.RatingCompat);
        }
    }

    public static final /* synthetic */ void write(BoundaryType boundaryType, GoogleMap.OnMapClickListener onMapClickListener) {
        boolean z = true;
        if (boundaryType.RatingCompat != null) {
            boundaryType.RatingCompat.aj_();
        }
        writeUInt64NoTag.IconCompatParcelizer read2 = new read(boundaryType, onMapClickListener);
        if (boundaryType.RatingCompat == null) {
            z = false;
        }
        if (z) {
            read2.IconCompatParcelizer(boundaryType.RatingCompat);
        }
    }
}
