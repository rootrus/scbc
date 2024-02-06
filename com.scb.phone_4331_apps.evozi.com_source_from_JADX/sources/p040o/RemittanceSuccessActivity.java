package p040o;

import java.net.URI;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/* renamed from: o.RemittanceSuccessActivity */
public final class RemittanceSuccessActivity {
    public String IconCompatParcelizer;
    String MediaBrowserCompat$CustomActionResultReceiver;
    String MediaBrowserCompat$ItemReceiver;
    List<String> MediaBrowserCompat$MediaItem;
    String MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    int f5518x50fd9e4a;
    String MediaDescriptionCompat;
    public String MediaMetadataCompat;
    String MediaSessionCompat$QueueItem;
    public List<AddAccountsActivity> MediaSessionCompat$Token;
    String ParcelableVolumeInfo;
    String RatingCompat;
    String read;
    public Charset write;

    public RemittanceSuccessActivity() {
        this.f5518x50fd9e4a = -1;
    }

    public RemittanceSuccessActivity(URI uri) {
        List<String> list;
        this.MediaSessionCompat$QueueItem = uri.getScheme();
        this.MediaMetadataCompat = uri.getRawSchemeSpecificPart();
        this.MediaBrowserCompat$ItemReceiver = uri.getRawAuthority();
        this.MediaDescriptionCompat = uri.getHost();
        this.f5518x50fd9e4a = uri.getPort();
        this.MediaBrowserCompat$SearchResultReceiver = uri.getRawUserInfo();
        this.ParcelableVolumeInfo = uri.getUserInfo();
        this.MediaBrowserCompat$CustomActionResultReceiver = uri.getRawPath();
        String rawPath = uri.getRawPath();
        Charset charset = this.write;
        charset = charset == null ? PrepaidRequestProductCatalogActivity.write : charset;
        List<AddAccountsActivity> list2 = null;
        if (rawPath == null || rawPath.isEmpty()) {
            list = null;
        } else {
            list = RemittanceSenderAddressReviewActivity.IconCompatParcelizer((CharSequence) rawPath, charset);
        }
        this.MediaBrowserCompat$MediaItem = list;
        this.IconCompatParcelizer = uri.getRawQuery();
        String rawQuery = uri.getRawQuery();
        Charset charset2 = this.write;
        charset2 = charset2 == null ? PrepaidRequestProductCatalogActivity.write : charset2;
        if (rawQuery != null && !rawQuery.isEmpty()) {
            list2 = RemittanceSenderAddressReviewActivity.MediaBrowserCompat$ItemReceiver(rawQuery, charset2);
        }
        this.MediaSessionCompat$Token = list2;
        this.read = uri.getRawFragment();
        this.RatingCompat = uri.getFragment();
    }

    public final String read() {
        StringBuilder sb = new StringBuilder();
        String str = this.MediaSessionCompat$QueueItem;
        if (str != null) {
            sb.append(str);
            sb.append(':');
        }
        String str2 = this.MediaMetadataCompat;
        if (str2 != null) {
            sb.append(str2);
        } else {
            if (this.MediaBrowserCompat$ItemReceiver != null) {
                sb.append("//");
                sb.append(this.MediaBrowserCompat$ItemReceiver);
            } else if (this.MediaDescriptionCompat != null) {
                sb.append("//");
                String str3 = this.MediaBrowserCompat$SearchResultReceiver;
                if (str3 != null) {
                    sb.append(str3);
                    sb.append("@");
                } else {
                    String str4 = this.ParcelableVolumeInfo;
                    if (str4 != null) {
                        Charset charset = this.write;
                        if (charset == null) {
                            charset = PrepaidRequestProductCatalogActivity.write;
                        }
                        sb.append(RemittanceSenderAddressReviewActivity.IconCompatParcelizer(str4, charset));
                        sb.append("@");
                    }
                }
                if (GiftingSelectRecipientActivity.IconCompatParcelizer(this.MediaDescriptionCompat)) {
                    sb.append("[");
                    sb.append(this.MediaDescriptionCompat);
                    sb.append("]");
                } else {
                    sb.append(this.MediaDescriptionCompat);
                }
                if (this.f5518x50fd9e4a >= 0) {
                    sb.append(":");
                    sb.append(this.f5518x50fd9e4a);
                }
            }
            String str5 = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (str5 != null) {
                boolean z = sb.length() == 0;
                if (FatcaQuestionnaireAdapter$ViewHolder.read(str5)) {
                    str5 = "";
                } else if (!z && !str5.startsWith("/")) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("/");
                    sb2.append(str5);
                    str5 = sb2.toString();
                }
                sb.append(str5);
            } else {
                List<String> list = this.MediaBrowserCompat$MediaItem;
                if (list != null) {
                    Charset charset2 = this.write;
                    if (charset2 == null) {
                        charset2 = PrepaidRequestProductCatalogActivity.write;
                    }
                    sb.append(RemittanceSenderAddressReviewActivity.IconCompatParcelizer((Iterable<String>) list, charset2));
                }
            }
            if (this.IconCompatParcelizer != null) {
                sb.append("?");
                sb.append(this.IconCompatParcelizer);
            } else {
                List<AddAccountsActivity> list2 = this.MediaSessionCompat$Token;
                if (list2 != null && !list2.isEmpty()) {
                    sb.append("?");
                    List<AddAccountsActivity> list3 = this.MediaSessionCompat$Token;
                    Charset charset3 = this.write;
                    if (charset3 == null) {
                        charset3 = PrepaidRequestProductCatalogActivity.write;
                    }
                    sb.append(RemittanceSenderAddressReviewActivity.MediaBrowserCompat$ItemReceiver((Iterable<? extends AddAccountsActivity>) list3, charset3));
                }
            }
        }
        if (this.read != null) {
            sb.append("#");
            sb.append(this.read);
        } else if (this.RatingCompat != null) {
            sb.append("#");
            String str6 = this.RatingCompat;
            Charset charset4 = this.write;
            if (charset4 == null) {
                charset4 = PrepaidRequestProductCatalogActivity.write;
            }
            sb.append(RemittanceSenderAddressReviewActivity.read(str6, charset4));
        }
        return sb.toString();
    }

    public final RemittanceSuccessActivity MediaBrowserCompat$ItemReceiver(List<String> list) {
        this.MediaBrowserCompat$MediaItem = (list == null || list.size() <= 0) ? null : new ArrayList(list);
        this.MediaMetadataCompat = null;
        this.MediaBrowserCompat$CustomActionResultReceiver = null;
        return this;
    }

    public final String toString() {
        return read();
    }
}
