package p040o;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import org.jmrtd.lds.ImageInfo;

/* renamed from: o.CreditCardDetailUnbilledAdapter$ParentViewHolder */
public final class CreditCardDetailUnbilledAdapter$ParentViewHolder implements Serializable {
    private static CreditCardDetailUnbilledAdapter$ParentViewHolder AlertController$RecycleListView = MediaBrowserCompat$CustomActionResultReceiver("text/plain", CreditCardDetailUnbilledAdapter$ChildViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver);
    private static CreditCardDetailUnbilledAdapter$ParentViewHolder Keep = MediaBrowserCompat$CustomActionResultReceiver("multipart/form-data", CreditCardDetailUnbilledAdapter$ChildViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver);
    private static CreditCardDetailUnbilledAdapter$ParentViewHolder MediaBrowserCompat$CustomActionResultReceiver = MediaBrowserCompat$CustomActionResultReceiver("application/atom+xml", CreditCardDetailUnbilledAdapter$ChildViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver);
    private static CreditCardDetailUnbilledAdapter$ParentViewHolder MediaBrowserCompat$ItemReceiver = MediaBrowserCompat$CustomActionResultReceiver("application/x-www-form-urlencoded", CreditCardDetailUnbilledAdapter$ChildViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver);
    private static CreditCardDetailUnbilledAdapter$ParentViewHolder MediaBrowserCompat$MediaItem = MediaBrowserCompat$CustomActionResultReceiver("application/xml", CreditCardDetailUnbilledAdapter$ChildViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver);
    private static CreditCardDetailUnbilledAdapter$ParentViewHolder MediaBrowserCompat$SearchResultReceiver = MediaBrowserCompat$CustomActionResultReceiver("image/gif", (Charset) null);

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private static CreditCardDetailUnbilledAdapter$ParentViewHolder f5502x50fd9e4a = MediaBrowserCompat$CustomActionResultReceiver("image/webp", (Charset) null);
    private static CreditCardDetailUnbilledAdapter$ParentViewHolder MediaDescriptionCompat = MediaBrowserCompat$CustomActionResultReceiver("image/bmp", (Charset) null);
    private static CreditCardDetailUnbilledAdapter$ParentViewHolder MediaMetadataCompat = MediaBrowserCompat$CustomActionResultReceiver("application/xhtml+xml", CreditCardDetailUnbilledAdapter$ChildViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver);
    private static CreditCardDetailUnbilledAdapter$ParentViewHolder MediaSessionCompat$QueueItem = MediaBrowserCompat$CustomActionResultReceiver(ImageInfo.JPEG_MIME_TYPE, (Charset) null);
    private static CreditCardDetailUnbilledAdapter$ParentViewHolder MediaSessionCompat$ResultReceiverWrapper = MediaBrowserCompat$CustomActionResultReceiver("image/svg+xml", (Charset) null);
    private static CreditCardDetailUnbilledAdapter$ParentViewHolder MediaSessionCompat$Token = MediaBrowserCompat$CustomActionResultReceiver("image/tiff", (Charset) null);
    private static CreditCardDetailUnbilledAdapter$ParentViewHolder ParcelableVolumeInfo = MediaBrowserCompat$CustomActionResultReceiver("image/png", (Charset) null);
    private static CreditCardDetailUnbilledAdapter$ParentViewHolder PlaybackStateCompat$CustomAction = MediaBrowserCompat$CustomActionResultReceiver("text/xml", CreditCardDetailUnbilledAdapter$ChildViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver);
    private static CreditCardDetailUnbilledAdapter$ParentViewHolder RatingCompat = MediaBrowserCompat$CustomActionResultReceiver("application/svg+xml", CreditCardDetailUnbilledAdapter$ChildViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver);
    private static CreditCardDetailUnbilledAdapter$ParentViewHolder read = MediaBrowserCompat$CustomActionResultReceiver("application/json", CreditCardDetailUnbilledAdapter$ChildViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver);
    private static CreditCardDetailUnbilledAdapter$ParentViewHolder setHasDecor = MediaBrowserCompat$CustomActionResultReceiver("text/html", CreditCardDetailUnbilledAdapter$ChildViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver);
    public final Charset IconCompatParcelizer;
    private final C9698x5b61c61d[] PlaybackStateCompat;
    public final String write;

    static {
        MediaBrowserCompat$CustomActionResultReceiver("application/octet-stream", (Charset) null);
        MediaBrowserCompat$CustomActionResultReceiver("*/*", (Charset) null);
        CreditCardDetailUnbilledAdapter$ParentViewHolder[] creditCardDetailUnbilledAdapter$ParentViewHolderArr = {MediaBrowserCompat$CustomActionResultReceiver, MediaBrowserCompat$ItemReceiver, read, RatingCompat, MediaMetadataCompat, MediaBrowserCompat$MediaItem, MediaDescriptionCompat, MediaBrowserCompat$SearchResultReceiver, MediaSessionCompat$QueueItem, ParcelableVolumeInfo, MediaSessionCompat$ResultReceiverWrapper, MediaSessionCompat$Token, f5502x50fd9e4a, Keep, setHasDecor, AlertController$RecycleListView, PlaybackStateCompat$CustomAction};
        HashMap hashMap = new HashMap();
        for (int i = 0; i < 17; i++) {
            CreditCardDetailUnbilledAdapter$ParentViewHolder creditCardDetailUnbilledAdapter$ParentViewHolder = creditCardDetailUnbilledAdapter$ParentViewHolderArr[i];
            hashMap.put(creditCardDetailUnbilledAdapter$ParentViewHolder.write, creditCardDetailUnbilledAdapter$ParentViewHolder);
        }
        Collections.unmodifiableMap(hashMap);
    }

    private CreditCardDetailUnbilledAdapter$ParentViewHolder(String str, Charset charset) {
        this.write = str;
        this.IconCompatParcelizer = charset;
        this.PlaybackStateCompat = null;
    }

    private CreditCardDetailUnbilledAdapter$ParentViewHolder(String str, Charset charset, C9698x5b61c61d[] creditCardDetailPurchaseViewPagerAdapter$ItemViewHolder_ViewBindingArr) {
        this.write = str;
        this.IconCompatParcelizer = charset;
        this.PlaybackStateCompat = creditCardDetailPurchaseViewPagerAdapter$ItemViewHolder_ViewBindingArr;
    }

    public final String toString() {
        int i;
        DepositOpenAccountSelectionAdapter$ListViewHolderWithAccountType depositOpenAccountSelectionAdapter$ListViewHolderWithAccountType = new DepositOpenAccountSelectionAdapter$ListViewHolderWithAccountType(64);
        depositOpenAccountSelectionAdapter$ListViewHolderWithAccountType.read(this.write);
        if (this.PlaybackStateCompat != null) {
            depositOpenAccountSelectionAdapter$ListViewHolderWithAccountType.read("; ");
            BankingServiceAdapter$CustomViewHolder_ViewBinding bankingServiceAdapter$CustomViewHolder_ViewBinding = BankingServiceAdapter$CustomViewHolder_ViewBinding.IconCompatParcelizer;
            C9698x5b61c61d[] creditCardDetailPurchaseViewPagerAdapter$ItemViewHolder_ViewBindingArr = this.PlaybackStateCompat;
            C6431x12296157.write(creditCardDetailPurchaseViewPagerAdapter$ItemViewHolder_ViewBindingArr, "Header parameter array");
            if (creditCardDetailPurchaseViewPagerAdapter$ItemViewHolder_ViewBindingArr == null || creditCardDetailPurchaseViewPagerAdapter$ItemViewHolder_ViewBindingArr.length <= 0) {
                i = 0;
            } else {
                i = (creditCardDetailPurchaseViewPagerAdapter$ItemViewHolder_ViewBindingArr.length - 1) << 1;
                for (C9698x5b61c61d IconCompatParcelizer2 : creditCardDetailPurchaseViewPagerAdapter$ItemViewHolder_ViewBindingArr) {
                    i += BankingServiceAdapter$CustomViewHolder_ViewBinding.IconCompatParcelizer(IconCompatParcelizer2);
                }
            }
            if (i > 0) {
                int length = depositOpenAccountSelectionAdapter$ListViewHolderWithAccountType.read.length;
                int i2 = depositOpenAccountSelectionAdapter$ListViewHolderWithAccountType.IconCompatParcelizer;
                if (i > length - i2) {
                    depositOpenAccountSelectionAdapter$ListViewHolderWithAccountType.write(i2 + i);
                }
            }
            for (int i3 = 0; i3 < creditCardDetailPurchaseViewPagerAdapter$ItemViewHolder_ViewBindingArr.length; i3++) {
                if (i3 > 0) {
                    depositOpenAccountSelectionAdapter$ListViewHolderWithAccountType.read("; ");
                }
                C9698x5b61c61d creditCardDetailPurchaseViewPagerAdapter$ItemViewHolder_ViewBinding = creditCardDetailPurchaseViewPagerAdapter$ItemViewHolder_ViewBindingArr[i3];
                C6431x12296157.write(creditCardDetailPurchaseViewPagerAdapter$ItemViewHolder_ViewBinding, "Name / value pair");
                int IconCompatParcelizer3 = BankingServiceAdapter$CustomViewHolder_ViewBinding.IconCompatParcelizer(creditCardDetailPurchaseViewPagerAdapter$ItemViewHolder_ViewBinding);
                if (IconCompatParcelizer3 > 0) {
                    int length2 = depositOpenAccountSelectionAdapter$ListViewHolderWithAccountType.read.length;
                    int i4 = depositOpenAccountSelectionAdapter$ListViewHolderWithAccountType.IconCompatParcelizer;
                    if (IconCompatParcelizer3 > length2 - i4) {
                        depositOpenAccountSelectionAdapter$ListViewHolderWithAccountType.write(i4 + IconCompatParcelizer3);
                    }
                }
                depositOpenAccountSelectionAdapter$ListViewHolderWithAccountType.read(creditCardDetailPurchaseViewPagerAdapter$ItemViewHolder_ViewBinding.IconCompatParcelizer());
                String write2 = creditCardDetailPurchaseViewPagerAdapter$ItemViewHolder_ViewBinding.write();
                if (write2 != null) {
                    depositOpenAccountSelectionAdapter$ListViewHolderWithAccountType.write('=');
                    boolean z = false;
                    for (int i5 = 0; i5 < write2.length() && !z; i5++) {
                        z = " ;,:@()<>\\\"/[]?={}\t".indexOf(write2.charAt(i5)) >= 0;
                    }
                    if (z) {
                        depositOpenAccountSelectionAdapter$ListViewHolderWithAccountType.write('\"');
                    }
                    for (int i6 = 0; i6 < write2.length(); i6++) {
                        char charAt = write2.charAt(i6);
                        if ("\"\\".indexOf(charAt) >= 0) {
                            depositOpenAccountSelectionAdapter$ListViewHolderWithAccountType.write('\\');
                        }
                        depositOpenAccountSelectionAdapter$ListViewHolderWithAccountType.write(charAt);
                    }
                    if (z) {
                        depositOpenAccountSelectionAdapter$ListViewHolderWithAccountType.write('\"');
                    }
                }
            }
        } else if (this.IconCompatParcelizer != null) {
            depositOpenAccountSelectionAdapter$ListViewHolderWithAccountType.read("; charset=");
            depositOpenAccountSelectionAdapter$ListViewHolderWithAccountType.read(this.IconCompatParcelizer.name());
        }
        return depositOpenAccountSelectionAdapter$ListViewHolderWithAccountType.toString();
    }

    private static boolean MediaBrowserCompat$CustomActionResultReceiver(String str) {
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt == '\"' || charAt == ',' || charAt == ';') {
                return false;
            }
        }
        return true;
    }

    public static CreditCardDetailUnbilledAdapter$ParentViewHolder MediaBrowserCompat$CustomActionResultReceiver(String str, Charset charset) {
        String lowerCase = ((String) C6431x12296157.IconCompatParcelizer(str, "MIME type")).toLowerCase(Locale.ROOT);
        if (MediaBrowserCompat$CustomActionResultReceiver(lowerCase)) {
            return new CreditCardDetailUnbilledAdapter$ParentViewHolder(lowerCase, charset);
        }
        throw new IllegalArgumentException("MIME type may not contain reserved characters");
    }

    public static CreditCardDetailUnbilledAdapter$ParentViewHolder IconCompatParcelizer(String str) {
        return MediaBrowserCompat$CustomActionResultReceiver(str, (Charset) null);
    }

    private static CreditCardDetailUnbilledAdapter$ParentViewHolder MediaBrowserCompat$CustomActionResultReceiver(String str, C9698x5b61c61d[] creditCardDetailPurchaseViewPagerAdapter$ItemViewHolder_ViewBindingArr) {
        Charset charset;
        int length = creditCardDetailPurchaseViewPagerAdapter$ItemViewHolder_ViewBindingArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            C9698x5b61c61d creditCardDetailPurchaseViewPagerAdapter$ItemViewHolder_ViewBinding = creditCardDetailPurchaseViewPagerAdapter$ItemViewHolder_ViewBindingArr[i];
            if (creditCardDetailPurchaseViewPagerAdapter$ItemViewHolder_ViewBinding.IconCompatParcelizer().equalsIgnoreCase("charset")) {
                String write2 = creditCardDetailPurchaseViewPagerAdapter$ItemViewHolder_ViewBinding.write();
                if (!DepositAccountSelectorAdapter$ItemViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver(write2)) {
                    try {
                        charset = Charset.forName(write2);
                    } catch (UnsupportedCharsetException e) {
                        throw e;
                    }
                }
            } else {
                i++;
            }
        }
        charset = null;
        if (creditCardDetailPurchaseViewPagerAdapter$ItemViewHolder_ViewBindingArr == null || creditCardDetailPurchaseViewPagerAdapter$ItemViewHolder_ViewBindingArr.length <= 0) {
            creditCardDetailPurchaseViewPagerAdapter$ItemViewHolder_ViewBindingArr = null;
        }
        return new CreditCardDetailUnbilledAdapter$ParentViewHolder(str, charset, creditCardDetailPurchaseViewPagerAdapter$ItemViewHolder_ViewBindingArr);
    }

    public static CreditCardDetailUnbilledAdapter$ParentViewHolder write(String str, C9698x5b61c61d... creditCardDetailPurchaseViewPagerAdapter$ItemViewHolder_ViewBindingArr) throws UnsupportedCharsetException {
        if (MediaBrowserCompat$CustomActionResultReceiver(((String) C6431x12296157.IconCompatParcelizer(str, "MIME type")).toLowerCase(Locale.ROOT))) {
            return MediaBrowserCompat$CustomActionResultReceiver(str, creditCardDetailPurchaseViewPagerAdapter$ItemViewHolder_ViewBindingArr);
        }
        throw new IllegalArgumentException("MIME type may not contain reserved characters");
    }
}
