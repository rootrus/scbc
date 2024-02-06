package androidx.versionedparcelable;

import android.os.Parcelable;
import androidx.lifecycle.ReportFragment;
import java.lang.reflect.InvocationTargetException;

public abstract class VersionedParcel {

    public static class ParcelException extends RuntimeException {
    }

    /* access modifiers changed from: protected */
    public abstract <T extends Parcelable> T IconCompatParcelizer();

    /* access modifiers changed from: protected */
    public abstract void IconCompatParcelizer(int i);

    /* access modifiers changed from: protected */
    public abstract void MediaBrowserCompat$CustomActionResultReceiver(int i);

    /* access modifiers changed from: protected */
    public abstract byte[] MediaBrowserCompat$CustomActionResultReceiver();

    /* access modifiers changed from: protected */
    public abstract int MediaBrowserCompat$ItemReceiver();

    /* access modifiers changed from: protected */
    public abstract void MediaBrowserCompat$ItemReceiver(byte[] bArr);

    /* access modifiers changed from: protected */
    public abstract String RatingCompat();

    /* access modifiers changed from: protected */
    public abstract void read();

    /* access modifiers changed from: protected */
    public abstract boolean read(int i);

    /* access modifiers changed from: protected */
    public abstract VersionedParcel write();

    /* access modifiers changed from: protected */
    public abstract void write(Parcelable parcelable);

    /* access modifiers changed from: protected */
    public abstract void write(String str);

    public final void IconCompatParcelizer(byte[] bArr) {
        IconCompatParcelizer(2);
        MediaBrowserCompat$ItemReceiver(bArr);
    }

    public final void write(int i, int i2) {
        IconCompatParcelizer(i2);
        MediaBrowserCompat$CustomActionResultReceiver(i);
    }

    public final void MediaBrowserCompat$ItemReceiver(String str) {
        IconCompatParcelizer(7);
        write(str);
    }

    public final void IconCompatParcelizer(Parcelable parcelable, int i) {
        IconCompatParcelizer(i);
        write(parcelable);
    }

    public final int read(int i, int i2) {
        if (!read(i2)) {
            return i;
        }
        return MediaBrowserCompat$ItemReceiver();
    }

    public final String read(String str) {
        if (!read(7)) {
            return str;
        }
        return RatingCompat();
    }

    public final byte[] read(byte[] bArr) {
        if (!read(2)) {
            return bArr;
        }
        return MediaBrowserCompat$CustomActionResultReceiver();
    }

    public final <T extends Parcelable> T write(T t, int i) {
        if (!read(i)) {
            return t;
        }
        return IconCompatParcelizer();
    }

    public final void IconCompatParcelizer(ReportFragment.write write) {
        IconCompatParcelizer(1);
        MediaBrowserCompat$ItemReceiver(write);
    }

    /* access modifiers changed from: protected */
    public final void MediaBrowserCompat$ItemReceiver(ReportFragment.write write) {
        if (write == null) {
            write((String) null);
            return;
        }
        try {
            write(write((Class<? extends ReportFragment.write>) write.getClass()).getName());
            VersionedParcel write2 = write();
            try {
                write((Class<? extends ReportFragment.write>) write.getClass()).getDeclaredMethod("write", new Class[]{write.getClass(), VersionedParcel.class}).invoke((Object) null, new Object[]{write, write2});
                write2.read();
            } catch (IllegalAccessException e) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e);
            } catch (InvocationTargetException e2) {
                if (e2.getCause() instanceof RuntimeException) {
                    throw ((RuntimeException) e2.getCause());
                }
                throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
            } catch (ClassNotFoundException e4) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
            }
        } catch (ClassNotFoundException e5) {
            StringBuilder sb = new StringBuilder();
            sb.append(write.getClass().getSimpleName());
            sb.append(" does not have a Parcelizer");
            throw new RuntimeException(sb.toString(), e5);
        }
    }

    public final <T extends ReportFragment.write> T write(T t) {
        if (!read(1)) {
            return t;
        }
        String RatingCompat = RatingCompat();
        if (RatingCompat == null) {
            return null;
        }
        return MediaBrowserCompat$CustomActionResultReceiver(RatingCompat, write());
    }

    /* access modifiers changed from: protected */
    public final <T extends ReportFragment.write> T MediaDescriptionCompat() {
        String RatingCompat = RatingCompat();
        if (RatingCompat == null) {
            return null;
        }
        return MediaBrowserCompat$CustomActionResultReceiver(RatingCompat, write());
    }

    private static <T extends ReportFragment.write> T MediaBrowserCompat$CustomActionResultReceiver(String str, VersionedParcel versionedParcel) {
        Class<VersionedParcel> cls = VersionedParcel.class;
        try {
            return (ReportFragment.write) Class.forName(str, true, cls.getClassLoader()).getDeclaredMethod("read", new Class[]{cls}).invoke((Object) null, new Object[]{versionedParcel});
        } catch (IllegalAccessException e) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e);
        } catch (InvocationTargetException e2) {
            if (e2.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e2.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
        }
    }

    private static Class write(Class<? extends ReportFragment.write> cls) throws ClassNotFoundException {
        return Class.forName(String.format("%s.%sParcelizer", new Object[]{cls.getPackage().getName(), cls.getSimpleName()}), false, cls.getClassLoader());
    }
}
