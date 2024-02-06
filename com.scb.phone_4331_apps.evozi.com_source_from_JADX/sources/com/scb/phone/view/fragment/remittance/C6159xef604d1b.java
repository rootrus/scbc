package com.scb.phone.view.fragment.remittance;

import android.os.Bundle;
import p040o.C3092xce3d994b;
import p040o.CheckEligibilityActivity;
import p040o.FundActionsSuccessActivity;

/* renamed from: com.scb.phone.view.fragment.remittance.RemittanceRecipientDetailFragment$PlaybackStateCompat$CustomAction */
final class C6159xef604d1b extends CheckEligibilityActivity implements FundActionsSuccessActivity<C3092xce3d994b.Builder> {
    private /* synthetic */ RemittanceRecipientDetailFragment IconCompatParcelizer;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C6159xef604d1b(RemittanceRecipientDetailFragment remittanceRecipientDetailFragment) {
        super(0);
        this.IconCompatParcelizer = remittanceRecipientDetailFragment;
    }

    public final /* synthetic */ Object invoke() {
        Bundle arguments = this.IconCompatParcelizer.getArguments();
        if (arguments != null) {
            C3092xce3d994b.Builder builder = null;
            int i = arguments.getInt("STATE", -1);
            if (i >= 0) {
                builder = C3092xce3d994b.Builder.values()[i];
            }
            C3092xce3d994b.Builder builder2 = builder;
            if (builder2 != null) {
                return builder2;
            }
        }
        return C3092xce3d994b.Builder.NORMAL;
    }
}
