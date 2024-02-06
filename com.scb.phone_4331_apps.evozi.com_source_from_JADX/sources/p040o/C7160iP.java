package p040o;

import android.content.Context;
import com.scb.phone.view.activity.cardmanagement.SaveSlipBaseActivity;
import java.util.concurrent.Callable;

/* renamed from: o.iP */
public final /* synthetic */ class C7160iP implements Callable {
    private final /* synthetic */ Object MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ Context MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ SaveSlipBaseActivity read;
    private final /* synthetic */ boolean write = true;

    public /* synthetic */ C7160iP(SaveSlipBaseActivity saveSlipBaseActivity, Object obj, Context context, boolean z) {
        this.read = saveSlipBaseActivity;
        this.MediaBrowserCompat$CustomActionResultReceiver = obj;
        this.MediaBrowserCompat$ItemReceiver = context;
    }

    public final Object call() {
        return this.read.write(this.MediaBrowserCompat$CustomActionResultReceiver, this.MediaBrowserCompat$ItemReceiver, this.write);
    }
}
