package p040o;

import android.view.View;

/* renamed from: o.FragmentBuilder_BindPersonalInformationFragment$MediaBrowserCompat$CustomActionResultReceiver */
class C6638x49df1eb8 implements View.OnClickListener {
    private final View.OnClickListener IconCompatParcelizer;
    private /* synthetic */ FragmentBuilder_BindPersonalInformationFragment MediaBrowserCompat$CustomActionResultReceiver;
    private final int read;

    C6638x49df1eb8(FragmentBuilder_BindPersonalInformationFragment fragmentBuilder_BindPersonalInformationFragment, int i, View.OnClickListener onClickListener) {
        this.MediaBrowserCompat$CustomActionResultReceiver = fragmentBuilder_BindPersonalInformationFragment;
        this.IconCompatParcelizer = onClickListener;
        this.read = i;
    }

    public final void onClick(View view) {
        int i = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver;
        this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver = this.read;
        FragmentBuilder_BindPersonalInformationFragment fragmentBuilder_BindPersonalInformationFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        fragmentBuilder_BindPersonalInformationFragment.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(fragmentBuilder_BindPersonalInformationFragment.MediaBrowserCompat$ItemReceiver, 1);
        this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(i, 1);
        this.IconCompatParcelizer.onClick(view);
    }
}
