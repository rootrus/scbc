package p040o;

import p040o.MutableClassToInstanceMap;
import p040o.getSymbolsFound;
import p040o.zzev;

/* renamed from: o.getOrientationGuidance */
public final /* synthetic */ class getOrientationGuidance implements findFragmentByWho {
    private final /* synthetic */ getSymbolsFound.read write;

    public /* synthetic */ getOrientationGuidance(getSymbolsFound.read read) {
        this.write = read;
    }

    public final Object IconCompatParcelizer(Object obj) {
        getSymbolsFound.read read = this.write;
        zzev.zzb zzb = (zzev.zzb) obj;
        MutableClassToInstanceMap.C36901 unused = getSymbolsFound.this.MediaBrowserCompat$SearchResultReceiver;
        String checkable = getSymbolsFound.this.read.IconCompatParcelizer.setCheckable();
        if (zzb == null) {
            return "";
        }
        boolean z = false;
        if (checkable.equals("th")) {
            String str = zzb.read;
            if (str == null || str.length() == 0) {
                z = true;
            }
            if (!z) {
                return zzb.read;
            }
            return "";
        }
        String str2 = zzb.MediaBrowserCompat$CustomActionResultReceiver;
        if (str2 == null || str2.length() == 0) {
            z = true;
        }
        if (!z) {
            return zzb.MediaBrowserCompat$CustomActionResultReceiver;
        }
        return "";
    }
}
