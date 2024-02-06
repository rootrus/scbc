package p040o;

import android.view.View;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p040o.FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment;
import p040o.MyECouponActivity_ViewBinding;

/* renamed from: o.FragmentBuilder_BindHmlBusinessURLInfoFragment */
public final class FragmentBuilder_BindHmlBusinessURLInfoFragment {
    private static Object MediaBrowserCompat$ItemReceiver = new Object();
    private static int read = FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.th_interaction_path_tag_key;
    private static int write = FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.th_ignore_interaction_tag_key;

    /* JADX WARNING: Removed duplicated region for block: B:13:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0092  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String MediaBrowserCompat$ItemReceiver(java.lang.Object r4, java.lang.Object r5) {
        /*
            if (r5 == 0) goto L_0x0098
            if (r4 == 0) goto L_0x0098
            android.view.View r5 = (android.view.View) r5
            android.content.Context r0 = r5.getContext()
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getSimpleName()
            int r5 = r5.getId()
            r1 = -1
            r2 = 1
            r3 = 0
            if (r1 == r5) goto L_0x0036
            android.content.res.Resources r0 = r0.getResources()     // Catch:{ NotFoundException -> 0x0031 }
            java.lang.String r5 = r0.getResourceEntryName(r5)     // Catch:{ NotFoundException -> 0x0031 }
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ NotFoundException -> 0x0031 }
            r0[r3] = r4     // Catch:{ NotFoundException -> 0x0031 }
            r0[r2] = r5     // Catch:{ NotFoundException -> 0x0031 }
            java.lang.String r5 = "/%1$s-%2$s"
            java.lang.String r4 = java.lang.String.format(r5, r0)     // Catch:{ NotFoundException -> 0x0031 }
            goto L_0x0040
        L_0x0031:
            java.lang.String r5 = "Generate Interaction path for view: Not found id"
            p040o.MyECouponActivity_ViewBinding.write(r5)
        L_0x0036:
            java.lang.Object[] r5 = new java.lang.Object[r2]
            r5[r3] = r4
            java.lang.String r4 = "/%1$s"
            java.lang.String r4 = java.lang.String.format(r4, r5)
        L_0x0040:
            r5 = 0
            if (r4 == 0) goto L_0x0092
            java.lang.String r0 = r4.trim()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0092
            java.lang.String r4 = r4.trim()
            java.lang.String r0 = "/\\S+"
            boolean r0 = r4.matches(r0)
            if (r0 != 0) goto L_0x007e
            java.lang.String r0 = ".+://\\S+/\\S+"
            boolean r0 = r4.matches(r0)
            if (r0 != 0) goto L_0x007e
            java.lang.String r0 = "/"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x007e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Interaction path should be in a valid format \"/loginInteraction\" or \"android://testTouchpoint/loginInteraction\". Yours: "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            p040o.MyECouponActivity_ViewBinding.write(r4)
            return r5
        L_0x007e:
            int r5 = r4.length()
            r0 = 2000(0x7d0, float:2.803E-42)
            if (r5 <= r0) goto L_0x0091
            o.MyECouponActivity_ViewBinding$write r5 = p040o.MyECouponActivity_ViewBinding.IconCompatParcelizer
            java.lang.String r1 = "Interaction path should be up to 2000 characters length."
            p040o.MyECouponActivity_ViewBinding.IconCompatParcelizer((p040o.MyECouponActivity_ViewBinding.write) r5, (java.lang.String) r1)
            java.lang.String r4 = r4.substring(r3, r0)
        L_0x0091:
            return r4
        L_0x0092:
            java.lang.String r4 = "Interaction path should not null or empty"
            p040o.MyECouponActivity_ViewBinding.write(r4)
            return r5
        L_0x0098:
            java.lang.String r4 = ""
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.FragmentBuilder_BindHmlBusinessURLInfoFragment.MediaBrowserCompat$ItemReceiver(java.lang.Object, java.lang.Object):java.lang.String");
    }

    public static String MediaBrowserCompat$CustomActionResultReceiver(Object obj) {
        Object tag;
        if (obj == null || (tag = ((View) obj).getTag(read)) == null) {
            return null;
        }
        return (String) tag;
    }

    static boolean write(View view) {
        return MediaBrowserCompat$ItemReceiver == view.getTag(write);
    }

    static String write(String str) {
        Matcher matcher = Pattern.compile("\\w+").matcher(str);
        StringBuilder sb = new StringBuilder();
        int i = 0;
        boolean z = false;
        while (matcher.find() && i < 50) {
            String group = matcher.group();
            int length = group.length();
            int i2 = 50 - i;
            if (i2 <= length) {
                length = i2;
            }
            sb.append(group, 0, length);
            i += length;
            z = true;
        }
        if (!z) {
            sb.append(String.format("interactionName_%1$s", new Object[]{new SimpleDateFormat("HH-mm-ss", Locale.US).format(Calendar.getInstance().getTime())}));
        }
        return sb.toString();
    }

    public static String IconCompatParcelizer(Object obj, Object obj2) {
        String str;
        Object tag;
        if (obj2 == null || (tag = ((View) obj2).getTag(read)) == null) {
            str = null;
        } else {
            str = (String) tag;
        }
        if (str != null) {
            return str;
        }
        String MediaBrowserCompat$ItemReceiver2 = MediaBrowserCompat$ItemReceiver(obj, obj2);
        ((View) obj2).setTag(read, MediaBrowserCompat$ItemReceiver2);
        MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.write;
        StringBuilder sb = new StringBuilder();
        sb.append("Interaction name ");
        sb.append(MediaBrowserCompat$ItemReceiver2);
        sb.append(" has been assigned to a view");
        MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
        return MediaBrowserCompat$ItemReceiver2;
    }
}
