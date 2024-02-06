package p040o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p040o.Serialization;
import p040o.writeUInt64NoTag;
import p040o.zziu;

/* renamed from: o.initializeNetworkSettings */
public final class initializeNetworkSettings extends writeUInt64NoTag<getIPassportDeserializerRtti> {
    public final ChequeInquiryDeepLinkActivity MediaBrowserCompat$ItemReceiver = new ChequeInquiryDeepLinkActivity();
    public final BottomSheetDialogFragment read;
    /* access modifiers changed from: private */
    public final Serialization.FieldSetter write;

    /* renamed from: o.initializeNetworkSettings$write */
    public static final class write extends CheckEligibilityActivity implements FundFactSheetActivity<idealIntArraySize, HmlVerifyPhoneValidateOtpActivity> {
        final /* synthetic */ boolean MediaBrowserCompat$ItemReceiver;
        final /* synthetic */ initializeNetworkSettings write;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public write(initializeNetworkSettings initializenetworksettings, boolean z) {
            super(1);
            this.write = initializenetworksettings;
            this.MediaBrowserCompat$ItemReceiver = z;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            final idealIntArraySize idealintarraysize = (idealIntArraySize) obj;
            onGetStartedClick.write((Object) idealintarraysize, "it");
            initializeNetworkSettings initializenetworksettings = this.write;
            writeUInt64NoTag.IconCompatParcelizer r1 = new writeUInt64NoTag.IconCompatParcelizer<getIPassportDeserializerRtti>(this) {
                private /* synthetic */ write read;

                {
                    this.read = r1;
                }

                public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                    T t;
                    T t2;
                    T t3;
                    getIPassportDeserializerRtti getipassportdeserializerrtti = (getIPassportDeserializerRtti) obj;
                    Serialization.FieldSetter IconCompatParcelizer2 = this.read.write.write;
                    idealIntArraySize idealintarraysize = idealintarraysize;
                    boolean z = this.read.MediaBrowserCompat$ItemReceiver;
                    onGetStartedClick.write((Object) idealintarraysize, "entry");
                    zzui<String> zzui = idealintarraysize.IconCompatParcelizer;
                    if (z) {
                        t = zzui.write;
                    } else {
                        t = zzui.read;
                    }
                    String str = (String) t;
                    String c_ = IconCompatParcelizer2.mo26549c_(idealintarraysize.write);
                    onGetStartedClick.IconCompatParcelizer((Object) c_, "transformAssetUrl(entry.iconPath)");
                    zzui<String> zzui2 = idealintarraysize.MediaBrowserCompat$CustomActionResultReceiver;
                    if (z) {
                        t2 = zzui2.write;
                    } else {
                        t2 = zzui2.read;
                    }
                    String str2 = (String) t2;
                    Iterable<zziu.zzd> iterable = idealintarraysize.read;
                    int i = 10;
                    onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
                    if (iterable instanceof Collection) {
                        i = ((Collection) iterable).size();
                    }
                    Collection arrayList = new ArrayList(i);
                    for (zziu.zzd zzd : iterable) {
                        zzui<String> zzui3 = zzd.MediaBrowserCompat$ItemReceiver;
                        if (z) {
                            t3 = zzui3.write;
                        } else {
                            t3 = zzui3.read;
                        }
                        arrayList.add(new cleanInvalidTempFiles((String) t3, zzd.write, (String) zzd.MediaBrowserCompat$ItemReceiver.read));
                    }
                    getipassportdeserializerrtti.MediaBrowserCompat$CustomActionResultReceiver(new enableExceptionHandling(str, c_, str2, (List) arrayList));
                }
            };
            if (initializenetworksettings.RatingCompat != null) {
                r1.IconCompatParcelizer(initializenetworksettings.RatingCompat);
            }
            initializeNetworkSettings.MediaBrowserCompat$CustomActionResultReceiver(this.write);
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public initializeNetworkSettings(RegularImmutableBiMap regularImmutableBiMap, Serialization.FieldSetter fieldSetter, BottomSheetDialogFragment bottomSheetDialogFragment) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        onGetStartedClick.write((Object) fieldSetter, "displayMapper");
        onGetStartedClick.write((Object) bottomSheetDialogFragment, "applyLoanEntryCase");
        this.write = fieldSetter;
        this.read = bottomSheetDialogFragment;
    }

    public final void onDestroy() {
        this.MediaBrowserCompat$ItemReceiver.dispose();
        super.onDestroy();
    }

    public static final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(initializeNetworkSettings initializenetworksettings) {
        if (initializenetworksettings.RatingCompat != null) {
            initializenetworksettings.RatingCompat.aj_();
        }
    }
}
