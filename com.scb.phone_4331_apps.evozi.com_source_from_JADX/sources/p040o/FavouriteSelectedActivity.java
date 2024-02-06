package p040o;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import org.apache.http.ParseException;
import org.jmrtd.lds.ImageInfo;

/* renamed from: o.FavouriteSelectedActivity */
public final class FavouriteSelectedActivity implements Serializable {
    private static FavouriteSelectedActivity AlertController$RecycleListView = IconCompatParcelizer("image/webp", (Charset) null);
    private static FavouriteSelectedActivity IconCompatParcelizer = IconCompatParcelizer("application/atom+xml", PrepaidRequestProductCatalogActivity.read);
    private static FavouriteSelectedActivity Keep = IconCompatParcelizer("multipart/form-data", PrepaidRequestProductCatalogActivity.read);
    public static final FavouriteSelectedActivity MediaBrowserCompat$CustomActionResultReceiver = PlaybackStateCompat$CustomAction;
    private static FavouriteSelectedActivity MediaBrowserCompat$MediaItem = IconCompatParcelizer("application/svg+xml", PrepaidRequestProductCatalogActivity.read);
    private static FavouriteSelectedActivity MediaBrowserCompat$SearchResultReceiver = IconCompatParcelizer("image/bmp", (Charset) null);

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private static FavouriteSelectedActivity f5509x50fd9e4a = IconCompatParcelizer(ImageInfo.JPEG_MIME_TYPE, (Charset) null);
    private static FavouriteSelectedActivity MediaDescriptionCompat = IconCompatParcelizer("application/json", PrepaidRequestProductCatalogActivity.write);
    private static FavouriteSelectedActivity MediaMetadataCompat = IconCompatParcelizer("application/xml", PrepaidRequestProductCatalogActivity.read);
    private static FavouriteSelectedActivity MediaSessionCompat$QueueItem = IconCompatParcelizer("image/svg+xml", (Charset) null);
    private static FavouriteSelectedActivity MediaSessionCompat$ResultReceiverWrapper = IconCompatParcelizer("image/png", (Charset) null);
    private static FavouriteSelectedActivity MediaSessionCompat$Token = IconCompatParcelizer("image/gif", (Charset) null);
    private static FavouriteSelectedActivity ParcelableVolumeInfo = IconCompatParcelizer("image/tiff", (Charset) null);
    private static FavouriteSelectedActivity PlaybackStateCompat = IconCompatParcelizer("text/html", PrepaidRequestProductCatalogActivity.read);
    private static FavouriteSelectedActivity PlaybackStateCompat$CustomAction = IconCompatParcelizer("text/plain", PrepaidRequestProductCatalogActivity.read);
    private static FavouriteSelectedActivity RatingCompat = IconCompatParcelizer("application/xhtml+xml", PrepaidRequestProductCatalogActivity.read);
    private static FavouriteSelectedActivity setHasDecor = IconCompatParcelizer("text/xml", PrepaidRequestProductCatalogActivity.read);
    public static final FavouriteSelectedActivity write = IconCompatParcelizer("application/x-www-form-urlencoded", PrepaidRequestProductCatalogActivity.read);
    public final String MediaBrowserCompat$ItemReceiver;
    public final Charset read;
    private final AddAccountsActivity[] setBackgroundResource;

    static {
        IconCompatParcelizer("application/octet-stream", (Charset) null);
        IconCompatParcelizer("application/soap+xml", PrepaidRequestProductCatalogActivity.write);
        IconCompatParcelizer("*/*", (Charset) null);
        FavouriteSelectedActivity[] favouriteSelectedActivityArr = {IconCompatParcelizer, write, MediaDescriptionCompat, MediaBrowserCompat$MediaItem, RatingCompat, MediaMetadataCompat, MediaBrowserCompat$SearchResultReceiver, MediaSessionCompat$Token, f5509x50fd9e4a, MediaSessionCompat$ResultReceiverWrapper, MediaSessionCompat$QueueItem, ParcelableVolumeInfo, AlertController$RecycleListView, Keep, PlaybackStateCompat, PlaybackStateCompat$CustomAction, setHasDecor};
        HashMap hashMap = new HashMap();
        for (int i = 0; i < 17; i++) {
            FavouriteSelectedActivity favouriteSelectedActivity = favouriteSelectedActivityArr[i];
            hashMap.put(favouriteSelectedActivity.MediaBrowserCompat$ItemReceiver, favouriteSelectedActivity);
        }
        Collections.unmodifiableMap(hashMap);
    }

    private FavouriteSelectedActivity(String str, Charset charset) {
        this.MediaBrowserCompat$ItemReceiver = str;
        this.read = charset;
        this.setBackgroundResource = null;
    }

    private FavouriteSelectedActivity(String str, Charset charset, AddAccountsActivity[] addAccountsActivityArr) {
        this.MediaBrowserCompat$ItemReceiver = str;
        this.read = charset;
        this.setBackgroundResource = addAccountsActivityArr;
    }

    public final String toString() {
        int i;
        DepositTransactionAdapter$ChildViewHolder_ViewBinding depositTransactionAdapter$ChildViewHolder_ViewBinding = new DepositTransactionAdapter$ChildViewHolder_ViewBinding(64);
        depositTransactionAdapter$ChildViewHolder_ViewBinding.read(this.MediaBrowserCompat$ItemReceiver);
        if (this.setBackgroundResource != null) {
            depositTransactionAdapter$ChildViewHolder_ViewBinding.read("; ");
            ProductListAdapter$ProductViewHolder productListAdapter$ProductViewHolder = ProductListAdapter$ProductViewHolder.MediaBrowserCompat$CustomActionResultReceiver;
            AddAccountsActivity[] addAccountsActivityArr = this.setBackgroundResource;
            DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(addAccountsActivityArr, "Header parameter array");
            if (addAccountsActivityArr == null || addAccountsActivityArr.length <= 0) {
                i = 0;
            } else {
                i = (addAccountsActivityArr.length - 1) << 1;
                for (AddAccountsActivity read2 : addAccountsActivityArr) {
                    i += ProductListAdapter$ProductViewHolder.read(read2);
                }
            }
            if (i > 0) {
                int length = depositTransactionAdapter$ChildViewHolder_ViewBinding.write.length;
                int i2 = depositTransactionAdapter$ChildViewHolder_ViewBinding.IconCompatParcelizer;
                if (i > length - i2) {
                    depositTransactionAdapter$ChildViewHolder_ViewBinding.IconCompatParcelizer(i2 + i);
                }
            }
            for (int i3 = 0; i3 < addAccountsActivityArr.length; i3++) {
                if (i3 > 0) {
                    depositTransactionAdapter$ChildViewHolder_ViewBinding.read("; ");
                }
                productListAdapter$ProductViewHolder.write(depositTransactionAdapter$ChildViewHolder_ViewBinding, addAccountsActivityArr[i3], false);
            }
        } else if (this.read != null) {
            depositTransactionAdapter$ChildViewHolder_ViewBinding.read("; charset=");
            depositTransactionAdapter$ChildViewHolder_ViewBinding.read(this.read.name());
        }
        return depositTransactionAdapter$ChildViewHolder_ViewBinding.toString();
    }

    private static boolean read(String str) {
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt == '\"' || charAt == ',' || charAt == ';') {
                return false;
            }
        }
        return true;
    }

    public static FavouriteSelectedActivity IconCompatParcelizer(String str, Charset charset) {
        String lowerCase = ((String) DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(str, "MIME type")).toLowerCase(Locale.ROOT);
        if (read(lowerCase)) {
            return new FavouriteSelectedActivity(lowerCase, charset);
        }
        throw new IllegalArgumentException("MIME type may not contain reserved characters");
    }

    private static FavouriteSelectedActivity MediaBrowserCompat$CustomActionResultReceiver(String str, AddAccountsActivity[] addAccountsActivityArr, boolean z) {
        Charset charset;
        int length = addAccountsActivityArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            AddAccountsActivity addAccountsActivity = addAccountsActivityArr[i];
            if (addAccountsActivity.IconCompatParcelizer().equalsIgnoreCase("charset")) {
                String MediaBrowserCompat$ItemReceiver2 = addAccountsActivity.MediaBrowserCompat$ItemReceiver();
                if (!FatcaQuestionnaireAdapter$ViewHolder.read(MediaBrowserCompat$ItemReceiver2)) {
                    try {
                        charset = Charset.forName(MediaBrowserCompat$ItemReceiver2);
                    } catch (UnsupportedCharsetException e) {
                        throw e;
                    }
                }
            } else {
                i++;
            }
        }
        charset = null;
        if (addAccountsActivityArr == null || addAccountsActivityArr.length <= 0) {
            addAccountsActivityArr = null;
        }
        return new FavouriteSelectedActivity(str, charset, addAccountsActivityArr);
    }

    public static FavouriteSelectedActivity write(PrepaidResetOtpActivity prepaidResetOtpActivity) throws ParseException, UnsupportedCharsetException {
        PrepaidRequestMarketConductActivity read2;
        if (!(prepaidResetOtpActivity == null || (read2 = prepaidResetOtpActivity.read()) == null)) {
            PrepaidTravelConversionLandingActivity_ViewBinding[] MediaBrowserCompat$CustomActionResultReceiver2 = read2.MediaBrowserCompat$CustomActionResultReceiver();
            if (MediaBrowserCompat$CustomActionResultReceiver2.length > 0) {
                PrepaidTravelConversionLandingActivity_ViewBinding prepaidTravelConversionLandingActivity_ViewBinding = MediaBrowserCompat$CustomActionResultReceiver2[0];
                return MediaBrowserCompat$CustomActionResultReceiver(prepaidTravelConversionLandingActivity_ViewBinding.read(), prepaidTravelConversionLandingActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(), true);
            }
        }
        return null;
    }
}
