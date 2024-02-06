package p040o;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import com.scb.phone.view.activity.PreLoadCheckActivity;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.LogFileManager;

/* renamed from: o.ZipFileBundle */
public final /* synthetic */ class ZipFileBundle implements DialogInterface.OnClickListener {
    private final /* synthetic */ LogFileManager.DirectoryProvider IconCompatParcelizer;
    private final /* synthetic */ PreLoadCheckActivity read;

    /* renamed from: o.ZipFileBundle$b */
    public final /* synthetic */ class C7091b implements Runnable {
        private final /* synthetic */ PreLoadCheckActivity IconCompatParcelizer;

        public /* synthetic */ C7091b(PreLoadCheckActivity preLoadCheckActivity) {
            this.IconCompatParcelizer = preLoadCheckActivity;
        }

        public final void run() {
            this.IconCompatParcelizer.setActionBarVisibilityCallback();
        }
    }

    public /* synthetic */ ZipFileBundle(PreLoadCheckActivity preLoadCheckActivity, LogFileManager.DirectoryProvider directoryProvider) {
        this.read = preLoadCheckActivity;
        this.IconCompatParcelizer = directoryProvider;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        PreLoadCheckActivity preLoadCheckActivity = this.read;
        LogFileManager.DirectoryProvider directoryProvider = this.IconCompatParcelizer;
        dialogInterface.dismiss();
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(directoryProvider.MediaBrowserCompat$SearchResultReceiver));
        IntentTidInjectionContextAspect.aspectOf();
        PreLoadCheckActivity.MediaBrowserCompat$CustomActionResultReceiver((Context) preLoadCheckActivity, intent);
    }

    /* renamed from: o.ZipFileBundle$a */
    public final /* synthetic */ class C7090a implements Runnable {
        private final /* synthetic */ PreLoadCheckActivity write;

        public /* synthetic */ C7090a(PreLoadCheckActivity preLoadCheckActivity) {
            this.write = preLoadCheckActivity;
        }

        public final void run() {
            PreLoadCheckActivity preLoadCheckActivity = this.write;
            preLoadCheckActivity.AlertController$RecycleListView();
            new Handler().postDelayed(preLoadCheckActivity.MediaSessionCompat$QueueItem, 800);
        }
    }
}
