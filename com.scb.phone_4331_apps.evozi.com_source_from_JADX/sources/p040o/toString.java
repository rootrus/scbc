package p040o;

import android.os.Bundle;
import android.os.Looper;
import androidx.lifecycle.LiveData;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import p040o.sizeOf;

/* renamed from: o.toString */
final class toString extends sizeOf {
    static boolean read = false;
    private final maxSize MediaBrowserCompat$ItemReceiver;
    private final toString$MediaBrowserCompat$CustomActionResultReceiver write;

    /* renamed from: o.toString$read */
    static class read<D> implements putCount<D> {
        final sizeOf.IconCompatParcelizer<D> IconCompatParcelizer;
        final size<D> MediaBrowserCompat$CustomActionResultReceiver;
        boolean write = false;

        read(size<D> size, sizeOf.IconCompatParcelizer<D> iconCompatParcelizer) {
            this.MediaBrowserCompat$CustomActionResultReceiver = size;
            this.IconCompatParcelizer = iconCompatParcelizer;
        }

        public final void write(D d) {
            boolean z = toString.read;
            this.IconCompatParcelizer.onLoadFinished(this.MediaBrowserCompat$CustomActionResultReceiver, d);
            this.write = true;
        }

        public final String toString() {
            return this.IconCompatParcelizer.toString();
        }
    }

    toString(maxSize maxsize, trimToSize trimtosize) {
        this.MediaBrowserCompat$ItemReceiver = maxsize;
        this.write = toString$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(trimtosize);
    }

    /* JADX INFO: finally extract failed */
    private <D> size<D> IconCompatParcelizer(int i, Bundle bundle, sizeOf.IconCompatParcelizer<D> iconCompatParcelizer) {
        try {
            this.write.IconCompatParcelizer = true;
            size<D> onCreateLoader = iconCompatParcelizer.onCreateLoader(0, (Bundle) null);
            if (onCreateLoader != null) {
                if (onCreateLoader.getClass().isMemberClass()) {
                    if (!Modifier.isStatic(onCreateLoader.getClass().getModifiers())) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Object returned from onCreateLoader must not be a non-static inner member class: ");
                        sb.append(onCreateLoader);
                        throw new IllegalArgumentException(sb.toString());
                    }
                }
                toString$MediaBrowserCompat$ItemReceiver tostring_mediabrowsercompat_itemreceiver = new toString$MediaBrowserCompat$ItemReceiver(0, (Bundle) null, onCreateLoader, (size<D>) null);
                this.write.write.read(0, tostring_mediabrowsercompat_itemreceiver);
                this.write.IconCompatParcelizer = false;
                return tostring_mediabrowsercompat_itemreceiver.IconCompatParcelizer(this.MediaBrowserCompat$ItemReceiver, iconCompatParcelizer);
            }
            throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
        } catch (Throwable th) {
            this.write.IconCompatParcelizer = false;
            throw th;
        }
    }

    public final <D> size<D> read(sizeOf.IconCompatParcelizer<D> iconCompatParcelizer) {
        if (this.write.IconCompatParcelizer) {
            throw new IllegalStateException("Called while creating a loader");
        } else if (Looper.getMainLooper() == Looper.myLooper()) {
            toString$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$CustomActionResultReceiver = this.write.write.MediaBrowserCompat$CustomActionResultReceiver(0);
            if (MediaBrowserCompat$CustomActionResultReceiver == null) {
                return IconCompatParcelizer(0, (Bundle) null, iconCompatParcelizer);
            }
            return MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(this.MediaBrowserCompat$ItemReceiver, iconCompatParcelizer);
        } else {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
    }

    public final void IconCompatParcelizer() {
        toString$MediaBrowserCompat$CustomActionResultReceiver tostring_mediabrowsercompat_customactionresultreceiver = this.write;
        int MediaBrowserCompat$CustomActionResultReceiver = tostring_mediabrowsercompat_customactionresultreceiver.write.MediaBrowserCompat$CustomActionResultReceiver();
        for (int i = 0; i < MediaBrowserCompat$CustomActionResultReceiver; i++) {
            tostring_mediabrowsercompat_customactionresultreceiver.write.MediaBrowserCompat$SearchResultReceiver(i).MediaBrowserCompat$CustomActionResultReceiver();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, sb);
        sb.append("}}");
        return sb.toString();
    }

    @Deprecated
    public final void MediaBrowserCompat$CustomActionResultReceiver(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        toString$MediaBrowserCompat$CustomActionResultReceiver tostring_mediabrowsercompat_customactionresultreceiver = this.write;
        if (tostring_mediabrowsercompat_customactionresultreceiver.write.MediaBrowserCompat$CustomActionResultReceiver() > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("    ");
            String obj = sb.toString();
            for (int i = 0; i < tostring_mediabrowsercompat_customactionresultreceiver.write.MediaBrowserCompat$CustomActionResultReceiver(); i++) {
                toString$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$SearchResultReceiver = tostring_mediabrowsercompat_customactionresultreceiver.write.MediaBrowserCompat$SearchResultReceiver(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(tostring_mediabrowsercompat_customactionresultreceiver.write.IconCompatParcelizer(i));
                printWriter.print(": ");
                printWriter.println(MediaBrowserCompat$SearchResultReceiver.toString());
                printWriter.print(obj);
                printWriter.print("mId=");
                printWriter.print(MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$MediaItem);
                printWriter.print(" mArgs=");
                printWriter.println(MediaBrowserCompat$SearchResultReceiver.RatingCompat);
                printWriter.print(obj);
                printWriter.print("mLoader=");
                printWriter.println(MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$SearchResultReceiver);
                size<D> size = MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$SearchResultReceiver;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(obj);
                sb2.append("  ");
                size.dump(sb2.toString(), fileDescriptor, printWriter, strArr);
                if (MediaBrowserCompat$SearchResultReceiver.MediaDescriptionCompat != null) {
                    printWriter.print(obj);
                    printWriter.print("mCallbacks=");
                    printWriter.println(MediaBrowserCompat$SearchResultReceiver.MediaDescriptionCompat);
                    read<D> read2 = MediaBrowserCompat$SearchResultReceiver.MediaDescriptionCompat;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(obj);
                    sb3.append("  ");
                    printWriter.print(sb3.toString());
                    printWriter.print("mDeliveredData=");
                    printWriter.println(read2.write);
                }
                printWriter.print(obj);
                printWriter.print("mData=");
                size<D> size2 = MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$SearchResultReceiver;
                Object obj2 = MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$CustomActionResultReceiver;
                if (obj2 == LiveData.MediaBrowserCompat$ItemReceiver) {
                    obj2 = null;
                }
                printWriter.println(size2.dataToString(obj2));
                printWriter.print(obj);
                printWriter.print("mStarted=");
                printWriter.println(MediaBrowserCompat$SearchResultReceiver.write > 0);
            }
        }
    }
}
