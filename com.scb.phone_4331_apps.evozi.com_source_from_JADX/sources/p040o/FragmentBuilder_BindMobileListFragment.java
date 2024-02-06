package p040o;

import android.app.Activity;

/* renamed from: o.FragmentBuilder_BindMobileListFragment */
public abstract class FragmentBuilder_BindMobileListFragment {
    private FragmentBuilder_BindMobileListFragment() {
    }

    public /* synthetic */ FragmentBuilder_BindMobileListFragment(byte b) {
        this();
    }

    /* renamed from: o.FragmentBuilder_BindMobileListFragment$RatingCompat */
    public static final class RatingCompat extends FragmentBuilder_BindMobileListFragment {
        public final FragmentBuilder_BindMileageAirlineFieldDetailsFragment MediaBrowserCompat$CustomActionResultReceiver;

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) ((RatingCompat) obj).MediaBrowserCompat$CustomActionResultReceiver);
            }
            return true;
        }

        public final int hashCode() {
            FragmentBuilder_BindMileageAirlineFieldDetailsFragment fragmentBuilder_BindMileageAirlineFieldDetailsFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (fragmentBuilder_BindMileageAirlineFieldDetailsFragment != null) {
                return fragmentBuilder_BindMileageAirlineFieldDetailsFragment.hashCode();
            }
            return 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("UpdateActivityLifecycleInfo(activityInfo=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(")");
            return sb.toString();
        }

        public RatingCompat(FragmentBuilder_BindMileageAirlineFieldDetailsFragment fragmentBuilder_BindMileageAirlineFieldDetailsFragment) {
            super((byte) 0);
            this.MediaBrowserCompat$CustomActionResultReceiver = fragmentBuilder_BindMileageAirlineFieldDetailsFragment;
        }
    }

    /* renamed from: o.FragmentBuilder_BindMobileListFragment$IconCompatParcelizer */
    public static final class IconCompatParcelizer extends FragmentBuilder_BindMobileListFragment {
        final FragmentBuilder_BindMileageAirlineFieldDetailsFragment read;
        final Activity write;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IconCompatParcelizer)) {
                return false;
            }
            IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) iconCompatParcelizer.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) iconCompatParcelizer.read);
        }

        public final int hashCode() {
            Activity activity = this.write;
            int i = 0;
            int hashCode = activity != null ? activity.hashCode() : 0;
            FragmentBuilder_BindMileageAirlineFieldDetailsFragment fragmentBuilder_BindMileageAirlineFieldDetailsFragment = this.read;
            if (fragmentBuilder_BindMileageAirlineFieldDetailsFragment != null) {
                i = fragmentBuilder_BindMileageAirlineFieldDetailsFragment.hashCode();
            }
            return (hashCode * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ActivityResumed(activity=");
            sb.append(this.write);
            sb.append(", activityInfo=");
            sb.append(this.read);
            sb.append(")");
            return sb.toString();
        }

        public IconCompatParcelizer(Activity activity, FragmentBuilder_BindMileageAirlineFieldDetailsFragment fragmentBuilder_BindMileageAirlineFieldDetailsFragment) {
            super((byte) 0);
            this.write = activity;
            this.read = fragmentBuilder_BindMileageAirlineFieldDetailsFragment;
        }
    }

    /* renamed from: o.FragmentBuilder_BindMobileListFragment$write */
    public static final class write extends FragmentBuilder_BindMobileListFragment {
        final int write;

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof write) && this.write == ((write) obj).write;
            }
            return true;
        }

        public final int hashCode() {
            return this.write;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ActivityStopped(hashCode=");
            sb.append(this.write);
            sb.append(")");
            return sb.toString();
        }

        public write(int i) {
            super((byte) 0);
            this.write = i;
        }
    }

    /* renamed from: o.FragmentBuilder_BindMobileListFragment$read */
    public static final class read extends FragmentBuilder_BindMobileListFragment {
        final int MediaBrowserCompat$CustomActionResultReceiver;

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof read) && this.MediaBrowserCompat$CustomActionResultReceiver == ((read) obj).MediaBrowserCompat$CustomActionResultReceiver;
            }
            return true;
        }

        public final int hashCode() {
            return this.MediaBrowserCompat$CustomActionResultReceiver;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ActivityPaused(hashCode=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(")");
            return sb.toString();
        }

        public read(int i) {
            super((byte) 0);
            this.MediaBrowserCompat$CustomActionResultReceiver = i;
        }
    }
}
