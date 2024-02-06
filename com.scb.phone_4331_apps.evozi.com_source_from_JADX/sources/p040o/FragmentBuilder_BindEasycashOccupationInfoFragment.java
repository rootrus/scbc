package p040o;

import android.content.Context;
import android.content.pm.PackageManager;
import com.scottyab.rootbeer.RootBeerNative;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;
import okhttp3.internal.cache.DiskLruCache;

/* renamed from: o.FragmentBuilder_BindEasycashOccupationInfoFragment */
public final class FragmentBuilder_BindEasycashOccupationInfoFragment {
    private final Context MediaBrowserCompat$ItemReceiver;
    private boolean write = true;

    public FragmentBuilder_BindEasycashOccupationInfoFragment(Context context) {
        this.MediaBrowserCompat$ItemReceiver = context;
    }

    public static boolean MediaBrowserCompat$ItemReceiver() {
        return MediaBrowserCompat$ItemReceiver("magisk");
    }

    public static boolean MediaBrowserCompat$ItemReceiver(String str) {
        boolean z = false;
        for (String str2 : FragmentBuilder_BindEasycashIssuerLandingFragment.read()) {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(str);
            String obj = sb.toString();
            if (new File(str2, str).exists()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(obj);
                sb2.append(" binary detected!");
                AlertController$RecycleListView.IconCompatParcelizer((Object) sb2.toString());
                z = true;
            }
        }
        return z;
    }

    private static String[] MediaDescriptionCompat() {
        try {
            InputStream inputStream = Runtime.getRuntime().exec("getprop").getInputStream();
            if (inputStream == null) {
                return null;
            }
            return new Scanner(inputStream).useDelimiter("\\A").next().split("\n");
        } catch (IOException | NoSuchElementException e) {
            e.printStackTrace();
            return null;
        }
    }

    private static String[] MediaBrowserCompat$MediaItem() {
        try {
            InputStream inputStream = Runtime.getRuntime().exec("mount").getInputStream();
            if (inputStream == null) {
                return null;
            }
            return new Scanner(inputStream).useDelimiter("\\A").next().split("\n");
        } catch (IOException | NoSuchElementException e) {
            e.printStackTrace();
            return null;
        }
    }

    public final boolean IconCompatParcelizer(List<String> list) {
        PackageManager packageManager = this.MediaBrowserCompat$ItemReceiver.getPackageManager();
        boolean z = false;
        for (String next : list) {
            try {
                packageManager.getPackageInfo(next, 0);
                StringBuilder sb = new StringBuilder();
                sb.append(next);
                sb.append(" ROOT management app detected!");
                AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Object) sb.toString());
                z = true;
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return z;
    }

    public static boolean read() {
        HashMap hashMap = new HashMap();
        hashMap.put("ro.debuggable", DiskLruCache.VERSION_1);
        hashMap.put("ro.secure", "0");
        String[] MediaDescriptionCompat = MediaDescriptionCompat();
        if (MediaDescriptionCompat == null) {
            return false;
        }
        boolean z = false;
        for (String str : MediaDescriptionCompat) {
            for (String str2 : hashMap.keySet()) {
                if (str.contains(str2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("[");
                    sb.append((String) hashMap.get(str2));
                    sb.append("]");
                    String obj = sb.toString();
                    if (str.contains(obj)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(str2);
                        sb2.append(" = ");
                        sb2.append(obj);
                        sb2.append(" detected!");
                        AlertController$RecycleListView.IconCompatParcelizer((Object) sb2.toString());
                        z = true;
                    }
                }
            }
        }
        return z;
    }

    public static boolean IconCompatParcelizer() {
        String[] MediaBrowserCompat$MediaItem = MediaBrowserCompat$MediaItem();
        int i = 0;
        if (MediaBrowserCompat$MediaItem == null) {
            return false;
        }
        int length = MediaBrowserCompat$MediaItem.length;
        int i2 = 0;
        boolean z = false;
        while (i2 < length) {
            String str = MediaBrowserCompat$MediaItem[i2];
            String[] split = str.split(" ");
            if (split.length < 4) {
                StringBuilder sb = new StringBuilder();
                sb.append("Error formatting mount line: ");
                sb.append(str);
                AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Object) sb.toString());
            } else {
                String str2 = split[1];
                String str3 = split[3];
                String[] strArr = FragmentBuilder_BindEasycashIssuerLandingFragment.MediaBrowserCompat$CustomActionResultReceiver;
                int length2 = strArr.length;
                int i3 = i;
                while (i3 < length2) {
                    String str4 = strArr[i3];
                    if (str2.equalsIgnoreCase(str4)) {
                        String[] split2 = str3.split(",");
                        int length3 = split2.length;
                        int i4 = i;
                        while (true) {
                            if (i4 >= length3) {
                                break;
                            } else if (split2[i4].equalsIgnoreCase("rw")) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(str4);
                                sb2.append(" path is mounted with rw permissions! ");
                                sb2.append(str);
                                AlertController$RecycleListView.IconCompatParcelizer((Object) sb2.toString());
                                z = true;
                                break;
                            } else {
                                i4++;
                            }
                        }
                    }
                    i3++;
                    i = 0;
                }
            }
            i2++;
            i = 0;
        }
        return z;
    }

    public static boolean MediaBrowserCompat$CustomActionResultReceiver() {
        boolean z = false;
        Process process = null;
        try {
            Process exec = Runtime.getRuntime().exec(new String[]{"which", "su"});
            if (new BufferedReader(new InputStreamReader(exec.getInputStream())).readLine() != null) {
                z = true;
            }
            if (exec != null) {
                exec.destroy();
            }
            return z;
        } catch (Throwable unused) {
            if (process != null) {
                process.destroy();
            }
            return false;
        }
    }

    public final boolean write() {
        new RootBeerNative();
        if (!RootBeerNative.MediaBrowserCompat$CustomActionResultReceiver()) {
            AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Object) "We could not load the native library to test for root");
            return false;
        }
        String[] read = FragmentBuilder_BindEasycashIssuerLandingFragment.read();
        int length = read.length;
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(read[i]);
            sb.append("su");
            strArr[i] = sb.toString();
        }
        RootBeerNative rootBeerNative = new RootBeerNative();
        try {
            rootBeerNative.setLogDebugMessages(this.write);
            if (rootBeerNative.checkForRoot(strArr) > 0) {
                return true;
            }
            return false;
        } catch (UnsatisfiedLinkError unused) {
            return false;
        }
    }
}
