package p040o;

import java.util.List;

/* renamed from: o.FragmentBuilder_BindTopUpFavouriteTargetFragment */
public abstract class FragmentBuilder_BindTopUpFavouriteTargetFragment {
    private FragmentBuilder_BindTopUpFavouriteTargetFragment() {
    }

    public /* synthetic */ FragmentBuilder_BindTopUpFavouriteTargetFragment(byte b) {
        this();
    }

    /* renamed from: o.FragmentBuilder_BindTopUpFavouriteTargetFragment$IconCompatParcelizer */
    public static final class IconCompatParcelizer extends FragmentBuilder_BindTopUpFavouriteTargetFragment {
        public final List<FragmentBuilder_BindTransferToMeStep1Fragment> MediaBrowserCompat$CustomActionResultReceiver;

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) ((IconCompatParcelizer) obj).MediaBrowserCompat$CustomActionResultReceiver);
            }
            return true;
        }

        public final int hashCode() {
            List<FragmentBuilder_BindTransferToMeStep1Fragment> list = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (list != null) {
                return list.hashCode();
            }
            return 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("LoadReleasesSuccess(releases=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public IconCompatParcelizer(List<? extends FragmentBuilder_BindTransferToMeStep1Fragment> list) {
            super((byte) 0);
            onGetStartedClick.write((Object) list, "releases");
            this.MediaBrowserCompat$CustomActionResultReceiver = list;
        }
    }

    /* renamed from: o.FragmentBuilder_BindTopUpFavouriteTargetFragment$write */
    public static final class write extends FragmentBuilder_BindTopUpFavouriteTargetFragment {
        public static final write MediaBrowserCompat$ItemReceiver = new write();

        private write() {
            super((byte) 0);
        }
    }

    /* renamed from: o.FragmentBuilder_BindTopUpFavouriteTargetFragment$read */
    public static final class read extends FragmentBuilder_BindTopUpFavouriteTargetFragment {
        public static final read MediaBrowserCompat$ItemReceiver = new read();

        private read() {
            super((byte) 0);
        }
    }
}
