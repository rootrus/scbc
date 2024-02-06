package com.scb.phone.view.fragment.hml;

import android.os.Bundle;
import com.scb.phone.view.fragment.TermsConditionsFragment;
import kotlin.TypeCastException;

public final class HmlTermsConditionsFragment extends TermsConditionsFragment {
    public final String IconCompatParcelizer() {
        return "css/cc_content_style.css";
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if ((arguments != null ? arguments.getSerializable("HML_TERMS_CONDITIONS_TYPE") : null) == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.scb.phone.domain.entity.hml.HmlConsent");
        }
    }
}
