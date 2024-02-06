package p040o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.view.adapter.scheduledtransaction.ScheduleListAdapter;
import java.util.List;
import p040o.AutoValue_CrashlyticsReport_Session_Event_Device;

/* renamed from: o.EDonationService */
public final /* synthetic */ class EDonationService implements View.OnClickListener {
    private final /* synthetic */ ScheduleListAdapter.ScheduleListNoHeaderViewHolder read;

    public /* synthetic */ EDonationService(ScheduleListAdapter.ScheduleListNoHeaderViewHolder scheduleListNoHeaderViewHolder) {
        this.read = scheduleListNoHeaderViewHolder;
    }

    public final void onClick(View view) {
        int i;
        ScheduleListAdapter.ScheduleListNoHeaderViewHolder scheduleListNoHeaderViewHolder = this.read;
        C6381x4d1a9e14 read2 = ScheduleListAdapter.this.write;
        List MediaBrowserCompat$CustomActionResultReceiver = ScheduleListAdapter.this.MediaBrowserCompat$ItemReceiver;
        RecyclerView recyclerView = scheduleListNoHeaderViewHolder.MediaMetadataCompat;
        if (recyclerView == null) {
            i = -1;
        } else {
            i = recyclerView.MediaBrowserCompat$CustomActionResultReceiver((RecyclerView.setContentView) scheduleListNoHeaderViewHolder);
        }
        read2.MediaBrowserCompat$CustomActionResultReceiver((AutoValue_CrashlyticsReport_Session_Event_Device.Builder) MediaBrowserCompat$CustomActionResultReceiver.get(i));
    }
}
