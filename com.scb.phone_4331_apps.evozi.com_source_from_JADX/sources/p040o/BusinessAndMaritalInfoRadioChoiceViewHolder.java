package p040o;

import java.io.IOException;
import org.xmlpull.p042v1.XmlPullParser;
import org.xmlpull.p042v1.XmlPullParserException;
import org.xmlpull.p042v1.XmlSerializer;

/* renamed from: o.BusinessAndMaritalInfoRadioChoiceViewHolder */
final class BusinessAndMaritalInfoRadioChoiceViewHolder implements BusinessAndMaritalInfoYearMonthSelectorViewHolder {
    BusinessAndMaritalInfoRadioChoiceViewHolder() {
    }

    public final Object write(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        String nextText = xmlPullParser.nextText();
        char charAt = str.charAt(0);
        if (charAt == 'b') {
            return new Boolean(IssuerSearchAdapter$CustomViewHolder.MediaBrowserCompat$ItemReceiver(nextText));
        }
        if (charAt == 'i') {
            return new Integer(Integer.parseInt(nextText));
        }
        if (charAt == 'l') {
            return new Long(Long.parseLong(nextText));
        }
        if (charAt == 's') {
            return nextText;
        }
        throw new RuntimeException();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(XmlSerializer xmlSerializer, Object obj) throws IOException {
        String str;
        String str2;
        int i = 0;
        if (obj instanceof BusinessAndMaritalInfoNationalIdViewHolder) {
            BusinessAndMaritalInfoNationalIdViewHolder businessAndMaritalInfoNationalIdViewHolder = (BusinessAndMaritalInfoNationalIdViewHolder) obj;
            int size = businessAndMaritalInfoNationalIdViewHolder.write.size();
            while (i < size) {
                BusinessAndMaritalInfoSpouseSelectorViewHolder businessAndMaritalInfoSpouseSelectorViewHolder = new BusinessAndMaritalInfoSpouseSelectorViewHolder();
                businessAndMaritalInfoNationalIdViewHolder.read(i, businessAndMaritalInfoSpouseSelectorViewHolder);
                if (businessAndMaritalInfoSpouseSelectorViewHolder.IconCompatParcelizer() != null) {
                    String str3 = businessAndMaritalInfoSpouseSelectorViewHolder.f5808x50fd9e4a;
                    String str4 = businessAndMaritalInfoSpouseSelectorViewHolder.MediaSessionCompat$QueueItem;
                    if (businessAndMaritalInfoSpouseSelectorViewHolder.IconCompatParcelizer() != null) {
                        str2 = businessAndMaritalInfoSpouseSelectorViewHolder.IconCompatParcelizer().toString();
                    } else {
                        str2 = "";
                    }
                    xmlSerializer.attribute(str3, str4, str2);
                }
                i++;
            }
        } else if (obj instanceof BusinessAndMaritalInfoSpouseSelectorViewHolder_ViewBinding) {
            BusinessAndMaritalInfoSpouseSelectorViewHolder_ViewBinding businessAndMaritalInfoSpouseSelectorViewHolder_ViewBinding = (BusinessAndMaritalInfoSpouseSelectorViewHolder_ViewBinding) obj;
            int aX_ = businessAndMaritalInfoSpouseSelectorViewHolder_ViewBinding.aX_();
            while (i < aX_) {
                BusinessAndMaritalInfoSpouseSelectorViewHolder businessAndMaritalInfoSpouseSelectorViewHolder2 = new BusinessAndMaritalInfoSpouseSelectorViewHolder();
                businessAndMaritalInfoSpouseSelectorViewHolder_ViewBinding.read(i, businessAndMaritalInfoSpouseSelectorViewHolder2);
                if (businessAndMaritalInfoSpouseSelectorViewHolder2.IconCompatParcelizer() != null) {
                    String str5 = businessAndMaritalInfoSpouseSelectorViewHolder2.f5808x50fd9e4a;
                    String str6 = businessAndMaritalInfoSpouseSelectorViewHolder2.MediaSessionCompat$QueueItem;
                    if (businessAndMaritalInfoSpouseSelectorViewHolder2.IconCompatParcelizer() != null) {
                        str = businessAndMaritalInfoSpouseSelectorViewHolder2.IconCompatParcelizer().toString();
                    } else {
                        str = "";
                    }
                    xmlSerializer.attribute(str5, str6, str);
                }
                i++;
            }
        }
        xmlSerializer.text(obj.toString());
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(ETBEligibilityAdapter$EligibilityHolder eTBEligibilityAdapter$EligibilityHolder) {
        eTBEligibilityAdapter$EligibilityHolder.IconCompatParcelizer(eTBEligibilityAdapter$EligibilityHolder.MediaBrowserCompat$MediaItem, "int", ETBProductDetailAdapter$ETBProductDetailViewHolder.read, this);
        eTBEligibilityAdapter$EligibilityHolder.IconCompatParcelizer(eTBEligibilityAdapter$EligibilityHolder.MediaBrowserCompat$MediaItem, "long", ETBProductDetailAdapter$ETBProductDetailViewHolder.IconCompatParcelizer, this);
        eTBEligibilityAdapter$EligibilityHolder.IconCompatParcelizer(eTBEligibilityAdapter$EligibilityHolder.MediaBrowserCompat$MediaItem, "string", ETBProductDetailAdapter$ETBProductDetailViewHolder.MediaBrowserCompat$MediaItem, this);
        eTBEligibilityAdapter$EligibilityHolder.IconCompatParcelizer(eTBEligibilityAdapter$EligibilityHolder.MediaBrowserCompat$MediaItem, "boolean", ETBProductDetailAdapter$ETBProductDetailViewHolder.MediaBrowserCompat$CustomActionResultReceiver, this);
    }
}
