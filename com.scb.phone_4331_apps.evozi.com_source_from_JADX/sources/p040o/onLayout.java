package p040o;

import com.scb.phone.data.p033di.easycash.EasycashDFWYNRepositoryModule;
import com.scb.phone.view.activity.hml.businessowner.C5628x19aef3bd;

/* renamed from: o.onLayout */
public final class onLayout implements OPRStatusRewardsLandingActivity_ViewBinding<C7513tX> {
    private final HmlReviewDocumentActivity<C5628x19aef3bd> IconCompatParcelizer;
    private final HmlReviewDocumentActivity<String> MediaBrowserCompat$CustomActionResultReceiver;
    private final EasycashDFWYNRepositoryModule MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<setIdTokenNonce> write;

    private onLayout(EasycashDFWYNRepositoryModule easycashDFWYNRepositoryModule, HmlReviewDocumentActivity<C5628x19aef3bd> hmlReviewDocumentActivity, HmlReviewDocumentActivity<setIdTokenNonce> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<String> hmlReviewDocumentActivity3) {
        this.MediaBrowserCompat$ItemReceiver = easycashDFWYNRepositoryModule;
        this.IconCompatParcelizer = hmlReviewDocumentActivity;
        this.write = hmlReviewDocumentActivity2;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity3;
    }

    public static onLayout read(EasycashDFWYNRepositoryModule easycashDFWYNRepositoryModule, HmlReviewDocumentActivity<C5628x19aef3bd> hmlReviewDocumentActivity, HmlReviewDocumentActivity<setIdTokenNonce> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<String> hmlReviewDocumentActivity3) {
        return new onLayout(easycashDFWYNRepositoryModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
    }

    public final /* synthetic */ Object get() {
        C7513tX read = this.MediaBrowserCompat$ItemReceiver.read(this.IconCompatParcelizer.get(), this.write.get(), this.MediaBrowserCompat$CustomActionResultReceiver.get());
        if (read != null) {
            return read;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
