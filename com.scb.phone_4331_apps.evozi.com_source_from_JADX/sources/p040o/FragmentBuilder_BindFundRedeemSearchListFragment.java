package p040o;

import android.app.ActivityManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.os.StatFs;
import android.provider.Settings;
import android.util.Log;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.ThreadFactory;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* renamed from: o.FragmentBuilder_BindFundRedeemSearchListFragment */
public final class FragmentBuilder_BindFundRedeemSearchListFragment {
    private static StringBuilder IconCompatParcelizer = new StringBuilder();
    private static final SCBUniversalWebViewActivity_ViewBinding read = SCBUniversalWebViewActivity_ViewBinding.MediaBrowserCompat$ItemReceiver("WEBP");
    private static final SCBUniversalWebViewActivity_ViewBinding write = SCBUniversalWebViewActivity_ViewBinding.MediaBrowserCompat$ItemReceiver("RIFF");

    static int MediaBrowserCompat$ItemReceiver(Bitmap bitmap) {
        int allocationByteCount = Build.VERSION.SDK_INT >= 19 ? bitmap.getAllocationByteCount() : bitmap.getByteCount();
        if (allocationByteCount >= 0) {
            return allocationByteCount;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Negative size: ");
        sb.append(bitmap);
        throw new IllegalStateException(sb.toString());
    }

    static <T> T MediaBrowserCompat$CustomActionResultReceiver(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    static String MediaBrowserCompat$ItemReceiver(FragmentBuilder_BindEbillSubscriptionReviewFragment fragmentBuilder_BindEbillSubscriptionReviewFragment) {
        return write(fragmentBuilder_BindEbillSubscriptionReviewFragment, "");
    }

    static String write(FragmentBuilder_BindEbillSubscriptionReviewFragment fragmentBuilder_BindEbillSubscriptionReviewFragment, String str) {
        StringBuilder sb = new StringBuilder(str);
        FragmentBuilder_BindEbillSubscriptionInputFragment fragmentBuilder_BindEbillSubscriptionInputFragment = fragmentBuilder_BindEbillSubscriptionReviewFragment.read;
        if (fragmentBuilder_BindEbillSubscriptionInputFragment != null) {
            sb.append(fragmentBuilder_BindEbillSubscriptionInputFragment.RatingCompat.write());
        }
        List<FragmentBuilder_BindEbillSubscriptionInputFragment> list = fragmentBuilder_BindEbillSubscriptionReviewFragment.MediaBrowserCompat$ItemReceiver;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (i > 0 || fragmentBuilder_BindEbillSubscriptionInputFragment != null) {
                    sb.append(", ");
                }
                sb.append(list.get(i).RatingCompat.write());
            }
        }
        return sb.toString();
    }

    public static void MediaBrowserCompat$ItemReceiver(String str, String str2, String str3) {
        MediaBrowserCompat$ItemReceiver(str, str2, str3, "");
    }

    public static void MediaBrowserCompat$ItemReceiver(String str, String str2, String str3, String str4) {
        Log.d("Picasso", String.format("%1$-11s %2$-12s %3$s %4$s", new Object[]{str, str2, str3, str4}));
    }

    static String IconCompatParcelizer(FragmentBuilder_BindFixedTransferInputFormFragment fragmentBuilder_BindFixedTransferInputFormFragment) {
        String write2 = write(fragmentBuilder_BindFixedTransferInputFormFragment, IconCompatParcelizer);
        IconCompatParcelizer.setLength(0);
        return write2;
    }

    static String write(FragmentBuilder_BindFixedTransferInputFormFragment fragmentBuilder_BindFixedTransferInputFormFragment, StringBuilder sb) {
        if (fragmentBuilder_BindFixedTransferInputFormFragment.f3141x50fd9e4a != null) {
            sb.ensureCapacity(fragmentBuilder_BindFixedTransferInputFormFragment.f3141x50fd9e4a.length() + 50);
            sb.append(fragmentBuilder_BindFixedTransferInputFormFragment.f3141x50fd9e4a);
        } else if (fragmentBuilder_BindFixedTransferInputFormFragment.AlertController$RecycleListView != null) {
            String obj = fragmentBuilder_BindFixedTransferInputFormFragment.AlertController$RecycleListView.toString();
            sb.ensureCapacity(obj.length() + 50);
            sb.append(obj);
        } else {
            sb.ensureCapacity(50);
            sb.append(fragmentBuilder_BindFixedTransferInputFormFragment.MediaBrowserCompat$SearchResultReceiver);
        }
        sb.append(10);
        if (fragmentBuilder_BindFixedTransferInputFormFragment.MediaSessionCompat$QueueItem != BitmapDescriptorFactory.HUE_RED) {
            sb.append("rotation:");
            sb.append(fragmentBuilder_BindFixedTransferInputFormFragment.MediaSessionCompat$QueueItem);
            if (fragmentBuilder_BindFixedTransferInputFormFragment.MediaBrowserCompat$CustomActionResultReceiver) {
                sb.append('@');
                sb.append(fragmentBuilder_BindFixedTransferInputFormFragment.MediaSessionCompat$ResultReceiverWrapper);
                sb.append('x');
                sb.append(fragmentBuilder_BindFixedTransferInputFormFragment.ParcelableVolumeInfo);
            }
            sb.append(10);
        }
        if ((fragmentBuilder_BindFixedTransferInputFormFragment.PlaybackStateCompat$CustomAction == 0 && fragmentBuilder_BindFixedTransferInputFormFragment.setHasDecor == 0) ? false : true) {
            sb.append("resize:");
            sb.append(fragmentBuilder_BindFixedTransferInputFormFragment.PlaybackStateCompat$CustomAction);
            sb.append('x');
            sb.append(fragmentBuilder_BindFixedTransferInputFormFragment.setHasDecor);
            sb.append(10);
        }
        if (fragmentBuilder_BindFixedTransferInputFormFragment.MediaBrowserCompat$ItemReceiver) {
            sb.append("centerCrop:");
            sb.append(fragmentBuilder_BindFixedTransferInputFormFragment.write);
            sb.append(10);
        } else if (fragmentBuilder_BindFixedTransferInputFormFragment.read) {
            sb.append("centerInside");
            sb.append(10);
        }
        if (fragmentBuilder_BindFixedTransferInputFormFragment.Keep != null) {
            int size = fragmentBuilder_BindFixedTransferInputFormFragment.Keep.size();
            for (int i = 0; i < size; i++) {
                sb.append(fragmentBuilder_BindFixedTransferInputFormFragment.Keep.get(i).MediaBrowserCompat$ItemReceiver());
                sb.append(10);
            }
        }
        return sb.toString();
    }

    static File MediaBrowserCompat$CustomActionResultReceiver(Context context) {
        File file = new File(context.getApplicationContext().getCacheDir(), "picasso-cache");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    static long read(File file) {
        long j;
        try {
            StatFs statFs = new StatFs(file.getAbsolutePath());
            j = ((Build.VERSION.SDK_INT < 18 ? (long) statFs.getBlockCount() : statFs.getBlockCountLong()) * (Build.VERSION.SDK_INT < 18 ? (long) statFs.getBlockSize() : statFs.getBlockSizeLong())) / 50;
        } catch (IllegalArgumentException unused) {
            j = 5242880;
        }
        return Math.max(Math.min(j, 52428800), 5242880);
    }

    static boolean write(Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            if (Build.VERSION.SDK_INT >= 17) {
                if (Settings.Global.getInt(contentResolver, "airplane_mode_on", 0) != 0) {
                    return true;
                }
                return false;
            } else if (Settings.System.getInt(contentResolver, "airplane_mode_on", 0) != 0) {
                return true;
            } else {
                return false;
            }
        } catch (NullPointerException | SecurityException unused) {
        }
    }

    static <T> T IconCompatParcelizer(Context context, String str) {
        return context.getSystemService(str);
    }

    static boolean read(Context context, String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }

    static boolean write(NsipPartnerPaymentOtpActivity nsipPartnerPaymentOtpActivity) throws IOException {
        return nsipPartnerPaymentOtpActivity.write(0, write) && nsipPartnerPaymentOtpActivity.write(8, read);
    }

    static int IconCompatParcelizer(Resources resources, FragmentBuilder_BindFixedTransferInputFormFragment fragmentBuilder_BindFixedTransferInputFormFragment) throws FileNotFoundException {
        if (fragmentBuilder_BindFixedTransferInputFormFragment.MediaBrowserCompat$SearchResultReceiver != 0 || fragmentBuilder_BindFixedTransferInputFormFragment.AlertController$RecycleListView == null) {
            return fragmentBuilder_BindFixedTransferInputFormFragment.MediaBrowserCompat$SearchResultReceiver;
        }
        String authority = fragmentBuilder_BindFixedTransferInputFormFragment.AlertController$RecycleListView.getAuthority();
        if (authority != null) {
            List<String> pathSegments = fragmentBuilder_BindFixedTransferInputFormFragment.AlertController$RecycleListView.getPathSegments();
            if (pathSegments == null || pathSegments.isEmpty()) {
                StringBuilder sb = new StringBuilder();
                sb.append("No path segments: ");
                sb.append(fragmentBuilder_BindFixedTransferInputFormFragment.AlertController$RecycleListView);
                throw new FileNotFoundException(sb.toString());
            } else if (pathSegments.size() == 1) {
                try {
                    return Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Last path segment is not a resource ID: ");
                    sb2.append(fragmentBuilder_BindFixedTransferInputFormFragment.AlertController$RecycleListView);
                    throw new FileNotFoundException(sb2.toString());
                }
            } else if (pathSegments.size() == 2) {
                return resources.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("More than two path segments: ");
                sb3.append(fragmentBuilder_BindFixedTransferInputFormFragment.AlertController$RecycleListView);
                throw new FileNotFoundException(sb3.toString());
            }
        } else {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("No package provided: ");
            sb4.append(fragmentBuilder_BindFixedTransferInputFormFragment.AlertController$RecycleListView);
            throw new FileNotFoundException(sb4.toString());
        }
    }

    static Resources MediaBrowserCompat$CustomActionResultReceiver(Context context, FragmentBuilder_BindFixedTransferInputFormFragment fragmentBuilder_BindFixedTransferInputFormFragment) throws FileNotFoundException {
        if (fragmentBuilder_BindFixedTransferInputFormFragment.MediaBrowserCompat$SearchResultReceiver != 0 || fragmentBuilder_BindFixedTransferInputFormFragment.AlertController$RecycleListView == null) {
            return context.getResources();
        }
        String authority = fragmentBuilder_BindFixedTransferInputFormFragment.AlertController$RecycleListView.getAuthority();
        if (authority != null) {
            try {
                return context.getPackageManager().getResourcesForApplication(authority);
            } catch (PackageManager.NameNotFoundException unused) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unable to obtain resources for package: ");
                sb.append(fragmentBuilder_BindFixedTransferInputFormFragment.AlertController$RecycleListView);
                throw new FileNotFoundException(sb.toString());
            }
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("No package provided: ");
            sb2.append(fragmentBuilder_BindFixedTransferInputFormFragment.AlertController$RecycleListView);
            throw new FileNotFoundException(sb2.toString());
        }
    }

    static void write(Looper looper) {
        C65354 r0 = new Handler(looper) {
            public final void handleMessage(Message message) {
                sendMessageDelayed(obtainMessage(), 1000);
            }
        };
        r0.sendMessageDelayed(r0.obtainMessage(), 1000);
    }

    /* renamed from: o.FragmentBuilder_BindFundRedeemSearchListFragment$IconCompatParcelizer */
    static class IconCompatParcelizer implements ThreadFactory {
        IconCompatParcelizer() {
        }

        public final Thread newThread(Runnable runnable) {
            return new read(runnable);
        }
    }

    /* renamed from: o.FragmentBuilder_BindFundRedeemSearchListFragment$read */
    static class read extends Thread {
        read(Runnable runnable) {
            super(runnable);
        }

        public final void run() {
            Process.setThreadPriority(10);
            super.run();
        }
    }

    static int IconCompatParcelizer(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        return (int) ((((long) ((context.getApplicationInfo().flags & PKIFailureInfo.badCertTemplate) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass())) * 1048576) / 7);
    }

    public static void read() {
        if (!(Looper.getMainLooper().getThread() == Thread.currentThread())) {
            throw new IllegalStateException("Method call should happen from the main thread.");
        }
    }

    static void write() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            throw new IllegalStateException("Method call should not happen from the main thread.");
        }
    }
}
