package p040o;

/* renamed from: o.FragmentBuilder_BindOutgoingFragment */
public abstract class FragmentBuilder_BindOutgoingFragment {
    private FragmentBuilder_BindOutgoingFragment() {
    }

    public /* synthetic */ FragmentBuilder_BindOutgoingFragment(byte b) {
        this();
    }

    /* renamed from: o.FragmentBuilder_BindOutgoingFragment$write */
    public static final class write extends FragmentBuilder_BindOutgoingFragment {
        public static final write MediaBrowserCompat$CustomActionResultReceiver = new write();

        private write() {
            super((byte) 0);
        }
    }

    /* renamed from: o.FragmentBuilder_BindOutgoingFragment$read */
    public static final class read extends FragmentBuilder_BindOutgoingFragment {
        public static final read MediaBrowserCompat$CustomActionResultReceiver = new read();

        private read() {
            super((byte) 0);
        }
    }

    /* renamed from: o.FragmentBuilder_BindOutgoingFragment$IconCompatParcelizer */
    public static final class IconCompatParcelizer extends FragmentBuilder_BindOutgoingFragment {
        public static final IconCompatParcelizer write = new IconCompatParcelizer();

        private IconCompatParcelizer() {
            super((byte) 0);
        }
    }
}
