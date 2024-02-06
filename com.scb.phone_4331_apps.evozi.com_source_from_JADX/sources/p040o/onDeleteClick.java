package p040o;

import kotlin.NoWhenBranchMatchedException;

/* renamed from: o.onDeleteClick */
public enum onDeleteClick {
    DEFAULT,
    LAZY,
    ATOMIC,
    UNDISPATCHED;

    public final <R, T> void read(BaseDiscoverFundFilterActivity<? super R, ? super HmlNTBPromptPayNotFoundActivity<? super T>, ? extends Object> baseDiscoverFundFilterActivity, R r, HmlNTBPromptPayNotFoundActivity<? super T> hmlNTBPromptPayNotFoundActivity) {
        onGetStartedClick.write((Object) baseDiscoverFundFilterActivity, "block");
        onGetStartedClick.write((Object) hmlNTBPromptPayNotFoundActivity, "completion");
        int i = MwBusinessDetailsActivity_ViewBinding.read[ordinal()];
        if (i == 1) {
            AlertController$RecycleListView.IconCompatParcelizer(baseDiscoverFundFilterActivity, r, hmlNTBPromptPayNotFoundActivity);
        } else if (i == 2) {
            AlertController$RecycleListView.read(baseDiscoverFundFilterActivity, r, hmlNTBPromptPayNotFoundActivity);
        } else if (i == 3) {
            AlertController$RecycleListView.write(baseDiscoverFundFilterActivity, r, hmlNTBPromptPayNotFoundActivity);
        } else if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
    }
}
