package p040o;

import com.scb.phone.presentation.presenter.investment.accountdetail.ScbsAccountDetailPresenter;
import p040o.getMicrAmount;
import p040o.writeUInt64NoTag;

/* renamed from: o.setDone */
public final /* synthetic */ class setDone implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ ScbsAccountDetailPresenter IconCompatParcelizer;

    public /* synthetic */ setDone(ScbsAccountDetailPresenter scbsAccountDetailPresenter) {
        this.IconCompatParcelizer = scbsAccountDetailPresenter;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getMicrAmount.read) obj).read(this.IconCompatParcelizer.read.Keep);
    }
}
