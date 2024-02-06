package com.scb.phone.view.activity.cardmanagement;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.CCRBaseActivity;
import p040o.UncheckedTimeoutException;
import p040o.ZSYR2K;

public class CCAboutActivity extends CCRBaseActivity {
    private UncheckedTimeoutException MediaMetadataCompat;

    public static Intent IconCompatParcelizer(Context context, UncheckedTimeoutException uncheckedTimeoutException) {
        Intent intent = new Intent(context, CCAboutActivity.class);
        intent.putExtra("com.scb.phone.view.activity.card_management.CCAboutActivity.KEY_EXTRA_ABOUT_TYPE", uncheckedTimeoutException);
        return intent;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f77002131492925);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        this.MediaMetadataCompat = (UncheckedTimeoutException) getIntent().getSerializableExtra("com.scb.phone.view.activity.card_management.CCAboutActivity.KEY_EXTRA_ABOUT_TYPE");
        setStackedBackground();
        int i = C10744.MediaBrowserCompat$ItemReceiver[this.MediaMetadataCompat.ordinal()];
        if (i == 1) {
            this.scbAnalytics.write("deejung_installment_landing", new ZSYR2K("button", "questionmark_icon"));
        } else if (i == 2 || i == 3) {
            this.scbAnalytics.write("deejung_transfer_landing", new ZSYR2K("button", "questionmark_icon"));
        }
    }

    /* renamed from: com.scb.phone.view.activity.cardmanagement.CCAboutActivity$4 */
    static /* synthetic */ class C10744 {
        static final /* synthetic */ int[] MediaBrowserCompat$ItemReceiver;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                o.UncheckedTimeoutException[] r0 = p040o.UncheckedTimeoutException.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                MediaBrowserCompat$ItemReceiver = r0
                o.UncheckedTimeoutException r1 = p040o.UncheckedTimeoutException.DEEJUNG_INSTALLMENT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ NoSuchFieldError -> 0x001d }
                o.UncheckedTimeoutException r1 = p040o.UncheckedTimeoutException.DEEJUNG_TRANSFER_SPEEDY_CASH     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ NoSuchFieldError -> 0x0028 }
                o.UncheckedTimeoutException r1 = p040o.UncheckedTimeoutException.DEEJUNG_TRANSFER     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.activity.cardmanagement.CCAboutActivity.C10744.<clinit>():void");
        }
    }

    public final void setStackedBackground() {
        this.mToolbar.setBackgroundResource(R.color.f71012131100257);
        this.mActionBarTitle.setTextColor(-9031231);
        super.setStackedBackground();
        setTitle(this.MediaMetadataCompat.titleResId);
        setTabContainer();
        mo11B_().ParcelableVolumeInfo();
    }
}
