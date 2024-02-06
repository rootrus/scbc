package p040o;

import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: o.FragmentBuilder_BindEasycashIssuerLandingFragment */
public final class FragmentBuilder_BindEasycashIssuerLandingFragment {
    public static final String[] IconCompatParcelizer = {"com.koushikdutta.rommanager", "com.koushikdutta.rommanager.license", "com.dimonvideo.luckypatcher", "com.chelpus.lackypatch", "com.ramdroid.appquarantine", "com.ramdroid.appquarantinepro", "com.android.vending.billing.InAppBillingService.COIN", "com.chelpus.luckypatcher"};
    public static final String[] MediaBrowserCompat$CustomActionResultReceiver = {"/system", "/system/bin", "/system/sbin", "/system/xbin", "/vendor/bin", "/sbin", "/etc"};
    public static final String[] MediaBrowserCompat$ItemReceiver = {"com.noshufou.android.su", "com.noshufou.android.su.elite", "eu.chainfire.supersu", "com.koushikdutta.superuser", "com.thirdparty.superuser", "com.yellowes.su", "com.topjohnwu.magisk", "com.kingroot.kinguser", "com.kingo.root", "com.smedialink.oneclickroot", "com.zhiqupk.root.global", "com.alephzain.framaroot"};
    private static String[] read = {"/data/local/", "/data/local/bin/", "/data/local/xbin/", "/sbin/", "/su/bin/", "/system/bin/", "/system/bin/.ext/", "/system/bin/failsafe/", "/system/sd/xbin/", "/system/usr/we-need-root/", "/system/xbin/", "/cache/", "/data/", "/dev/"};

    static {
        new String[]{"com.devadvance.rootcloak", "com.devadvance.rootcloakplus", "de.robv.android.xposed.installer", "com.saurik.substrate", "com.zachspong.temprootremovejb", "com.amphoras.hidemyroot", "com.amphoras.hidemyrootadfree", "com.formyhm.hiderootPremium", "com.formyhm.hideroot"};
    }

    static String[] read() {
        ArrayList arrayList = new ArrayList(Arrays.asList(read));
        String str = System.getenv("PATH");
        if (str == null || "".equals(str)) {
            return (String[]) arrayList.toArray(new String[0]);
        }
        String[] split = str.split(":");
        int length = split.length;
        for (int i = 0; i < length; i++) {
            String str2 = split[i];
            if (!str2.endsWith("/")) {
                StringBuilder sb = new StringBuilder();
                sb.append(str2);
                sb.append('/');
                str2 = sb.toString();
            }
            if (!arrayList.contains(str2)) {
                arrayList.add(str2);
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }
}
