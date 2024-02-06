package p040o;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p040o.Keep;

/* renamed from: o.nScriptGroupSetInput */
public final class nScriptGroupSetInput<T extends IInterface> {
    private static final Map<String, Handler> ParcelableVolumeInfo = Collections.synchronizedMap(new HashMap());
    public final String IconCompatParcelizer;
    public final FragmentBuilder_BindPdfViewerFragment MediaBrowserCompat$CustomActionResultReceiver;
    boolean MediaBrowserCompat$ItemReceiver;
    final Intent MediaBrowserCompat$MediaItem;
    final IBinder.DeathRecipient MediaBrowserCompat$SearchResultReceiver;
    public final WeakReference<Keep.read> MediaDescriptionCompat;
    ServiceConnection MediaMetadataCompat;
    public T MediaSessionCompat$Token;
    final nScriptIntrinsicBLAS_Z<T> RatingCompat;
    final Context read;
    public final List<nScriptGroup2Execute> write;

    public nScriptGroupSetInput(Context context, FragmentBuilder_BindPdfViewerFragment fragmentBuilder_BindPdfViewerFragment, String str, Intent intent, nScriptIntrinsicBLAS_Z<T> nscriptintrinsicblas_z) {
        this(context, fragmentBuilder_BindPdfViewerFragment, str, intent, nscriptintrinsicblas_z, (byte) 0);
    }

    private nScriptGroupSetInput(Context context, FragmentBuilder_BindPdfViewerFragment fragmentBuilder_BindPdfViewerFragment, String str, Intent intent, nScriptIntrinsicBLAS_Z<T> nscriptintrinsicblas_z, byte b) {
        this.write = new ArrayList();
        this.MediaBrowserCompat$SearchResultReceiver = new forEachSrcOut$MediaBrowserCompat$ItemReceiver(this);
        this.read = context;
        this.MediaBrowserCompat$CustomActionResultReceiver = fragmentBuilder_BindPdfViewerFragment;
        this.IconCompatParcelizer = str;
        this.MediaBrowserCompat$MediaItem = intent;
        this.RatingCompat = nscriptintrinsicblas_z;
        this.MediaDescriptionCompat = new WeakReference<>((Object) null);
    }

    public final Handler IconCompatParcelizer() {
        Handler handler;
        synchronized (ParcelableVolumeInfo) {
            if (!ParcelableVolumeInfo.containsKey(this.IconCompatParcelizer)) {
                HandlerThread handlerThread = new HandlerThread(this.IconCompatParcelizer, 10);
                handlerThread.start();
                ParcelableVolumeInfo.put(this.IconCompatParcelizer, new Handler(handlerThread.getLooper()));
            }
            handler = ParcelableVolumeInfo.get(this.IconCompatParcelizer);
        }
        return handler;
    }
}
