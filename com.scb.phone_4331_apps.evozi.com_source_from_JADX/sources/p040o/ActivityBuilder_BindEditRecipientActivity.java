package p040o;

import com.scb.phone.view.fragment.hml.HmlNTBExternalInstructionFragment;

/* renamed from: o.ActivityBuilder_BindEditRecipientActivity */
public final class ActivityBuilder_BindEditRecipientActivity implements MileageQuantitySelectionActivity<HmlNTBExternalInstructionFragment> {
    public static void read(HmlNTBExternalInstructionFragment hmlNTBExternalInstructionFragment, KofaxWebServiceConnectorService kofaxWebServiceConnectorService) {
        hmlNTBExternalInstructionFragment.presenter = kofaxWebServiceConnectorService;
    }
}
