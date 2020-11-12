package io.petebids;

import org.apache.commons.text.similarity.JaroWinklerDistance;
import org.apache.hadoop.hive.ql.exec.UDF;

public class JaroWinkler extends UDF {
    private JaroWinklerDistance jd;

    public Integer evaluate(String left, String right) {
        if (this.jd == null) {
            jd = new JaroWinklerDistance();
        }
        return (int) Math.round(jd.apply(left, right));
    }

}
