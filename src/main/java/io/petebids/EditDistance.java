package io.petebids;


import org.apache.commons.text.similarity.LevenshteinDistance;
import org.apache.hadoop.hive.ql.exec.UDF;

public class EditDistance extends UDF {
    private LevenshteinDistance ld;

    public Integer evaluate(String left, String right) {
        if (ld == null){
            ld = new LevenshteinDistance();
        }
        return ld.apply(left, right);

    }
}
