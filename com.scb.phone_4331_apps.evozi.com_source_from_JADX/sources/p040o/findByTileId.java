package p040o;

import com.scb.phone.view.fragment.chubb.ChubbPaySuccessFragment;

/* renamed from: o.findByTileId */
public final class findByTileId implements MileageQuantitySelectionActivity<ChubbPaySuccessFragment> {
    public static void IconCompatParcelizer(ChubbPaySuccessFragment chubbPaySuccessFragment, setImageOutListener setimageoutlistener) {
        chubbPaySuccessFragment.successPresenter = setimageoutlistener;
    }

    public static void read(ChubbPaySuccessFragment chubbPaySuccessFragment, setExitButtonEnabled setexitbuttonenabled) {
        chubbPaySuccessFragment.themesSlipPresenter = setexitbuttonenabled;
    }
}
