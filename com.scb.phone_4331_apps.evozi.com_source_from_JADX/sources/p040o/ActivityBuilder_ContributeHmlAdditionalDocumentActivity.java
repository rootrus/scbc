package p040o;

import com.scb.phone.view.fragment.ndid.NdidSelectIdpFragment;

/* renamed from: o.ActivityBuilder_ContributeHmlAdditionalDocumentActivity */
public final class ActivityBuilder_ContributeHmlAdditionalDocumentActivity implements MileageQuantitySelectionActivity<NdidSelectIdpFragment> {
    public static void write(NdidSelectIdpFragment ndidSelectIdpFragment, ISdkDaggerPerContextComponent iSdkDaggerPerContextComponent) {
        ndidSelectIdpFragment.presenter = iSdkDaggerPerContextComponent;
    }
}
