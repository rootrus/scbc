package p040o;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.setContentView;
import java.util.ArrayList;
import java.util.List;
import p040o.AutoValue_CrashlyticsReport_Session_Event_Application_Execution;

/* renamed from: o.getRecommendedBiller */
public abstract class getRecommendedBiller<VH extends RecyclerView.setContentView> extends RecyclerView.IconCompatParcelizer<VH> {
    public List<AutoValue_CrashlyticsReport_Session_Event_Application_Execution.Builder> read;

    /* access modifiers changed from: protected */
    public setBinaries read() {
        return null;
    }

    public final int IconCompatParcelizer() {
        List<AutoValue_CrashlyticsReport_Session_Event_Application_Execution.Builder> list = this.read;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public final void IconCompatParcelizer(List<AutoValue_CrashlyticsReport_Session_Event_Application_Execution.Builder> list) {
        List<AutoValue_CrashlyticsReport_Session_Event_Application_Execution.Builder> list2 = this.read;
        if (list2 != null) {
            list2.clear();
        } else {
            this.read = new ArrayList();
        }
        this.read.addAll(list);
        if (read() != null) {
            this.read.add(read());
        }
        this.IconCompatParcelizer.write();
    }

    public final void MediaBrowserCompat$ItemReceiver(getSignal getsignal) {
        boolean z = false;
        for (AutoValue_CrashlyticsReport_Session_Event_Application_Execution.Builder next : this.read) {
            if (next instanceof getSignal) {
                getSignal getsignal2 = (getSignal) next;
                if (getsignal2.MediaMetadataCompat && !getsignal2.IconCompatParcelizer.equals(getsignal.IconCompatParcelizer)) {
                    getsignal2.MediaMetadataCompat = false;
                    z = true;
                }
            }
        }
        if (z) {
            this.IconCompatParcelizer.write();
        }
    }

    public final int MediaBrowserCompat$CustomActionResultReceiver(int i) {
        int read2 = this.read.get(i).read();
        if (read2 == 1) {
            return 1;
        }
        switch (read2) {
            case 8:
                return 9;
            case 9:
                return 3;
            case 10:
                return 2;
            case 11:
                return 6;
            case 12:
                return 8;
            case 13:
                return 7;
            default:
                return 4;
        }
    }

    public getRecommendedBiller(List<AutoValue_CrashlyticsReport_Session_Event_Application_Execution.Builder> list) {
        if (list != null) {
            this.read = list;
        } else {
            this.read = new ArrayList();
        }
        if (read() != null) {
            this.read.add(read());
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
        if (read() != null) {
            read().IconCompatParcelizer = z;
            this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(this.read.size() - 1, 1);
        }
    }

    public final boolean MediaBrowserCompat$ItemReceiver() {
        return read() != null;
    }
}
