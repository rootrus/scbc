package p040o;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.List;

/* renamed from: o.SelectionAdapter$SelectionHolder */
final class SelectionAdapter$SelectionHolder extends DebitCardDetailAdapter$DebitCardHolder_ViewBinding {
    private final List<C9699x9b8f7d27> IconCompatParcelizer;

    public SelectionAdapter$SelectionHolder(Charset charset, String str, List<C9699x9b8f7d27> list) {
        super(charset, str);
        this.IconCompatParcelizer = list;
    }

    public final List<C9699x9b8f7d27> read() {
        return this.IconCompatParcelizer;
    }

    /* access modifiers changed from: protected */
    public final void MediaBrowserCompat$ItemReceiver(C9699x9b8f7d27 creditCardDetailViewPagerAdapter$CreditCardItemViewHolder_ViewBinding, OutputStream outputStream) throws IOException {
        Iterator<DebitCardDetailAdapter$DebitCardHolder> it = creditCardDetailViewPagerAdapter$CreditCardItemViewHolder_ViewBinding.write.iterator();
        while (it.hasNext()) {
            write(it.next(), TenureViewHolder.IconCompatParcelizer, outputStream);
        }
    }
}
