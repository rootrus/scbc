package p040o;

/* renamed from: o.FragmentBuilder_BindIssuerInputFragment */
public abstract class FragmentBuilder_BindIssuerInputFragment<L, R> {
    public static final C6559x7897674c IconCompatParcelizer = new C6559x7897674c((byte) 0);

    private FragmentBuilder_BindIssuerInputFragment() {
    }

    public /* synthetic */ FragmentBuilder_BindIssuerInputFragment(byte b) {
        this();
    }

    /* renamed from: o.FragmentBuilder_BindIssuerInputFragment$write */
    public static final class write<L> extends FragmentBuilder_BindIssuerInputFragment {
        public final L write;

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) ((write) obj).write);
            }
            return true;
        }

        public final int hashCode() {
            L l = this.write;
            if (l != null) {
                return l.hashCode();
            }
            return 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Left(left=");
            sb.append(this.write);
            sb.append(")");
            return sb.toString();
        }

        public write(L l) {
            super((byte) 0);
            this.write = l;
        }
    }

    /* renamed from: o.FragmentBuilder_BindIssuerInputFragment$IconCompatParcelizer */
    public static final class IconCompatParcelizer<R> extends FragmentBuilder_BindIssuerInputFragment {
        public final R MediaBrowserCompat$ItemReceiver;

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) ((IconCompatParcelizer) obj).MediaBrowserCompat$ItemReceiver);
            }
            return true;
        }

        public final int hashCode() {
            R r = this.MediaBrowserCompat$ItemReceiver;
            if (r != null) {
                return r.hashCode();
            }
            return 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Right(right=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(")");
            return sb.toString();
        }

        public IconCompatParcelizer(R r) {
            super((byte) 0);
            this.MediaBrowserCompat$ItemReceiver = r;
        }
    }
}
