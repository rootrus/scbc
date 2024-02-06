package p040o;

import java.util.Queue;
import p040o.getMicrAmount;

/* renamed from: o.performStop */
abstract class performStop<T extends getMicrAmount> {
    final Queue<T> read = LinearLayoutManager.IconCompatParcelizer(20);

    /* access modifiers changed from: package-private */
    public abstract T write();

    performStop() {
    }
}
