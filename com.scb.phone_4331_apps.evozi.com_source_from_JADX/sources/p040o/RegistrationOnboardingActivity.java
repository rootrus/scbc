package p040o;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicMarkableReference;

/* renamed from: o.RegistrationOnboardingActivity */
public abstract class RegistrationOnboardingActivity extends ChequeDetailListAdapter$ChequeItemHolder implements UserUnderAgeErrorActivity_ViewBinding, Cloneable, PrivacyConsentActivity {
    private final AtomicMarkableReference<GoManagePromptPayActivity> IconCompatParcelizer = new AtomicMarkableReference<>((Object) null, false);

    protected RegistrationOnboardingActivity() {
    }

    @Deprecated
    public final void IconCompatParcelizer(final RequestToPayInfoActivity_ViewBinding requestToPayInfoActivity_ViewBinding) {
        read(new GoManagePromptPayActivity() {
            public final boolean write() {
                return true;
            }
        });
    }

    @Deprecated
    public final void IconCompatParcelizer(final SummaryDetailActivity summaryDetailActivity) {
        read(new GoManagePromptPayActivity() {
            public final boolean write() {
                try {
                    SummaryDetailActivity.this.RatingCompat();
                    return true;
                } catch (IOException unused) {
                    return false;
                }
            }
        });
    }

    public final boolean MediaBrowserCompat$SearchResultReceiver() {
        return this.IconCompatParcelizer.isMarked();
    }

    private void read(GoManagePromptPayActivity goManagePromptPayActivity) {
        if (!this.IconCompatParcelizer.compareAndSet(this.IconCompatParcelizer.getReference(), goManagePromptPayActivity, false, false)) {
            goManagePromptPayActivity.write();
        }
    }

    public Object clone() throws CloneNotSupportedException {
        RegistrationOnboardingActivity registrationOnboardingActivity = (RegistrationOnboardingActivity) super.clone();
        registrationOnboardingActivity.MediaBrowserCompat$CustomActionResultReceiver = (AccountTargetAdapter$AccountViewHolder_ViewBinding) AlertController$RecycleListView.read(this.MediaBrowserCompat$CustomActionResultReceiver);
        registrationOnboardingActivity.MediaBrowserCompat$MediaItem = (AmountDetailsSuccessAdapter$SuccessRow_ViewBinding) AlertController$RecycleListView.read(this.MediaBrowserCompat$MediaItem);
        return registrationOnboardingActivity;
    }
}
