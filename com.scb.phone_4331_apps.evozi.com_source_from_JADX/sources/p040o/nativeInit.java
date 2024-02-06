package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.nativeInit */
public final /* synthetic */ class nativeInit implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ nativeGetShadowContours IconCompatParcelizer;
    private final /* synthetic */ String MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ int write;

    public /* synthetic */ nativeInit(nativeGetShadowContours nativegetshadowcontours, int i, String str) {
        this.IconCompatParcelizer = nativegetshadowcontours;
        this.write = i;
        this.MediaBrowserCompat$ItemReceiver = str;
    }

    public final void IconCompatParcelizer(Object obj) {
        nativeGetShadowContours nativegetshadowcontours = this.IconCompatParcelizer;
        int i = this.write;
        String str = this.MediaBrowserCompat$ItemReceiver;
        getAdditionalRightScanLinesWidth getadditionalrightscanlineswidth = (getAdditionalRightScanLinesWidth) obj;
        if (i == 1) {
            getadditionalrightscanlineswidth.IconCompatParcelizer(nativegetshadowcontours.IconCompatParcelizer.mo26549c_("th".equalsIgnoreCase(str) ? "/ntb/navigationbar/accountsummary_th.png" : "/ntb/navigationbar/accountsummary_en.png"));
        } else if (i == 2) {
            getadditionalrightscanlineswidth.IconCompatParcelizer(nativegetshadowcontours.IconCompatParcelizer.mo26549c_("th".equalsIgnoreCase(str) ? "/ntb/navigationbar/moneymovement_th.png" : "/ntb/navigationbar/moneymovement_en.png"));
        } else if (i == 3) {
            getadditionalrightscanlineswidth.IconCompatParcelizer(nativegetshadowcontours.IconCompatParcelizer.mo26549c_("th".equalsIgnoreCase(str) ? "/ntb/navigationbar/notification_th.png" : "/ntb/navigationbar/notification_en.png"));
        } else if (i != 4) {
            getadditionalrightscanlineswidth.read();
        } else {
            getadditionalrightscanlineswidth.IconCompatParcelizer(nativegetshadowcontours.IconCompatParcelizer.mo26549c_("th".equalsIgnoreCase(str) ? "/ntb/navigationbar/moreoptions_th.png" : "/ntb/navigationbar/moreoptions_en.png"));
        }
    }
}
