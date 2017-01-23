package com.crusader.epoxyrecyclerattempt.models;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.airbnb.epoxy.EpoxyHolder;
import com.airbnb.epoxy.EpoxyModelWithHolder;
import com.crusader.epoxyrecyclerattempt.R;

/**
 * Created by CRUSADER on 1/23/2017.
 */

public class DataModel extends EpoxyModelWithHolder<DataModel.DataHolder> {
    @Override
    protected DataHolder createNewHolder() {
        return new DataHolder();
    }

    @Override
    protected int getDefaultLayout() {
        return R.layout.list_single_card;
    }

    static class DataHolder extends EpoxyHolder {
        RecyclerView recyclerView;

        @Override
        protected void bindView(View itemView) {
            recyclerView = (RecyclerView) itemView.findViewById(R.id.recycler_view_list);
        }
    }
}
