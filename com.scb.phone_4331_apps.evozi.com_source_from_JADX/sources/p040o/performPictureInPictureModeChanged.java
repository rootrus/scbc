package p040o;

import android.util.Log;
import com.bumptech.glide.Registry;
import java.util.Collections;
import java.util.List;
import p040o.onCreateOptionsMenu;
import p040o.onResume;

/* renamed from: o.performPictureInPictureModeChanged */
final class performPictureInPictureModeChanged implements onResume, onCreateOptionsMenu.IconCompatParcelizer<Object>, onResume.read {
    private Object IconCompatParcelizer;
    private volatile C1536x6a517a85<?> MediaBrowserCompat$CustomActionResultReceiver;
    private int MediaBrowserCompat$ItemReceiver;
    private onViewStateRestored MediaMetadataCompat;
    private performActivityCreated RatingCompat;
    private final peekChildFragmentManager<?> read;
    private final onResume.read write;

    performPictureInPictureModeChanged(peekChildFragmentManager<?> peekchildfragmentmanager, onResume.read read2) {
        this.read = peekchildfragmentmanager;
        this.write = read2;
    }

    /* JADX INFO: finally extract failed */
    public final boolean write() {
        Object obj = this.IconCompatParcelizer;
        if (obj != null) {
            this.IconCompatParcelizer = null;
            long MediaBrowserCompat$ItemReceiver2 = AudioAttributesCompatParcelizer.MediaBrowserCompat$ItemReceiver();
            try {
                isInLayout<?> write2 = this.read.write.MediaMetadataCompat.MediaBrowserCompat$CustomActionResultReceiver.write(obj.getClass());
                if (write2 != null) {
                    onViewCreated onviewcreated = new onViewCreated(write2, obj, this.read.MediaDescriptionCompat);
                    this.RatingCompat = new performActivityCreated(this.MediaBrowserCompat$CustomActionResultReceiver.read, this.read.f2615x50fd9e4a);
                    this.read.MediaBrowserCompat$ItemReceiver.write().write(this.RatingCompat, onviewcreated);
                    if (Log.isLoggable("SourceGenerator", 2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Finished encoding source to cache, key: ");
                        sb.append(this.RatingCompat);
                        sb.append(", data: ");
                        sb.append(obj);
                        sb.append(", encoder: ");
                        sb.append(write2);
                        sb.append(", duration: ");
                        sb.append(AudioAttributesCompatParcelizer.write(MediaBrowserCompat$ItemReceiver2));
                        Log.v("SourceGenerator", sb.toString());
                    }
                    this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver.read();
                    this.MediaMetadataCompat = new onViewStateRestored(Collections.singletonList(this.MediaBrowserCompat$CustomActionResultReceiver.read), this.read, this);
                } else {
                    throw new Registry.NoSourceEncoderAvailableException(obj.getClass());
                }
            } catch (Throwable th) {
                this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver.read();
                throw th;
            }
        }
        onViewStateRestored onviewstaterestored = this.MediaMetadataCompat;
        if (onviewstaterestored != null && onviewstaterestored.write()) {
            return true;
        }
        this.MediaMetadataCompat = null;
        this.MediaBrowserCompat$CustomActionResultReceiver = null;
        boolean z = false;
        while (!z && MediaBrowserCompat$ItemReceiver()) {
            List<C1536x6a517a85<?>> IconCompatParcelizer2 = this.read.IconCompatParcelizer();
            int i = this.MediaBrowserCompat$ItemReceiver;
            this.MediaBrowserCompat$ItemReceiver = i + 1;
            this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer2.get(i);
            if (this.MediaBrowserCompat$CustomActionResultReceiver != null && (this.read.read.read(this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver()) || this.read.IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver.write()))) {
                this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(this.read.RatingCompat, this);
                z = true;
            }
        }
        return z;
    }

    private boolean MediaBrowserCompat$ItemReceiver() {
        return this.MediaBrowserCompat$ItemReceiver < this.read.IconCompatParcelizer().size();
    }

    public final void read() {
        C1536x6a517a85<?> setsharedelemententertransition_mediabrowsercompat_customactionresultreceiver = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (setsharedelemententertransition_mediabrowsercompat_customactionresultreceiver != null) {
            setsharedelemententertransition_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver();
        }
    }

    public final void read(Object obj) {
        performCreate performcreate = this.read.read;
        if (obj == null || !performcreate.read(this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver())) {
            this.write.read(this.MediaBrowserCompat$CustomActionResultReceiver.read, obj, this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver, this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(), this.RatingCompat);
            return;
        }
        this.IconCompatParcelizer = obj;
        this.write.MediaBrowserCompat$CustomActionResultReceiver();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(Exception exc) {
        this.write.write(this.RatingCompat, exc, this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver, this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver());
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        throw new UnsupportedOperationException();
    }

    public final void read(isStateSaved isstatesaved, Object obj, onCreateOptionsMenu<?> oncreateoptionsmenu, isPostponed ispostponed, isStateSaved isstatesaved2) {
        this.write.read(isstatesaved, obj, oncreateoptionsmenu, this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(), isstatesaved);
    }

    public final void write(isStateSaved isstatesaved, Exception exc, onCreateOptionsMenu<?> oncreateoptionsmenu, isPostponed ispostponed) {
        this.write.write(isstatesaved, exc, oncreateoptionsmenu, this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver());
    }
}
