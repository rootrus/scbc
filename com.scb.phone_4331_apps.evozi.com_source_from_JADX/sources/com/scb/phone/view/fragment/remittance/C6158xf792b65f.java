package com.scb.phone.view.fragment.remittance;

import android.text.Editable;
import com.scb.phone.view.custom.common.TintInputViewGroup;
import java.util.List;
import java.util.Locale;
import kotlin.TypeCastException;
import p040o.C3092xce3d994b;
import p040o.C4998nC;
import p040o.C5010nK;
import p040o.FragmentBuilder_BindCreditLimitDisplayFragment;
import p040o.nK$MediaBrowserCompat$ItemReceiver;
import p040o.onGetStartedClick;
import p040o.setCode;
import p040o.writeUInt64NoTag;

/* renamed from: com.scb.phone.view.fragment.remittance.RemittanceRecipientDetailFragment$MediaSessionCompat$ResultReceiverWrapper */
public final class C6158xf792b65f extends FragmentBuilder_BindCreditLimitDisplayFragment {
    private /* synthetic */ RemittanceRecipientDetailFragment write;

    C6158xf792b65f(RemittanceRecipientDetailFragment remittanceRecipientDetailFragment) {
        this.write = remittanceRecipientDetailFragment;
    }

    public final void afterTextChanged(Editable editable) {
        List<String> list;
        setCode setcode;
        onGetStartedClick.write((Object) editable, "editable");
        String obj = editable.toString();
        Locale locale = Locale.getDefault();
        onGetStartedClick.IconCompatParcelizer((Object) locale, "Locale.getDefault()");
        if (obj != null) {
            String upperCase = obj.toUpperCase(locale);
            onGetStartedClick.IconCompatParcelizer((Object) upperCase, "(this as java.lang.String).toUpperCase(locale)");
            TintInputViewGroup tintInputViewGroup = this.write.ivgSwiftCode;
            if (tintInputViewGroup == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivgSwiftCode");
            }
            RemittanceRecipientDetailFragment.read(tintInputViewGroup, this, upperCase);
            C5010nK nKVar = this.write.presenter;
            if (nKVar == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            onGetStartedClick.write((Object) upperCase, "text");
            C3092xce3d994b autoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame = nKVar.write;
            if (autoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame == null || (setcode = autoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame.setExpandedFormat) == null) {
                list = null;
            } else {
                list = setcode.read;
            }
            boolean MediaBrowserCompat$CustomActionResultReceiver = new C4998nC(upperCase, list).MediaBrowserCompat$CustomActionResultReceiver();
            boolean z = true;
            if (!MediaBrowserCompat$CustomActionResultReceiver) {
                writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C5010nK.write.read;
                if (nKVar.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    iconCompatParcelizer.IconCompatParcelizer(nKVar.RatingCompat);
                    return;
                }
                return;
            }
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer2 = nK$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver;
            if (nKVar.RatingCompat == null) {
                z = false;
            }
            if (z) {
                iconCompatParcelizer2.IconCompatParcelizer(nKVar.RatingCompat);
                return;
            }
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }
}
