package com.raizlabs.android.dbflow.test.structure.foreignkey;

import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.ForeignKey;
import com.raizlabs.android.dbflow.test.structure.TestModel1;

/**
 * Description:
 */
public class ForeignModelNoReferences extends TestModel1 {

    @Column
    @ForeignKey
    ForeignParentModel parentModel;

    @Column
    @ForeignKey(tableClass = ForeignParentModel.class)
    String name;
}
