package p040o;

@Deprecated
/* renamed from: o.AddFavoriteTransferActivity */
public final class AddFavoriteTransferActivity extends AmountDetailsSuccessAdapter$SuccessRow {
    private AmountDetailsSuccessAdapter$SuccessRow_ViewBinding IconCompatParcelizer;
    private AmountDetailsSuccessAdapter$SuccessRow_ViewBinding MediaBrowserCompat$CustomActionResultReceiver;
    private AmountDetailsSuccessAdapter$SuccessRow_ViewBinding read;
    private AmountDetailsSuccessAdapter$SuccessRow_ViewBinding write = null;

    public AddFavoriteTransferActivity(AmountDetailsSuccessAdapter$SuccessRow_ViewBinding amountDetailsSuccessAdapter$SuccessRow_ViewBinding, AmountDetailsSuccessAdapter$SuccessRow_ViewBinding amountDetailsSuccessAdapter$SuccessRow_ViewBinding2) {
        this.IconCompatParcelizer = amountDetailsSuccessAdapter$SuccessRow_ViewBinding;
        this.read = amountDetailsSuccessAdapter$SuccessRow_ViewBinding2;
        this.MediaBrowserCompat$CustomActionResultReceiver = null;
    }

    public final Object IconCompatParcelizer(String str) {
        AmountDetailsSuccessAdapter$SuccessRow_ViewBinding amountDetailsSuccessAdapter$SuccessRow_ViewBinding;
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(str, "Parameter name");
        AmountDetailsSuccessAdapter$SuccessRow_ViewBinding amountDetailsSuccessAdapter$SuccessRow_ViewBinding2 = this.read;
        Object IconCompatParcelizer2 = amountDetailsSuccessAdapter$SuccessRow_ViewBinding2 != null ? amountDetailsSuccessAdapter$SuccessRow_ViewBinding2.IconCompatParcelizer(str) : null;
        return (IconCompatParcelizer2 != null || (amountDetailsSuccessAdapter$SuccessRow_ViewBinding = this.IconCompatParcelizer) == null) ? IconCompatParcelizer2 : amountDetailsSuccessAdapter$SuccessRow_ViewBinding.IconCompatParcelizer(str);
    }

    public final AmountDetailsSuccessAdapter$SuccessRow_ViewBinding MediaBrowserCompat$ItemReceiver(String str, Object obj) throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Setting parameters in a stack is not supported.");
    }
}
