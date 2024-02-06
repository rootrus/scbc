package p040o;

import java.util.Arrays;
import java.util.List;
import p040o.LinkedHashTreeMap;
import p040o.onSearchButtonClick;

/* renamed from: o.zzdg */
public final /* synthetic */ class zzdg implements DirectDebitDeepLinkActivity {
    public /* synthetic */ zzdg(onSearchButtonClick.read read) {
    }

    public final Object write(Object obj) {
        LinkedHashTreeMap.AvlIterator avlIterator = (LinkedHashTreeMap.AvlIterator) obj;
        onGetStartedClick.write((Object) avlIterator, "ndidRemark");
        String[] strArr = {avlIterator.read.MediaBrowserCompat$CustomActionResultReceiver, avlIterator.read.MediaBrowserCompat$ItemReceiver};
        onGetStartedClick.write((Object) strArr, "elements");
        onGetStartedClick.write((Object) strArr, "$this$asList");
        List asList = Arrays.asList(strArr);
        onGetStartedClick.IconCompatParcelizer((Object) asList, "ArraysUtilJVM.asList(this)");
        return asList;
    }
}
