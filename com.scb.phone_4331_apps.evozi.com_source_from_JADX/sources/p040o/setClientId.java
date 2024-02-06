package p040o;

import java.util.ArrayList;

/* renamed from: o.setClientId */
public final class setClientId extends FragmentBuilder_BindSummaryFragment {
    public static onUpgrade MediaBrowserCompat$ItemReceiver(containsInvalidHostnameAsciiCodes containsinvalidhostnameasciicodes) {
        ArrayList arrayList = new ArrayList();
        for (url next : containsinvalidhostnameasciicodes.write) {
            arrayList.add(new getJobId(next.MediaBrowserCompat$CustomActionResultReceiver, next.MediaBrowserCompat$MediaItem, next.MediaBrowserCompat$SearchResultReceiver, next.IconCompatParcelizer, next.read, next.MediaBrowserCompat$ItemReceiver, next.write));
        }
        parsePort parseport = containsinvalidhostnameasciicodes.IconCompatParcelizer;
        onDowngrade ondowngrade = null;
        if (!(parseport == null || parseport.read == null || parseport.read.isEmpty())) {
            ondowngrade = new onDowngrade();
            ondowngrade.MediaBrowserCompat$CustomActionResultReceiver = parseport.read;
        }
        onUpgrade onupgrade = new onUpgrade(arrayList, containsinvalidhostnameasciicodes.MediaBrowserCompat$ItemReceiver, ondowngrade);
        onupgrade.read(IconCompatParcelizer((setCurrentItemInternal) containsinvalidhostnameasciicodes));
        return onupgrade;
    }
}
