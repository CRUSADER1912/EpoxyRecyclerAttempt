package com.crusader.epoxyrecyclerattempt;

import android.content.Context;
import android.view.View;

import com.airbnb.epoxy.EpoxyAdapter;
import com.crusader.epoxyrecyclerattempt.models.ButtonModel;
import com.crusader.epoxyrecyclerattempt.models.ButtonModel_;
import com.crusader.epoxyrecyclerattempt.models.HeaderModel;
import com.crusader.epoxyrecyclerattempt.models.HeaderModel_;
import com.crusader.epoxyrecyclerattempt.models.SectionedModel;
import com.crusader.epoxyrecyclerattempt.models.SectionedModel_;

/**
 * Created by CRUSADER on 1/22/2017.
 */

public class SampleAdapter extends EpoxyAdapter {
    public SampleAdapter(Context context) {
        enableDiffing();
        HeaderModel headerModel = new HeaderModel_().title(R.string.txt_header_title_first);
        HeaderModel headerModel1 = new HeaderModel_().title(R.string.txt_header_title_first);
        HeaderModel headerModel2 = new HeaderModel_().title(R.string.txt_header_title_second);

        SectionedModel sectionedModel = new SectionedModel_().context(context);

        ButtonModel addButton = new ButtonModel_()
                .text(R.string.txt_button_add)
                .clickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        removeAllModels();
                    }
                });

        addModels(headerModel,headerModel1,headerModel2,addButton, sectionedModel);
    }
}
