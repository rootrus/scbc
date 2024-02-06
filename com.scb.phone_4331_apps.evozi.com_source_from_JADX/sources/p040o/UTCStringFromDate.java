package p040o;

import java.util.NoSuchElementException;
import p040o.setContentDescription;

/* renamed from: o.UTCStringFromDate */
public final /* synthetic */ class UTCStringFromDate implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ setContentDescription.write write;

    public /* synthetic */ UTCStringFromDate(setContentDescription.write write2) {
        this.write = write2;
    }

    public final Object write(Object obj) {
        setContentDescription.write write2 = this.write;
        isSupportFragmentClass issupportfragmentclass = (isSupportFragmentClass) obj;
        if (issupportfragmentclass.IconCompatParcelizer != null) {
            T t = issupportfragmentclass.IconCompatParcelizer;
            if (t != null) {
                return DebitCardResetOtpActivity.just(t);
            }
            throw new NoSuchElementException("No value present");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(write2);
        sb.append(" should be set before");
        return DebitCardResetOtpActivity.error(new Throwable(sb.toString()));
    }
}
