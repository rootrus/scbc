package p040o;

import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p040o.previewButton;

/* renamed from: o.GiftOpenSharingMomentActivity_ViewBinding */
public final class GiftOpenSharingMomentActivity_ViewBinding implements previewButton, Cloneable {
    public final previewButton.read IconCompatParcelizer;
    public final List<PrivacyManagementLandingViewHolder> MediaBrowserCompat$CustomActionResultReceiver;
    public final PrivacyManagementLandingViewHolder MediaBrowserCompat$ItemReceiver;
    private final boolean MediaDescriptionCompat;
    private final previewButton.IconCompatParcelizer read;
    public final InetAddress write;

    private GiftOpenSharingMomentActivity_ViewBinding(PrivacyManagementLandingViewHolder privacyManagementLandingViewHolder, InetAddress inetAddress, List<PrivacyManagementLandingViewHolder> list, boolean z, previewButton.read read2, previewButton.IconCompatParcelizer iconCompatParcelizer) {
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(privacyManagementLandingViewHolder, "Target host");
        if (privacyManagementLandingViewHolder.MediaBrowserCompat$CustomActionResultReceiver < 0) {
            InetAddress inetAddress2 = privacyManagementLandingViewHolder.MediaBrowserCompat$ItemReceiver;
            String str = privacyManagementLandingViewHolder.read;
            int i = 443;
            if (inetAddress2 != null) {
                if ("http".equalsIgnoreCase(str)) {
                    i = 80;
                } else if (!"https".equalsIgnoreCase(str)) {
                    i = -1;
                }
                privacyManagementLandingViewHolder = new PrivacyManagementLandingViewHolder(inetAddress2, i, str);
            } else {
                String str2 = privacyManagementLandingViewHolder.write;
                if ("http".equalsIgnoreCase(str)) {
                    i = 80;
                } else if (!"https".equalsIgnoreCase(str)) {
                    i = -1;
                }
                privacyManagementLandingViewHolder = new PrivacyManagementLandingViewHolder(str2, i, str);
            }
        }
        this.MediaBrowserCompat$ItemReceiver = privacyManagementLandingViewHolder;
        this.write = inetAddress;
        if (list == null || list.isEmpty()) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
        } else {
            this.MediaBrowserCompat$CustomActionResultReceiver = new ArrayList(list);
        }
        if (read2 == previewButton.read.TUNNELLED) {
            if (!(this.MediaBrowserCompat$CustomActionResultReceiver != null)) {
                throw new IllegalArgumentException("Proxy required if tunnelled");
            }
        }
        this.MediaDescriptionCompat = z;
        this.IconCompatParcelizer = read2 == null ? previewButton.read.PLAIN : read2;
        this.read = iconCompatParcelizer == null ? previewButton.IconCompatParcelizer.PLAIN : iconCompatParcelizer;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public GiftOpenSharingMomentActivity_ViewBinding(PrivacyManagementLandingViewHolder privacyManagementLandingViewHolder, InetAddress inetAddress, PrivacyManagementLandingViewHolder[] privacyManagementLandingViewHolderArr, boolean z, previewButton.read read2, previewButton.IconCompatParcelizer iconCompatParcelizer) {
        this(privacyManagementLandingViewHolder, inetAddress, (List<PrivacyManagementLandingViewHolder>) privacyManagementLandingViewHolderArr != null ? Arrays.asList(privacyManagementLandingViewHolderArr) : null, z, read2, iconCompatParcelizer);
    }

    public GiftOpenSharingMomentActivity_ViewBinding(PrivacyManagementLandingViewHolder privacyManagementLandingViewHolder, InetAddress inetAddress, boolean z) {
        this(privacyManagementLandingViewHolder, inetAddress, (List<PrivacyManagementLandingViewHolder>) Collections.emptyList(), z, previewButton.read.PLAIN, previewButton.IconCompatParcelizer.PLAIN);
    }

    public GiftOpenSharingMomentActivity_ViewBinding(PrivacyManagementLandingViewHolder privacyManagementLandingViewHolder) {
        this(privacyManagementLandingViewHolder, (InetAddress) null, (List<PrivacyManagementLandingViewHolder>) Collections.emptyList(), false, previewButton.read.PLAIN, previewButton.IconCompatParcelizer.PLAIN);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public GiftOpenSharingMomentActivity_ViewBinding(PrivacyManagementLandingViewHolder privacyManagementLandingViewHolder, InetAddress inetAddress, PrivacyManagementLandingViewHolder privacyManagementLandingViewHolder2, boolean z) {
        this(privacyManagementLandingViewHolder, inetAddress, (List<PrivacyManagementLandingViewHolder>) Collections.singletonList(DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(privacyManagementLandingViewHolder2, "Proxy host")), z, z ? previewButton.read.TUNNELLED : previewButton.read.PLAIN, z ? previewButton.IconCompatParcelizer.LAYERED : previewButton.IconCompatParcelizer.PLAIN);
    }

    public final PrivacyManagementLandingViewHolder MediaBrowserCompat$CustomActionResultReceiver() {
        return this.MediaBrowserCompat$ItemReceiver;
    }

    public final InetAddress IconCompatParcelizer() {
        return this.write;
    }

    public final int write() {
        List<PrivacyManagementLandingViewHolder> list = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (list != null) {
            return 1 + list.size();
        }
        return 1;
    }

    public final PrivacyManagementLandingViewHolder write(int i) {
        DepositTransactionAdapter$GroupItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(i, "Hop index");
        List<PrivacyManagementLandingViewHolder> list = this.MediaBrowserCompat$CustomActionResultReceiver;
        int size = list != null ? list.size() + 1 : 1;
        if (i < size) {
            return i < size - 1 ? this.MediaBrowserCompat$CustomActionResultReceiver.get(i) : this.MediaBrowserCompat$ItemReceiver;
        }
        throw new IllegalArgumentException("Hop index exceeds tracked route length");
    }

    public final PrivacyManagementLandingViewHolder read() {
        List<PrivacyManagementLandingViewHolder> list = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return this.MediaBrowserCompat$CustomActionResultReceiver.get(0);
    }

    public final boolean MediaMetadataCompat() {
        return this.IconCompatParcelizer == previewButton.read.TUNNELLED;
    }

    public final boolean MediaBrowserCompat$ItemReceiver() {
        return this.read == previewButton.IconCompatParcelizer.LAYERED;
    }

    public final boolean MediaDescriptionCompat() {
        return this.MediaDescriptionCompat;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GiftOpenSharingMomentActivity_ViewBinding)) {
            return false;
        }
        GiftOpenSharingMomentActivity_ViewBinding giftOpenSharingMomentActivity_ViewBinding = (GiftOpenSharingMomentActivity_ViewBinding) obj;
        if (this.MediaDescriptionCompat == giftOpenSharingMomentActivity_ViewBinding.MediaDescriptionCompat && this.IconCompatParcelizer == giftOpenSharingMomentActivity_ViewBinding.IconCompatParcelizer && this.read == giftOpenSharingMomentActivity_ViewBinding.read) {
            PrivacyManagementLandingViewHolder privacyManagementLandingViewHolder = this.MediaBrowserCompat$ItemReceiver;
            PrivacyManagementLandingViewHolder privacyManagementLandingViewHolder2 = giftOpenSharingMomentActivity_ViewBinding.MediaBrowserCompat$ItemReceiver;
            if (privacyManagementLandingViewHolder == null ? privacyManagementLandingViewHolder2 == null : privacyManagementLandingViewHolder.equals(privacyManagementLandingViewHolder2)) {
                InetAddress inetAddress = this.write;
                InetAddress inetAddress2 = giftOpenSharingMomentActivity_ViewBinding.write;
                if (inetAddress == null ? inetAddress2 == null : inetAddress.equals(inetAddress2)) {
                    List<PrivacyManagementLandingViewHolder> list = this.MediaBrowserCompat$CustomActionResultReceiver;
                    List<PrivacyManagementLandingViewHolder> list2 = giftOpenSharingMomentActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                    if (list == null ? list2 == null : list.equals(list2)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        PrivacyManagementLandingViewHolder privacyManagementLandingViewHolder = this.MediaBrowserCompat$ItemReceiver;
        int i5 = 0;
        if (privacyManagementLandingViewHolder != null) {
            i = privacyManagementLandingViewHolder.hashCode();
        } else {
            i = 0;
        }
        int i6 = i + 629;
        InetAddress inetAddress = this.write;
        if (inetAddress != null) {
            i2 = inetAddress.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (i6 * 37) + i2;
        List<PrivacyManagementLandingViewHolder> list = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (list != null) {
            for (PrivacyManagementLandingViewHolder next : list) {
                if (next != null) {
                    i4 = next.hashCode();
                } else {
                    i4 = 0;
                }
                i7 = (i7 * 37) + i4;
            }
        }
        int i8 = (i7 * 37) + (this.MediaDescriptionCompat ? 1 : 0);
        previewButton.read read2 = this.IconCompatParcelizer;
        if (read2 != null) {
            i3 = read2.hashCode();
        } else {
            i3 = 0;
        }
        int i9 = (i8 * 37) + i3;
        previewButton.IconCompatParcelizer iconCompatParcelizer = this.read;
        if (iconCompatParcelizer != null) {
            i5 = iconCompatParcelizer.hashCode();
        }
        return (i9 * 37) + i5;
    }

    public final String toString() {
        List<PrivacyManagementLandingViewHolder> list = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 1;
        if (list != null) {
            i = 1 + list.size();
        }
        StringBuilder sb = new StringBuilder((i * 30) + 50);
        InetAddress inetAddress = this.write;
        if (inetAddress != null) {
            sb.append(inetAddress);
            sb.append("->");
        }
        sb.append('{');
        if (this.IconCompatParcelizer == previewButton.read.TUNNELLED) {
            sb.append('t');
        }
        if (this.read == previewButton.IconCompatParcelizer.LAYERED) {
            sb.append('l');
        }
        if (this.MediaDescriptionCompat) {
            sb.append('s');
        }
        sb.append("}->");
        List<PrivacyManagementLandingViewHolder> list2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (list2 != null) {
            for (PrivacyManagementLandingViewHolder append : list2) {
                sb.append(append);
                sb.append("->");
            }
        }
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        return sb.toString();
    }

    public final Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
