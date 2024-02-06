package p040o;

/* renamed from: o.FragmentBuilder_BindRemittanceInputFragment */
public abstract class FragmentBuilder_BindRemittanceInputFragment {

    /* renamed from: o.FragmentBuilder_BindRemittanceInputFragment$write */
    public static final class write extends FragmentBuilder_BindRemittanceInputFragment {
        public static final write read = new write();

        private write() {
            super((byte) 0);
        }
    }

    private FragmentBuilder_BindRemittanceInputFragment() {
    }

    public /* synthetic */ FragmentBuilder_BindRemittanceInputFragment(byte b) {
        this();
    }

    /* renamed from: o.FragmentBuilder_BindRemittanceInputFragment$MediaMetadataCompat */
    public static final class MediaMetadataCompat extends FragmentBuilder_BindRemittanceInputFragment {
        final String MediaBrowserCompat$CustomActionResultReceiver;
        final String read;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MediaMetadataCompat)) {
                return false;
            }
            MediaMetadataCompat mediaMetadataCompat = (MediaMetadataCompat) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) mediaMetadataCompat.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) mediaMetadataCompat.MediaBrowserCompat$CustomActionResultReceiver);
        }

        public final int hashCode() {
            String str = this.read;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return (hashCode * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("SendAppInstallSuccess(rawSiteKey=");
            sb.append(this.read);
            sb.append(", thinstanceHost=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(")");
            return sb.toString();
        }

        public MediaMetadataCompat(String str, String str2) {
            super((byte) 0);
            this.read = str;
            this.MediaBrowserCompat$CustomActionResultReceiver = str2;
        }
    }

    /* renamed from: o.FragmentBuilder_BindRemittanceInputFragment$MediaDescriptionCompat */
    public static final class MediaDescriptionCompat extends FragmentBuilder_BindRemittanceInputFragment {
        final long MediaBrowserCompat$CustomActionResultReceiver;

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof MediaDescriptionCompat) && this.MediaBrowserCompat$CustomActionResultReceiver == ((MediaDescriptionCompat) obj).MediaBrowserCompat$CustomActionResultReceiver;
            }
            return true;
        }

        public final int hashCode() {
            long j = this.MediaBrowserCompat$CustomActionResultReceiver;
            return (int) (j ^ (j >>> 32));
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("UpdateAppInstallTime(appInstallTime=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(")");
            return sb.toString();
        }

        public MediaDescriptionCompat(long j) {
            super((byte) 0);
            this.MediaBrowserCompat$CustomActionResultReceiver = j;
        }
    }

    /* renamed from: o.FragmentBuilder_BindRemittanceInputFragment$read */
    public static final class read extends FragmentBuilder_BindRemittanceInputFragment {
        public static final read IconCompatParcelizer = new read();

        private read() {
            super((byte) 0);
        }
    }

    /* renamed from: o.FragmentBuilder_BindRemittanceInputFragment$IconCompatParcelizer */
    public static final class IconCompatParcelizer extends FragmentBuilder_BindRemittanceInputFragment {
        final boolean write;

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof IconCompatParcelizer) && this.write == ((IconCompatParcelizer) obj).write;
            }
            return true;
        }

        public final int hashCode() {
            boolean z = this.write;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("LoadAppInstallSuccess(appInstallSent=");
            sb.append(this.write);
            sb.append(")");
            return sb.toString();
        }

        public IconCompatParcelizer(boolean z) {
            super((byte) 0);
            this.write = z;
        }
    }
}
