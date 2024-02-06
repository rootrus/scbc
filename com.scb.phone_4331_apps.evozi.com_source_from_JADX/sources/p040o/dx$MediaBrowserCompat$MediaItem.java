package p040o;

import p040o.CrashlyticsCore;
import p040o.writeUInt64NoTag;

/* renamed from: o.dx$MediaBrowserCompat$MediaItem */
public final class dx$MediaBrowserCompat$MediaItem extends CheckEligibilityActivity implements FundFactSheetActivity<LocationServices, HmlVerifyPhoneValidateOtpActivity> {
    private /* synthetic */ C4305dx write;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dx$MediaBrowserCompat$MediaItem(C4305dx dxVar) {
        super(1);
        this.write = dxVar;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        LocationServices locationServices = (LocationServices) obj;
        onGetStartedClick.write((Object) locationServices, "investmentNow");
        this.write.IconCompatParcelizer = locationServices;
        C4305dx dxVar = this.write;
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C98982.MediaBrowserCompat$CustomActionResultReceiver;
        boolean z = true;
        if (dxVar.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(dxVar.RatingCompat);
        }
        if (locationServices.MediaBrowserCompat$ItemReceiver) {
            C4305dx dxVar2 = this.write;
            CrashlyticsCore.C32441 IconCompatParcelizer = dxVar2.MediaSessionCompat$QueueItem.MediaBrowserCompat$ItemReceiver(locationServices.read);
            onGetStartedClick.IconCompatParcelizer((Object) IconCompatParcelizer, "investmentProfileMapper.…nvestmentNow.riskProfile)");
            dxVar2.read = IconCompatParcelizer;
            C4305dx dxVar3 = this.write;
            dxVar3.MediaBrowserCompat$CustomActionResultReceiver(locationServices, C4305dx.write(dxVar3));
        } else {
            C4305dx dxVar4 = this.write;
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer2 = C98994.MediaBrowserCompat$ItemReceiver;
            if (dxVar4.RatingCompat == null) {
                z = false;
            }
            if (z) {
                iconCompatParcelizer2.IconCompatParcelizer(dxVar4.RatingCompat);
            }
        }
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
