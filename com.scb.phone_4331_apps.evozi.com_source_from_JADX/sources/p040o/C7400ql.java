package p040o;

import com.scb.phone.view.activity.etb.EtbActivity;
import p040o.getTimeOutParameters;

/* renamed from: o.ql */
public final /* synthetic */ class C7400ql implements getTimeOutParameters.write {
    private final /* synthetic */ EtbActivity IconCompatParcelizer;

    public /* synthetic */ C7400ql(EtbActivity etbActivity) {
        this.IconCompatParcelizer = etbActivity;
    }

    public final void write(String str) {
        this.IconCompatParcelizer.MediaSessionCompat$QueueItem(str);
    }
}
