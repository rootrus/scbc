package p040o;

import java.util.List;
import p040o.ImmutableAsList;

/* renamed from: o.FragmentBuilder_BindCloseAccountSelectionOwnFragment */
public interface FragmentBuilder_BindCloseAccountSelectionOwnFragment {

    /* renamed from: o.FragmentBuilder_BindCloseAccountSelectionOwnFragment$read */
    public interface read {
        void MediaBrowserCompat$ItemReceiver(List<CrashlyticsReportDataCapture> list);
    }

    /* renamed from: o.FragmentBuilder_BindCloseAccountSelectionOwnFragment$write */
    public interface write {
        void MediaSessionCompat$QueueItem();
    }

    boolean MediaBrowserCompat$ItemReceiver();

    DebitCardResetOtpActivity<zzum> write();

    DebitCardResetOtpActivity<Boolean> write(ImmutableAsList.SerializedForm serializedForm);

    void write(boolean z);
}
