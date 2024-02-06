package p040o;

import java.util.concurrent.TimeUnit;
import p040o.LinkedListMultimap;
import p040o.writeUInt64NoTag;

/* renamed from: o.setSteadyMessage */
public final class setSteadyMessage extends DocumentBaseOverlayView_Factory<C7136hq> {
    public String IconCompatParcelizer;
    private final LinkedListMultimap.MultisetView read;
    public String write;

    /* renamed from: o.setSteadyMessage$read */
    static final class read extends CheckEligibilityActivity implements FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> {
        private /* synthetic */ setSteadyMessage write;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        read(setSteadyMessage setsteadymessage) {
            super(1);
            this.write = setsteadymessage;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            onGetStartedClick.write((Object) th, "throwable");
            this.write.MediaDescriptionCompat(th);
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    /* renamed from: o.setSteadyMessage$write */
    static final class write extends CheckEligibilityActivity implements FundFactSheetActivity<String, HmlVerifyPhoneValidateOtpActivity> {
        final /* synthetic */ setSteadyMessage read;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        write(setSteadyMessage setsteadymessage) {
            super(1);
            this.read = setsteadymessage;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            final String str = (String) obj;
            onGetStartedClick.write((Object) str, "preregistrationTokenId");
            setSteadyMessage.MediaBrowserCompat$ItemReceiver(this.read);
            setSteadyMessage setsteadymessage = this.read;
            writeUInt64NoTag.IconCompatParcelizer r1 = new writeUInt64NoTag.IconCompatParcelizer<C7136hq>(this) {
                private /* synthetic */ write MediaBrowserCompat$ItemReceiver;

                {
                    this.MediaBrowserCompat$ItemReceiver = r1;
                }

                public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                    C7136hq hqVar = (C7136hq) obj;
                    hqVar.read();
                    String str = this.MediaBrowserCompat$ItemReceiver.read.write;
                    if (str == null) {
                        onGetStartedClick.MediaBrowserCompat$ItemReceiver("deviceState");
                    }
                    hqVar.MediaBrowserCompat$ItemReceiver(str, str);
                }
            };
            if (setsteadymessage.RatingCompat != null) {
                r1.IconCompatParcelizer(setsteadymessage.RatingCompat);
            }
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public setSteadyMessage(RegularImmutableBiMap regularImmutableBiMap, LinkedListMultimap.MultisetView multisetView) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        onGetStartedClick.write((Object) multisetView, "controller");
        this.read = multisetView;
    }

    public final void write(String str) {
        onGetStartedClick.write((Object) str, "pin");
        LinkedListMultimap.MultisetView multisetView = this.read;
        FundFactSheetActivity write2 = new write(this);
        FundFactSheetActivity read2 = new read(this);
        String str2 = this.write;
        if (str2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("deviceState");
        }
        String str3 = this.IconCompatParcelizer;
        if (str3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("preregistrationTokenId");
        }
        onGetStartedClick.write((Object) write2, "responsePreregistrationTokenId");
        onGetStartedClick.write((Object) read2, "onError");
        onGetStartedClick.write((Object) str, "pin");
        onGetStartedClick.write((Object) str2, "juristicState");
        onGetStartedClick.write((Object) str3, "preregistrationTokenId");
        isUpperCase isuppercase = multisetView.IconCompatParcelizer;
        DebitCardResetOtpActivity<PlaceBuffer> delay = isuppercase.IconCompatParcelizer.MediaBrowserCompat$MediaItem().delay(100, TimeUnit.MILLISECONDS);
        onGetStartedClick.IconCompatParcelizer((Object) delay, "iSprintRepositoryContrac…E, TimeUnit.MILLISECONDS)");
        isuppercase.write(delay, new LinkedListMultimap.MultisetView.IconCompatParcelizer(multisetView, read2, write2, str, str2, str3));
    }

    public final void IconCompatParcelizer(access$2200 access_2200) {
        onGetStartedClick.write((Object) access_2200, "errorDisplay");
        MediaBrowserCompat$ItemReceiver(access_2200);
    }

    public static final /* synthetic */ void MediaBrowserCompat$ItemReceiver(setSteadyMessage setsteadymessage) {
        if (setsteadymessage.RatingCompat != null) {
            setsteadymessage.RatingCompat.aj_();
        }
    }
}
