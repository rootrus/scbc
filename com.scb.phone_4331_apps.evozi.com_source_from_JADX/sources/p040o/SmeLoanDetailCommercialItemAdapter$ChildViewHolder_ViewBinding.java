package p040o;

import java.security.cert.PolicyNode;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: o.SmeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding */
public final class SmeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding implements PolicyNode {
    private int IconCompatParcelizer;
    PolicyNode MediaBrowserCompat$CustomActionResultReceiver;
    boolean MediaBrowserCompat$ItemReceiver;
    private Set MediaBrowserCompat$SearchResultReceiver;
    private String RatingCompat;
    protected Set read;
    List write;

    public SmeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding(List list, int i, Set set, PolicyNode policyNode, Set set2, String str, boolean z) {
        this.write = list;
        this.IconCompatParcelizer = i;
        this.read = set;
        this.MediaBrowserCompat$CustomActionResultReceiver = policyNode;
        this.MediaBrowserCompat$SearchResultReceiver = set2;
        this.RatingCompat = str;
        this.MediaBrowserCompat$ItemReceiver = z;
    }

    public final Iterator getChildren() {
        return this.write.iterator();
    }

    public final int getDepth() {
        return this.IconCompatParcelizer;
    }

    public final Set getExpectedPolicies() {
        return this.read;
    }

    public final PolicyNode getParent() {
        return this.MediaBrowserCompat$CustomActionResultReceiver;
    }

    public final Set getPolicyQualifiers() {
        return this.MediaBrowserCompat$SearchResultReceiver;
    }

    public final String getValidPolicy() {
        return this.RatingCompat;
    }

    public final boolean isCritical() {
        return this.MediaBrowserCompat$ItemReceiver;
    }

    public final String toString() {
        return MediaBrowserCompat$CustomActionResultReceiver("");
    }

    private String MediaBrowserCompat$CustomActionResultReceiver(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str);
        stringBuffer.append(this.RatingCompat);
        stringBuffer.append(" {\n");
        for (int i = 0; i < this.write.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("    ");
            stringBuffer.append(((SmeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding) this.write.get(i)).MediaBrowserCompat$CustomActionResultReceiver(sb.toString()));
        }
        stringBuffer.append(str);
        stringBuffer.append("}\n");
        return stringBuffer.toString();
    }

    public final Object clone() {
        return MediaBrowserCompat$CustomActionResultReceiver();
    }

    private SmeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding MediaBrowserCompat$CustomActionResultReceiver() {
        HashSet hashSet = new HashSet();
        for (String str : this.read) {
            hashSet.add(new String(str));
        }
        HashSet hashSet2 = new HashSet();
        for (String str2 : this.MediaBrowserCompat$SearchResultReceiver) {
            hashSet2.add(new String(str2));
        }
        SmeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding = new SmeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding(new ArrayList(), this.IconCompatParcelizer, hashSet, (PolicyNode) null, hashSet2, new String(this.RatingCompat), this.MediaBrowserCompat$ItemReceiver);
        for (SmeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding MediaBrowserCompat$CustomActionResultReceiver2 : this.write) {
            SmeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding MediaBrowserCompat$CustomActionResultReceiver3 = MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$CustomActionResultReceiver();
            MediaBrowserCompat$CustomActionResultReceiver3.MediaBrowserCompat$CustomActionResultReceiver = smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding;
            smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding.write.add(MediaBrowserCompat$CustomActionResultReceiver3);
            MediaBrowserCompat$CustomActionResultReceiver3.MediaBrowserCompat$CustomActionResultReceiver = smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding;
        }
        return smeLoanDetailCommercialItemAdapter$ChildViewHolder_ViewBinding;
    }
}
