package p040o;

import com.thunderhead.android.infrastructure.p057ui.mvp.UiPresenter;

/* renamed from: o.FragmentBuilder_MutualFundAddressMainFragment */
public interface FragmentBuilder_MutualFundAddressMainFragment extends UiPresenter<FragmentBuilder_MutualFundPersonalInfoFragment> {
    void acknowledgeError();

    void close();

    void login(String str, String str2, boolean z);
}
