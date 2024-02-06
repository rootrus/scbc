package p040o;

import com.scb.phone.presentation.presenter.investment.accountdetail.ScbsAccountDetailPresenter;
import p040o.getMicrAmount;
import p040o.writeUInt64NoTag;

/* renamed from: o.setImageType */
public final /* synthetic */ class setImageType implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ populateBinaryImageData IconCompatParcelizer;

    public /* synthetic */ setImageType(populateBinaryImageData populatebinaryimagedata) {
        this.IconCompatParcelizer = populatebinaryimagedata;
    }

    public final void IconCompatParcelizer(Object obj) {
        ScbsAccountDetailPresenter.write(this.IconCompatParcelizer, (getMicrAmount.read) obj);
    }
}
