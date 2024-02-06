package p040o;

import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.scb.phone.R;
import java.io.InputStream;
import java.util.List;
import p040o.nAllocationSetSurface;

/* renamed from: o.setBackgroundDrawable */
public final class setBackgroundDrawable {
    public static final /* synthetic */ int[] $SwitchMap$org$threeten$bp$temporal$ChronoUnit;
    public final List<List<byte[]>> IconCompatParcelizer;
    public final int MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;
    public final String MediaMetadataCompat;
    public final String read;
    public final String write;

    /* renamed from: o.setBackgroundDrawable$IconCompatParcelizer */
    public static final class IconCompatParcelizer {
        public static final int[] CardView = {16843071, 16843072, R.attr.cardBackgroundColor, R.attr.cardCornerRadius, R.attr.cardElevation, R.attr.cardMaxElevation, R.attr.cardPreventCornerOverlap, R.attr.cardUseCompatPadding, R.attr.contentPadding, R.attr.contentPaddingBottom, R.attr.contentPaddingLeft, R.attr.contentPaddingRight, R.attr.contentPaddingTop};
        public static final int CardView_android_minHeight = 1;
        public static final int CardView_android_minWidth = 0;
        public static final int CardView_cardBackgroundColor = 2;
        public static final int CardView_cardCornerRadius = 3;
        public static final int CardView_cardElevation = 4;
        public static final int CardView_cardMaxElevation = 5;
        public static final int CardView_cardPreventCornerOverlap = 6;
        public static final int CardView_cardUseCompatPadding = 7;
        public static final int CardView_contentPadding = 8;
        public static final int CardView_contentPaddingBottom = 9;
        public static final int CardView_contentPaddingLeft = 10;
        public static final int CardView_contentPaddingRight = 11;
        public static final int CardView_contentPaddingTop = 12;
    }

    /* renamed from: o.setBackgroundDrawable$read */
    public static final class read {
        public static final /* synthetic */ int[] $SwitchMap$org$threeten$bp$temporal$ChronoField;
        public static final /* synthetic */ int[] $SwitchMap$org$threeten$bp$temporal$ChronoUnit;
        public static final int cardview_dark_background = 2131099705;
        public static final int cardview_light_background = 2131099706;
        public static final int cardview_shadow_end_color = 2131099707;
        public static final int cardview_shadow_start_color = 2131099708;
        private final ViewGroup MediaBrowserCompat$ItemReceiver;
        public int write;

        public read(ViewGroup viewGroup) {
            this.MediaBrowserCompat$ItemReceiver = viewGroup;
        }

        public read() {
        }

        public static getSubElementOffsetBytes read(InputStream inputStream) {
            getSubElementOffsetBytes getsubelementoffsetbytes = new getSubElementOffsetBytes();
            nContextSendMessage.read(new copyFromUnchecked(inputStream), getsubelementoffsetbytes);
            return getsubelementoffsetbytes;
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(23:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|(2:19|20)|21|23|24|25|26|27|28|29|30|(3:31|32|34)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(25:0|1|2|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|21|23|24|25|26|27|28|29|30|(3:31|32|34)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(28:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|21|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x005a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0064 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x006e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0078 */
        static {
            /*
                o.BillerAdapter$ItemViewHolder_ViewBinding[] r0 = p040o.BillerAdapter$ItemViewHolder_ViewBinding.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$org$threeten$bp$temporal$ChronoUnit = r0
                r1 = 1
                o.BillerAdapter$ItemViewHolder_ViewBinding r2 = p040o.BillerAdapter$ItemViewHolder_ViewBinding.MONTHS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = $SwitchMap$org$threeten$bp$temporal$ChronoUnit     // Catch:{ NoSuchFieldError -> 0x001d }
                o.BillerAdapter$ItemViewHolder_ViewBinding r3 = p040o.BillerAdapter$ItemViewHolder_ViewBinding.YEARS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = $SwitchMap$org$threeten$bp$temporal$ChronoUnit     // Catch:{ NoSuchFieldError -> 0x0028 }
                o.BillerAdapter$ItemViewHolder_ViewBinding r4 = p040o.BillerAdapter$ItemViewHolder_ViewBinding.DECADES     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = $SwitchMap$org$threeten$bp$temporal$ChronoUnit     // Catch:{ NoSuchFieldError -> 0x0033 }
                o.BillerAdapter$ItemViewHolder_ViewBinding r5 = p040o.BillerAdapter$ItemViewHolder_ViewBinding.CENTURIES     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                r4 = 5
                int[] r5 = $SwitchMap$org$threeten$bp$temporal$ChronoUnit     // Catch:{ NoSuchFieldError -> 0x003e }
                o.BillerAdapter$ItemViewHolder_ViewBinding r6 = p040o.BillerAdapter$ItemViewHolder_ViewBinding.MILLENNIA     // Catch:{ NoSuchFieldError -> 0x003e }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r5 = $SwitchMap$org$threeten$bp$temporal$ChronoUnit     // Catch:{ NoSuchFieldError -> 0x0049 }
                o.BillerAdapter$ItemViewHolder_ViewBinding r6 = p040o.BillerAdapter$ItemViewHolder_ViewBinding.ERAS     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r7 = 6
                r5[r6] = r7     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                o.TierPricingInstallmentAdapter$InstallmentViewHolder[] r5 = p040o.TierPricingInstallmentAdapter$InstallmentViewHolder.values()
                int r5 = r5.length
                int[] r5 = new int[r5]
                $SwitchMap$org$threeten$bp$temporal$ChronoField = r5
                o.TierPricingInstallmentAdapter$InstallmentViewHolder r6 = p040o.TierPricingInstallmentAdapter$InstallmentViewHolder.MONTH_OF_YEAR     // Catch:{ NoSuchFieldError -> 0x005a }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x005a }
                r5[r6] = r1     // Catch:{ NoSuchFieldError -> 0x005a }
            L_0x005a:
                int[] r1 = $SwitchMap$org$threeten$bp$temporal$ChronoField     // Catch:{ NoSuchFieldError -> 0x0064 }
                o.TierPricingInstallmentAdapter$InstallmentViewHolder r5 = p040o.TierPricingInstallmentAdapter$InstallmentViewHolder.PROLEPTIC_MONTH     // Catch:{ NoSuchFieldError -> 0x0064 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0064 }
                r1[r5] = r0     // Catch:{ NoSuchFieldError -> 0x0064 }
            L_0x0064:
                int[] r0 = $SwitchMap$org$threeten$bp$temporal$ChronoField     // Catch:{ NoSuchFieldError -> 0x006e }
                o.TierPricingInstallmentAdapter$InstallmentViewHolder r1 = p040o.TierPricingInstallmentAdapter$InstallmentViewHolder.YEAR_OF_ERA     // Catch:{ NoSuchFieldError -> 0x006e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                int[] r0 = $SwitchMap$org$threeten$bp$temporal$ChronoField     // Catch:{ NoSuchFieldError -> 0x0078 }
                o.TierPricingInstallmentAdapter$InstallmentViewHolder r1 = p040o.TierPricingInstallmentAdapter$InstallmentViewHolder.YEAR     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = $SwitchMap$org$threeten$bp$temporal$ChronoField     // Catch:{ NoSuchFieldError -> 0x0082 }
                o.TierPricingInstallmentAdapter$InstallmentViewHolder r1 = p040o.TierPricingInstallmentAdapter$InstallmentViewHolder.ERA     // Catch:{ NoSuchFieldError -> 0x0082 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0082 }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x0082 }
            L_0x0082:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.setBackgroundDrawable.read.<clinit>():void");
        }
    }

    /* renamed from: o.setBackgroundDrawable$write */
    public static final class write {
        public static final /* synthetic */ int[] $SwitchMap$org$threeten$bp$temporal$ChronoField;
        public static final /* synthetic */ int[] $SwitchMap$org$threeten$bp$temporal$ChronoUnit;
        public static final int cardBackgroundColor = 2130968702;
        public static final int cardCornerRadius = 2130968703;
        public static final int cardElevation = 2130968704;
        public static final int cardMaxElevation = 2130968705;
        public static final int cardPreventCornerOverlap = 2130968706;
        public static final int cardUseCompatPadding = 2130968707;
        public static final int cardViewStyle = 2130968708;
        public static final int contentPadding = 2130968827;
        public static final int contentPaddingBottom = 2130968828;
        public static final int contentPaddingLeft = 2130968829;
        public static final int contentPaddingRight = 2130968830;
        public static final int contentPaddingTop = 2130968831;
        private ViewParent IconCompatParcelizer;
        private ViewParent MediaBrowserCompat$CustomActionResultReceiver;
        public final View MediaBrowserCompat$ItemReceiver;
        private int[] read;
        public boolean write;

        public write(View view) {
            this.MediaBrowserCompat$ItemReceiver = view;
        }

        public final boolean MediaBrowserCompat$ItemReceiver(float f, float f2, boolean z) {
            ViewParent viewParent;
            if (!this.write || (viewParent = this.MediaBrowserCompat$CustomActionResultReceiver) == null) {
                return false;
            }
            return setSwitchTextAppearance.IconCompatParcelizer(viewParent, this.MediaBrowserCompat$ItemReceiver, f, f2, z);
        }

        public final boolean MediaBrowserCompat$ItemReceiver(float f, float f2) {
            ViewParent viewParent;
            if (!this.write || (viewParent = this.MediaBrowserCompat$CustomActionResultReceiver) == null) {
                return false;
            }
            return setSwitchTextAppearance.MediaBrowserCompat$CustomActionResultReceiver(viewParent, this.MediaBrowserCompat$ItemReceiver, f, f2);
        }

        public final boolean MediaBrowserCompat$ItemReceiver(int i, int i2, int[] iArr, int[] iArr2, int i3) {
            ViewParent viewParent;
            int i4;
            int i5;
            if (this.write) {
                if (i3 != 0) {
                    viewParent = i3 != 1 ? null : this.IconCompatParcelizer;
                } else {
                    viewParent = this.MediaBrowserCompat$CustomActionResultReceiver;
                }
                ViewParent viewParent2 = viewParent;
                if (viewParent2 == null) {
                    return false;
                }
                if (i != 0 || i2 != 0) {
                    if (iArr2 != null) {
                        this.MediaBrowserCompat$ItemReceiver.getLocationInWindow(iArr2);
                        i5 = iArr2[0];
                        i4 = iArr2[1];
                    } else {
                        i5 = 0;
                        i4 = 0;
                    }
                    if (iArr == null) {
                        if (this.read == null) {
                            this.read = new int[2];
                        }
                        iArr = this.read;
                    }
                    iArr[0] = 0;
                    iArr[1] = 0;
                    setSwitchTextAppearance.write(viewParent2, this.MediaBrowserCompat$ItemReceiver, i, i2, iArr, i3);
                    if (iArr2 != null) {
                        this.MediaBrowserCompat$ItemReceiver.getLocationInWindow(iArr2);
                        iArr2[0] = iArr2[0] - i5;
                        iArr2[1] = iArr2[1] - i4;
                    }
                    if (!(iArr[0] == 0 && iArr[1] == 0)) {
                        return true;
                    }
                } else if (iArr2 != null) {
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                }
            }
            return false;
        }

        public final boolean IconCompatParcelizer(int i, int i2, int i3, int i4, int[] iArr, int i5) {
            ViewParent viewParent;
            int i6;
            int i7;
            int[] iArr2 = iArr;
            int i8 = i5;
            if (this.write) {
                if (i8 != 0) {
                    viewParent = i8 != 1 ? null : this.IconCompatParcelizer;
                } else {
                    viewParent = this.MediaBrowserCompat$CustomActionResultReceiver;
                }
                if (viewParent == null) {
                    return false;
                }
                if (i != 0 || i2 != 0 || i3 != 0 || i4 != 0) {
                    if (iArr2 != null) {
                        this.MediaBrowserCompat$ItemReceiver.getLocationInWindow(iArr2);
                        i7 = iArr2[0];
                        i6 = iArr2[1];
                    } else {
                        i7 = 0;
                        i6 = 0;
                    }
                    setSwitchTextAppearance.MediaBrowserCompat$ItemReceiver(viewParent, this.MediaBrowserCompat$ItemReceiver, i, i2, i3, i4, i5);
                    if (iArr2 != null) {
                        this.MediaBrowserCompat$ItemReceiver.getLocationInWindow(iArr2);
                        iArr2[0] = iArr2[0] - i7;
                        iArr2[1] = iArr2[1] - i6;
                    }
                    return true;
                } else if (iArr2 != null) {
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                }
            }
            return false;
        }

        public final boolean MediaBrowserCompat$CustomActionResultReceiver(int i) {
            ViewParent viewParent;
            if (i != 0) {
                viewParent = i != 1 ? null : this.IconCompatParcelizer;
            } else {
                viewParent = this.MediaBrowserCompat$CustomActionResultReceiver;
            }
            if (viewParent != null) {
                return true;
            }
            return false;
        }

        public final boolean MediaBrowserCompat$CustomActionResultReceiver(int i, int i2) {
            if (MediaBrowserCompat$CustomActionResultReceiver(i2)) {
                return true;
            }
            if (!this.write) {
                return false;
            }
            View view = this.MediaBrowserCompat$ItemReceiver;
            for (ViewParent parent = this.MediaBrowserCompat$ItemReceiver.getParent(); parent != null; parent = parent.getParent()) {
                if (setSwitchTextAppearance.write(parent, view, this.MediaBrowserCompat$ItemReceiver, i, i2)) {
                    if (i2 == 0) {
                        this.MediaBrowserCompat$CustomActionResultReceiver = parent;
                    } else if (i2 == 1) {
                        this.IconCompatParcelizer = parent;
                    }
                    setSwitchTextAppearance.read(parent, view, this.MediaBrowserCompat$ItemReceiver, i, i2);
                    return true;
                }
                if (parent instanceof View) {
                    view = (View) parent;
                }
            }
            return false;
        }

        public final void write(int i) {
            ViewParent viewParent;
            if (i != 0) {
                viewParent = i != 1 ? null : this.IconCompatParcelizer;
            } else {
                viewParent = this.MediaBrowserCompat$CustomActionResultReceiver;
            }
            if (viewParent != null) {
                setSwitchTextAppearance.MediaBrowserCompat$ItemReceiver(viewParent, this.MediaBrowserCompat$ItemReceiver, i);
                if (i == 0) {
                    this.MediaBrowserCompat$CustomActionResultReceiver = null;
                } else if (i == 1) {
                    this.IconCompatParcelizer = null;
                }
            }
        }

        public write() {
        }

        public static getSubElementOffsetBytes MediaBrowserCompat$CustomActionResultReceiver(InputStream inputStream) {
            getSubElementOffsetBytes getsubelementoffsetbytes = new getSubElementOffsetBytes();
            nAllocationSetSurface.RatingCompat.MediaBrowserCompat$ItemReceiver(new copyFromUnchecked(inputStream), getsubelementoffsetbytes);
            return getsubelementoffsetbytes;
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|14|15|17|18|19|20|(3:21|22|24)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|(2:1|2)|3|5|6|7|9|10|11|12|13|14|15|17|18|19|20|(3:21|22|24)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(21:0|1|2|3|5|6|7|9|10|11|12|13|14|15|17|18|19|20|21|22|24) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0033 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0059 */
        static {
            /*
                o.BillerAdapter$ItemViewHolder_ViewBinding[] r0 = p040o.BillerAdapter$ItemViewHolder_ViewBinding.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$org$threeten$bp$temporal$ChronoUnit = r0
                r1 = 1
                o.BillerAdapter$ItemViewHolder_ViewBinding r2 = p040o.BillerAdapter$ItemViewHolder_ViewBinding.YEARS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = $SwitchMap$org$threeten$bp$temporal$ChronoUnit     // Catch:{ NoSuchFieldError -> 0x001d }
                o.BillerAdapter$ItemViewHolder_ViewBinding r3 = p040o.BillerAdapter$ItemViewHolder_ViewBinding.DECADES     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = $SwitchMap$org$threeten$bp$temporal$ChronoUnit     // Catch:{ NoSuchFieldError -> 0x0028 }
                o.BillerAdapter$ItemViewHolder_ViewBinding r4 = p040o.BillerAdapter$ItemViewHolder_ViewBinding.CENTURIES     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r3 = $SwitchMap$org$threeten$bp$temporal$ChronoUnit     // Catch:{ NoSuchFieldError -> 0x0033 }
                o.BillerAdapter$ItemViewHolder_ViewBinding r4 = p040o.BillerAdapter$ItemViewHolder_ViewBinding.MILLENNIA     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r5 = 4
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r3 = $SwitchMap$org$threeten$bp$temporal$ChronoUnit     // Catch:{ NoSuchFieldError -> 0x003e }
                o.BillerAdapter$ItemViewHolder_ViewBinding r4 = p040o.BillerAdapter$ItemViewHolder_ViewBinding.ERAS     // Catch:{ NoSuchFieldError -> 0x003e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5 = 5
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                o.TierPricingInstallmentAdapter$InstallmentViewHolder[] r3 = p040o.TierPricingInstallmentAdapter$InstallmentViewHolder.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                $SwitchMap$org$threeten$bp$temporal$ChronoField = r3
                o.TierPricingInstallmentAdapter$InstallmentViewHolder r4 = p040o.TierPricingInstallmentAdapter$InstallmentViewHolder.YEAR_OF_ERA     // Catch:{ NoSuchFieldError -> 0x004f }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004f }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x004f }
            L_0x004f:
                int[] r1 = $SwitchMap$org$threeten$bp$temporal$ChronoField     // Catch:{ NoSuchFieldError -> 0x0059 }
                o.TierPricingInstallmentAdapter$InstallmentViewHolder r3 = p040o.TierPricingInstallmentAdapter$InstallmentViewHolder.YEAR     // Catch:{ NoSuchFieldError -> 0x0059 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0059 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0059 }
            L_0x0059:
                int[] r0 = $SwitchMap$org$threeten$bp$temporal$ChronoField     // Catch:{ NoSuchFieldError -> 0x0063 }
                o.TierPricingInstallmentAdapter$InstallmentViewHolder r1 = p040o.TierPricingInstallmentAdapter$InstallmentViewHolder.ERA     // Catch:{ NoSuchFieldError -> 0x0063 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0063 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0063 }
            L_0x0063:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.setBackgroundDrawable.write.<clinit>():void");
        }
    }

    public setBackgroundDrawable(String str, String str2, String str3, List<List<byte[]>> list) {
        if (str != null) {
            String str4 = str;
            this.write = str4;
            if (str2 != null) {
                this.MediaBrowserCompat$ItemReceiver = str2;
                if (str3 != null) {
                    this.MediaMetadataCompat = str3;
                    if (list != null) {
                        this.IconCompatParcelizer = list;
                        this.MediaBrowserCompat$CustomActionResultReceiver = 0;
                        StringBuilder sb = new StringBuilder(str4);
                        sb.append("-");
                        sb.append(this.MediaBrowserCompat$ItemReceiver);
                        sb.append("-");
                        sb.append(this.MediaMetadataCompat);
                        this.read = sb.toString();
                        return;
                    }
                    throw null;
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FontRequest {mProviderAuthority: ");
        sb2.append(this.write);
        sb2.append(", mProviderPackage: ");
        sb2.append(this.MediaBrowserCompat$ItemReceiver);
        sb2.append(", mQuery: ");
        sb2.append(this.MediaMetadataCompat);
        sb2.append(", mCertificates:");
        sb.append(sb2.toString());
        for (int i = 0; i < this.IconCompatParcelizer.size(); i++) {
            sb.append(" [");
            List list = this.IconCompatParcelizer.get(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        StringBuilder sb3 = new StringBuilder();
        sb3.append("mCertificatesArray: ");
        sb3.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(sb3.toString());
        return sb.toString();
    }

    public setBackgroundDrawable() {
    }

    public static getSubElementOffsetBytes write(InputStream inputStream) {
        getSubElementOffsetBytes getsubelementoffsetbytes = new getSubElementOffsetBytes();
        C1390x230a8146.IconCompatParcelizer(new copyFromUnchecked(inputStream), getsubelementoffsetbytes);
        return getsubelementoffsetbytes;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
    /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
    static {
        /*
            o.BillerAdapter$ItemViewHolder_ViewBinding[] r0 = p040o.BillerAdapter$ItemViewHolder_ViewBinding.values()
            int r0 = r0.length
            int[] r0 = new int[r0]
            $SwitchMap$org$threeten$bp$temporal$ChronoUnit = r0
            o.BillerAdapter$ItemViewHolder_ViewBinding r1 = p040o.BillerAdapter$ItemViewHolder_ViewBinding.NANOS     // Catch:{ NoSuchFieldError -> 0x0012 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
            r2 = 1
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
        L_0x0012:
            int[] r0 = $SwitchMap$org$threeten$bp$temporal$ChronoUnit     // Catch:{ NoSuchFieldError -> 0x001d }
            o.BillerAdapter$ItemViewHolder_ViewBinding r1 = p040o.BillerAdapter$ItemViewHolder_ViewBinding.MICROS     // Catch:{ NoSuchFieldError -> 0x001d }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
            r2 = 2
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
        L_0x001d:
            int[] r0 = $SwitchMap$org$threeten$bp$temporal$ChronoUnit     // Catch:{ NoSuchFieldError -> 0x0028 }
            o.BillerAdapter$ItemViewHolder_ViewBinding r1 = p040o.BillerAdapter$ItemViewHolder_ViewBinding.MILLIS     // Catch:{ NoSuchFieldError -> 0x0028 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
            r2 = 3
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
        L_0x0028:
            int[] r0 = $SwitchMap$org$threeten$bp$temporal$ChronoUnit     // Catch:{ NoSuchFieldError -> 0x0033 }
            o.BillerAdapter$ItemViewHolder_ViewBinding r1 = p040o.BillerAdapter$ItemViewHolder_ViewBinding.SECONDS     // Catch:{ NoSuchFieldError -> 0x0033 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
            r2 = 4
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
        L_0x0033:
            int[] r0 = $SwitchMap$org$threeten$bp$temporal$ChronoUnit     // Catch:{ NoSuchFieldError -> 0x003e }
            o.BillerAdapter$ItemViewHolder_ViewBinding r1 = p040o.BillerAdapter$ItemViewHolder_ViewBinding.MINUTES     // Catch:{ NoSuchFieldError -> 0x003e }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
            r2 = 5
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
        L_0x003e:
            int[] r0 = $SwitchMap$org$threeten$bp$temporal$ChronoUnit     // Catch:{ NoSuchFieldError -> 0x0049 }
            o.BillerAdapter$ItemViewHolder_ViewBinding r1 = p040o.BillerAdapter$ItemViewHolder_ViewBinding.HOURS     // Catch:{ NoSuchFieldError -> 0x0049 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
            r2 = 6
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
        L_0x0049:
            int[] r0 = $SwitchMap$org$threeten$bp$temporal$ChronoUnit     // Catch:{ NoSuchFieldError -> 0x0054 }
            o.BillerAdapter$ItemViewHolder_ViewBinding r1 = p040o.BillerAdapter$ItemViewHolder_ViewBinding.HALF_DAYS     // Catch:{ NoSuchFieldError -> 0x0054 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
            r2 = 7
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
        L_0x0054:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.setBackgroundDrawable.<clinit>():void");
    }
}
