package p040o;

import android.content.res.Resources;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import p040o.Lists;
import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.setCropLineColor */
public final class setCropLineColor extends writeUInt64NoTag<newPassportExtractor> {
    public final Resources IconCompatParcelizer;
    public final transparency MediaBrowserCompat$ItemReceiver;
    public final Lists.TransformingRandomAccessList read;

    public static final /* synthetic */ int IconCompatParcelizer(boolean z, boolean z2) {
        return (!z || z2) ? 2 : 3;
    }

    /* renamed from: o.setCropLineColor$IconCompatParcelizer */
    public static final class IconCompatParcelizer<V> implements writeUInt64NoTag.IconCompatParcelizer<newPassportExtractor> {
        private /* synthetic */ SpannableString MediaBrowserCompat$CustomActionResultReceiver;
        private /* synthetic */ SpannableString MediaBrowserCompat$ItemReceiver;
        private /* synthetic */ SpannableString read;

        public IconCompatParcelizer(SpannableString spannableString, SpannableString spannableString2, SpannableString spannableString3) {
            this.read = spannableString;
            this.MediaBrowserCompat$ItemReceiver = spannableString2;
            this.MediaBrowserCompat$CustomActionResultReceiver = spannableString3;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((newPassportExtractor) obj).MediaBrowserCompat$ItemReceiver(this.read, this.MediaBrowserCompat$ItemReceiver, this.MediaBrowserCompat$CustomActionResultReceiver);
        }
    }

    /* renamed from: o.setCropLineColor$MediaMetadataCompat */
    public static final class MediaMetadataCompat<V> implements writeUInt64NoTag.IconCompatParcelizer<newPassportExtractor> {
        private /* synthetic */ setCropLineColor MediaBrowserCompat$ItemReceiver;
        private /* synthetic */ boolean read;
        private /* synthetic */ boolean write;

        public MediaMetadataCompat(setCropLineColor setcroplinecolor, boolean z, boolean z2) {
            this.MediaBrowserCompat$ItemReceiver = setcroplinecolor;
            this.write = z;
            this.read = z2;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((newPassportExtractor) obj).MediaBrowserCompat$CustomActionResultReceiver(setCropLineColor.IconCompatParcelizer(this.write, this.read));
        }
    }

    /* renamed from: o.setCropLineColor$read */
    public static final class read<V> implements writeUInt64NoTag.IconCompatParcelizer<newPassportExtractor> {
        private /* synthetic */ setCropLineColor MediaBrowserCompat$ItemReceiver;

        public read(setCropLineColor setcroplinecolor) {
            this.MediaBrowserCompat$ItemReceiver = setcroplinecolor;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            String str;
            newPassportExtractor newpassportextractor = (newPassportExtractor) obj;
            zzwi write = this.MediaBrowserCompat$ItemReceiver.read.write.MediaBrowserCompat$CustomActionResultReceiver.write();
            if (write != null) {
                str = write.PlaybackStateCompat;
            } else {
                str = null;
            }
            newpassportextractor.IconCompatParcelizer(str);
        }
    }

    /* renamed from: o.setCropLineColor$write */
    public static final class write<V> implements writeUInt64NoTag.IconCompatParcelizer<newPassportExtractor> {
        public static final write MediaBrowserCompat$CustomActionResultReceiver = new write();

        write() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((newPassportExtractor) obj).read("roboadvisor_landing");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public setCropLineColor(Lists.TransformingRandomAccessList transformingRandomAccessList, transparency transparency, Resources resources, RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) transformingRandomAccessList, "roboAdvisorLandingController");
        onGetStartedClick.write((Object) transparency, "accountSummaryCase");
        onGetStartedClick.write((Object) resources, "resources");
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        this.read = transformingRandomAccessList;
        this.MediaBrowserCompat$ItemReceiver = transparency;
        this.IconCompatParcelizer = resources;
    }

    public static SpannableString MediaBrowserCompat$ItemReceiver(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(' ');
        sb.append(str2);
        SpannableString spannableString = new SpannableString(sb.toString());
        spannableString.setSpan(new StyleSpan(1), 0, str.length(), 0);
        return spannableString;
    }

    public final void write(int i) {
        RegularImmutableBiMap regularImmutableBiMap = this.MediaBrowserCompat$CustomActionResultReceiver;
        MediaBrowserCompat$ItemReceiver(regularImmutableBiMap.read((String) null, regularImmutableBiMap.MediaBrowserCompat$CustomActionResultReceiver.getString(i), access$2300.write.NAVIGATE_BACK));
    }
}
