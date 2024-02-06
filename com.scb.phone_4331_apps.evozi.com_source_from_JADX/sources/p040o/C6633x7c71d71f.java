package p040o;

import android.view.View;

/* renamed from: o.FragmentBuilder_BindPartnerWebViewFragment$MediaBrowserCompat$CustomActionResultReceiver */
class C6633x7c71d71f implements View.OnClickListener {
    private final int MediaBrowserCompat$CustomActionResultReceiver;
    private final View.OnClickListener read;
    private /* synthetic */ FragmentBuilder_BindPartnerWebViewFragment write;

    C6633x7c71d71f(FragmentBuilder_BindPartnerWebViewFragment fragmentBuilder_BindPartnerWebViewFragment, int i, View.OnClickListener onClickListener) {
        this.write = fragmentBuilder_BindPartnerWebViewFragment;
        this.MediaBrowserCompat$CustomActionResultReceiver = i;
        this.read = onClickListener;
    }

    public final void onClick(View view) {
        int i = this.write.MediaBrowserCompat$ItemReceiver;
        this.write.MediaBrowserCompat$ItemReceiver = this.MediaBrowserCompat$CustomActionResultReceiver;
        FragmentBuilder_BindPartnerWebViewFragment fragmentBuilder_BindPartnerWebViewFragment = this.write;
        fragmentBuilder_BindPartnerWebViewFragment.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(fragmentBuilder_BindPartnerWebViewFragment.MediaBrowserCompat$ItemReceiver, 1);
        this.write.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(i, 1);
        this.read.onClick(view);
    }
}
