package p040o;

import android.content.Context;

/* renamed from: o.FragmentBuilder_BindScheduleListFragment$MediaBrowserCompat$ItemReceiver */
final class C6767x28d1f612 implements FragmentBuilder_BindSelectAccountFragment {
    public static final C6767x28d1f612 write = new C6767x28d1f612();

    C6767x28d1f612() {
    }

    public final Integer read(Context context) {
        int i;
        if (context == null || (i = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).icon) == 0) {
            return null;
        }
        return Integer.valueOf(i);
    }
}
