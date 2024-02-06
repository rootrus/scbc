package p040o;

import android.content.DialogInterface;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.fragment.ntb.fatca.FatcaQuestionnaireFragment;
import java.util.LinkedHashMap;
import p040o.nativeAdornBoundary;

/* renamed from: o.ActivityBuilder_ContributeHmlETBOperatingBankActivity */
public final /* synthetic */ class ActivityBuilder_ContributeHmlETBOperatingBankActivity implements DialogInterface.OnClickListener {
    private final /* synthetic */ FatcaQuestionnaireFragment write;

    public /* synthetic */ ActivityBuilder_ContributeHmlETBOperatingBankActivity(FatcaQuestionnaireFragment fatcaQuestionnaireFragment) {
        this.write = fatcaQuestionnaireFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        FatcaQuestionnaireFragment fatcaQuestionnaireFragment = this.write;
        int i2 = fatcaQuestionnaireFragment.MediaBrowserCompat$CustomActionResultReceiver;
        if (i2 == 0) {
            fatcaQuestionnaireFragment.write("ekyc_fatcaconfirmed", fatcaQuestionnaireFragment.MediaBrowserCompat$MediaItem.read());
        } else if (i2 != 1) {
            if (i2 == 3) {
                ZSYR2K[] zsyr2kArr = {new ZSYR2K("source", "scbs")};
                if (fatcaQuestionnaireFragment.getActivity() != null) {
                    ((BaseActivity) fatcaQuestionnaireFragment.getActivity()).scbAnalytics.write("scbsonboard_fatcaconfirmed", zsyr2kArr);
                }
            } else if (i2 == 4) {
                fatcaQuestionnaireFragment.write("ekyc_fatcaconfirmed", "your_loan");
            }
        } else if (fatcaQuestionnaireFragment.getActivity() != null) {
            ((BaseActivity) fatcaQuestionnaireFragment.getActivity()).mo13676d_("mfonboard_fatcaconfirmed");
        }
        nativeAdornBoundary nativeadornboundary = fatcaQuestionnaireFragment.fatcaQuestionPresenter;
        LinkedHashMap<String, String> linkedHashMap = fatcaQuestionnaireFragment.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver;
        if (nativeadornboundary.RatingCompat != null) {
            nativeadornboundary.RatingCompat.AlertController$RecycleListView();
        }
        int i3 = nativeadornboundary.read;
        if (i3 == 0) {
            rowKeySet IconCompatParcelizer = synchronizedListMultimap.IconCompatParcelizer(nativeadornboundary.IconCompatParcelizer, linkedHashMap);
            containsRow IconCompatParcelizer2 = containsRow.IconCompatParcelizer();
            IconCompatParcelizer2.read = IconCompatParcelizer;
            nativeadornboundary.write.IconCompatParcelizer(IconCompatParcelizer2);
            nativeadornboundary.write.IconCompatParcelizer(new C10075x265976a8(nativeadornboundary, (byte) 0));
        } else if (i3 == 1) {
            nativeadornboundary.write.MediaBrowserCompat$ItemReceiver(synchronizedListMultimap.IconCompatParcelizer(nativeadornboundary.IconCompatParcelizer, linkedHashMap));
            nativeadornboundary.write.IconCompatParcelizer(new nativeAdornBoundary$MediaBrowserCompat$ItemReceiver(nativeadornboundary, (byte) 0));
        } else if (i3 == 2) {
            nativeadornboundary.write.MediaBrowserCompat$CustomActionResultReceiver(synchronizedListMultimap.IconCompatParcelizer(nativeadornboundary.IconCompatParcelizer, linkedHashMap));
            nativeadornboundary.write.IconCompatParcelizer(new nativeAdornBoundary$MediaBrowserCompat$ItemReceiver(nativeadornboundary, (byte) 0));
        } else if (i3 == 3) {
            nativeadornboundary.MediaBrowserCompat$MediaItem.read(synchronizedListMultimap.IconCompatParcelizer(nativeadornboundary.IconCompatParcelizer, linkedHashMap));
            nativeadornboundary.MediaBrowserCompat$MediaItem.IconCompatParcelizer(new nativeAdornBoundary.read(nativeadornboundary, (byte) 0));
        } else if (i3 == 4) {
            rowKeySet IconCompatParcelizer3 = synchronizedListMultimap.IconCompatParcelizer(nativeadornboundary.IconCompatParcelizer, linkedHashMap);
            containsRow IconCompatParcelizer4 = containsRow.IconCompatParcelizer();
            IconCompatParcelizer4.read = IconCompatParcelizer3;
            nativeadornboundary.write.MediaBrowserCompat$CustomActionResultReceiver(IconCompatParcelizer4);
            nativeadornboundary.write.IconCompatParcelizer(new C10075x265976a8(nativeadornboundary, (byte) 0));
        }
        dialogInterface.dismiss();
    }
}
