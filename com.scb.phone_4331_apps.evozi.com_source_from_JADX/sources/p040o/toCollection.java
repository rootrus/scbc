package p040o;

import android.content.Context;
import com.scb.phone.view.custom.tierpricing.BaseProductCatalogueView;
import com.scb.phone.view.custom.tierpricing.ProductCatalogueInterestOptionsView;
import com.scb.phone.view.custom.tierpricing.ProductCatalogueTitleView;
import kotlin.NoWhenBranchMatchedException;
import p040o.CrashlyticsReport;

/* renamed from: o.toCollection */
public final class toCollection {
    public static BaseProductCatalogueView<?> IconCompatParcelizer(CrashlyticsReport.Builder.write write, Context context) {
        onGetStartedClick.write((Object) write, "type");
        onGetStartedClick.write((Object) context, "context");
        int i = unmodifiableIterable.write[write.ordinal()];
        if (i == 1) {
            return new ProductCatalogueTitleView(context);
        }
        if (i == 2) {
            return new ProductCatalogueInterestOptionsView(context);
        }
        throw new NoWhenBranchMatchedException();
    }
}
