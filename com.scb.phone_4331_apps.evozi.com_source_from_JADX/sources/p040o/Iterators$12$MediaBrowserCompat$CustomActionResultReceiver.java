package p040o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p040o.C10827Iterators;
import p040o.Maps;

/* renamed from: o.Iterators$12$MediaBrowserCompat$CustomActionResultReceiver */
public final class Iterators$12$MediaBrowserCompat$CustomActionResultReceiver extends CheckEligibilityActivity implements FundFactSheetActivity<List<? extends onClickNext$MediaBrowserCompat$CustomActionResultReceiver>, List<? extends FirebaseOptions>> {
    private /* synthetic */ C10827Iterators.C353712 IconCompatParcelizer;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Iterators$12$MediaBrowserCompat$CustomActionResultReceiver(C10827Iterators.C353712 r1) {
        super(1);
        this.IconCompatParcelizer = r1;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        List list = (List) obj;
        onGetStartedClick.write((Object) list, "it");
        Maps.C36401 r0 = this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver;
        onGetStartedClick.write((Object) list, "list");
        int i = 0;
        boolean z = true;
        if (list.size() != 1) {
            z = false;
        }
        Iterable iterable = list;
        int i2 = 10;
        onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
        if (iterable instanceof Collection) {
            i2 = ((Collection) iterable).size();
        }
        Collection arrayList = new ArrayList(i2);
        for (Object next : iterable) {
            if (i >= 0) {
                arrayList.add(r0.MediaBrowserCompat$ItemReceiver(i, (onClickNext$MediaBrowserCompat$CustomActionResultReceiver) next, z));
                i++;
            } else {
                throw new ArithmeticException("Index overflow has happened.");
            }
        }
        return (List) arrayList;
    }
}
