package com.thunderhead.android.infrastructure.features.pokerchip;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import com.thunderhead.android.infrastructure.features.pokerchip.RequestDrawOverPermissionsActivity;
import p040o.onAccountSummaryClick$MediaBrowserCompat$ItemReceiver;

/* renamed from: com.thunderhead.android.infrastructure.features.pokerchip.RequestDrawOverPermissionsActivity$MediaBrowserCompat$ItemReceiver */
final class C6234x26bd7288 implements onAccountSummaryClick$MediaBrowserCompat$ItemReceiver {
    private /* synthetic */ RequestDrawOverPermissionsActivity MediaBrowserCompat$ItemReceiver;

    C6234x26bd7288(RequestDrawOverPermissionsActivity requestDrawOverPermissionsActivity) {
        this.MediaBrowserCompat$ItemReceiver = requestDrawOverPermissionsActivity;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        if (Build.VERSION.SDK_INT >= 23) {
            StringBuilder sb = new StringBuilder();
            sb.append("package:");
            sb.append(this.MediaBrowserCompat$ItemReceiver.getPackageName());
            Intent intent = new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse(sb.toString()));
            this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver = true;
            RequestDrawOverPermissionsActivity requestDrawOverPermissionsActivity = this.MediaBrowserCompat$ItemReceiver;
            RequestDrawOverPermissionsActivity.IconCompatParcelizer unused = RequestDrawOverPermissionsActivity.write;
            requestDrawOverPermissionsActivity.startActivityForResult(intent, 1000);
        }
    }
}
