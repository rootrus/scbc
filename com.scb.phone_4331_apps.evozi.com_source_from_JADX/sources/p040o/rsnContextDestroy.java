package p040o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.TextView;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.maps.android.p003ui.SquareTextView;
import com.scb.phone.data.p033di.easycash.C1068xa4368296;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.bouncycastle.asn1.x509.DisplayText;
import p040o.IdCaptureBackActivity_MembersInjector;
import p040o.rsnAllocationRead1D;
import p040o.rsnAllocationSyncAll;
import p040o.setApplyingOpacityToLayersEnabled;

/* renamed from: o.rsnContextDestroy */
public class rsnContextDestroy<T extends IdCaptureBackActivity_MembersInjector> implements rsnContextSetPriority<T> {
    static final int[] MediaBrowserCompat$CustomActionResultReceiver = {10, 20, 50, 100, DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE, 500, 1000};
    /* access modifiers changed from: private */
    public static final TimeInterpolator MediaBrowserCompat$SearchResultReceiver = new DecelerateInterpolator();
    /* access modifiers changed from: private */
    public static final boolean MediaDescriptionCompat = (Build.VERSION.SDK_INT >= 11);
    /* access modifiers changed from: private */
    public Map<Marker, rsnClosureCreate<T>> AlertController$RecycleListView = new HashMap();
    private final rsnContextDestroy<T>.MediaItem AppCompatDialogFragment = new rsnContextDestroy$MediaBrowserCompat$MediaItem(this, (byte) 0);
    int IconCompatParcelizer = 4;
    /* access modifiers changed from: private */
    public final GoogleMap Keep;
    ShapeDrawable MediaBrowserCompat$ItemReceiver;
    /* access modifiers changed from: private */
    public boolean MediaBrowserCompat$MediaItem;
    /* access modifiers changed from: private */

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public Set<? extends rsnClosureCreate<T>> f2622x50fd9e4a;
    /* access modifiers changed from: private */
    public rsnAllocationSyncAll.read<T> MediaMetadataCompat;
    /* access modifiers changed from: private */
    public C1434x826de606<T> MediaSessionCompat$QueueItem;
    /* access modifiers changed from: private */
    public rsnAllocationSyncAll.write<T> MediaSessionCompat$ResultReceiverWrapper;
    /* access modifiers changed from: private */
    public Map<rsnClosureCreate<T>, Marker> MediaSessionCompat$Token = new HashMap();
    private final float ParcelableVolumeInfo;
    /* access modifiers changed from: private */
    public read<T> PlaybackStateCompat = new read<>((byte) 0);
    /* access modifiers changed from: private */
    public Set<rsnContextDestroy$MediaBrowserCompat$CustomActionResultReceiver> PlaybackStateCompat$CustomAction = Collections.newSetFromMap(new ConcurrentHashMap());
    /* access modifiers changed from: private */
    public final rsnAllocationSyncAll<T> RatingCompat;
    final setApplyingOpacityToLayersEnabled.write read;
    /* access modifiers changed from: private */
    public float setContentView;
    /* access modifiers changed from: private */
    public rsnAllocationSyncAll.IconCompatParcelizer<T> setHasDecor;
    SparseArray<BitmapDescriptor> write = new SparseArray<>();

    public void MediaBrowserCompat$ItemReceiver(T t, MarkerOptions markerOptions) {
    }

    public rsnContextDestroy(Context context, GoogleMap googleMap, rsnAllocationSyncAll<T> rsnallocationsyncall) {
        this.Keep = googleMap;
        this.MediaBrowserCompat$MediaItem = true;
        this.ParcelableVolumeInfo = context.getResources().getDisplayMetrics().density;
        setApplyingOpacityToLayersEnabled.write write2 = new setApplyingOpacityToLayersEnabled.write(context);
        this.read = write2;
        SquareTextView squareTextView = new SquareTextView(context);
        squareTextView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        squareTextView.setId(rsnAllocationRead1D.read.amu_text);
        int i = (int) (this.ParcelableVolumeInfo * 12.0f);
        squareTextView.setPadding(i, i, i, i);
        write2.IconCompatParcelizer.removeAllViews();
        write2.IconCompatParcelizer.addView(squareTextView);
        View findViewById = write2.IconCompatParcelizer.findViewById(rsnAllocationRead1D.read.amu_text);
        write2.write = findViewById instanceof TextView ? (TextView) findViewById : null;
        setApplyingOpacityToLayersEnabled.write write3 = this.read;
        int i2 = rsnAllocationRead1D.write.amu_ClusterIcon_TextAppearance;
        Context context2 = write3.MediaBrowserCompat$CustomActionResultReceiver;
        TextView textView = write3.write;
        if (textView != null) {
            textView.setTextAppearance(context2, i2);
        }
        setApplyingOpacityToLayersEnabled.write write4 = this.read;
        this.MediaBrowserCompat$ItemReceiver = new ShapeDrawable(new OvalShape());
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.getPaint().setColor(-2130706433);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable, this.MediaBrowserCompat$ItemReceiver});
        int i3 = (int) (this.ParcelableVolumeInfo * 3.0f);
        layerDrawable.setLayerInset(1, i3, i3, i3, i3);
        write4.IconCompatParcelizer(layerDrawable);
        this.RatingCompat = rsnallocationsyncall;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        this.RatingCompat.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver = new GoogleMap.OnMarkerClickListener() {
            public final boolean onMarkerClick(Marker marker) {
                if (rsnContextDestroy.this.MediaSessionCompat$ResultReceiverWrapper == null) {
                    return false;
                }
                rsnContextDestroy.this.MediaSessionCompat$ResultReceiverWrapper.MediaBrowserCompat$CustomActionResultReceiver((IdCaptureBackActivity_MembersInjector) rsnContextDestroy.this.PlaybackStateCompat.IconCompatParcelizer.get(marker));
                return false;
            }
        };
        this.RatingCompat.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer = new GoogleMap.OnInfoWindowClickListener() {
            public final void onInfoWindowClick(Marker marker) {
                if (rsnContextDestroy.this.setHasDecor != null) {
                    rsnAllocationSyncAll.IconCompatParcelizer unused = rsnContextDestroy.this.setHasDecor;
                    rsnContextDestroy.this.PlaybackStateCompat.IconCompatParcelizer.get(marker);
                }
            }
        };
        this.RatingCompat.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver = new GoogleMap.OnMarkerClickListener() {
            public final boolean onMarkerClick(Marker marker) {
                if (rsnContextDestroy.this.MediaMetadataCompat != null) {
                    rsnAllocationSyncAll.read MediaBrowserCompat$SearchResultReceiver = rsnContextDestroy.this.MediaMetadataCompat;
                    rsnContextDestroy.this.AlertController$RecycleListView.get(marker);
                    if (MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$CustomActionResultReceiver()) {
                        return true;
                    }
                }
                return false;
            }
        };
        this.RatingCompat.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer = new GoogleMap.OnInfoWindowClickListener() {
            public final void onInfoWindowClick(Marker marker) {
                if (rsnContextDestroy.this.MediaSessionCompat$QueueItem != null) {
                    C1434x826de606 unused = rsnContextDestroy.this.MediaSessionCompat$QueueItem;
                    rsnContextDestroy.this.AlertController$RecycleListView.get(marker);
                }
            }
        };
    }

    public final void read() {
        this.RatingCompat.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver = null;
        this.RatingCompat.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer = null;
        this.RatingCompat.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver = null;
        this.RatingCompat.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer = null;
    }

    public final void read(Set<? extends rsnClosureCreate<T>> set) {
        rsnContextDestroy<T>.MediaItem mediaItem = this.AppCompatDialogFragment;
        synchronized (mediaItem) {
            mediaItem.read = new rsnContextDestroy$MediaBrowserCompat$SearchResultReceiver(mediaItem.MediaBrowserCompat$CustomActionResultReceiver, set, (byte) 0);
        }
        mediaItem.sendEmptyMessage(0);
    }

    public final void IconCompatParcelizer(rsnAllocationSyncAll.read<T> read2) {
        this.MediaMetadataCompat = null;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(C1434x826de606<T> rsnallocationsyncall_mediabrowsercompat_customactionresultreceiver) {
        this.MediaSessionCompat$QueueItem = null;
    }

    public final void MediaBrowserCompat$ItemReceiver(rsnAllocationSyncAll.write<T> write2) {
        this.MediaSessionCompat$ResultReceiverWrapper = write2;
    }

    public final void MediaBrowserCompat$ItemReceiver(rsnAllocationSyncAll.IconCompatParcelizer<T> iconCompatParcelizer) {
        this.setHasDecor = null;
    }

    /* renamed from: o.rsnContextDestroy$write */
    class write extends Handler implements MessageQueue.IdleHandler {
        private final Condition IconCompatParcelizer;
        final Lock MediaBrowserCompat$ItemReceiver;
        private boolean MediaBrowserCompat$MediaItem;
        private Queue<Marker> MediaBrowserCompat$SearchResultReceiver;
        private Queue<rsnContextDestroy<T>.ItemReceiver> MediaDescriptionCompat;
        private Queue<Marker> MediaMetadataCompat;
        Queue<rsnContextDestroy<T>.IconCompatParcelizer> read;
        private Queue<rsnContextDestroy<T>.ItemReceiver> write;

        /* synthetic */ write(rsnContextDestroy rsncontextdestroy, byte b) {
            this();
        }

        private write() {
            super(Looper.getMainLooper());
            ReentrantLock reentrantLock = new ReentrantLock();
            this.MediaBrowserCompat$ItemReceiver = reentrantLock;
            this.IconCompatParcelizer = reentrantLock.newCondition();
            this.write = new LinkedList();
            this.MediaDescriptionCompat = new LinkedList();
            this.MediaMetadataCompat = new LinkedList();
            this.MediaBrowserCompat$SearchResultReceiver = new LinkedList();
            this.read = new LinkedList();
        }

        public final void read(boolean z, rsnContextDestroy<T>.ItemReceiver itemReceiver) {
            this.MediaBrowserCompat$ItemReceiver.lock();
            sendEmptyMessage(0);
            if (z) {
                this.MediaDescriptionCompat.add(itemReceiver);
            } else {
                this.write.add(itemReceiver);
            }
            this.MediaBrowserCompat$ItemReceiver.unlock();
        }

        public final void IconCompatParcelizer(boolean z, Marker marker) {
            this.MediaBrowserCompat$ItemReceiver.lock();
            sendEmptyMessage(0);
            if (z) {
                this.MediaBrowserCompat$SearchResultReceiver.add(marker);
            } else {
                this.MediaMetadataCompat.add(marker);
            }
            this.MediaBrowserCompat$ItemReceiver.unlock();
        }

        public final void read(rsnContextDestroy$MediaBrowserCompat$CustomActionResultReceiver rsncontextdestroy_mediabrowsercompat_customactionresultreceiver, LatLng latLng, LatLng latLng2) {
            this.MediaBrowserCompat$ItemReceiver.lock();
            this.read.add(new IconCompatParcelizer(rsnContextDestroy.this, rsncontextdestroy_mediabrowsercompat_customactionresultreceiver, latLng, latLng2, (byte) 0));
            this.MediaBrowserCompat$ItemReceiver.unlock();
        }

        public final void handleMessage(Message message) {
            if (!this.MediaBrowserCompat$MediaItem) {
                Looper.myQueue().addIdleHandler(this);
                this.MediaBrowserCompat$MediaItem = true;
            }
            removeMessages(0);
            this.MediaBrowserCompat$ItemReceiver.lock();
            int i = 0;
            while (i < 10) {
                try {
                    if (!this.MediaBrowserCompat$SearchResultReceiver.isEmpty()) {
                        read(this.MediaBrowserCompat$SearchResultReceiver.poll());
                    } else if (!this.read.isEmpty()) {
                        IconCompatParcelizer poll = this.read.poll();
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
                        ofFloat.setInterpolator(rsnContextDestroy.MediaBrowserCompat$SearchResultReceiver);
                        ofFloat.addUpdateListener(poll);
                        ofFloat.addListener(poll);
                        ofFloat.start();
                    } else if (!this.MediaDescriptionCompat.isEmpty()) {
                        rsnContextDestroy$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(this.MediaDescriptionCompat.poll(), this);
                    } else if (!this.write.isEmpty()) {
                        rsnContextDestroy$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(this.write.poll(), this);
                    } else if (!this.MediaMetadataCompat.isEmpty()) {
                        read(this.MediaMetadataCompat.poll());
                    }
                    i++;
                } catch (Throwable th) {
                    this.MediaBrowserCompat$ItemReceiver.unlock();
                    throw th;
                }
            }
            if (!MediaBrowserCompat$ItemReceiver()) {
                this.MediaBrowserCompat$MediaItem = false;
                Looper.myQueue().removeIdleHandler(this);
                this.IconCompatParcelizer.signalAll();
            } else {
                sendEmptyMessageDelayed(0, 10);
            }
            this.MediaBrowserCompat$ItemReceiver.unlock();
        }

        private void read(Marker marker) {
            rsnContextDestroy.this.MediaSessionCompat$Token.remove((rsnClosureCreate) rsnContextDestroy.this.AlertController$RecycleListView.get(marker));
            rsnContextDestroy.this.PlaybackStateCompat.IconCompatParcelizer(marker);
            rsnContextDestroy.this.AlertController$RecycleListView.remove(marker);
            rsnContextDestroy.this.RatingCompat.IconCompatParcelizer.write(marker);
        }

        private boolean MediaBrowserCompat$ItemReceiver() {
            try {
                this.MediaBrowserCompat$ItemReceiver.lock();
                return !this.write.isEmpty() || !this.MediaDescriptionCompat.isEmpty() || !this.MediaBrowserCompat$SearchResultReceiver.isEmpty() || !this.MediaMetadataCompat.isEmpty() || !this.read.isEmpty();
            } finally {
                this.MediaBrowserCompat$ItemReceiver.unlock();
            }
        }

        public final void read() {
            while (MediaBrowserCompat$ItemReceiver()) {
                sendEmptyMessage(0);
                this.MediaBrowserCompat$ItemReceiver.lock();
                try {
                    if (MediaBrowserCompat$ItemReceiver()) {
                        this.IconCompatParcelizer.await();
                    }
                    this.MediaBrowserCompat$ItemReceiver.unlock();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                } catch (Throwable th) {
                    this.MediaBrowserCompat$ItemReceiver.unlock();
                    throw th;
                }
            }
        }

        public final boolean queueIdle() {
            sendEmptyMessage(0);
            return true;
        }
    }

    /* renamed from: o.rsnContextDestroy$read */
    static class read<T> {
        Map<Marker, T> IconCompatParcelizer;
        Map<T, Marker> write;

        private read() {
            this.write = new HashMap();
            this.IconCompatParcelizer = new HashMap();
        }

        /* synthetic */ read(byte b) {
            this();
        }

        public final void IconCompatParcelizer(Marker marker) {
            T t = this.IconCompatParcelizer.get(marker);
            this.IconCompatParcelizer.remove(marker);
            this.write.remove(t);
        }
    }

    /* renamed from: o.rsnContextDestroy$IconCompatParcelizer */
    class IconCompatParcelizer extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {
        rsnAllocationRead2D IconCompatParcelizer;
        private final Marker MediaBrowserCompat$CustomActionResultReceiver;
        boolean MediaBrowserCompat$ItemReceiver;
        private final LatLng MediaMetadataCompat;
        private final rsnContextDestroy$MediaBrowserCompat$CustomActionResultReceiver read;
        private final LatLng write;

        /* synthetic */ IconCompatParcelizer(rsnContextDestroy rsncontextdestroy, rsnContextDestroy$MediaBrowserCompat$CustomActionResultReceiver rsncontextdestroy_mediabrowsercompat_customactionresultreceiver, LatLng latLng, LatLng latLng2, byte b) {
            this(rsncontextdestroy_mediabrowsercompat_customactionresultreceiver, latLng, latLng2);
        }

        private IconCompatParcelizer(rsnContextDestroy$MediaBrowserCompat$CustomActionResultReceiver rsncontextdestroy_mediabrowsercompat_customactionresultreceiver, LatLng latLng, LatLng latLng2) {
            this.read = rsncontextdestroy_mediabrowsercompat_customactionresultreceiver;
            this.MediaBrowserCompat$CustomActionResultReceiver = rsncontextdestroy_mediabrowsercompat_customactionresultreceiver.read;
            this.write = latLng;
            this.MediaMetadataCompat = latLng2;
        }

        public final void onAnimationEnd(Animator animator) {
            if (this.MediaBrowserCompat$ItemReceiver) {
                rsnContextDestroy.this.MediaSessionCompat$Token.remove((rsnClosureCreate) rsnContextDestroy.this.AlertController$RecycleListView.get(this.MediaBrowserCompat$CustomActionResultReceiver));
                rsnContextDestroy.this.PlaybackStateCompat.IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver);
                rsnContextDestroy.this.AlertController$RecycleListView.remove(this.MediaBrowserCompat$CustomActionResultReceiver);
                this.IconCompatParcelizer.write(this.MediaBrowserCompat$CustomActionResultReceiver);
            }
            this.read.write = this.MediaMetadataCompat;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float animatedFraction = valueAnimator.getAnimatedFraction();
            double d = this.MediaMetadataCompat.latitude;
            double d2 = this.write.latitude;
            double d3 = (double) animatedFraction;
            double d4 = this.write.latitude;
            double d5 = this.MediaMetadataCompat.longitude - this.write.longitude;
            if (Math.abs(d5) > 180.0d) {
                d5 -= Math.signum(d5) * 360.0d;
            }
            this.MediaBrowserCompat$CustomActionResultReceiver.setPosition(new LatLng(((d - d2) * d3) + d4, (d5 * d3) + this.write.longitude));
        }
    }

    static /* synthetic */ C1068xa4368296 IconCompatParcelizer(rsnContextDestroy rsncontextdestroy, List list, C1068xa4368296 easycashCardInfoRepositoryModule$MediaBrowserCompat$CustomActionResultReceiver) {
        C1068xa4368296 easycashCardInfoRepositoryModule$MediaBrowserCompat$CustomActionResultReceiver2 = null;
        if (list != null && !list.isEmpty()) {
            int MediaBrowserCompat$CustomActionResultReceiver2 = rsncontextdestroy.RatingCompat.read.MediaBrowserCompat$CustomActionResultReceiver();
            double d = (double) (MediaBrowserCompat$CustomActionResultReceiver2 * MediaBrowserCompat$CustomActionResultReceiver2);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C1068xa4368296 easycashCardInfoRepositoryModule$MediaBrowserCompat$CustomActionResultReceiver3 = (C1068xa4368296) it.next();
                double d2 = ((easycashCardInfoRepositoryModule$MediaBrowserCompat$CustomActionResultReceiver3.IconCompatParcelizer - easycashCardInfoRepositoryModule$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer) * (easycashCardInfoRepositoryModule$MediaBrowserCompat$CustomActionResultReceiver3.IconCompatParcelizer - easycashCardInfoRepositoryModule$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer)) + ((easycashCardInfoRepositoryModule$MediaBrowserCompat$CustomActionResultReceiver3.MediaBrowserCompat$ItemReceiver - easycashCardInfoRepositoryModule$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver) * (easycashCardInfoRepositoryModule$MediaBrowserCompat$CustomActionResultReceiver3.MediaBrowserCompat$ItemReceiver - easycashCardInfoRepositoryModule$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver));
                if (d2 < d) {
                    easycashCardInfoRepositoryModule$MediaBrowserCompat$CustomActionResultReceiver2 = easycashCardInfoRepositoryModule$MediaBrowserCompat$CustomActionResultReceiver3;
                    d = d2;
                }
            }
        }
        return easycashCardInfoRepositoryModule$MediaBrowserCompat$CustomActionResultReceiver2;
    }
}
