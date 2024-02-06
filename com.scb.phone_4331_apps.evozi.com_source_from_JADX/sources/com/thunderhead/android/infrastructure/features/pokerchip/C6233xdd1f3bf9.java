package com.thunderhead.android.infrastructure.features.pokerchip;

import android.os.Build;
import android.provider.Settings;
import p040o.C6821x269f889b;
import p040o.C7296xbf02ac7d;
import p040o.FragmentBuilder_BindSuitabilityQuestionsPart2Fragment;

/* renamed from: com.thunderhead.android.infrastructure.features.pokerchip.RequestDrawOverPermissionsActivity$MediaBrowserCompat$CustomActionResultReceiver */
final class C6233xdd1f3bf9 implements C7296xbf02ac7d {
    private /* synthetic */ RequestDrawOverPermissionsActivity IconCompatParcelizer;

    C6233xdd1f3bf9(RequestDrawOverPermissionsActivity requestDrawOverPermissionsActivity) {
        this.IconCompatParcelizer = requestDrawOverPermissionsActivity;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        if (!this.IconCompatParcelizer.isFinishing() && !this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver) {
            if (Build.VERSION.SDK_INT >= 23 && !Settings.canDrawOverlays(this.IconCompatParcelizer)) {
                RequestDrawOverPermissionsActivity.read(this.IconCompatParcelizer).MediaBrowserCompat$ItemReceiver(FragmentBuilder_BindSuitabilityQuestionsPart2Fragment.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver);
            }
            RequestDrawOverPermissionsActivity.read(this.IconCompatParcelizer).MediaBrowserCompat$ItemReceiver(C6821x269f889b.read);
            this.IconCompatParcelizer.finish();
        }
    }
}
