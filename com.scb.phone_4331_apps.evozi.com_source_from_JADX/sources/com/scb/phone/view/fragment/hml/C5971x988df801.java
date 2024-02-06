package com.scb.phone.view.fragment.hml;

import android.text.TextUtils;
import p040o.DebitCardResetOtpActivity;
import p040o.FragmentBuilder_BindProductCatalogFragment;
import p040o.HmlPinActivity;
import p040o.ImagesContract;
import p040o.LocalProjectProvider;
import p040o.fromRawResSync;
import p040o.getNotNullImages;
import p040o.setStrokeJointType;
import p040o.writeByteArrayArray;
import p040o.zzs;

/* renamed from: com.scb.phone.view.fragment.hml.HmlBusinessOwnerETBPersonalInfoFragment$MediaBrowserCompat$ItemReceiver */
public final class C5971x988df801 implements LocalProjectProvider.C69331 {
    private final String IconCompatParcelizer;
    private final FragmentBuilder_BindProductCatalogFragment MediaBrowserCompat$CustomActionResultReceiver;
    private final getNotNullImages.write MediaBrowserCompat$ItemReceiver;
    public final zzs write;

    private C5971x988df801() {
    }

    @HmlPinActivity
    public C5971x988df801(getNotNullImages.write write2, FragmentBuilder_BindProductCatalogFragment fragmentBuilder_BindProductCatalogFragment, zzs zzs, String str) {
        this.MediaBrowserCompat$ItemReceiver = write2;
        this.MediaBrowserCompat$CustomActionResultReceiver = fragmentBuilder_BindProductCatalogFragment;
        this.write = zzs;
        this.IconCompatParcelizer = str;
    }

    public final DebitCardResetOtpActivity<setStrokeJointType> write() {
        String str;
        fromRawResSync fromrawressync = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver;
        if (fromrawressync != null) {
            return DebitCardResetOtpActivity.just(this.write.write(fromrawressync));
        }
        if (!TextUtils.isEmpty(this.IconCompatParcelizer)) {
            try {
                str = this.IconCompatParcelizer.substring(0, this.IconCompatParcelizer.indexOf("?"));
            } catch (StringIndexOutOfBoundsException unused) {
            }
            return this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer.getDonationList(str, "/donation/index.json").doOnNext(new ImagesContract(this.MediaBrowserCompat$CustomActionResultReceiver)).flatMap(new writeByteArrayArray(this));
        }
        str = "";
        return this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer.getDonationList(str, "/donation/index.json").doOnNext(new ImagesContract(this.MediaBrowserCompat$CustomActionResultReceiver)).flatMap(new writeByteArrayArray(this));
    }

    public final void read() {
        FragmentBuilder_BindProductCatalogFragment fragmentBuilder_BindProductCatalogFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        fragmentBuilder_BindProductCatalogFragment.MediaBrowserCompat$ItemReceiver = null;
        fragmentBuilder_BindProductCatalogFragment.write = null;
    }
}
