package p040o;

import p040o.OnDeviceIdExtractor;
import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.IDataUnitProcessedListener */
public final class IDataUnitProcessedListener extends writeUInt64NoTag<OnDeviceIdExtractor.C69651.read> {
    public final indexOfImpl MediaBrowserCompat$ItemReceiver;
    final readAndCheckByte write;

    /* renamed from: o.IDataUnitProcessedListener$IconCompatParcelizer */
    public static final class IconCompatParcelizer extends CheckEligibilityActivity implements FundFactSheetActivity<onIndoorBuildingFocused, HmlVerifyPhoneValidateOtpActivity> {
        final /* synthetic */ IDataUnitProcessedListener read;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public IconCompatParcelizer(IDataUnitProcessedListener iDataUnitProcessedListener) {
            super(1);
            this.read = iDataUnitProcessedListener;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            final onIndoorBuildingFocused onindoorbuildingfocused = (onIndoorBuildingFocused) obj;
            onGetStartedClick.write((Object) onindoorbuildingfocused, "response");
            IDataUnitProcessedListener iDataUnitProcessedListener = this.read;
            writeUInt64NoTag.IconCompatParcelizer r1 = new writeUInt64NoTag.IconCompatParcelizer<OnDeviceIdExtractor.C69651.read>(this) {
                private /* synthetic */ IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver;

                {
                    this.MediaBrowserCompat$CustomActionResultReceiver = r1;
                }

                public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                    ((OnDeviceIdExtractor.C69651.read) obj).read(this.MediaBrowserCompat$CustomActionResultReceiver.read.write.IconCompatParcelizer(onindoorbuildingfocused));
                }
            };
            if (iDataUnitProcessedListener.RatingCompat != null) {
                r1.IconCompatParcelizer(iDataUnitProcessedListener.RatingCompat);
            }
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    /* renamed from: o.IDataUnitProcessedListener$read */
    public static final class read<V> implements writeUInt64NoTag.IconCompatParcelizer<OnDeviceIdExtractor.C69651.read> {
        public static final read MediaBrowserCompat$ItemReceiver = new read();

        read() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((OnDeviceIdExtractor.C69651.read) obj).read();
        }
    }

    /* renamed from: o.IDataUnitProcessedListener$write */
    public static final class write extends CheckEligibilityActivity implements FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> {
        private /* synthetic */ IDataUnitProcessedListener IconCompatParcelizer;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public write(IDataUnitProcessedListener iDataUnitProcessedListener) {
            super(1);
            this.IconCompatParcelizer = iDataUnitProcessedListener;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            onGetStartedClick.write((Object) th, "throwable");
            this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public IDataUnitProcessedListener(RegularImmutableBiMap regularImmutableBiMap, readAndCheckByte readandcheckbyte, indexOfImpl indexofimpl) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        onGetStartedClick.write((Object) readandcheckbyte, "productCatalogDisplayMapper");
        onGetStartedClick.write((Object) indexofimpl, "controller");
        this.write = readandcheckbyte;
        this.MediaBrowserCompat$ItemReceiver = indexofimpl;
    }

    public final void onDestroy() {
        this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer();
        super.onDestroy();
    }
}
