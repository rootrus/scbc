package p040o;

import android.view.View;
import com.scb.phone.view.adapter.bulktransfer.ManageGroupAdapter;

/* renamed from: o.SingleDataEntity */
public final /* synthetic */ class SingleDataEntity implements View.OnClickListener {
    private final /* synthetic */ int MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ ManageGroupAdapter MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ SingleDataEntity(ManageGroupAdapter manageGroupAdapter, int i) {
        this.MediaBrowserCompat$ItemReceiver = manageGroupAdapter;
        this.MediaBrowserCompat$CustomActionResultReceiver = i;
    }

    public final void onClick(View view) {
        ManageGroupAdapter manageGroupAdapter = this.MediaBrowserCompat$ItemReceiver;
        UncaughtExceptionHandlers uncaughtExceptionHandlers = manageGroupAdapter.read.get(this.MediaBrowserCompat$CustomActionResultReceiver);
        ManageGroupAdapter.write write = manageGroupAdapter.write;
        if (write != null) {
            write.MediaBrowserCompat$ItemReceiver(uncaughtExceptionHandlers);
        }
    }
}
