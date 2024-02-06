package p040o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.view.adapter.notification.NotificationAdapter;
import java.util.List;

/* renamed from: o.getMutualFundsDiscover */
public final /* synthetic */ class getMutualFundsDiscover implements View.OnClickListener {
    private final /* synthetic */ NotificationAdapter IconCompatParcelizer;
    private final /* synthetic */ NotificationAdapter.NotificationHolder read;

    public /* synthetic */ getMutualFundsDiscover(NotificationAdapter notificationAdapter, NotificationAdapter.NotificationHolder notificationHolder) {
        this.IconCompatParcelizer = notificationAdapter;
        this.read = notificationHolder;
    }

    public final void onClick(View view) {
        int i;
        NotificationAdapter notificationAdapter = this.IconCompatParcelizer;
        NotificationAdapter.NotificationHolder notificationHolder = this.read;
        KtaCheckExtractor ktaCheckExtractor = notificationAdapter.read;
        List<setNdkPayload> list = notificationAdapter.write;
        RecyclerView recyclerView = notificationHolder.MediaMetadataCompat;
        if (recyclerView == null) {
            i = -1;
        } else {
            i = recyclerView.MediaBrowserCompat$CustomActionResultReceiver((RecyclerView.setContentView) notificationHolder);
        }
        ktaCheckExtractor.IconCompatParcelizer(list.get(i));
    }
}
