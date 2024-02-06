package p040o;

import java.util.Comparator;
import p040o.TouchPointInstructionActivity;

/* renamed from: o.filterFiltered */
public final /* synthetic */ class filterFiltered implements Comparator {
    private final /* synthetic */ C10849mapDifference IconCompatParcelizer;

    public /* synthetic */ filterFiltered(C10849mapDifference mapdifference) {
        this.IconCompatParcelizer = mapdifference;
    }

    public final int compare(Object obj, Object obj2) {
        TouchPointInstructionActivity.IconCompatParcelizer iconCompatParcelizer = (TouchPointInstructionActivity.IconCompatParcelizer) obj;
        TouchPointInstructionActivity.IconCompatParcelizer iconCompatParcelizer2 = (TouchPointInstructionActivity.IconCompatParcelizer) obj2;
        if (iconCompatParcelizer.IconCompatParcelizer != null && iconCompatParcelizer2.IconCompatParcelizer != null) {
            return iconCompatParcelizer.IconCompatParcelizer.compareTo(iconCompatParcelizer2.IconCompatParcelizer);
        }
        if (iconCompatParcelizer.IconCompatParcelizer != null) {
            return 1;
        }
        return iconCompatParcelizer2.IconCompatParcelizer != null ? -1 : 0;
    }
}
