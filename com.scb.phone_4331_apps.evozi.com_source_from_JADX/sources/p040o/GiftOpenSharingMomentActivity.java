package p040o;

import java.net.InetAddress;
import org.apache.http.HttpException;
import p040o.previewButton;

@Deprecated
/* renamed from: o.GiftOpenSharingMomentActivity */
public final class GiftOpenSharingMomentActivity {
    private static GiftOpenSharingMomentActivity_ViewBinding IconCompatParcelizer;
    private static PrivacyManagementLandingViewHolder read;

    /* renamed from: o.GiftOpenSharingMomentActivity$SharedMoment */
    public interface SharedMoment {
        GiftOpenSharingMomentActivity_ViewBinding MediaBrowserCompat$ItemReceiver(PrivacyManagementLandingViewHolder privacyManagementLandingViewHolder, PrivacyConsentActivity privacyConsentActivity) throws HttpException;
    }

    static {
        PrivacyManagementLandingViewHolder privacyManagementLandingViewHolder = new PrivacyManagementLandingViewHolder("127.0.0.255", 0, "no-host");
        read = privacyManagementLandingViewHolder;
        IconCompatParcelizer = new GiftOpenSharingMomentActivity_ViewBinding(privacyManagementLandingViewHolder);
    }

    /* renamed from: o.GiftOpenSharingMomentActivity$SharedMoment_ViewBinding */
    public final class SharedMoment_ViewBinding implements previewButton, Cloneable {
        public boolean IconCompatParcelizer;
        public previewButton.IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver;
        public PrivacyManagementLandingViewHolder[] MediaBrowserCompat$ItemReceiver;
        public previewButton.read MediaBrowserCompat$SearchResultReceiver;
        public final PrivacyManagementLandingViewHolder MediaMetadataCompat;
        public final InetAddress read;
        public boolean write;

        private SharedMoment_ViewBinding(PrivacyManagementLandingViewHolder privacyManagementLandingViewHolder, InetAddress inetAddress) {
            DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(privacyManagementLandingViewHolder, "Target host");
            this.MediaMetadataCompat = privacyManagementLandingViewHolder;
            this.read = inetAddress;
            this.MediaBrowserCompat$SearchResultReceiver = previewButton.read.PLAIN;
            this.MediaBrowserCompat$CustomActionResultReceiver = previewButton.IconCompatParcelizer.PLAIN;
        }

        public final PrivacyManagementLandingViewHolder MediaBrowserCompat$CustomActionResultReceiver() {
            return this.MediaMetadataCompat;
        }

        public final InetAddress IconCompatParcelizer() {
            return this.read;
        }

        public final int write() {
            if (!this.IconCompatParcelizer) {
                return 0;
            }
            PrivacyManagementLandingViewHolder[] privacyManagementLandingViewHolderArr = this.MediaBrowserCompat$ItemReceiver;
            if (privacyManagementLandingViewHolderArr != null) {
                return 1 + privacyManagementLandingViewHolderArr.length;
            }
            return 1;
        }

        public final PrivacyManagementLandingViewHolder write(int i) {
            int i2;
            DepositTransactionAdapter$GroupItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(i, "Hop index");
            boolean z = false;
            if (this.IconCompatParcelizer) {
                PrivacyManagementLandingViewHolder[] privacyManagementLandingViewHolderArr = this.MediaBrowserCompat$ItemReceiver;
                i2 = privacyManagementLandingViewHolderArr != null ? privacyManagementLandingViewHolderArr.length + 1 : 1;
            } else {
                i2 = 0;
            }
            if (i < i2) {
                z = true;
            }
            if (!z) {
                throw new IllegalArgumentException("Hop index exceeds tracked route length");
            } else if (i < i2 - 1) {
                return this.MediaBrowserCompat$ItemReceiver[i];
            } else {
                return this.MediaMetadataCompat;
            }
        }

        public final PrivacyManagementLandingViewHolder read() {
            PrivacyManagementLandingViewHolder[] privacyManagementLandingViewHolderArr = this.MediaBrowserCompat$ItemReceiver;
            if (privacyManagementLandingViewHolderArr == null) {
                return null;
            }
            return privacyManagementLandingViewHolderArr[0];
        }

        public final boolean MediaMetadataCompat() {
            return this.MediaBrowserCompat$SearchResultReceiver == previewButton.read.TUNNELLED;
        }

        public final boolean MediaBrowserCompat$ItemReceiver() {
            return this.MediaBrowserCompat$CustomActionResultReceiver == previewButton.IconCompatParcelizer.LAYERED;
        }

        public final boolean MediaDescriptionCompat() {
            return this.write;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SharedMoment_ViewBinding)) {
                return false;
            }
            SharedMoment_ViewBinding sharedMoment_ViewBinding = (SharedMoment_ViewBinding) obj;
            if (this.IconCompatParcelizer == sharedMoment_ViewBinding.IconCompatParcelizer && this.write == sharedMoment_ViewBinding.write && this.MediaBrowserCompat$SearchResultReceiver == sharedMoment_ViewBinding.MediaBrowserCompat$SearchResultReceiver && this.MediaBrowserCompat$CustomActionResultReceiver == sharedMoment_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver) {
                PrivacyManagementLandingViewHolder privacyManagementLandingViewHolder = this.MediaMetadataCompat;
                PrivacyManagementLandingViewHolder privacyManagementLandingViewHolder2 = sharedMoment_ViewBinding.MediaMetadataCompat;
                if (privacyManagementLandingViewHolder == null ? privacyManagementLandingViewHolder2 == null : privacyManagementLandingViewHolder.equals(privacyManagementLandingViewHolder2)) {
                    InetAddress inetAddress = this.read;
                    InetAddress inetAddress2 = sharedMoment_ViewBinding.read;
                    if ((inetAddress == null ? inetAddress2 == null : inetAddress.equals(inetAddress2)) && AlertController$RecycleListView$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer((Object[]) this.MediaBrowserCompat$ItemReceiver, (Object[]) sharedMoment_ViewBinding.MediaBrowserCompat$ItemReceiver)) {
                        return true;
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
            PrivacyManagementLandingViewHolder privacyManagementLandingViewHolder = this.MediaMetadataCompat;
            int i5 = 0;
            if (privacyManagementLandingViewHolder != null) {
                i = privacyManagementLandingViewHolder.hashCode();
            } else {
                i = 0;
            }
            int i6 = i + 629;
            InetAddress inetAddress = this.read;
            if (inetAddress != null) {
                i2 = inetAddress.hashCode();
            } else {
                i2 = 0;
            }
            int i7 = (i6 * 37) + i2;
            PrivacyManagementLandingViewHolder[] privacyManagementLandingViewHolderArr = this.MediaBrowserCompat$ItemReceiver;
            if (privacyManagementLandingViewHolderArr != null) {
                for (PrivacyManagementLandingViewHolder privacyManagementLandingViewHolder2 : privacyManagementLandingViewHolderArr) {
                    if (privacyManagementLandingViewHolder2 != null) {
                        i4 = privacyManagementLandingViewHolder2.hashCode();
                    } else {
                        i4 = 0;
                    }
                    i7 = (i7 * 37) + i4;
                }
            }
            int i8 = (((i7 * 37) + (this.IconCompatParcelizer ? 1 : 0)) * 37) + (this.write ? 1 : 0);
            previewButton.read read2 = this.MediaBrowserCompat$SearchResultReceiver;
            if (read2 != null) {
                i3 = read2.hashCode();
            } else {
                i3 = 0;
            }
            int i9 = (i8 * 37) + i3;
            previewButton.IconCompatParcelizer iconCompatParcelizer = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (iconCompatParcelizer != null) {
                i5 = iconCompatParcelizer.hashCode();
            }
            return (i9 * 37) + i5;
        }

        public final String toString() {
            int i = 1;
            if (this.IconCompatParcelizer) {
                PrivacyManagementLandingViewHolder[] privacyManagementLandingViewHolderArr = this.MediaBrowserCompat$ItemReceiver;
                if (privacyManagementLandingViewHolderArr != null) {
                    i = 1 + privacyManagementLandingViewHolderArr.length;
                }
            } else {
                i = 0;
            }
            StringBuilder sb = new StringBuilder((i * 30) + 50);
            sb.append("RouteTracker[");
            InetAddress inetAddress = this.read;
            if (inetAddress != null) {
                sb.append(inetAddress);
                sb.append("->");
            }
            sb.append('{');
            if (this.IconCompatParcelizer) {
                sb.append('c');
            }
            if (this.MediaBrowserCompat$SearchResultReceiver == previewButton.read.TUNNELLED) {
                sb.append('t');
            }
            if (this.MediaBrowserCompat$CustomActionResultReceiver == previewButton.IconCompatParcelizer.LAYERED) {
                sb.append('l');
            }
            if (this.write) {
                sb.append('s');
            }
            sb.append("}->");
            PrivacyManagementLandingViewHolder[] privacyManagementLandingViewHolderArr2 = this.MediaBrowserCompat$ItemReceiver;
            if (privacyManagementLandingViewHolderArr2 != null) {
                for (PrivacyManagementLandingViewHolder append : privacyManagementLandingViewHolderArr2) {
                    sb.append(append);
                    sb.append("->");
                }
            }
            sb.append(this.MediaMetadataCompat);
            sb.append(']');
            return sb.toString();
        }

        public final Object clone() throws CloneNotSupportedException {
            return super.clone();
        }

        public SharedMoment_ViewBinding(GiftOpenSharingMomentActivity_ViewBinding giftOpenSharingMomentActivity_ViewBinding) {
            this(giftOpenSharingMomentActivity_ViewBinding.MediaBrowserCompat$ItemReceiver, giftOpenSharingMomentActivity_ViewBinding.write);
        }
    }

    public static PrivacyManagementLandingViewHolder MediaBrowserCompat$CustomActionResultReceiver(AmountDetailsSuccessAdapter$SuccessRow_ViewBinding amountDetailsSuccessAdapter$SuccessRow_ViewBinding) {
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(amountDetailsSuccessAdapter$SuccessRow_ViewBinding, "Parameters");
        PrivacyManagementLandingViewHolder privacyManagementLandingViewHolder = (PrivacyManagementLandingViewHolder) amountDetailsSuccessAdapter$SuccessRow_ViewBinding.IconCompatParcelizer("http.route.default-proxy");
        if (privacyManagementLandingViewHolder == null || !read.equals(privacyManagementLandingViewHolder)) {
            return privacyManagementLandingViewHolder;
        }
        return null;
    }

    public static GiftOpenSharingMomentActivity_ViewBinding MediaBrowserCompat$ItemReceiver(AmountDetailsSuccessAdapter$SuccessRow_ViewBinding amountDetailsSuccessAdapter$SuccessRow_ViewBinding) {
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(amountDetailsSuccessAdapter$SuccessRow_ViewBinding, "Parameters");
        GiftOpenSharingMomentActivity_ViewBinding giftOpenSharingMomentActivity_ViewBinding = (GiftOpenSharingMomentActivity_ViewBinding) amountDetailsSuccessAdapter$SuccessRow_ViewBinding.IconCompatParcelizer("http.route.forced-route");
        if (giftOpenSharingMomentActivity_ViewBinding == null || !IconCompatParcelizer.equals(giftOpenSharingMomentActivity_ViewBinding)) {
            return giftOpenSharingMomentActivity_ViewBinding;
        }
        return null;
    }

    public static InetAddress IconCompatParcelizer(AmountDetailsSuccessAdapter$SuccessRow_ViewBinding amountDetailsSuccessAdapter$SuccessRow_ViewBinding) {
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(amountDetailsSuccessAdapter$SuccessRow_ViewBinding, "Parameters");
        return (InetAddress) amountDetailsSuccessAdapter$SuccessRow_ViewBinding.IconCompatParcelizer("http.route.local-address");
    }
}
