package p040o;

import android.widget.RadioGroup;
import com.scb.phone.view.fragment.easycash.financialinformation.AdditionDocumentScbAccountFragment;

/* renamed from: o.getPrepaidTravelConversionLanding */
public final /* synthetic */ class getPrepaidTravelConversionLanding implements RadioGroup.OnCheckedChangeListener {
    private final /* synthetic */ AdditionDocumentScbAccountFragment read;

    public /* synthetic */ getPrepaidTravelConversionLanding(AdditionDocumentScbAccountFragment additionDocumentScbAccountFragment) {
        this.read = additionDocumentScbAccountFragment;
    }

    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
        this.read.MediaBrowserCompat$CustomActionResultReceiver(i);
    }
}
