package p040o;

import com.thunderhead.android.infrastructure.server.entitys.AttributeData;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* renamed from: o.ExportCardStatementActivity$MediaBrowserCompat$CustomActionResultReceiver$MediaBrowserCompat$CustomActionResultReceiver */
public class C6476xb675ec54 implements ExportCardStatementActivity$MediaBrowserCompat$ItemReceiver<AttributeData> {
    private Set<String> MediaBrowserCompat$ItemReceiver;

    public final /* synthetic */ boolean MediaBrowserCompat$CustomActionResultReceiver(Object obj) {
        return this.MediaBrowserCompat$ItemReceiver.contains(((AttributeData) obj).getDataType());
    }

    public C6476xb675ec54(String... strArr) {
        HashSet hashSet = new HashSet();
        this.MediaBrowserCompat$ItemReceiver = hashSet;
        hashSet.addAll(Arrays.asList(strArr));
    }
}
