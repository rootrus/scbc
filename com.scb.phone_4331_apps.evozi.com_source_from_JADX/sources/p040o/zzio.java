package p040o;

import p040o.zzjx;

/* renamed from: o.zzio */
public final /* synthetic */ class zzio implements DirectDebitDeepLinkActivity {
    public static final /* synthetic */ zzio IconCompatParcelizer = new zzio();

    private /* synthetic */ zzio() {
    }

    public final Object write(Object obj) {
        getStart getstart = (getStart) obj;
        String str = getstart.MediaBrowserCompat$CustomActionResultReceiver;
        onGetStartedClick.write((Object) str, "$this$toBooleanFlag");
        boolean z = false;
        boolean z2 = Integer.parseInt(str) == 1;
        String str2 = getstart.read;
        onGetStartedClick.write((Object) str2, "$this$toBooleanFlag");
        boolean z3 = Integer.parseInt(str2) == 1;
        String str3 = getstart.MediaBrowserCompat$ItemReceiver;
        onGetStartedClick.write((Object) str3, "$this$toBooleanFlag");
        if (Integer.parseInt(str3) == 1) {
            z = true;
        }
        return new zzjx.zza.C10770zza(z2, z3, z);
    }
}
