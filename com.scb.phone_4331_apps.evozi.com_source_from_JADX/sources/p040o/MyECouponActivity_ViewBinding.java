package p040o;

import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.logging.HttpLoggingInterceptor;

/* renamed from: o.MyECouponActivity_ViewBinding */
public final class MyECouponActivity_ViewBinding {
    public static final write IconCompatParcelizer = new write("WEB_SERVICE", Level.INFO.intValue() + 1);
    public static final write MediaBrowserCompat$CustomActionResultReceiver = new write("DEBUG", Level.INFO.intValue() + 6);
    public static final write MediaBrowserCompat$ItemReceiver = new write("NONE", Level.INFO.intValue());
    private static final Logger MediaBrowserCompat$MediaItem = Logger.getLogger(MyECouponActivity_ViewBinding.class.getName());
    private static final write MediaBrowserCompat$SearchResultReceiver = new write("ERROR", Level.INFO.intValue() + 5);
    private static volatile write MediaDescriptionCompat = MediaBrowserCompat$ItemReceiver;
    public static final write read = new write("ALL", Level.INFO.intValue() + 4);
    public static final write write = new write("FRAMEWORK", Level.INFO.intValue() + 2);

    private MyECouponActivity_ViewBinding() {
    }

    private static String IconCompatParcelizer(FragmentBuilder_BindMerchantWalletSelectorFragment fragmentBuilder_BindMerchantWalletSelectorFragment) {
        return String.format("%s: %s", new Object[]{Integer.valueOf(fragmentBuilder_BindMerchantWalletSelectorFragment.IconCompatParcelizer()), fragmentBuilder_BindMerchantWalletSelectorFragment.MediaBrowserCompat$CustomActionResultReceiver()});
    }

    public static boolean IconCompatParcelizer(write write2, String str) {
        if (MediaDescriptionCompat != read && (MediaDescriptionCompat != write2 || MediaDescriptionCompat == MediaBrowserCompat$ItemReceiver)) {
            return false;
        }
        MediaBrowserCompat$MediaItem.log(write2, str);
        return true;
    }

    public static boolean write(write write2, FragmentBuilder_BindMerchantWalletSelectorFragment fragmentBuilder_BindMerchantWalletSelectorFragment) {
        if (MediaDescriptionCompat == read || (MediaDescriptionCompat == write2 && MediaDescriptionCompat != MediaBrowserCompat$ItemReceiver)) {
            return IconCompatParcelizer(write2, IconCompatParcelizer(fragmentBuilder_BindMerchantWalletSelectorFragment));
        }
        return false;
    }

    public static boolean write(String str) {
        MediaBrowserCompat$MediaItem.log(MediaBrowserCompat$SearchResultReceiver, str);
        return true;
    }

    public static boolean MediaBrowserCompat$CustomActionResultReceiver(FragmentBuilder_BindMerchantWalletSelectorFragment fragmentBuilder_BindMerchantWalletSelectorFragment) {
        MediaBrowserCompat$MediaItem.log(MediaBrowserCompat$SearchResultReceiver, IconCompatParcelizer(fragmentBuilder_BindMerchantWalletSelectorFragment));
        return true;
    }

    public static boolean IconCompatParcelizer(FragmentBuilder_BindMerchantWalletSelectorFragment fragmentBuilder_BindMerchantWalletSelectorFragment, Object... objArr) {
        try {
            MediaBrowserCompat$MediaItem.log(MediaBrowserCompat$SearchResultReceiver, AlertController$RecycleListView.read(fragmentBuilder_BindMerchantWalletSelectorFragment, objArr));
            return true;
        } catch (Exception e) {
            MediaBrowserCompat$MediaItem.log(MediaBrowserCompat$SearchResultReceiver, e.getMessage(), e);
            return true;
        }
    }

    public static void MediaBrowserCompat$ItemReceiver(Exception exc) {
        MediaBrowserCompat$MediaItem.log(MediaBrowserCompat$SearchResultReceiver, exc.getMessage());
        StackTraceElement[] stackTrace = exc.getStackTrace();
        for (StackTraceElement obj : stackTrace) {
            MediaBrowserCompat$MediaItem.log(MediaBrowserCompat$SearchResultReceiver, obj.toString());
        }
    }

    public static void read(Exception exc, FragmentBuilder_BindMerchantWalletSelectorFragment fragmentBuilder_BindMerchantWalletSelectorFragment) {
        MediaBrowserCompat$MediaItem.log(MediaBrowserCompat$SearchResultReceiver, IconCompatParcelizer(fragmentBuilder_BindMerchantWalletSelectorFragment));
        MediaBrowserCompat$ItemReceiver(exc);
    }

    @Deprecated
    public static void read(write write2) {
        MediaDescriptionCompat = write2;
        if (write2 == MediaBrowserCompat$CustomActionResultReceiver || MediaDescriptionCompat == read) {
            System.setProperty("kotlinx.coroutines.debug", "on");
            IconCompatParcelizer(write, "Turned on kotlin coroutines debug property");
        }
        write write3 = write;
        StringBuilder sb = new StringBuilder();
        sb.append("Log level switched to ");
        sb.append(MediaDescriptionCompat);
        IconCompatParcelizer(write3, sb.toString());
    }

    public static void IconCompatParcelizer(Exception exc) {
        MediaBrowserCompat$MediaItem.log(MediaBrowserCompat$SearchResultReceiver, exc.getMessage(), exc);
    }

    public static void IconCompatParcelizer(Throwable th) {
        MediaBrowserCompat$MediaItem.log(MediaBrowserCompat$SearchResultReceiver, th.getMessage(), th);
    }

    /* renamed from: o.MyECouponActivity_ViewBinding$write */
    public static class write extends Level {
        write(String str, int i) {
            super(str, i);
        }
    }

    public static void MediaBrowserCompat$CustomActionResultReceiver(FragmentBuilder_BindMerchantWalletSelectorFragment fragmentBuilder_BindMerchantWalletSelectorFragment, Object... objArr) {
        try {
            MediaBrowserCompat$MediaItem.log(MediaBrowserCompat$CustomActionResultReceiver, AlertController$RecycleListView.read(fragmentBuilder_BindMerchantWalletSelectorFragment, objArr));
        } catch (Exception e) {
            MediaBrowserCompat$MediaItem.log(MediaBrowserCompat$SearchResultReceiver, e.getMessage(), e);
        }
    }

    public static HttpLoggingInterceptor.Level MediaBrowserCompat$CustomActionResultReceiver() {
        write write2 = MediaDescriptionCompat;
        HttpLoggingInterceptor.Level level = HttpLoggingInterceptor.Level.NONE;
        if (MediaBrowserCompat$CustomActionResultReceiver.equals(write2)) {
            return HttpLoggingInterceptor.Level.BODY;
        }
        if (MediaBrowserCompat$SearchResultReceiver.equals(write2)) {
            return HttpLoggingInterceptor.Level.BASIC;
        }
        if (read.equals(write2)) {
            return HttpLoggingInterceptor.Level.BODY;
        }
        if (write.equals(write2)) {
            return HttpLoggingInterceptor.Level.BASIC;
        }
        return IconCompatParcelizer.equals(write2) ? HttpLoggingInterceptor.Level.BODY : level;
    }
}
