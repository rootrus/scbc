package p040o;

import java.io.IOException;
import java.util.Enumeration;

/* renamed from: o.SimulatorTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding */
public final class SimulatorTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding extends C10403xf0c8ae24 {
    public SimulatorTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding() {
    }

    public SimulatorTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding(HmlAboutAdapter$HmlAboutViewHolder_ViewBinding hmlAboutAdapter$HmlAboutViewHolder_ViewBinding) {
        super(hmlAboutAdapter$HmlAboutViewHolder_ViewBinding);
    }

    public SimulatorTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding(CompanyItemViewHolder_ViewBinding companyItemViewHolder_ViewBinding) {
        super(companyItemViewHolder_ViewBinding, false);
    }

    public SimulatorTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding(HmlAboutAdapter$HmlAboutViewHolder_ViewBinding[] hmlAboutAdapter$HmlAboutViewHolder_ViewBindingArr) {
        super(hmlAboutAdapter$HmlAboutViewHolder_ViewBindingArr, false);
    }

    /* access modifiers changed from: package-private */
    public final void IconCompatParcelizer(HmlDocumentListAdapter$DocumentViewHolder_ViewBinding hmlDocumentListAdapter$DocumentViewHolder_ViewBinding) throws IOException {
        hmlDocumentListAdapter$DocumentViewHolder_ViewBinding.IconCompatParcelizer(49);
        hmlDocumentListAdapter$DocumentViewHolder_ViewBinding.IconCompatParcelizer(128);
        Enumeration elements = this.IconCompatParcelizer.elements();
        while (elements.hasMoreElements()) {
            hmlDocumentListAdapter$DocumentViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver((HmlAboutAdapter$HmlAboutViewHolder_ViewBinding) elements.nextElement());
        }
        hmlDocumentListAdapter$DocumentViewHolder_ViewBinding.IconCompatParcelizer(0);
        hmlDocumentListAdapter$DocumentViewHolder_ViewBinding.IconCompatParcelizer(0);
    }

    /* access modifiers changed from: package-private */
    public final int MediaBrowserCompat$CustomActionResultReceiver() throws IOException {
        Enumeration elements = this.IconCompatParcelizer.elements();
        int i = 0;
        while (elements.hasMoreElements()) {
            i += ((HmlAboutAdapter$HmlAboutViewHolder_ViewBinding) elements.nextElement()).MediaBrowserCompat$MediaItem().MediaBrowserCompat$CustomActionResultReceiver();
        }
        return i + 2 + 2;
    }
}
