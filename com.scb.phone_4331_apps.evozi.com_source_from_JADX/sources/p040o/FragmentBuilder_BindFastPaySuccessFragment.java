package p040o;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.LruCache;

/* renamed from: o.FragmentBuilder_BindFastPaySuccessFragment */
public final class FragmentBuilder_BindFastPaySuccessFragment implements FragmentBuilder_BindEditFavouriteFragment {
    private LruCache<String, IconCompatParcelizer> read;

    public FragmentBuilder_BindFastPaySuccessFragment(Context context) {
        this(FragmentBuilder_BindFundRedeemSearchListFragment.IconCompatParcelizer(context));
    }

    private FragmentBuilder_BindFastPaySuccessFragment(int i) {
        this.read = new LruCache<String, IconCompatParcelizer>(i) {
            /* access modifiers changed from: protected */
            public final /* bridge */ /* synthetic */ int sizeOf(Object obj, Object obj2) {
                return ((IconCompatParcelizer) obj2).MediaBrowserCompat$ItemReceiver;
            }
        };
    }

    public final Bitmap MediaBrowserCompat$CustomActionResultReceiver(String str) {
        IconCompatParcelizer iconCompatParcelizer = this.read.get(str);
        if (iconCompatParcelizer != null) {
            return iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver;
        }
        return null;
    }

    public final void write(String str, Bitmap bitmap) {
        if (str == null || bitmap == null) {
            throw new NullPointerException("key == null || bitmap == null");
        }
        int MediaBrowserCompat$ItemReceiver = FragmentBuilder_BindFundRedeemSearchListFragment.MediaBrowserCompat$ItemReceiver(bitmap);
        if (MediaBrowserCompat$ItemReceiver > this.read.maxSize()) {
            this.read.remove(str);
        } else {
            this.read.put(str, new IconCompatParcelizer(bitmap, MediaBrowserCompat$ItemReceiver));
        }
    }

    public final int RatingCompat() {
        return this.read.size();
    }

    public final int write() {
        return this.read.maxSize();
    }

    public final void MediaBrowserCompat$ItemReceiver(String str) {
        for (String next : this.read.snapshot().keySet()) {
            if (next.startsWith(str) && next.length() > str.length() && next.charAt(str.length()) == 10) {
                this.read.remove(next);
            }
        }
    }

    /* renamed from: o.FragmentBuilder_BindFastPaySuccessFragment$IconCompatParcelizer */
    static final class IconCompatParcelizer {
        final Bitmap MediaBrowserCompat$CustomActionResultReceiver;
        final int MediaBrowserCompat$ItemReceiver;

        IconCompatParcelizer(Bitmap bitmap, int i) {
            this.MediaBrowserCompat$CustomActionResultReceiver = bitmap;
            this.MediaBrowserCompat$ItemReceiver = i;
        }
    }
}
