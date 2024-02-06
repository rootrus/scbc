package com.scb.phone.view.fragment.investment.scbs.open;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.scb.phone.view.adapter.investment.scbs.open.SuitabilityAssessmentAdapter;
import java.util.Collections;
import java.util.List;
import p040o.ActivityBuilder_BindTransferActivity;
import p040o.C7128hB;
import p040o.HmlPinActivity;
import p040o.StandardTable;
import p040o.finalizeSessionWithNativeEvent;
import p040o.isMICRFound;
import p040o.setCenterMessage;
import p040o.setHintAnimationEnabled;

public class SuitabilityQuestionsPart1Fragment extends SuitabilityQuestionsFragment implements C7128hB {
    @HmlPinActivity
    public setCenterMessage presenter;

    public static SuitabilityQuestionsPart1Fragment write() {
        Bundle bundle = new Bundle();
        SuitabilityQuestionsPart1Fragment suitabilityQuestionsPart1Fragment = new SuitabilityQuestionsPart1Fragment();
        suitabilityQuestionsPart1Fragment.setArguments(bundle);
        return suitabilityQuestionsPart1Fragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        List list;
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        setCenterMessage setcentermessage = this.presenter;
        StandardTable.ColumnMap.ColumnMapValues columnMapValues = setcentermessage.write;
        setHintAnimationEnabled sethintanimationenabled = setcentermessage.MediaBrowserCompat$ItemReceiver;
        if (sethintanimationenabled.read.PlaybackStateCompat$CustomAction() == null) {
            list = Collections.emptyList();
        } else {
            list = Collections.singletonList(sethintanimationenabled.read.PlaybackStateCompat$CustomAction());
        }
        boolean z = true;
        isMICRFound ismicrfound = new isMICRFound(columnMapValues.write(list, true));
        if (setcentermessage.RatingCompat == null) {
            z = false;
        }
        if (z) {
            ismicrfound.IconCompatParcelizer(setcentermessage.RatingCompat);
        }
        return onCreateView;
    }

    public final void MediaBrowserCompat$ItemReceiver(finalizeSessionWithNativeEvent finalizesessionwithnativeevent) {
        this.recyclerView.setAdapter(new SuitabilityAssessmentAdapter(finalizesessionwithnativeevent, new ActivityBuilder_BindTransferActivity(this)));
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        this.IconCompatParcelizer.setOverlayMode();
    }
}
