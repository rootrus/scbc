package p040o;

import p040o.C10827Iterators;
import p040o.GoogleMap;
import p040o.IdWorkflowActivity;
import p040o.MissingNativeComponent;
import p040o.Multimaps;
import p040o.writeUInt64NoTag;

/* renamed from: o.nativeGetImage */
public final class nativeGetImage extends writeUInt64NoTag<IdWorkflowActivity.C1222a> {
    private final Multimaps.MapMultimap.AsMapEntries.C36731 MediaBrowserCompat$ItemReceiver;
    public final C10827Iterators.C35445 read;
    private final getEulerY write;

    /* renamed from: o.nativeGetImage$IconCompatParcelizer */
    static final class IconCompatParcelizer<V> implements writeUInt64NoTag.IconCompatParcelizer<IdWorkflowActivity.C1222a> {
        private /* synthetic */ standardStartAndWait IconCompatParcelizer;

        IconCompatParcelizer(standardStartAndWait standardstartandwait) {
            this.IconCompatParcelizer = standardstartandwait;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((IdWorkflowActivity.C1222a) obj).read(this.IconCompatParcelizer);
        }
    }

    /* renamed from: o.nativeGetImage$read */
    public static final class read extends CheckEligibilityActivity implements FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> {
        private /* synthetic */ nativeGetImage write;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public read(nativeGetImage nativegetimage) {
            super(1);
            this.write = nativegetimage;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            onGetStartedClick.write((Object) th, "it");
            nativeGetImage.MediaBrowserCompat$CustomActionResultReceiver(this.write, th);
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    /* renamed from: o.nativeGetImage$write */
    public static final class write extends CheckEligibilityActivity implements FundFactSheetActivity<showInfoWindow, HmlVerifyPhoneValidateOtpActivity> {
        private /* synthetic */ MissingNativeComponent.MissingNativeSessionFileProvider IconCompatParcelizer;
        private /* synthetic */ nativeGetImage MediaBrowserCompat$ItemReceiver;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public write(nativeGetImage nativegetimage, MissingNativeComponent.MissingNativeSessionFileProvider missingNativeSessionFileProvider) {
            super(1);
            this.MediaBrowserCompat$ItemReceiver = nativegetimage;
            this.IconCompatParcelizer = missingNativeSessionFileProvider;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            showInfoWindow showinfowindow = (showInfoWindow) obj;
            onGetStartedClick.write((Object) showinfowindow, "it");
            nativeGetImage.write(this.MediaBrowserCompat$ItemReceiver, showinfowindow, this.IconCompatParcelizer);
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public nativeGetImage(RegularImmutableBiMap regularImmutableBiMap, C10827Iterators.C35445 r3, Multimaps.MapMultimap.AsMapEntries.C36731 r4, getEulerY geteulery) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        onGetStartedClick.write((Object) r3, "directDebitController");
        onGetStartedClick.write((Object) r4, "directDebitSuccessMapper");
        onGetStartedClick.write((Object) geteulery, "userProfileCase");
        this.read = r3;
        this.MediaBrowserCompat$ItemReceiver = r4;
        this.write = geteulery;
    }

    public static final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(nativeGetImage nativegetimage, Throwable th) {
        boolean z = true;
        if (nativegetimage.RatingCompat != null) {
            nativegetimage.RatingCompat.aj_();
        }
        writeUInt64NoTag.IconCompatParcelizer nativegetimage_mediabrowsercompat_itemreceiver = new nativeGetImage$MediaBrowserCompat$ItemReceiver(nativegetimage, th);
        if (nativegetimage.RatingCompat == null) {
            z = false;
        }
        if (z) {
            nativegetimage_mediabrowsercompat_itemreceiver.IconCompatParcelizer(nativegetimage.RatingCompat);
        }
    }

    public static final /* synthetic */ void write(nativeGetImage nativegetimage, showInfoWindow showinfowindow, MissingNativeComponent.MissingNativeSessionFileProvider missingNativeSessionFileProvider) {
        Multimaps.MapMultimap.AsMapEntries.C36731 r0 = nativegetimage.MediaBrowserCompat$ItemReceiver;
        GoogleMap.OnMarkerDragListener AppCompatDelegateImpl$ListMenuDecorView = nativegetimage.write.MediaBrowserCompat$ItemReceiver.AppCompatDelegateImpl$ListMenuDecorView();
        onGetStartedClick.IconCompatParcelizer((Object) AppCompatDelegateImpl$ListMenuDecorView, "userProfileCase.userProfile");
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(r0.MediaBrowserCompat$ItemReceiver(missingNativeSessionFileProvider, AppCompatDelegateImpl$ListMenuDecorView, showinfowindow));
        if (nativegetimage.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(nativegetimage.RatingCompat);
        }
    }
}
