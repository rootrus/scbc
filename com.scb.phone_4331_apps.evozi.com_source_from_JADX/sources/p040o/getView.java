package p040o;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.Registry;
import java.util.List;
import java.util.Map;
import p040o.CheckParameters;
import p040o.getAllowReturnTransitionOverlap;

/* renamed from: o.getView */
public final class getView extends ContextWrapper {
    static final isHideReplaced<?, ?> MediaBrowserCompat$ItemReceiver = new getTargetRequestCode();
    final List<deliverCancellation<Object>> IconCompatParcelizer;
    final performCreateOptionsMenu MediaBrowserCompat$CustomActionResultReceiver;
    private final Glide.IconCompatParcelizer MediaBrowserCompat$MediaItem;
    public final boolean MediaBrowserCompat$SearchResultReceiver;
    public final int MediaDescriptionCompat;
    public final Registry MediaMetadataCompat;
    private isReset RatingCompat;
    final Map<Class<?>, isHideReplaced<?, ?>> read;
    public final CheckParameters.CheckCountry write;

    public getView(Context context, CheckParameters.CheckCountry checkCountry, Registry registry, getAllowReturnTransitionOverlap.read read2, Glide.IconCompatParcelizer iconCompatParcelizer, Map<Class<?>, isHideReplaced<?, ?>> map, List<deliverCancellation<Object>> list, performCreateOptionsMenu performcreateoptionsmenu, boolean z, int i) {
        super(context.getApplicationContext());
        this.write = checkCountry;
        this.MediaMetadataCompat = registry;
        this.MediaBrowserCompat$MediaItem = iconCompatParcelizer;
        this.IconCompatParcelizer = list;
        this.read = map;
        this.MediaBrowserCompat$CustomActionResultReceiver = performcreateoptionsmenu;
        this.MediaBrowserCompat$SearchResultReceiver = z;
        this.MediaDescriptionCompat = i;
    }

    public final isReset IconCompatParcelizer() {
        isReset isreset;
        synchronized (this) {
            if (this.RatingCompat == null) {
                isReset read2 = this.MediaBrowserCompat$MediaItem.read();
                read2.RatingCompat = true;
                this.RatingCompat = read2;
            }
            isreset = this.RatingCompat;
        }
        return isreset;
    }

    public static <X> C1430reset<ImageView, X> MediaBrowserCompat$CustomActionResultReceiver(ImageView imageView, Class<X> cls) {
        if (Bitmap.class.equals(cls)) {
            return new deliverResult(imageView);
        }
        if (Drawable.class.isAssignableFrom(cls)) {
            return new onStartLoading(imageView);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unhandled class: ");
        sb.append(cls);
        sb.append(", try .as*(Class).transcode(ResourceTranscoder)");
        throw new IllegalArgumentException(sb.toString());
    }
}
