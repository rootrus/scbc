package p040o;

import com.scb.phone.view.activity.transferandpay.billpayment.BillPaymentSearchActivity$MediaBrowserCompat$ItemReceiver;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: o.GoogleApiClient */
public final class GoogleApiClient implements OPRStatusRewardsLandingActivity_ViewBinding<zak> {
    private static final GoogleApiClient write = new GoogleApiClient();

    /* renamed from: o.GoogleApiClient$Builder */
    public final class Builder extends FragmentBuilder_BindSummaryFragment {

        /* renamed from: o.GoogleApiClient$Builder$IconCompatParcelizer */
        public static final class IconCompatParcelizer {
            private final getZEnd IconCompatParcelizer;
            public final int[] read;

            private IconCompatParcelizer() {
            }

            public IconCompatParcelizer(getZEnd getzend, int[] iArr) {
                if (iArr.length != 0) {
                    this.IconCompatParcelizer = getzend;
                    int length = iArr.length;
                    if (length <= 1 || iArr[0] != 0) {
                        this.read = iArr;
                        return;
                    }
                    int i = 1;
                    while (i < length && iArr[i] == 0) {
                        i++;
                    }
                    if (i == length) {
                        this.read = new int[]{0};
                        return;
                    }
                    int i2 = length - i;
                    int[] iArr2 = new int[i2];
                    this.read = iArr2;
                    System.arraycopy(iArr, i, iArr2, 0, i2);
                    return;
                }
                throw new IllegalArgumentException();
            }

            public final IconCompatParcelizer IconCompatParcelizer(IconCompatParcelizer iconCompatParcelizer) {
                if (this.IconCompatParcelizer.equals(iconCompatParcelizer.IconCompatParcelizer)) {
                    boolean z = true;
                    if (this.read[0] == 0) {
                        return iconCompatParcelizer;
                    }
                    if (iconCompatParcelizer.read[0] != 0) {
                        z = false;
                    }
                    if (z) {
                        return this;
                    }
                    int[] iArr = this.read;
                    int[] iArr2 = iconCompatParcelizer.read;
                    if (iArr.length <= iArr2.length) {
                        int[] iArr3 = iArr;
                        iArr = iArr2;
                        iArr2 = iArr3;
                    }
                    int[] iArr4 = new int[iArr.length];
                    int length = iArr.length - iArr2.length;
                    System.arraycopy(iArr, 0, iArr4, 0, length);
                    for (int i = length; i < iArr.length; i++) {
                        iArr4[i] = (iArr2[i - length] + iArr[i]) % 929;
                    }
                    return new IconCompatParcelizer(this.IconCompatParcelizer, iArr4);
                }
                throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
            }

            public final int MediaBrowserCompat$CustomActionResultReceiver(int i) {
                if (i == 0) {
                    int[] iArr = this.read;
                    return iArr[(iArr.length - 1) - 0];
                } else if (i == 1) {
                    int i2 = 0;
                    for (int i3 : this.read) {
                        i2 = (i2 + i3) % 929;
                    }
                    return i2;
                } else {
                    int[] iArr2 = this.read;
                    int i4 = iArr2[0];
                    int length = iArr2.length;
                    for (int i5 = 1; i5 < length; i5++) {
                        i4 = (this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(i, i4) + this.read[i5]) % 929;
                    }
                    return i4;
                }
            }

            public final IconCompatParcelizer MediaBrowserCompat$ItemReceiver(int i) {
                if (i == 0) {
                    return this.IconCompatParcelizer.MediaBrowserCompat$MediaItem;
                }
                if (i == 1) {
                    return this;
                }
                int length = this.read.length;
                int[] iArr = new int[length];
                for (int i2 = 0; i2 < length; i2++) {
                    iArr[i2] = this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(this.read[i2], i);
                }
                return new IconCompatParcelizer(this.IconCompatParcelizer, iArr);
            }

            public final IconCompatParcelizer read(IconCompatParcelizer iconCompatParcelizer) {
                if (this.IconCompatParcelizer.equals(iconCompatParcelizer.IconCompatParcelizer)) {
                    if (!(this.read[0] == 0)) {
                        if (!(iconCompatParcelizer.read[0] == 0)) {
                            int[] iArr = this.read;
                            int length = iArr.length;
                            int[] iArr2 = iconCompatParcelizer.read;
                            int length2 = iArr2.length;
                            int[] iArr3 = new int[((length + length2) - 1)];
                            for (int i = 0; i < length; i++) {
                                int i2 = iArr[i];
                                for (int i3 = 0; i3 < length2; i3++) {
                                    int i4 = i + i3;
                                    iArr3[i4] = (iArr3[i4] + this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(i2, iArr2[i3])) % 929;
                                }
                            }
                            return new IconCompatParcelizer(this.IconCompatParcelizer, iArr3);
                        }
                    }
                    return this.IconCompatParcelizer.MediaBrowserCompat$MediaItem;
                }
                throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
            }

            public final IconCompatParcelizer IconCompatParcelizer(int i, int i2) {
                if (i < 0) {
                    throw new IllegalArgumentException();
                } else if (i2 == 0) {
                    return this.IconCompatParcelizer.MediaBrowserCompat$MediaItem;
                } else {
                    int length = this.read.length;
                    int[] iArr = new int[(i + length)];
                    for (int i3 = 0; i3 < length; i3++) {
                        iArr[i3] = this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(this.read[i3], i2);
                    }
                    return new IconCompatParcelizer(this.IconCompatParcelizer, iArr);
                }
            }

            public final IconCompatParcelizer write() {
                int length = this.read.length;
                int[] iArr = new int[length];
                for (int i = 0; i < length; i++) {
                    iArr[i] = (929 - this.read[i]) % 929;
                }
                return new IconCompatParcelizer(this.IconCompatParcelizer, iArr);
            }

            public final IconCompatParcelizer write(IconCompatParcelizer iconCompatParcelizer) {
                if (this.IconCompatParcelizer.equals(iconCompatParcelizer.IconCompatParcelizer)) {
                    boolean z = false;
                    if (iconCompatParcelizer.read[0] == 0) {
                        z = true;
                    }
                    if (z) {
                        return this;
                    }
                    return IconCompatParcelizer(iconCompatParcelizer.write());
                }
                throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder((this.read.length - 1) << 3);
                for (int length = this.read.length - 1; length >= 0; length--) {
                    int[] iArr = this.read;
                    int i = iArr[(iArr.length - 1) - length];
                    if (i != 0) {
                        if (i < 0) {
                            sb.append(" - ");
                            i = -i;
                        } else if (sb.length() > 0) {
                            sb.append(" + ");
                        }
                        if (length == 0 || i != 1) {
                            sb.append(i);
                        }
                        if (length != 0) {
                            if (length == 1) {
                                sb.append('x');
                            } else {
                                sb.append("x^");
                                sb.append(length);
                            }
                        }
                    }
                }
                return sb.toString();
            }
        }
    }

    /* renamed from: o.GoogleApiClient$ConnectionCallbacks */
    public final class ConnectionCallbacks implements OPRStatusRewardsLandingActivity_ViewBinding<buildClientSettings> {
        private static final ConnectionCallbacks read = new ConnectionCallbacks();

        public static ConnectionCallbacks IconCompatParcelizer() {
            return read;
        }

        public final /* synthetic */ Object get() {
            return new buildClientSettings();
        }
    }

    /* renamed from: o.GoogleApiClient$OnConnectionFailedListener */
    public final class OnConnectionFailedListener extends FragmentBuilder_BindSummaryFragment {
        public static List<setTrafficEnabled> IconCompatParcelizer(List<saveLayerCompat> list) {
            Iterable<saveLayerCompat> iterable = list;
            onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
            Collection arrayList = new ArrayList(iterable instanceof Collection ? ((Collection) iterable).size() : 10);
            for (saveLayerCompat savelayercompat : iterable) {
                String str = savelayercompat.IconCompatParcelizer;
                String str2 = savelayercompat.read;
                String str3 = "";
                String str4 = str2 == null ? str3 : str2;
                String str5 = savelayercompat.MediaMetadataCompat;
                getStartValueInt getstartvalueint = savelayercompat.MediaSessionCompat$QueueItem;
                String str6 = null;
                String str7 = getstartvalueint != null ? getstartvalueint.IconCompatParcelizer : null;
                if (str7 == null) {
                    str7 = str3;
                }
                if (getstartvalueint != null) {
                    str6 = getstartvalueint.MediaBrowserCompat$CustomActionResultReceiver;
                }
                if (str6 != null) {
                    str3 = str6;
                }
                BillPaymentSearchActivity$MediaBrowserCompat$ItemReceiver billPaymentSearchActivity$MediaBrowserCompat$ItemReceiver = new BillPaymentSearchActivity$MediaBrowserCompat$ItemReceiver(str7, str3);
                String str8 = savelayercompat.MediaBrowserCompat$CustomActionResultReceiver;
                List<String> list2 = savelayercompat.write;
                if (list2 == null) {
                    list2 = HmlNationalIdActivity.IconCompatParcelizer;
                }
                arrayList.add(new setTrafficEnabled(str, str4, str5, billPaymentSearchActivity$MediaBrowserCompat$ItemReceiver, str8, list2));
            }
            return (List) arrayList;
        }
    }

    public static GoogleApiClient MediaBrowserCompat$CustomActionResultReceiver() {
        return write;
    }

    public final /* synthetic */ Object get() {
        return new zak();
    }
}
