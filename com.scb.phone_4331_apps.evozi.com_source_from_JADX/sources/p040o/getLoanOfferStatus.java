package p040o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.view.adapter.notification.NotificationAdapter;
import java.util.List;

/* renamed from: o.getLoanOfferStatus */
public final /* synthetic */ class getLoanOfferStatus implements View.OnClickListener {
    private final /* synthetic */ NotificationAdapter read;
    private final /* synthetic */ NotificationAdapter.NotificationHolder write;

    public /* synthetic */ getLoanOfferStatus(NotificationAdapter notificationAdapter, NotificationAdapter.NotificationHolder notificationHolder) {
        this.read = notificationAdapter;
        this.write = notificationHolder;
    }

    public final void onClick(View view) {
        int i;
        NotificationAdapter notificationAdapter = this.read;
        NotificationAdapter.NotificationHolder notificationHolder = this.write;
        KtaCheckExtractor ktaCheckExtractor = notificationAdapter.read;
        List<setNdkPayload> list = notificationAdapter.write;
        RecyclerView recyclerView = notificationHolder.MediaMetadataCompat;
        if (recyclerView == null) {
            i = -1;
        } else {
            i = recyclerView.MediaBrowserCompat$CustomActionResultReceiver((RecyclerView.setContentView) notificationHolder);
        }
        ktaCheckExtractor.MediaBrowserCompat$CustomActionResultReceiver(list.get(i));
    }
}
