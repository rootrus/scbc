package p040o;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.setContentView;
import com.google.android.gms.common.api.Api;
import java.util.ArrayList;

/* renamed from: o.ItemCustom */
public abstract class ItemCustom<T, H extends RecyclerView.setContentView> extends RecyclerView.IconCompatParcelizer<H> {
    public ArrayList<T> read;

    public ItemCustom(ArrayList<T> arrayList) {
        onGetStartedClick.write((Object) arrayList, "lists");
        this.read = arrayList;
    }

    public final int read(int i) {
        if (this.read.size() == 0) {
            return 0;
        }
        if (i >= 1073741823) {
            return (i - 1073741823) % this.read.size();
        }
        int size = (1073741823 - i) % this.read.size();
        if (size == 0) {
            return 0;
        }
        return this.read.size() - size;
    }

    public final int IconCompatParcelizer() {
        return this.read.size() <= 1 ? this.read.size() : Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    public final int read() {
        if ((this.read.size() <= 1 ? this.read.size() : Api.BaseClientBuilder.API_PRIORITY_OTHER) > 0) {
            return read(1073741823) + 1073741823;
        }
        return 0;
    }
}
