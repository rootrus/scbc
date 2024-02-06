package p040o;

import p040o.StandardTable;
import p040o.getBackgroundColor;
import p040o.writeUInt64NoTag;

/* renamed from: o.LicenseFoundEvent */
public final /* synthetic */ class LicenseFoundEvent implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getBackgroundColor.C45061 MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ setCountry read;

    public /* synthetic */ LicenseFoundEvent(getBackgroundColor.C45061 r1, setCountry setcountry) {
        this.MediaBrowserCompat$ItemReceiver = r1;
        this.read = setcountry;
    }

    public final void IconCompatParcelizer(Object obj) {
        getBackgroundColor.C45061 r0 = this.MediaBrowserCompat$ItemReceiver;
        setCountry setcountry = this.read;
        StandardTable.Column.Values unused = getBackgroundColor.this.read;
        onGetStartedClick.write((Object) setcountry, "creditLimit");
        ((PassportWorkflowActivity) obj).read(new readUserData(setcountry.RatingCompat, Double.parseDouble(setcountry.IconCompatParcelizer), Double.parseDouble(setcountry.MediaBrowserCompat$CustomActionResultReceiver)));
    }
}
