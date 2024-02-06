package p040o;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* renamed from: o.setPrinter */
public final class setPrinter implements Handler.Callback {
    int IconCompatParcelizer;
    final CheckParameters_MembersInjector MediaBrowserCompat$CustomActionResultReceiver;
    public Bitmap MediaBrowserCompat$ItemReceiver;
    public final isHidden MediaBrowserCompat$MediaItem;
    boolean MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private final Handler f2639x50fd9e4a;
    boolean MediaDescriptionCompat;
    int MediaMetadataCompat;
    private boolean MediaSessionCompat$QueueItem;
    write MediaSessionCompat$ResultReceiverWrapper;
    final hashCode MediaSessionCompat$Token;
    int ParcelableVolumeInfo;
    private getViewModelStore<Bitmap> PlaybackStateCompat$CustomAction;
    write RatingCompat;
    final List<setPrinter$MediaBrowserCompat$ItemReceiver> read;
    write write;

    private setPrinter(CheckParameters_MembersInjector checkParameters_MembersInjector, hashCode hashcode, isHidden ishidden, getViewModelStore<Bitmap> getviewmodelstore, onCreateAnimation<Bitmap> oncreateanimation, Bitmap bitmap) {
        this.read = new ArrayList();
        this.MediaSessionCompat$Token = hashcode;
        Handler handler = new Handler(Looper.getMainLooper(), this);
        this.MediaBrowserCompat$CustomActionResultReceiver = checkParameters_MembersInjector;
        this.f2639x50fd9e4a = handler;
        this.PlaybackStateCompat$CustomAction = getviewmodelstore;
        this.MediaBrowserCompat$MediaItem = ishidden;
        IconCompatParcelizer(oncreateanimation, bitmap);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [o.onCreateAnimation<android.graphics.Bitmap>, o.onCreateAnimation] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void IconCompatParcelizer(p040o.onCreateAnimation<android.graphics.Bitmap> r4, android.graphics.Bitmap r5) {
        /*
            r3 = this;
            java.lang.String r0 = "Argument must not be null"
            if (r4 == 0) goto L_0x0036
            if (r5 == 0) goto L_0x0030
            r0 = r5
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            r3.MediaBrowserCompat$ItemReceiver = r0
            o.getViewModelStore<android.graphics.Bitmap> r0 = r3.PlaybackStateCompat$CustomAction
            o.isReset r1 = new o.isReset
            r1.<init>()
            r2 = 1
            o.abandon r4 = r1.MediaBrowserCompat$CustomActionResultReceiver((p040o.onCreateAnimation<android.graphics.Bitmap>) r4, (boolean) r2)
            o.getViewModelStore r4 = r0.MediaBrowserCompat$ItemReceiver((p040o.abandon<?>) r4)
            r3.PlaybackStateCompat$CustomAction = r4
            int r4 = p040o.LinearLayoutManager.IconCompatParcelizer((android.graphics.Bitmap) r5)
            r3.IconCompatParcelizer = r4
            int r4 = r5.getWidth()
            r3.ParcelableVolumeInfo = r4
            int r4 = r5.getHeight()
            r3.MediaMetadataCompat = r4
            return
        L_0x0030:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException
            r4.<init>(r0)
            throw r4
        L_0x0036:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException
            r4.<init>(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.setPrinter.IconCompatParcelizer(o.onCreateAnimation, android.graphics.Bitmap):void");
    }

    /* access modifiers changed from: package-private */
    public final void write() {
        if (this.MediaBrowserCompat$SearchResultReceiver && !this.MediaSessionCompat$QueueItem) {
            write write2 = this.MediaSessionCompat$ResultReceiverWrapper;
            if (write2 != null) {
                this.MediaSessionCompat$ResultReceiverWrapper = null;
                IconCompatParcelizer(write2);
                return;
            }
            this.MediaSessionCompat$QueueItem = true;
            int MediaMetadataCompat2 = this.MediaBrowserCompat$MediaItem.MediaMetadataCompat();
            this.MediaBrowserCompat$MediaItem.IconCompatParcelizer();
            this.RatingCompat = new write(this.f2639x50fd9e4a, this.MediaBrowserCompat$MediaItem.read(), SystemClock.uptimeMillis() + ((long) MediaMetadataCompat2));
            getViewModelStore<Bitmap> MediaBrowserCompat$ItemReceiver2 = this.PlaybackStateCompat$CustomAction.MediaBrowserCompat$ItemReceiver((abandon<?>) (isReset) new isReset().IconCompatParcelizer((isStateSaved) new unregisterListener(Double.valueOf(Math.random()))));
            MediaBrowserCompat$ItemReceiver2.MediaBrowserCompat$ItemReceiver = this.MediaBrowserCompat$MediaItem;
            MediaBrowserCompat$ItemReceiver2.IconCompatParcelizer = true;
            MediaBrowserCompat$ItemReceiver2.MediaBrowserCompat$CustomActionResultReceiver(this.RatingCompat, (deliverCancellation<Bitmap>) null, MediaBrowserCompat$ItemReceiver2, AudioAttributesImplBaseParcelizer.write());
        }
    }

    private void IconCompatParcelizer(write write2) {
        this.MediaSessionCompat$QueueItem = false;
        if (this.MediaDescriptionCompat) {
            this.f2639x50fd9e4a.obtainMessage(2, write2).sendToTarget();
        } else if (!this.MediaBrowserCompat$SearchResultReceiver) {
            this.MediaSessionCompat$ResultReceiverWrapper = write2;
        } else {
            if (write2.IconCompatParcelizer != null) {
                Bitmap bitmap = this.MediaBrowserCompat$ItemReceiver;
                if (bitmap != null) {
                    this.MediaBrowserCompat$CustomActionResultReceiver.write(bitmap);
                    this.MediaBrowserCompat$ItemReceiver = null;
                }
                write write3 = this.write;
                this.write = write2;
                for (int size = this.read.size() - 1; size >= 0; size--) {
                    this.read.get(size).IconCompatParcelizer();
                }
                if (write3 != null) {
                    this.f2639x50fd9e4a.obtainMessage(2, write3).sendToTarget();
                }
            }
            write();
        }
    }

    /* renamed from: o.setPrinter$write */
    static class write extends onReset<Bitmap> {
        Bitmap IconCompatParcelizer;
        private final Handler MediaBrowserCompat$CustomActionResultReceiver;
        final int MediaBrowserCompat$ItemReceiver;
        private final long write;

        public final /* synthetic */ void MediaBrowserCompat$ItemReceiver(Object obj) {
            this.IconCompatParcelizer = (Bitmap) obj;
            this.MediaBrowserCompat$CustomActionResultReceiver.sendMessageAtTime(this.MediaBrowserCompat$CustomActionResultReceiver.obtainMessage(1, this), this.write);
        }

        write(Handler handler, int i, long j) {
            this.MediaBrowserCompat$CustomActionResultReceiver = handler;
            this.MediaBrowserCompat$ItemReceiver = i;
            this.write = j;
        }

        public final void write(Drawable drawable) {
            this.IconCompatParcelizer = null;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    setPrinter(com.bumptech.glide.Glide r8, p040o.isHidden r9, int r10, int r11, p040o.onCreateAnimation<android.graphics.Bitmap> r12, android.graphics.Bitmap r13) {
        /*
            r7 = this;
            o.CheckParameters_MembersInjector r1 = r8.MediaBrowserCompat$CustomActionResultReceiver
            o.getView r0 = r8.read
            android.content.Context r0 = r0.getBaseContext()
            o.hashCode r2 = com.bumptech.glide.Glide.MediaBrowserCompat$ItemReceiver(r0)
            o.getView r8 = r8.read
            android.content.Context r8 = r8.getBaseContext()
            o.hashCode r8 = com.bumptech.glide.Glide.MediaBrowserCompat$ItemReceiver(r8)
            o.getViewModelStore r8 = r8.read()
            o.performCreate r0 = p040o.performCreate.read
            o.isReset r3 = new o.isReset
            r3.<init>()
            o.abandon r0 = r3.MediaBrowserCompat$CustomActionResultReceiver((p040o.performCreate) r0)
            o.isReset r0 = (p040o.isReset) r0
            r3 = 1
            o.abandon r0 = r0.MediaBrowserCompat$CustomActionResultReceiver((boolean) r3)
            o.isReset r0 = (p040o.isReset) r0
            o.abandon r0 = r0.read((boolean) r3)
            o.isReset r0 = (p040o.isReset) r0
            o.abandon r10 = r0.read((int) r10, (int) r11)
            o.getViewModelStore r4 = r8.MediaBrowserCompat$ItemReceiver((p040o.abandon<?>) r10)
            r0 = r7
            r3 = r9
            r5 = r12
            r6 = r13
            r0.<init>((p040o.CheckParameters_MembersInjector) r1, (p040o.hashCode) r2, (p040o.isHidden) r3, (p040o.getViewModelStore<android.graphics.Bitmap>) r4, (p040o.onCreateAnimation<android.graphics.Bitmap>) r5, (android.graphics.Bitmap) r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.setPrinter.<init>(com.bumptech.glide.Glide, o.isHidden, int, int, o.onCreateAnimation, android.graphics.Bitmap):void");
    }

    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            IconCompatParcelizer((write) message.obj);
            return true;
        } else if (message.what != 2) {
            return false;
        } else {
            write write2 = (write) message.obj;
            hashCode hashcode = this.MediaSessionCompat$Token;
            if (write2 == null) {
                return false;
            }
            hashcode.MediaBrowserCompat$CustomActionResultReceiver(write2);
            return false;
        }
    }
}
