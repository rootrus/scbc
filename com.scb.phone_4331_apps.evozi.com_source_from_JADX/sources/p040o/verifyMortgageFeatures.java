package p040o;

import com.scb.phone.view.custom.C5792xf293d63d;
import com.scb.phone.view.custom.CustomCheckboxGroupView;
import com.scb.phone.view.custom.CustomCheckboxView;

/* renamed from: o.verifyMortgageFeatures */
public final /* synthetic */ class verifyMortgageFeatures implements CustomCheckboxView.write {
    private final /* synthetic */ lambda$publish$0 MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ CustomCheckboxGroupView write;

    public /* synthetic */ verifyMortgageFeatures(CustomCheckboxGroupView customCheckboxGroupView, lambda$publish$0 lambda_publish_0) {
        this.write = customCheckboxGroupView;
        this.MediaBrowserCompat$CustomActionResultReceiver = lambda_publish_0;
    }

    public final void IconCompatParcelizer(boolean z) {
        CustomCheckboxGroupView customCheckboxGroupView = this.write;
        lambda$publish$0 lambda_publish_0 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (customCheckboxGroupView.MediaBrowserCompat$CustomActionResultReceiver) {
            customCheckboxGroupView.childrenGroup.setVisibility(z ? 0 : 8);
        }
        C5792xf293d63d customCheckboxGroupView$MediaBrowserCompat$CustomActionResultReceiver = customCheckboxGroupView.IconCompatParcelizer;
        if (customCheckboxGroupView$MediaBrowserCompat$CustomActionResultReceiver != null) {
            customCheckboxGroupView$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(lambda_publish_0.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver, (String) null, z);
        }
    }
}
