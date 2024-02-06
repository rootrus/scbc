package p040o;

import java.util.List;
import p040o.LinkedListMultimap;
import p040o.getIconType;

/* renamed from: o.getIconType$MediaBrowserCompat$SearchResultReceiver */
final class getIconType$MediaBrowserCompat$SearchResultReceiver extends CheckEligibilityActivity implements FundFactSheetActivity<List<? extends zzwh>, HmlVerifyPhoneValidateOtpActivity> {
    private /* synthetic */ getIconType MediaBrowserCompat$ItemReceiver;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    getIconType$MediaBrowserCompat$SearchResultReceiver(getIconType geticontype) {
        super(1);
        this.MediaBrowserCompat$ItemReceiver = geticontype;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        List list = (List) obj;
        onGetStartedClick.write((Object) list, "it");
        getIconType geticontype = this.MediaBrowserCompat$ItemReceiver;
        onGetStartedClick.write((Object) list, "countries");
        LinkedListMultimap.C35733.C35741 r2 = geticontype.read;
        FundFactSheetActivity read = new getIconType.read(geticontype, list);
        FundFactSheetActivity iconCompatParcelizer = new getIconType.IconCompatParcelizer(geticontype);
        FundFactSheetActivity write = new getIconType.write(geticontype);
        onGetStartedClick.write((Object) read, "onSuccess");
        onGetStartedClick.write((Object) iconCompatParcelizer, "onError");
        onGetStartedClick.write((Object) write, "transform");
        r2.MediaBrowserCompat$ItemReceiver(r2.IconCompatParcelizer, read, iconCompatParcelizer, new getLastInNonemptyList$MediaBrowserCompat$ItemReceiver(), write);
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
