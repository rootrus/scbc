package com.scb.phone.view.fragment.etb;

import android.content.Context;
import p040o.C1425qp;

public abstract class BaseEtbFragment extends BreadcrumbFragment {
    C1425qp IconCompatParcelizer;

    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof C1425qp) {
            this.IconCompatParcelizer = (C1425qp) context;
        }
    }

    public void onDetach() {
        super.onDetach();
        this.IconCompatParcelizer = null;
    }
}
