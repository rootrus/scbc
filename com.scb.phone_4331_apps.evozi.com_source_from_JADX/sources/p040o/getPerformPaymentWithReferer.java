package p040o;

import android.content.Context;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.text.method.DigitsKeyListener;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.scb.phone.R;
import com.scb.phone.view.adapter.easycash.viewholder.BusinessAndMaritalInfoHeaderViewHolder;
import com.scb.phone.view.adapter.easycash.viewholder.BusinessAndMaritalInfoInputViewHolder;
import com.scb.phone.view.adapter.easycash.viewholder.BusinessAndMaritalInfoNationalIdViewHolder;
import com.scb.phone.view.adapter.easycash.viewholder.BusinessAndMaritalInfoRadioChoiceViewHolder;
import com.scb.phone.view.adapter.easycash.viewholder.BusinessAndMaritalInfoSpouseSelectorViewHolder;
import com.scb.phone.view.adapter.easycash.viewholder.BusinessAndMaritalInfoYearMonthSelectorViewHolder;
import com.scb.phone.view.adapter.easycash.viewholder.C5750xd9de440c;
import com.scb.phone.view.adapter.easycash.viewholder.C5751x736331b5;
import com.scb.phone.view.custom.CustomExternalSelector;
import com.scb.phone.view.custom.common.CommonInputViewGroup;
import com.scb.phone.view.custom.common.CustomEditText;
import com.scb.phone.view.custom.easycash.CustomEasyCashSectionLabel;
import java.util.ArrayList;
import kotlin.TypeCastException;
import p040o.AnalyticsConnectorReceiver;

/* renamed from: o.getPerformPaymentWithReferer */
public final class getPerformPaymentWithReferer extends RecyclerView.IconCompatParcelizer<RecyclerView.setContentView> {
    public ArrayList<onCrashlyticsOriginEvent> MediaBrowserCompat$ItemReceiver = new ArrayList<>();
    private final write write;

    /* renamed from: o.getPerformPaymentWithReferer$write */
    public interface write {
        String IconCompatParcelizer(String str);

        void MediaBrowserCompat$CustomActionResultReceiver(String str);

        boolean MediaBrowserCompat$CustomActionResultReceiver(AnalyticsConnectorReceiver.BreadcrumbHandler breadcrumbHandler);

        void MediaBrowserCompat$ItemReceiver();

        void read();

        boolean read(AutoValue_CrashlyticsReportWithSessionId autoValue_CrashlyticsReportWithSessionId);

        String write(String str);

        void write();
    }

    public getPerformPaymentWithReferer(write write2) {
        onGetStartedClick.write((Object) write2, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.write = write2;
    }

    public final int MediaBrowserCompat$CustomActionResultReceiver(int i) {
        onCrashlyticsOriginEvent oncrashlyticsoriginevent = this.MediaBrowserCompat$ItemReceiver.get(i);
        if (oncrashlyticsoriginevent instanceof onRun) {
            return 0;
        }
        if (oncrashlyticsoriginevent instanceof AnalyticsConnectorReceiver.BreadcrumbHandler) {
            return 1;
        }
        if (oncrashlyticsoriginevent instanceof AbstractSpiCall) {
            return 2;
        }
        if (oncrashlyticsoriginevent instanceof getHttpRequest) {
            return 3;
        }
        if (oncrashlyticsoriginevent instanceof AppData) {
            return 4;
        }
        if (oncrashlyticsoriginevent instanceof AutoValue_CrashlyticsReportWithSessionId) {
            return 5;
        }
        return super.MediaBrowserCompat$CustomActionResultReceiver(i);
    }

    public final RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        onGetStartedClick.write((Object) viewGroup, "parent");
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == 1) {
            View inflate = from.inflate(R.layout.f82442131493470, viewGroup, false);
            onGetStartedClick.IconCompatParcelizer((Object) inflate, "layoutInflater.inflate(\n…put_field, parent, false)");
            return new BusinessAndMaritalInfoInputViewHolder(inflate);
        } else if (i == 2) {
            View inflate2 = from.inflate(R.layout.f82382131493464, viewGroup, false);
            onGetStartedClick.IconCompatParcelizer((Object) inflate2, "layoutInflater.inflate(\n…_selector, parent, false)");
            return new BusinessAndMaritalInfoRadioChoiceViewHolder(inflate2);
        } else if (i == 3) {
            View inflate3 = from.inflate(R.layout.f82452131493471, viewGroup, false);
            onGetStartedClick.IconCompatParcelizer((Object) inflate3, "layoutInflater.inflate(\n…_selector, parent, false)");
            return new BusinessAndMaritalInfoYearMonthSelectorViewHolder(inflate3);
        } else if (i == 4) {
            View inflate4 = from.inflate(R.layout.f82462131493472, viewGroup, false);
            onGetStartedClick.IconCompatParcelizer((Object) inflate4, "layoutInflater.inflate(\n…n_spinner, parent, false)");
            return new BusinessAndMaritalInfoSpouseSelectorViewHolder(inflate4);
        } else if (i != 5) {
            View inflate5 = from.inflate(R.layout.f82432131493469, viewGroup, false);
            onGetStartedClick.IconCompatParcelizer((Object) inflate5, "layoutInflater.inflate(\n…on_header, parent, false)");
            return new BusinessAndMaritalInfoHeaderViewHolder(inflate5);
        } else {
            View inflate6 = from.inflate(R.layout.f82442131493470, viewGroup, false);
            onGetStartedClick.IconCompatParcelizer((Object) inflate6, "layoutInflater.inflate(\n…put_field, parent, false)");
            return new BusinessAndMaritalInfoNationalIdViewHolder(inflate6);
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        onGetStartedClick.write((Object) setcontentview, "viewHolder");
        onCrashlyticsOriginEvent oncrashlyticsoriginevent = this.MediaBrowserCompat$ItemReceiver.get(i);
        onGetStartedClick.IconCompatParcelizer((Object) oncrashlyticsoriginevent, "mData[position]");
        onCrashlyticsOriginEvent oncrashlyticsoriginevent2 = oncrashlyticsoriginevent;
        int MediaBrowserCompat$CustomActionResultReceiver = MediaBrowserCompat$CustomActionResultReceiver(i);
        if (MediaBrowserCompat$CustomActionResultReceiver != 0) {
            int i2 = 8;
            Integer num = null;
            if (MediaBrowserCompat$CustomActionResultReceiver == 1) {
                BusinessAndMaritalInfoInputViewHolder businessAndMaritalInfoInputViewHolder = (BusinessAndMaritalInfoInputViewHolder) setcontentview;
                if (oncrashlyticsoriginevent2 != null) {
                    AnalyticsConnectorReceiver.BreadcrumbHandler breadcrumbHandler = (AnalyticsConnectorReceiver.BreadcrumbHandler) oncrashlyticsoriginevent2;
                    write write2 = this.write;
                    boolean read = read(i);
                    onGetStartedClick.write((Object) breadcrumbHandler, "display");
                    onGetStartedClick.write((Object) write2, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
                    businessAndMaritalInfoInputViewHolder.AlertController$RecycleListView = breadcrumbHandler;
                    businessAndMaritalInfoInputViewHolder.Keep = write2;
                    View view = businessAndMaritalInfoInputViewHolder.paddingBottom;
                    if (view == null) {
                        onGetStartedClick.MediaBrowserCompat$ItemReceiver("paddingBottom");
                    }
                    if (read) {
                        num = 0;
                    }
                    if (num != null) {
                        i2 = num.intValue();
                    }
                    view.setVisibility(i2);
                    CommonInputViewGroup commonInputViewGroup = businessAndMaritalInfoInputViewHolder.ivgInputField;
                    if (commonInputViewGroup == null) {
                        onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivgInputField");
                    }
                    commonInputViewGroup.read();
                    commonInputViewGroup.setTitle(breadcrumbHandler.write);
                    commonInputViewGroup.setHint(breadcrumbHandler.MediaBrowserCompat$SearchResultReceiver);
                    commonInputViewGroup.setErrorText(breadcrumbHandler.MediaBrowserCompat$CustomActionResultReceiver);
                    CustomEditText customEditText = commonInputViewGroup.mEditText;
                    onGetStartedClick.IconCompatParcelizer((Object) customEditText, "it");
                    customEditText.setInputType(breadcrumbHandler.read);
                    customEditText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(breadcrumbHandler.RatingCompat)});
                    commonInputViewGroup.setText(breadcrumbHandler.MediaBrowserCompat$MediaItem);
                    TextWatcher textWatcher = businessAndMaritalInfoInputViewHolder.setHasDecor;
                    commonInputViewGroup.mEditText.addTextChangedListener(textWatcher);
                    commonInputViewGroup.MediaBrowserCompat$CustomActionResultReceiver.add(textWatcher);
                    if (!breadcrumbHandler.IconCompatParcelizer) {
                        businessAndMaritalInfoInputViewHolder.MediaBrowserCompat$ItemReceiver();
                        return;
                    }
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.scb.phone.presentation.model.display.easycash.businessandmarital.EasycashBAMInfoEditorDisplay");
            } else if (MediaBrowserCompat$CustomActionResultReceiver != 2) {
                String str = "";
                if (MediaBrowserCompat$CustomActionResultReceiver == 3) {
                    BusinessAndMaritalInfoYearMonthSelectorViewHolder businessAndMaritalInfoYearMonthSelectorViewHolder = (BusinessAndMaritalInfoYearMonthSelectorViewHolder) setcontentview;
                    if (oncrashlyticsoriginevent2 != null) {
                        getHttpRequest gethttprequest = (getHttpRequest) oncrashlyticsoriginevent2;
                        write write3 = this.write;
                        onGetStartedClick.write((Object) gethttprequest, "display");
                        onGetStartedClick.write((Object) write3, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
                        CustomExternalSelector customExternalSelector = businessAndMaritalInfoYearMonthSelectorViewHolder.cesSelector;
                        if (customExternalSelector == null) {
                            onGetStartedClick.MediaBrowserCompat$ItemReceiver("cesSelector");
                        }
                        customExternalSelector.setTitle(gethttprequest.write);
                        String str2 = gethttprequest.read;
                        String str3 = gethttprequest.IconCompatParcelizer;
                        CustomExternalSelector customExternalSelector2 = businessAndMaritalInfoYearMonthSelectorViewHolder.cesSelector;
                        if (customExternalSelector2 == null) {
                            onGetStartedClick.MediaBrowserCompat$ItemReceiver("cesSelector");
                        }
                        Context context = customExternalSelector2.getContext();
                        CharSequence charSequence = str2;
                        if (!(charSequence == null || charSequence.length() == 0)) {
                            CharSequence charSequence2 = str3;
                            if (!(charSequence2 == null || charSequence2.length() == 0)) {
                                if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) str2, (Object) "0")) {
                                    CustomExternalSelector customExternalSelector3 = businessAndMaritalInfoYearMonthSelectorViewHolder.cesSelector;
                                    if (customExternalSelector3 == null) {
                                        onGetStartedClick.MediaBrowserCompat$ItemReceiver("cesSelector");
                                    }
                                    customExternalSelector3.setSelected(context.getString(R.string.auto_scbone_occupation_display_month, new Object[]{str3}));
                                } else if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) str3, (Object) "0")) {
                                    CustomExternalSelector customExternalSelector4 = businessAndMaritalInfoYearMonthSelectorViewHolder.cesSelector;
                                    if (customExternalSelector4 == null) {
                                        onGetStartedClick.MediaBrowserCompat$ItemReceiver("cesSelector");
                                    }
                                    customExternalSelector4.setSelected(context.getString(R.string.auto_scbone_occupation_display_year, new Object[]{str2}));
                                } else {
                                    CustomExternalSelector customExternalSelector5 = businessAndMaritalInfoYearMonthSelectorViewHolder.cesSelector;
                                    if (customExternalSelector5 == null) {
                                        onGetStartedClick.MediaBrowserCompat$ItemReceiver("cesSelector");
                                    }
                                    customExternalSelector5.setSelected(context.getString(R.string.auto_scbone_occupation_year_and_month_value, new Object[]{str2, str3}));
                                }
                                customExternalSelector.setOnClickListener(new C5751x736331b5(write3));
                                return;
                            }
                        }
                        CustomExternalSelector customExternalSelector6 = businessAndMaritalInfoYearMonthSelectorViewHolder.cesSelector;
                        if (customExternalSelector6 == null) {
                            onGetStartedClick.MediaBrowserCompat$ItemReceiver("cesSelector");
                        }
                        customExternalSelector6.setSelected(str);
                        CustomExternalSelector customExternalSelector7 = businessAndMaritalInfoYearMonthSelectorViewHolder.cesSelector;
                        if (customExternalSelector7 == null) {
                            onGetStartedClick.MediaBrowserCompat$ItemReceiver("cesSelector");
                        }
                        String string = context.getString(R.string.auto_scbone_occupation_year_and_month_placeholder);
                        onGetStartedClick.IconCompatParcelizer((Object) string, "context.getString(R.stri…ar_and_month_placeholder)");
                        customExternalSelector7.setHint(string);
                        customExternalSelector.setOnClickListener(new C5751x736331b5(write3));
                        return;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type com.scb.phone.presentation.model.display.easycash.businessandmarital.EasycashBAMInfoSelectorYearMonthDisplay");
                } else if (MediaBrowserCompat$CustomActionResultReceiver == 4) {
                    BusinessAndMaritalInfoSpouseSelectorViewHolder businessAndMaritalInfoSpouseSelectorViewHolder = (BusinessAndMaritalInfoSpouseSelectorViewHolder) setcontentview;
                    if (oncrashlyticsoriginevent2 != null) {
                        AppData appData = (AppData) oncrashlyticsoriginevent2;
                        write write4 = this.write;
                        onGetStartedClick.write((Object) appData, "display");
                        onGetStartedClick.write((Object) write4, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
                        TextView textView = businessAndMaritalInfoSpouseSelectorViewHolder.tvTitle;
                        if (textView == null) {
                            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvTitle");
                        }
                        textView.setText(appData.write);
                        Spinner spinner = businessAndMaritalInfoSpouseSelectorViewHolder.spinnerSpouse;
                        if (spinner == null) {
                            onGetStartedClick.MediaBrowserCompat$ItemReceiver("spinnerSpouse");
                        }
                        spinner.setOnItemSelectedListener((AdapterView.OnItemSelectedListener) null);
                        ArrayList arrayList = new ArrayList();
                        arrayList.addAll(appData.read);
                        String str4 = appData.MediaBrowserCompat$CustomActionResultReceiver;
                        if (str4 != null) {
                            str = str4;
                        }
                        arrayList.add(str);
                        spinner.setAdapter(new BusinessAndMaritalInfoSpouseSelectorViewHolder.read(spinner.getContext(), arrayList, appData));
                        int indexOf = appData.IconCompatParcelizer.indexOf(appData.RatingCompat);
                        if (indexOf >= 0) {
                            spinner.setSelection(indexOf);
                        } else {
                            SpinnerAdapter adapter = spinner.getAdapter();
                            onGetStartedClick.IconCompatParcelizer((Object) adapter, "adapter");
                            spinner.setSelection(adapter.getCount());
                        }
                        spinner.setOnItemSelectedListener(new C5750xd9de440c(appData, write4));
                        return;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type com.scb.phone.presentation.model.display.easycash.businessandmarital.EasycashBAMInfoSelectorSpouseDisplay");
                } else if (MediaBrowserCompat$CustomActionResultReceiver == 5) {
                    BusinessAndMaritalInfoNationalIdViewHolder businessAndMaritalInfoNationalIdViewHolder = (BusinessAndMaritalInfoNationalIdViewHolder) setcontentview;
                    if (oncrashlyticsoriginevent2 != null) {
                        AutoValue_CrashlyticsReportWithSessionId autoValue_CrashlyticsReportWithSessionId = (AutoValue_CrashlyticsReportWithSessionId) oncrashlyticsoriginevent2;
                        write write5 = this.write;
                        onGetStartedClick.write((Object) autoValue_CrashlyticsReportWithSessionId, "display");
                        onGetStartedClick.write((Object) write5, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
                        businessAndMaritalInfoNationalIdViewHolder.PlaybackStateCompat = autoValue_CrashlyticsReportWithSessionId;
                        businessAndMaritalInfoNationalIdViewHolder.AlertController$RecycleListView = write5;
                        View view2 = businessAndMaritalInfoNationalIdViewHolder.paddingBottom;
                        if (view2 == null) {
                            onGetStartedClick.MediaBrowserCompat$ItemReceiver("paddingBottom");
                        }
                        view2.setVisibility(8);
                        CommonInputViewGroup commonInputViewGroup2 = businessAndMaritalInfoNationalIdViewHolder.ivgInputField;
                        if (commonInputViewGroup2 == null) {
                            onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivgInputField");
                        }
                        commonInputViewGroup2.read();
                        commonInputViewGroup2.setTitle(autoValue_CrashlyticsReportWithSessionId.write);
                        commonInputViewGroup2.setHint(autoValue_CrashlyticsReportWithSessionId.MediaBrowserCompat$MediaItem);
                        commonInputViewGroup2.setErrorText(autoValue_CrashlyticsReportWithSessionId.IconCompatParcelizer);
                        CustomEditText customEditText2 = commonInputViewGroup2.mEditText;
                        onGetStartedClick.IconCompatParcelizer((Object) customEditText2, "it");
                        customEditText2.setInputType(autoValue_CrashlyticsReportWithSessionId.MediaMetadataCompat);
                        customEditText2.setFilters(new InputFilter[]{new InputFilter.LengthFilter(autoValue_CrashlyticsReportWithSessionId.MediaBrowserCompat$SearchResultReceiver)});
                        String str5 = autoValue_CrashlyticsReportWithSessionId.RatingCompat;
                        write write6 = businessAndMaritalInfoNationalIdViewHolder.AlertController$RecycleListView;
                        if (write6 == null) {
                            onGetStartedClick.MediaBrowserCompat$ItemReceiver(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
                        }
                        commonInputViewGroup2.setText(write6.IconCompatParcelizer(str5));
                        CustomEditText customEditText3 = commonInputViewGroup2.mEditText;
                        onGetStartedClick.IconCompatParcelizer((Object) customEditText3, "editText");
                        customEditText3.setKeyListener(DigitsKeyListener.getInstance("0123456789-"));
                        FragmentBuilder_BindEasycashFeaturesCardInformationFragment fragmentBuilder_BindEasycashFeaturesCardInformationFragment = new FragmentBuilder_BindEasycashFeaturesCardInformationFragment(commonInputViewGroup2.mEditText, "X-XXXX-XXXXX-XX-X", new BusinessAndMaritalInfoNationalIdViewHolder.write(businessAndMaritalInfoNationalIdViewHolder));
                        fragmentBuilder_BindEasycashFeaturesCardInformationFragment.read = businessAndMaritalInfoNationalIdViewHolder.setHasDecor;
                        TextWatcher textWatcher2 = fragmentBuilder_BindEasycashFeaturesCardInformationFragment;
                        commonInputViewGroup2.mEditText.addTextChangedListener(textWatcher2);
                        commonInputViewGroup2.MediaBrowserCompat$CustomActionResultReceiver.add(textWatcher2);
                        if (autoValue_CrashlyticsReportWithSessionId.MediaBrowserCompat$CustomActionResultReceiver) {
                            return;
                        }
                        if (autoValue_CrashlyticsReportWithSessionId.read) {
                            commonInputViewGroup2.MediaBrowserCompat$ItemReceiver();
                            autoValue_CrashlyticsReportWithSessionId.read = false;
                            return;
                        }
                        businessAndMaritalInfoNationalIdViewHolder.read();
                        return;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type com.scb.phone.presentation.model.display.easycash.businessandmarital.EasycashBAMInfoNationalIdDisplay");
                }
            } else {
                BusinessAndMaritalInfoRadioChoiceViewHolder businessAndMaritalInfoRadioChoiceViewHolder = (BusinessAndMaritalInfoRadioChoiceViewHolder) setcontentview;
                if (oncrashlyticsoriginevent2 != null) {
                    businessAndMaritalInfoRadioChoiceViewHolder.read((AbstractSpiCall) oncrashlyticsoriginevent2, this.write, read(i));
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.scb.phone.presentation.model.display.easycash.businessandmarital.EasycashBAMInfoRadioChoiceDisplay");
            }
        } else {
            BusinessAndMaritalInfoHeaderViewHolder businessAndMaritalInfoHeaderViewHolder = (BusinessAndMaritalInfoHeaderViewHolder) setcontentview;
            if (oncrashlyticsoriginevent2 != null) {
                onRun onrun = (onRun) oncrashlyticsoriginevent2;
                onGetStartedClick.write((Object) onrun, "display");
                CustomEasyCashSectionLabel customEasyCashSectionLabel = businessAndMaritalInfoHeaderViewHolder.tvHeader;
                if (customEasyCashSectionLabel == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvHeader");
                }
                customEasyCashSectionLabel.setText(onrun.write);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.scb.phone.presentation.model.display.easycash.businessandmarital.EasycashBAMInfoTitleDisplay");
        }
    }

    public final int IconCompatParcelizer() {
        return this.MediaBrowserCompat$ItemReceiver.size();
    }

    private final boolean read(int i) {
        return i == this.MediaBrowserCompat$ItemReceiver.size() - 1 || MediaBrowserCompat$CustomActionResultReceiver(i + 1) == 0;
    }
}
