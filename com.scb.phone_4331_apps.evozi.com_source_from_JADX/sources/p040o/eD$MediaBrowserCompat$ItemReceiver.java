package p040o;

import com.scb.phone.domain.interactor.partner.nsip.NsipPartnerPaymentConfirmCase;
import p040o.readVersion;
import p040o.writeUInt64NoTag;

/* renamed from: o.eD$MediaBrowserCompat$ItemReceiver */
public final class eD$MediaBrowserCompat$ItemReceiver extends CheckEligibilityActivity implements FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> {
    final /* synthetic */ setStartedAt IconCompatParcelizer;
    final /* synthetic */ C4334eD MediaBrowserCompat$ItemReceiver;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public eD$MediaBrowserCompat$ItemReceiver(C4334eD eDVar, setStartedAt setstartedat) {
        super(1);
        this.MediaBrowserCompat$ItemReceiver = eDVar;
        this.IconCompatParcelizer = setstartedat;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        onGetStartedClick.write((Object) th, "throwable");
        if (th instanceof NsipPartnerPaymentConfirmCase.NsipConfirmException) {
            this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, (Runnable) new Runnable(this) {
                private /* synthetic */ eD$MediaBrowserCompat$ItemReceiver read;

                {
                    this.read = r1;
                }

                public final void run() {
                    C4334eD eDVar = this.read.MediaBrowserCompat$ItemReceiver;
                    writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C99082.MediaBrowserCompat$ItemReceiver;
                    if (eDVar.RatingCompat != null) {
                        iconCompatParcelizer.IconCompatParcelizer(eDVar.RatingCompat);
                    }
                }
            }));
        } else if (writeUInt64NoTag.IconCompatParcelizer(th)) {
            C4334eD.read(this.MediaBrowserCompat$ItemReceiver);
            C4334eD eDVar = this.MediaBrowserCompat$ItemReceiver;
            writeUInt64NoTag.IconCompatParcelizer r0 = new writeUInt64NoTag.IconCompatParcelizer<readVersion.read>(this) {
                private /* synthetic */ eD$MediaBrowserCompat$ItemReceiver write;

                {
                    this.write = r1;
                }

                public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                    ((readVersion.read) obj).MediaBrowserCompat$ItemReceiver(this.write.IconCompatParcelizer);
                }
            };
            if (eDVar.RatingCompat != null) {
                r0.IconCompatParcelizer(eDVar.RatingCompat);
            }
        } else {
            this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, (Runnable) new Runnable(this) {
                private /* synthetic */ eD$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$ItemReceiver;

                {
                    this.MediaBrowserCompat$ItemReceiver = r1;
                }

                public final void run() {
                    C4334eD eDVar = this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver;
                    writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C99104.MediaBrowserCompat$ItemReceiver;
                    if (eDVar.RatingCompat != null) {
                        iconCompatParcelizer.IconCompatParcelizer(eDVar.RatingCompat);
                    }
                }
            }));
        }
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
