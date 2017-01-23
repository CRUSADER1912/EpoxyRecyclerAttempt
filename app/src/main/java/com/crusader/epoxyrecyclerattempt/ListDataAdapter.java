package com.crusader.epoxyrecyclerattempt;

import com.airbnb.epoxy.EpoxyAdapter;
import com.crusader.epoxyrecyclerattempt.models.DataModel;

/**
 * Created by CRUSADER on 1/23/2017.
 */

public class ListDataAdapter extends EpoxyAdapter{

    public ListDataAdapter() {
        enableDiffing();
        DataModel dataModel = new DataModel();
        DataModel dataModel1 = new DataModel();
        DataModel dataModel2 = new DataModel();
        DataModel dataModel3 = new DataModel();
        DataModel dataModel4 = new DataModel();

        addModels(dataModel,dataModel1,dataModel2,dataModel3,dataModel4);
    }
}
