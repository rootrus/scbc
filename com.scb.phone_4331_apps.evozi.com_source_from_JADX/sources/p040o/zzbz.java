package p040o;

import org.threeten.p041bp.OffsetDateTime;

/* renamed from: o.zzbz */
public final /* synthetic */ class zzbz implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ UserRecoverableNotifiedException write;

    public /* synthetic */ zzbz(UserRecoverableNotifiedException userRecoverableNotifiedException) {
        this.write = userRecoverableNotifiedException;
    }

    public final Object write(Object obj) {
        String str;
        String str2;
        PINBlockException pINBlockException;
        String str3;
        PINBlockException pINBlockException2;
        PINBlockException pINBlockException3;
        setScale setscale = (setScale) obj;
        onGetStartedClick.write((Object) setscale, "entity");
        OffsetDateTime write2 = FragmentBuilder_BindSummaryFragment.write(setscale.write, (OffsetDateTime) null);
        String str4 = setscale.read;
        setPerformanceTrackingEnabled setperformancetrackingenabled = setscale.MediaBrowserCompat$ItemReceiver;
        String str5 = "";
        if (setperformancetrackingenabled == null || (pINBlockException3 = setperformancetrackingenabled.IconCompatParcelizer) == null || (str = pINBlockException3.MediaBrowserCompat$CustomActionResultReceiver) == null) {
            str = str5;
        }
        if (setperformancetrackingenabled == null || (pINBlockException2 = setperformancetrackingenabled.IconCompatParcelizer) == null || (str2 = pINBlockException2.MediaBrowserCompat$ItemReceiver) == null) {
            str2 = str5;
        }
        if (!(setperformancetrackingenabled == null || (pINBlockException = setperformancetrackingenabled.IconCompatParcelizer) == null || (str3 = pINBlockException.write) == null)) {
            str5 = str3;
        }
        return new setPoints(write2, str4, new zzvl(str, str2, str5), setscale.MediaBrowserCompat$CustomActionResultReceiver);
    }
}
