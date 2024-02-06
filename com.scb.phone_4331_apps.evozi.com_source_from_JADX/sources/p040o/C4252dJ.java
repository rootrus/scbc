package p040o;

import android.content.res.Resources;
import com.scb.phone.view.activity.registration.C5708x2064d349;
import p040o.AutoValue_CrashlyticsReport_FilesPayload_File;
import p040o.writeUInt64NoTag;

/* renamed from: o.dJ */
public final class C4252dJ extends writeUInt64NoTag<IdRegion$MediaBrowserCompat$ItemReceiver> {
    public IconCompatParcelizer IconCompatParcelizer;
    public C7041xd5e892c2 MediaBrowserCompat$ItemReceiver;
    private final Resources MediaBrowserCompat$SearchResultReceiver;
    public final checkMap read;
    public boolean write;

    /* renamed from: o.dJ$IconCompatParcelizer */
    public enum IconCompatParcelizer {
        WIFI_ENABLE,
        MOBILE_NUMBER_NOT_FOUND,
        MOBILE_NUMBER_FOUND
    }

    /* renamed from: o.dJ$MediaDescriptionCompat */
    static final class MediaDescriptionCompat<V> implements writeUInt64NoTag.IconCompatParcelizer<IdRegion$MediaBrowserCompat$ItemReceiver> {
        private /* synthetic */ AutoValue_CrashlyticsReport_FilesPayload_File.Builder IconCompatParcelizer;

        MediaDescriptionCompat(AutoValue_CrashlyticsReport_FilesPayload_File.Builder builder) {
            this.IconCompatParcelizer = builder;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            IdRegion$MediaBrowserCompat$ItemReceiver idRegion$MediaBrowserCompat$ItemReceiver = (IdRegion$MediaBrowserCompat$ItemReceiver) obj;
            idRegion$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver(this.IconCompatParcelizer);
            idRegion$MediaBrowserCompat$ItemReceiver.aj_();
            idRegion$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver();
        }
    }

    /* renamed from: o.dJ$MediaMetadataCompat */
    public static final class MediaMetadataCompat extends CheckEligibilityActivity implements FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> {
        final /* synthetic */ C4252dJ MediaBrowserCompat$ItemReceiver;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public MediaMetadataCompat(C4252dJ dJVar) {
            super(1);
            this.MediaBrowserCompat$ItemReceiver = dJVar;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            onGetStartedClick.write((Object) th, "throwable");
            this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, (Runnable) new Runnable(this) {
                private /* synthetic */ MediaMetadataCompat MediaBrowserCompat$ItemReceiver;

                {
                    this.MediaBrowserCompat$ItemReceiver = r1;
                }

                public final void run() {
                    C4252dJ dJVar = this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver;
                    writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C42544.MediaBrowserCompat$ItemReceiver;
                    if (dJVar.RatingCompat != null) {
                        iconCompatParcelizer.IconCompatParcelizer(dJVar.RatingCompat);
                    }
                }
            }));
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    /* renamed from: o.dJ$RatingCompat */
    static final class RatingCompat<V> implements writeUInt64NoTag.IconCompatParcelizer<IdRegion$MediaBrowserCompat$ItemReceiver> {
        private /* synthetic */ AutoValue_CrashlyticsReport_FilesPayload_File.Builder read;

        RatingCompat(AutoValue_CrashlyticsReport_FilesPayload_File.Builder builder) {
            this.read = builder;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            IdRegion$MediaBrowserCompat$ItemReceiver idRegion$MediaBrowserCompat$ItemReceiver = (IdRegion$MediaBrowserCompat$ItemReceiver) obj;
            idRegion$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver(this.read);
            idRegion$MediaBrowserCompat$ItemReceiver.aj_();
        }
    }

    /* renamed from: o.dJ$read */
    static final class read extends CheckEligibilityActivity implements FundFactSheetActivity<C5708x2064d349, HmlVerifyPhoneValidateOtpActivity> {
        private /* synthetic */ C4252dJ write;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        read(C4252dJ dJVar) {
            super(1);
            this.write = dJVar;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C5708x2064d349 registrationDeadCardActivity$MediaBrowserCompat$CustomActionResultReceiver = (C5708x2064d349) obj;
            onGetStartedClick.write((Object) registrationDeadCardActivity$MediaBrowserCompat$CustomActionResultReceiver, "phoneNo");
            if (registrationDeadCardActivity$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver != null) {
                String str = registrationDeadCardActivity$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver;
                onGetStartedClick.IconCompatParcelizer((Object) str, "phoneNo.phoneNumber");
                if (str.length() > 0) {
                    C4252dJ dJVar = this.write;
                    String str2 = registrationDeadCardActivity$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver;
                    onGetStartedClick.IconCompatParcelizer((Object) str2, "phoneNo.phoneNumber");
                    C4252dJ.MediaBrowserCompat$ItemReceiver(dJVar, str2);
                    return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
                }
            }
            C4252dJ.MediaBrowserCompat$ItemReceiver(this.write);
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    /* renamed from: o.dJ$write */
    static final class write extends CheckEligibilityActivity implements FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> {
        private /* synthetic */ C4252dJ MediaBrowserCompat$ItemReceiver;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        write(C4252dJ dJVar) {
            super(1);
            this.MediaBrowserCompat$ItemReceiver = dJVar;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            onGetStartedClick.write((Object) (Throwable) obj, "it");
            C4252dJ.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver);
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public C4252dJ(checkMap checkmap, Resources resources, RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) checkmap, "controller");
        onGetStartedClick.write((Object) resources, "resources");
        this.read = checkmap;
        this.MediaBrowserCompat$SearchResultReceiver = resources;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(String str, boolean z) {
        onGetStartedClick.write((Object) str, "stage");
        boolean z2 = true;
        this.write = true;
        this.MediaBrowserCompat$ItemReceiver = C7041xd5e892c2.valueOf(str);
        if (z) {
            if (this.IconCompatParcelizer == IconCompatParcelizer.WIFI_ENABLE) {
                this.write = false;
                return;
            }
            if (this.RatingCompat != null) {
                this.RatingCompat.AlertController$RecycleListView();
            }
            int i = Iterables$3$MediaBrowserCompat$MediaItem.wifi_title;
            int i2 = Iterables$3$MediaBrowserCompat$ItemReceiver.ic_use_3_g_4_g;
            String string = this.MediaBrowserCompat$SearchResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.auto_touchpoints_please_use_mobile_data);
            onGetStartedClick.IconCompatParcelizer((Object) string, "resources.getString(R.st…s_please_use_mobile_data)");
            String string2 = this.MediaBrowserCompat$SearchResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.auto_touchpoints_please_turn_off_wifi);
            onGetStartedClick.IconCompatParcelizer((Object) string2, "resources.getString(R.st…nts_please_turn_off_wifi)");
            writeUInt64NoTag.IconCompatParcelizer dj_mediasessioncompat_queueitem = new dJ$MediaSessionCompat$QueueItem(new AutoValue_CrashlyticsReport_FilesPayload_File.Builder(i, i2, string, string2, (String) null, new C4257xa798420c(this), this.MediaBrowserCompat$SearchResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.wifi_button)));
            if (this.RatingCompat != null) {
                dj_mediasessioncompat_queueitem.IconCompatParcelizer(this.RatingCompat);
            }
            this.write = false;
            this.IconCompatParcelizer = IconCompatParcelizer.WIFI_ENABLE;
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = dJ$MediaSessionCompat$ResultReceiverWrapper.write;
            if (this.RatingCompat == null) {
                z2 = false;
            }
            if (z2) {
                iconCompatParcelizer.IconCompatParcelizer(this.RatingCompat);
            }
        } else if (this.IconCompatParcelizer == IconCompatParcelizer.MOBILE_NUMBER_FOUND) {
            this.write = false;
        } else {
            if (this.RatingCompat == null) {
                z2 = false;
            }
            if (z2) {
                this.RatingCompat.AlertController$RecycleListView();
            }
            checkMap checkmap = this.read;
            FundFactSheetActivity read2 = new read(this);
            FundFactSheetActivity write2 = new write(this);
            onGetStartedClick.write((Object) read2, "onNext");
            onGetStartedClick.write((Object) write2, "onError");
            TileOverlay tileOverlay = checkmap.read;
            tileOverlay.read(tileOverlay.read.write(), new checkValues(read2), new checkValues(write2));
        }
    }

    public static final /* synthetic */ void MediaBrowserCompat$ItemReceiver(C4252dJ dJVar, String str) {
        boolean z = true;
        String IconCompatParcelizer2 = getICheckDeserializerRtti.IconCompatParcelizer(true, true, str);
        int i = Iterables$3$MediaBrowserCompat$MediaItem.auto_touchpoints_check_your_mobile_number;
        int i2 = Iterables$3$MediaBrowserCompat$ItemReceiver.ic_mobile_pass;
        String string = dJVar.MediaBrowserCompat$SearchResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.auto_touchpoints_registration_by_number, new Object[]{IconCompatParcelizer2});
        onGetStartedClick.IconCompatParcelizer((Object) string, "resources.getString(R.st…_number, formattedNumber)");
        String string2 = dJVar.MediaBrowserCompat$SearchResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.auto_touchpoints_registration_by_number_description);
        onGetStartedClick.IconCompatParcelizer((Object) string2, "resources.getString(R.st…on_by_number_description)");
        writeUInt64NoTag.IconCompatParcelizer mediaDescriptionCompat = new MediaDescriptionCompat(new AutoValue_CrashlyticsReport_FilesPayload_File.Builder(i, i2, string, string2, dJVar.MediaBrowserCompat$SearchResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.auto_touchpoints_registration_by_number_remark), new dJ$MediaBrowserCompat$SearchResultReceiver(dJVar, str), dJVar.MediaBrowserCompat$SearchResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.next_button)));
        if (dJVar.RatingCompat == null) {
            z = false;
        }
        if (z) {
            mediaDescriptionCompat.IconCompatParcelizer(dJVar.RatingCompat);
        }
        dJVar.write = false;
        dJVar.IconCompatParcelizer = IconCompatParcelizer.MOBILE_NUMBER_FOUND;
    }

    public static final /* synthetic */ void MediaBrowserCompat$ItemReceiver(C4252dJ dJVar) {
        int i = Iterables$3$MediaBrowserCompat$MediaItem.auto_touchpoints_mobile_number_not_found;
        int i2 = Iterables$3$MediaBrowserCompat$ItemReceiver.ic_mobile_warning;
        String string = dJVar.MediaBrowserCompat$SearchResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.auto_touchpoints_troubleshooting_tips);
        onGetStartedClick.IconCompatParcelizer((Object) string, "resources.getString(R.st…nts_troubleshooting_tips)");
        String string2 = dJVar.MediaBrowserCompat$SearchResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.auto_touchpoints_troubleshooting_step);
        onGetStartedClick.IconCompatParcelizer((Object) string2, "resources.getString(R.st…nts_troubleshooting_step)");
        writeUInt64NoTag.IconCompatParcelizer ratingCompat = new RatingCompat(new AutoValue_CrashlyticsReport_FilesPayload_File.Builder(i, i2, string, string2, (String) null, (FundActionsSuccessActivity<HmlVerifyPhoneValidateOtpActivity>) null, (String) null));
        if (dJVar.RatingCompat != null) {
            ratingCompat.IconCompatParcelizer(dJVar.RatingCompat);
        }
        dJVar.write = false;
        dJVar.IconCompatParcelizer = IconCompatParcelizer.MOBILE_NUMBER_NOT_FOUND;
    }
}
