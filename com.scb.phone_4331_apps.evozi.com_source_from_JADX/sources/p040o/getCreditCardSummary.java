package p040o;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.adapter.BaseExpandableRecycleViewAdapter;

/* renamed from: o.getCreditCardSummary */
public abstract class getCreditCardSummary extends BaseExpandableRecycleViewAdapter {
    private validateGER read;

    public getCreditCardSummary(Context context, validateGER validateger) {
        super(context);
        this.read = validateger;
    }

    /* access modifiers changed from: protected */
    public final void MediaBrowserCompat$ItemReceiver(View view) {
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
                validateHERK validateherk = this.read.MediaDescriptionCompat;
                if (validateherk == null) {
                    j = -1;
                } else {
                    j = validateherk.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver(i);
                }
                int i2 = (int) j;
                if (((int) (j >>> 32)) != -1) {
                    return;
                }
                if (this.read.IconCompatParcelizer(i2)) {
                    validateHERK validateherk2 = this.read.MediaDescriptionCompat;
                    if (validateherk2 != null) {
                        boolean MediaBrowserCompat$ItemReceiver = validateherk2.MediaBrowserCompat$ItemReceiver(i2, false, (Object) null);
                        return;
                    }
                    return;
                }
                this.read.MediaBrowserCompat$CustomActionResultReceiver();
                validateHERK validateherk3 = this.read.MediaDescriptionCompat;
                if (validateherk3 != null) {
                    boolean read2 = validateherk3.read(i2, false, (Object) null);
                }
            }
        }
    }
}
