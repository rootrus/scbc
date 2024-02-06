package com.thunderhead.trackoption.fragments;

import android.view.View;
import com.thunderhead.android.infrastructure.server.entitys.Proposition;
import p040o.FragmentBuilder_BindTransferToMeAccountFragment;
import p040o.onClickActionNext;

class PropositionListFragment$MediaBrowserCompat$ItemReceiver implements View.OnClickListener {
    private /* synthetic */ PropositionListFragment IconCompatParcelizer;

    private PropositionListFragment$MediaBrowserCompat$ItemReceiver(PropositionListFragment propositionListFragment) {
        this.IconCompatParcelizer = propositionListFragment;
    }

    /* synthetic */ PropositionListFragment$MediaBrowserCompat$ItemReceiver(PropositionListFragment propositionListFragment, byte b) {
        this(propositionListFragment);
    }

    public final void onClick(View view) {
        FragmentBuilder_BindTransferToMeAccountFragment fragmentBuilder_BindTransferToMeAccountFragment = this.IconCompatParcelizer.read;
        int i = fragmentBuilder_BindTransferToMeAccountFragment.RatingCompat;
        Proposition proposition = i == -1 ? null : fragmentBuilder_BindTransferToMeAccountFragment.MediaBrowserCompat$ItemReceiver.get(i);
        if (onClickActionNext.IconCompatParcelizer == null) {
            onClickActionNext.IconCompatParcelizer = new onClickActionNext();
        }
        onClickActionNext.IconCompatParcelizer = new onClickActionNext(proposition);
        this.IconCompatParcelizer.IconCompatParcelizer.write(proposition != null);
    }
}
