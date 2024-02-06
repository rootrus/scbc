package p040o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.view.adapter.landingpage.UnselectedTileAdapter;

/* renamed from: o.getDebitResetOtpConfirm */
public final /* synthetic */ class getDebitResetOtpConfirm implements View.OnClickListener {
    private final /* synthetic */ UnselectedTileAdapter.write read;
    private final /* synthetic */ UnselectedTileAdapter.Holder write;

    public /* synthetic */ getDebitResetOtpConfirm(UnselectedTileAdapter.Holder holder, UnselectedTileAdapter.write write2) {
        this.write = holder;
        this.read = write2;
    }

    public final void onClick(View view) {
        int i;
        UnselectedTileAdapter.Holder holder = this.write;
        UnselectedTileAdapter.write write2 = this.read;
        boolean z = !holder.setHasDecor;
        holder.setHasDecor = z;
        holder.checkImageView.setVisibility(z ? 0 : 8);
        boolean z2 = holder.setHasDecor;
        RecyclerView recyclerView = holder.MediaMetadataCompat;
        if (recyclerView == null) {
            i = -1;
        } else {
            i = recyclerView.MediaBrowserCompat$CustomActionResultReceiver((RecyclerView.setContentView) holder);
        }
        write2.write(z2, i);
    }
}
