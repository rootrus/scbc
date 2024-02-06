package p040o;

import java.util.ArrayList;
import p040o.writeUInt64NoTag;

/* renamed from: o.UserLogin$MediaBrowserCompat$CustomActionResultReceiver */
public final class UserLogin$MediaBrowserCompat$CustomActionResultReceiver<V> implements writeUInt64NoTag.IconCompatParcelizer<getFrontRearWidthDifference> {
    private /* synthetic */ ArrayList MediaBrowserCompat$CustomActionResultReceiver;
    private /* synthetic */ populateExecutionData write;

    public UserLogin$MediaBrowserCompat$CustomActionResultReceiver(populateExecutionData populateexecutiondata, ArrayList arrayList) {
        this.write = populateexecutiondata;
        this.MediaBrowserCompat$CustomActionResultReceiver = arrayList;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        ((getFrontRearWidthDifference) obj).MediaBrowserCompat$ItemReceiver(this.write, this.MediaBrowserCompat$CustomActionResultReceiver);
    }
}
