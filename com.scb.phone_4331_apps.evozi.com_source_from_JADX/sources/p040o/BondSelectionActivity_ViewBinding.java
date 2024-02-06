package p040o;

import android.app.Activity;
import android.view.View;

/* renamed from: o.BondSelectionActivity_ViewBinding */
public final /* synthetic */ class BondSelectionActivity_ViewBinding implements View.OnClickListener {
    private final /* synthetic */ Activity IconCompatParcelizer;
    private final /* synthetic */ ManageQrToPayActivity_ViewBinding MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ BondSelectionActivity_ViewBinding(ManageQrToPayActivity_ViewBinding manageQrToPayActivity_ViewBinding, Activity activity) {
        this.MediaBrowserCompat$ItemReceiver = manageQrToPayActivity_ViewBinding;
        this.IconCompatParcelizer = activity;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r5) {
        /*
            r4 = this;
            o.ManageQrToPayActivity_ViewBinding r5 = r4.MediaBrowserCompat$ItemReceiver
            android.app.Activity r0 = r4.IconCompatParcelizer
            if (r0 == 0) goto L_0x006a
            o.onClickNextAction r5 = r5.read
            o.DeejungTransferLandingActivity r1 = r5.write
            if (r1 == 0) goto L_0x0054
            o.FragmentBuilder_BindHmlAboutFragment r1 = r5.read
            o.FragmentBuilder_BindHmlDocumentUploadFragment r1 = r1.MediaBrowserCompat$ItemReceiver()
            o.DeejungTransferLandingActivity r2 = r5.write
            boolean r3 = r2.MediaSessionCompat$QueueItem
            if (r3 != 0) goto L_0x0024
            java.lang.String r3 = r2.ParcelableVolumeInfo
            java.lang.String r2 = r2.MediaBrowserCompat$MediaItem
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L_0x0024
            r2 = 0
            goto L_0x0025
        L_0x0024:
            r2 = 1
        L_0x0025:
            if (r2 == 0) goto L_0x002c
            o.DeejungTransferLandingActivity r5 = r5.write
            java.lang.String r5 = r5.ParcelableVolumeInfo
            goto L_0x0030
        L_0x002c:
            o.DeejungTransferLandingActivity r5 = r5.write
            java.lang.String r5 = r5.MediaBrowserCompat$MediaItem
        L_0x0030:
            com.thunderhead.android.infrastructure.server.responses.InteractionRegionResponse r5 = r1.MediaBrowserCompat$ItemReceiver(r5)
            if (r5 == 0) goto L_0x0054
            o.AmortizationMerchantsActivity r1 = new o.AmortizationMerchantsActivity
            com.thunderhead.android.infrastructure.server.entitys.InteractionData r2 = r5.getData()
            java.lang.String r2 = r2.getId()
            com.thunderhead.android.infrastructure.server.entitys.InteractionData r3 = r5.getData()
            java.lang.String r3 = r3.getPath()
            com.thunderhead.android.infrastructure.server.entitys.InteractionData r5 = r5.getData()
            java.lang.String r5 = r5.getName()
            r1.<init>(r2, r3, r5)
            goto L_0x0055
        L_0x0054:
            r1 = 0
        L_0x0055:
            if (r1 != 0) goto L_0x005d
            java.lang.String r5 = "Failed to open Edit region name dialog: insufficient data"
            p040o.MyECouponActivity_ViewBinding.write(r5)
            return
        L_0x005d:
            com.thunderhead.popover.EditRegionNameDialog r5 = com.thunderhead.popover.EditRegionNameDialog.MediaBrowserCompat$CustomActionResultReceiver(r1)
            android.app.FragmentManager r0 = r0.getFragmentManager()
            java.lang.String r1 = "EditRegionNameDialog"
            r5.show(r0, r1)
        L_0x006a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.BondSelectionActivity_ViewBinding.onClick(android.view.View):void");
    }
}
