package p040o;

import java.io.InputStream;

/* renamed from: o.DiscoverFundsListAdapter$SuggestedFundHolder */
abstract class DiscoverFundsListAdapter$SuggestedFundHolder extends InputStream {
    private int IconCompatParcelizer;
    protected final InputStream write;

    DiscoverFundsListAdapter$SuggestedFundHolder(InputStream inputStream, int i) {
        this.write = inputStream;
        this.IconCompatParcelizer = i;
    }

    /* access modifiers changed from: package-private */
    public int IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* access modifiers changed from: protected */
    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        InputStream inputStream = this.write;
        if (inputStream instanceof DiscoverFundFilterListAdapter$SubTitleHolder_ViewBinding) {
            ((DiscoverFundFilterListAdapter$SubTitleHolder_ViewBinding) inputStream).MediaBrowserCompat$ItemReceiver(true);
        }
    }
}
