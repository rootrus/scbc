package p040o;

import androidx.fragment.app.Fragment;
import java.util.List;
import p040o.setUpWithDisplay;

/* renamed from: o.EasycashBusinessAndMaritalInfoRepositoryModule */
public final class EasycashBusinessAndMaritalInfoRepositoryModule<T extends setUpWithDisplay> extends setCardElevation {
    private List<T> write;

    public EasycashBusinessAndMaritalInfoRepositoryModule(setTitleMarginStart settitlemarginstart, List<T> list) {
        super(settitlemarginstart);
        this.write = list;
    }

    public final CharSequence getPageTitle(int i) {
        if (this.write.isEmpty()) {
            return null;
        }
        return ((setUpWithDisplay) this.write.get(i)).write;
    }

    public final Fragment read(int i) {
        if (this.write.isEmpty()) {
            return null;
        }
        return ((setUpWithDisplay) this.write.get(i)).read;
    }

    public final int getCount() {
        return this.write.size();
    }
}
