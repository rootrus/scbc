package p040o;

import java.util.HashMap;

/* renamed from: o.DonationsItemListAdapter$DonationsCardViewHolder */
public final class DonationsItemListAdapter$DonationsCardViewHolder {
    private static HashMap<String, String> IconCompatParcelizer = new HashMap<>();
    private static HashMap<String, EasycashLoanTrackAdapter$LoanInfoItemHeaderViewHolder> MediaBrowserCompat$CustomActionResultReceiver = new HashMap<>();

    static {
        MediaBrowserCompat$CustomActionResultReceiver.put("SHA1WITHRSA", CustomCheckboxAdapter$CheckBoxViewHolder_ViewBinding.RatingCompat);
        MediaBrowserCompat$CustomActionResultReceiver.put("SHA256WITHRSA", CustomCheckboxAdapter$CheckBoxViewHolder_ViewBinding.MediaBrowserCompat$SearchResultReceiver);
        MediaBrowserCompat$CustomActionResultReceiver.put("SHA1WITHRSAANDMGF1", CustomCheckboxAdapter$CheckBoxViewHolder_ViewBinding.MediaMetadataCompat);
        MediaBrowserCompat$CustomActionResultReceiver.put("SHA256WITHRSAANDMGF1", CustomCheckboxAdapter$CheckBoxViewHolder_ViewBinding.MediaBrowserCompat$MediaItem);
        MediaBrowserCompat$CustomActionResultReceiver.put("SHA1WITHECDSA", CustomCheckboxAdapter$CheckBoxViewHolder_ViewBinding.read);
        MediaBrowserCompat$CustomActionResultReceiver.put("SHA224WITHECDSA", CustomCheckboxAdapter$CheckBoxViewHolder_ViewBinding.write);
        MediaBrowserCompat$CustomActionResultReceiver.put("SHA256WITHECDSA", CustomCheckboxAdapter$CheckBoxViewHolder_ViewBinding.MediaDescriptionCompat);
        IconCompatParcelizer.put("SHA1WITHECDSA", "SHA1WITHECDSA");
        IconCompatParcelizer.put("SHA224WITHECDSA", "SHA224WITHECDSA");
        IconCompatParcelizer.put("SHA256WITHECDSA", "SHA256WITHECDSA");
    }

    public static EasycashLoanTrackAdapter$LoanInfoItemHeaderViewHolder IconCompatParcelizer(String str) {
        HashMap<String, EasycashLoanTrackAdapter$LoanInfoItemHeaderViewHolder> hashMap = MediaBrowserCompat$CustomActionResultReceiver;
        String str2 = IconCompatParcelizer.get(str.toUpperCase());
        if (str2 == null) {
            str2 = str.toUpperCase();
        }
        EasycashLoanTrackAdapter$LoanInfoItemHeaderViewHolder easycashLoanTrackAdapter$LoanInfoItemHeaderViewHolder = hashMap.get(str2);
        if (easycashLoanTrackAdapter$LoanInfoItemHeaderViewHolder != null) {
            return easycashLoanTrackAdapter$LoanInfoItemHeaderViewHolder;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unsupported algorithmName: ");
        sb.append(str);
        throw new IllegalArgumentException(sb.toString());
    }

    public static String read(String str) {
        String str2 = IconCompatParcelizer.get(str.toUpperCase());
        if (str2 != null) {
            return str2;
        }
        return str.toUpperCase();
    }

    public static String MediaBrowserCompat$CustomActionResultReceiver(EasycashLoanTrackAdapter$LoanInfoItemHeaderViewHolder easycashLoanTrackAdapter$LoanInfoItemHeaderViewHolder) {
        for (String next : MediaBrowserCompat$CustomActionResultReceiver.keySet()) {
            if (MediaBrowserCompat$CustomActionResultReceiver.get(next).MediaBrowserCompat$ItemReceiver.equals(easycashLoanTrackAdapter$LoanInfoItemHeaderViewHolder.MediaBrowserCompat$ItemReceiver)) {
                return next;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unknown OIDField: ");
        sb.append(easycashLoanTrackAdapter$LoanInfoItemHeaderViewHolder.MediaBrowserCompat$ItemReceiver);
        throw new IllegalArgumentException(sb.toString());
    }
}
