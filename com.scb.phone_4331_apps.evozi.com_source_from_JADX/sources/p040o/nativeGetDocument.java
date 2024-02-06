package p040o;

import com.scb.phone.domain.interactor.FatcaQuestionnaireCase;
import p040o.CheckCaptureModule_GetLookAndFeelParametersFactory;
import p040o.Iterables;
import p040o.RegularImmutableMap;

/* renamed from: o.nativeGetDocument */
public class nativeGetDocument extends writeUInt64NoTag<CheckCaptureModule_GetLookAndFeelParametersFactory.read> {
    public int IconCompatParcelizer;
    public Iterables.C352212 MediaBrowserCompat$ItemReceiver;
    /* access modifiers changed from: private */
    public RegularImmutableMap.NonTerminalEntry read;
    public FatcaQuestionnaireCase write;

    @HmlPinActivity
    public nativeGetDocument(RegularImmutableBiMap regularImmutableBiMap, FatcaQuestionnaireCase fatcaQuestionnaireCase, RegularImmutableMap.NonTerminalEntry nonTerminalEntry, Iterables.C352212 r4) {
        super(regularImmutableBiMap);
        this.write = fatcaQuestionnaireCase;
        this.read = nonTerminalEntry;
        this.MediaBrowserCompat$ItemReceiver = r4;
    }

    static /* synthetic */ void write(nativeGetDocument nativegetdocument) {
        if (nativegetdocument.RatingCompat != null) {
            nativegetdocument.RatingCompat.aj_();
        }
    }
}
