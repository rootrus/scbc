package p040o;

import android.view.ViewGroup;

/* renamed from: o.DeejungInstallmentsConfirmationActivity */
public abstract class DeejungInstallmentsConfirmationActivity implements FragmentBuilder_BindHmlNTBLoanSetupFragment {
    private boolean MediaBrowserCompat$CustomActionResultReceiver;
    private setTextAppearance<String, DeejungTransferLandingActivity> MediaBrowserCompat$ItemReceiver;
    private DeejungLandingActivity read;
    private DeejungTransferLandingActivity write;

    DeejungInstallmentsConfirmationActivity(String str, FragmentBuilder_BindHmlExternalAuthenticationFragment fragmentBuilder_BindHmlExternalAuthenticationFragment, DeejungTransferLandingActivity deejungTransferLandingActivity, setTextAppearance<String, DeejungTransferLandingActivity> settextappearance) {
        this.write = deejungTransferLandingActivity;
        this.MediaBrowserCompat$ItemReceiver = settextappearance;
        this.read = new DeejungLandingActivity(str, fragmentBuilder_BindHmlExternalAuthenticationFragment);
    }

    /* access modifiers changed from: package-private */
    public final void write(DeejungTransferLandingActivity deejungTransferLandingActivity, setTextAppearance<String, DeejungTransferLandingActivity> settextappearance) {
        this.write = deejungTransferLandingActivity;
        this.MediaBrowserCompat$ItemReceiver = settextappearance;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        this.MediaBrowserCompat$CustomActionResultReceiver = true;
    }

    public final void IconCompatParcelizer() {
        this.MediaBrowserCompat$CustomActionResultReceiver = false;
    }

    /* access modifiers changed from: protected */
    public final boolean MediaBrowserCompat$ItemReceiver() {
        return this.MediaBrowserCompat$CustomActionResultReceiver;
    }

    /* access modifiers changed from: package-private */
    public final void write(ViewGroup viewGroup, int i, int i2, int i3, int i4) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        ViewGroup viewGroup2 = viewGroup;
        int i5 = i3;
        int i6 = i4;
        int[] iArr5 = null;
        if (i5 > 0) {
            iArr = new int[i5];
            for (int i7 = 0; i7 < i5; i7++) {
                iArr[i7] = (i - i7) - 1;
            }
            iArr2 = null;
        } else if (i5 < 0) {
            int abs = Math.abs(i3);
            int[] iArr6 = new int[abs];
            for (int i8 = 0; i8 < abs; i8++) {
                iArr6[i8] = i + i8;
            }
            iArr2 = iArr6;
            iArr = null;
        } else {
            iArr2 = null;
            iArr = null;
        }
        if (i6 > 0) {
            iArr3 = new int[i6];
            for (int i9 = 0; i9 < i6; i9++) {
                iArr3[i9] = i2 - i9;
            }
        } else {
            if (i6 < 0) {
                int abs2 = Math.abs(i4);
                iArr4 = new int[abs2];
                for (int i10 = 0; i10 < abs2; i10++) {
                    iArr4[i10] = i2 + i10 + 1;
                }
            } else {
                iArr4 = null;
            }
            int[] iArr7 = iArr4;
            iArr3 = null;
            iArr5 = iArr7;
        }
        if (iArr != null) {
            for (int MediaBrowserCompat$CustomActionResultReceiver2 : iArr) {
                this.read.MediaBrowserCompat$CustomActionResultReceiver(this.write, MediaBrowserCompat$CustomActionResultReceiver2, this.MediaBrowserCompat$ItemReceiver);
            }
        }
        if (iArr5 != null) {
            for (int MediaBrowserCompat$CustomActionResultReceiver3 : iArr5) {
                this.read.MediaBrowserCompat$CustomActionResultReceiver(this.write, MediaBrowserCompat$CustomActionResultReceiver3, this.MediaBrowserCompat$ItemReceiver);
            }
        }
        if (iArr2 != null) {
            for (int i11 = 0; i11 < iArr2.length; i11++) {
                this.read.IconCompatParcelizer(this.write, viewGroup2.getChildAt(iArr2[i11] - i), iArr2[i11], this.MediaBrowserCompat$ItemReceiver, this.write.f3129x50fd9e4a.MediaMetadataCompat, DeejungTransferMinFullConfirmationActivity_ViewBinding.write(this.write.f3129x50fd9e4a.MediaMetadataCompat));
            }
        }
        if (iArr3 != null) {
            for (int i12 = 0; i12 < iArr3.length; i12++) {
                this.read.IconCompatParcelizer(this.write, viewGroup2.getChildAt(iArr3[i12] - i), iArr3[i12], this.MediaBrowserCompat$ItemReceiver, this.write.f3129x50fd9e4a.MediaMetadataCompat, DeejungTransferMinFullConfirmationActivity_ViewBinding.write(this.write.f3129x50fd9e4a.MediaMetadataCompat));
            }
        }
    }
}
