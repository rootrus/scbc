package com.scb.phone.view.activity.hml;

import android.content.Intent;
import android.os.Bundle;
import com.scb.phone.R;
import com.scb.phone.view.fragment.hml.HmlAddressFragment$MediaBrowserCompat$ItemReceiver;
import com.scb.phone.view.fragment.hml.businessowner.HmlBusinessAddressFragment;
import p040o.AutoValue_CrashlyticsReport_CustomAttribute;
import p040o.CardView;
import p040o.onGetStartedClick;
import p040o.setContentDescription;

public class HmlBusinessAddressActivity extends HmlBaseAddressActivity implements HmlAddressFragment$MediaBrowserCompat$ItemReceiver {
    public static final write MediaMetadataCompat = new write((byte) 0);

    /* access modifiers changed from: protected */
    public final int MediaSessionCompat$QueueItem() {
        Intent intent = getIntent();
        return intent != null ? intent.getIntExtra("EXTRA_DISPLAY", R.string.hml_business_info_address_title) : R.string.hml_business_info_address_title;
    }

    public static final class write {
        private write() {
        }

        public /* synthetic */ write(byte b) {
            this();
        }
    }

    public final void IconCompatParcelizer(AutoValue_CrashlyticsReport_CustomAttribute autoValue_CrashlyticsReport_CustomAttribute, setContentDescription.write write2) {
        onGetStartedClick.write((Object) write2, "type");
        CardView read = getSupportFragmentManager().read();
        HmlBusinessAddressFragment.read read2 = HmlBusinessAddressFragment.IconCompatParcelizer;
        onGetStartedClick.write((Object) write2, "addressType");
        HmlBusinessAddressFragment hmlBusinessAddressFragment = new HmlBusinessAddressFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.scb.phone.view.fragment.easycash.financial_information.ADDRESS_DISPLAY", autoValue_CrashlyticsReport_CustomAttribute);
        bundle.putSerializable("com.scb.phone.EXTRA_ADDRESS_TYPE", write2);
        hmlBusinessAddressFragment.setArguments(bundle);
        read.MediaBrowserCompat$CustomActionResultReceiver(R.id.container, hmlBusinessAddressFragment).write();
    }
}
