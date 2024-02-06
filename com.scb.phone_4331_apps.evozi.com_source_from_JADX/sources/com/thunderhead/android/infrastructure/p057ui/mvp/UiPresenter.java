package com.thunderhead.android.infrastructure.p057ui.mvp;

import com.thunderhead.android.infrastructure.p057ui.mvp.UiView;

/* renamed from: com.thunderhead.android.infrastructure.ui.mvp.UiPresenter */
public interface UiPresenter<T extends UiView> {
    void attach(T t);

    void detach();
}
