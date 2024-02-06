package p040o;

/* renamed from: o.DSYR */
public final class DSYR implements DSYMM$MediaBrowserCompat$ItemReceiver {
    public C5222xd24dc819 IconCompatParcelizer;
    public FragmentBuilder_BindOccupationInfoFragment read;
    public read write;

    /* renamed from: o.DSYR$read */
    public interface read {
        void MediaBrowserCompat$CustomActionResultReceiver();
    }

    public DSYR(read read2) {
        this.write = read2;
        FragmentBuilder_BindOccupationInfoFragment fragmentBuilder_BindOccupationInfoFragment = new FragmentBuilder_BindOccupationInfoFragment();
        this.read = fragmentBuilder_BindOccupationInfoFragment;
        if (fragmentBuilder_BindOccupationInfoFragment.MediaBrowserCompat$ItemReceiver == null) {
            fragmentBuilder_BindOccupationInfoFragment.MediaBrowserCompat$ItemReceiver = new FragmentBuilder_BindOthersTabFragment();
        }
        this.IconCompatParcelizer = new C5222xd24dc819(fragmentBuilder_BindOccupationInfoFragment.MediaBrowserCompat$ItemReceiver, this);
    }

    public final void MediaBrowserCompat$ItemReceiver(inject_base64Decoder inject_base64decoder) {
        this.read.IconCompatParcelizer.IconCompatParcelizer = inject_base64decoder;
        read read2 = this.write;
        if (read2 != null) {
            read2.MediaBrowserCompat$CustomActionResultReceiver();
        }
    }
}
