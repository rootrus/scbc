package p040o;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.List;

/* renamed from: o.TenureViewHolder_ViewBinding */
final class TenureViewHolder_ViewBinding extends DebitCardDetailAdapter$DebitCardHolder_ViewBinding {
    private final List<C9699x9b8f7d27> IconCompatParcelizer;

    public TenureViewHolder_ViewBinding(Charset charset, String str, List<C9699x9b8f7d27> list) {
        super(charset, str);
        this.IconCompatParcelizer = list;
    }

    public final List<C9699x9b8f7d27> read() {
        return this.IconCompatParcelizer;
    }

    /* access modifiers changed from: protected */
    public final void MediaBrowserCompat$ItemReceiver(C9699x9b8f7d27 creditCardDetailViewPagerAdapter$CreditCardItemViewHolder_ViewBinding, OutputStream outputStream) throws IOException {
        CreditCardDetailViewPagerAdapter$CreditCardItemViewHolder creditCardDetailViewPagerAdapter$CreditCardItemViewHolder = creditCardDetailViewPagerAdapter$CreditCardItemViewHolder_ViewBinding.write;
        write(creditCardDetailViewPagerAdapter$CreditCardItemViewHolder.IconCompatParcelizer("Content-Disposition"), this.MediaBrowserCompat$ItemReceiver, outputStream);
        if (creditCardDetailViewPagerAdapter$CreditCardItemViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver.write() != null) {
            write(creditCardDetailViewPagerAdapter$CreditCardItemViewHolder.IconCompatParcelizer("Content-Type"), this.MediaBrowserCompat$ItemReceiver, outputStream);
        }
    }
}
