package p040o;

import org.threeten.p041bp.OffsetDateTime;

/* renamed from: o.LibraryVersion */
public final /* synthetic */ class LibraryVersion implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ AccountTransferStatusCodes read;

    public /* synthetic */ LibraryVersion(AccountTransferStatusCodes accountTransferStatusCodes) {
        this.read = accountTransferStatusCodes;
    }

    public final Object write(Object obj) {
        fromRawFile fromrawfile = (fromRawFile) obj;
        return new isInfoWindowShown(fromrawfile.IconCompatParcelizer, FragmentBuilder_BindSummaryFragment.write(fromrawfile.read, (OffsetDateTime) null), FragmentBuilder_BindSummaryFragment.write(fromrawfile.write, (OffsetDateTime) null));
    }
}
