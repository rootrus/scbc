package p040o;

import com.scb.phone.view.activity.ntb.touchpoint.TouchPointLivenessCheckActivity;
import java.util.Arrays;

/* renamed from: o.getSpans */
public final class getSpans {
    private static final String[] read = {"android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"};

    public static final void IconCompatParcelizer(TouchPointLivenessCheckActivity touchPointLivenessCheckActivity) {
        onGetStartedClick.write((Object) touchPointLivenessCheckActivity, "$this$preScanWithPermissionCheck");
        String[] strArr = read;
        if (ProxySourceAdapter$ItemViewHolder.MediaBrowserCompat$ItemReceiver(touchPointLivenessCheckActivity, (String[]) Arrays.copyOf(strArr, strArr.length))) {
            touchPointLivenessCheckActivity.AppCompatDelegateImpl$ListMenuDecorView();
        } else {
            AppCompatRatingBar.write(touchPointLivenessCheckActivity, read, 62);
        }
    }

    public static final void IconCompatParcelizer(TouchPointLivenessCheckActivity touchPointLivenessCheckActivity, int i, int[] iArr) {
        onGetStartedClick.write((Object) touchPointLivenessCheckActivity, "$this$onRequestPermissionsResult");
        onGetStartedClick.write((Object) iArr, "grantResults");
        if (i != 62) {
            return;
        }
        if (ProxySourceAdapter$ItemViewHolder.write(Arrays.copyOf(iArr, iArr.length))) {
            touchPointLivenessCheckActivity.AppCompatDelegateImpl$ListMenuDecorView();
            return;
        }
        String[] strArr = read;
        if (!ProxySourceAdapter$ItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(touchPointLivenessCheckActivity, (String[]) Arrays.copyOf(strArr, strArr.length))) {
            touchPointLivenessCheckActivity.MediaSessionCompat$QueueItem();
        } else {
            touchPointLivenessCheckActivity.MediaSessionCompat$ResultReceiverWrapper();
        }
    }
}
