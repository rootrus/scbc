package p040o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import com.google.android.gms.common.api.Api;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import p040o.setFirstBaselineToTopHeight;
import p040o.setTabSelected;

/* renamed from: o.setDecorPadding */
class setDecorPadding {

    /* renamed from: o.setDecorPadding$read */
    interface read<T> {
        boolean MediaBrowserCompat$CustomActionResultReceiver(T t);

        int read(T t);
    }

    setDecorPadding() {
    }

    private static <T> T IconCompatParcelizer(T[] tArr, int i, read<T> read2) {
        int i2 = (i & 1) == 0 ? TitleChanger.DEFAULT_ANIMATION_DELAY : 700;
        boolean z = (i & 2) != 0;
        T t = null;
        int i3 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        for (T t2 : tArr) {
            int abs = (Math.abs(read2.read(t2) - i2) << 1) + (read2.MediaBrowserCompat$CustomActionResultReceiver(t2) == z ? 0 : 1);
            if (t == null || i3 > abs) {
                t = t2;
                i3 = abs;
            }
        }
        return t;
    }

    /* access modifiers changed from: protected */
    public setTabSelected.IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver(setTabSelected.IconCompatParcelizer[] iconCompatParcelizerArr, int i) {
        return (setTabSelected.IconCompatParcelizer) IconCompatParcelizer(iconCompatParcelizerArr, i, new read<setTabSelected.IconCompatParcelizer>() {
            /* renamed from: write */
            public int read(setTabSelected.IconCompatParcelizer iconCompatParcelizer) {
                return iconCompatParcelizer.read();
            }

            /* renamed from: MediaBrowserCompat$ItemReceiver */
            public boolean MediaBrowserCompat$CustomActionResultReceiver(setTabSelected.IconCompatParcelizer iconCompatParcelizer) {
                return iconCompatParcelizer.IconCompatParcelizer();
            }
        });
    }

    /* access modifiers changed from: protected */
    public Typeface MediaBrowserCompat$ItemReceiver(Context context, InputStream inputStream) {
        File write = DialogTitle.write(context);
        if (write == null) {
            return null;
        }
        try {
            if (!DialogTitle.write(write, inputStream)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(write.getPath());
            write.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            write.delete();
        }
    }

    public Typeface write(Context context, CancellationSignal cancellationSignal, setTabSelected.IconCompatParcelizer[] iconCompatParcelizerArr, int i) {
        InputStream inputStream;
        InputStream inputStream2 = null;
        if (iconCompatParcelizerArr.length <= 0) {
            return null;
        }
        try {
            inputStream = context.getContentResolver().openInputStream(MediaBrowserCompat$CustomActionResultReceiver(iconCompatParcelizerArr, i).MediaBrowserCompat$ItemReceiver());
            try {
                Typeface MediaBrowserCompat$ItemReceiver = MediaBrowserCompat$ItemReceiver(context, inputStream);
                DialogTitle.MediaBrowserCompat$ItemReceiver(inputStream);
                return MediaBrowserCompat$ItemReceiver;
            } catch (IOException unused) {
                DialogTitle.MediaBrowserCompat$ItemReceiver(inputStream);
                return null;
            } catch (Throwable th) {
                th = th;
                inputStream2 = inputStream;
                DialogTitle.MediaBrowserCompat$ItemReceiver(inputStream2);
                throw th;
            }
        } catch (IOException unused2) {
            inputStream = null;
            DialogTitle.MediaBrowserCompat$ItemReceiver(inputStream);
            return null;
        } catch (Throwable th2) {
            th = th2;
            DialogTitle.MediaBrowserCompat$ItemReceiver(inputStream2);
            throw th;
        }
    }

    private setFirstBaselineToTopHeight.read read(setFirstBaselineToTopHeight.write write, int i) {
        return (setFirstBaselineToTopHeight.read) IconCompatParcelizer(write.MediaBrowserCompat$CustomActionResultReceiver(), i, new read<setFirstBaselineToTopHeight.read>() {
            /* renamed from: MediaBrowserCompat$CustomActionResultReceiver */
            public int read(setFirstBaselineToTopHeight.read read) {
                return read.IconCompatParcelizer();
            }

            /* renamed from: read */
            public boolean MediaBrowserCompat$CustomActionResultReceiver(setFirstBaselineToTopHeight.read read) {
                return read.MediaBrowserCompat$SearchResultReceiver();
            }
        });
    }

    public Typeface MediaBrowserCompat$CustomActionResultReceiver(Context context, setFirstBaselineToTopHeight.write write, Resources resources, int i) {
        setFirstBaselineToTopHeight.read read2 = read(write, i);
        if (read2 == null) {
            return null;
        }
        return setTextMetricsParamsCompat.IconCompatParcelizer(context, resources, read2.read(), read2.MediaBrowserCompat$CustomActionResultReceiver(), i);
    }

    public Typeface MediaBrowserCompat$ItemReceiver(Context context, Resources resources, int i, String str, int i2) {
        File write = DialogTitle.write(context);
        if (write == null) {
            return null;
        }
        try {
            if (!DialogTitle.IconCompatParcelizer(write, resources, i)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(write.getPath());
            write.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            write.delete();
        }
    }
}
