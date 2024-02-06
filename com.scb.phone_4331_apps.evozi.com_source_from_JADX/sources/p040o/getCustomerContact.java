package p040o;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.adapter.BaseExpandableRecycleViewAdapter;
import java.util.ArrayList;
import java.util.List;

/* renamed from: o.getCustomerContact */
public abstract class getCustomerContact<T> extends BaseExpandableRecycleViewAdapter {
    public validateGER MediaBrowserCompat$ItemReceiver;
    private boolean MediaDescriptionCompat = false;
    public List<T> MediaMetadataCompat = new ArrayList();
    public View.OnClickListener read;

    public getCustomerContact(validateGER validateger) {
        super((Context) null);
        this.MediaBrowserCompat$ItemReceiver = validateger;
        this.read = new getCreditCardPaymentInfo(this);
    }

    public final void IconCompatParcelizer(List<T> list) {
        this.MediaMetadataCompat.clear();
        this.MediaMetadataCompat.addAll(list);
        this.IconCompatParcelizer.write();
    }

    public final void write(List<T> list) {
        if (!list.isEmpty()) {
            int size = this.MediaMetadataCompat.size();
            int size2 = list.size();
            this.MediaMetadataCompat.addAll(list);
            this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(size, size2);
            this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(size - 1, 1);
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(boolean z, getCustomerContact$MediaBrowserCompat$ItemReceiver getcustomercontact_mediabrowsercompat_itemreceiver) {
        if (this.MediaDescriptionCompat != z) {
            this.MediaDescriptionCompat = z;
            if (z) {
                this.MediaMetadataCompat.add((Object) null);
                this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(this.MediaMetadataCompat.size() - 1, 1);
            } else {
                List<T> list = this.MediaMetadataCompat;
                list.remove(list.size() - 1);
                this.IconCompatParcelizer.write(this.MediaMetadataCompat.size(), 1);
            }
            if (getcustomercontact_mediabrowsercompat_itemreceiver != null) {
                getcustomercontact_mediabrowsercompat_itemreceiver.MediaBrowserCompat$CustomActionResultReceiver(this.MediaDescriptionCompat);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void read(View view) {
        MediaBrowserCompat$ItemReceiver(view);
    }

    private void MediaBrowserCompat$ItemReceiver(View view) {
        RecyclerView.setContentView IconCompatParcelizer;
        int i;
        long j;
        if (view.getId() == R.id.container && (IconCompatParcelizer = AlertController$RecycleListView.IconCompatParcelizer(view)) != null) {
            RecyclerView recyclerView = IconCompatParcelizer.MediaMetadataCompat;
            if (recyclerView == null) {
                i = -1;
            } else {
                i = recyclerView.MediaBrowserCompat$CustomActionResultReceiver(IconCompatParcelizer);
            }
            if (i != -1) {
                validateHERK validateherk = this.MediaBrowserCompat$ItemReceiver.MediaDescriptionCompat;
                if (validateherk == null) {
                    j = -1;
                } else {
                    j = validateherk.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver(i);
                }
                int i2 = (int) j;
                if (((int) (j >>> 32)) != -1) {
                    return;
                }
                if (this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(i2)) {
                    validateHERK validateherk2 = this.MediaBrowserCompat$ItemReceiver.MediaDescriptionCompat;
                    if (validateherk2 != null) {
                        boolean MediaBrowserCompat$ItemReceiver2 = validateherk2.MediaBrowserCompat$ItemReceiver(i2, false, (Object) null);
                        return;
                    }
                    return;
                }
                this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver();
                validateHERK validateherk3 = this.MediaBrowserCompat$ItemReceiver.MediaDescriptionCompat;
                if (validateherk3 != null) {
                    boolean read2 = validateherk3.read(i2, false, (Object) null);
                }
            }
        }
    }

    public final int MediaBrowserCompat$ItemReceiver() {
        List<T> list = this.MediaMetadataCompat;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public final List<T> read() {
        return this.MediaMetadataCompat;
    }
}
