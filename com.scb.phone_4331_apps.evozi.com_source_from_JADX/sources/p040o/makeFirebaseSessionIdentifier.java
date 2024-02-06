package p040o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p040o.zzcz;

/* renamed from: o.makeFirebaseSessionIdentifier */
public final class makeFirebaseSessionIdentifier {
    public static final makeFirebaseSessionIdentifier IconCompatParcelizer = new makeFirebaseSessionIdentifier();

    private makeFirebaseSessionIdentifier() {
    }

    public static synthesizeSessionFile MediaBrowserCompat$CustomActionResultReceiver(zzcz.zzi zzi) {
        int i;
        onGetStartedClick.write((Object) zzi, "page");
        if (zzi.MediaBrowserCompat$ItemReceiver.size() >= 3) {
            i = zzi.MediaBrowserCompat$ItemReceiver.size() - 3;
        } else {
            i = zzi.MediaBrowserCompat$ItemReceiver.size() - 1;
        }
        Iterable iterable = zzi.MediaBrowserCompat$ItemReceiver;
        int i2 = 10;
        onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
        if (iterable instanceof Collection) {
            i2 = ((Collection) iterable).size();
        }
        Collection arrayList = new ArrayList(i2);
        int i3 = 0;
        for (Object next : iterable) {
            if (i3 >= 0) {
                zzcz.zzi.read read = (zzcz.zzi.read) next;
                arrayList.add(new firebaseCrashExists(read.read, read.MediaBrowserCompat$CustomActionResultReceiver, zzi.MediaBrowserCompat$CustomActionResultReceiver && i3 == i));
                i3++;
            } else {
                throw new ArithmeticException("Index overflow has happened.");
            }
        }
        Collection collection = (List) arrayList;
        onGetStartedClick.write((Object) collection, "$this$toMutableList");
        return new synthesizeSessionFile(new ArrayList(collection), zzi.IconCompatParcelizer, zzi.MediaBrowserCompat$CustomActionResultReceiver);
    }
}
