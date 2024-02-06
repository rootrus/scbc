package p040o;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Build;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.Marker;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p040o.IdCaptureBackActivity_MembersInjector;
import p040o.rsnAllocationRead2D;

/* renamed from: o.rsnAllocationSyncAll */
public final class rsnAllocationSyncAll<T extends IdCaptureBackActivity_MembersInjector> implements GoogleMap.OnCameraIdleListener, GoogleMap.OnMarkerClickListener, GoogleMap.OnInfoWindowClickListener {
    public final rsnAllocationRead2D IconCompatParcelizer;
    public final rsnAllocationRead2D.IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver;
    public final rsnAllocationRead2D.IconCompatParcelizer MediaBrowserCompat$ItemReceiver;
    private GoogleMap MediaBrowserCompat$MediaItem;
    private rsnAllocationSyncAll<T>.ItemReceiver MediaBrowserCompat$SearchResultReceiver;
    public write<T> MediaDescriptionCompat;
    private final ReadWriteLock MediaMetadataCompat;
    private CameraPosition MediaSessionCompat$Token;
    public rsnContextSetPriority<T> RatingCompat;
    public rsnContextFinish<T> read;
    public final ReadWriteLock write;

    /* renamed from: o.rsnAllocationSyncAll$IconCompatParcelizer */
    public interface IconCompatParcelizer<T extends IdCaptureBackActivity_MembersInjector> {
    }

    /* renamed from: o.rsnAllocationSyncAll$read */
    public interface read<T extends IdCaptureBackActivity_MembersInjector> {
        boolean MediaBrowserCompat$CustomActionResultReceiver();
    }

    /* renamed from: o.rsnAllocationSyncAll$write */
    public interface write<T extends IdCaptureBackActivity_MembersInjector> {
        boolean MediaBrowserCompat$CustomActionResultReceiver(T t);
    }

    public rsnAllocationSyncAll(Context context, GoogleMap googleMap) {
        this(context, googleMap, new rsnAllocationRead2D(googleMap));
    }

    private rsnAllocationSyncAll(Context context, GoogleMap googleMap, rsnAllocationRead2D rsnallocationread2d) {
        this.write = new ReentrantReadWriteLock();
        this.MediaMetadataCompat = new ReentrantReadWriteLock();
        this.MediaBrowserCompat$MediaItem = googleMap;
        this.IconCompatParcelizer = rsnallocationread2d;
        this.MediaBrowserCompat$CustomActionResultReceiver = new rsnAllocationRead2D.IconCompatParcelizer();
        this.MediaBrowserCompat$ItemReceiver = new rsnAllocationRead2D.IconCompatParcelizer();
        this.RatingCompat = new rsnContextDestroy(context, googleMap, this);
        this.read = new rsnContextDump(new rsnClosureSetArg(new rsnContextCreate()));
        this.MediaBrowserCompat$SearchResultReceiver = new rsnAllocationSyncAll$MediaBrowserCompat$ItemReceiver(this, (byte) 0);
        this.RatingCompat.MediaBrowserCompat$CustomActionResultReceiver();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        this.MediaMetadataCompat.writeLock().lock();
        try {
            this.MediaBrowserCompat$SearchResultReceiver.cancel(true);
            this.MediaBrowserCompat$SearchResultReceiver = new rsnAllocationSyncAll$MediaBrowserCompat$ItemReceiver(this, (byte) 0);
            if (Build.VERSION.SDK_INT < 11) {
                this.MediaBrowserCompat$SearchResultReceiver.execute(new Float[]{Float.valueOf(this.MediaBrowserCompat$MediaItem.getCameraPosition().zoom)});
            } else {
                this.MediaBrowserCompat$SearchResultReceiver.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Float[]{Float.valueOf(this.MediaBrowserCompat$MediaItem.getCameraPosition().zoom)});
            }
        } finally {
            this.MediaMetadataCompat.writeLock().unlock();
        }
    }

    public final void onCameraIdle() {
        rsnContextSetPriority<T> rsncontextsetpriority = this.RatingCompat;
        if (rsncontextsetpriority instanceof GoogleMap.OnCameraIdleListener) {
            ((GoogleMap.OnCameraIdleListener) rsncontextsetpriority).onCameraIdle();
        }
        this.MediaBrowserCompat$MediaItem.getCameraPosition();
        CameraPosition cameraPosition = this.MediaSessionCompat$Token;
        if (cameraPosition == null || cameraPosition.zoom != this.MediaBrowserCompat$MediaItem.getCameraPosition().zoom) {
            this.MediaSessionCompat$Token = this.MediaBrowserCompat$MediaItem.getCameraPosition();
            MediaBrowserCompat$CustomActionResultReceiver();
        }
    }

    public final void onInfoWindowClick(Marker marker) {
        this.IconCompatParcelizer.onInfoWindowClick(marker);
    }

    public final boolean onMarkerClick(Marker marker) {
        return this.IconCompatParcelizer.onMarkerClick(marker);
    }
}
