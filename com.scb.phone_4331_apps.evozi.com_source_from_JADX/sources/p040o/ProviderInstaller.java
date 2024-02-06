package p040o;

import android.graphics.Canvas;
import android.graphics.Paint;
import java.util.regex.Pattern;
import p040o.AbstractMultimap;

/* renamed from: o.ProviderInstaller */
public final class ProviderInstaller extends frequency<isClickable, read> {

    /* renamed from: o.ProviderInstaller$ProviderInstallListener */
    public final class ProviderInstallListener {
        private static final Pattern IconCompatParcelizer = Pattern.compile("^[A-Z]{4}[0-9]{2}$");

        public static boolean write(String str) {
            if (str == null) {
                return false;
            }
            return IconCompatParcelizer.matcher(str).matches();
        }

        /* renamed from: o.ProviderInstaller$ProviderInstallListener$IconCompatParcelizer */
        public static final class IconCompatParcelizer {
            public STRMV IconCompatParcelizer;
            public int MediaBrowserCompat$CustomActionResultReceiver;
            public STBSV MediaBrowserCompat$ItemReceiver;
            public ZGBMV MediaBrowserCompat$MediaItem;
            public STPMV MediaBrowserCompat$SearchResultReceiver;

            /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
            public ZGEMM f2775x50fd9e4a;
            public STRMM MediaDescriptionCompat;
            public int MediaMetadataCompat;
            private SSYR2K MediaSessionCompat$ResultReceiverWrapper;
            public STRSV MediaSessionCompat$Token;
            public STRSM RatingCompat;
            public STPSV read;
            public int write;

            private IconCompatParcelizer() {
            }

            public IconCompatParcelizer(FragmentBuilder_BindOthersTabFragment fragmentBuilder_BindOthersTabFragment) {
                Paint paint = new Paint();
                paint.setStyle(Paint.Style.FILL);
                paint.setAntiAlias(true);
                this.MediaSessionCompat$ResultReceiverWrapper = new SSYR2K(paint, fragmentBuilder_BindOthersTabFragment);
                this.MediaBrowserCompat$ItemReceiver = new STBSV(paint, fragmentBuilder_BindOthersTabFragment);
                this.RatingCompat = new STRSM(paint, fragmentBuilder_BindOthersTabFragment);
                this.MediaSessionCompat$Token = new STRSV(paint, fragmentBuilder_BindOthersTabFragment);
                this.MediaBrowserCompat$SearchResultReceiver = new STPMV(paint, fragmentBuilder_BindOthersTabFragment);
                this.IconCompatParcelizer = new STRMV(paint, fragmentBuilder_BindOthersTabFragment);
                this.f2775x50fd9e4a = new ZGEMM(paint, fragmentBuilder_BindOthersTabFragment);
                this.read = new STPSV(paint, fragmentBuilder_BindOthersTabFragment);
                this.MediaBrowserCompat$MediaItem = new ZGBMV(paint, fragmentBuilder_BindOthersTabFragment);
                this.MediaDescriptionCompat = new STRMM(paint, fragmentBuilder_BindOthersTabFragment);
            }

            public final void read(Canvas canvas, boolean z) {
                Paint paint;
                if (this.MediaBrowserCompat$ItemReceiver != null) {
                    SSYR2K ssyr2k = this.MediaSessionCompat$ResultReceiverWrapper;
                    int i = this.MediaMetadataCompat;
                    int i2 = this.write;
                    int i3 = this.MediaBrowserCompat$CustomActionResultReceiver;
                    float f = (float) ssyr2k.MediaBrowserCompat$ItemReceiver.PlaybackStateCompat;
                    int i4 = ssyr2k.MediaBrowserCompat$ItemReceiver.setContentView;
                    float f2 = ssyr2k.MediaBrowserCompat$ItemReceiver.setHasDecor;
                    int i5 = ssyr2k.MediaBrowserCompat$ItemReceiver.AlertController$RecycleListView;
                    int i6 = ssyr2k.MediaBrowserCompat$ItemReceiver.AppCompatDelegateImpl$ListMenuDecorView;
                    int i7 = ssyr2k.MediaBrowserCompat$ItemReceiver.AppCompatDialogFragment;
                    FragmentBuilder_BindOthersTabFragment fragmentBuilder_BindOthersTabFragment = ssyr2k.MediaBrowserCompat$ItemReceiver;
                    if (fragmentBuilder_BindOthersTabFragment.write == null) {
                        fragmentBuilder_BindOthersTabFragment.write = DTRMM.NONE;
                    }
                    DTRMM dtrmm = fragmentBuilder_BindOthersTabFragment.write;
                    if ((dtrmm == DTRMM.SCALE && !z) || (dtrmm == DTRMM.SCALE_DOWN && z)) {
                        f *= f2;
                    }
                    if (i != i7) {
                        i5 = i6;
                    }
                    if (dtrmm != DTRMM.FILL || i == i7) {
                        paint = ssyr2k.read;
                    } else {
                        paint = ssyr2k.write;
                        paint.setStrokeWidth((float) i4);
                    }
                    paint.setColor(i5);
                    canvas.drawCircle((float) i2, (float) i3, f, paint);
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public ProviderInstaller(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOnIO") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, final AbstractMultimap.SortedAsMap sortedAsMap) {
        super(closeAccountReviewActivity, closeAccountReviewActivity2, new FundFactSheetActivity<read, BScanCNotificationDeepLinkActivity<isClickable>>() {
            public final /* synthetic */ Object invoke(Object obj) {
                read read = (read) obj;
                onGetStartedClick.write((Object) read, "params");
                return sortedAsMap.write(read.MediaBrowserCompat$CustomActionResultReceiver, read.write);
            }
        });
        onGetStartedClick.write((Object) closeAccountReviewActivity, "subscriberOn");
        onGetStartedClick.write((Object) closeAccountReviewActivity2, "observerOn");
        onGetStartedClick.write((Object) sortedAsMap, "repo");
    }

    /* renamed from: o.ProviderInstaller$read */
    public static final class read implements C4602xca7af99c {
        final String MediaBrowserCompat$CustomActionResultReceiver;
        final requestLocationUpdates write;

        public read(String str, requestLocationUpdates requestlocationupdates) {
            onGetStartedClick.write((Object) str, Name.MARK);
            onGetStartedClick.write((Object) requestlocationupdates, "function");
            this.MediaBrowserCompat$CustomActionResultReceiver = str;
            this.write = requestlocationupdates;
        }
    }
}
