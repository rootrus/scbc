package p040o;

import android.app.Notification;
import android.os.Bundle;
import android.util.SparseArray;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.bouncycastle.i18n.MessageBundle;

/* renamed from: o.setPopupBackgroundDrawable */
class setPopupBackgroundDrawable {
    private static final Object IconCompatParcelizer = new Object();
    private static Field MediaBrowserCompat$CustomActionResultReceiver;
    private static final Object MediaBrowserCompat$ItemReceiver = new Object();
    private static boolean read;

    public static SparseArray<Bundle> MediaBrowserCompat$ItemReceiver(List<Bundle> list) {
        int size = list.size();
        SparseArray<Bundle> sparseArray = null;
        for (int i = 0; i < size; i++) {
            Bundle bundle = list.get(i);
            if (bundle != null) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                sparseArray.put(i, bundle);
            }
        }
        return sparseArray;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0048, code lost:
        return r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.os.Bundle write(android.app.Notification r6) {
        /*
            java.lang.Object r0 = IconCompatParcelizer
            monitor-enter(r0)
            boolean r1 = read     // Catch:{ all -> 0x005e }
            r2 = 0
            if (r1 == 0) goto L_0x000a
            monitor-exit(r0)
            return r2
        L_0x000a:
            r1 = 1
            java.lang.reflect.Field r3 = MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ IllegalAccessException -> 0x0052, NoSuchFieldException -> 0x0049 }
            if (r3 != 0) goto L_0x0033
            java.lang.Class<android.app.Notification> r3 = android.app.Notification.class
            java.lang.String r4 = "extras"
            java.lang.reflect.Field r3 = r3.getDeclaredField(r4)     // Catch:{ IllegalAccessException -> 0x0052, NoSuchFieldException -> 0x0049 }
            java.lang.Class<android.os.Bundle> r4 = android.os.Bundle.class
            java.lang.Class r5 = r3.getType()     // Catch:{ IllegalAccessException -> 0x0052, NoSuchFieldException -> 0x0049 }
            boolean r4 = r4.isAssignableFrom(r5)     // Catch:{ IllegalAccessException -> 0x0052, NoSuchFieldException -> 0x0049 }
            if (r4 != 0) goto L_0x002e
            java.lang.String r6 = "NotificationCompat"
            java.lang.String r3 = "Notification.extras field is not of type Bundle"
            android.util.Log.e(r6, r3)     // Catch:{ IllegalAccessException -> 0x0052, NoSuchFieldException -> 0x0049 }
            read = r1     // Catch:{ IllegalAccessException -> 0x0052, NoSuchFieldException -> 0x0049 }
            monitor-exit(r0)
            return r2
        L_0x002e:
            r3.setAccessible(r1)     // Catch:{ IllegalAccessException -> 0x0052, NoSuchFieldException -> 0x0049 }
            MediaBrowserCompat$CustomActionResultReceiver = r3     // Catch:{ IllegalAccessException -> 0x0052, NoSuchFieldException -> 0x0049 }
        L_0x0033:
            java.lang.reflect.Field r3 = MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ IllegalAccessException -> 0x0052, NoSuchFieldException -> 0x0049 }
            java.lang.Object r3 = r3.get(r6)     // Catch:{ IllegalAccessException -> 0x0052, NoSuchFieldException -> 0x0049 }
            android.os.Bundle r3 = (android.os.Bundle) r3     // Catch:{ IllegalAccessException -> 0x0052, NoSuchFieldException -> 0x0049 }
            if (r3 != 0) goto L_0x0047
            android.os.Bundle r3 = new android.os.Bundle     // Catch:{ IllegalAccessException -> 0x0052, NoSuchFieldException -> 0x0049 }
            r3.<init>()     // Catch:{ IllegalAccessException -> 0x0052, NoSuchFieldException -> 0x0049 }
            java.lang.reflect.Field r4 = MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ IllegalAccessException -> 0x0052, NoSuchFieldException -> 0x0049 }
            r4.set(r6, r3)     // Catch:{ IllegalAccessException -> 0x0052, NoSuchFieldException -> 0x0049 }
        L_0x0047:
            monitor-exit(r0)
            return r3
        L_0x0049:
            r6 = move-exception
            java.lang.String r3 = "NotificationCompat"
            java.lang.String r4 = "Unable to access notification extras"
            android.util.Log.e(r3, r4, r6)     // Catch:{ all -> 0x005e }
            goto L_0x005a
        L_0x0052:
            r6 = move-exception
            java.lang.String r3 = "NotificationCompat"
            java.lang.String r4 = "Unable to access notification extras"
            android.util.Log.e(r3, r4, r6)     // Catch:{ all -> 0x005e }
        L_0x005a:
            read = r1     // Catch:{ all -> 0x005e }
            monitor-exit(r0)
            return r2
        L_0x005e:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.setPopupBackgroundDrawable.write(android.app.Notification):android.os.Bundle");
    }

    public static Bundle write(Notification.Builder builder, setDropDownHorizontalOffset$MediaBrowserCompat$ItemReceiver setdropdownhorizontaloffset_mediabrowsercompat_itemreceiver) {
        builder.addAction(setdropdownhorizontaloffset_mediabrowsercompat_itemreceiver.write(), setdropdownhorizontaloffset_mediabrowsercompat_itemreceiver.MediaMetadataCompat(), setdropdownhorizontaloffset_mediabrowsercompat_itemreceiver.MediaBrowserCompat$CustomActionResultReceiver());
        Bundle bundle = new Bundle(setdropdownhorizontaloffset_mediabrowsercompat_itemreceiver.MediaBrowserCompat$ItemReceiver());
        if (setdropdownhorizontaloffset_mediabrowsercompat_itemreceiver.RatingCompat() != null) {
            bundle.putParcelableArray("android.support.remoteInputs", MediaBrowserCompat$CustomActionResultReceiver(setdropdownhorizontaloffset_mediabrowsercompat_itemreceiver.RatingCompat()));
        }
        if (setdropdownhorizontaloffset_mediabrowsercompat_itemreceiver.read() != null) {
            bundle.putParcelableArray("android.support.dataRemoteInputs", MediaBrowserCompat$CustomActionResultReceiver(setdropdownhorizontaloffset_mediabrowsercompat_itemreceiver.read()));
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", setdropdownhorizontaloffset_mediabrowsercompat_itemreceiver.IconCompatParcelizer());
        return bundle;
    }

    static Bundle IconCompatParcelizer(setDropDownHorizontalOffset$MediaBrowserCompat$ItemReceiver setdropdownhorizontaloffset_mediabrowsercompat_itemreceiver) {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        bundle2.putInt("icon", setdropdownhorizontaloffset_mediabrowsercompat_itemreceiver.write());
        bundle2.putCharSequence(MessageBundle.TITLE_ENTRY, setdropdownhorizontaloffset_mediabrowsercompat_itemreceiver.MediaMetadataCompat());
        bundle2.putParcelable("actionIntent", setdropdownhorizontaloffset_mediabrowsercompat_itemreceiver.MediaBrowserCompat$CustomActionResultReceiver());
        if (setdropdownhorizontaloffset_mediabrowsercompat_itemreceiver.MediaBrowserCompat$ItemReceiver() != null) {
            bundle = new Bundle(setdropdownhorizontaloffset_mediabrowsercompat_itemreceiver.MediaBrowserCompat$ItemReceiver());
        } else {
            bundle = new Bundle();
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", setdropdownhorizontaloffset_mediabrowsercompat_itemreceiver.IconCompatParcelizer());
        bundle2.putBundle("extras", bundle);
        bundle2.putParcelableArray("remoteInputs", MediaBrowserCompat$CustomActionResultReceiver(setdropdownhorizontaloffset_mediabrowsercompat_itemreceiver.RatingCompat()));
        bundle2.putBoolean("showsUserInterface", setdropdownhorizontaloffset_mediabrowsercompat_itemreceiver.MediaBrowserCompat$SearchResultReceiver());
        bundle2.putInt("semanticAction", setdropdownhorizontaloffset_mediabrowsercompat_itemreceiver.MediaDescriptionCompat());
        return bundle2;
    }

    private static Bundle read(C1133x65c1ec57 alertController$RecycleListView$MediaBrowserCompat$CustomActionResultReceiver) {
        Bundle bundle = new Bundle();
        bundle.putString("resultKey", alertController$RecycleListView$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$MediaItem);
        bundle.putCharSequence("label", alertController$RecycleListView$MediaBrowserCompat$CustomActionResultReceiver.MediaMetadataCompat);
        bundle.putCharSequenceArray("choices", alertController$RecycleListView$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver);
        bundle.putBoolean("allowFreeFormInput", alertController$RecycleListView$MediaBrowserCompat$CustomActionResultReceiver.read);
        bundle.putBundle("extras", alertController$RecycleListView$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer);
        Set<String> set = alertController$RecycleListView$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver;
        if (set != null && !set.isEmpty()) {
            ArrayList arrayList = new ArrayList(set.size());
            for (String add : set) {
                arrayList.add(add);
            }
            bundle.putStringArrayList("allowedDataTypes", arrayList);
        }
        return bundle;
    }

    private static Bundle[] MediaBrowserCompat$CustomActionResultReceiver(C1133x65c1ec57[] alertController$RecycleListView$MediaBrowserCompat$CustomActionResultReceiverArr) {
        if (alertController$RecycleListView$MediaBrowserCompat$CustomActionResultReceiverArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[alertController$RecycleListView$MediaBrowserCompat$CustomActionResultReceiverArr.length];
        for (int i = 0; i < alertController$RecycleListView$MediaBrowserCompat$CustomActionResultReceiverArr.length; i++) {
            bundleArr[i] = read(alertController$RecycleListView$MediaBrowserCompat$CustomActionResultReceiverArr[i]);
        }
        return bundleArr;
    }
}
