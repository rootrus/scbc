package p040o;

import com.google.android.gms.stats.CodePackage;
import java.util.Collections;
import java.util.List;
import p040o.CommonUtils;
import p040o.Iterables;

/* renamed from: o.iteratorImpl */
public final /* synthetic */ class iteratorImpl implements findFragmentByWho {
    private final /* synthetic */ immutableSortedCopy write;

    public /* synthetic */ iteratorImpl(immutableSortedCopy immutablesortedcopy) {
        this.write = immutablesortedcopy;
    }

    public final Object IconCompatParcelizer(Object obj) {
        immutableSortedCopy immutablesortedcopy = this.write;
        CommonUtils.C31811 r6 = (CommonUtils.C31811) obj;
        if (CodePackage.LOCATION.equals(r6.MediaBrowserCompat$CustomActionResultReceiver) || "ANNUAL_INTEREST".equals(r6.MediaBrowserCompat$CustomActionResultReceiver)) {
            return new RestrictedComponentContainer(r6.MediaBrowserCompat$ItemReceiver, (List<C3758xd990f62c>) Collections.singletonList(new C3758xd990f62c(r6.MediaDescriptionCompat, immutablesortedcopy.MediaBrowserCompat$CustomActionResultReceiver.getColor(Iterables.C35273.read.dark_gray))));
        }
        return new RestrictedComponentContainer(r6.MediaBrowserCompat$ItemReceiver, r6.MediaDescriptionCompat);
    }
}
