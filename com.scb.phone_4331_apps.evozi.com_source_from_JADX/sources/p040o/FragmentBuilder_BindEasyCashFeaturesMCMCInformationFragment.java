package p040o;

import android.graphics.Bitmap;
import com.google.gson.Gson;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import org.threeten.p041bp.OffsetDateTime;
import p040o.StreetViewPanoramaView;

/* renamed from: o.FragmentBuilder_BindEasyCashFeaturesMCMCInformationFragment */
public final class FragmentBuilder_BindEasyCashFeaturesMCMCInformationFragment extends getSupportLoaderManager {
    private static final byte[] IconCompatParcelizer;
    private final boolean MediaBrowserCompat$ItemReceiver = false;
    private final int read;

    public FragmentBuilder_BindEasyCashFeaturesMCMCInformationFragment(int i) {
        this.read = i;
    }

    /* renamed from: o.FragmentBuilder_BindEasyCashFeaturesMCMCInformationFragment$write */
    public static final class write implements inject_extractorProvider {
        private FragmentBuilder_BindTopUpBillerSelectedFragment IconCompatParcelizer;

        private write() {
        }

        @HmlPinActivity
        public write(FragmentBuilder_BindTopUpBillerSelectedFragment fragmentBuilder_BindTopUpBillerSelectedFragment) {
            this.IconCompatParcelizer = fragmentBuilder_BindTopUpBillerSelectedFragment;
        }

        public final DebitCardResetOtpActivity<StreetViewPanoramaView.zzb> MediaBrowserCompat$ItemReceiver(String str) {
            getUriTemplate geturitemplate = (getUriTemplate) new Gson().fromJson(str, getUriTemplate.class);
            StreetViewPanoramaView.zzb MediaBrowserCompat$CustomActionResultReceiver = StreetViewPanoramaView.zzb.MediaBrowserCompat$CustomActionResultReceiver();
            MediaBrowserCompat$CustomActionResultReceiver.MediaSessionCompat$QueueItem = geturitemplate.MediaSessionCompat$QueueItem;
            MediaBrowserCompat$CustomActionResultReceiver.ParcelableVolumeInfo = geturitemplate.f2599x50fd9e4a;
            MediaBrowserCompat$CustomActionResultReceiver.MediaMetadataCompat = geturitemplate.MediaMetadataCompat;
            MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver = OffsetDateTime.parse(geturitemplate.MediaBrowserCompat$ItemReceiver, GifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder.ISO_OFFSET_DATE_TIME);
            MediaBrowserCompat$CustomActionResultReceiver.write = geturitemplate.write;
            MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver = geturitemplate.MediaBrowserCompat$CustomActionResultReceiver;
            MediaBrowserCompat$CustomActionResultReceiver.MediaSessionCompat$Token = geturitemplate.MediaSessionCompat$ResultReceiverWrapper;
            MediaBrowserCompat$CustomActionResultReceiver.read = geturitemplate.read;
            MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$MediaItem = geturitemplate.RatingCompat;
            MediaBrowserCompat$CustomActionResultReceiver.MediaDescriptionCompat = geturitemplate.MediaBrowserCompat$SearchResultReceiver;
            MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$SearchResultReceiver = OffsetDateTime.parse(geturitemplate.MediaDescriptionCompat, GifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder.ISO_OFFSET_DATE_TIME);
            MediaBrowserCompat$CustomActionResultReceiver.RatingCompat = geturitemplate.MediaBrowserCompat$MediaItem;
            MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer = geturitemplate.IconCompatParcelizer;
            return DebitCardResetOtpActivity.just(MediaBrowserCompat$CustomActionResultReceiver);
        }
    }

    static {
        Charset forName = Charset.forName("UTF-8");
        onGetStartedClick.IconCompatParcelizer((Object) forName, "Charset.forName(Key.STRING_CHARSET_NAME)");
        byte[] bytes = "com.kevin.glidetest.BlurTransformation".getBytes(forName);
        onGetStartedClick.IconCompatParcelizer((Object) bytes, "(this as java.lang.String).getBytes(charset)");
        IconCompatParcelizer = bytes;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(MessageDigest messageDigest) {
        onGetStartedClick.write((Object) messageDigest, "messageDigest");
        messageDigest.update(IconCompatParcelizer);
    }

    public final Bitmap IconCompatParcelizer(CheckParameters_MembersInjector checkParameters_MembersInjector, Bitmap bitmap, int i, int i2) {
        onGetStartedClick.write((Object) checkParameters_MembersInjector, "pool");
        onGetStartedClick.write((Object) bitmap, "source");
        float height = ((float) bitmap.getHeight()) * (((float) this.read) / ((float) bitmap.getWidth()));
        if (!Float.isNaN(height)) {
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, this.read, Math.round(height), true);
            onGetStartedClick.IconCompatParcelizer((Object) createScaledBitmap, "Bitmap.createScaledBitma…ce, mSize, newSize, true)");
            if (createScaledBitmap != bitmap) {
                bitmap.recycle();
            }
            return createScaledBitmap;
        }
        throw new IllegalArgumentException("Cannot round NaN value.");
    }
}
