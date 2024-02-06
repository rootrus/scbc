package com.thunderhead.android.infrastructure.configuration;

import p040o.C7296xbf02ac7d;
import p040o.FragmentBuilder_BindSuitabilityQuestionsPart2Fragment;

/* renamed from: com.thunderhead.android.infrastructure.configuration.InvalidConfigurationAlertDialogActivity$MediaBrowserCompat$ItemReceiver */
final class C6232x15000030 implements C7296xbf02ac7d {
    private /* synthetic */ InvalidConfigurationAlertDialogActivity write;

    C6232x15000030(InvalidConfigurationAlertDialogActivity invalidConfigurationAlertDialogActivity) {
        this.write = invalidConfigurationAlertDialogActivity;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        if (!this.write.isFinishing()) {
            this.write.finish();
        }
        InvalidConfigurationAlertDialogActivity.IconCompatParcelizer(this.write).MediaBrowserCompat$ItemReceiver(FragmentBuilder_BindSuitabilityQuestionsPart2Fragment.read.read);
    }
}
