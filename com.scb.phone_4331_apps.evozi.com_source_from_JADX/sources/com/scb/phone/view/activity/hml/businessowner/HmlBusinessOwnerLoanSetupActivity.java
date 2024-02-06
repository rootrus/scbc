package com.scb.phone.view.activity.hml.businessowner;

import android.os.Bundle;
import com.scb.phone.view.activity.hml.HmlETBLoanSetupActivity;
import com.scb.phone.view.fragment.hml.businessowner.HmlBusinessOwnerLoanSetupFragment;

public final class HmlBusinessOwnerLoanSetupActivity extends HmlETBLoanSetupActivity {
    public static final C5624xf154595d MediaMetadataCompat = new C5624xf154595d((byte) 0);

    /* access modifiers changed from: private */
    /* renamed from: AppCompatActivity */
    public HmlBusinessOwnerLoanSetupFragment setContentView() {
        HmlBusinessOwnerLoanSetupFragment.read read = HmlBusinessOwnerLoanSetupFragment.IconCompatParcelizer;
        HmlBusinessOwnerLoanSetupFragment hmlBusinessOwnerLoanSetupFragment = new HmlBusinessOwnerLoanSetupFragment();
        Bundle bundle = new Bundle();
        bundle.putString("intent", getIntent().getStringExtra("intent"));
        bundle.putString("utm_content", getIntent().getStringExtra("utm_content"));
        bundle.putString("utm_campaign", getIntent().getStringExtra("utm_campaign"));
        bundle.putString("utm_source", getIntent().getStringExtra("utm_source"));
        bundle.putString("utm_medium", getIntent().getStringExtra("utm_medium"));
        hmlBusinessOwnerLoanSetupFragment.setArguments(bundle);
        return hmlBusinessOwnerLoanSetupFragment;
    }
}
