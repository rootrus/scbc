package p040o;

import android.content.Context;
import android.net.ConnectivityManager;

/* renamed from: o.FragmentBuilder_OnboardingFatcaQuestionsFragment */
public final class FragmentBuilder_OnboardingFatcaQuestionsFragment implements UseCaseModule {
    private final ConnectivityManager read;

    public FragmentBuilder_OnboardingFatcaQuestionsFragment(Context context) {
        Object obj = null;
        Object systemService = context != null ? context.getSystemService("connectivity") : null;
        this.read = (ConnectivityManager) (systemService instanceof ConnectivityManager ? systemService : obj);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x002d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x002e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean read() {
        /*
            r5 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 0
            r2 = 0
            r3 = 1
            r4 = 23
            if (r0 < r4) goto L_0x0014
            android.net.ConnectivityManager r0 = r5.read
            if (r0 == 0) goto L_0x0012
            android.net.Network r0 = r0.getActiveNetwork()
            goto L_0x002b
        L_0x0012:
            r0 = r1
            goto L_0x002b
        L_0x0014:
            android.net.ConnectivityManager r0 = r5.read
            if (r0 == 0) goto L_0x001d
            android.net.Network[] r0 = r0.getAllNetworks()
            goto L_0x001e
        L_0x001d:
            r0 = r1
        L_0x001e:
            if (r0 == 0) goto L_0x0012
            int r4 = r0.length
            if (r4 != 0) goto L_0x0025
            r4 = r3
            goto L_0x0026
        L_0x0025:
            r4 = r2
        L_0x0026:
            r4 = r4 ^ r3
            if (r4 != r3) goto L_0x0012
            r0 = r0[r2]
        L_0x002b:
            if (r0 != 0) goto L_0x002e
            return r2
        L_0x002e:
            android.net.ConnectivityManager r4 = r5.read
            if (r4 == 0) goto L_0x0036
            android.net.NetworkCapabilities r1 = r4.getNetworkCapabilities(r0)
        L_0x0036:
            if (r1 == 0) goto L_0x005a
            boolean r0 = r1.hasTransport(r3)
            if (r0 != 0) goto L_0x0055
            boolean r0 = r1.hasTransport(r2)
            if (r0 != 0) goto L_0x0055
            r0 = 3
            boolean r0 = r1.hasTransport(r0)
            if (r0 != 0) goto L_0x0055
            r0 = 12
            boolean r0 = r1.hasCapability(r0)
            if (r0 != 0) goto L_0x0055
            r0 = r2
            goto L_0x0056
        L_0x0055:
            r0 = r3
        L_0x0056:
            if (r0 != 0) goto L_0x0059
            goto L_0x005a
        L_0x0059:
            r2 = r3
        L_0x005a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.FragmentBuilder_OnboardingFatcaQuestionsFragment.read():boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x002d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x002e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean MediaBrowserCompat$CustomActionResultReceiver() {
        /*
            r5 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 0
            r2 = 0
            r3 = 1
            r4 = 23
            if (r0 < r4) goto L_0x0014
            android.net.ConnectivityManager r0 = r5.read
            if (r0 == 0) goto L_0x0012
            android.net.Network r0 = r0.getActiveNetwork()
            goto L_0x002b
        L_0x0012:
            r0 = r2
            goto L_0x002b
        L_0x0014:
            android.net.ConnectivityManager r0 = r5.read
            if (r0 == 0) goto L_0x001d
            android.net.Network[] r0 = r0.getAllNetworks()
            goto L_0x001e
        L_0x001d:
            r0 = r2
        L_0x001e:
            if (r0 == 0) goto L_0x0012
            int r4 = r0.length
            if (r4 != 0) goto L_0x0025
            r4 = r3
            goto L_0x0026
        L_0x0025:
            r4 = r1
        L_0x0026:
            r4 = r4 ^ r3
            if (r4 != r3) goto L_0x0012
            r0 = r0[r1]
        L_0x002b:
            if (r0 != 0) goto L_0x002e
            return r1
        L_0x002e:
            android.net.ConnectivityManager r4 = r5.read
            if (r4 == 0) goto L_0x0036
            android.net.NetworkCapabilities r2 = r4.getNetworkCapabilities(r0)
        L_0x0036:
            if (r2 == 0) goto L_0x0040
            boolean r0 = r2.hasTransport(r3)
            if (r0 != 0) goto L_0x003f
            goto L_0x0040
        L_0x003f:
            r1 = r3
        L_0x0040:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.FragmentBuilder_OnboardingFatcaQuestionsFragment.MediaBrowserCompat$CustomActionResultReceiver():boolean");
    }
}
