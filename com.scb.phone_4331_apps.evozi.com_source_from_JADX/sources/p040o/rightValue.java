package p040o;

import java.util.Comparator;

/* renamed from: o.rightValue */
public final /* synthetic */ class rightValue implements Comparator {
    public static final /* synthetic */ rightValue read = new rightValue();

    private /* synthetic */ rightValue() {
    }

    public final int compare(Object obj, Object obj2) {
        return ((MoreExecutors) obj).IconCompatParcelizer.compareToIgnoreCase(((MoreExecutors) obj2).IconCompatParcelizer);
    }
}
