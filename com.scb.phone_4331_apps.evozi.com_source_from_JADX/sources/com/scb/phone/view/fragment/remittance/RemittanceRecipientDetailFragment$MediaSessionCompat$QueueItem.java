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
import p040o.nK$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.onGetStartedClick;
import p040o.setCode;
import p040o.writeUInt64NoTag;

public final class RemittanceRecipientDetailFragment$MediaSessionCompat$QueueItem extends FragmentBuilder_BindCreditLimitDisplayFragment {
    private /* synthetic */ RemittanceRecipientDetailFragment IconCompatParcelizer;

    RemittanceRecipientDetailFragment$MediaSessionCompat$QueueItem(RemittanceRecipientDetailFragment remittanceRecipientDetailFragment) {
        this.IconCompatParcelizer = remittanceRecipientDetailFragment;
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
            TintInputViewGroup tintInputViewGroup = this.IconCompatParcelizer.ivgAccountNumber;
            if (tintInputViewGroup == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivgAccountNumber");
            }
            RemittanceRecipientDetailFragment.read(tintInputViewGroup, this, upperCase);
            C5010nK nKVar = this.IconCompatParcelizer.presenter;
            if (nKVar == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            onGetStartedClick.write((Object) upperCase, "text");
            C3092xce3d994b autoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame = nKVar.write;
            if (autoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame == null || (setcode = autoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame.IconCompatParcelizer) == null) {
                list = null;
            } else {
                list = setcode.read;
            }
            boolean MediaBrowserCompat$CustomActionResultReceiver = new C4998nC(upperCase, list).MediaBrowserCompat$CustomActionResultReceiver();
            boolean z = true;
            if (!MediaBrowserCompat$CustomActionResultReceiver) {
                writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = nK$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver;
                if (nKVar.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    iconCompatParcelizer.IconCompatParcelizer(nKVar.RatingCompat);
                    return;
                }
                return;
            }
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer2 = C5010nK.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver;
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
