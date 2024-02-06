package com.scb.phone.view.fragment.hml;

import android.os.Bundle;
import p040o.CheckEligibilityActivity;
import p040o.FundActionsSuccessActivity;
import p040o.zzwe;

final class HmlDocumentListFragment$MediaBrowserCompat$ItemReceiver extends CheckEligibilityActivity implements FundActionsSuccessActivity<zzwe.read> {
    private /* synthetic */ HmlDocumentListFragment MediaBrowserCompat$CustomActionResultReceiver;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    HmlDocumentListFragment$MediaBrowserCompat$ItemReceiver(HmlDocumentListFragment hmlDocumentListFragment) {
        super(0);
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlDocumentListFragment;
    }

    public final /* synthetic */ Object invoke() {
        Bundle arguments = this.MediaBrowserCompat$CustomActionResultReceiver.getArguments();
        zzwe.read read = arguments != null ? (zzwe.read) arguments.getParcelable("HML_DOC_FILE_VALIDATION_LIMIT") : null;
        if (!(read instanceof zzwe.read)) {
            return null;
        }
        return read;
    }
}
