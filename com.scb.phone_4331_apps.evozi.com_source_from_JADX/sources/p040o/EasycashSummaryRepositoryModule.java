package p040o;

import android.view.View;

/* renamed from: o.EasycashSummaryRepositoryModule */
public final /* synthetic */ class EasycashSummaryRepositoryModule implements View.OnClickListener {
    private final /* synthetic */ int MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ EasycashMCMCDetailRepositoryModule write;

    public /* synthetic */ EasycashSummaryRepositoryModule(EasycashMCMCDetailRepositoryModule easycashMCMCDetailRepositoryModule, int i) {
        this.write = easycashMCMCDetailRepositoryModule;
        this.MediaBrowserCompat$ItemReceiver = i;
    }

    public final void onClick(View view) {
        EasycashMCMCDetailRepositoryModule easycashMCMCDetailRepositoryModule = this.write;
        int i = this.MediaBrowserCompat$ItemReceiver;
        FragmentBuilder_BindBaseReplaceableFragment fragmentBuilder_BindBaseReplaceableFragment = easycashMCMCDetailRepositoryModule.read;
        if (fragmentBuilder_BindBaseReplaceableFragment != null) {
            fragmentBuilder_BindBaseReplaceableFragment.MediaBrowserCompat$CustomActionResultReceiver(i);
        }
    }
}
