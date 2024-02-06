package p040o;

import com.scb.phone.domain.errors.RetrofitException;
import p040o.ILocationSourceDelegate;
import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.getEnvDeviceID */
public final class getEnvDeviceID extends writeUInt64NoTag<C7144hz> {
    public final addAllImpl IconCompatParcelizer;
    public Boolean MediaBrowserCompat$ItemReceiver;
    public String write;

    /* renamed from: o.getEnvDeviceID$IconCompatParcelizer */
    static final class IconCompatParcelizer<V> implements writeUInt64NoTag.IconCompatParcelizer<C7144hz> {
        private /* synthetic */ remainingBytes IconCompatParcelizer;

        IconCompatParcelizer(remainingBytes remainingbytes) {
            this.IconCompatParcelizer = remainingbytes;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((C7144hz) obj).MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer);
        }
    }

    /* renamed from: o.getEnvDeviceID$MediaDescriptionCompat */
    public static final /* synthetic */ class MediaDescriptionCompat extends InvestmentFundDetailsActivity implements FundFactSheetActivity<remainingBytes, HmlVerifyPhoneValidateOtpActivity> {
        public MediaDescriptionCompat(getEnvDeviceID getenvdeviceid) {
            super(1, getenvdeviceid);
        }

        public final String getName() {
            return "getMailingAddressSuccess";
        }

        public final CheckSCBSEligibilityActivity getOwner() {
            return FundOnboardingLandingActivity_ViewBinding.write(getEnvDeviceID.class);
        }

        public final String getSignature() {
            return "getMailingAddressSuccess(Lcom/scb/phone/presentation/model/display/mailingaddress/MailingAddressDetailsDisplay;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            remainingBytes remainingbytes = (remainingBytes) obj;
            onGetStartedClick.write((Object) remainingbytes, "p1");
            getEnvDeviceID.read((getEnvDeviceID) this.receiver, remainingbytes);
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    /* renamed from: o.getEnvDeviceID$MediaMetadataCompat */
    public static final /* synthetic */ class MediaMetadataCompat extends InvestmentFundDetailsActivity implements FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> {
        public MediaMetadataCompat(getEnvDeviceID getenvdeviceid) {
            super(1, getenvdeviceid);
        }

        public final String getName() {
            return "getMailingAddressError";
        }

        public final CheckSCBSEligibilityActivity getOwner() {
            return FundOnboardingLandingActivity_ViewBinding.write(getEnvDeviceID.class);
        }

        public final String getSignature() {
            return "getMailingAddressError(Ljava/lang/Throwable;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            onGetStartedClick.write((Object) th, "p1");
            getEnvDeviceID.write((getEnvDeviceID) this.receiver, th);
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    /* renamed from: o.getEnvDeviceID$read */
    static final class read<V> implements writeUInt64NoTag.IconCompatParcelizer<C7144hz> {
        public static final read read = new read();

        read() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((C7144hz) obj).aj_();
        }
    }

    /* renamed from: o.getEnvDeviceID$ParcelableVolumeInfo */
    public static final /* synthetic */ class ParcelableVolumeInfo extends InvestmentFundDetailsActivity implements FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> {
        public ParcelableVolumeInfo(getEnvDeviceID getenvdeviceid) {
            super(1, getenvdeviceid);
        }

        public final String getName() {
            return "postMailingAddressError";
        }

        public final CheckSCBSEligibilityActivity getOwner() {
            return FundOnboardingLandingActivity_ViewBinding.write(getEnvDeviceID.class);
        }

        public final String getSignature() {
            return "postMailingAddressError(Ljava/lang/Throwable;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            onGetStartedClick.write((Object) th, "p1");
            ((getEnvDeviceID) this.receiver).MediaBrowserCompat$ItemReceiver(((getEnvDeviceID) this.receiver).MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    /* renamed from: o.getEnvDeviceID$RatingCompat */
    public static final class RatingCompat<V> implements writeUInt64NoTag.IconCompatParcelizer<C7144hz> {
        public static final RatingCompat write = new RatingCompat();

        RatingCompat() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((C7144hz) obj).read();
        }
    }

    /* renamed from: o.getEnvDeviceID$write */
    public static final class write<V> implements writeUInt64NoTag.IconCompatParcelizer<C7144hz> {
        public static final write read = new write();

        write() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((C7144hz) obj).read();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public getEnvDeviceID(RegularImmutableBiMap regularImmutableBiMap, addAllImpl addallimpl) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        onGetStartedClick.write((Object) addallimpl, "controller");
        this.IconCompatParcelizer = addallimpl;
    }

    public final void onDestroy() {
        super.onDestroy();
        this.IconCompatParcelizer.IconCompatParcelizer();
    }

    public static final /* synthetic */ void write(getEnvDeviceID getenvdeviceid, Throwable th) {
        String str;
        ILocationSourceDelegate.zza zza;
        if (th instanceof RetrofitException) {
            ILocationSourceDelegate iLocationSourceDelegate = ((RetrofitException) th).IconCompatParcelizer;
            if (iLocationSourceDelegate == null || (zza = iLocationSourceDelegate.write) == null) {
                str = null;
            } else {
                str = zza.IconCompatParcelizer;
            }
            if (GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver("1002", str, true)) {
                getenvdeviceid.MediaBrowserCompat$ItemReceiver(getenvdeviceid.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
                return;
            }
        }
        getenvdeviceid.MediaBrowserCompat$ItemReceiver(getenvdeviceid.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.NAVIGATE_BACK));
    }

    public static final /* synthetic */ void read(getEnvDeviceID getenvdeviceid, remainingBytes remainingbytes) {
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = read.read;
        boolean z = true;
        if (getenvdeviceid.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(getenvdeviceid.RatingCompat);
        }
        if (GoodToKnowActivity.read(remainingbytes.IconCompatParcelizer)) {
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer2 = getEnvDeviceID$MediaBrowserCompat$ItemReceiver.read;
            if (getenvdeviceid.RatingCompat == null) {
                z = false;
            }
            if (z) {
                iconCompatParcelizer2.IconCompatParcelizer(getenvdeviceid.RatingCompat);
                return;
            }
            return;
        }
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer3 = new IconCompatParcelizer(remainingbytes);
        if (getenvdeviceid.RatingCompat == null) {
            z = false;
        }
        if (z) {
            iconCompatParcelizer3.IconCompatParcelizer(getenvdeviceid.RatingCompat);
        }
    }

    public static final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(getEnvDeviceID getenvdeviceid) {
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C9964x5465026e.MediaBrowserCompat$CustomActionResultReceiver;
        boolean z = true;
        if (getenvdeviceid.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(getenvdeviceid.RatingCompat);
        }
        if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) getenvdeviceid.MediaBrowserCompat$ItemReceiver, (Object) Boolean.TRUE)) {
            String str = getenvdeviceid.write;
            if (str != null) {
                writeUInt64NoTag.IconCompatParcelizer getenvdeviceid_mediasessioncompat_queueitem = new getEnvDeviceID$MediaSessionCompat$QueueItem(str);
                if (getenvdeviceid.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    getenvdeviceid_mediasessioncompat_queueitem.IconCompatParcelizer(getenvdeviceid.RatingCompat);
                    return;
                }
                return;
            }
            return;
        }
        String str2 = getenvdeviceid.write;
        if (str2 != null) {
            writeUInt64NoTag.IconCompatParcelizer getenvdeviceid_mediasessioncompat_resultreceiverwrapper = new getEnvDeviceID$MediaSessionCompat$ResultReceiverWrapper(str2);
            if (getenvdeviceid.RatingCompat == null) {
                z = false;
            }
            if (z) {
                getenvdeviceid_mediasessioncompat_resultreceiverwrapper.IconCompatParcelizer(getenvdeviceid.RatingCompat);
            }
        }
    }
}
