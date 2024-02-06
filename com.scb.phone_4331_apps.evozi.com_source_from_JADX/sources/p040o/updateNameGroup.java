package p040o;

import android.content.res.Resources;
import com.scb.phone.R;
import com.scb.phone.view.adapter.hml.HmlOutcomeCounterAdapter;
import com.scb.phone.view.custom.common.CustomDeltaInput;
import com.scb.phone.view.custom.common.CustomDeltaInputPressed;
import java.text.NumberFormat;
import java.util.Locale;
import p040o.CrashlyticsController;

/* renamed from: o.updateNameGroup */
public final /* synthetic */ class updateNameGroup implements CustomDeltaInput.read {
    private final /* synthetic */ HmlOutcomeCounterAdapter.UpsellOfferViewHolder IconCompatParcelizer;
    private final /* synthetic */ CrashlyticsController.C321911 MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ updateNameGroup(HmlOutcomeCounterAdapter.UpsellOfferViewHolder upsellOfferViewHolder, CrashlyticsController.C321911 r2) {
        this.IconCompatParcelizer = upsellOfferViewHolder;
        this.MediaBrowserCompat$ItemReceiver = r2;
    }

    public final void write(double d, boolean z) {
        HmlOutcomeCounterAdapter.UpsellOfferViewHolder upsellOfferViewHolder = this.IconCompatParcelizer;
        CrashlyticsController.C321911 r1 = this.MediaBrowserCompat$ItemReceiver;
        upsellOfferViewHolder.loanAmountRemark.setVisibility(z ? 0 : 8);
        upsellOfferViewHolder.acceptBtn.setEnabled(z);
        if (d < r1.IconCompatParcelizer) {
            CustomDeltaInputPressed customDeltaInputPressed = upsellOfferViewHolder.loanAmount;
            Resources resources = customDeltaInputPressed.getResources();
            NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(Locale.ENGLISH);
            currencyInstance.setMinimumFractionDigits(2);
            currencyInstance.setMaximumFractionDigits(2);
            customDeltaInputPressed.setErrorMessage(resources.getString(R.string.auto_app_outcome_upselling_custom_minimum_inline_error, new Object[]{getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(currencyInstance).format(r1.IconCompatParcelizer)}));
        } else if (d > r1.read) {
            CustomDeltaInputPressed customDeltaInputPressed2 = upsellOfferViewHolder.loanAmount;
            Resources resources2 = customDeltaInputPressed2.getResources();
            NumberFormat currencyInstance2 = NumberFormat.getCurrencyInstance(Locale.ENGLISH);
            currencyInstance2.setMinimumFractionDigits(2);
            currencyInstance2.setMaximumFractionDigits(2);
            customDeltaInputPressed2.setErrorMessage(resources2.getString(R.string.auto_app_outcome_upselling_custom_maximum_inline_error, new Object[]{getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(currencyInstance2).format(r1.read)}));
        }
    }
}
