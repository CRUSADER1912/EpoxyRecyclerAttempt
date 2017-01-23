package com.crusader.epoxyrecyclerattempt.models;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.airbnb.epoxy.EpoxyAttribute;
import com.airbnb.epoxy.EpoxyHolder;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyModelWithHolder;
import com.crusader.epoxyrecyclerattempt.ListDataAdapter;
import com.crusader.epoxyrecyclerattempt.R;

/**
 * Created by CRUSADER on 1/23/2017.
 */

public class SectionedModel extends EpoxyModelWithHolder<SectionedModel.RecyClerHolder> {
    @EpoxyAttribute
    Context context;

    @Override
    protected int getDefaultLayout() {
        return R.layout.list_item;
    }

    @Override
    protected RecyClerHolder createNewHolder() {
        return new RecyClerHolder();
    }

    @Override
    public void bind(RecyClerHolder holder) {
        holder.recyclerView.setLayoutManager(new LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false));
        holder.recyclerView.setAdapter(new ListDataAdapter());
    }

    static class RecyClerHolder extends EpoxyHolder {
        RecyclerView recyclerView;

        @Override
        protected void bindView(View itemView) {
            recyclerView = (RecyclerView) itemView.findViewById(R.id.recycler_view_list);
        }
    }

//    @Override
//    public int getSpanSize(int totalSpanCount, int position, int itemCount) {
//        // We want the header to take up all spans so it fills the screen width
//        return totalSpanCount;
//    }
}
