package p040o;

import android.content.Context;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract;

/* renamed from: o.FragmentBuilder_BindEkycProductTermConditionFragment */
public final class FragmentBuilder_BindEkycProductTermConditionFragment extends FragmentBuilder_BindFundInvestmentExperienceFragment {
    private static final UriMatcher MediaBrowserCompat$CustomActionResultReceiver;
    private final Context MediaBrowserCompat$ItemReceiver;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        MediaBrowserCompat$CustomActionResultReceiver = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        MediaBrowserCompat$CustomActionResultReceiver.addURI("com.android.contacts", "contacts/lookup/*", 1);
        MediaBrowserCompat$CustomActionResultReceiver.addURI("com.android.contacts", "contacts/#/photo", 2);
        MediaBrowserCompat$CustomActionResultReceiver.addURI("com.android.contacts", "contacts/#", 3);
        MediaBrowserCompat$CustomActionResultReceiver.addURI("com.android.contacts", "display_photo/#", 4);
    }

    public FragmentBuilder_BindEkycProductTermConditionFragment(Context context) {
        this.MediaBrowserCompat$ItemReceiver = context;
    }

    public final boolean write(FragmentBuilder_BindFixedTransferInputFormFragment fragmentBuilder_BindFixedTransferInputFormFragment) {
        Uri uri = fragmentBuilder_BindFixedTransferInputFormFragment.AlertController$RecycleListView;
        return "content".equals(uri.getScheme()) && ContactsContract.Contacts.CONTENT_URI.getHost().equals(uri.getHost()) && MediaBrowserCompat$CustomActionResultReceiver.match(fragmentBuilder_BindFixedTransferInputFormFragment.AlertController$RecycleListView) != -1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0046 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0047  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p040o.C6534x586e8bf0 write(p040o.FragmentBuilder_BindFixedTransferInputFormFragment r5, int r6) throws java.io.IOException {
        /*
            r4 = this;
            android.content.Context r6 = r4.MediaBrowserCompat$ItemReceiver
            android.content.ContentResolver r6 = r6.getContentResolver()
            android.net.Uri r5 = r5.AlertController$RecycleListView
            android.content.UriMatcher r0 = MediaBrowserCompat$CustomActionResultReceiver
            int r0 = r0.match(r5)
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L_0x0038
            r3 = 2
            if (r0 == r3) goto L_0x0033
            r3 = 3
            if (r0 == r3) goto L_0x0040
            r2 = 4
            if (r0 != r2) goto L_0x001c
            goto L_0x0033
        L_0x001c:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "Invalid uri: "
            r6.append(r0)
            r6.append(r5)
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L_0x0033:
            java.io.InputStream r5 = r6.openInputStream(r5)
            goto L_0x0044
        L_0x0038:
            android.net.Uri r5 = android.provider.ContactsContract.Contacts.lookupContact(r6, r5)
            if (r5 != 0) goto L_0x0040
            r5 = r1
            goto L_0x0044
        L_0x0040:
            java.io.InputStream r5 = android.provider.ContactsContract.Contacts.openContactPhotoInputStream(r6, r5, r2)
        L_0x0044:
            if (r5 != 0) goto L_0x0047
            return r1
        L_0x0047:
            o.FragmentBuilder_BindFundInvestmentExperienceFragment$MediaBrowserCompat$CustomActionResultReceiver r6 = new o.FragmentBuilder_BindFundInvestmentExperienceFragment$MediaBrowserCompat$CustomActionResultReceiver
            o.HowToAddAccountStep2Activity r5 = p040o.onSubmit.IconCompatParcelizer((java.io.InputStream) r5)
            com.squareup.picasso.Picasso$read r0 = com.squareup.picasso.Picasso.read.DISK
            r6.<init>((p040o.HowToAddAccountStep2Activity) r5, (com.squareup.picasso.Picasso.read) r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.FragmentBuilder_BindEkycProductTermConditionFragment.write(o.FragmentBuilder_BindFixedTransferInputFormFragment, int):o.FragmentBuilder_BindFundInvestmentExperienceFragment$MediaBrowserCompat$CustomActionResultReceiver");
    }
}
