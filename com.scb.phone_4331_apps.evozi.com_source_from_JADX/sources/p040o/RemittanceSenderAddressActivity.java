package p040o;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Stack;

/* renamed from: o.RemittanceSenderAddressActivity */
public final class RemittanceSenderAddressActivity {
    public static final EnumSet<read> IconCompatParcelizer = EnumSet.of(read.DROP_FRAGMENT, read.NORMALIZE);
    public static final EnumSet<read> MediaBrowserCompat$CustomActionResultReceiver = EnumSet.noneOf(read.class);
    public static final EnumSet<read> MediaBrowserCompat$ItemReceiver = EnumSet.of(read.NORMALIZE);

    /* renamed from: o.RemittanceSenderAddressActivity$read */
    public enum read {
        DROP_FRAGMENT,
        NORMALIZE
    }

    static {
        EnumSet.of(read.DROP_FRAGMENT);
    }

    public static URI write(URI uri, PrivacyManagementLandingViewHolder privacyManagementLandingViewHolder, EnumSet<read> enumSet) throws URISyntaxException {
        String str;
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(uri, "URI");
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(enumSet, "URI flags");
        if (uri.isOpaque()) {
            return uri;
        }
        RemittanceSuccessActivity remittanceSuccessActivity = new RemittanceSuccessActivity(uri);
        int i = -1;
        if (privacyManagementLandingViewHolder != null) {
            remittanceSuccessActivity.MediaSessionCompat$QueueItem = privacyManagementLandingViewHolder.read;
            remittanceSuccessActivity.MediaDescriptionCompat = privacyManagementLandingViewHolder.write;
            remittanceSuccessActivity.MediaMetadataCompat = null;
            remittanceSuccessActivity.MediaBrowserCompat$ItemReceiver = null;
            int i2 = privacyManagementLandingViewHolder.MediaBrowserCompat$CustomActionResultReceiver;
            if (i2 >= 0) {
                i = i2;
            }
            remittanceSuccessActivity.f5518x50fd9e4a = i;
            remittanceSuccessActivity.MediaMetadataCompat = null;
            remittanceSuccessActivity.MediaBrowserCompat$ItemReceiver = null;
        } else {
            remittanceSuccessActivity.MediaSessionCompat$QueueItem = null;
            remittanceSuccessActivity.MediaDescriptionCompat = null;
            remittanceSuccessActivity.MediaMetadataCompat = null;
            remittanceSuccessActivity.MediaBrowserCompat$ItemReceiver = null;
            remittanceSuccessActivity.f5518x50fd9e4a = -1;
            remittanceSuccessActivity.MediaMetadataCompat = null;
            remittanceSuccessActivity.MediaBrowserCompat$ItemReceiver = null;
        }
        if (enumSet.contains(read.DROP_FRAGMENT)) {
            remittanceSuccessActivity.RatingCompat = null;
            remittanceSuccessActivity.read = null;
        }
        if (enumSet.contains(read.NORMALIZE)) {
            List arrayList = remittanceSuccessActivity.MediaBrowserCompat$MediaItem != null ? new ArrayList(remittanceSuccessActivity.MediaBrowserCompat$MediaItem) : Collections.emptyList();
            ArrayList arrayList2 = new ArrayList(arrayList);
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                if (((String) it.next()).isEmpty() && it.hasNext()) {
                    it.remove();
                }
            }
            if (arrayList2.size() != arrayList.size()) {
                remittanceSuccessActivity.MediaBrowserCompat$ItemReceiver(arrayList2);
            }
        }
        List<String> list = remittanceSuccessActivity.MediaBrowserCompat$MediaItem;
        if ((list == null || list.isEmpty()) && ((str = remittanceSuccessActivity.MediaBrowserCompat$CustomActionResultReceiver) == null || str.isEmpty())) {
            remittanceSuccessActivity.MediaBrowserCompat$MediaItem = Arrays.asList(new String[]{""});
            remittanceSuccessActivity.MediaMetadataCompat = null;
            remittanceSuccessActivity.MediaBrowserCompat$CustomActionResultReceiver = null;
        }
        return new URI(remittanceSuccessActivity.read());
    }

    public static URI write(URI uri) throws URISyntaxException {
        String str;
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(uri, "URI");
        if (uri.isOpaque()) {
            return uri;
        }
        RemittanceSuccessActivity remittanceSuccessActivity = new RemittanceSuccessActivity(uri);
        if (remittanceSuccessActivity.ParcelableVolumeInfo != null) {
            remittanceSuccessActivity.ParcelableVolumeInfo = null;
            remittanceSuccessActivity.MediaMetadataCompat = null;
            remittanceSuccessActivity.MediaBrowserCompat$ItemReceiver = null;
            remittanceSuccessActivity.MediaBrowserCompat$SearchResultReceiver = null;
        }
        if ((remittanceSuccessActivity.MediaBrowserCompat$MediaItem != null ? new ArrayList(remittanceSuccessActivity.MediaBrowserCompat$MediaItem) : Collections.emptyList()).isEmpty()) {
            remittanceSuccessActivity.MediaBrowserCompat$MediaItem = Arrays.asList(new String[]{""});
            remittanceSuccessActivity.MediaMetadataCompat = null;
            remittanceSuccessActivity.MediaBrowserCompat$CustomActionResultReceiver = null;
        }
        if (remittanceSuccessActivity.MediaBrowserCompat$MediaItem == null) {
            str = null;
        } else {
            StringBuilder sb = new StringBuilder();
            for (String append : remittanceSuccessActivity.MediaBrowserCompat$MediaItem) {
                sb.append('/');
                sb.append(append);
            }
            str = sb.toString();
        }
        boolean z = true;
        if (!(str == null || str.length() == 0)) {
            z = false;
        }
        if (z) {
            remittanceSuccessActivity.MediaBrowserCompat$ItemReceiver(RemittanceSenderAddressReviewActivity.write("/"));
        }
        if (remittanceSuccessActivity.MediaDescriptionCompat != null) {
            remittanceSuccessActivity.MediaDescriptionCompat = remittanceSuccessActivity.MediaDescriptionCompat.toLowerCase(Locale.ROOT);
            remittanceSuccessActivity.MediaMetadataCompat = null;
            remittanceSuccessActivity.MediaBrowserCompat$ItemReceiver = null;
        }
        remittanceSuccessActivity.RatingCompat = null;
        remittanceSuccessActivity.read = null;
        return new URI(remittanceSuccessActivity.read());
    }

    public static URI read(URI uri, URI uri2) {
        URI uri3;
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(uri, "Base URI");
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(uri2, "Reference URI");
        String aSCIIString = uri2.toASCIIString();
        if (aSCIIString.startsWith("?")) {
            String aSCIIString2 = uri.toASCIIString();
            int indexOf = aSCIIString2.indexOf(63);
            if (indexOf >= 0) {
                aSCIIString2 = aSCIIString2.substring(0, indexOf);
            }
            StringBuilder sb = new StringBuilder();
            sb.append(aSCIIString2);
            sb.append(aSCIIString);
            return URI.create(sb.toString());
        }
        if (aSCIIString.isEmpty()) {
            String aSCIIString3 = uri.resolve(URI.create("#")).toASCIIString();
            uri3 = URI.create(aSCIIString3.substring(0, aSCIIString3.indexOf(35)));
        } else {
            uri3 = uri.resolve(uri2);
        }
        try {
            return MediaBrowserCompat$ItemReceiver(uri3);
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static URI MediaBrowserCompat$ItemReceiver(URI uri) throws URISyntaxException {
        if (uri.isOpaque() || uri.getAuthority() == null) {
            return uri;
        }
        RemittanceSuccessActivity remittanceSuccessActivity = new RemittanceSuccessActivity(uri);
        List<String> arrayList = remittanceSuccessActivity.MediaBrowserCompat$MediaItem != null ? new ArrayList<>(remittanceSuccessActivity.MediaBrowserCompat$MediaItem) : Collections.emptyList();
        Stack stack = new Stack();
        for (String str : arrayList) {
            if (!".".equals(str)) {
                if (!"..".equals(str)) {
                    stack.push(str);
                } else if (!stack.isEmpty()) {
                    stack.pop();
                }
            }
        }
        if (stack.size() == 0) {
            stack.add("");
        }
        remittanceSuccessActivity.MediaBrowserCompat$ItemReceiver(stack);
        if (remittanceSuccessActivity.MediaSessionCompat$QueueItem != null) {
            remittanceSuccessActivity.MediaSessionCompat$QueueItem = remittanceSuccessActivity.MediaSessionCompat$QueueItem.toLowerCase(Locale.ROOT);
        }
        if (remittanceSuccessActivity.MediaDescriptionCompat != null) {
            remittanceSuccessActivity.MediaDescriptionCompat = remittanceSuccessActivity.MediaDescriptionCompat.toLowerCase(Locale.ROOT);
            remittanceSuccessActivity.MediaMetadataCompat = null;
            remittanceSuccessActivity.MediaBrowserCompat$ItemReceiver = null;
        }
        return new URI(remittanceSuccessActivity.read());
    }

    public static PrivacyManagementLandingViewHolder read(URI uri) {
        int indexOf;
        if (uri == null || !uri.isAbsolute()) {
            return null;
        }
        int port = uri.getPort();
        String host = uri.getHost();
        if (host == null && (host = uri.getAuthority()) != null) {
            int indexOf2 = host.indexOf(64);
            if (indexOf2 >= 0) {
                int i = indexOf2 + 1;
                host = host.length() > i ? host.substring(i) : null;
            }
            if (host != null && (indexOf = host.indexOf(58)) >= 0) {
                int i2 = indexOf + 1;
                int i3 = i2;
                int i4 = 0;
                while (i3 < host.length() && Character.isDigit(host.charAt(i3))) {
                    i4++;
                    i3++;
                }
                if (i4 > 0) {
                    try {
                        port = Integer.parseInt(host.substring(i2, i4 + i2));
                    } catch (NumberFormatException unused) {
                    }
                }
                host = host.substring(0, indexOf);
            }
        }
        String scheme = uri.getScheme();
        if (FatcaQuestionnaireAdapter$ViewHolder.read(host)) {
            return null;
        }
        try {
            return new PrivacyManagementLandingViewHolder(host, port, scheme);
        } catch (IllegalArgumentException unused2) {
            return null;
        }
    }
}
