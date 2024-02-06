package p040o;

/* renamed from: o.TopUpActivity_ViewBinding */
public final class TopUpActivity_ViewBinding implements RequestToPayInfoActivity {
    public final long read(ScbPrivacyPolicyActivity scbPrivacyPolicyActivity) {
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(scbPrivacyPolicyActivity, "HTTP response");
        ProductListAdapter$ProductViewHolder_ViewBinding productListAdapter$ProductViewHolder_ViewBinding = new ProductListAdapter$ProductViewHolder_ViewBinding(scbPrivacyPolicyActivity.write("Keep-Alive"));
        while (productListAdapter$ProductViewHolder_ViewBinding.hasNext()) {
            PrepaidTravelConversionLandingActivity_ViewBinding write = productListAdapter$ProductViewHolder_ViewBinding.write();
            String read = write.read();
            String write2 = write.write();
            if (write2 != null && read.equalsIgnoreCase("timeout")) {
                try {
                    return Long.parseLong(write2) * 1000;
                } catch (NumberFormatException unused) {
                }
            }
        }
        return -1;
    }
}
