package p040o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.view.adapter.scheduledtransaction.ScheduleListAdapter;
import java.util.List;
import p040o.AutoValue_CrashlyticsReport_Session_Event_Device;

/* renamed from: o.eligibilityValidation */
public final /* synthetic */ class eligibilityValidation implements View.OnClickListener {
    private final /* synthetic */ ScheduleListAdapter.ScheduleListWithHeaderViewHolder write;

    public /* synthetic */ eligibilityValidation(ScheduleListAdapter.ScheduleListWithHeaderViewHolder scheduleListWithHeaderViewHolder) {
        this.write = scheduleListWithHeaderViewHolder;
    }

    public final void onClick(View view) {
        int i;
        ScheduleListAdapter.ScheduleListWithHeaderViewHolder scheduleListWithHeaderViewHolder = this.write;
        C6381x4d1a9e14 read = ScheduleListAdapter.this.write;
        List MediaBrowserCompat$CustomActionResultReceiver = ScheduleListAdapter.this.MediaBrowserCompat$ItemReceiver;
        RecyclerView recyclerView = scheduleListWithHeaderViewHolder.MediaMetadataCompat;
        if (recyclerView == null) {
            i = -1;
        } else {
            i = recyclerView.MediaBrowserCompat$CustomActionResultReceiver((RecyclerView.setContentView) scheduleListWithHeaderViewHolder);
        }
        read.MediaBrowserCompat$CustomActionResultReceiver((AutoValue_CrashlyticsReport_Session_Event_Device.Builder) MediaBrowserCompat$CustomActionResultReceiver.get(i));
    }
}
