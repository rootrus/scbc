package com.thunderhead.android.infrastructure.p057ui.mvp;

import com.google.android.gms.analytics.ecommerce.Promotion;
import com.thunderhead.android.infrastructure.p057ui.mvp.UiView;
import p040o.onGetStartedClick;

/* renamed from: com.thunderhead.android.infrastructure.ui.mvp.BasePresenter */
public abstract class BasePresenter<T extends UiView> implements UiPresenter<T> {
    private T view;

    public final T getView() {
        return this.view;
    }

    public void attach(T t) {
        onGetStartedClick.write((Object) t, Promotion.ACTION_VIEW);
        this.view = t;
    }

    public void detach() {
        this.view = null;
    }
}
