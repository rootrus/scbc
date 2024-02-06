package p040o;

import java.util.concurrent.TimeUnit;
import p040o.LinkedListMultimap;

/* renamed from: o.showUserInstructionMessage */
public final class showUserInstructionMessage extends DocumentBaseOverlayView_Factory<C7140hu> {
    private final LinkedListMultimap.DistinctKeyIterator MediaBrowserCompat$ItemReceiver;
    public String write;

    /* renamed from: o.showUserInstructionMessage$read */
    static final class read extends CheckEligibilityActivity implements FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> {
        private /* synthetic */ showUserInstructionMessage MediaBrowserCompat$ItemReceiver;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        read(showUserInstructionMessage showuserinstructionmessage) {
            super(1);
            this.MediaBrowserCompat$ItemReceiver = showuserinstructionmessage;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            onGetStartedClick.write((Object) th, "throwable");
            this.MediaBrowserCompat$ItemReceiver.MediaDescriptionCompat(th);
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public showUserInstructionMessage(RegularImmutableBiMap regularImmutableBiMap, LinkedListMultimap.DistinctKeyIterator distinctKeyIterator) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        onGetStartedClick.write((Object) distinctKeyIterator, "controller");
        this.MediaBrowserCompat$ItemReceiver = distinctKeyIterator;
    }

    public final void write(String str) {
        onGetStartedClick.write((Object) str, "pin");
        LinkedListMultimap.DistinctKeyIterator distinctKeyIterator = this.MediaBrowserCompat$ItemReceiver;
        FundFactSheetActivity showuserinstructionmessage_mediabrowsercompat_itemreceiver = new showUserInstructionMessage$MediaBrowserCompat$ItemReceiver(this);
        FundFactSheetActivity read2 = new read(this);
        String str2 = this.write;
        if (str2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("resetToken");
        }
        onGetStartedClick.write((Object) showuserinstructionmessage_mediabrowsercompat_itemreceiver, "onSuccess");
        onGetStartedClick.write((Object) read2, "onError");
        onGetStartedClick.write((Object) str, "pin");
        onGetStartedClick.write((Object) str2, "resetPinTokenId");
        isUpperCase isuppercase = distinctKeyIterator.read;
        DebitCardResetOtpActivity<PlaceBuffer> delay = isuppercase.IconCompatParcelizer.MediaBrowserCompat$MediaItem().delay(100, TimeUnit.MILLISECONDS);
        onGetStartedClick.IconCompatParcelizer((Object) delay, "iSprintRepositoryContrac…E, TimeUnit.MILLISECONDS)");
        isuppercase.write(delay, new C9775x4cc848f4(distinctKeyIterator, str, str2, showuserinstructionmessage_mediabrowsercompat_itemreceiver, read2));
    }

    public final void IconCompatParcelizer(access$2200 access_2200) {
        onGetStartedClick.write((Object) access_2200, "errorDisplay");
        MediaBrowserCompat$ItemReceiver(access_2200);
    }

    public static final /* synthetic */ void read(showUserInstructionMessage showuserinstructionmessage) {
        if (showuserinstructionmessage.RatingCompat != null) {
            showuserinstructionmessage.RatingCompat.aj_();
        }
    }
}
