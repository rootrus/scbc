package p040o;

import com.thunderhead.android.infrastructure.server.entitys.AttributeData;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* renamed from: o.ExportCardStatementActivity$MediaBrowserCompat$CustomActionResultReceiver$MediaBrowserCompat$ItemReceiver */
public class C6477xa4e60e23 implements ExportCardStatementActivity$MediaBrowserCompat$ItemReceiver<AttributeData> {
    private Set<String> MediaBrowserCompat$CustomActionResultReceiver;

    public final /* synthetic */ boolean MediaBrowserCompat$CustomActionResultReceiver(Object obj) {
        return this.MediaBrowserCompat$CustomActionResultReceiver.contains(((AttributeData) obj).getName());
    }

    public C6477xa4e60e23(String... strArr) {
        HashSet hashSet = new HashSet();
        this.MediaBrowserCompat$CustomActionResultReceiver = hashSet;
        hashSet.addAll(Arrays.asList(strArr));
    }
}
