package p040o;

import android.net.Uri;
import android.widget.ImageView;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;
import java.io.File;

/* renamed from: o.addMarker */
public final class addMarker {
    public final String IconCompatParcelizer;
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;
    private final String MediaBrowserCompat$SearchResultReceiver;
    private final String RatingCompat;
    public final int read;
    public final boolean write;

    public addMarker(String str, boolean z) {
        this(str, z, (byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof addMarker)) {
            return false;
        }
        addMarker addmarker = (addMarker) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) addmarker.IconCompatParcelizer) && this.read == addmarker.read && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) addmarker.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) addmarker.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) addmarker.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) addmarker.MediaBrowserCompat$SearchResultReceiver) && this.write == addmarker.write;
    }

    public final int hashCode() {
        String str = this.IconCompatParcelizer;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        int i2 = this.read;
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.RatingCompat;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.MediaBrowserCompat$SearchResultReceiver;
        if (str5 != null) {
            i = str5.hashCode();
        }
        boolean z = this.write;
        if (z) {
            z = true;
        }
        return (((((((((((hashCode * 31) + i2) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i) * 31) + (z ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NotificationCategory(category=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", sortSequence=");
        sb.append(this.read);
        sb.append(", descriptionTH=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", descriptionEN=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", categoryColor=");
        sb.append(this.RatingCompat);
        sb.append(", categoryIcon=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", enabled=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }

    public addMarker(String str, int i, String str2, String str3, String str4, String str5, boolean z) {
        onGetStartedClick.write((Object) str, "category");
        onGetStartedClick.write((Object) str2, "descriptionTH");
        onGetStartedClick.write((Object) str3, "descriptionEN");
        onGetStartedClick.write((Object) str4, "categoryColor");
        onGetStartedClick.write((Object) str5, "categoryIcon");
        this.IconCompatParcelizer = str;
        this.read = i;
        this.MediaBrowserCompat$ItemReceiver = str2;
        this.MediaBrowserCompat$CustomActionResultReceiver = str3;
        this.RatingCompat = str4;
        this.MediaBrowserCompat$SearchResultReceiver = str5;
        this.write = z;
    }

    private /* synthetic */ addMarker(String str, boolean z, byte b) {
        this(str, 0, "", "", "", "", z);
    }

    /* renamed from: o.addMarker$read */
    public static final class read implements IdExtractor_Factory {
        private final FragmentBuilder_BindFundSelectAccountFragment read;
        private final Picasso write;

        private read() {
        }

        public read(Picasso picasso, FragmentBuilder_BindFundSelectAccountFragment fragmentBuilder_BindFundSelectAccountFragment) {
            this.write = picasso;
            this.read = fragmentBuilder_BindFundSelectAccountFragment;
        }

        public final void write(Object obj, ImageView imageView) {
            FragmentBuilder_BindFundDetailSummaryFragment fragmentBuilder_BindFundDetailSummaryFragment;
            FragmentBuilder_BindFundDetailSummaryFragment fragmentBuilder_BindFundDetailSummaryFragment2;
            if ((obj instanceof Uri) || obj == null) {
                fragmentBuilder_BindFundDetailSummaryFragment2 = new FragmentBuilder_BindFundDetailSummaryFragment(this.write, (Uri) obj, 0);
            } else {
                if (obj instanceof String) {
                    fragmentBuilder_BindFundDetailSummaryFragment = this.write.write((String) obj);
                } else if (obj instanceof File) {
                    Picasso picasso = this.write;
                    File file = (File) obj;
                    if (file == null) {
                        fragmentBuilder_BindFundDetailSummaryFragment = new FragmentBuilder_BindFundDetailSummaryFragment(picasso, (Uri) null, 0);
                    } else {
                        fragmentBuilder_BindFundDetailSummaryFragment2 = new FragmentBuilder_BindFundDetailSummaryFragment(picasso, Uri.fromFile(file), 0);
                    }
                } else if (obj instanceof Integer) {
                    Picasso picasso2 = this.write;
                    int intValue = ((Integer) obj).intValue();
                    if (intValue != 0) {
                        fragmentBuilder_BindFundDetailSummaryFragment = new FragmentBuilder_BindFundDetailSummaryFragment(picasso2, (Uri) null, intValue);
                    } else {
                        throw new IllegalArgumentException("Resource ID must not be zero.");
                    }
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unsupported model ");
                    sb.append(obj);
                    throw new IllegalArgumentException(sb.toString());
                }
                RequestCreator skipMemoryCache = fragmentBuilder_BindFundDetailSummaryFragment.skipMemoryCache();
                skipMemoryCache.MediaBrowserCompat$CustomActionResultReceiver.read(this.read);
                skipMemoryCache.read(imageView, (FragmentBuilder_BindEkycFragment) null);
            }
            fragmentBuilder_BindFundDetailSummaryFragment = fragmentBuilder_BindFundDetailSummaryFragment2;
            RequestCreator skipMemoryCache2 = fragmentBuilder_BindFundDetailSummaryFragment.skipMemoryCache();
            skipMemoryCache2.MediaBrowserCompat$CustomActionResultReceiver.read(this.read);
            skipMemoryCache2.read(imageView, (FragmentBuilder_BindEkycFragment) null);
        }
    }
}
