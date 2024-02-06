package p040o;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import p040o.AutoValue_CrashlyticsReport_Session_Event_Application_Execution;

/* renamed from: o.updateDevice */
public final class updateDevice extends getRecommendedBiller<updateDevice$MediaBrowserCompat$ItemReceiver> {
    private updateDevice$MediaBrowserCompat$CustomActionResultReceiver MediaBrowserCompat$ItemReceiver;
    private boolean MediaBrowserCompat$MediaItem;
    private setBinaries MediaBrowserCompat$SearchResultReceiver;
    private read write;

    /* renamed from: o.updateDevice$read */
    public interface read {
        void read(getSignal getsignal);

        void write(getSignal getsignal);

        void write(getSignal getsignal, String str);
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        boolean z = this.MediaBrowserCompat$MediaItem;
        ((updateDevice$MediaBrowserCompat$ItemReceiver) setcontentview).PlaybackStateCompat.setDisplay(this.read.get(i), z);
    }

    public updateDevice(boolean z, read read2, updateDevice$MediaBrowserCompat$CustomActionResultReceiver updatedevice_mediabrowsercompat_customactionresultreceiver) {
        super((List<AutoValue_CrashlyticsReport_Session_Event_Application_Execution.Builder>) null);
        setBinaries$MediaBrowserCompat$CustomActionResultReceiver write2 = setBinaries.write();
        write2.write = true;
        write2.MediaBrowserCompat$ItemReceiver = 8;
        this.MediaBrowserCompat$SearchResultReceiver = new setBinaries(write2, (byte) 0);
        this.write = read2;
        this.MediaBrowserCompat$ItemReceiver = updatedevice_mediabrowsercompat_customactionresultreceiver;
        this.MediaBrowserCompat$MediaItem = z;
    }

    /* access modifiers changed from: protected */
    public final setBinaries read() {
        if (!this.MediaBrowserCompat$MediaItem) {
            return this.MediaBrowserCompat$SearchResultReceiver;
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: com.scb.phone.view.custom.profilemanagement.AccountManagementHeaderCustomView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: com.scb.phone.view.custom.profilemanagement.AccountManagementHeaderCustomView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: com.scb.phone.view.custom.profilemanagement.AccountManagementFooterCustomView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: com.scb.phone.view.custom.profilemanagement.AccountManagementItemCustomView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: com.scb.phone.view.custom.profilemanagement.AccountManagementItemCustomView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: com.scb.phone.view.custom.profilemanagement.AccountManagementHeaderCustomView} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView.setContentView IconCompatParcelizer(android.view.ViewGroup r2, int r3) {
        /*
            r1 = this;
            r0 = 1
            if (r3 != r0) goto L_0x000d
            com.scb.phone.view.custom.profilemanagement.AccountManagementHeaderCustomView r3 = new com.scb.phone.view.custom.profilemanagement.AccountManagementHeaderCustomView
            android.content.Context r2 = r2.getContext()
            r3.<init>(r2)
            goto L_0x0037
        L_0x000d:
            r0 = 4
            if (r3 == r0) goto L_0x0029
            r0 = 8
            if (r3 == r0) goto L_0x0029
            r0 = 9
            if (r3 != r0) goto L_0x0027
            com.scb.phone.view.custom.profilemanagement.AccountManagementFooterCustomView r3 = new com.scb.phone.view.custom.profilemanagement.AccountManagementFooterCustomView
            android.content.Context r2 = r2.getContext()
            r3.<init>(r2)
            o.updateDevice$MediaBrowserCompat$CustomActionResultReceiver r2 = r1.MediaBrowserCompat$ItemReceiver
            r3.setListener(r2)
            goto L_0x0037
        L_0x0027:
            r3 = 0
            goto L_0x0037
        L_0x0029:
            com.scb.phone.view.custom.profilemanagement.AccountManagementItemCustomView r3 = new com.scb.phone.view.custom.profilemanagement.AccountManagementItemCustomView
            android.content.Context r2 = r2.getContext()
            r3.<init>(r2)
            o.updateDevice$read r2 = r1.write
            r3.setListener(r2)
        L_0x0037:
            o.updateDevice$MediaBrowserCompat$ItemReceiver r2 = new o.updateDevice$MediaBrowserCompat$ItemReceiver
            r2.<init>(r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.updateDevice.IconCompatParcelizer(android.view.ViewGroup, int):androidx.recyclerview.widget.RecyclerView$setContentView");
    }
}
