package p040o;

import p040o.Iterables;
import p040o.Lists;
import p040o.ServerProjectProvider;
import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.sp */
public final class C5417sp extends writeUInt64NoTag<ServerProjectProvider.C70684.read> {
    public String IconCompatParcelizer;
    public String MediaBrowserCompat$ItemReceiver;
    public final toLongArray MediaBrowserCompat$MediaItem;
    public final Iterables.C352212 read;
    public final Lists.TwoPlusArrayList write;

    /* renamed from: o.sp$read */
    public static final class read<V> implements writeUInt64NoTag.IconCompatParcelizer<ServerProjectProvider.C70684.read> {
        public static final read MediaBrowserCompat$ItemReceiver = new read();

        read() {
        }

        public final /* bridge */ /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((ServerProjectProvider.C70684.read) obj).IconCompatParcelizer();
        }
    }

    /* renamed from: o.sp$write */
    public static final class write extends CheckEligibilityActivity implements FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> {
        private /* synthetic */ C5417sp MediaBrowserCompat$CustomActionResultReceiver;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public write(C5417sp spVar) {
            super(1);
            this.MediaBrowserCompat$CustomActionResultReceiver = spVar;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            onGetStartedClick.write((Object) th, "throwable");
            this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    public static final /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver(C5417sp spVar) {
        String str = spVar.MediaBrowserCompat$ItemReceiver;
        if (str == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("productCode");
        }
        return str;
    }

    public static final /* synthetic */ String read(C5417sp spVar) {
        String str = spVar.IconCompatParcelizer;
        if (str == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("objectiveId");
        }
        return str;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public C5417sp(RegularImmutableBiMap regularImmutableBiMap, toLongArray tolongarray, Lists.TwoPlusArrayList twoPlusArrayList, Iterables.C352212 r5) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        onGetStartedClick.write((Object) tolongarray, "termsAndConsMapper");
        onGetStartedClick.write((Object) twoPlusArrayList, "controller");
        onGetStartedClick.write((Object) r5, "ekycEntryPointCase");
        this.MediaBrowserCompat$MediaItem = tolongarray;
        this.write = twoPlusArrayList;
        this.read = r5;
    }
}
