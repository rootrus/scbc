package p040o;

import com.thunderhead.android.domain.authentication.AuthenticationAccessToken;
import com.thunderhead.android.domain.authentication.ClientCredentials;

/* renamed from: o.FragmentBuilder_BindMwShopAddressStandAloneFragment */
public final class FragmentBuilder_BindMwShopAddressStandAloneFragment {
    final Integer IconCompatParcelizer;
    final ClientCredentials MediaBrowserCompat$CustomActionResultReceiver;
    final boolean MediaBrowserCompat$ItemReceiver;
    final boolean MediaBrowserCompat$MediaItem;
    private final FragmentBuilder_BindMerchantWalletSelectorFragment MediaBrowserCompat$SearchResultReceiver;
    private final boolean MediaMetadataCompat;
    final Throwable RatingCompat;
    final boolean read;
    final AuthenticationAccessToken write;

    public FragmentBuilder_BindMwShopAddressStandAloneFragment() {
        this(false, false, (AuthenticationAccessToken) null, (ClientCredentials) null, false, (FragmentBuilder_BindMerchantWalletSelectorFragment) null, (Throwable) null, (Integer) null, false, 511);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FragmentBuilder_BindMwShopAddressStandAloneFragment)) {
            return false;
        }
        FragmentBuilder_BindMwShopAddressStandAloneFragment fragmentBuilder_BindMwShopAddressStandAloneFragment = (FragmentBuilder_BindMwShopAddressStandAloneFragment) obj;
        return this.MediaBrowserCompat$MediaItem == fragmentBuilder_BindMwShopAddressStandAloneFragment.MediaBrowserCompat$MediaItem && this.MediaMetadataCompat == fragmentBuilder_BindMwShopAddressStandAloneFragment.MediaMetadataCompat && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) fragmentBuilder_BindMwShopAddressStandAloneFragment.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) fragmentBuilder_BindMwShopAddressStandAloneFragment.MediaBrowserCompat$CustomActionResultReceiver) && this.read == fragmentBuilder_BindMwShopAddressStandAloneFragment.read && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) fragmentBuilder_BindMwShopAddressStandAloneFragment.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) fragmentBuilder_BindMwShopAddressStandAloneFragment.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) fragmentBuilder_BindMwShopAddressStandAloneFragment.IconCompatParcelizer) && this.MediaBrowserCompat$ItemReceiver == fragmentBuilder_BindMwShopAddressStandAloneFragment.MediaBrowserCompat$ItemReceiver;
    }

    public final int hashCode() {
        boolean z = this.MediaBrowserCompat$MediaItem;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        boolean z3 = this.MediaMetadataCompat;
        if (z3) {
            z3 = true;
        }
        AuthenticationAccessToken authenticationAccessToken = this.write;
        int i = 0;
        int hashCode = authenticationAccessToken != null ? authenticationAccessToken.hashCode() : 0;
        ClientCredentials clientCredentials = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode2 = clientCredentials != null ? clientCredentials.hashCode() : 0;
        boolean z4 = this.read;
        if (z4) {
            z4 = true;
        }
        FragmentBuilder_BindMerchantWalletSelectorFragment fragmentBuilder_BindMerchantWalletSelectorFragment = this.MediaBrowserCompat$SearchResultReceiver;
        int hashCode3 = fragmentBuilder_BindMerchantWalletSelectorFragment != null ? fragmentBuilder_BindMerchantWalletSelectorFragment.hashCode() : 0;
        Throwable th = this.RatingCompat;
        int hashCode4 = th != null ? th.hashCode() : 0;
        Integer num = this.IconCompatParcelizer;
        if (num != null) {
            i = num.hashCode();
        }
        boolean z5 = this.MediaBrowserCompat$ItemReceiver;
        if (!z5) {
            z2 = z5;
        }
        return ((((((((((((((((z ? 1 : 0) * true) + (z3 ? 1 : 0)) * 31) + hashCode) * 31) + hashCode2) * 31) + (z4 ? 1 : 0)) * 31) + hashCode3) * 31) + hashCode4) * 31) + i) * 31) + (z2 ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AuthenticationState(rememberMe=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", isLoadingRememberMe=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", authenticationAccessToken=");
        sb.append(this.write);
        sb.append(", clientCredentials=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", hasManuallyAuthenticatedOnce=");
        sb.append(this.read);
        sb.append(", systemCode=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", throwable=");
        sb.append(this.RatingCompat);
        sb.append(", authenticationResultCode=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", isAuthenticating=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }

    private FragmentBuilder_BindMwShopAddressStandAloneFragment(boolean z, boolean z2, AuthenticationAccessToken authenticationAccessToken, ClientCredentials clientCredentials, boolean z3, FragmentBuilder_BindMerchantWalletSelectorFragment fragmentBuilder_BindMerchantWalletSelectorFragment, Throwable th, Integer num, boolean z4) {
        this.MediaBrowserCompat$MediaItem = z;
        this.MediaMetadataCompat = z2;
        this.write = authenticationAccessToken;
        this.MediaBrowserCompat$CustomActionResultReceiver = clientCredentials;
        this.read = z3;
        this.MediaBrowserCompat$SearchResultReceiver = fragmentBuilder_BindMerchantWalletSelectorFragment;
        this.RatingCompat = th;
        this.IconCompatParcelizer = num;
        this.MediaBrowserCompat$ItemReceiver = z4;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ FragmentBuilder_BindMwShopAddressStandAloneFragment(boolean r12, boolean r13, com.thunderhead.android.domain.authentication.AuthenticationAccessToken r14, com.thunderhead.android.domain.authentication.ClientCredentials r15, boolean r16, p040o.FragmentBuilder_BindMerchantWalletSelectorFragment r17, java.lang.Throwable r18, java.lang.Integer r19, boolean r20, int r21) {
        /*
            r11 = this;
            r0 = r21
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000a
        L_0x0009:
            r1 = r12
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = r2
            goto L_0x0011
        L_0x0010:
            r3 = r13
        L_0x0011:
            r4 = r0 & 4
            r5 = 0
            if (r4 == 0) goto L_0x0018
            r4 = r5
            goto L_0x0019
        L_0x0018:
            r4 = r14
        L_0x0019:
            r6 = r0 & 8
            if (r6 == 0) goto L_0x001f
            r6 = r5
            goto L_0x0020
        L_0x001f:
            r6 = r15
        L_0x0020:
            r7 = r0 & 16
            if (r7 == 0) goto L_0x0026
            r7 = r2
            goto L_0x0028
        L_0x0026:
            r7 = r16
        L_0x0028:
            r8 = r0 & 32
            if (r8 == 0) goto L_0x002e
            r8 = r5
            goto L_0x0030
        L_0x002e:
            r8 = r17
        L_0x0030:
            r9 = r0 & 64
            if (r9 == 0) goto L_0x0036
            r9 = r5
            goto L_0x0038
        L_0x0036:
            r9 = r18
        L_0x0038:
            r10 = r0 & 128(0x80, float:1.794E-43)
            if (r10 == 0) goto L_0x003d
            goto L_0x003f
        L_0x003d:
            r5 = r19
        L_0x003f:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0044
            goto L_0x0046
        L_0x0044:
            r2 = r20
        L_0x0046:
            r12 = r11
            r13 = r1
            r14 = r3
            r15 = r4
            r16 = r6
            r17 = r7
            r18 = r8
            r19 = r9
            r20 = r5
            r21 = r2
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.FragmentBuilder_BindMwShopAddressStandAloneFragment.<init>(boolean, boolean, com.thunderhead.android.domain.authentication.AuthenticationAccessToken, com.thunderhead.android.domain.authentication.ClientCredentials, boolean, o.FragmentBuilder_BindMerchantWalletSelectorFragment, java.lang.Throwable, java.lang.Integer, boolean, int):void");
    }

    public static /* synthetic */ FragmentBuilder_BindMwShopAddressStandAloneFragment MediaBrowserCompat$ItemReceiver(FragmentBuilder_BindMwShopAddressStandAloneFragment fragmentBuilder_BindMwShopAddressStandAloneFragment, boolean z, boolean z2, AuthenticationAccessToken authenticationAccessToken, ClientCredentials clientCredentials, boolean z3, FragmentBuilder_BindMerchantWalletSelectorFragment fragmentBuilder_BindMerchantWalletSelectorFragment, Throwable th, Integer num, boolean z4, int i) {
        FragmentBuilder_BindMwShopAddressStandAloneFragment fragmentBuilder_BindMwShopAddressStandAloneFragment2 = fragmentBuilder_BindMwShopAddressStandAloneFragment;
        int i2 = i;
        return new FragmentBuilder_BindMwShopAddressStandAloneFragment((i2 & 1) != 0 ? fragmentBuilder_BindMwShopAddressStandAloneFragment2.MediaBrowserCompat$MediaItem : z, (i2 & 2) != 0 ? fragmentBuilder_BindMwShopAddressStandAloneFragment2.MediaMetadataCompat : z2, (i2 & 4) != 0 ? fragmentBuilder_BindMwShopAddressStandAloneFragment2.write : authenticationAccessToken, (i2 & 8) != 0 ? fragmentBuilder_BindMwShopAddressStandAloneFragment2.MediaBrowserCompat$CustomActionResultReceiver : clientCredentials, (i2 & 16) != 0 ? fragmentBuilder_BindMwShopAddressStandAloneFragment2.read : z3, (i2 & 32) != 0 ? fragmentBuilder_BindMwShopAddressStandAloneFragment2.MediaBrowserCompat$SearchResultReceiver : fragmentBuilder_BindMerchantWalletSelectorFragment, (i2 & 64) != 0 ? fragmentBuilder_BindMwShopAddressStandAloneFragment2.RatingCompat : th, (i2 & 128) != 0 ? fragmentBuilder_BindMwShopAddressStandAloneFragment2.IconCompatParcelizer : num, (i2 & 256) != 0 ? fragmentBuilder_BindMwShopAddressStandAloneFragment2.MediaBrowserCompat$ItemReceiver : z4);
    }
}
