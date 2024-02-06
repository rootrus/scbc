package p040o;

import kotlin.NoWhenBranchMatchedException;
import p040o.zzcz;

/* renamed from: o.setExpandedTitleColor */
public final class setExpandedTitleColor extends frequency<zzcz.zzi, IconCompatParcelizer> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public setExpandedTitleColor(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOnIO") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, final getAncestor getancestor, final refreshIfEmpty refreshifempty) {
        super(closeAccountReviewActivity, closeAccountReviewActivity2, new FundFactSheetActivity<IconCompatParcelizer, BScanCNotificationDeepLinkActivity<zzcz.zzi>>() {
            public final /* synthetic */ Object invoke(Object obj) {
                IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) obj;
                onGetStartedClick.write((Object) iconCompatParcelizer, "params");
                int i = setCollapsedTitleTypeface.write[refreshifempty.MediaBrowserCompat$SearchResultReceiver().ordinal()];
                if (i == 1) {
                    BScanCNotificationDeepLinkActivity<zzcz.zzi> IconCompatParcelizer2 = getancestor.IconCompatParcelizer(iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver, iconCompatParcelizer.MediaBrowserCompat$ItemReceiver);
                    onGetStartedClick.IconCompatParcelizer((Object) IconCompatParcelizer2, "repo.getCompanyList(params.query, params.page)");
                    return IconCompatParcelizer2;
                } else if (i == 2) {
                    return refreshifempty.MediaBrowserCompat$ItemReceiver(iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver, iconCompatParcelizer.MediaBrowserCompat$ItemReceiver);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
        });
        onGetStartedClick.write((Object) closeAccountReviewActivity, "subscriberOn");
        onGetStartedClick.write((Object) closeAccountReviewActivity2, "observerOn");
        onGetStartedClick.write((Object) getancestor, "repo");
        onGetStartedClick.write((Object) refreshifempty, "businessRepo");
    }

    /* renamed from: o.setExpandedTitleColor$IconCompatParcelizer */
    public static final class IconCompatParcelizer implements C4602xca7af99c {
        final String MediaBrowserCompat$CustomActionResultReceiver;
        final String MediaBrowserCompat$ItemReceiver;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IconCompatParcelizer)) {
                return false;
            }
            IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) iconCompatParcelizer.MediaBrowserCompat$ItemReceiver);
        }

        public final int hashCode() {
            String str = this.MediaBrowserCompat$CustomActionResultReceiver;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.MediaBrowserCompat$ItemReceiver;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return (hashCode * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Params(query=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(", page=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(")");
            return sb.toString();
        }

        public IconCompatParcelizer(String str, String str2) {
            this.MediaBrowserCompat$CustomActionResultReceiver = str;
            this.MediaBrowserCompat$ItemReceiver = str2;
        }
    }
}
