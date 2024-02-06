package p040o;

import android.view.View;

/* renamed from: o.FragmentBuilder_BindTransferToMeAccountFragment$MediaBrowserCompat$CustomActionResultReceiver */
class C6861xf8613fb implements View.OnClickListener {
    private final int IconCompatParcelizer;
    private /* synthetic */ FragmentBuilder_BindTransferToMeAccountFragment read;

    C6861xf8613fb(FragmentBuilder_BindTransferToMeAccountFragment fragmentBuilder_BindTransferToMeAccountFragment, int i) {
        this.read = fragmentBuilder_BindTransferToMeAccountFragment;
        this.IconCompatParcelizer = i;
    }

    public final void onClick(View view) {
        int i = this.read.RatingCompat;
        this.read.RatingCompat = this.IconCompatParcelizer;
        FragmentBuilder_BindTransferToMeAccountFragment fragmentBuilder_BindTransferToMeAccountFragment = this.read;
        fragmentBuilder_BindTransferToMeAccountFragment.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(fragmentBuilder_BindTransferToMeAccountFragment.RatingCompat, 1);
        this.read.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(i, 1);
        for (View.OnClickListener onClick : this.read.write) {
            onClick.onClick(view);
        }
    }
}
