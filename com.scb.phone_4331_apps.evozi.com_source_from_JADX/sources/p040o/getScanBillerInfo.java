package p040o;

import android.view.View;

/* renamed from: o.getScanBillerInfo */
public final /* synthetic */ class getScanBillerInfo implements View.OnClickListener {
    private final /* synthetic */ FragmentBuilder_BindCategoriesListFragment MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ int write;

    public /* synthetic */ getScanBillerInfo(FragmentBuilder_BindCategoriesListFragment fragmentBuilder_BindCategoriesListFragment, int i) {
        this.MediaBrowserCompat$ItemReceiver = fragmentBuilder_BindCategoriesListFragment;
        this.write = i;
    }

    public final void onClick(View view) {
        this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(Integer.valueOf(this.write));
    }
}
