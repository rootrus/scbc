package p040o;

import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.view.custom.profilemanagement.AddAccountCustomView;
import java.util.List;
import p040o.AutoValue_CrashlyticsReport_Session_Event_Application_Execution;

/* renamed from: o.confirmRegistrationDirectDebit */
public final class confirmRegistrationDirectDebit extends getRecommendedBiller<write> {
    public boolean MediaBrowserCompat$ItemReceiver;
    private confirmRegistrationDirectDebit$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$MediaItem;
    private read MediaDescriptionCompat;
    private IconCompatParcelizer MediaMetadataCompat;
    private setBinaries RatingCompat;
    private C7101xb11ee437 write;

    /* renamed from: o.confirmRegistrationDirectDebit$IconCompatParcelizer */
    public interface IconCompatParcelizer {
        void MediaBrowserCompat$CustomActionResultReceiver(setThreads setthreads, boolean z);
    }

    /* renamed from: o.confirmRegistrationDirectDebit$read */
    public interface read {
        void read(getSignal getsignal, boolean z);
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        ((write) setcontentview).AlertController$RecycleListView.setDisplay(this.read.get(i));
    }

    public confirmRegistrationDirectDebit(IconCompatParcelizer iconCompatParcelizer, read read2, C7101xb11ee437 confirmregistrationdirectdebit_mediabrowsercompat_customactionresultreceiver, confirmRegistrationDirectDebit$MediaBrowserCompat$ItemReceiver confirmregistrationdirectdebit_mediabrowsercompat_itemreceiver) {
        super((List<AutoValue_CrashlyticsReport_Session_Event_Application_Execution.Builder>) null);
        setBinaries$MediaBrowserCompat$CustomActionResultReceiver write2 = setBinaries.write();
        write2.MediaBrowserCompat$ItemReceiver = 8;
        this.RatingCompat = new setBinaries(write2, (byte) 0);
        this.MediaMetadataCompat = iconCompatParcelizer;
        this.MediaDescriptionCompat = read2;
        this.write = confirmregistrationdirectdebit_mediabrowsercompat_customactionresultreceiver;
        this.MediaBrowserCompat$MediaItem = confirmregistrationdirectdebit_mediabrowsercompat_itemreceiver;
    }

    /* renamed from: o.confirmRegistrationDirectDebit$write */
    static class write extends RecyclerView.setContentView {
        AddAccountCustomView AlertController$RecycleListView;

        public write(AddAccountCustomView addAccountCustomView) {
            super(addAccountCustomView);
            this.AlertController$RecycleListView = addAccountCustomView;
        }
    }

    /* access modifiers changed from: protected */
    public final setBinaries read() {
        if (this.MediaBrowserCompat$ItemReceiver) {
            return this.RatingCompat;
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: com.scb.phone.view.custom.profilemanagement.AddAccountHeaderCustomView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: com.scb.phone.view.custom.profilemanagement.AddAccountPendingCardCustomView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: com.scb.phone.view.custom.profilemanagement.AddAccountSelectorCustomView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: com.scb.phone.view.custom.profilemanagement.AddAccountHeaderCustomView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: com.scb.phone.view.custom.profilemanagement.AddAccountHeaderCustomView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: com.scb.phone.view.custom.profilemanagement.AddAccountHeaderCustomView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v12, resolved type: com.scb.phone.view.custom.profilemanagement.AddAccountSubheaderCustomView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v13, resolved type: com.scb.phone.view.custom.profilemanagement.AddAccountErrorCustomView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: com.scb.phone.view.custom.profilemanagement.AddAccountFooterCustomView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v15, resolved type: com.scb.phone.view.custom.profilemanagement.AddAccountItemCustomView} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView.setContentView IconCompatParcelizer(android.view.ViewGroup r2, int r3) {
        /*
            r1 = this;
            r0 = 1
            if (r3 == r0) goto L_0x0063
            r0 = 2
            if (r3 == r0) goto L_0x0054
            r0 = 3
            if (r3 == r0) goto L_0x0045
            r0 = 6
            if (r3 == r0) goto L_0x003b
            r0 = 7
            if (r3 == r0) goto L_0x0031
            r0 = 9
            if (r3 == r0) goto L_0x0022
            com.scb.phone.view.custom.profilemanagement.AddAccountItemCustomView r3 = new com.scb.phone.view.custom.profilemanagement.AddAccountItemCustomView
            android.content.Context r2 = r2.getContext()
            r3.<init>(r2)
            o.confirmRegistrationDirectDebit$read r2 = r1.MediaDescriptionCompat
            r3.setListener(r2)
            goto L_0x006c
        L_0x0022:
            com.scb.phone.view.custom.profilemanagement.AddAccountFooterCustomView r3 = new com.scb.phone.view.custom.profilemanagement.AddAccountFooterCustomView
            android.content.Context r2 = r2.getContext()
            r3.<init>(r2)
            o.confirmRegistrationDirectDebit$MediaBrowserCompat$ItemReceiver r2 = r1.MediaBrowserCompat$MediaItem
            r3.setListener(r2)
            goto L_0x006c
        L_0x0031:
            com.scb.phone.view.custom.profilemanagement.AddAccountErrorCustomView r3 = new com.scb.phone.view.custom.profilemanagement.AddAccountErrorCustomView
            android.content.Context r2 = r2.getContext()
            r3.<init>(r2)
            goto L_0x006c
        L_0x003b:
            com.scb.phone.view.custom.profilemanagement.AddAccountSubheaderCustomView r3 = new com.scb.phone.view.custom.profilemanagement.AddAccountSubheaderCustomView
            android.content.Context r2 = r2.getContext()
            r3.<init>(r2)
            goto L_0x006c
        L_0x0045:
            com.scb.phone.view.custom.profilemanagement.AddAccountSelectorCustomView r3 = new com.scb.phone.view.custom.profilemanagement.AddAccountSelectorCustomView
            android.content.Context r2 = r2.getContext()
            r3.<init>(r2)
            o.confirmRegistrationDirectDebit$IconCompatParcelizer r2 = r1.MediaMetadataCompat
            r3.setListener(r2)
            goto L_0x006c
        L_0x0054:
            com.scb.phone.view.custom.profilemanagement.AddAccountPendingCardCustomView r3 = new com.scb.phone.view.custom.profilemanagement.AddAccountPendingCardCustomView
            android.content.Context r2 = r2.getContext()
            r3.<init>(r2)
            o.confirmRegistrationDirectDebit$MediaBrowserCompat$CustomActionResultReceiver r2 = r1.write
            r3.setListener(r2)
            goto L_0x006c
        L_0x0063:
            com.scb.phone.view.custom.profilemanagement.AddAccountHeaderCustomView r3 = new com.scb.phone.view.custom.profilemanagement.AddAccountHeaderCustomView
            android.content.Context r2 = r2.getContext()
            r3.<init>(r2)
        L_0x006c:
            o.confirmRegistrationDirectDebit$write r2 = new o.confirmRegistrationDirectDebit$write
            r2.<init>(r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.confirmRegistrationDirectDebit.IconCompatParcelizer(android.view.ViewGroup, int):androidx.recyclerview.widget.RecyclerView$setContentView");
    }
}
