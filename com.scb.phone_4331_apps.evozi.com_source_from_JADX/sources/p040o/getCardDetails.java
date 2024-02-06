package p040o;

import android.view.View;

/* renamed from: o.getCardDetails */
public final /* synthetic */ class getCardDetails implements View.OnClickListener {
    private final /* synthetic */ FragmentBuilder_BindCategoriesListFragment IconCompatParcelizer;
    private final /* synthetic */ int write;

    public /* synthetic */ getCardDetails(FragmentBuilder_BindCategoriesListFragment fragmentBuilder_BindCategoriesListFragment, int i) {
        this.IconCompatParcelizer = fragmentBuilder_BindCategoriesListFragment;
        this.write = i;
    }

    public final void onClick(View view) {
        this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(Integer.valueOf(this.write));
    }
}
