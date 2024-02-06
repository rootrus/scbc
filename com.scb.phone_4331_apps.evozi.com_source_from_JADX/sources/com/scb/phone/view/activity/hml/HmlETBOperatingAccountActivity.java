package com.scb.phone.view.activity.hml;

import android.content.Intent;
import android.os.Bundle;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivityWithFragment;
import java.io.Serializable;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TypeCastException;
import p040o.CheckEligibilityActivity;
import p040o.CropView;
import p040o.FragmentBuilder_BindBaseGiftTransferInputFragment;
import p040o.FundActionsSuccessActivity;
import p040o.HmlVerifyEmailActivity;
import p040o.HmlVerifyPhoneTermsConditionsActivity;
import p040o.onGetStartedClick;

public class HmlETBOperatingAccountActivity extends BaseActivityWithFragment implements FragmentBuilder_BindBaseGiftTransferInputFragment {
    public static final HmlETBOperatingAccountActivity$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$SearchResultReceiver = new HmlETBOperatingAccountActivity$MediaBrowserCompat$ItemReceiver((byte) 0);
    private final HmlVerifyEmailActivity MediaDescriptionCompat;

    public final void AppCompatDelegateImpl$ListMenuDecorView() {
    }

    public HmlETBOperatingAccountActivity() {
        FundActionsSuccessActivity read2 = new read(this);
        onGetStartedClick.write((Object) read2, "initializer");
        this.MediaDescriptionCompat = new HmlVerifyPhoneTermsConditionsActivity(read2);
    }

    public final void MediaBrowserCompat$ItemReceiver(Bundle bundle) {
        Intent intent = new Intent();
        intent.putExtras(bundle);
        setResult(-1, intent);
        finish();
    }

    static final class read extends CheckEligibilityActivity implements FundActionsSuccessActivity<C5609x5fc43574> {
        private /* synthetic */ HmlETBOperatingAccountActivity IconCompatParcelizer;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        read(HmlETBOperatingAccountActivity hmlETBOperatingAccountActivity) {
            super(0);
            this.IconCompatParcelizer = hmlETBOperatingAccountActivity;
        }

        public final /* synthetic */ Object invoke() {
            Intent intent = this.IconCompatParcelizer.getIntent();
            onGetStartedClick.IconCompatParcelizer((Object) intent, "intent");
            Bundle extras = intent.getExtras();
            Serializable serializable = extras != null ? extras.getSerializable("OPERATING_TYPE_KEY") : null;
            if (serializable != null) {
                return (C5609x5fc43574) serializable;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.scb.phone.view.activity.hml.HmlETBOperatingAccountActivity.OperatingType");
        }
    }

    public final String au_() {
        int i = CropView.MediaBrowserCompat$ItemReceiver[((C5609x5fc43574) this.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver()).ordinal()];
        if (i == 1) {
            String string = getString(R.string.hml_business_operating_account_title);
            onGetStartedClick.IconCompatParcelizer((Object) string, "getString(R.string.hml_b…_operating_account_title)");
            return string;
        } else if (i == 2) {
            String string2 = getString(R.string.hml_business_edit_operating_account_title);
            onGetStartedClick.IconCompatParcelizer((Object) string2, "getString(R.string.hml_b…_operating_account_title)");
            return string2;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0020, code lost:
        r0 = r0.getExtras();
     */
    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.fragment.app.Fragment mo13702x50fd9e4a() {
        /*
            r4 = this;
            o.HmlVerifyEmailActivity r0 = r4.MediaDescriptionCompat
            java.lang.Object r0 = r0.MediaBrowserCompat$CustomActionResultReceiver()
            com.scb.phone.view.activity.hml.HmlETBOperatingAccountActivity$MediaBrowserCompat$CustomActionResultReceiver r0 = (com.scb.phone.view.activity.hml.C5609x5fc43574) r0
            int[] r1 = p040o.CropView.write
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            if (r0 == r1) goto L_0x0049
            r1 = 2
            if (r0 != r1) goto L_0x0043
            com.scb.phone.view.fragment.hml.HmlEditOperatingAccountFragment$MediaBrowserCompat$CustomActionResultReceiver r0 = com.scb.phone.view.fragment.hml.HmlEditOperatingAccountFragment.IconCompatParcelizer
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r1 = "OPERATING_ACCOUNT_KEY"
            if (r0 == 0) goto L_0x002d
            android.os.Bundle r0 = r0.getExtras()
            if (r0 == 0) goto L_0x002d
            android.os.Parcelable r0 = r0.getParcelable(r1)
            o.zziu$zzc r0 = (p040o.zziu.zzc) r0
            goto L_0x002e
        L_0x002d:
            r0 = 0
        L_0x002e:
            com.scb.phone.view.fragment.hml.HmlEditOperatingAccountFragment r2 = new com.scb.phone.view.fragment.hml.HmlEditOperatingAccountFragment
            r2.<init>()
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            android.os.Parcelable r0 = (android.os.Parcelable) r0
            r3.putParcelable(r1, r0)
            r2.setArguments(r3)
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            goto L_0x0053
        L_0x0043:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0049:
            com.scb.phone.view.fragment.hml.HmlAddOperatingAccountFragment$read r0 = com.scb.phone.view.fragment.hml.HmlAddOperatingAccountFragment.IconCompatParcelizer
            com.scb.phone.view.fragment.hml.HmlAddOperatingAccountFragment r0 = new com.scb.phone.view.fragment.hml.HmlAddOperatingAccountFragment
            r0.<init>()
            r2 = r0
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
        L_0x0053:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.activity.hml.HmlETBOperatingAccountActivity.mo13702x50fd9e4a():androidx.fragment.app.Fragment");
    }
}
