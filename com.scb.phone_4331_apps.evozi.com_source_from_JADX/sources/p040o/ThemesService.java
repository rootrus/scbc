package p040o;

import android.content.Intent;
import android.view.View;
import com.scb.phone.view.activity.deeplink.PartnerSuccessRedirectActivity;
import com.scb.phone.view.fragment.chubb.ChubbPaySuccessFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import p040o.CrashlyticsReport;

/* renamed from: o.ThemesService */
public final /* synthetic */ class ThemesService implements View.OnClickListener {
    private final /* synthetic */ CrashlyticsReport.Session.Event.Application.Execution.BinaryImage MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ ChubbPaySuccessFragment write;

    public /* synthetic */ ThemesService(ChubbPaySuccessFragment chubbPaySuccessFragment, CrashlyticsReport.Session.Event.Application.Execution.BinaryImage binaryImage) {
        this.write = chubbPaySuccessFragment;
        this.MediaBrowserCompat$ItemReceiver = binaryImage;
    }

    public final void onClick(View view) {
        ChubbPaySuccessFragment chubbPaySuccessFragment = this.write;
        Intent IconCompatParcelizer = PartnerSuccessRedirectActivity.IconCompatParcelizer(chubbPaySuccessFragment.getContext(), this.MediaBrowserCompat$ItemReceiver);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        ChubbPaySuccessFragment.MediaBrowserCompat$ItemReceiver(chubbPaySuccessFragment, IconCompatParcelizer);
    }
}
